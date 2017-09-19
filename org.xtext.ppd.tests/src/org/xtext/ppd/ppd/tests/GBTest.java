/**
 */
package org.xtext.ppd.ppd.tests;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.GB;
import org.xtext.ppd.ppd.PpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GBTest extends FrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GBTest.class);
	}

	/**
	 * Constructs a new GB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GB getFixture() {
		return (GB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PpdFactory.eINSTANCE.createGB());
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

} //GBTest
