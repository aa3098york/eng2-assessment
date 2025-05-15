/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.FirstNOrdersCondition;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First NOrders Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl#getNumberOfOrders <em>Number Of Orders</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl#getDay <em>Day</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl#getProduct <em>Product</em>}</li>
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
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final Date DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Date day = DAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

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
	public Date getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(Date newDay) {
		Date oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FIRST_NORDERS_CONDITION__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT, oldProduct, product));
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
			case OffersPackage.FIRST_NORDERS_CONDITION__DAY:
				return getDay();
			case OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
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
			case OffersPackage.FIRST_NORDERS_CONDITION__DAY:
				setDay((Date)newValue);
				return;
			case OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT:
				setProduct((Product)newValue);
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
			case OffersPackage.FIRST_NORDERS_CONDITION__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT:
				setProduct((Product)null);
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
			case OffersPackage.FIRST_NORDERS_CONDITION__DAY:
				return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
			case OffersPackage.FIRST_NORDERS_CONDITION__PRODUCT:
				return product != null;
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
		result.append(", day: ");
		result.append(day);
		result.append(')');
		return result.toString();
	}

} //FirstNOrdersConditionImpl
