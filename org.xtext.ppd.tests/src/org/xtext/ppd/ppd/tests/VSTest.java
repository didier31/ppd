/**
 */
package org.xtext.ppd.ppd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.PpdFactory;
import org.xtext.ppd.ppd.VS;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>VS</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VSTest extends TestCase {

	/**
	 * The fixture for this VS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VS fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VSTest.class);
	}

	/**
	 * Constructs a new VS test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this VS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VS fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this VS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VS getFixture() {
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
		setFixture(PpdFactory.eINSTANCE.createVS());
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

} //VSTest
