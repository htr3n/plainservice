/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getImports <em>Imports</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getServices <em>Services</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getData <em>Data</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL()
 * @model
 * @generated
 */
public interface ServiceDSL extends EObject
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
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.serviceDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.serviceDsl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL_Services()
   * @model containment="true"
   * @generated
   */
  EList<Service> getServices();

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.serviceDsl.DataElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL_Data()
   * @model containment="true"
   * @generated
   */
  EList<DataElement> getData();

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.serviceDsl.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getServiceDSL_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // ServiceDSL
