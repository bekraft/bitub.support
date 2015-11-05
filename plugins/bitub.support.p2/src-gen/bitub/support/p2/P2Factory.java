/**
 */
package bitub.support.p2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bitub.support.p2.P2Package
 * @generated
 */
public interface P2Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  P2Factory eINSTANCE = bitub.support.p2.impl.P2FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Locations Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Locations Type</em>'.
   * @generated
   */
  LocationsType createLocationsType();

  /**
   * Returns a new object of class '<em>Location Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Location Type</em>'.
   * @generated
   */
  LocationType createLocationType();

  /**
   * Returns a new object of class '<em>Repository Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Type</em>'.
   * @generated
   */
  RepositoryType createRepositoryType();

  /**
   * Returns a new object of class '<em>Target Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Type</em>'.
   * @generated
   */
  TargetType createTargetType();

  /**
   * Returns a new object of class '<em>Unit Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unit Type</em>'.
   * @generated
   */
  UnitType createUnitType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  P2Package getP2Package();

} //p2Factory
