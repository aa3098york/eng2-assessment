/**
 */
package uk.ac.york.cs.eng2.offers.tests;

import junit.textui.TestRunner;

import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.ProductCategoryCondition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Category Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductCategoryConditionTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductCategoryConditionTest.class);
	}

	/**
	 * Constructs a new Product Category Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategoryConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Product Category Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductCategoryCondition getFixture() {
		return (ProductCategoryCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OffersFactory.eINSTANCE.createProductCategoryCondition());
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

} //ProductCategoryConditionTest
