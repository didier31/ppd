/**
 */
package org.xtext.ppd.ppd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.xtext.ppd.ppd.PpdFactory;
import org.xtext.ppd.ppd.Textual;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualTest extends TestCase {

	/**
	 * The fixture for this Textual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Textual fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextualTest.class);
	}

	/**
	 * Constructs a new Textual test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Textual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Textual fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Textual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Textual getFixture() {
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
		setFixture(PpdFactory.eINSTANCE.createTextual());
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

} //TextualTest
