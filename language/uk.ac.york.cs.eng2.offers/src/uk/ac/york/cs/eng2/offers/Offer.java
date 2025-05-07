/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getCategories <em>Categories</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.Offer#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer()
 * @model
 * @generated
 */
public interface Offer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.Offer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_Categories()
	 * @model
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.OfferRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getOffer_Rules()
	 * @model
	 * @generated
	 */
	EList<OfferRule> getRules();

} // Offer
