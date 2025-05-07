/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.PercentageDiscountRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Percentage Discount Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PercentageDiscountRuleTest extends OfferRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PercentageDiscountRuleTest.class);
	}

	/**
	 * Constructs a new Percentage Discount Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageDiscountRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Percentage Discount Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PercentageDiscountRule getFixture() {
		return (PercentageDiscountRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createPercentageDiscountRule());
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

} //PercentageDiscountRuleTest
