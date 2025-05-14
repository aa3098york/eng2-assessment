/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MultiOfferRule#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiOfferRule()
 * @model
 * @generated
 */
public interface MultiOfferRule extends OfferRule {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(TriggerRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiOfferRule_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	TriggerRule getTrigger();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MultiOfferRule#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerRule value);

} // MultiOfferRule
