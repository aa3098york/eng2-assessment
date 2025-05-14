/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction;
import uk.ac.york.cs.eng2.offers.OffersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Amount Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedAmountDiscountActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixedAmountDiscountActionTest.class);
	}

	/**
	 * Constructs a new Fixed Amount Discount Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAmountDiscountActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixed Amount Discount Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FixedAmountDiscountAction getFixture() {
		return (FixedAmountDiscountAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createFixedAmountDiscountAction());
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

} //FixedAmountDiscountActionTest
