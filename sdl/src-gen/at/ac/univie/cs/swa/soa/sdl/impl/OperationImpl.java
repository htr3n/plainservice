/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.sdl.impl;

import at.ac.univie.cs.swa.soa.sdl.DataElement;
import at.ac.univie.cs.swa.soa.sdl.Operation;
import at.ac.univie.cs.swa.soa.sdl.SdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.sdl.impl.OperationImpl#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputName()
   * @generated
   * @ordered
   */
  protected static final String INPUT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputName()
   * @generated
   * @ordered
   */
  protected String inputName = INPUT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected DataElement inputType;

  /**
   * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputName()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputName()
   * @generated
   * @ordered
   */
  protected String outputName = OUTPUT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputType()
   * @generated
   * @ordered
   */
  protected DataElement outputType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SdlPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdlPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputName()
  {
    return inputName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputName(String newInputName)
  {
    String oldInputName = inputName;
    inputName = newInputName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdlPackage.OPERATION__INPUT_NAME, oldInputName, inputName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement getInputType()
  {
    if (inputType != null && inputType.eIsProxy())
    {
      InternalEObject oldInputType = (InternalEObject)inputType;
      inputType = (DataElement)eResolveProxy(oldInputType);
      if (inputType != oldInputType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SdlPackage.OPERATION__INPUT_TYPE, oldInputType, inputType));
      }
    }
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement basicGetInputType()
  {
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputType(DataElement newInputType)
  {
    DataElement oldInputType = inputType;
    inputType = newInputType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdlPackage.OPERATION__INPUT_TYPE, oldInputType, inputType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputName()
  {
    return outputName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputName(String newOutputName)
  {
    String oldOutputName = outputName;
    outputName = newOutputName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdlPackage.OPERATION__OUTPUT_NAME, oldOutputName, outputName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement getOutputType()
  {
    if (outputType != null && outputType.eIsProxy())
    {
      InternalEObject oldOutputType = (InternalEObject)outputType;
      outputType = (DataElement)eResolveProxy(oldOutputType);
      if (outputType != oldOutputType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SdlPackage.OPERATION__OUTPUT_TYPE, oldOutputType, outputType));
      }
    }
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement basicGetOutputType()
  {
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputType(DataElement newOutputType)
  {
    DataElement oldOutputType = outputType;
    outputType = newOutputType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SdlPackage.OPERATION__OUTPUT_TYPE, oldOutputType, outputType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SdlPackage.OPERATION__NAME:
        return getName();
      case SdlPackage.OPERATION__INPUT_NAME:
        return getInputName();
      case SdlPackage.OPERATION__INPUT_TYPE:
        if (resolve) return getInputType();
        return basicGetInputType();
      case SdlPackage.OPERATION__OUTPUT_NAME:
        return getOutputName();
      case SdlPackage.OPERATION__OUTPUT_TYPE:
        if (resolve) return getOutputType();
        return basicGetOutputType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SdlPackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case SdlPackage.OPERATION__INPUT_NAME:
        setInputName((String)newValue);
        return;
      case SdlPackage.OPERATION__INPUT_TYPE:
        setInputType((DataElement)newValue);
        return;
      case SdlPackage.OPERATION__OUTPUT_NAME:
        setOutputName((String)newValue);
        return;
      case SdlPackage.OPERATION__OUTPUT_TYPE:
        setOutputType((DataElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SdlPackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SdlPackage.OPERATION__INPUT_NAME:
        setInputName(INPUT_NAME_EDEFAULT);
        return;
      case SdlPackage.OPERATION__INPUT_TYPE:
        setInputType((DataElement)null);
        return;
      case SdlPackage.OPERATION__OUTPUT_NAME:
        setOutputName(OUTPUT_NAME_EDEFAULT);
        return;
      case SdlPackage.OPERATION__OUTPUT_TYPE:
        setOutputType((DataElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SdlPackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SdlPackage.OPERATION__INPUT_NAME:
        return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals(inputName);
      case SdlPackage.OPERATION__INPUT_TYPE:
        return inputType != null;
      case SdlPackage.OPERATION__OUTPUT_NAME:
        return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
      case SdlPackage.OPERATION__OUTPUT_TYPE:
        return outputType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", inputName: ");
    result.append(inputName);
    result.append(", outputName: ");
    result.append(outputName);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
