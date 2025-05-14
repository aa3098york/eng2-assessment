/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Item Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FreeItemAction#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFreeItemAction()
 * @model
 * @generated
 */
public interface FreeItemAction extends Action {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFreeItemAction_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FreeItemAction#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // FreeItemAction
