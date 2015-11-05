/**
 */
package bitub.support.p2.util;

import bitub.support.p2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bitub.support.p2.P2Package
 * @generated
 */
public class P2Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static P2Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P2Switch()
  {
    if (modelPackage == null) {
      modelPackage = P2Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID) {
      case P2Package.DOCUMENT_ROOT: {
        DocumentRoot documentRoot = (DocumentRoot) theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.LOCATIONS_TYPE: {
        LocationsType locationsType = (LocationsType) theEObject;
        T result = caseLocationsType(locationsType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.LOCATION_TYPE: {
        LocationType locationType = (LocationType) theEObject;
        T result = caseLocationType(locationType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.REPOSITORY_TYPE: {
        RepositoryType repositoryType = (RepositoryType) theEObject;
        T result = caseRepositoryType(repositoryType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.TARGET_TYPE: {
        TargetType targetType = (TargetType) theEObject;
        T result = caseTargetType(targetType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.UNIT_TYPE: {
        UnitType unitType = (UnitType) theEObject;
        T result = caseUnitType(unitType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.IMETADATA_REPOSITORY_MANAGER: {
        IMetadataRepositoryManager iMetadataRepositoryManager = (IMetadataRepositoryManager) theEObject;
        T result = caseIMetadataRepositoryManager(iMetadataRepositoryManager);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.IMETADATA_REPOSITORY: {
        IMetadataRepository iMetadataRepository = (IMetadataRepository) theEObject;
        T result = caseIMetadataRepository(iMetadataRepository);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.IARTIFACT_REPOSITORY_MANAGER: {
        IArtifactRepositoryManager iArtifactRepositoryManager = (IArtifactRepositoryManager) theEObject;
        T result = caseIArtifactRepositoryManager(iArtifactRepositoryManager);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case P2Package.IARTIFACT_REPOSITORY: {
        IArtifactRepository iArtifactRepository = (IArtifactRepository) theEObject;
        T result = caseIArtifactRepository(iArtifactRepository);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      default:
        return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Locations Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Locations Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocationsType(LocationsType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocationType(LocationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryType(RepositoryType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetType(TargetType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitType(UnitType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IMetadata Repository Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IMetadata Repository Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIMetadataRepositoryManager(IMetadataRepositoryManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IMetadata Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IMetadata Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIMetadataRepository(IMetadataRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IArtifact Repository Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IArtifact Repository Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIArtifactRepositoryManager(IArtifactRepositoryManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IArtifact Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IArtifact Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIArtifactRepository(IArtifactRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //P2Switch
