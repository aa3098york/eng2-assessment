/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.SetFixedPriceAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Fixed Price Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetFixedPriceActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetFixedPriceActionTest.class);
	}

	/**
	 * Constructs a new Set Fixed Price Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetFixedPriceActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Set Fixed Price Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SetFixedPriceAction getFixture() {
		return (SetFixedPriceAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createSetFixedPriceAction());
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

} //SetFixedPriceActionTest
