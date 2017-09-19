/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ppd.ppd.Paper#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.ppd.ppd.Paper#isFolding <em>Folding</em>}</li>
 * </ul>
 *
 * @see org.xtext.ppd.ppd.PpdPackage#getPaper()
 * @model
 * @generated
 */
public interface Paper extends EObject
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(int)
   * @see org.xtext.ppd.ppd.PpdPackage#getPaper_Width()
   * @model
   * @generated
   */
  int getWidth();

  /**
   * Sets the value of the '{@link org.xtext.ppd.ppd.Paper#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(int value);

  /**
   * Returns the value of the '<em><b>Folding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Folding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Folding</em>' attribute.
   * @see #setFolding(boolean)
   * @see org.xtext.ppd.ppd.PpdPackage#getPaper_Folding()
   * @model
   * @generated
   */
  boolean isFolding();

  /**
   * Sets the value of the '{@link org.xtext.ppd.ppd.Paper#isFolding <em>Folding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Folding</em>' attribute.
   * @see #isFolding()
   * @generated
   */
  void setFolding(boolean value);

} // Paper
