/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Product Discount Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageProductDiscountAction()
 * @model
 * @generated
 */
public interface PercentageProductDiscountAction extends PercentageDiscountAction {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageProductDiscountAction_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // PercentageProductDiscountAction
