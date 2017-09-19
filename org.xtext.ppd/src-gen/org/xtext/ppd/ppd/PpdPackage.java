/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd.ppd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.ppd.ppd.PpdFactory
 * @model kind="package"
 * @generated
 */
public interface PpdPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ppd";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/ppd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ppd";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PpdPackage eINSTANCE = org.xtext.ppd.ppd.impl.PpdPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.DocumentImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Paper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__PAPER = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__CONTENTS = 1;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.PaperImpl <em>Paper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.PaperImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getPaper()
   * @generated
   */
  int PAPER = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAPER__WIDTH = 0;

  /**
   * The feature id for the '<em><b>Folding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAPER__FOLDING = 1;

  /**
   * The number of structural features of the '<em>Paper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAPER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.ContentImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 2;

  /**
   * The feature id for the '<em><b>Vs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__VS = 0;

  /**
   * The feature id for the '<em><b>Hs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__HS = 1;

  /**
   * The feature id for the '<em><b>Simple Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__SIMPLE_CONTENT = 2;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.SimpleContentImpl <em>Simple Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.SimpleContentImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getSimpleContent()
   * @generated
   */
  int SIMPLE_CONTENT = 3;

  /**
   * The number of structural features of the '<em>Simple Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CONTENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.TextualImpl <em>Textual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.TextualImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getTextual()
   * @generated
   */
  int TEXTUAL = 4;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTUAL__TEXT = SIMPLE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Textual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTUAL_FEATURE_COUNT = SIMPLE_CONTENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.FrameImpl <em>Frame</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.FrameImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getFrame()
   * @generated
   */
  int FRAME = 5;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME__CONTENTS = SIMPLE_CONTENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Frame</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_FEATURE_COUNT = SIMPLE_CONTENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.VSImpl <em>VS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.VSImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getVS()
   * @generated
   */
  int VS = 6;

  /**
   * The feature id for the '<em><b>Spc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VS__SPC = 0;

  /**
   * The feature id for the '<em><b>More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VS__MORE = 1;

  /**
   * The number of structural features of the '<em>VS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.HSImpl <em>HS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.HSImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getHS()
   * @generated
   */
  int HS = 7;

  /**
   * The feature id for the '<em><b>Spc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HS__SPC = 0;

  /**
   * The feature id for the '<em><b>More</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HS__MORE = 1;

  /**
   * The number of structural features of the '<em>HS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.LABImpl <em>LAB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.LABImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getLAB()
   * @generated
   */
  int LAB = 8;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAB__CONTENTS = FRAME__CONTENTS;

  /**
   * The number of structural features of the '<em>LAB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAB_FEATURE_COUNT = FRAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.GBImpl <em>GB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.GBImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getGB()
   * @generated
   */
  int GB = 9;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GB__CONTENTS = FRAME__CONTENTS;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GB__COLUMNS = FRAME_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GB_FEATURE_COUNT = FRAME_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ppd.ppd.impl.RJBImpl <em>RJB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ppd.ppd.impl.RJBImpl
   * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getRJB()
   * @generated
   */
  int RJB = 10;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RJB__CONTENTS = FRAME__CONTENTS;

  /**
   * The number of structural features of the '<em>RJB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RJB_FEATURE_COUNT = FRAME_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see org.xtext.ppd.ppd.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ppd.ppd.Document#getPaper <em>Paper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paper</em>'.
   * @see org.xtext.ppd.ppd.Document#getPaper()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Paper();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ppd.ppd.Document#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.xtext.ppd.ppd.Document#getContents()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Contents();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.Paper <em>Paper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paper</em>'.
   * @see org.xtext.ppd.ppd.Paper
   * @generated
   */
  EClass getPaper();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.Paper#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.ppd.ppd.Paper#getWidth()
   * @see #getPaper()
   * @generated
   */
  EAttribute getPaper_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.Paper#isFolding <em>Folding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Folding</em>'.
   * @see org.xtext.ppd.ppd.Paper#isFolding()
   * @see #getPaper()
   * @generated
   */
  EAttribute getPaper_Folding();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see org.xtext.ppd.ppd.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ppd.ppd.Content#getVs <em>Vs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vs</em>'.
   * @see org.xtext.ppd.ppd.Content#getVs()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Vs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ppd.ppd.Content#getHs <em>Hs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hs</em>'.
   * @see org.xtext.ppd.ppd.Content#getHs()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Hs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ppd.ppd.Content#getSimpleContent <em>Simple Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Content</em>'.
   * @see org.xtext.ppd.ppd.Content#getSimpleContent()
   * @see #getContent()
   * @generated
   */
  EReference getContent_SimpleContent();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.SimpleContent <em>Simple Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Content</em>'.
   * @see org.xtext.ppd.ppd.SimpleContent
   * @generated
   */
  EClass getSimpleContent();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.Textual <em>Textual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textual</em>'.
   * @see org.xtext.ppd.ppd.Textual
   * @generated
   */
  EClass getTextual();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.Textual#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.xtext.ppd.ppd.Textual#getText()
   * @see #getTextual()
   * @generated
   */
  EAttribute getTextual_Text();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.Frame <em>Frame</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frame</em>'.
   * @see org.xtext.ppd.ppd.Frame
   * @generated
   */
  EClass getFrame();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ppd.ppd.Frame#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contents</em>'.
   * @see org.xtext.ppd.ppd.Frame#getContents()
   * @see #getFrame()
   * @generated
   */
  EReference getFrame_Contents();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.VS <em>VS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VS</em>'.
   * @see org.xtext.ppd.ppd.VS
   * @generated
   */
  EClass getVS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.VS#getSpc <em>Spc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spc</em>'.
   * @see org.xtext.ppd.ppd.VS#getSpc()
   * @see #getVS()
   * @generated
   */
  EAttribute getVS_Spc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.VS#isMore <em>More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>More</em>'.
   * @see org.xtext.ppd.ppd.VS#isMore()
   * @see #getVS()
   * @generated
   */
  EAttribute getVS_More();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.HS <em>HS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HS</em>'.
   * @see org.xtext.ppd.ppd.HS
   * @generated
   */
  EClass getHS();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.HS#getSpc <em>Spc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spc</em>'.
   * @see org.xtext.ppd.ppd.HS#getSpc()
   * @see #getHS()
   * @generated
   */
  EAttribute getHS_Spc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.HS#isMore <em>More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>More</em>'.
   * @see org.xtext.ppd.ppd.HS#isMore()
   * @see #getHS()
   * @generated
   */
  EAttribute getHS_More();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.LAB <em>LAB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LAB</em>'.
   * @see org.xtext.ppd.ppd.LAB
   * @generated
   */
  EClass getLAB();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.GB <em>GB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GB</em>'.
   * @see org.xtext.ppd.ppd.GB
   * @generated
   */
  EClass getGB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ppd.ppd.GB#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see org.xtext.ppd.ppd.GB#getColumns()
   * @see #getGB()
   * @generated
   */
  EAttribute getGB_Columns();

  /**
   * Returns the meta object for class '{@link org.xtext.ppd.ppd.RJB <em>RJB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RJB</em>'.
   * @see org.xtext.ppd.ppd.RJB
   * @generated
   */
  EClass getRJB();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PpdFactory getPpdFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.DocumentImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Paper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__PAPER = eINSTANCE.getDocument_Paper();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__CONTENTS = eINSTANCE.getDocument_Contents();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.PaperImpl <em>Paper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.PaperImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getPaper()
     * @generated
     */
    EClass PAPER = eINSTANCE.getPaper();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAPER__WIDTH = eINSTANCE.getPaper_Width();

    /**
     * The meta object literal for the '<em><b>Folding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAPER__FOLDING = eINSTANCE.getPaper_Folding();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.ContentImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Vs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__VS = eINSTANCE.getContent_Vs();

    /**
     * The meta object literal for the '<em><b>Hs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__HS = eINSTANCE.getContent_Hs();

    /**
     * The meta object literal for the '<em><b>Simple Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__SIMPLE_CONTENT = eINSTANCE.getContent_SimpleContent();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.SimpleContentImpl <em>Simple Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.SimpleContentImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getSimpleContent()
     * @generated
     */
    EClass SIMPLE_CONTENT = eINSTANCE.getSimpleContent();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.TextualImpl <em>Textual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.TextualImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getTextual()
     * @generated
     */
    EClass TEXTUAL = eINSTANCE.getTextual();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTUAL__TEXT = eINSTANCE.getTextual_Text();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.FrameImpl <em>Frame</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.FrameImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getFrame()
     * @generated
     */
    EClass FRAME = eINSTANCE.getFrame();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME__CONTENTS = eINSTANCE.getFrame_Contents();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.VSImpl <em>VS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.VSImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getVS()
     * @generated
     */
    EClass VS = eINSTANCE.getVS();

    /**
     * The meta object literal for the '<em><b>Spc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VS__SPC = eINSTANCE.getVS_Spc();

    /**
     * The meta object literal for the '<em><b>More</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VS__MORE = eINSTANCE.getVS_More();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.HSImpl <em>HS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.HSImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getHS()
     * @generated
     */
    EClass HS = eINSTANCE.getHS();

    /**
     * The meta object literal for the '<em><b>Spc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HS__SPC = eINSTANCE.getHS_Spc();

    /**
     * The meta object literal for the '<em><b>More</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HS__MORE = eINSTANCE.getHS_More();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.LABImpl <em>LAB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.LABImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getLAB()
     * @generated
     */
    EClass LAB = eINSTANCE.getLAB();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.GBImpl <em>GB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.GBImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getGB()
     * @generated
     */
    EClass GB = eINSTANCE.getGB();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GB__COLUMNS = eINSTANCE.getGB_Columns();

    /**
     * The meta object literal for the '{@link org.xtext.ppd.ppd.impl.RJBImpl <em>RJB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ppd.ppd.impl.RJBImpl
     * @see org.xtext.ppd.ppd.impl.PpdPackageImpl#getRJB()
     * @generated
     */
    EClass RJB = eINSTANCE.getRJB();

  }

} //PpdPackage