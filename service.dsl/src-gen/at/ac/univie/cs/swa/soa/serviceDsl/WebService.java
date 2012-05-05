/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.WebService#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getWebService()
 * @model
 * @generated
 */
public interface WebService extends Service
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.univie.cs.swa.soa.serviceDsl.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#getWebService_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // WebService