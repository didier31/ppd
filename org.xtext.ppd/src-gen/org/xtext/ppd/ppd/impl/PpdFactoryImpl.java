/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.ppd.ppd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PpdFactoryImpl extends EFactoryImpl implements PpdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PpdFactory init()
  {
    try
    {
      PpdFactory thePpdFactory = (PpdFactory)EPackage.Registry.INSTANCE.getEFactory(PpdPackage.eNS_URI);
      if (thePpdFactory != null)
      {
        return thePpdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PpdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PpdFactoryImpl()
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
      case PpdPackage.DOCUMENT: return createDocument();
      case PpdPackage.PAPER: return createPaper();
      case PpdPackage.CONTENT: return createContent();
      case PpdPackage.SIMPLE_CONTENT: return createSimpleContent();
      case PpdPackage.TEXTUAL: return createTextual();
      case PpdPackage.FRAME: return createFrame();
      case PpdPackage.VS: return createVS();
      case PpdPackage.HS: return createHS();
      case PpdPackage.LAB: return createLAB();
      case PpdPackage.GB: return createGB();
      case PpdPackage.RJB: return createRJB();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paper createPaper()
  {
    PaperImpl paper = new PaperImpl();
    return paper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleContent createSimpleContent()
  {
    SimpleContentImpl simpleContent = new SimpleContentImpl();
    return simpleContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Textual createTextual()
  {
    TextualImpl textual = new TextualImpl();
    return textual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Frame createFrame()
  {
    FrameImpl frame = new FrameImpl();
    return frame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VS createVS()
  {
    VSImpl vs = new VSImpl();
    return vs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HS createHS()
  {
    HSImpl hs = new HSImpl();
    return hs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LAB createLAB()
  {
    LABImpl lab = new LABImpl();
    return lab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GB createGB()
  {
    GBImpl gb = new GBImpl();
    return gb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RJB createRJB()
  {
    RJBImpl rjb = new RJBImpl();
    return rjb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PpdPackage getPpdPackage()
  {
    return (PpdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PpdPackage getPackage()
  {
    return PpdPackage.eINSTANCE;
  }

} //PpdFactoryImpl