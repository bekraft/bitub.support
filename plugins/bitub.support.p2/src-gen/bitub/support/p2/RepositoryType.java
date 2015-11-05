/**
 */
package bitub.support.p2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.RepositoryType#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see bitub.support.p2.P2Package#getRepositoryType()
 * @model extendedMetaData="name='repository_._type' kind='empty'"
 * @generated
 */
public interface RepositoryType extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see bitub.support.p2.P2Package#getRepositoryType_Location()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='location' namespace='##targetNamespace'"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link bitub.support.p2.RepositoryType#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

} // RepositoryType
