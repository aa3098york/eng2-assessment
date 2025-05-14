/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.FixedPriceDiscountAction;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Price Discount Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FixedPriceDiscountActionImpl#getFixedPrice <em>Fixed Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedPriceDiscountActionImpl extends ActionImpl implements FixedPriceDiscountAction {
	/**
	 * The default value of the '{@link #getFixedPrice() <em>Fixed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedPrice() <em>Fixed Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPrice()
	 * @generated
	 * @ordered
	 */
	protected float fixedPrice = FIXED_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPriceDiscountActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.FIXED_PRICE_DISCOUNT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getFixedPrice() {
		return fixedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedPrice(float newFixedPrice) {
		float oldFixedPrice = fixedPrice;
		fixedPrice = newFixedPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FIXED_PRICE_DISCOUNT_ACTION__FIXED_PRICE, oldFixedPrice, fixedPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.FIXED_PRICE_DISCOUNT_ACTION__FIXED_PRICE:
				return getFixedPrice();
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
			case OffersPackage.FIXED_PRICE_DISCOUNT_ACTION__FIXED_PRICE:
				setFixedPrice((Float)newValue);
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
			case OffersPackage.FIXED_PRICE_DISCOUNT_ACTION__FIXED_PRICE:
				setFixedPrice(FIXED_PRICE_EDEFAULT);
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
			case OffersPackage.FIXED_PRICE_DISCOUNT_ACTION__FIXED_PRICE:
				return fixedPrice != FIXED_PRICE_EDEFAULT;
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
		result.append(" (fixedPrice: ");
		result.append(fixedPrice);
		result.append(')');
		return result.toString();
	}

} //FixedPriceDiscountActionImpl
