/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.MinOrderValueCondition;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Order Value Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl#getMinimumAmount <em>Minimum Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinOrderValueConditionImpl extends ConditionImpl implements MinOrderValueCondition {
	/**
	 * The default value of the '{@link #getMinimumAmount() <em>Minimum Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumAmount() <em>Minimum Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAmount()
	 * @generated
	 * @ordered
	 */
	protected float minimumAmount = MINIMUM_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinOrderValueConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.MIN_ORDER_VALUE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinimumAmount() {
		return minimumAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumAmount(float newMinimumAmount) {
		float oldMinimumAmount = minimumAmount;
		minimumAmount = newMinimumAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT, oldMinimumAmount, minimumAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT:
				return getMinimumAmount();
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
			case OffersPackage.MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT:
				setMinimumAmount((Float)newValue);
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
			case OffersPackage.MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT:
				setMinimumAmount(MINIMUM_AMOUNT_EDEFAULT);
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
			case OffersPackage.MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT:
				return minimumAmount != MINIMUM_AMOUNT_EDEFAULT;
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
		result.append(" (minimumAmount: ");
		result.append(minimumAmount);
		result.append(')');
		return result.toString();
	}

} //MinOrderValueConditionImpl
