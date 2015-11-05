/**
 */
package bitub.support.p2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Verification State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see bitub.support.p2.P2Package#getUnitVerificationState()
 * @model
 * @generated
 */
public enum UnitVerificationState implements Enumerator
{
  /**
   * The '<em><b>UNKNOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNKNOWN_VALUE
   * @generated
   * @ordered
   */
  UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

  /**
   * The '<em><b>VERIFIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERIFIED_VALUE
   * @generated
   * @ordered
   */
  VERIFIED(1, "VERIFIED", "VERIFIED"),

  /**
   * The '<em><b>UPGRADED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UPGRADED_VALUE
   * @generated
   * @ordered
   */
  UPGRADED(2, "UPGRADED", "UPGRADED");

  /**
   * The '<em><b>UNKNOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNKNOWN
   * @model
   * @generated
   * @ordered
   */
  public static final int UNKNOWN_VALUE = 0;

  /**
   * The '<em><b>VERIFIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERIFIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERIFIED
   * @model
   * @generated
   * @ordered
   */
  public static final int VERIFIED_VALUE = 1;

  /**
   * The '<em><b>UPGRADED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UPGRADED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UPGRADED
   * @model
   * @generated
   * @ordered
   */
  public static final int UPGRADED_VALUE = 2;

  /**
   * An array of all the '<em><b>Unit Verification State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UnitVerificationState[] VALUES_ARRAY = new UnitVerificationState[] { UNKNOWN, VERIFIED, UPGRADED, };

  /**
   * A public read-only list of all the '<em><b>Unit Verification State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UnitVerificationState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Unit Verification State</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnitVerificationState get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnitVerificationState result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unit Verification State</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnitVerificationState getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UnitVerificationState result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unit Verification State</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UnitVerificationState get(int value)
  {
    switch (value) {
      case UNKNOWN_VALUE:
        return UNKNOWN;
      case VERIFIED_VALUE:
        return VERIFIED;
      case UPGRADED_VALUE:
        return UPGRADED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UnitVerificationState(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} //UnitVerificationState
