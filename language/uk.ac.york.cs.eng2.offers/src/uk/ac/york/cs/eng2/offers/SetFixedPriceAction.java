/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Fixed Price Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getFixedPrice <em>Fixed Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getProduct <em>Product</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSetFixedPriceAction()
 * @model
 * @generated
 */
public interface SetFixedPriceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Fixed Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Price</em>' attribute.
	 * @see #setFixedPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSetFixedPriceAction_FixedPrice()
	 * @model
	 * @generated
	 */
	float getFixedPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getFixedPrice <em>Fixed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Price</em>' attribute.
	 * @see #getFixedPrice()
	 * @generated
	 */
	void setFixedPrice(float value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSetFixedPriceAction_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getSetFixedPriceAction_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // SetFixedPriceAction
