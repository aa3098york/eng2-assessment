/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getMinOrderValue <em>Min Order Value</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.OfferRule#getOrdersByDay <em>Orders By Day</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule()
 * @model abstract="true"
 * @generated
 */
public interface OfferRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Min Order Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Order Value</em>' attribute.
	 * @see #setMinOrderValue(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_MinOrderValue()
	 * @model
	 * @generated
	 */
	float getMinOrderValue();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getMinOrderValue <em>Min Order Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Order Value</em>' attribute.
	 * @see #getMinOrderValue()
	 * @generated
	 */
	void setMinOrderValue(float value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.TriggerRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_Triggers()
	 * @model
	 * @generated
	 */
	EList<TriggerRule> getTriggers();

	/**
	 * Returns the value of the '<em><b>Orders By Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders By Day</em>' reference.
	 * @see #setOrdersByDay(OrdersByDay)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOfferRule_OrdersByDay()
	 * @model
	 * @generated
	 */
	OrdersByDay getOrdersByDay();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.OfferRule#getOrdersByDay <em>Orders By Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orders By Day</em>' reference.
	 * @see #getOrdersByDay()
	 * @generated
	 */
	void setOrdersByDay(OrdersByDay value);

} // OfferRule
