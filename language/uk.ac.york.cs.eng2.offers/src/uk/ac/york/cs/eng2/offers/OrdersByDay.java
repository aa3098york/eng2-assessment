/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orders By Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrdersByDay()
 * @model
 * @generated
 */
public interface OrdersByDay extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrdersByDay_DateCreated()
	 * @model
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrdersByDay_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOrdersByDay_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OrdersByDay#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // OrdersByDay
