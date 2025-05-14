/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TriggerRule#getSecondaryRule <em>Secondary Rule</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule()
 * @model
 * @generated
 */
public interface TriggerRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #setTrigger(TriggerType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule_Trigger()
	 * @model
	 * @generated
	 */
	TriggerType getTrigger();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Secondary Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Rule</em>' reference.
	 * @see #setSecondaryRule(SingleOfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule_SecondaryRule()
	 * @model
	 * @generated
	 */
	SingleOfferRule getSecondaryRule();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getSecondaryRule <em>Secondary Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Rule</em>' reference.
	 * @see #getSecondaryRule()
	 * @generated
	 */
	void setSecondaryRule(SingleOfferRule value);

} // TriggerRule
