/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.SingleOfferRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleOfferRuleTest extends OfferRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleOfferRuleTest.class);
	}

	/**
	 * Constructs a new Single Offer Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOfferRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Offer Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleOfferRule getFixture() {
		return (SingleOfferRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createSingleOfferRule());
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

} //SingleOfferRuleTest
