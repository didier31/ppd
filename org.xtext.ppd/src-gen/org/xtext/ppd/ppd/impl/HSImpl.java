/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ppd.ppd.HS;
import org.xtext.ppd.ppd.PpdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ppd.ppd.impl.HSImpl#getSpc <em>Spc</em>}</li>
 *   <li>{@link org.xtext.ppd.ppd.impl.HSImpl#isMore <em>More</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HSImpl extends MinimalEObjectImpl.Container implements HS
{
  /**
   * The default value of the '{@link #getSpc() <em>Spc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpc()
   * @generated
   * @ordered
   */
  protected static final int SPC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSpc() <em>Spc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpc()
   * @generated
   * @ordered
   */
  protected int spc = SPC_EDEFAULT;

  /**
   * The default value of the '{@link #isMore() <em>More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMore()
   * @generated
   * @ordered
   */
  protected static final boolean MORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMore() <em>More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMore()
   * @generated
   * @ordered
   */
  protected boolean more = MORE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HSImpl()
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
    return PpdPackage.Literals.HS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSpc()
  {
    return spc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpc(int newSpc)
  {
    int oldSpc = spc;
    spc = newSpc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PpdPackage.HS__SPC, oldSpc, spc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMore()
  {
    return more;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMore(boolean newMore)
  {
    boolean oldMore = more;
    more = newMore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PpdPackage.HS__MORE, oldMore, more));
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
      case PpdPackage.HS__SPC:
        return getSpc();
      case PpdPackage.HS__MORE:
        return isMore();
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
      case PpdPackage.HS__SPC:
        setSpc((Integer)newValue);
        return;
      case PpdPackage.HS__MORE:
        setMore((Boolean)newValue);
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
      case PpdPackage.HS__SPC:
        setSpc(SPC_EDEFAULT);
        return;
      case PpdPackage.HS__MORE:
        setMore(MORE_EDEFAULT);
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
      case PpdPackage.HS__SPC:
        return spc != SPC_EDEFAULT;
      case PpdPackage.HS__MORE:
        return more != MORE_EDEFAULT;
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
    result.append(" (spc: ");
    result.append(spc);
    result.append(", more: ");
    result.append(more);
    result.append(')');
    return result.toString();
  }

} //HSImpl