/**
 */
package bitub.support.p2.impl;

import bitub.support.p2.DocumentRoot;
import bitub.support.p2.LocationType;
import bitub.support.p2.LocationsType;
import bitub.support.p2.RepositoryType;
import bitub.support.p2.TargetType;
import bitub.support.p2.UnitType;
import bitub.support.p2.UnitVerificationState;
import bitub.support.p2.VersionType;
import bitub.support.p2.P2Factory;
import bitub.support.p2.P2Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class P2PackageImpl extends EPackageImpl implements P2Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationsTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iMetadataRepositoryManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iMetadataRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iArtifactRepositoryManagerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iArtifactRepositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unitVerificationStateEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType versionTypeEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see bitub.support.p2.P2Package#eNS_URI
   * @see #init()
   * @generated
   */
  private P2PackageImpl()
  {
    super(eNS_URI, P2Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link P2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static P2Package init()
  {
    if (isInited)
      return (P2Package) EPackage.Registry.INSTANCE.getEPackage(P2Package.eNS_URI);

    // Obtain or create and register package
    P2PackageImpl theP2Package = (P2PackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof P2PackageImpl
        ? EPackage.Registry.INSTANCE.get(eNS_URI) : new P2PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theP2Package.createPackageContents();

    // Initialize created meta-data
    theP2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theP2Package.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(P2Package.eNS_URI, theP2Package);
    return theP2Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Target()
  {
    return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationsType()
  {
    return locationsTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationsType_Location()
  {
    return (EReference) locationsTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationType()
  {
    return locationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationType_Unit()
  {
    return (EReference) locationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocationType_Repository()
  {
    return (EReference) locationTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationType_IncludeAllPlatforms()
  {
    return (EAttribute) locationTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationType_IncludeConfigurePhase()
  {
    return (EAttribute) locationTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationType_IncludeMode()
  {
    return (EAttribute) locationTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationType_IncludeSource()
  {
    return (EAttribute) locationTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocationType_Type()
  {
    return (EAttribute) locationTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getLocationType__MetadataRepository()
  {
    return locationTypeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getLocationType__ArtifactRepository()
  {
    return locationTypeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryType()
  {
    return repositoryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryType_Location()
  {
    return (EAttribute) repositoryTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetType()
  {
    return targetTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTargetType_Locations()
  {
    return (EReference) targetTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetType_Name()
  {
    return (EAttribute) targetTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTargetType_SequenceNumber()
  {
    return (EAttribute) targetTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getTargetType__MetadataRepositoryManager()
  {
    return targetTypeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getTargetType__ArtifactRepositoryManager()
  {
    return targetTypeEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnitType()
  {
    return unitTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitType_Id()
  {
    return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitType_Version()
  {
    return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitType_State()
  {
    return (EAttribute) unitTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getUnitType__VerifyIU()
  {
    return unitTypeEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMetadataRepositoryManager()
  {
    return iMetadataRepositoryManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMetadataRepository()
  {
    return iMetadataRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIArtifactRepositoryManager()
  {
    return iArtifactRepositoryManagerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIArtifactRepository()
  {
    return iArtifactRepositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnitVerificationState()
  {
    return unitVerificationStateEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVersionType()
  {
    return versionTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P2Factory getP2Factory()
  {
    return (P2Factory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TARGET);

    locationsTypeEClass = createEClass(LOCATIONS_TYPE);
    createEReference(locationsTypeEClass, LOCATIONS_TYPE__LOCATION);

    locationTypeEClass = createEClass(LOCATION_TYPE);
    createEReference(locationTypeEClass, LOCATION_TYPE__UNIT);
    createEReference(locationTypeEClass, LOCATION_TYPE__REPOSITORY);
    createEAttribute(locationTypeEClass, LOCATION_TYPE__INCLUDE_ALL_PLATFORMS);
    createEAttribute(locationTypeEClass, LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE);
    createEAttribute(locationTypeEClass, LOCATION_TYPE__INCLUDE_MODE);
    createEAttribute(locationTypeEClass, LOCATION_TYPE__INCLUDE_SOURCE);
    createEAttribute(locationTypeEClass, LOCATION_TYPE__TYPE);
    createEOperation(locationTypeEClass, LOCATION_TYPE___METADATA_REPOSITORY);
    createEOperation(locationTypeEClass, LOCATION_TYPE___ARTIFACT_REPOSITORY);

    repositoryTypeEClass = createEClass(REPOSITORY_TYPE);
    createEAttribute(repositoryTypeEClass, REPOSITORY_TYPE__LOCATION);

    targetTypeEClass = createEClass(TARGET_TYPE);
    createEReference(targetTypeEClass, TARGET_TYPE__LOCATIONS);
    createEAttribute(targetTypeEClass, TARGET_TYPE__NAME);
    createEAttribute(targetTypeEClass, TARGET_TYPE__SEQUENCE_NUMBER);
    createEOperation(targetTypeEClass, TARGET_TYPE___METADATA_REPOSITORY_MANAGER);
    createEOperation(targetTypeEClass, TARGET_TYPE___ARTIFACT_REPOSITORY_MANAGER);

    unitTypeEClass = createEClass(UNIT_TYPE);
    createEAttribute(unitTypeEClass, UNIT_TYPE__ID);
    createEAttribute(unitTypeEClass, UNIT_TYPE__VERSION);
    createEAttribute(unitTypeEClass, UNIT_TYPE__STATE);
    createEOperation(unitTypeEClass, UNIT_TYPE___VERIFY_IU);

    iMetadataRepositoryManagerEClass = createEClass(IMETADATA_REPOSITORY_MANAGER);

    iMetadataRepositoryEClass = createEClass(IMETADATA_REPOSITORY);

    iArtifactRepositoryManagerEClass = createEClass(IARTIFACT_REPOSITORY_MANAGER);

    iArtifactRepositoryEClass = createEClass(IARTIFACT_REPOSITORY);

    // Create enums
    unitVerificationStateEEnum = createEEnum(UNIT_VERIFICATION_STATE);

    // Create data types
    versionTypeEDataType = createEDataType(VERSION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0,
        -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation",
        null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Target(), this.getTargetType(), null, "target", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE,
        IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(locationsTypeEClass, LocationsType.class, "LocationsType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocationsType_Location(), this.getLocationType(), null, "location", null, 1, -1, LocationsType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocationType_Unit(), this.getUnitType(), null, "unit", null, 1, -1, LocationType.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocationType_Repository(), this.getRepositoryType(), null, "repository", null, 1, 1, LocationType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getLocationType_IncludeAllPlatforms(), theXMLTypePackage.getBoolean(), "includeAllPlatforms", null, 1, 1,
        LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getLocationType_IncludeConfigurePhase(), theXMLTypePackage.getBoolean(), "includeConfigurePhase", null, 1, 1,
        LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getLocationType_IncludeMode(), theXMLTypePackage.getString(), "includeMode", null, 1, 1, LocationType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocationType_IncludeSource(), theXMLTypePackage.getBoolean(), "includeSource", null, 1, 1,
        LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getLocationType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, LocationType.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getLocationType__MetadataRepository(), this.getIMetadataRepository(), "metadataRepository", 0, 1, IS_UNIQUE,
        IS_ORDERED);

    initEOperation(getLocationType__ArtifactRepository(), this.getIArtifactRepository(), "artifactRepository", 0, 1, IS_UNIQUE,
        IS_ORDERED);

    initEClass(repositoryTypeEClass, RepositoryType.class, "RepositoryType", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryType_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, RepositoryType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(targetTypeEClass, TargetType.class, "TargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTargetType_Locations(), this.getLocationsType(), null, "locations", null, 1, 1, TargetType.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getTargetType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TargetType.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTargetType_SequenceNumber(), theXMLTypePackage.getUnsignedByte(), "sequenceNumber", null, 1, 1,
        TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getTargetType__MetadataRepositoryManager(), this.getIMetadataRepositoryManager(), "metadataRepositoryManager",
        0, 1, IS_UNIQUE, IS_ORDERED);

    initEOperation(getTargetType__ArtifactRepositoryManager(), this.getIArtifactRepositoryManager(), "artifactRepositoryManager",
        0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnitType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, UnitType.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnitType_Version(), this.getVersionType(), "version", null, 1, 1, UnitType.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUnitType_State(), this.getUnitVerificationState(), "state", null, 0, 1, UnitType.class, IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEOperation(getUnitType__VerifyIU(), null, "verifyIU", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(iMetadataRepositoryManagerEClass, IMetadataRepositoryManager.class, "IMetadataRepositoryManager", IS_ABSTRACT,
        IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iMetadataRepositoryEClass, IMetadataRepository.class, "IMetadataRepository", IS_ABSTRACT, IS_INTERFACE,
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iArtifactRepositoryManagerEClass, IArtifactRepositoryManager.class, "IArtifactRepositoryManager", IS_ABSTRACT,
        IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iArtifactRepositoryEClass, IArtifactRepository.class, "IArtifactRepository", IS_ABSTRACT, IS_INTERFACE,
        !IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(unitVerificationStateEEnum, UnitVerificationState.class, "UnitVerificationState");
    addEEnumLiteral(unitVerificationStateEEnum, UnitVerificationState.UNKNOWN);
    addEEnumLiteral(unitVerificationStateEEnum, UnitVerificationState.VERIFIED);
    addEEnumLiteral(unitVerificationStateEEnum, UnitVerificationState.UPGRADED);

    // Initialize data types
    initEDataType(versionTypeEDataType, VersionType.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    addAnnotation(this, source, new String[] { "qualified", "false" });
    addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
    addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
    addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] { "kind", "attribute", "name", "xmlns:prefix" });
    addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
        new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
    addAnnotation(getDocumentRoot_Target(), source,
        new String[] { "kind", "element", "name", "target", "namespace", "##targetNamespace" });
    addAnnotation(locationsTypeEClass, source, new String[] { "name", "locations_._type", "kind", "elementOnly" });
    addAnnotation(getLocationsType_Location(), source,
        new String[] { "kind", "element", "name", "location", "namespace", "##targetNamespace" });
    addAnnotation(locationTypeEClass, source, new String[] { "name", "location_._type", "kind", "elementOnly" });
    addAnnotation(getLocationType_Unit(), source,
        new String[] { "kind", "element", "name", "unit", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_Repository(), source,
        new String[] { "kind", "element", "name", "repository", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_IncludeAllPlatforms(), source,
        new String[] { "kind", "attribute", "name", "includeAllPlatforms", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_IncludeConfigurePhase(), source,
        new String[] { "kind", "attribute", "name", "includeConfigurePhase", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_IncludeMode(), source,
        new String[] { "kind", "attribute", "name", "includeMode", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_IncludeSource(), source,
        new String[] { "kind", "attribute", "name", "includeSource", "namespace", "##targetNamespace" });
    addAnnotation(getLocationType_Type(), source,
        new String[] { "kind", "attribute", "name", "type", "namespace", "##targetNamespace" });
    addAnnotation(repositoryTypeEClass, source, new String[] { "name", "repository_._type", "kind", "empty" });
    addAnnotation(getRepositoryType_Location(), source,
        new String[] { "kind", "attribute", "name", "location", "namespace", "##targetNamespace" });
    addAnnotation(targetTypeEClass, source, new String[] { "name", "target_._type", "kind", "elementOnly" });
    addAnnotation(getTargetType_Locations(), source,
        new String[] { "kind", "element", "name", "locations", "namespace", "##targetNamespace" });
    addAnnotation(getTargetType_Name(), source,
        new String[] { "kind", "attribute", "name", "name", "namespace", "##targetNamespace" });
    addAnnotation(getTargetType_SequenceNumber(), source,
        new String[] { "kind", "attribute", "name", "sequenceNumber", "namespace", "##targetNamespace" });
    addAnnotation(unitTypeEClass, source, new String[] { "name", "unit_._type", "kind", "empty" });
    addAnnotation(getUnitType_Id(), source, new String[] { "kind", "attribute", "name", "id", "namespace", "##targetNamespace" });
    addAnnotation(getUnitType_Version(), source,
        new String[] { "kind", "attribute", "name", "version", "namespace", "##targetNamespace" });
  }

} //p2PackageImpl
