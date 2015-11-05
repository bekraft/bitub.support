/**
 */
package bitub.support.p2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bitub.support.p2.P2Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface P2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "p2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "platform:/resource/bitub.support.p21/model/p2.xsd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "p2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  P2Package eINSTANCE = bitub.support.p2.impl.P2PackageImpl.init();

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.DocumentRootImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 0;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TARGET = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.LocationsTypeImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getLocationsType()
   * @generated
   */
  int LOCATIONS_TYPE = 1;

  /**
   * The feature id for the '<em><b>Location</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATIONS_TYPE__LOCATION = 0;

  /**
   * The number of structural features of the '<em>Locations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATIONS_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Locations Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATIONS_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.LocationTypeImpl <em>Location Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.LocationTypeImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getLocationType()
   * @generated
   */
  int LOCATION_TYPE = 2;

  /**
   * The feature id for the '<em><b>Unit</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__UNIT = 0;

  /**
   * The feature id for the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__REPOSITORY = 1;

  /**
   * The feature id for the '<em><b>Include All Platforms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__INCLUDE_ALL_PLATFORMS = 2;

  /**
   * The feature id for the '<em><b>Include Configure Phase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE = 3;

  /**
   * The feature id for the '<em><b>Include Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__INCLUDE_MODE = 4;

  /**
   * The feature id for the '<em><b>Include Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__INCLUDE_SOURCE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE__TYPE = 6;

  /**
   * The number of structural features of the '<em>Location Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE_FEATURE_COUNT = 7;

  /**
   * The operation id for the '<em>Metadata Repository</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE___METADATA_REPOSITORY = 0;

  /**
   * The operation id for the '<em>Artifact Repository</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE___ARTIFACT_REPOSITORY = 1;

  /**
   * The number of operations of the '<em>Location Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_TYPE_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.RepositoryTypeImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getRepositoryType()
   * @generated
   */
  int REPOSITORY_TYPE = 3;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE__LOCATION = 0;

  /**
   * The number of structural features of the '<em>Repository Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Repository Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_TYPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.TargetTypeImpl <em>Target Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.TargetTypeImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getTargetType()
   * @generated
   */
  int TARGET_TYPE = 4;

  /**
   * The feature id for the '<em><b>Locations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE__LOCATIONS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE__SEQUENCE_NUMBER = 2;

  /**
   * The number of structural features of the '<em>Target Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>Metadata Repository Manager</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE___METADATA_REPOSITORY_MANAGER = 0;

  /**
   * The operation id for the '<em>Artifact Repository Manager</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE___ARTIFACT_REPOSITORY_MANAGER = 1;

  /**
   * The number of operations of the '<em>Target Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TYPE_OPERATION_COUNT = 2;

  /**
   * The meta object id for the '{@link bitub.support.p2.impl.UnitTypeImpl <em>Unit Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.impl.UnitTypeImpl
   * @see bitub.support.p2.impl.P2PackageImpl#getUnitType()
   * @generated
   */
  int UNIT_TYPE = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE__ID = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE__VERSION = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE__STATE = 2;

  /**
   * The number of structural features of the '<em>Unit Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE_FEATURE_COUNT = 3;

  /**
   * The operation id for the '<em>Verify IU</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE___VERIFY_IU = 0;

  /**
   * The number of operations of the '<em>Unit Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_TYPE_OPERATION_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager <em>IMetadata Repository Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager
   * @see bitub.support.p2.impl.P2PackageImpl#getIMetadataRepositoryManager()
   * @generated
   */
  int IMETADATA_REPOSITORY_MANAGER = 6;

  /**
   * The number of structural features of the '<em>IMetadata Repository Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMETADATA_REPOSITORY_MANAGER_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>IMetadata Repository Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMETADATA_REPOSITORY_MANAGER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository <em>IMetadata Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
   * @see bitub.support.p2.impl.P2PackageImpl#getIMetadataRepository()
   * @generated
   */
  int IMETADATA_REPOSITORY = 7;

  /**
   * The number of structural features of the '<em>IMetadata Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMETADATA_REPOSITORY_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>IMetadata Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMETADATA_REPOSITORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager <em>IArtifact Repository Manager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager
   * @see bitub.support.p2.impl.P2PackageImpl#getIArtifactRepositoryManager()
   * @generated
   */
  int IARTIFACT_REPOSITORY_MANAGER = 8;

  /**
   * The number of structural features of the '<em>IArtifact Repository Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IARTIFACT_REPOSITORY_MANAGER_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>IArtifact Repository Manager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IARTIFACT_REPOSITORY_MANAGER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepository <em>IArtifact Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepository
   * @see bitub.support.p2.impl.P2PackageImpl#getIArtifactRepository()
   * @generated
   */
  int IARTIFACT_REPOSITORY = 9;

  /**
   * The number of structural features of the '<em>IArtifact Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IARTIFACT_REPOSITORY_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>IArtifact Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IARTIFACT_REPOSITORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link bitub.support.p2.UnitVerificationState <em>Unit Verification State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.UnitVerificationState
   * @see bitub.support.p2.impl.P2PackageImpl#getUnitVerificationState()
   * @generated
   */
  int UNIT_VERIFICATION_STATE = 10;

  /**
   * The meta object id for the '<em>Version Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bitub.support.p2.VersionType
   * @see bitub.support.p2.impl.P2PackageImpl#getVersionType()
   * @generated
   */
  int VERSION_TYPE = 11;

  /**
   * Returns the meta object for class '{@link bitub.support.p2.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see bitub.support.p2.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link bitub.support.p2.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see bitub.support.p2.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link bitub.support.p2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see bitub.support.p2.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link bitub.support.p2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see bitub.support.p2.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link bitub.support.p2.DocumentRoot#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see bitub.support.p2.DocumentRoot#getTarget()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Target();

  /**
   * Returns the meta object for class '{@link bitub.support.p2.LocationsType <em>Locations Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Locations Type</em>'.
   * @see bitub.support.p2.LocationsType
   * @generated
   */
  EClass getLocationsType();

  /**
   * Returns the meta object for the containment reference list '{@link bitub.support.p2.LocationsType#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Location</em>'.
   * @see bitub.support.p2.LocationsType#getLocation()
   * @see #getLocationsType()
   * @generated
   */
  EReference getLocationsType_Location();

  /**
   * Returns the meta object for class '{@link bitub.support.p2.LocationType <em>Location Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Type</em>'.
   * @see bitub.support.p2.LocationType
   * @generated
   */
  EClass getLocationType();

  /**
   * Returns the meta object for the containment reference list '{@link bitub.support.p2.LocationType#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unit</em>'.
   * @see bitub.support.p2.LocationType#getUnit()
   * @see #getLocationType()
   * @generated
   */
  EReference getLocationType_Unit();

  /**
   * Returns the meta object for the containment reference '{@link bitub.support.p2.LocationType#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repository</em>'.
   * @see bitub.support.p2.LocationType#getRepository()
   * @see #getLocationType()
   * @generated
   */
  EReference getLocationType_Repository();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.LocationType#isIncludeAllPlatforms <em>Include All Platforms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include All Platforms</em>'.
   * @see bitub.support.p2.LocationType#isIncludeAllPlatforms()
   * @see #getLocationType()
   * @generated
   */
  EAttribute getLocationType_IncludeAllPlatforms();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.LocationType#isIncludeConfigurePhase <em>Include Configure Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Configure Phase</em>'.
   * @see bitub.support.p2.LocationType#isIncludeConfigurePhase()
   * @see #getLocationType()
   * @generated
   */
  EAttribute getLocationType_IncludeConfigurePhase();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.LocationType#getIncludeMode <em>Include Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Mode</em>'.
   * @see bitub.support.p2.LocationType#getIncludeMode()
   * @see #getLocationType()
   * @generated
   */
  EAttribute getLocationType_IncludeMode();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.LocationType#isIncludeSource <em>Include Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Source</em>'.
   * @see bitub.support.p2.LocationType#isIncludeSource()
   * @see #getLocationType()
   * @generated
   */
  EAttribute getLocationType_IncludeSource();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.LocationType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see bitub.support.p2.LocationType#getType()
   * @see #getLocationType()
   * @generated
   */
  EAttribute getLocationType_Type();

  /**
   * Returns the meta object for the '{@link bitub.support.p2.LocationType#metadataRepository() <em>Metadata Repository</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Metadata Repository</em>' operation.
   * @see bitub.support.p2.LocationType#metadataRepository()
   * @generated
   */
  EOperation getLocationType__MetadataRepository();

  /**
   * Returns the meta object for the '{@link bitub.support.p2.LocationType#artifactRepository() <em>Artifact Repository</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Artifact Repository</em>' operation.
   * @see bitub.support.p2.LocationType#artifactRepository()
   * @generated
   */
  EOperation getLocationType__ArtifactRepository();

  /**
   * Returns the meta object for class '{@link bitub.support.p2.RepositoryType <em>Repository Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Type</em>'.
   * @see bitub.support.p2.RepositoryType
   * @generated
   */
  EClass getRepositoryType();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.RepositoryType#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see bitub.support.p2.RepositoryType#getLocation()
   * @see #getRepositoryType()
   * @generated
   */
  EAttribute getRepositoryType_Location();

  /**
   * Returns the meta object for class '{@link bitub.support.p2.TargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Type</em>'.
   * @see bitub.support.p2.TargetType
   * @generated
   */
  EClass getTargetType();

  /**
   * Returns the meta object for the containment reference '{@link bitub.support.p2.TargetType#getLocations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Locations</em>'.
   * @see bitub.support.p2.TargetType#getLocations()
   * @see #getTargetType()
   * @generated
   */
  EReference getTargetType_Locations();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.TargetType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see bitub.support.p2.TargetType#getName()
   * @see #getTargetType()
   * @generated
   */
  EAttribute getTargetType_Name();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.TargetType#getSequenceNumber <em>Sequence Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence Number</em>'.
   * @see bitub.support.p2.TargetType#getSequenceNumber()
   * @see #getTargetType()
   * @generated
   */
  EAttribute getTargetType_SequenceNumber();

  /**
   * Returns the meta object for the '{@link bitub.support.p2.TargetType#metadataRepositoryManager() <em>Metadata Repository Manager</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Metadata Repository Manager</em>' operation.
   * @see bitub.support.p2.TargetType#metadataRepositoryManager()
   * @generated
   */
  EOperation getTargetType__MetadataRepositoryManager();

  /**
   * Returns the meta object for the '{@link bitub.support.p2.TargetType#artifactRepositoryManager() <em>Artifact Repository Manager</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Artifact Repository Manager</em>' operation.
   * @see bitub.support.p2.TargetType#artifactRepositoryManager()
   * @generated
   */
  EOperation getTargetType__ArtifactRepositoryManager();

  /**
   * Returns the meta object for class '{@link bitub.support.p2.UnitType <em>Unit Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Type</em>'.
   * @see bitub.support.p2.UnitType
   * @generated
   */
  EClass getUnitType();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.UnitType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see bitub.support.p2.UnitType#getId()
   * @see #getUnitType()
   * @generated
   */
  EAttribute getUnitType_Id();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.UnitType#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see bitub.support.p2.UnitType#getVersion()
   * @see #getUnitType()
   * @generated
   */
  EAttribute getUnitType_Version();

  /**
   * Returns the meta object for the attribute '{@link bitub.support.p2.UnitType#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see bitub.support.p2.UnitType#getState()
   * @see #getUnitType()
   * @generated
   */
  EAttribute getUnitType_State();

  /**
   * Returns the meta object for the '{@link bitub.support.p2.UnitType#verifyIU() <em>Verify IU</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Verify IU</em>' operation.
   * @see bitub.support.p2.UnitType#verifyIU()
   * @generated
   */
  EOperation getUnitType__VerifyIU();

  /**
   * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager <em>IMetadata Repository Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IMetadata Repository Manager</em>'.
   * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager
   * @model instanceClass="org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager"
   * @generated
   */
  EClass getIMetadataRepositoryManager();

  /**
   * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository <em>IMetadata Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IMetadata Repository</em>'.
   * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
   * @model instanceClass="org.eclipse.equinox.p2.repository.metadata.IMetadataRepository"
   * @generated
   */
  EClass getIMetadataRepository();

  /**
   * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager <em>IArtifact Repository Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IArtifact Repository Manager</em>'.
   * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager
   * @model instanceClass="org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager"
   * @generated
   */
  EClass getIArtifactRepositoryManager();

  /**
   * Returns the meta object for class '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepository <em>IArtifact Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IArtifact Repository</em>'.
   * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepository
   * @model instanceClass="org.eclipse.equinox.p2.repository.artifact.IArtifactRepository"
   * @generated
   */
  EClass getIArtifactRepository();

  /**
   * Returns the meta object for enum '{@link bitub.support.p2.UnitVerificationState <em>Unit Verification State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unit Verification State</em>'.
   * @see bitub.support.p2.UnitVerificationState
   * @generated
   */
  EEnum getUnitVerificationState();

  /**
   * Returns the meta object for data type '{@link bitub.support.p2.VersionType <em>Version Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Version Type</em>'.
   * @see bitub.support.p2.VersionType
   * @model instanceClass="bitub.support.p2.VersionType"
   * @generated
   */
  EDataType getVersionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  P2Factory getP2Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.DocumentRootImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TARGET = eINSTANCE.getDocumentRoot_Target();

    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.LocationsTypeImpl <em>Locations Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.LocationsTypeImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getLocationsType()
     * @generated
     */
    EClass LOCATIONS_TYPE = eINSTANCE.getLocationsType();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATIONS_TYPE__LOCATION = eINSTANCE.getLocationsType_Location();

    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.LocationTypeImpl <em>Location Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.LocationTypeImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getLocationType()
     * @generated
     */
    EClass LOCATION_TYPE = eINSTANCE.getLocationType();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_TYPE__UNIT = eINSTANCE.getLocationType_Unit();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCATION_TYPE__REPOSITORY = eINSTANCE.getLocationType_Repository();

    /**
     * The meta object literal for the '<em><b>Include All Platforms</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_TYPE__INCLUDE_ALL_PLATFORMS = eINSTANCE.getLocationType_IncludeAllPlatforms();

    /**
     * The meta object literal for the '<em><b>Include Configure Phase</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE = eINSTANCE.getLocationType_IncludeConfigurePhase();

    /**
     * The meta object literal for the '<em><b>Include Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_TYPE__INCLUDE_MODE = eINSTANCE.getLocationType_IncludeMode();

    /**
     * The meta object literal for the '<em><b>Include Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_TYPE__INCLUDE_SOURCE = eINSTANCE.getLocationType_IncludeSource();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_TYPE__TYPE = eINSTANCE.getLocationType_Type();

    /**
     * The meta object literal for the '<em><b>Metadata Repository</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation LOCATION_TYPE___METADATA_REPOSITORY = eINSTANCE.getLocationType__MetadataRepository();

    /**
     * The meta object literal for the '<em><b>Artifact Repository</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation LOCATION_TYPE___ARTIFACT_REPOSITORY = eINSTANCE.getLocationType__ArtifactRepository();

    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.RepositoryTypeImpl <em>Repository Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.RepositoryTypeImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getRepositoryType()
     * @generated
     */
    EClass REPOSITORY_TYPE = eINSTANCE.getRepositoryType();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_TYPE__LOCATION = eINSTANCE.getRepositoryType_Location();

    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.TargetTypeImpl <em>Target Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.TargetTypeImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getTargetType()
     * @generated
     */
    EClass TARGET_TYPE = eINSTANCE.getTargetType();

    /**
     * The meta object literal for the '<em><b>Locations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_TYPE__LOCATIONS = eINSTANCE.getTargetType_Locations();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_TYPE__NAME = eINSTANCE.getTargetType_Name();

    /**
     * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TARGET_TYPE__SEQUENCE_NUMBER = eINSTANCE.getTargetType_SequenceNumber();

    /**
     * The meta object literal for the '<em><b>Metadata Repository Manager</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TARGET_TYPE___METADATA_REPOSITORY_MANAGER = eINSTANCE.getTargetType__MetadataRepositoryManager();

    /**
     * The meta object literal for the '<em><b>Artifact Repository Manager</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TARGET_TYPE___ARTIFACT_REPOSITORY_MANAGER = eINSTANCE.getTargetType__ArtifactRepositoryManager();

    /**
     * The meta object literal for the '{@link bitub.support.p2.impl.UnitTypeImpl <em>Unit Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.impl.UnitTypeImpl
     * @see bitub.support.p2.impl.P2PackageImpl#getUnitType()
     * @generated
     */
    EClass UNIT_TYPE = eINSTANCE.getUnitType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_TYPE__ID = eINSTANCE.getUnitType_Id();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_TYPE__VERSION = eINSTANCE.getUnitType_Version();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIT_TYPE__STATE = eINSTANCE.getUnitType_State();

    /**
     * The meta object literal for the '<em><b>Verify IU</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation UNIT_TYPE___VERIFY_IU = eINSTANCE.getUnitType__VerifyIU();

    /**
     * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager <em>IMetadata Repository Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager
     * @see bitub.support.p2.impl.P2PackageImpl#getIMetadataRepositoryManager()
     * @generated
     */
    EClass IMETADATA_REPOSITORY_MANAGER = eINSTANCE.getIMetadataRepositoryManager();

    /**
     * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.metadata.IMetadataRepository <em>IMetadata Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.equinox.p2.repository.metadata.IMetadataRepository
     * @see bitub.support.p2.impl.P2PackageImpl#getIMetadataRepository()
     * @generated
     */
    EClass IMETADATA_REPOSITORY = eINSTANCE.getIMetadataRepository();

    /**
     * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager <em>IArtifact Repository Manager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager
     * @see bitub.support.p2.impl.P2PackageImpl#getIArtifactRepositoryManager()
     * @generated
     */
    EClass IARTIFACT_REPOSITORY_MANAGER = eINSTANCE.getIArtifactRepositoryManager();

    /**
     * The meta object literal for the '{@link org.eclipse.equinox.p2.repository.artifact.IArtifactRepository <em>IArtifact Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.equinox.p2.repository.artifact.IArtifactRepository
     * @see bitub.support.p2.impl.P2PackageImpl#getIArtifactRepository()
     * @generated
     */
    EClass IARTIFACT_REPOSITORY = eINSTANCE.getIArtifactRepository();

    /**
     * The meta object literal for the '{@link bitub.support.p2.UnitVerificationState <em>Unit Verification State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.UnitVerificationState
     * @see bitub.support.p2.impl.P2PackageImpl#getUnitVerificationState()
     * @generated
     */
    EEnum UNIT_VERIFICATION_STATE = eINSTANCE.getUnitVerificationState();

    /**
     * The meta object literal for the '<em>Version Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bitub.support.p2.VersionType
     * @see bitub.support.p2.impl.P2PackageImpl#getVersionType()
     * @generated
     */
    EDataType VERSION_TYPE = eINSTANCE.getVersionType();

  }

} //p2Package
