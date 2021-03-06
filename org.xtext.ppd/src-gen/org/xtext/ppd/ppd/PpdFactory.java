/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.ppd.ppd.PpdPackage
 * @generated
 */
public interface PpdFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PpdFactory eINSTANCE = org.xtext.ppd.ppd.impl.PpdFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Paper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paper</em>'.
   * @generated
   */
  Paper createPaper();

  /**
   * Returns a new object of class '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content</em>'.
   * @generated
   */
  Content createContent();

  /**
   * Returns a new object of class '<em>Simple Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Content</em>'.
   * @generated
   */
  SimpleContent createSimpleContent();

  /**
   * Returns a new object of class '<em>Textual</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Textual</em>'.
   * @generated
   */
  Textual createTextual();

  /**
   * Returns a new object of class '<em>Frame</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Frame</em>'.
   * @generated
   */
  Frame createFrame();

  /**
   * Returns a new object of class '<em>VS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VS</em>'.
   * @generated
   */
  VS createVS();

  /**
   * Returns a new object of class '<em>HS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HS</em>'.
   * @generated
   */
  HS createHS();

  /**
   * Returns a new object of class '<em>LAB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LAB</em>'.
   * @generated
   */
  LAB createLAB();

  /**
   * Returns a new object of class '<em>GB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GB</em>'.
   * @generated
   */
  GB createGB();

  /**
   * Returns a new object of class '<em>RJB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RJB</em>'.
   * @generated
   */
  RJB createRJB();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PpdPackage getPpdPackage();

} //PpdFactory
