/**
 */
package at.ac.univie.cs.swa.soa.sdl;

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
 * @see at.ac.univie.cs.swa.soa.sdl.SdlFactory
 * @model kind="package"
 * @generated
 */
public interface SdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://cs.univie.ac.at/swa/plainservice/sdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SdlPackage eINSTANCE = at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.SDLImpl <em>SDL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SDLImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getSDL()
   * @generated
   */
  int SDL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL__SERVICES = 2;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL__DATA = 3;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL__NODES = 4;

  /**
   * The number of structural features of the '<em>SDL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.ServiceImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getService()
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
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__OPERATIONS = 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.NodeImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getNode()
   * @generated
   */
  int NODE = 3;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.DataElementImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 4;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ComplexElementImpl <em>Complex Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.ComplexElementImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getComplexElement()
   * @generated
   */
  int COMPLEX_ELEMENT = 5;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.SimpleElementImpl <em>Simple Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SimpleElementImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getSimpleElement()
   * @generated
   */
  int SIMPLE_ELEMENT = 6;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.impl.ImportImpl
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 7;

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
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.DATATYPE <em>DATATYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.DATATYPE
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getDATATYPE()
   * @generated
   */
  int DATATYPE = 8;

  /**
   * The meta object id for the '{@link at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY <em>MULTIPLICITY</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY
   * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getMULTIPLICITY()
   * @generated
   */
  int MULTIPLICITY = 9;


  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.SDL <em>SDL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SDL</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL
   * @generated
   */
  EClass getSDL();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.SDL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL#getName()
   * @see #getSDL()
   * @generated
   */
  EAttribute getSDL_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.SDL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL#getImports()
   * @see #getSDL()
   * @generated
   */
  EReference getSDL_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.SDL#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL#getServices()
   * @see #getSDL()
   * @generated
   */
  EReference getSDL_Services();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.SDL#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL#getData()
   * @see #getSDL()
   * @generated
   */
  EReference getSDL_Data();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.SDL#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SDL#getNodes()
   * @see #getSDL()
   * @generated
   */
  EReference getSDL_Nodes();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Service#getName()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.Service#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Service#getOperations()
   * @see #getService()
   * @generated
   */
  EReference getService_Operations();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputName <em>Input Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation#getInputName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_InputName();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input Type</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation#getInputType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_InputType();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputName <em>Output Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation#getOutputName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_OutputName();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.sdl.Operation#getOutputType <em>Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output Type</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Operation#getOutputType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_OutputType();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Node#getBaseURI <em>Base URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base URI</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Node#getBaseURI()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_BaseURI();

  /**
   * Returns the meta object for the reference list '{@link at.ac.univie.cs.swa.soa.sdl.Node#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Services</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Node#getServices()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Services();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Element</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.DataElement
   * @generated
   */
  EClass getDataElement();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.DataElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.DataElement#getName()
   * @see #getDataElement()
   * @generated
   */
  EAttribute getDataElement_Name();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.ComplexElement <em>Complex Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Element</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.ComplexElement
   * @generated
   */
  EClass getComplexElement();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.univie.cs.swa.soa.sdl.ComplexElement#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.ComplexElement#getElements()
   * @see #getComplexElement()
   * @generated
   */
  EReference getComplexElement_Elements();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement <em>Simple Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Element</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SimpleElement
   * @generated
   */
  EClass getSimpleElement();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SimpleElement#getType()
   * @see #getSimpleElement()
   * @generated
   */
  EAttribute getSimpleElement_Type();

  /**
   * Returns the meta object for the reference '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SimpleElement#getRef()
   * @see #getSimpleElement()
   * @generated
   */
  EReference getSimpleElement_Ref();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.SimpleElement#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.SimpleElement#getMultiplicity()
   * @see #getSimpleElement()
   * @generated
   */
  EAttribute getSimpleElement_Multiplicity();

  /**
   * Returns the meta object for class '{@link at.ac.univie.cs.swa.soa.sdl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.ac.univie.cs.swa.soa.sdl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.cs.swa.soa.sdl.DATATYPE <em>DATATYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DATATYPE</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.DATATYPE
   * @generated
   */
  EEnum getDATATYPE();

  /**
   * Returns the meta object for enum '{@link at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY <em>MULTIPLICITY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MULTIPLICITY</em>'.
   * @see at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY
   * @generated
   */
  EEnum getMULTIPLICITY();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SdlFactory getSdlFactory();

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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.SDLImpl <em>SDL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SDLImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getSDL()
     * @generated
     */
    EClass SDL = eINSTANCE.getSDL();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SDL__NAME = eINSTANCE.getSDL_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDL__IMPORTS = eINSTANCE.getSDL_Imports();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDL__SERVICES = eINSTANCE.getSDL_Services();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDL__DATA = eINSTANCE.getSDL_Data();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDL__NODES = eINSTANCE.getSDL_Nodes();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.ServiceImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getService()
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
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__OPERATIONS = eINSTANCE.getService_Operations();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getOperation()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.NodeImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getNode()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.DataElementImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getDataElement()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ComplexElementImpl <em>Complex Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.ComplexElementImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getComplexElement()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.SimpleElementImpl <em>Simple Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SimpleElementImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getSimpleElement()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.impl.ImportImpl
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getImport()
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
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.DATATYPE <em>DATATYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.DATATYPE
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getDATATYPE()
     * @generated
     */
    EEnum DATATYPE = eINSTANCE.getDATATYPE();

    /**
     * The meta object literal for the '{@link at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY <em>MULTIPLICITY</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY
     * @see at.ac.univie.cs.swa.soa.sdl.impl.SdlPackageImpl#getMULTIPLICITY()
     * @generated
     */
    EEnum MULTIPLICITY = eINSTANCE.getMULTIPLICITY();

  }

} //SdlPackage
