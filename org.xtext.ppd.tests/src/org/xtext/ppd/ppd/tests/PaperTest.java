/**
 */
package org.xtext.ppd.ppd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.Paper;
import org.xtext.ppd.ppd.PpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaperTest extends TestCase {

	/**
	 * The fixture for this Paper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paper fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PaperTest.class);
	}

	/**
	 * Constructs a new Paper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaperTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Paper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Paper fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Paper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Paper getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PpdFactory.eINSTANCE.createPaper());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PaperTest
