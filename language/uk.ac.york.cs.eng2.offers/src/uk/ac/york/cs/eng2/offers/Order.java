/**
 */
package uk.ac.york.cs.eng2.offers;

import java.util.Date;

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
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Order#getOrderItems <em>Order Items</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Order#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Price</em>' attribute.
	 * @see #setTotalPrice(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_TotalPrice()
	 * @model
	 * @generated
	 */
	float getTotalPrice();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Order#getTotalPrice <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Price</em>' attribute.
	 * @see #getTotalPrice()
	 * @generated
	 */
	void setTotalPrice(float value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Order#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Items</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.OrderItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Items</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrder_OrderItems()
	 * @model
	 * @generated
	 */
	EList<OrderItems> getOrderItems();

} // Order
