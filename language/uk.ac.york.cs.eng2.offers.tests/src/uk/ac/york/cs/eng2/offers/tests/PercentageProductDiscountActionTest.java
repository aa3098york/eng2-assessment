/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Percentage Product Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PercentageProductDiscountActionTest extends PercentageDiscountActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PercentageProductDiscountActionTest.class);
	}

	/**
	 * Constructs a new Percentage Product Discount Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageProductDiscountActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Percentage Product Discount Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PercentageProductDiscountAction getFixture() {
		return (PercentageProductDiscountAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createPercentageProductDiscountAction());
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

} //PercentageProductDiscountActionTest
