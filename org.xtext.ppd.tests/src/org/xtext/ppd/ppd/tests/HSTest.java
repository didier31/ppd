/**
 */
package org.xtext.ppd.ppd.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.HS;
import org.xtext.ppd.ppd.PpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HS</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HSTest extends TestCase {

	/**
	 * The fixture for this HS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HS fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HSTest.class);
	}

	/**
	 * Constructs a new HS test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this HS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HS fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this HS test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HS getFixture() {
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
		setFixture(PpdFactory.eINSTANCE.createHS());
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

} //HSTest
