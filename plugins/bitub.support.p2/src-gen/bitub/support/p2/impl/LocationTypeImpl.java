/**
 */
package bitub.support.p2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

import bitub.support.p2.LocationType;
import bitub.support.p2.P2Package;
import bitub.support.p2.RepositoryType;
import bitub.support.p2.TargetType;
import bitub.support.p2.UnitType;
import bitub.support.p2.util.TargetPlatformUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#isIncludeAllPlatforms <em>Include All Platforms</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#isIncludeConfigurePhase <em>Include Configure Phase</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#getIncludeMode <em>Include Mode</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#isIncludeSource <em>Include Source</em>}</li>
 *   <li>{@link bitub.support.p2.impl.LocationTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationTypeImpl extends MinimalEObjectImpl.Container implements LocationType
{
  final static Logger myLog = Logger.getLogger(LocationTypeImpl.class);

  /**
   * Metadata repository
   * @generated NOT
   */
  protected IMetadataRepository m_metadataRepository;

  /**
   * Artifact repository.
   * @generated NOT
   */
  protected IArtifactRepository m_artifactRepository;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected EList<UnitType> unit;

  /**
   * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
  protected RepositoryType repository;

  /**
   * The default value of the '{@link #isIncludeAllPlatforms() <em>Include All Platforms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeAllPlatforms()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDE_ALL_PLATFORMS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludeAllPlatforms() <em>Include All Platforms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeAllPlatforms()
   * @generated
   * @ordered
   */
  protected boolean includeAllPlatforms = INCLUDE_ALL_PLATFORMS_EDEFAULT;

  /**
   * This is true if the Include All Platforms attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean includeAllPlatformsESet;

  /**
   * The default value of the '{@link #isIncludeConfigurePhase() <em>Include Configure Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeConfigurePhase()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDE_CONFIGURE_PHASE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludeConfigurePhase() <em>Include Configure Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeConfigurePhase()
   * @generated
   * @ordered
   */
  protected boolean includeConfigurePhase = INCLUDE_CONFIGURE_PHASE_EDEFAULT;

  /**
   * This is true if the Include Configure Phase attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean includeConfigurePhaseESet;

  /**
   * The default value of the '{@link #getIncludeMode() <em>Include Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeMode()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeMode() <em>Include Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeMode()
   * @generated
   * @ordered
   */
  protected String includeMode = INCLUDE_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #isIncludeSource() <em>Include Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeSource()
   * @generated
   * @ordered
   */
  protected static final boolean INCLUDE_SOURCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncludeSource() <em>Include Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncludeSource()
   * @generated
   * @ordered
   */
  protected boolean includeSource = INCLUDE_SOURCE_EDEFAULT;

  /**
   * This is true if the Include Source attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean includeSourceESet;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected LocationTypeImpl()
  {
    super();
    eAdapters().add(new EContentAdapter() {

      @Override
      public void notifyChanged(Notification notification)
      {
        if (P2Package.Literals.REPOSITORY_TYPE__LOCATION.equals(notification.getFeature())) {

          m_metadataRepository = null;
          m_artifactRepository = null;

          if (eNotificationRequired()) {

            eNotify(notification);
          }
        }
      }
    });
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return P2Package.Literals.LOCATION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnitType> getUnit()
  {
    if (unit == null) {
      unit = new EObjectContainmentEList<UnitType>(UnitType.class, this, P2Package.LOCATION_TYPE__UNIT);
    }
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryType getRepository()
  {
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(RepositoryType newRepository, NotificationChain msgs)
  {
    RepositoryType oldRepository = repository;
    repository = newRepository;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__REPOSITORY, oldRepository, newRepository);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(RepositoryType newRepository)
  {
    if (newRepository != repository) {
      NotificationChain msgs = null;
      if (repository != null)
        msgs = ((InternalEObject) repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - P2Package.LOCATION_TYPE__REPOSITORY,
            null, msgs);
      if (newRepository != null)
        msgs = ((InternalEObject) newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - P2Package.LOCATION_TYPE__REPOSITORY,
            null, msgs);
      msgs = basicSetRepository(newRepository, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else
      if (eNotificationRequired())
        eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__REPOSITORY, newRepository, newRepository));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludeAllPlatforms()
  {
    return includeAllPlatforms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeAllPlatforms(boolean newIncludeAllPlatforms)
  {
    boolean oldIncludeAllPlatforms = includeAllPlatforms;
    includeAllPlatforms = newIncludeAllPlatforms;
    boolean oldIncludeAllPlatformsESet = includeAllPlatformsESet;
    includeAllPlatformsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS,
          oldIncludeAllPlatforms, includeAllPlatforms, !oldIncludeAllPlatformsESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetIncludeAllPlatforms()
  {
    boolean oldIncludeAllPlatforms = includeAllPlatforms;
    boolean oldIncludeAllPlatformsESet = includeAllPlatformsESet;
    includeAllPlatforms = INCLUDE_ALL_PLATFORMS_EDEFAULT;
    includeAllPlatformsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS,
          oldIncludeAllPlatforms, INCLUDE_ALL_PLATFORMS_EDEFAULT, oldIncludeAllPlatformsESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIncludeAllPlatforms()
  {
    return includeAllPlatformsESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludeConfigurePhase()
  {
    return includeConfigurePhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeConfigurePhase(boolean newIncludeConfigurePhase)
  {
    boolean oldIncludeConfigurePhase = includeConfigurePhase;
    includeConfigurePhase = newIncludeConfigurePhase;
    boolean oldIncludeConfigurePhaseESet = includeConfigurePhaseESet;
    includeConfigurePhaseESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE,
          oldIncludeConfigurePhase, includeConfigurePhase, !oldIncludeConfigurePhaseESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetIncludeConfigurePhase()
  {
    boolean oldIncludeConfigurePhase = includeConfigurePhase;
    boolean oldIncludeConfigurePhaseESet = includeConfigurePhaseESet;
    includeConfigurePhase = INCLUDE_CONFIGURE_PHASE_EDEFAULT;
    includeConfigurePhaseESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE,
          oldIncludeConfigurePhase, INCLUDE_CONFIGURE_PHASE_EDEFAULT, oldIncludeConfigurePhaseESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIncludeConfigurePhase()
  {
    return includeConfigurePhaseESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncludeMode()
  {
    return includeMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeMode(String newIncludeMode)
  {
    String oldIncludeMode = includeMode;
    includeMode = newIncludeMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__INCLUDE_MODE, oldIncludeMode, includeMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncludeSource()
  {
    return includeSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeSource(boolean newIncludeSource)
  {
    boolean oldIncludeSource = includeSource;
    includeSource = newIncludeSource;
    boolean oldIncludeSourceESet = includeSourceESet;
    includeSourceESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__INCLUDE_SOURCE, oldIncludeSource,
          includeSource, !oldIncludeSourceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetIncludeSource()
  {
    boolean oldIncludeSource = includeSource;
    boolean oldIncludeSourceESet = includeSourceESet;
    includeSource = INCLUDE_SOURCE_EDEFAULT;
    includeSourceESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, P2Package.LOCATION_TYPE__INCLUDE_SOURCE, oldIncludeSource,
          INCLUDE_SOURCE_EDEFAULT, oldIncludeSourceESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIncludeSource()
  {
    return includeSourceESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.LOCATION_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @throws InvocationTargetException 
   * @generated NOT
   */
  public IMetadataRepository metadataRepository()
  {
    if (null == m_metadataRepository) {

      TargetType targetType = (TargetType) eContainer().eContainer();
      try {
        m_metadataRepository =
            TargetPlatformUtil.queryMetadataRepository(targetType.metadataRepositoryManager(), getRepository().getLocation());
      }
      catch (InvocationTargetException e) {

        myLog.error(e);
        throw new RuntimeException(e);
      }
    }
    return m_metadataRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public IArtifactRepository artifactRepository()
  {
    if (null == m_artifactRepository) {

      TargetType targetType = (TargetType) eContainer().eContainer();
      try {
        m_artifactRepository =
            TargetPlatformUtil.queryArtifactRepository(targetType.artifactRepositoryManager(), getRepository().getLocation());
      }
      catch (InvocationTargetException e) {

        myLog.error(e);
        throw new RuntimeException(e);
      }
    }
    return m_artifactRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID) {
      case P2Package.LOCATION_TYPE__UNIT:
        return ((InternalEList<?>) getUnit()).basicRemove(otherEnd, msgs);
      case P2Package.LOCATION_TYPE__REPOSITORY:
        return basicSetRepository(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID) {
      case P2Package.LOCATION_TYPE__UNIT:
        return getUnit();
      case P2Package.LOCATION_TYPE__REPOSITORY:
        return getRepository();
      case P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS:
        return isIncludeAllPlatforms();
      case P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE:
        return isIncludeConfigurePhase();
      case P2Package.LOCATION_TYPE__INCLUDE_MODE:
        return getIncludeMode();
      case P2Package.LOCATION_TYPE__INCLUDE_SOURCE:
        return isIncludeSource();
      case P2Package.LOCATION_TYPE__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID) {
      case P2Package.LOCATION_TYPE__UNIT:
        getUnit().clear();
        getUnit().addAll((Collection<? extends UnitType>) newValue);
        return;
      case P2Package.LOCATION_TYPE__REPOSITORY:
        setRepository((RepositoryType) newValue);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS:
        setIncludeAllPlatforms((Boolean) newValue);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE:
        setIncludeConfigurePhase((Boolean) newValue);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_MODE:
        setIncludeMode((String) newValue);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_SOURCE:
        setIncludeSource((Boolean) newValue);
        return;
      case P2Package.LOCATION_TYPE__TYPE:
        setType((String) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID) {
      case P2Package.LOCATION_TYPE__UNIT:
        getUnit().clear();
        return;
      case P2Package.LOCATION_TYPE__REPOSITORY:
        setRepository((RepositoryType) null);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS:
        unsetIncludeAllPlatforms();
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE:
        unsetIncludeConfigurePhase();
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_MODE:
        setIncludeMode(INCLUDE_MODE_EDEFAULT);
        return;
      case P2Package.LOCATION_TYPE__INCLUDE_SOURCE:
        unsetIncludeSource();
        return;
      case P2Package.LOCATION_TYPE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID) {
      case P2Package.LOCATION_TYPE__UNIT:
        return unit != null && !unit.isEmpty();
      case P2Package.LOCATION_TYPE__REPOSITORY:
        return repository != null;
      case P2Package.LOCATION_TYPE__INCLUDE_ALL_PLATFORMS:
        return isSetIncludeAllPlatforms();
      case P2Package.LOCATION_TYPE__INCLUDE_CONFIGURE_PHASE:
        return isSetIncludeConfigurePhase();
      case P2Package.LOCATION_TYPE__INCLUDE_MODE:
        return INCLUDE_MODE_EDEFAULT == null ? includeMode != null : !INCLUDE_MODE_EDEFAULT.equals(includeMode);
      case P2Package.LOCATION_TYPE__INCLUDE_SOURCE:
        return isSetIncludeSource();
      case P2Package.LOCATION_TYPE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID) {
      case P2Package.LOCATION_TYPE___METADATA_REPOSITORY:
        return metadataRepository();
      case P2Package.LOCATION_TYPE___ARTIFACT_REPOSITORY:
        return artifactRepository();
    }
    return super.eInvoke(operationID, arguments);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (includeAllPlatforms: ");
    if (includeAllPlatformsESet)
      result.append(includeAllPlatforms);
    else
      result.append("<unset>");
    result.append(", includeConfigurePhase: ");
    if (includeConfigurePhaseESet)
      result.append(includeConfigurePhase);
    else
      result.append("<unset>");
    result.append(", includeMode: ");
    result.append(includeMode);
    result.append(", includeSource: ");
    if (includeSourceESet)
      result.append(includeSource);
    else
      result.append("<unset>");
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //LocationTypeImpl
