package bitub.support.p2.commands;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.progress.UIJob;

import bitub.support.p2.LocationType;
import bitub.support.p2.LocationsType;
import bitub.support.p2.P2Package;
import bitub.support.p2.TargetType;
import bitub.support.p2.UnitType;
import bitub.support.p2.UnitVerificationState;
import bitub.support.p2.VersionType;
import bitub.support.p2.presentation.P2Editor;
import bitub.support.p2.util.TargetPlatformUtil;

public class InstallableUnitValidationHandler extends AbstractHandler implements IHandler
{
  
  final static Logger myLog = Logger.getLogger(InstallableUnitValidationHandler.class);
   
  
  protected void collectUnitType(Set<UnitType> unitSet, Object o)
  {
    if(o instanceof UnitType) {
      
      unitSet.add((UnitType)o);
    } else if(o instanceof LocationType) {
      
      ((LocationType) o).getUnit().forEach(u -> collectUnitType(unitSet, u));
    } else if(o instanceof LocationsType) {
      
      ((LocationsType) o).getLocation().forEach(l -> collectUnitType(unitSet, l));
      
    } else if(o instanceof TargetType) {
      
      collectUnitType(unitSet, ((TargetType) o).getLocations());
    } else {

      throw new IllegalArgumentException();
    }
  }
  

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException
  {
    ISelection selection = HandlerUtil.getCurrentSelection(event);
        
    if(selection instanceof IStructuredSelection) {
      
      Set<UnitType> unitSet = new HashSet<>();
      for(Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext(); ) {
        
        collectUnitType(unitSet, it.next());
      }
      
      IProgressService service = PlatformUI.getWorkbench().getProgressService();
      Job verificationJob = TargetPlatformUtil.createPlatformValidationJob(unitSet, (UnitType u, VersionType v, UnitVerificationState s) -> {
        
        new UIJob(PlatformUI.getWorkbench().getDisplay(), "Verified unit "+u.getId()) {
          
          @Override
          public IStatus runInUIThread(IProgressMonitor monitor)
          {
            IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
            if(activeEditor instanceof P2Editor) {
                            
              EditingDomain editingDomain = ((P2Editor)activeEditor).getEditingDomain();
              editingDomain.getCommandStack().execute(
                  SetCommand.create(editingDomain, u, P2Package.Literals.UNIT_TYPE__STATE, s));                
              editingDomain.getCommandStack().execute(
                  SetCommand.create(editingDomain, u, P2Package.Literals.UNIT_TYPE__VERSION, v));
            } else {
              
              u.setState(s);                
              u.setVersion(v);
            }
            
            monitor.done();
            return Status.OK_STATUS;
          }
        }.schedule();
        
      });
//      service.showInDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), verificationJob);
            
      verificationJob.setUser(true);      
      verificationJob.setPriority(Job.LONG);
      verificationJob.schedule();
      
      return Boolean.TRUE;
    }
    
    return Boolean.FALSE;
  }

}
