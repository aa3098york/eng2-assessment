/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.SingleOfferRule;
import uk.ac.york.cs.eng2.offers.TriggerRule;
import uk.ac.york.cs.eng2.offers.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl#getSecondaryRule <em>Secondary Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerRuleImpl extends MinimalEObjectImpl.Container implements TriggerRule {
	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerType TRIGGER_EDEFAULT = TriggerType.IF_MATCH;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerType trigger = TRIGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondaryRule() <em>Secondary Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryRule()
	 * @generated
	 * @ordered
	 */
	protected SingleOfferRule secondaryRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.TRIGGER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerType getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrigger(TriggerType newTrigger) {
		TriggerType oldTrigger = trigger;
		trigger = newTrigger == null ? TRIGGER_EDEFAULT : newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TRIGGER_RULE__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleOfferRule getSecondaryRule() {
		if (secondaryRule != null && secondaryRule.eIsProxy()) {
			InternalEObject oldSecondaryRule = (InternalEObject)secondaryRule;
			secondaryRule = (SingleOfferRule)eResolveProxy(oldSecondaryRule);
			if (secondaryRule != oldSecondaryRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.TRIGGER_RULE__SECONDARY_RULE, oldSecondaryRule, secondaryRule));
			}
		}
		return secondaryRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOfferRule basicGetSecondaryRule() {
		return secondaryRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryRule(SingleOfferRule newSecondaryRule) {
		SingleOfferRule oldSecondaryRule = secondaryRule;
		secondaryRule = newSecondaryRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.TRIGGER_RULE__SECONDARY_RULE, oldSecondaryRule, secondaryRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.TRIGGER_RULE__TRIGGER:
				return getTrigger();
			case OffersPackage.TRIGGER_RULE__SECONDARY_RULE:
				if (resolve) return getSecondaryRule();
				return basicGetSecondaryRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.TRIGGER_RULE__TRIGGER:
				setTrigger((TriggerType)newValue);
				return;
			case OffersPackage.TRIGGER_RULE__SECONDARY_RULE:
				setSecondaryRule((SingleOfferRule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OffersPackage.TRIGGER_RULE__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case OffersPackage.TRIGGER_RULE__SECONDARY_RULE:
				setSecondaryRule((SingleOfferRule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OffersPackage.TRIGGER_RULE__TRIGGER:
				return trigger != TRIGGER_EDEFAULT;
			case OffersPackage.TRIGGER_RULE__SECONDARY_RULE:
				return secondaryRule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (trigger: ");
		result.append(trigger);
		result.append(')');
		return result.toString();
	}

} //TriggerRuleImpl
