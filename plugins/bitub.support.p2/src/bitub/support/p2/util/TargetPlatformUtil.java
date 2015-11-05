package bitub.support.p2.util;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.IProvisioningAgentProvider;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipse.equinox.p2.query.IQuery;
import org.eclipse.equinox.p2.query.IQueryResult;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import bitub.support.p2.LocationType;
import bitub.support.p2.P2Plugin;
import bitub.support.p2.UnitType;
import bitub.support.p2.UnitVerificationState;
import bitub.support.p2.VersionType;

final public class TargetPlatformUtil
{
  final static Logger myLog = Logger.getLogger(TargetPlatformUtil.class);
  
  public static interface UnitValidator 
  {
    void validate(UnitType unit, VersionType remoteVersion, UnitVerificationState state);
  }
  
  public static IProvisioningAgent getProvisioningAgent()
  {
    BundleContext bundleContext = P2Plugin.getPlugin().getBundle().getBundleContext();
    ServiceReference<?> sr = bundleContext.getServiceReference(IProvisioningAgentProvider.SERVICE_NAME);
     
    IProvisioningAgentProvider agentProvider = null;
    if (sr == null) {
       throw new RuntimeException("No provisioning service found.");
    }
    agentProvider = (IProvisioningAgentProvider) bundleContext.getService(sr);
    
    IProvisioningAgent agent = null;
    try {
      agent = agentProvider.createAgent(null);
    }
    catch (ProvisionException e) {
      
      myLog.error(e);
      throw new RuntimeException(e);
    }
    return agent;
  }
  
  public static IQueryResult<IInstallableUnit> queryIU(IMetadataRepository metadataRepository, String id)
  {
    IQuery<IInstallableUnit> createIUQuery = QueryUtil.createIUQuery(id);
    IQueryResult<IInstallableUnit> result = metadataRepository.query(createIUQuery, new NullProgressMonitor());
    return result;
  }

  
  public static VersionType queryIUBestVersionMatch(IMetadataRepository metadataRepository, UnitType targetUnit)
  {
    IQueryResult<IInstallableUnit> result = queryIU(metadataRepository, targetUnit.getId());
    
    Version bestVersion = Version.emptyVersion;
    for(Iterator<IInstallableUnit> itIU=result.iterator(); itIU.hasNext();) {

      IInstallableUnit installableUnit = itIU.next();      
      
      if(0 < installableUnit.getVersion().compareTo(bestVersion)) {
        bestVersion = installableUnit.getVersion();
      }      
    }
        
    return bestVersion == Version.emptyVersion ? VersionType.generate(0,0,0) : new VersionType(bestVersion.toString());
  }
  
  public static Version versionOf(UnitType targetUnit)
  {
    VersionType versionType = targetUnit.getVersion();    
    Version version = Version.createOSGi(versionType.getMajor(), versionType.getMinor(), versionType.getRelease());
    return version;
  }
 
  
  public static IQueryResult<IInstallableUnit> queryIUs(IMetadataRepositoryManager metadataManager)
  {
    IQueryResult<IInstallableUnit> ius = metadataManager.query(QueryUtil.createIUGroupQuery(), new NullProgressMonitor());
    return ius;
  }  
  
  public static IMetadataRepositoryManager getMetadataRepositoryManager(IProvisioningAgent provisioningAgent)
  {
    IMetadataRepositoryManager metadataManager =
        (IMetadataRepositoryManager) provisioningAgent.getService(IMetadataRepositoryManager.SERVICE_NAME);

    return metadataManager;
  }

