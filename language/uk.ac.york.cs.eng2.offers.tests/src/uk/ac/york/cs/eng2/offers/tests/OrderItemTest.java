/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OrderItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderItemTest extends TestCase {

	/**
	 * The fixture for this Order Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderItemTest.class);
	}

	/**
	 * Constructs a new Order Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Order Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrderItem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Order Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItem getFixture() {
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
		setFixture(OffersFactory.eINSTANCE.createOrderItem());
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

} //OrderItemTest
