/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.MultiOfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.TriggerRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.MultiOfferRuleImpl#getTriggerRule <em>Trigger Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiOfferRuleImpl extends OfferRuleImpl implements MultiOfferRule {
	/**
	 * The cached value of the '{@link #getTriggerRule() <em>Trigger Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerRule()
	 * @generated
	 * @ordered
	 */
	protected TriggerRule triggerRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiOfferRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.MULTI_OFFER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerRule getTriggerRule() {
		return triggerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTriggerRule(TriggerRule newTriggerRule, NotificationChain msgs) {
		TriggerRule oldTriggerRule = triggerRule;
		triggerRule = newTriggerRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE, oldTriggerRule, newTriggerRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerRule(TriggerRule newTriggerRule) {
		if (newTriggerRule != triggerRule) {
			NotificationChain msgs = null;
			if (triggerRule != null)
				msgs = ((InternalEObject)triggerRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE, null, msgs);
			if (newTriggerRule != null)
				msgs = ((InternalEObject)newTriggerRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE, null, msgs);
			msgs = basicSetTriggerRule(newTriggerRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE, newTriggerRule, newTriggerRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE:
				return basicSetTriggerRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE:
				return getTriggerRule();
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
			case OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE:
				setTriggerRule((TriggerRule)newValue);
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
			case OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE:
				setTriggerRule((TriggerRule)null);
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
			case OffersPackage.MULTI_OFFER_RULE__TRIGGER_RULE:
				return triggerRule != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiOfferRuleImpl
