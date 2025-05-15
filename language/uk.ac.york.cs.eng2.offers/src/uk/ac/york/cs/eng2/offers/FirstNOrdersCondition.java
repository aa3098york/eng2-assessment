/**
 */
package uk.ac.york.cs.eng2.offers;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First NOrders Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getNumberOfOrders <em>Number Of Orders</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getDay <em>Day</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFirstNOrdersCondition()
 * @model
 * @generated
 */
public interface FirstNOrdersCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Number Of Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Orders</em>' attribute.
	 * @see #setNumberOfOrders(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFirstNOrdersCondition_NumberOfOrders()
	 * @model
	 * @generated
	 */
	int getNumberOfOrders();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getNumberOfOrders <em>Number Of Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Orders</em>' attribute.
	 * @see #getNumberOfOrders()
	 * @generated
	 */
	void setNumberOfOrders(int value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(Date)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFirstNOrdersCondition_Day()
	 * @model
	 * @generated
	 */
	Date getDay();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Date value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFirstNOrdersCondition_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // FirstNOrdersCondition
