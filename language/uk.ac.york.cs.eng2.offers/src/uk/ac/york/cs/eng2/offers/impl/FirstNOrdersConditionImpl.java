/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.FirstNOrdersCondition;
import uk.ac.york.cs.eng2.offers.OffersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First NOrders Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl#getNumberOfOrders <em>Number Of Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirstNOrdersConditionImpl extends ConditionImpl implements FirstNOrdersCondition {
	/**
	 * The default value of the '{@link #getNumberOfOrders() <em>Number Of Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOrders()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ORDERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfOrders() <em>Number Of Orders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOrders()
	 * @generated
	 * @ordered
	 */
	protected int numberOfOrders = NUMBER_OF_ORDERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstNOrdersConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.FIRST_NORDERS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfOrders(int newNumberOfOrders) {
		int oldNumberOfOrders = numberOfOrders;
		numberOfOrders = newNumberOfOrders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS, oldNumberOfOrders, numberOfOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS:
				return getNumberOfOrders();
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
			case OffersPackage.FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS:
				setNumberOfOrders((Integer)newValue);
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
			case OffersPackage.FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS:
				setNumberOfOrders(NUMBER_OF_ORDERS_EDEFAULT);
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
			case OffersPackage.FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS:
				return numberOfOrders != NUMBER_OF_ORDERS_EDEFAULT;
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
		result.append(" (numberOfOrders: ");
		result.append(numberOfOrders);
		result.append(')');
		return result.toString();
	}

} //FirstNOrdersConditionImpl
