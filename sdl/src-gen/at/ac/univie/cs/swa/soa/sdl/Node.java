/**
 */
package at.ac.univie.cs.swa.soa.sdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Node#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Node#getBaseURI <em>Base URI</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Node#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
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
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base URI</em>' attribute.
   * @see #setBaseURI(String)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getNode_BaseURI()
   * @model
   * @generated
   */
  String getBaseURI();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Node#getBaseURI <em>Base URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base URI</em>' attribute.
   * @see #getBaseURI()
   * @generated
   */
  void setBaseURI(String value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.sdl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' reference list.
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getNode_Services()
   * @model
   * @generated
   */
  EList<Service> getServices();

} // Node
