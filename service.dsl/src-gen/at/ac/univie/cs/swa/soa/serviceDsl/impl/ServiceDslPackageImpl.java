/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl.impl;

import at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement;
import at.ac.univie.cs.swa.soa.serviceDsl.DataElement;
import at.ac.univie.cs.swa.soa.serviceDsl.Import;
import at.ac.univie.cs.swa.soa.serviceDsl.Node;
import at.ac.univie.cs.swa.soa.serviceDsl.Operation;
import at.ac.univie.cs.swa.soa.serviceDsl.RESTService;
import at.ac.univie.cs.swa.soa.serviceDsl.Service;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslFactory;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage;
import at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement;
import at.ac.univie.cs.swa.soa.serviceDsl.WebService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDslPackageImpl extends EPackageImpl implements ServiceDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceDSLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum datatypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicityEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ServiceDslPackageImpl()
  {
    super(eNS_URI, ServiceDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ServiceDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ServiceDslPackage init()
  {
    if (isInited) return (ServiceDslPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceDslPackage.eNS_URI);

    // Obtain or create and register package
    ServiceDslPackageImpl theServiceDslPackage = (ServiceDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theServiceDslPackage.createPackageContents();

    // Initialize created meta-data
    theServiceDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theServiceDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ServiceDslPackage.eNS_URI, theServiceDslPackage);
    return theServiceDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceDSL()
  {
    return serviceDSLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceDSL_Name()
  {
    return (EAttribute)serviceDSLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDSL_Imports()
  {
    return (EReference)serviceDSLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDSL_Services()
  {
    return (EReference)serviceDSLEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDSL_Data()
  {
    return (EReference)serviceDSLEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceDSL_Nodes()
  {
    return (EReference)serviceDSLEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getService_Name()
  {
    return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebService()
  {
    return webServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebService_Operations()
  {
    return (EReference)webServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_InputName()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_InputType()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_OutputName()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_OutputType()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRESTService()
  {
    return restServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_Name()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNode_BaseURI()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_Services()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataElement()
  {
    return dataElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataElement_Name()
  {
    return (EAttribute)dataElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexElement()
  {
    return complexElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexElement_Elements()
  {
    return (EReference)complexElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleElement()
  {
    return simpleElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleElement_Type()
  {
    return (EAttribute)simpleElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleElement_Ref()
  {
    return (EReference)simpleElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleElement_Multiplicity()
  {
    return (EAttribute)simpleElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDATATYPE()
  {
    return datatypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMULTIPLICITY()
  {
    return multiplicityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDslFactory getServiceDslFactory()
  {
    return (ServiceDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    serviceDSLEClass = createEClass(SERVICE_DSL);
    createEAttribute(serviceDSLEClass, SERVICE_DSL__NAME);
    createEReference(serviceDSLEClass, SERVICE_DSL__IMPORTS);
    createEReference(serviceDSLEClass, SERVICE_DSL__SERVICES);
    createEReference(serviceDSLEClass, SERVICE_DSL__DATA);
    createEReference(serviceDSLEClass, SERVICE_DSL__NODES);

    serviceEClass = createEClass(SERVICE);
    createEAttribute(serviceEClass, SERVICE__NAME);

    webServiceEClass = createEClass(WEB_SERVICE);
    createEReference(webServiceEClass, WEB_SERVICE__OPERATIONS);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEAttribute(operationEClass, OPERATION__INPUT_NAME);
    createEReference(operationEClass, OPERATION__INPUT_TYPE);
    createEAttribute(operationEClass, OPERATION__OUTPUT_NAME);
    createEReference(operationEClass, OPERATION__OUTPUT_TYPE);

    restServiceEClass = createEClass(REST_SERVICE);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NAME);
    createEAttribute(nodeEClass, NODE__BASE_URI);
    createEReference(nodeEClass, NODE__SERVICES);

    dataElementEClass = createEClass(DATA_ELEMENT);
    createEAttribute(dataElementEClass, DATA_ELEMENT__NAME);

    complexElementEClass = createEClass(COMPLEX_ELEMENT);
    createEReference(complexElementEClass, COMPLEX_ELEMENT__ELEMENTS);

    simpleElementEClass = createEClass(SIMPLE_ELEMENT);
    createEAttribute(simpleElementEClass, SIMPLE_ELEMENT__TYPE);
    createEReference(simpleElementEClass, SIMPLE_ELEMENT__REF);
    createEAttribute(simpleElementEClass, SIMPLE_ELEMENT__MULTIPLICITY);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    // Create enums
    datatypeEEnum = createEEnum(DATATYPE);
    multiplicityEEnum = createEEnum(MULTIPLICITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    webServiceEClass.getESuperTypes().add(this.getService());
    restServiceEClass.getESuperTypes().add(this.getService());
    complexElementEClass.getESuperTypes().add(this.getDataElement());
    simpleElementEClass.getESuperTypes().add(this.getDataElement());

    // Initialize classes and features; add operations and parameters
    initEClass(serviceDSLEClass, ServiceDSL.class, "ServiceDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceDSL_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDSL_Imports(), this.getImport(), null, "imports", null, 0, -1, ServiceDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDSL_Services(), this.getService(), null, "services", null, 0, -1, ServiceDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDSL_Data(), this.getDataElement(), null, "data", null, 0, -1, ServiceDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceDSL_Nodes(), this.getNode(), null, "nodes", null, 0, -1, ServiceDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(webServiceEClass, WebService.class, "WebService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWebService_Operations(), this.getOperation(), null, "operations", null, 0, -1, WebService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_InputName(), ecorePackage.getEString(), "inputName", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_InputType(), this.getDataElement(), null, "inputType", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_OutputName(), ecorePackage.getEString(), "outputName", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_OutputType(), this.getDataElement(), null, "outputType", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restServiceEClass, RESTService.class, "RESTService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_BaseURI(), ecorePackage.getEString(), "baseURI", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Services(), this.getService(), null, "services", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataElementEClass, DataElement.class, "DataElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexElementEClass, ComplexElement.class, "ComplexElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexElement_Elements(), this.getSimpleElement(), null, "elements", null, 0, -1, ComplexElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleElementEClass, SimpleElement.class, "SimpleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleElement_Type(), this.getDATATYPE(), "type", null, 0, 1, SimpleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleElement_Ref(), this.getComplexElement(), null, "ref", null, 0, 1, SimpleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleElement_Multiplicity(), this.getMULTIPLICITY(), "multiplicity", null, 0, 1, SimpleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.class, "DATATYPE");
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.STRING);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.INTEGER);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.FLOAT);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.DATE);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.TIME);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.DATETIME);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.BINARY);
    addEEnumLiteral(datatypeEEnum, at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE.BOOLEAN);

    initEEnum(multiplicityEEnum, at.ac.univie.cs.swa.soa.serviceDsl.MULTIPLICITY.class, "MULTIPLICITY");
    addEEnumLiteral(multiplicityEEnum, at.ac.univie.cs.swa.soa.serviceDsl.MULTIPLICITY.OPTIONAL);
    addEEnumLiteral(multiplicityEEnum, at.ac.univie.cs.swa.soa.serviceDsl.MULTIPLICITY.PLUS);
    addEEnumLiteral(multiplicityEEnum, at.ac.univie.cs.swa.soa.serviceDsl.MULTIPLICITY.STAR);

    // Create resource
    createResource(eNS_URI);
  }

} //ServiceDslPackageImpl
