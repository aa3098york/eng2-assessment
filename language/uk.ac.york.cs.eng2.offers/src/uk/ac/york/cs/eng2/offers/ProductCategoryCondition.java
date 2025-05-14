/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductCategoryCondition#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCategoryCondition()
 * @model
 * @generated
 */
public interface ProductCategoryCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductCategoryCondition_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.ProductCategoryCondition#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // ProductCategoryCondition
