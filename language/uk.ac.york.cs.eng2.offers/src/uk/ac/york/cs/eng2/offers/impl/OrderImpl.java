/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Order;
import uk.ac.york.cs.eng2.offers.OrderItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderImpl#getTotalPrice <em>Total Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.OrderImpl#getOrderItems <em>Order Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalPrice() <em>Total Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPrice()
	 * @generated
	 * @ordered
	 */
	protected float totalPrice = TOTAL_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderItems() <em>Order Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderItems> orderItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ORDER__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPrice(float newTotalPrice) {
		float oldTotalPrice = totalPrice;
		totalPrice = newTotalPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ORDER__TOTAL_PRICE, oldTotalPrice, totalPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDate(Date newOrderDate) {
		Date oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.ORDER__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderItems> getOrderItems() {
		if (orderItems == null) {
			orderItems = new EObjectResolvingEList<OrderItems>(OrderItems.class, this, OffersPackage.ORDER__ORDER_ITEMS);
		}
		return orderItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.ORDER__ORDER_ID:
				return getOrderId();
			case OffersPackage.ORDER__TOTAL_PRICE:
				return getTotalPrice();
			case OffersPackage.ORDER__ORDER_DATE:
				return getOrderDate();
			case OffersPackage.ORDER__ORDER_ITEMS:
				return getOrderItems();
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
			case OffersPackage.ORDER__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OffersPackage.ORDER__TOTAL_PRICE:
				setTotalPrice((Float)newValue);
				return;
			case OffersPackage.ORDER__ORDER_DATE:
				setOrderDate((Date)newValue);
				return;
			case OffersPackage.ORDER__ORDER_ITEMS:
				getOrderItems().clear();
				getOrderItems().addAll((Collection<? extends OrderItems>)newValue);
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
			case OffersPackage.ORDER__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OffersPackage.ORDER__TOTAL_PRICE:
				setTotalPrice(TOTAL_PRICE_EDEFAULT);
				return;
			case OffersPackage.ORDER__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case OffersPackage.ORDER__ORDER_ITEMS:
				getOrderItems().clear();
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
			case OffersPackage.ORDER__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OffersPackage.ORDER__TOTAL_PRICE:
				return totalPrice != TOTAL_PRICE_EDEFAULT;
			case OffersPackage.ORDER__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
			case OffersPackage.ORDER__ORDER_ITEMS:
				return orderItems != null && !orderItems.isEmpty();
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", totalPrice: ");
		result.append(totalPrice);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
