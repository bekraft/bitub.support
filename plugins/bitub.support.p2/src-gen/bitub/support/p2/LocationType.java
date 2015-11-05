/**
 */
package bitub.support.p2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bitub.support.p2.LocationType#getUnit <em>Unit</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#getRepository <em>Repository</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#isIncludeAllPlatforms <em>Include All Platforms</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#isIncludeConfigurePhase <em>Include Configure Phase</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#getIncludeMode <em>Include Mode</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#isIncludeSource <em>Include Source</em>}</li>
 *   <li>{@link bitub.support.p2.LocationType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bitub.support.p2.P2Package#getLocationType()
 * @model extendedMetaData="name='location_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationType extends EObject
{
  /**
   * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
   * The list contents are of type {@link bitub.support.p2.UnitType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' containment reference list.
   * @see bitub.support.p2.P2Package#getLocationType_Unit()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
   * @generated
   */
  EList<UnitType> getUnit();

  /**
   * Returns the value of the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' containment reference.
   * @see #setRepository(RepositoryType)
   * @see bitub.support.p2.P2Package#getLocationType_Repository()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace'"
   * @generated
   */
  RepositoryType getRepository();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#getRepository <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' containment reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(RepositoryType value);

  /**
   * Returns the value of the '<em><b>Include All Platforms</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include All Platforms</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include All Platforms</em>' attribute.
   * @see #isSetIncludeAllPlatforms()
   * @see #unsetIncludeAllPlatforms()
   * @see #setIncludeAllPlatforms(boolean)
   * @see bitub.support.p2.P2Package#getLocationType_IncludeAllPlatforms()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='attribute' name='includeAllPlatforms' namespace='##targetNamespace'"
   * @generated
   */
  boolean isIncludeAllPlatforms();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#isIncludeAllPlatforms <em>Include All Platforms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include All Platforms</em>' attribute.
   * @see #isSetIncludeAllPlatforms()
   * @see #unsetIncludeAllPlatforms()
   * @see #isIncludeAllPlatforms()
   * @generated
   */
  void setIncludeAllPlatforms(boolean value);

  /**
   * Unsets the value of the '{@link bitub.support.p2.LocationType#isIncludeAllPlatforms <em>Include All Platforms</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIncludeAllPlatforms()
   * @see #isIncludeAllPlatforms()
   * @see #setIncludeAllPlatforms(boolean)
   * @generated
   */
  void unsetIncludeAllPlatforms();

  /**
   * Returns whether the value of the '{@link bitub.support.p2.LocationType#isIncludeAllPlatforms <em>Include All Platforms</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Include All Platforms</em>' attribute is set.
   * @see #unsetIncludeAllPlatforms()
   * @see #isIncludeAllPlatforms()
   * @see #setIncludeAllPlatforms(boolean)
   * @generated
   */
  boolean isSetIncludeAllPlatforms();

  /**
   * Returns the value of the '<em><b>Include Configure Phase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Configure Phase</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Configure Phase</em>' attribute.
   * @see #isSetIncludeConfigurePhase()
   * @see #unsetIncludeConfigurePhase()
   * @see #setIncludeConfigurePhase(boolean)
   * @see bitub.support.p2.P2Package#getLocationType_IncludeConfigurePhase()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='attribute' name='includeConfigurePhase' namespace='##targetNamespace'"
   * @generated
   */
  boolean isIncludeConfigurePhase();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#isIncludeConfigurePhase <em>Include Configure Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Configure Phase</em>' attribute.
   * @see #isSetIncludeConfigurePhase()
   * @see #unsetIncludeConfigurePhase()
   * @see #isIncludeConfigurePhase()
   * @generated
   */
  void setIncludeConfigurePhase(boolean value);

  /**
   * Unsets the value of the '{@link bitub.support.p2.LocationType#isIncludeConfigurePhase <em>Include Configure Phase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIncludeConfigurePhase()
   * @see #isIncludeConfigurePhase()
   * @see #setIncludeConfigurePhase(boolean)
   * @generated
   */
  void unsetIncludeConfigurePhase();

  /**
   * Returns whether the value of the '{@link bitub.support.p2.LocationType#isIncludeConfigurePhase <em>Include Configure Phase</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Include Configure Phase</em>' attribute is set.
   * @see #unsetIncludeConfigurePhase()
   * @see #isIncludeConfigurePhase()
   * @see #setIncludeConfigurePhase(boolean)
   * @generated
   */
  boolean isSetIncludeConfigurePhase();

  /**
   * Returns the value of the '<em><b>Include Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Mode</em>' attribute.
   * @see #setIncludeMode(String)
   * @see bitub.support.p2.P2Package#getLocationType_IncludeMode()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='includeMode' namespace='##targetNamespace'"
   * @generated
   */
  String getIncludeMode();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#getIncludeMode <em>Include Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Mode</em>' attribute.
   * @see #getIncludeMode()
   * @generated
   */
  void setIncludeMode(String value);

  /**
   * Returns the value of the '<em><b>Include Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Source</em>' attribute.
   * @see #isSetIncludeSource()
   * @see #unsetIncludeSource()
   * @see #setIncludeSource(boolean)
   * @see bitub.support.p2.P2Package#getLocationType_IncludeSource()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
   *        extendedMetaData="kind='attribute' name='includeSource' namespace='##targetNamespace'"
   * @generated
   */
  boolean isIncludeSource();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#isIncludeSource <em>Include Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Include Source</em>' attribute.
   * @see #isSetIncludeSource()
   * @see #unsetIncludeSource()
   * @see #isIncludeSource()
   * @generated
   */
  void setIncludeSource(boolean value);

  /**
   * Unsets the value of the '{@link bitub.support.p2.LocationType#isIncludeSource <em>Include Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIncludeSource()
   * @see #isIncludeSource()
   * @see #setIncludeSource(boolean)
   * @generated
   */
  void unsetIncludeSource();

  /**
   * Returns whether the value of the '{@link bitub.support.p2.LocationType#isIncludeSource <em>Include Source</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Include Source</em>' attribute is set.
   * @see #unsetIncludeSource()
   * @see #isIncludeSource()
   * @see #setIncludeSource(boolean)
   * @generated
   */
  boolean isSetIncludeSource();

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see bitub.support.p2.P2Package#getLocationType_Type()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link bitub.support.p2.LocationType#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model type="bitub.support.p2.IMetadataRepository"
   * @generated
   */
  IMetadataRepository metadataRepository();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model type="bitub.support.p2.IArtifactRepository"
   * @generated
   */
  IArtifactRepository artifactRepository();

} // LocationType
