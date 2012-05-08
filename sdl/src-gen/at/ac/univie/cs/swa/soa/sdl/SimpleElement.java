/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.sdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getRef <em>Ref</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getSimpleElement()
 * @model
 * @generated
 */
public interface SimpleElement extends DataElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.cs.swa.soa.sdl.DATATYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see at.ac.univie.cs.swa.soa.sdl.DATATYPE
   * @see #setType(DATATYPE)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getSimpleElement_Type()
   * @model
   * @generated
   */
  DATATYPE getType();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see at.ac.univie.cs.swa.soa.sdl.DATATYPE
   * @see #getType()
   * @generated
   */
  void setType(DATATYPE value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ComplexElement)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getSimpleElement_Ref()
   * @model
   * @generated
   */
  ComplexElement getRef();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ComplexElement value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * The literals are from the enumeration {@link at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY
   * @see #setMultiplicity(MULTIPLICITY)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getSimpleElement_Multiplicity()
   * @model
   * @generated
   */
  MULTIPLICITY getMultiplicity();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(MULTIPLICITY value);

} // SimpleElement
