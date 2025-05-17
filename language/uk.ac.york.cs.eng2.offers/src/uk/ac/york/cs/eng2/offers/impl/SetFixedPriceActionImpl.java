/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.SetFixedPriceAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Fixed Price Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl#getFixedPrice <em>Fixed Price</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetFixedPriceActionImpl extends ActionImpl implements SetFixedPriceAction {
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
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFixedPriceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OffersPackage.Literals.SET_FIXED_PRICE_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_FIXED_PRICE_ACTION__FIXED_PRICE, oldFixedPrice, fixedPrice));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT, oldProduct, product));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OffersPackage.SET_FIXED_PRICE_ACTION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OffersPackage.SET_FIXED_PRICE_ACTION__FIXED_PRICE:
				return getFixedPrice();
			case OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case OffersPackage.SET_FIXED_PRICE_ACTION__QUANTITY:
				return getQuantity();
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
			case OffersPackage.SET_FIXED_PRICE_ACTION__FIXED_PRICE:
				setFixedPrice((Float)newValue);
				return;
			case OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT:
				setProduct((Product)newValue);
				return;
			case OffersPackage.SET_FIXED_PRICE_ACTION__QUANTITY:
				setQuantity((Integer)newValue);
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
			case OffersPackage.SET_FIXED_PRICE_ACTION__FIXED_PRICE:
				setFixedPrice(FIXED_PRICE_EDEFAULT);
				return;
			case OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT:
				setProduct((Product)null);
				return;
			case OffersPackage.SET_FIXED_PRICE_ACTION__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
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
			case OffersPackage.SET_FIXED_PRICE_ACTION__FIXED_PRICE:
				return fixedPrice != FIXED_PRICE_EDEFAULT;
			case OffersPackage.SET_FIXED_PRICE_ACTION__PRODUCT:
				return product != null;
			case OffersPackage.SET_FIXED_PRICE_ACTION__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
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
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //SetFixedPriceActionImpl
