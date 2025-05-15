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
 *   <li>{@link uk.ac.york.cs.eng2.offers.MultiOfferRule#getTriggerRule <em>Trigger Rule</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiOfferRule()
 * @model
 * @generated
 */
public interface MultiOfferRule extends OfferRule {
	/**
	 * Returns the value of the '<em><b>Trigger Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Rule</em>' containment reference.
	 * @see #setTriggerRule(TriggerRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMultiOfferRule_TriggerRule()
	 * @model containment="true"
	 * @generated
	 */
	TriggerRule getTriggerRule();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MultiOfferRule#getTriggerRule <em>Trigger Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Rule</em>' containment reference.
	 * @see #getTriggerRule()
	 * @generated
	 */
	void setTriggerRule(TriggerRule value);

} // MultiOfferRule
