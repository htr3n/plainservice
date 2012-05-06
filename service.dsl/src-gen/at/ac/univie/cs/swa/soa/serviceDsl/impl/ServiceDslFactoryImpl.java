/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl.impl;

import at.ac.univie.cs.swa.soa.serviceDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDslFactoryImpl extends EFactoryImpl implements ServiceDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceDslFactory init()
  {
    try
    {
      ServiceDslFactory theServiceDslFactory = (ServiceDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://cs.univie.ac.at/swa/soa/ServiceDsl"); 
      if (theServiceDslFactory != null)
      {
        return theServiceDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServiceDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ServiceDslPackage.SERVICE_DSL: return createServiceDSL();
      case ServiceDslPackage.SERVICE: return createService();
      case ServiceDslPackage.WEB_SERVICE: return createWebService();
      case ServiceDslPackage.OPERATION: return createOperation();
      case ServiceDslPackage.REST_SERVICE: return createRESTService();
      case ServiceDslPackage.NODE: return createNode();
      case ServiceDslPackage.DATA_ELEMENT: return createDataElement();
      case ServiceDslPackage.COMPLEX_ELEMENT: return createComplexElement();
      case ServiceDslPackage.SIMPLE_ELEMENT: return createSimpleElement();
      case ServiceDslPackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ServiceDslPackage.DATATYPE:
        return createDATATYPEFromString(eDataType, initialValue);
      case ServiceDslPackage.MULTIPLICITY:
        return createMULTIPLICITYFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ServiceDslPackage.DATATYPE:
        return convertDATATYPEToString(eDataType, instanceValue);
      case ServiceDslPackage.MULTIPLICITY:
        return convertMULTIPLICITYToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDSL createServiceDSL()
  {
    ServiceDSLImpl serviceDSL = new ServiceDSLImpl();
    return serviceDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebService createWebService()
  {
    WebServiceImpl webService = new WebServiceImpl();
    return webService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RESTService createRESTService()
  {
    RESTServiceImpl restService = new RESTServiceImpl();
    return restService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement createDataElement()
  {
    DataElementImpl dataElement = new DataElementImpl();
    return dataElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexElement createComplexElement()
  {
    ComplexElementImpl complexElement = new ComplexElementImpl();
    return complexElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleElement createSimpleElement()
  {
    SimpleElementImpl simpleElement = new SimpleElementImpl();
    return simpleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATATYPE createDATATYPEFromString(EDataType eDataType, String initialValue)
  {
    DATATYPE result = DATATYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDATATYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLICITY createMULTIPLICITYFromString(EDataType eDataType, String initialValue)
  {
    MULTIPLICITY result = MULTIPLICITY.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMULTIPLICITYToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceDslPackage getServiceDslPackage()
  {
    return (ServiceDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServiceDslPackage getPackage()
  {
    return ServiceDslPackage.eINSTANCE;
  }

} //ServiceDslFactoryImpl
