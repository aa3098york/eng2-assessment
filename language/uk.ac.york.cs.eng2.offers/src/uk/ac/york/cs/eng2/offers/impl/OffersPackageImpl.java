/**
 */
package uk.ac.york.cs.eng2.offers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.york.cs.eng2.offers.Action;
import uk.ac.york.cs.eng2.offers.Category;
import uk.ac.york.cs.eng2.offers.Condition;
import uk.ac.york.cs.eng2.offers.ContainsProductCondition;
import uk.ac.york.cs.eng2.offers.FirstNOrdersCondition;
import uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction;
import uk.ac.york.cs.eng2.offers.FreeItemAction;
import uk.ac.york.cs.eng2.offers.MinOrderValueCondition;
import uk.ac.york.cs.eng2.offers.Model;
import uk.ac.york.cs.eng2.offers.MultiOfferRule;
import uk.ac.york.cs.eng2.offers.OfferRule;
import uk.ac.york.cs.eng2.offers.OffersFactory;
import uk.ac.york.cs.eng2.offers.OffersPackage;
import uk.ac.york.cs.eng2.offers.OrderDateCondition;
import uk.ac.york.cs.eng2.offers.PercentageDiscountAction;
import uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction;
import uk.ac.york.cs.eng2.offers.Product;
import uk.ac.york.cs.eng2.offers.ProductQuantityCondition;
import uk.ac.york.cs.eng2.offers.ProductTagCondition;
import uk.ac.york.cs.eng2.offers.SetFixedPriceAction;
import uk.ac.york.cs.eng2.offers.SingleOfferRule;
import uk.ac.york.cs.eng2.offers.Tag;
import uk.ac.york.cs.eng2.offers.TriggerRule;
import uk.ac.york.cs.eng2.offers.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OffersPackageImpl extends EPackageImpl implements OffersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAmountDiscountActionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setFixedPriceActionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageDiscountActionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageProductDiscountActionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeItemActionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOfferRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiOfferRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minOrderValueConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsProductConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTagConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDateConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstNOrdersConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productQuantityConditionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OffersPackageImpl() {
		super(eNS_URI, OffersFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OffersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OffersPackage init() {
		if (isInited) return (OffersPackage)EPackage.Registry.INSTANCE.getEPackage(OffersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOffersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OffersPackageImpl theOffersPackage = registeredOffersPackage instanceof OffersPackageImpl ? (OffersPackageImpl)registeredOffersPackage : new OffersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOffersPackage.createPackageContents();

		// Initialize created meta-data
		theOffersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOffersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OffersPackage.eNS_URI, theOffersPackage);
		return theOffersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Products() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Tags() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_OfferRules() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Categories() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Subcategories() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Products() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAmountDiscountAction() {
		return fixedAmountDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAmountDiscountAction_DiscountAmount() {
		return (EAttribute)fixedAmountDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetFixedPriceAction() {
		return setFixedPriceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetFixedPriceAction_FixedPrice() {
		return (EAttribute)setFixedPriceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetFixedPriceAction_Product() {
		return (EReference)setFixedPriceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetFixedPriceAction_Quantity() {
		return (EAttribute)setFixedPriceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPercentageDiscountAction() {
		return percentageDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPercentageDiscountAction_DiscountPercentage() {
		return (EAttribute)percentageDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPercentageProductDiscountAction() {
		return percentageProductDiscountActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPercentageProductDiscountAction_Product() {
		return (EReference)percentageProductDiscountActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreeItemAction() {
		return freeItemActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFreeItemAction_Product() {
		return (EReference)freeItemActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreeItemAction_Quantity() {
		return (EAttribute)freeItemActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOfferRule() {
		return offerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOfferRule_Name() {
		return (EAttribute)offerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Conditions() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOfferRule_Actions() {
		return (EReference)offerRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleOfferRule() {
		return singleOfferRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiOfferRule() {
		return multiOfferRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiOfferRule_TriggerRule() {
		return (EReference)multiOfferRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerRule() {
		return triggerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerRule_Trigger() {
		return (EAttribute)triggerRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerRule_SecondaryRule() {
		return (EReference)triggerRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinOrderValueCondition() {
		return minOrderValueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMinOrderValueCondition_MinimumAmount() {
		return (EAttribute)minOrderValueConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainsProductCondition() {
		return containsProductConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainsProductCondition_Product() {
		return (EReference)containsProductConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductTagCondition() {
		return productTagConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductTagCondition_Tags() {
		return (EReference)productTagConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderDateCondition() {
		return orderDateConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDateCondition_Date() {
		return (EAttribute)orderDateConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstNOrdersCondition() {
		return firstNOrdersConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstNOrdersCondition_NumberOfOrders() {
		return (EAttribute)firstNOrdersConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstNOrdersCondition_Day() {
		return (EAttribute)firstNOrdersConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirstNOrdersCondition_Product() {
		return (EReference)firstNOrdersConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductQuantityCondition() {
		return productQuantityConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductQuantityCondition_Product() {
		return (EReference)productQuantityConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductQuantityCondition_Quantity() {
		return (EAttribute)productQuantityConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_UnitPrice() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_Tags() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerType() {
		return triggerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffersFactory getOffersFactory() {
		return (OffersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PRODUCTS);
		createEReference(modelEClass, MODEL__TAGS);
		createEReference(modelEClass, MODEL__OFFER_RULES);
		createEReference(modelEClass, MODEL__CATEGORIES);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__SUBCATEGORIES);
		createEReference(categoryEClass, CATEGORY__PRODUCTS);

		actionEClass = createEClass(ACTION);

		fixedAmountDiscountActionEClass = createEClass(FIXED_AMOUNT_DISCOUNT_ACTION);
		createEAttribute(fixedAmountDiscountActionEClass, FIXED_AMOUNT_DISCOUNT_ACTION__DISCOUNT_AMOUNT);

		setFixedPriceActionEClass = createEClass(SET_FIXED_PRICE_ACTION);
		createEAttribute(setFixedPriceActionEClass, SET_FIXED_PRICE_ACTION__FIXED_PRICE);
		createEReference(setFixedPriceActionEClass, SET_FIXED_PRICE_ACTION__PRODUCT);
		createEAttribute(setFixedPriceActionEClass, SET_FIXED_PRICE_ACTION__QUANTITY);

		percentageDiscountActionEClass = createEClass(PERCENTAGE_DISCOUNT_ACTION);
		createEAttribute(percentageDiscountActionEClass, PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE);

		percentageProductDiscountActionEClass = createEClass(PERCENTAGE_PRODUCT_DISCOUNT_ACTION);
		createEReference(percentageProductDiscountActionEClass, PERCENTAGE_PRODUCT_DISCOUNT_ACTION__PRODUCT);

		freeItemActionEClass = createEClass(FREE_ITEM_ACTION);
		createEReference(freeItemActionEClass, FREE_ITEM_ACTION__PRODUCT);
		createEAttribute(freeItemActionEClass, FREE_ITEM_ACTION__QUANTITY);

		offerRuleEClass = createEClass(OFFER_RULE);
		createEAttribute(offerRuleEClass, OFFER_RULE__NAME);
		createEReference(offerRuleEClass, OFFER_RULE__CONDITIONS);
		createEReference(offerRuleEClass, OFFER_RULE__ACTIONS);

		singleOfferRuleEClass = createEClass(SINGLE_OFFER_RULE);

		multiOfferRuleEClass = createEClass(MULTI_OFFER_RULE);
		createEReference(multiOfferRuleEClass, MULTI_OFFER_RULE__TRIGGER_RULE);

		triggerRuleEClass = createEClass(TRIGGER_RULE);
		createEAttribute(triggerRuleEClass, TRIGGER_RULE__TRIGGER);
		createEReference(triggerRuleEClass, TRIGGER_RULE__SECONDARY_RULE);

		conditionEClass = createEClass(CONDITION);

		minOrderValueConditionEClass = createEClass(MIN_ORDER_VALUE_CONDITION);
		createEAttribute(minOrderValueConditionEClass, MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT);

		containsProductConditionEClass = createEClass(CONTAINS_PRODUCT_CONDITION);
		createEReference(containsProductConditionEClass, CONTAINS_PRODUCT_CONDITION__PRODUCT);

		productTagConditionEClass = createEClass(PRODUCT_TAG_CONDITION);
		createEReference(productTagConditionEClass, PRODUCT_TAG_CONDITION__TAGS);

		orderDateConditionEClass = createEClass(ORDER_DATE_CONDITION);
		createEAttribute(orderDateConditionEClass, ORDER_DATE_CONDITION__DATE);

		firstNOrdersConditionEClass = createEClass(FIRST_NORDERS_CONDITION);
		createEAttribute(firstNOrdersConditionEClass, FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS);
		createEAttribute(firstNOrdersConditionEClass, FIRST_NORDERS_CONDITION__DAY);
		createEReference(firstNOrdersConditionEClass, FIRST_NORDERS_CONDITION__PRODUCT);

		productQuantityConditionEClass = createEClass(PRODUCT_QUANTITY_CONDITION);
		createEReference(productQuantityConditionEClass, PRODUCT_QUANTITY_CONDITION__PRODUCT);
		createEAttribute(productQuantityConditionEClass, PRODUCT_QUANTITY_CONDITION__QUANTITY);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__UNIT_PRICE);
		createEReference(productEClass, PRODUCT__TAGS);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		// Create enums
		triggerTypeEEnum = createEEnum(TRIGGER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fixedAmountDiscountActionEClass.getESuperTypes().add(this.getAction());
		setFixedPriceActionEClass.getESuperTypes().add(this.getAction());
		percentageDiscountActionEClass.getESuperTypes().add(this.getAction());
		percentageProductDiscountActionEClass.getESuperTypes().add(this.getPercentageDiscountAction());
		freeItemActionEClass.getESuperTypes().add(this.getAction());
		singleOfferRuleEClass.getESuperTypes().add(this.getOfferRule());
		multiOfferRuleEClass.getESuperTypes().add(this.getOfferRule());
		minOrderValueConditionEClass.getESuperTypes().add(this.getCondition());
		containsProductConditionEClass.getESuperTypes().add(this.getCondition());
		productTagConditionEClass.getESuperTypes().add(this.getCondition());
		orderDateConditionEClass.getESuperTypes().add(this.getCondition());
		firstNOrdersConditionEClass.getESuperTypes().add(this.getCondition());
		productQuantityConditionEClass.getESuperTypes().add(this.getCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Products(), this.getProduct(), null, "products", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Tags(), this.getTag(), null, "tags", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OfferRules(), this.getOfferRule(), null, "offerRules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Categories(), this.getCategory(), null, "categories", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Subcategories(), this.getCategory(), null, "subcategories", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Products(), this.getProduct(), null, "products", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedAmountDiscountActionEClass, FixedAmountDiscountAction.class, "FixedAmountDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAmountDiscountAction_DiscountAmount(), ecorePackage.getEFloat(), "discountAmount", null, 0, 1, FixedAmountDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setFixedPriceActionEClass, SetFixedPriceAction.class, "SetFixedPriceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetFixedPriceAction_FixedPrice(), ecorePackage.getEFloat(), "fixedPrice", null, 0, 1, SetFixedPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetFixedPriceAction_Product(), this.getProduct(), null, "product", null, 0, 1, SetFixedPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetFixedPriceAction_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, SetFixedPriceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageDiscountActionEClass, PercentageDiscountAction.class, "PercentageDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageDiscountAction_DiscountPercentage(), ecorePackage.getEInt(), "discountPercentage", null, 0, 1, PercentageDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(percentageProductDiscountActionEClass, PercentageProductDiscountAction.class, "PercentageProductDiscountAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPercentageProductDiscountAction_Product(), this.getProduct(), null, "product", null, 0, 1, PercentageProductDiscountAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeItemActionEClass, FreeItemAction.class, "FreeItemAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeItemAction_Product(), this.getProduct(), null, "product", null, 0, 1, FreeItemAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFreeItemAction_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, FreeItemAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerRuleEClass, OfferRule.class, "OfferRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Conditions(), this.getCondition(), null, "conditions", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOfferRule_Actions(), this.getAction(), null, "actions", null, 0, -1, OfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleOfferRuleEClass, SingleOfferRule.class, "SingleOfferRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiOfferRuleEClass, MultiOfferRule.class, "MultiOfferRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiOfferRule_TriggerRule(), this.getTriggerRule(), null, "triggerRule", null, 0, 1, MultiOfferRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerRuleEClass, TriggerRule.class, "TriggerRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerRule_Trigger(), this.getTriggerType(), "trigger", null, 0, 1, TriggerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerRule_SecondaryRule(), this.getSingleOfferRule(), null, "secondaryRule", null, 0, 1, TriggerRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minOrderValueConditionEClass, MinOrderValueCondition.class, "MinOrderValueCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMinOrderValueCondition_MinimumAmount(), ecorePackage.getEFloat(), "minimumAmount", null, 0, 1, MinOrderValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsProductConditionEClass, ContainsProductCondition.class, "ContainsProductCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainsProductCondition_Product(), this.getProduct(), null, "product", null, 0, 1, ContainsProductCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTagConditionEClass, ProductTagCondition.class, "ProductTagCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductTagCondition_Tags(), this.getTag(), null, "tags", null, 0, -1, ProductTagCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderDateConditionEClass, OrderDateCondition.class, "OrderDateCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDateCondition_Date(), ecorePackage.getEDate(), "date", null, 0, 1, OrderDateCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firstNOrdersConditionEClass, FirstNOrdersCondition.class, "FirstNOrdersCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstNOrdersCondition_NumberOfOrders(), ecorePackage.getEInt(), "numberOfOrders", null, 0, 1, FirstNOrdersCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirstNOrdersCondition_Day(), ecorePackage.getEDate(), "day", null, 0, 1, FirstNOrdersCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFirstNOrdersCondition_Product(), this.getProduct(), null, "product", null, 0, 1, FirstNOrdersCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productQuantityConditionEClass, ProductQuantityCondition.class, "ProductQuantityCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductQuantityCondition_Product(), this.getProduct(), null, "product", null, 0, 1, ProductQuantityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductQuantityCondition_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, ProductQuantityCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_UnitPrice(), ecorePackage.getEFloat(), "unitPrice", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Tags(), this.getTag(), null, "tags", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(triggerTypeEEnum, TriggerType.class, "TriggerType");
		addEEnumLiteral(triggerTypeEEnum, TriggerType.IF_MATCH);
		addEEnumLiteral(triggerTypeEEnum, TriggerType.IF_NOT_MATCH);
		addEEnumLiteral(triggerTypeEEnum, TriggerType.ALWAYS);

		// Create resource
		createResource(eNS_URI);
	}

} //OffersPackageImpl
