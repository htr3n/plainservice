/**
 * <copyright>
 * </copyright>
 *
 */
package at.ac.univie.cs.swa.soa.serviceDsl.impl;

import at.ac.univie.cs.swa.soa.serviceDsl.DataElement;
import at.ac.univie.cs.swa.soa.serviceDsl.Import;
import at.ac.univie.cs.swa.soa.serviceDsl.Node;
import at.ac.univie.cs.swa.soa.serviceDsl.Service;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl#getServices <em>Services</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl#getData <em>Data</em>}</li>
 *   <li>{@link at.ac.univie.cs.swa.soa.serviceDsl.impl.ServiceDSLImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDSLImpl extends MinimalEObjectImpl.Container implements ServiceDSL
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<Service> services;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EList<DataElement> data;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceDSLImpl()
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
    return ServiceDslPackage.Literals.SERVICE_DSL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServiceDslPackage.SERVICE_DSL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, ServiceDslPackage.SERVICE_DSL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getServices()
  {
    if (services == null)
    {
      services = new EObjectContainmentEList<Service>(Service.class, this, ServiceDslPackage.SERVICE_DSL__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataElement> getData()
  {
    if (data == null)
    {
      data = new EObjectContainmentEList<DataElement>(DataElement.class, this, ServiceDslPackage.SERVICE_DSL__DATA);
    }
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, ServiceDslPackage.SERVICE_DSL__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServiceDslPackage.SERVICE_DSL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ServiceDslPackage.SERVICE_DSL__SERVICES:
        return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
      case ServiceDslPackage.SERVICE_DSL__DATA:
        return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
      case ServiceDslPackage.SERVICE_DSL__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ServiceDslPackage.SERVICE_DSL__NAME:
        return getName();
      case ServiceDslPackage.SERVICE_DSL__IMPORTS:
        return getImports();
      case ServiceDslPackage.SERVICE_DSL__SERVICES:
        return getServices();
      case ServiceDslPackage.SERVICE_DSL__DATA:
        return getData();
      case ServiceDslPackage.SERVICE_DSL__NODES:
        return getNodes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServiceDslPackage.SERVICE_DSL__NAME:
        setName((String)newValue);
        return;
      case ServiceDslPackage.SERVICE_DSL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ServiceDslPackage.SERVICE_DSL__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends Service>)newValue);
        return;
      case ServiceDslPackage.SERVICE_DSL__DATA:
        getData().clear();
        getData().addAll((Collection<? extends DataElement>)newValue);
        return;
      case ServiceDslPackage.SERVICE_DSL__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
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
      case ServiceDslPackage.SERVICE_DSL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ServiceDslPackage.SERVICE_DSL__IMPORTS:
        getImports().clear();
        return;
      case ServiceDslPackage.SERVICE_DSL__SERVICES:
        getServices().clear();
        return;
      case ServiceDslPackage.SERVICE_DSL__DATA:
        getData().clear();
        return;
      case ServiceDslPackage.SERVICE_DSL__NODES:
        getNodes().clear();
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
      case ServiceDslPackage.SERVICE_DSL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ServiceDslPackage.SERVICE_DSL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ServiceDslPackage.SERVICE_DSL__SERVICES:
        return services != null && !services.isEmpty();
      case ServiceDslPackage.SERVICE_DSL__DATA:
        return data != null && !data.isEmpty();
      case ServiceDslPackage.SERVICE_DSL__NODES:
        return nodes != null && !nodes.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ServiceDSLImpl
