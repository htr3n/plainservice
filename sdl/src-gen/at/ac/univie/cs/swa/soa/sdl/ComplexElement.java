/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.sdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.ComplexElement#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getComplexElement()
 * @model
 * @generated
 */
public interface ComplexElement extends DataElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.sdl.SimpleElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getComplexElement_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SimpleElement> getElements();

} // ComplexElement
