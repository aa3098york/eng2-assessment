/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OrderItems;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Order Items</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderItemsTest extends TestCase {

	/**
	 * The fixture for this Order Items test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItems fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderItemsTest.class);
	}

	/**
	 * Constructs a new Order Items test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Order Items test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrderItems fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Order Items test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItems getFixture() {
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
		setFixture(OffersFactory.eINSTANCE.createOrderItems());
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

} //OrderItemsTest
