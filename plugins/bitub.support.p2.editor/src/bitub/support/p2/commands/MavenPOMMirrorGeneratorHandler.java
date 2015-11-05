package bitub.support.p2.commands;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import bitub.support.p2.LocationType;
import bitub.support.p2.LocationsType;
import bitub.support.p2.TargetType;
import bitub.support.p2.utils.MavenUtil;

public class MavenPOMMirrorGeneratorHandler extends AbstractHandler implements IHandler
{
  

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException
  {
    ISelection selection = HandlerUtil.getCurrentSelection(event);
    if(selection instanceof IStructuredSelection) {
      
      List<LocationType> locations = new ArrayList<LocationType>();
      
      for(Object obj : ((IStructuredSelection) selection).toArray()) {
        
        if(obj instanceof TargetType) {
          
          locations.addAll(((TargetType) obj).getLocations().getLocation());
        }
        
        if(obj instanceof LocationType ) {
          
          locations.add((LocationType)obj);
        }
        
        if(obj instanceof LocationsType) {
          
          locations.addAll(((LocationsType) obj).getLocation());
        }
        
        try {
          Element configurationSection = MavenUtil.convertToConfigurationSection(locations);
                    
          DOMImplementationLS domImplLS = (DOMImplementationLS) (configurationSection.getOwnerDocument()).getImplementation();
          LSSerializer serializer = domImplLS.createLSSerializer();
          
          serializer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE); //$NON-NLS-1$
          
          System.out.println( serializer.writeToString(configurationSection) );
        }
        catch (ParserConfigurationException  e) {
          
          e.printStackTrace();
        }                
      }
      
      return Boolean.TRUE;
    }

    throw new UnsupportedOperationException("Select only on "+TargetType.class.getName());
  }

}
