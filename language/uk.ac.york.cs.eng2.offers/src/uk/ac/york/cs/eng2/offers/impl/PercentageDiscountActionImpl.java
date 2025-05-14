/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.PercentageDiscountAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Percentage Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl#getDiscountPercentage <em>Discount Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PercentageDiscountActionImpl extends ActionImpl implements PercentageDiscountAction {
	/**
	 * The default value of the '{@link #getDiscountPercentage() <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int DISCOUNT_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiscountPercentage() <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscountPercentage()
	 * @generated
	 * @ordered
	 */
	protected int discountPercentage = DISCOUNT_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PercentageDiscountActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.PERCENTAGE_DISCOUNT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscountPercentage(int newDiscountPercentage) {
		int oldDiscountPercentage = discountPercentage;
		discountPercentage = newDiscountPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE, oldDiscountPercentage, discountPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE:
				return getDiscountPercentage();
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
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE:
				setDiscountPercentage((Integer)newValue);
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
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE:
				setDiscountPercentage(DISCOUNT_PERCENTAGE_EDEFAULT);
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
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE:
				return discountPercentage != DISCOUNT_PERCENTAGE_EDEFAULT;
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
		result.append(" (discountPercentage: ");
		result.append(discountPercentage);
		result.append(')');
		return result.toString();
	}

} //PercentageDiscountActionImpl
