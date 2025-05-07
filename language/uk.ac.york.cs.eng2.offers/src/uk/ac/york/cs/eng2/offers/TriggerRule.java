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
 *   <li>{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTargetRule <em>Target Rule</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule()
 * @model
 * @generated
 */
public interface TriggerRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.york.cs.eng2.offers.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #setTriggerType(TriggerType)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule_TriggerType()
	 * @model
	 * @generated
	 */
	TriggerType getTriggerType();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TriggerType value);

	/**
	 * Returns the value of the '<em><b>Target Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Rule</em>' reference.
	 * @see #setTargetRule(OfferRule)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getTriggerRule_TargetRule()
	 * @model
	 * @generated
	 */
	OfferRule getTargetRule();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTargetRule <em>Target Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Rule</em>' reference.
	 * @see #getTargetRule()
	 * @generated
	 */
	void setTargetRule(OfferRule value);

} // TriggerRule
