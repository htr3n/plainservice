/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.sdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MULTIPLICITY</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getMULTIPLICITY()
 * @model
 * @generated
 */
public enum MULTIPLICITY implements Enumerator
{
  /**
   * The '<em><b>OPTIONAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPTIONAL_VALUE
   * @generated
   * @ordered
   */
  OPTIONAL(0, "OPTIONAL", "?"),

  /**
   * The '<em><b>PLUS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUS_VALUE
   * @generated
   * @ordered
   */
  PLUS(1, "PLUS", "+"),

  /**
   * The '<em><b>STAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STAR_VALUE
   * @generated
   * @ordered
   */
  STAR(2, "STAR", "*");

  /**
   * The '<em><b>OPTIONAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPTIONAL
   * @model literal="?"
   * @generated
   * @ordered
   */
  public static final int OPTIONAL_VALUE = 0;

  /**
   * The '<em><b>PLUS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PLUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLUS
   * @model literal="+"
   * @generated
   * @ordered
   */
  public static final int PLUS_VALUE = 1;

  /**
   * The '<em><b>STAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STAR
   * @model literal="*"
   * @generated
   * @ordered
   */
  public static final int STAR_VALUE = 2;

  /**
   * An array of all the '<em><b>MULTIPLICITY</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MULTIPLICITY[] VALUES_ARRAY =
    new MULTIPLICITY[]
    {
      OPTIONAL,
      PLUS,
      STAR,
    };

  /**
   * A public read-only list of all the '<em><b>MULTIPLICITY</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MULTIPLICITY> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>MULTIPLICITY</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MULTIPLICITY get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MULTIPLICITY result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MULTIPLICITY</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MULTIPLICITY getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MULTIPLICITY result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>MULTIPLICITY</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MULTIPLICITY get(int value)
  {
    switch (value)
    {
      case OPTIONAL_VALUE: return OPTIONAL;
      case PLUS_VALUE: return PLUS;
      case STAR_VALUE: return STAR;
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
  private MULTIPLICITY(int value, String name, String literal)
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
  
} //MULTIPLICITY
