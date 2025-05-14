/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.FreeItemAction;
import uk.ac.york.cs.eng2.offers.OffersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Free Item Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreeItemActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FreeItemActionTest.class);
	}

	/**
	 * Constructs a new Free Item Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeItemActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Free Item Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FreeItemAction getFixture() {
		return (FreeItemAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createFreeItemAction());
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

} //FreeItemActionTest
