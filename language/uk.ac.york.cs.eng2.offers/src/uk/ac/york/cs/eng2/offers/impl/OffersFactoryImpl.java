/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.york.cs.eng2.offers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersFactoryImpl extends EFactoryImpl implements OffersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OffersFactory init() {
		try {
			OffersFactory theOffersFactory = (OffersFactory)EPackage.Registry.INSTANCE.getEFactory(OffersPackage.eNS_URI);
			if (theOffersFactory != null) {
				return theOffersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OffersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OffersPackage.MODEL: return createModel();
			case OffersPackage.CATEGORY: return createCategory();
			case OffersPackage.OFFER: return createOffer();
			case OffersPackage.FIXED_AMOUNT_DISCOUNT_ACTION: return createFixedAmountDiscountAction();
			case OffersPackage.FIXED_PRICE_DISCOUNT_ACTION: return createFixedPriceDiscountAction();
			case OffersPackage.PERCENTAGE_DISCOUNT_ACTION: return createPercentageDiscountAction();
			case OffersPackage.PERCENTAGE_PRODUCT_DISCOUNT_ACTION: return createPercentageProductDiscountAction();
			case OffersPackage.FREE_ITEM_ACTION: return createFreeItemAction();
			case OffersPackage.SINGLE_OFFER_RULE: return createSingleOfferRule();
			case OffersPackage.MULTI_OFFER_RULE: return createMultiOfferRule();
			case OffersPackage.TRIGGER_RULE: return createTriggerRule();
			case OffersPackage.MIN_ORDER_VALUE_CONDITION: return createMinOrderValueCondition();
			case OffersPackage.PRODUCT_TAG_CONDITION: return createProductTagCondition();
			case OffersPackage.PRODUCT_CATEGORY_CONDITION: return createProductCategoryCondition();
			case OffersPackage.FIRST_NORDERS_CONDITION: return createFirstNOrdersCondition();
			case OffersPackage.PRODUCT: return createProduct();
			case OffersPackage.TAG: return createTag();
			case OffersPackage.ORDERS_BY_DAY: return createOrdersByDay();
			case OffersPackage.ORDER: return createOrder();
			case OffersPackage.ORDER_ITEM: return createOrderItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return createTriggerTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OffersPackage.TRIGGER_TYPE:
				return convertTriggerTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAmountDiscountAction createFixedAmountDiscountAction() {
		FixedAmountDiscountActionImpl fixedAmountDiscountAction = new FixedAmountDiscountActionImpl();
		return fixedAmountDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedPriceDiscountAction createFixedPriceDiscountAction() {
		FixedPriceDiscountActionImpl fixedPriceDiscountAction = new FixedPriceDiscountActionImpl();
		return fixedPriceDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageDiscountAction createPercentageDiscountAction() {
		PercentageDiscountActionImpl percentageDiscountAction = new PercentageDiscountActionImpl();
		return percentageDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PercentageProductDiscountAction createPercentageProductDiscountAction() {
		PercentageProductDiscountActionImpl percentageProductDiscountAction = new PercentageProductDiscountActionImpl();
		return percentageProductDiscountAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FreeItemAction createFreeItemAction() {
		FreeItemActionImpl freeItemAction = new FreeItemActionImpl();
		return freeItemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleOfferRule createSingleOfferRule() {
		SingleOfferRuleImpl singleOfferRule = new SingleOfferRuleImpl();
		return singleOfferRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiOfferRule createMultiOfferRule() {
		MultiOfferRuleImpl multiOfferRule = new MultiOfferRuleImpl();
		return multiOfferRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerRule createTriggerRule() {
		TriggerRuleImpl triggerRule = new TriggerRuleImpl();
		return triggerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MinOrderValueCondition createMinOrderValueCondition() {
		MinOrderValueConditionImpl minOrderValueCondition = new MinOrderValueConditionImpl();
		return minOrderValueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductTagCondition createProductTagCondition() {
		ProductTagConditionImpl productTagCondition = new ProductTagConditionImpl();
		return productTagCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryCondition createProductCategoryCondition() {
		ProductCategoryConditionImpl productCategoryCondition = new ProductCategoryConditionImpl();
		return productCategoryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirstNOrdersCondition createFirstNOrdersCondition() {
		FirstNOrdersConditionImpl firstNOrdersCondition = new FirstNOrdersConditionImpl();
		return firstNOrdersCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrdersByDay createOrdersByDay() {
		OrdersByDayImpl ordersByDay = new OrdersByDayImpl();
		return ordersByDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItem createOrderItem() {
		OrderItemImpl orderItem = new OrderItemImpl();
		return orderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerTypeFromString(EDataType eDataType, String initialValue) {
		TriggerType result = TriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersPackage getOffersPackage() {
		return (OffersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OffersPackage getPackage() {
		return OffersPackage.eINSTANCE;
	}

} //OffersFactoryImpl
