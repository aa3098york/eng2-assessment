/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.MultiOfferRule;
import uk.ac.york.cs.eng2.offers.OffersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiOfferRuleTest extends OfferRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiOfferRuleTest.class);
	}

	/**
	 * Constructs a new Multi Offer Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOfferRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Offer Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiOfferRule getFixture() {
		return (MultiOfferRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createMultiOfferRule());
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

} //MultiOfferRuleTest
