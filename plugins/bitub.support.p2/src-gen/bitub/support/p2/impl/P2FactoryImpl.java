/**
 */
package bitub.support.p2.impl;

import bitub.support.p2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class P2FactoryImpl extends EFactoryImpl implements P2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static P2Factory init()
  {
    try {
      P2Factory theP2Factory = (P2Factory) EPackage.Registry.INSTANCE.getEFactory(P2Package.eNS_URI);
      if (theP2Factory != null) {
        return theP2Factory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new P2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID()) {
      case P2Package.DOCUMENT_ROOT:
        return createDocumentRoot();
      case P2Package.LOCATIONS_TYPE:
        return createLocationsType();
      case P2Package.LOCATION_TYPE:
        return createLocationType();
      case P2Package.REPOSITORY_TYPE:
        return createRepositoryType();
      case P2Package.TARGET_TYPE:
        return createTargetType();
      case P2Package.UNIT_TYPE:
        return createUnitType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID()) {
      case P2Package.UNIT_VERIFICATION_STATE:
        return createUnitVerificationStateFromString(eDataType, initialValue);
      case P2Package.VERSION_TYPE:
        return createVersionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID()) {
      case P2Package.UNIT_VERIFICATION_STATE:
        return convertUnitVerificationStateToString(eDataType, instanceValue);
      case P2Package.VERSION_TYPE:
        return convertVersionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationsType createLocationsType()
  {
    LocationsTypeImpl locationsType = new LocationsTypeImpl();
    return locationsType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationType createLocationType()
  {
    LocationTypeImpl locationType = new LocationTypeImpl();
    return locationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryType createRepositoryType()
  {
    RepositoryTypeImpl repositoryType = new RepositoryTypeImpl();
    return repositoryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetType createTargetType()
  {
    TargetTypeImpl targetType = new TargetTypeImpl();
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitType createUnitType()
  {
    UnitTypeImpl unitType = new UnitTypeImpl();
    return unitType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitVerificationState createUnitVerificationStateFromString(EDataType eDataType, String initialValue)
  {
    UnitVerificationState result = UnitVerificationState.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException(
          "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnitVerificationStateToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue)
  {
    return (VersionType) super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVersionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P2Package getP2Package()
  {
    return (P2Package) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static P2Package getPackage()
  {
    return P2Package.eINSTANCE;
  }

} //p2FactoryImpl
