/**
 */
package bitub.support.p2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.UnitType#getId <em>Id</em>}</li>
 *   <li>{@link bitub.support.p2.UnitType#getVersion <em>Version</em>}</li>
 *   <li>{@link bitub.support.p2.UnitType#getState <em>State</em>}</li>
 * </ul>
 *
 * @see bitub.support.p2.P2Package#getUnitType()
 * @model extendedMetaData="name='unit_._type' kind='empty'"
 * @generated
 */
public interface UnitType extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see bitub.support.p2.P2Package#getUnitType_Id()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link bitub.support.p2.UnitType#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(VersionType)
   * @see bitub.support.p2.P2Package#getUnitType_Version()
   * @model dataType="bitub.support.p2.VersionType" required="true"
   *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
   * @generated
   */
  VersionType getVersion();

  /**
   * Sets the value of the '{@link bitub.support.p2.UnitType#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(VersionType value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * The literals are from the enumeration {@link bitub.support.p2.UnitVerificationState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see bitub.support.p2.UnitVerificationState
   * @see #setState(UnitVerificationState)
   * @see bitub.support.p2.P2Package#getUnitType_State()
   * @model transient="true" derived="true"
   * @generated
   */
  UnitVerificationState getState();

  /**
   * Sets the value of the '{@link bitub.support.p2.UnitType#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see bitub.support.p2.UnitVerificationState
   * @see #getState()
   * @generated
   */
  void setState(UnitVerificationState value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  void verifyIU();

} // UnitType
