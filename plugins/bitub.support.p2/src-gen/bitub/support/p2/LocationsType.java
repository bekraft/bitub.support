/**
 */
package bitub.support.p2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.LocationsType#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see bitub.support.p2.P2Package#getLocationsType()
 * @model extendedMetaData="name='locations_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationsType extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' containment reference list.
   * The list contents are of type {@link bitub.support.p2.LocationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' containment reference list.
   * @see bitub.support.p2.P2Package#getLocationsType_Location()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
   * @generated
   */
  EList<LocationType> getLocation();

} // LocationsType
