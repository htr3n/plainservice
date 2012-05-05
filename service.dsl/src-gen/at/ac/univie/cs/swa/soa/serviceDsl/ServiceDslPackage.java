/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslFactory
 * @model kind="package"
 * @generated
 */
public interface ServiceDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "serviceDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://cs.univie.ac.at/swa/soa/ServiceDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "serviceDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServiceDslPackage eINSTANCE = at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl <em>Service DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getServiceDSL()
   * @generated
   */
  int SERVICE_DSL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL__SERVICES = 2;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL__DATA = 3;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL__NODES = 4;

  /**
   * The number of structural features of the '<em>Service DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_DSL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 0;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.WebServiceImpl <em>Web Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.WebServiceImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getWebService()
   * @generated
   */
  int WEB_SERVICE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_SERVICE__NAME = SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_SERVICE__OPERATIONS = SERVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Web Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.OperationImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Input Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__INPUT_NAME = 1;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__INPUT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Output Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OUTPUT_NAME = 3;

  /**
   * The feature id for the '<em><b>Output Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OUTPUT_TYPE = 4;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.RESTServiceImpl <em>REST Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.RESTServiceImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getRESTService()
   * @generated
   */
  int REST_SERVICE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SERVICE__NAME = SERVICE__NAME;

  /**
   * The number of structural features of the '<em>REST Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.NodeImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getNode()
   * @generated
   */
  int NODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Base URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__BASE_URI = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__SERVICES = 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.DataElementImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ComplexElementImpl <em>Complex Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ComplexElementImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getComplexElement()
   * @generated
   */
  int COMPLEX_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_ELEMENT__NAME = DATA_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_ELEMENT__ELEMENTS = DATA_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.SimpleElementImpl <em>Simple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.SimpleElementImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getSimpleElement()
   * @generated
   */
  int SIMPLE_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ELEMENT__NAME = DATA_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ELEMENT__TYPE = DATA_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ELEMENT__REF = DATA_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ELEMENT__MULTIPLICITY = DATA_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Simple Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ELEMENT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ImportImpl
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 9;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE <em>DATATYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE
   * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getDATATYPE()
   * @generated
   */
  int DATATYPE = 10;


  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL <em>Service DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service DSL</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL
   * @generated
   */
  EClass getServiceDSL();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getName()
   * @see #getServiceDSL()
   * @generated
   */
  EAttribute getServiceDSL_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getImports()
   * @see #getServiceDSL()
   * @generated
   */
  EReference getServiceDSL_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getServices()
   * @see #getServiceDSL()
   * @generated
   */
  EReference getServiceDSL_Services();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getData()
   * @see #getServiceDSL()
   * @generated
   */
  EReference getServiceDSL_Data();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL#getNodes()
   * @see #getServiceDSL()
   * @generated
   */
  EReference getServiceDSL_Nodes();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.WebService <em>Web Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Service</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.WebService
   * @generated
   */
  EClass getWebService();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.WebService#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.WebService#getOperations()
   * @see #getWebService()
   * @generated
   */
  EReference getWebService_Operations();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation#getInputName <em>Input Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation#getInputName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_InputName();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input Type</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation#getInputType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_InputType();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation#getOutputName <em>Output Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation#getOutputName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_OutputName();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.serviceDsl.Operation#getOutputType <em>Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output Type</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Operation#getOutputType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_OutputType();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.RESTService <em>REST Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REST Service</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.RESTService
   * @generated
   */
  EClass getRESTService();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Node#getBaseURI <em>Base URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URI</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Node#getBaseURI()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_BaseURI();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.Node#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Services</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Node#getServices()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Services();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Element</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.DataElement
   * @generated
   */
  EClass getDataElement();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.DataElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.DataElement#getName()
   * @see #getDataElement()
   * @generated
   */
  EAttribute getDataElement_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement <em>Complex Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Element</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement
   * @generated
   */
  EClass getComplexElement();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement#getElements()
   * @see #getComplexElement()
   * @generated
   */
  EReference getComplexElement_Elements();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement <em>Simple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Element</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement
   * @generated
   */
  EClass getSimpleElement();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getType()
   * @see #getSimpleElement()
   * @generated
   */
  EAttribute getSimpleElement_Type();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getRef()
   * @see #getSimpleElement()
   * @generated
   */
  EReference getSimpleElement_Ref();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement#getMultiplicity()
   * @see #getSimpleElement()
   * @generated
   */
  EAttribute getSimpleElement_Multiplicity();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.serviceDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.serviceDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE <em>DATATYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DATATYPE</em>'.
   * @see at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE
   * @generated
   */
  EEnum getDATATYPE();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServiceDslFactory getServiceDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl <em>Service DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getServiceDSL()
     * @generated
     */
    EClass SERVICE_DSL = eINSTANCE.getServiceDSL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_DSL__NAME = eINSTANCE.getServiceDSL_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DSL__IMPORTS = eINSTANCE.getServiceDSL_Imports();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DSL__SERVICES = eINSTANCE.getServiceDSL_Services();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DSL__DATA = eINSTANCE.getServiceDSL_Data();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_DSL__NODES = eINSTANCE.getServiceDSL_Nodes();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.WebServiceImpl <em>Web Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.WebServiceImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getWebService()
     * @generated
     */
    EClass WEB_SERVICE = eINSTANCE.getWebService();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_SERVICE__OPERATIONS = eINSTANCE.getWebService_Operations();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.OperationImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Input Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__INPUT_NAME = eINSTANCE.getOperation_InputName();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__INPUT_TYPE = eINSTANCE.getOperation_InputType();

    /**
     * The meta object literal for the '<em><b>Output Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OUTPUT_NAME = eINSTANCE.getOperation_OutputName();

    /**
     * The meta object literal for the '<em><b>Output Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__OUTPUT_TYPE = eINSTANCE.getOperation_OutputType();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.RESTServiceImpl <em>REST Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.RESTServiceImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getRESTService()
     * @generated
     */
    EClass REST_SERVICE = eINSTANCE.getRESTService();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.NodeImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
     * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__BASE_URI = eINSTANCE.getNode_BaseURI();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__SERVICES = eINSTANCE.getNode_Services();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.DataElementImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getDataElement()
     * @generated
     */
    EClass DATA_ELEMENT = eINSTANCE.getDataElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ELEMENT__NAME = eINSTANCE.getDataElement_Name();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ComplexElementImpl <em>Complex Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ComplexElementImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getComplexElement()
     * @generated
     */
    EClass COMPLEX_ELEMENT = eINSTANCE.getComplexElement();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_ELEMENT__ELEMENTS = eINSTANCE.getComplexElement_Elements();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.SimpleElementImpl <em>Simple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.SimpleElementImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getSimpleElement()
     * @generated
     */
    EClass SIMPLE_ELEMENT = eINSTANCE.getSimpleElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_ELEMENT__TYPE = eINSTANCE.getSimpleElement_Type();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_ELEMENT__REF = eINSTANCE.getSimpleElement_Ref();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_ELEMENT__MULTIPLICITY = eINSTANCE.getSimpleElement_Multiplicity();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ImportImpl
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE <em>DATATYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE
     * @see at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDslPackageImpl#getDATATYPE()
     * @generated
     */
    EEnum DATATYPE = eINSTANCE.getDATATYPE();

  }

} //ServiceDslPackage
