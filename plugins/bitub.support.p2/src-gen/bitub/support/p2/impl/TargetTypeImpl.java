/**
 */
package bitub.support.p2.impl;

import bitub.support.p2.LocationsType;
import bitub.support.p2.TargetType;
import bitub.support.p2.util.TargetPlatformUtil;

import java.lang.reflect.InvocationTargetException;
import bitub.support.p2.P2Package;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.impl.TargetTypeImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link bitub.support.p2.impl.TargetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link bitub.support.p2.impl.TargetTypeImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetTypeImpl extends MinimalEObjectImpl.Container implements TargetType
{
  final static Logger myLog = Logger.getLogger(TargetTypeImpl.class);

  /**
   * Repository manager.
   * @generated NOT
   */
  protected IMetadataRepositoryManager m_repositoryManager = null;

  /**
   * Artifact repository manager.
   * @generated NOT
   */
  protected IArtifactRepositoryManager m_artifactRepositoryManager = null;

  /**
   * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocations()
   * @generated
   * @ordered
   */
  protected LocationsType locations;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceNumber()
   * @generated
   * @ordered
   */
  protected static final short SEQUENCE_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceNumber()
   * @generated
   * @ordered
   */
  protected short sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

  /**
   * This is true if the Sequence Number attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean sequenceNumberESet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return P2Package.Literals.TARGET_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationsType getLocations()
  {
    return locations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocations(LocationsType newLocations, NotificationChain msgs)
  {
    LocationsType oldLocations = locations;
    locations = newLocations;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(this, Notification.SET, P2Package.TARGET_TYPE__LOCATIONS, oldLocations, newLocations);
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
  public void setLocations(LocationsType newLocations)
  {
    if (newLocations != locations) {
      NotificationChain msgs = null;
      if (locations != null)
        msgs = ((InternalEObject) locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - P2Package.TARGET_TYPE__LOCATIONS, null,
            msgs);
      if (newLocations != null)
        msgs = ((InternalEObject) newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - P2Package.TARGET_TYPE__LOCATIONS, null,
            msgs);
      msgs = basicSetLocations(newLocations, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else
      if (eNotificationRequired())
        eNotify(new ENotificationImpl(this, Notification.SET, P2Package.TARGET_TYPE__LOCATIONS, newLocations, newLocations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.TARGET_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getSequenceNumber()
  {
    return sequenceNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceNumber(short newSequenceNumber)
  {
    short oldSequenceNumber = sequenceNumber;
    sequenceNumber = newSequenceNumber;
    boolean oldSequenceNumberESet = sequenceNumberESet;
    sequenceNumberESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, P2Package.TARGET_TYPE__SEQUENCE_NUMBER, oldSequenceNumber,
          sequenceNumber, !oldSequenceNumberESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetSequenceNumber()
  {
    short oldSequenceNumber = sequenceNumber;
    boolean oldSequenceNumberESet = sequenceNumberESet;
    sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
    sequenceNumberESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, P2Package.TARGET_TYPE__SEQUENCE_NUMBER, oldSequenceNumber,
          SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetSequenceNumber()
  {
    return sequenceNumberESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public IMetadataRepositoryManager metadataRepositoryManager()
  {
    if (null == m_repositoryManager) {

      IProvisioningAgent provisioningAgent = TargetPlatformUtil.getProvisioningAgent();
      if (null == provisioningAgent) {

        myLog.error("No provisioning agent available.");
        return null;
      }

      m_repositoryManager = TargetPlatformUtil.getMetadataRepositoryManager(provisioningAgent);
    }
    return m_repositoryManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public IArtifactRepositoryManager artifactRepositoryManager()
  {
    if (null == m_artifactRepositoryManager) {

      IProvisioningAgent provisioningAgent = TargetPlatformUtil.getProvisioningAgent();
      if (null == provisioningAgent) {

        myLog.error("No provisioning agent available.");
        return null;
      }

      m_artifactRepositoryManager = TargetPlatformUtil.getArtifactRepositoryManager(provisioningAgent);
    }
    return m_artifactRepositoryManager;
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
      case P2Package.TARGET_TYPE__LOCATIONS:
        return basicSetLocations(null, msgs);
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
      case P2Package.TARGET_TYPE__LOCATIONS:
        return getLocations();
      case P2Package.TARGET_TYPE__NAME:
        return getName();
      case P2Package.TARGET_TYPE__SEQUENCE_NUMBER:
        return getSequenceNumber();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID) {
      case P2Package.TARGET_TYPE__LOCATIONS:
        setLocations((LocationsType) newValue);
        return;
      case P2Package.TARGET_TYPE__NAME:
        setName((String) newValue);
        return;
      case P2Package.TARGET_TYPE__SEQUENCE_NUMBER:
        setSequenceNumber((Short) newValue);
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
      case P2Package.TARGET_TYPE__LOCATIONS:
        setLocations((LocationsType) null);
        return;
      case P2Package.TARGET_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case P2Package.TARGET_TYPE__SEQUENCE_NUMBER:
        unsetSequenceNumber();
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
      case P2Package.TARGET_TYPE__LOCATIONS:
        return locations != null;
      case P2Package.TARGET_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case P2Package.TARGET_TYPE__SEQUENCE_NUMBER:
        return isSetSequenceNumber();
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
      case P2Package.TARGET_TYPE___METADATA_REPOSITORY_MANAGER:
        return metadataRepositoryManager();
      case P2Package.TARGET_TYPE___ARTIFACT_REPOSITORY_MANAGER:
        return artifactRepositoryManager();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", sequenceNumber: ");
    if (sequenceNumberESet)
      result.append(sequenceNumber);
    else
      result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //TargetTypeImpl
