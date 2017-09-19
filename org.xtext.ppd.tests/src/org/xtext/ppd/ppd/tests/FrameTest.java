/**
 */
package org.xtext.ppd.ppd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.xtext.ppd.ppd.Frame;
import org.xtext.ppd.ppd.PpdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameTest extends TestCase {

	/**
	 * The fixture for this Frame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Frame fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FrameTest.class);
	}

	/**
	 * Constructs a new Frame test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Frame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Frame fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Frame test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Frame getFixture() {
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
		setFixture(PpdFactory.eINSTANCE.createFrame());
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

} //FrameTest
