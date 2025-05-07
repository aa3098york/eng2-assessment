/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OrdersByDay;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orders By Day</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdersByDayTest extends TestCase {

	/**
	 * The fixture for this Orders By Day test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdersByDay fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrdersByDayTest.class);
	}

	/**
	 * Constructs a new Orders By Day test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersByDayTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Orders By Day test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrdersByDay fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Orders By Day test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdersByDay getFixture() {
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
		setFixture(OffersFactory.eINSTANCE.createOrdersByDay());
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

} //OrdersByDayTest
