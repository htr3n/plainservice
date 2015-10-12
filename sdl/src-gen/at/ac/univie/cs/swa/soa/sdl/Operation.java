/**
 */
package at.ac.univie.cs.swa.soa.sdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Operation#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputName <em>Input Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputType <em>Input Type</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
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
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Input Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Name</em>' attribute.
   * @see #setInputName(String)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation_InputName()
   * @model
   * @generated
   */
  String getInputName();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputName <em>Input Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Name</em>' attribute.
   * @see #getInputName()
   * @generated
   */
  void setInputName(String value);

  /**
   * Returns the value of the '<em><b>Input Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' reference.
   * @see #setInputType(DataElement)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation_InputType()
   * @model
   * @generated
   */
  DataElement getInputType();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputType <em>Input Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' reference.
   * @see #getInputType()
   * @generated
   */
  void setInputType(DataElement value);

  /**
   * Returns the value of the '<em><b>Output Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Name</em>' attribute.
   * @see #setOutputName(String)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation_OutputName()
   * @model
   * @generated
   */
  String getOutputName();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputName <em>Output Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Name</em>' attribute.
   * @see #getOutputName()
   * @generated
   */
  void setOutputName(String value);

  /**
   * Returns the value of the '<em><b>Output Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Type</em>' reference.
   * @see #setOutputType(DataElement)
   * @see at.ac.univie.cs.swa.soa.sdl.SdlPackage#getOperation_OutputType()
   * @model
   * @generated
   */
  DataElement getOutputType();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputType <em>Output Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Type</em>' reference.
   * @see #getOutputType()
   * @generated
   */
  void setOutputType(DataElement value);

} // Operation
