/**
 */
package org.xtext.ppd.ppd.tests;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.LAB;
import org.xtext.ppd.ppd.PpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LAB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LABTest extends FrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LABTest.class);
	}

	/**
	 * Constructs a new LAB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LABTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this LAB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LAB getFixture() {
		return (LAB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PpdFactory.eINSTANCE.createLAB());
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

} //LABTest