  public static IArtifactRepositoryManager getArtifactRepositoryManager(IProvisioningAgent provisioningAgent)
  {
    IArtifactRepositoryManager artifactManager =
        (IArtifactRepositoryManager) provisioningAgent.getService(IArtifactRepositoryManager.SERVICE_NAME);

    return artifactManager;
  }  

  
  public static IArtifactRepository queryArtifactRepository(IArtifactRepositoryManager artifactManager, String url) throws InvocationTargetException
  {
    if (artifactManager == null) {

      myLog.error("Artifact manager was null");
      Throwable throwable = new Throwable("Could not load Artifact Repository Manager");
      throwable.fillInStackTrace();
      throw new InvocationTargetException(throwable);
    }
    
    // Load repository
    IArtifactRepository loadRepository;
    try {

      URI repoLocation = new URI(url);
      myLog.info("Adding repository " + repoLocation);
      
      loadRepository = artifactManager.loadRepository(repoLocation, new NullProgressMonitor());
    }
    catch (ProvisionException pe) {

      myLog.error("Caught provisioning exception " + pe.getMessage(), pe);
      throw new InvocationTargetException(pe);
    }
    catch (URISyntaxException e) {

      myLog.error("Caught URI syntax exception " + e.getMessage(), e);
      throw new InvocationTargetException(e);
    }
    
    return loadRepository;    
  }
  
  
  public static IMetadataRepository queryMetadataRepository(IMetadataRepositoryManager metadataManager, String url) throws InvocationTargetException
  {        
    if (metadataManager == null) {

      myLog.error("Metadata manager was null");
      Throwable throwable = new Throwable("Could not load Metadata Repository Manager");
      throwable.fillInStackTrace();
      throw new InvocationTargetException(throwable);
    }

    // Load repository
    IMetadataRepository loadRepository;
    try {

      URI repoLocation = new URI(url);
      myLog.info("Adding repository " + repoLocation);
      
      loadRepository = metadataManager.loadRepository(repoLocation, new NullProgressMonitor());
    }
    catch (ProvisionException pe) {

      myLog.error("Caught provisioning exception " + pe.getMessage(), pe);
      throw new InvocationTargetException(pe);
    }
    catch (URISyntaxException e) {

      myLog.error("Caught URI syntax exception " + e.getMessage(), e);
      throw new InvocationTargetException(e);
    }
    
    return loadRepository;
  }

  public static Job createPlatformValidationJob(Collection<UnitType> units, UnitValidator validator)
  {
    IProvisioningAgent provisioningAgent = getProvisioningAgent();
    IMetadataRepositoryManager metadataRepositoryManager = getMetadataRepositoryManager(provisioningAgent);
    //IArtifactRepositoryManager artifactRepositoryManager = getArtifactRepositoryManager(provisioningAgent);
        
    return new Job("Target platform verification") {
      
      @Override
      protected IStatus run(IProgressMonitor monitor)
      {        
        monitor = SubMonitor.convert(monitor, units.size());
        Map<String, IMetadataRepository> repoMap = new HashMap<>();
        for(UnitType unit : units) {

          if(monitor.isCanceled()) {
            
            return Status.CANCEL_STATUS;
          }
       
          monitor.subTask("Verifying "+unit.getId());
          
          myLog.debug("(runVerificationJob) Quering unit "+unit.getId());
          String location = ((LocationType)unit.eContainer()).getRepository().getLocation();          
          
          IMetadataRepository metadataRepository = repoMap.get(location);
          if(null==metadataRepository) {
            
            try {
              metadataRepository = queryMetadataRepository(metadataRepositoryManager, location);
              repoMap.put(location, metadataRepository);
            }
            catch (InvocationTargetException e) {
              
              myLog.error(e);
              validator.validate(unit, VersionType.generate(0, 0, 0), UnitVerificationState.UNKNOWN);
              monitor.worked(1);
              continue;
            }
          }
          
          VersionType versionMatch = TargetPlatformUtil.queryIUBestVersionMatch(metadataRepository, unit);
          myLog.info("(runVerificationJob) Verified unit by IU of version "+versionMatch);

          UnitVerificationState newState;
          if(versionMatch.isEmptyVersion()) {
                            
            newState = UnitVerificationState.UNKNOWN;
          } else if(0 < versionMatch.compareTo(unit.getVersion())) {
            
            newState = UnitVerificationState.UPGRADED;
          } else {
            
            newState = UnitVerificationState.VERIFIED;
          }

          validator.validate(unit, versionMatch, newState);
          
          monitor.worked(1);
        }
        
        monitor.done();
        return Status.OK_STATUS;
      }
    };
    
  }
}
