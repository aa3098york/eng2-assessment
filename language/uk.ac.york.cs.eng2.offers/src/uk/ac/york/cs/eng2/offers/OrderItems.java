/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrderItems#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrderItems#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrderItems#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderItems()
 * @model
 * @generated
 */
public interface OrderItems extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderItems_UnitPrice()
	 * @model
	 * @generated
	 */
	float getUnitPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrderItems#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(float value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderItems_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrderItems#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrderItems_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrderItems#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // OrderItems
