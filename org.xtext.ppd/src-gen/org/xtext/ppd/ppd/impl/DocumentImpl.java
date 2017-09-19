/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd.impl;

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

import org.xtext.ppd.ppd.Content;
import org.xtext.ppd.ppd.Document;
import org.xtext.ppd.ppd.Paper;
import org.xtext.ppd.ppd.PpdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ppd.ppd.impl.DocumentImpl#getPaper <em>Paper</em>}</li>
 *   <li>{@link org.xtext.ppd.ppd.impl.DocumentImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document
{
  /**
   * The cached value of the '{@link #getPaper() <em>Paper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaper()
   * @generated
   * @ordered
   */
  protected Paper paper;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<Content> contents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentImpl()
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
    return PpdPackage.Literals.DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paper getPaper()
  {
    return paper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPaper(Paper newPaper, NotificationChain msgs)
  {
    Paper oldPaper = paper;
    paper = newPaper;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PpdPackage.DOCUMENT__PAPER, oldPaper, newPaper);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPaper(Paper newPaper)
  {
    if (newPaper != paper)
    {
      NotificationChain msgs = null;
      if (paper != null)
        msgs = ((InternalEObject)paper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PpdPackage.DOCUMENT__PAPER, null, msgs);
      if (newPaper != null)
        msgs = ((InternalEObject)newPaper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PpdPackage.DOCUMENT__PAPER, null, msgs);
      msgs = basicSetPaper(newPaper, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PpdPackage.DOCUMENT__PAPER, newPaper, newPaper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Content> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<Content>(Content.class, this, PpdPackage.DOCUMENT__CONTENTS);
    }
    return contents;
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
      case PpdPackage.DOCUMENT__PAPER:
        return basicSetPaper(null, msgs);
      case PpdPackage.DOCUMENT__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
      case PpdPackage.DOCUMENT__PAPER:
        return getPaper();
      case PpdPackage.DOCUMENT__CONTENTS:
        return getContents();
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
      case PpdPackage.DOCUMENT__PAPER:
        setPaper((Paper)newValue);
        return;
      case PpdPackage.DOCUMENT__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends Content>)newValue);
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
      case PpdPackage.DOCUMENT__PAPER:
        setPaper((Paper)null);
        return;
      case PpdPackage.DOCUMENT__CONTENTS:
        getContents().clear();
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
      case PpdPackage.DOCUMENT__PAPER:
        return paper != null;
      case PpdPackage.DOCUMENT__CONTENTS:
        return contents != null && !contents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DocumentImpl
