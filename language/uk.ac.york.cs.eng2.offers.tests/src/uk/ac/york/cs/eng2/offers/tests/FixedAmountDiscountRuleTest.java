/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.FixedAmountDiscountRule;
import uk.ac.york.cs.eng2.offers.OffersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Amount Discount Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedAmountDiscountRuleTest extends OfferRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixedAmountDiscountRuleTest.class);
	}

	/**
	 * Constructs a new Fixed Amount Discount Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAmountDiscountRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixed Amount Discount Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FixedAmountDiscountRule getFixture() {
		return (FixedAmountDiscountRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createFixedAmountDiscountRule());
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

} //FixedAmountDiscountRuleTest
