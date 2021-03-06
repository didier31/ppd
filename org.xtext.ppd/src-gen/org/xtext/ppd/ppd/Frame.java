/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ppd.ppd.Frame#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.xtext.ppd.ppd.PpdPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends SimpleContent
{
  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ppd.ppd.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference list.
   * @see org.xtext.ppd.ppd.PpdPackage#getFrame_Contents()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContents();

} // Frame
