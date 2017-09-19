/**
 */
package org.xtext.ppd.ppd.tests;

import junit.textui.TestRunner;

import org.xtext.ppd.ppd.PpdFactory;
import org.xtext.ppd.ppd.RJB;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RJB</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RJBTest extends FrameTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RJBTest.class);
	}

	/**
	 * Constructs a new RJB test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RJBTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RJB test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RJB getFixture() {
		return (RJB)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PpdFactory.eINSTANCE.createRJB());
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

} //RJBTest
