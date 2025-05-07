/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.OrdersByDay;
import uk.ac.york.cs.eng2.offers.TriggerRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getMinOrderValue <em>Min Order Value</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl#getOrdersByDay <em>Orders By Day</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OfferRuleImpl extends MinimalEObjectImpl.Container implements OfferRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOrderValue() <em>Min Order Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOrderValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ORDER_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinOrderValue() <em>Min Order Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOrderValue()
	 * @generated
	 * @ordered
	 */
	protected float minOrderValue = MIN_ORDER_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<TriggerRule> triggers;

	/**
	 * The cached value of the '{@link #getOrdersByDay() <em>Orders By Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdersByDay()
	 * @generated
	 * @ordered
	 */
	protected OrdersByDay ordersByDay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.OFFER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMinOrderValue() {
		return minOrderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinOrderValue(float newMinOrderValue) {
		float oldMinOrderValue = minOrderValue;
		minOrderValue = newMinOrderValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__MIN_ORDER_VALUE, oldMinOrderValue, minOrderValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TriggerRule> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectResolvingEList<TriggerRule>(TriggerRule.class, this, OffersPackage.OFFER_RULE__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrdersByDay getOrdersByDay() {
		if (ordersByDay != null && ordersByDay.eIsProxy()) {
			InternalEObject oldOrdersByDay = (InternalEObject)ordersByDay;
			ordersByDay = (OrdersByDay)eResolveProxy(oldOrdersByDay);
			if (ordersByDay != oldOrdersByDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.OFFER_RULE__ORDERS_BY_DAY, oldOrdersByDay, ordersByDay));
			}
		}
		return ordersByDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersByDay basicGetOrdersByDay() {
		return ordersByDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdersByDay(OrdersByDay newOrdersByDay) {
		OrdersByDay oldOrdersByDay = ordersByDay;
		ordersByDay = newOrdersByDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.OFFER_RULE__ORDERS_BY_DAY, oldOrdersByDay, ordersByDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.OFFER_RULE__NAME:
				return getName();
			case OffersPackage.OFFER_RULE__MIN_ORDER_VALUE:
				return getMinOrderValue();
			case OffersPackage.OFFER_RULE__TRIGGERS:
				return getTriggers();
			case OffersPackage.OFFER_RULE__ORDERS_BY_DAY:
				if (resolve) return getOrdersByDay();
				return basicGetOrdersByDay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OffersPackage.OFFER_RULE__NAME:
				setName((String)newValue);
				return;
			case OffersPackage.OFFER_RULE__MIN_ORDER_VALUE:
				setMinOrderValue((Float)newValue);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends TriggerRule>)newValue);
				return;
			case OffersPackage.OFFER_RULE__ORDERS_BY_DAY:
				setOrdersByDay((OrdersByDay)newValue);
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
			case OffersPackage.OFFER_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OffersPackage.OFFER_RULE__MIN_ORDER_VALUE:
				setMinOrderValue(MIN_ORDER_VALUE_EDEFAULT);
				return;
			case OffersPackage.OFFER_RULE__TRIGGERS:
				getTriggers().clear();
				return;
			case OffersPackage.OFFER_RULE__ORDERS_BY_DAY:
				setOrdersByDay((OrdersByDay)null);
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
			case OffersPackage.OFFER_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OffersPackage.OFFER_RULE__MIN_ORDER_VALUE:
				return minOrderValue != MIN_ORDER_VALUE_EDEFAULT;
			case OffersPackage.OFFER_RULE__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case OffersPackage.OFFER_RULE__ORDERS_BY_DAY:
				return ordersByDay != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", minOrderValue: ");
		result.append(minOrderValue);
		result.append(')');
		return result.toString();
	}

} //OfferRuleImpl
