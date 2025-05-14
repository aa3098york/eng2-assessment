/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Items</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.OrderItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Items</em>' containment reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_OrderItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderItem> getOrderItems();

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_TotalAmount()
	 * @model
	 * @generated
	 */
	float getTotalAmount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Order#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(float value);

} // Order
