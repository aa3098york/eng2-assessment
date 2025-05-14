/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.FirstNOrdersCondition;
import uk.ac.york.cs.eng2.offers.OffersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>First NOrders Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FirstNOrdersConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FirstNOrdersConditionTest.class);
	}

	/**
	 * Constructs a new First NOrders Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstNOrdersConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this First NOrders Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FirstNOrdersCondition getFixture() {
		return (FirstNOrdersCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createFirstNOrdersCondition());
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

} //FirstNOrdersConditionTest
