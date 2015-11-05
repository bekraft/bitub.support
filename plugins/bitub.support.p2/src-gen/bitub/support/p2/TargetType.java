/**
 */
package bitub.support.p2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.TargetType#getLocations <em>Locations</em>}</li>
 *   <li>{@link bitub.support.p2.TargetType#getName <em>Name</em>}</li>
 *   <li>{@link bitub.support.p2.TargetType#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see bitub.support.p2.P2Package#getTargetType()
 * @model extendedMetaData="name='target_._type' kind='elementOnly'"
 * @generated
 */
public interface TargetType extends EObject
{
  /**
   * Returns the value of the '<em><b>Locations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locations</em>' containment reference.
   * @see #setLocations(LocationsType)
   * @see bitub.support.p2.P2Package#getTargetType_Locations()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='locations' namespace='##targetNamespace'"
   * @generated
   */
  LocationsType getLocations();

  /**
   * Sets the value of the '{@link bitub.support.p2.TargetType#getLocations <em>Locations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Locations</em>' containment reference.
   * @see #getLocations()
   * @generated
   */
  void setLocations(LocationsType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see bitub.support.p2.P2Package#getTargetType_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link bitub.support.p2.TargetType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence Number</em>' attribute.
   * @see #isSetSequenceNumber()
   * @see #unsetSequenceNumber()
   * @see #setSequenceNumber(short)
   * @see bitub.support.p2.P2Package#getTargetType_SequenceNumber()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte" required="true"
   *        extendedMetaData="kind='attribute' name='sequenceNumber' namespace='##targetNamespace'"
   * @generated
   */
  short getSequenceNumber();

  /**
   * Sets the value of the '{@link bitub.support.p2.TargetType#getSequenceNumber <em>Sequence Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence Number</em>' attribute.
   * @see #isSetSequenceNumber()
   * @see #unsetSequenceNumber()
   * @see #getSequenceNumber()
   * @generated
   */
  void setSequenceNumber(short value);

  /**
   * Unsets the value of the '{@link bitub.support.p2.TargetType#getSequenceNumber <em>Sequence Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetSequenceNumber()
   * @see #getSequenceNumber()
   * @see #setSequenceNumber(short)
   * @generated
   */
  void unsetSequenceNumber();

  /**
   * Returns whether the value of the '{@link bitub.support.p2.TargetType#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
   * @see #unsetSequenceNumber()
   * @see #getSequenceNumber()
   * @see #setSequenceNumber(short)
   * @generated
   */
  boolean isSetSequenceNumber();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model type="bitub.support.p2.IMetadataRepositoryManager"
   * @generated
   */
  IMetadataRepositoryManager metadataRepositoryManager();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model type="bitub.support.p2.IArtifactRepositoryManager"
   * @generated
   */
  IArtifactRepositoryManager artifactRepositoryManager();

} // TargetType
