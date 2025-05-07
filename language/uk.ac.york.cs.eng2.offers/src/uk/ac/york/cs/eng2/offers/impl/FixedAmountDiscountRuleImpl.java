/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.FixedAmountDiscountRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Amount Discount Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FixedAmountDiscountRuleImpl#getDiscountAmount <em>Discount Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAmountDiscountRuleImpl extends OfferRuleImpl implements FixedAmountDiscountRule {
	/**
	 * The default value of the '{@link #getDiscountAmount() <em>Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiscountAmount() <em>Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountAmount()
	 * @generated
	 * @ordered
	 */
	protected float discountAmount = DISCOUNT_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAmountDiscountRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.FIXED_AMOUNT_DISCOUNT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountAmount(float newDiscountAmount) {
		float oldDiscountAmount = discountAmount;
		discountAmount = newDiscountAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FIXED_AMOUNT_DISCOUNT_RULE__DISCOUNT_AMOUNT, oldDiscountAmount, discountAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.FIXED_AMOUNT_DISCOUNT_RULE__DISCOUNT_AMOUNT:
				return getDiscountAmount();
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
			case OffersPackage.FIXED_AMOUNT_DISCOUNT_RULE__DISCOUNT_AMOUNT:
				setDiscountAmount((Float)newValue);
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
			case OffersPackage.FIXED_AMOUNT_DISCOUNT_RULE__DISCOUNT_AMOUNT:
				setDiscountAmount(DISCOUNT_AMOUNT_EDEFAULT);
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
			case OffersPackage.FIXED_AMOUNT_DISCOUNT_RULE__DISCOUNT_AMOUNT:
				return discountAmount != DISCOUNT_AMOUNT_EDEFAULT;
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
		result.append(" (discountAmount: ");
		result.append(discountAmount);
		result.append(')');
		return result.toString();
	}

} //FixedAmountDiscountRuleImpl
