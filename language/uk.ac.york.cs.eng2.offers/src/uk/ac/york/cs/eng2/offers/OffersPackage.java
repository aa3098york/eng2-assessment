/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersFactory
 * @model kind="package"
 * @generated
 */
public interface OffersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "offers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cs.york.ac.uk/eng2/202425/offers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersPackage eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TAGS = 1;

	/**
	 * The feature id for the '<em><b>Offer Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OFFER_RULES = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CATEGORIES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PRODUCTS = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FixedAmountDiscountActionImpl <em>Fixed Amount Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FixedAmountDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFixedAmountDiscountAction()
	 * @generated
	 */
	int FIXED_AMOUNT_DISCOUNT_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Discount Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_AMOUNT_DISCOUNT_ACTION__DISCOUNT_AMOUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Amount Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_AMOUNT_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Amount Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_AMOUNT_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl <em>Set Fixed Price Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSetFixedPriceAction()
	 * @generated
	 */
	int SET_FIXED_PRICE_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Fixed Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FIXED_PRICE_ACTION__FIXED_PRICE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FIXED_PRICE_ACTION__PRODUCT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FIXED_PRICE_ACTION__QUANTITY = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Set Fixed Price Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FIXED_PRICE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Set Fixed Price Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FIXED_PRICE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl <em>Percentage Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscountAction()
	 * @generated
	 */
	int PERCENTAGE_DISCOUNT_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Percentage Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_DISCOUNT_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageProductDiscountActionImpl <em>Percentage Product Discount Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.PercentageProductDiscountActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageProductDiscountAction()
	 * @generated
	 */
	int PERCENTAGE_PRODUCT_DISCOUNT_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_PRODUCT_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE = PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_PRODUCT_DISCOUNT_ACTION__PRODUCT = PERCENTAGE_DISCOUNT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Percentage Product Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_PRODUCT_DISCOUNT_ACTION_FEATURE_COUNT = PERCENTAGE_DISCOUNT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Percentage Product Discount Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_PRODUCT_DISCOUNT_ACTION_OPERATION_COUNT = PERCENTAGE_DISCOUNT_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FreeItemActionImpl <em>Free Item Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FreeItemActionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFreeItemAction()
	 * @generated
	 */
	int FREE_ITEM_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ITEM_ACTION__PRODUCT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ITEM_ACTION__QUANTITY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Free Item Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ITEM_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Free Item Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_ITEM_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
	 * @generated
	 */
	int OFFER_RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE__ACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.SingleOfferRuleImpl <em>Single Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.SingleOfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSingleOfferRule()
	 * @generated
	 */
	int SINGLE_OFFER_RULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OFFER_RULE__NAME = OFFER_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OFFER_RULE__CONDITIONS = OFFER_RULE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OFFER_RULE__ACTIONS = OFFER_RULE__ACTIONS;

	/**
	 * The number of structural features of the '<em>Single Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OFFER_RULE_FEATURE_COUNT = OFFER_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OFFER_RULE_OPERATION_COUNT = OFFER_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MultiOfferRuleImpl <em>Multi Offer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MultiOfferRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMultiOfferRule()
	 * @generated
	 */
	int MULTI_OFFER_RULE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE__NAME = OFFER_RULE__NAME;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE__CONDITIONS = OFFER_RULE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE__ACTIONS = OFFER_RULE__ACTIONS;

	/**
	 * The feature id for the '<em><b>Trigger Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE__TRIGGER_RULE = OFFER_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE_FEATURE_COUNT = OFFER_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Offer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OFFER_RULE_OPERATION_COUNT = OFFER_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl <em>Trigger Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerRule()
	 * @generated
	 */
	int TRIGGER_RULE = 11;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_RULE__TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Secondary Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_RULE__SECONDARY_RULE = 1;

	/**
	 * The number of structural features of the '<em>Trigger Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl <em>Min Order Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinOrderValueCondition()
	 * @generated
	 */
	int MIN_ORDER_VALUE_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Minimum Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Order Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Order Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_ORDER_VALUE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ContainsProductConditionImpl <em>Contains Product Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ContainsProductConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getContainsProductCondition()
	 * @generated
	 */
	int CONTAINS_PRODUCT_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_PRODUCT_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_PRODUCT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains Product Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_PRODUCT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl <em>Product Tag Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTagCondition()
	 * @generated
	 */
	int PRODUCT_TAG_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION__TAGS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TAG_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderDateConditionImpl <em>Order Date Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.OrderDateConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderDateCondition()
	 * @generated
	 */
	int ORDER_DATE_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DATE_CONDITION__DATE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DATE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Order Date Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DATE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl <em>First NOrders Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFirstNOrdersCondition()
	 * @generated
	 */
	int FIRST_NORDERS_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Number Of Orders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NORDERS_CONDITION__DAY = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NORDERS_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>First NOrders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NORDERS_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>First NOrders Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_NORDERS_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductQuantityConditionImpl <em>Product Quantity Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductQuantityConditionImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductQuantityCondition()
	 * @generated
	 */
	int PRODUCT_QUANTITY_CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_QUANTITY_CONDITION__PRODUCT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_QUANTITY_CONDITION__QUANTITY = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Quantity Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_QUANTITY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Quantity Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_QUANTITY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UNIT_PRICE = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAGS = 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getProducts()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getTags()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getOfferRules <em>Offer Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offer Rules</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getOfferRules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OfferRules();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Model#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Model#getCategories()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Categories();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Category#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Category#getProducts()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Products();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction <em>Fixed Amount Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Amount Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction
	 * @generated
	 */
	EClass getFixedAmountDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction#getDiscountAmount <em>Discount Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FixedAmountDiscountAction#getDiscountAmount()
	 * @see #getFixedAmountDiscountAction()
	 * @generated
	 */
	EAttribute getFixedAmountDiscountAction_DiscountAmount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction <em>Set Fixed Price Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Fixed Price Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetFixedPriceAction
	 * @generated
	 */
	EClass getSetFixedPriceAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getFixedPrice <em>Fixed Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getFixedPrice()
	 * @see #getSetFixedPriceAction()
	 * @generated
	 */
	EAttribute getSetFixedPriceAction_FixedPrice();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getProduct()
	 * @see #getSetFixedPriceAction()
	 * @generated
	 */
	EReference getSetFixedPriceAction_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SetFixedPriceAction#getQuantity()
	 * @see #getSetFixedPriceAction()
	 * @generated
	 */
	EAttribute getSetFixedPriceAction_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.PercentageDiscountAction <em>Percentage Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscountAction
	 * @generated
	 */
	EClass getPercentageDiscountAction();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.PercentageDiscountAction#getDiscountPercentage <em>Discount Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Percentage</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageDiscountAction#getDiscountPercentage()
	 * @see #getPercentageDiscountAction()
	 * @generated
	 */
	EAttribute getPercentageDiscountAction_DiscountPercentage();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction <em>Percentage Product Discount Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Percentage Product Discount Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction
	 * @generated
	 */
	EClass getPercentageProductDiscountAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.PercentageProductDiscountAction#getProduct()
	 * @see #getPercentageProductDiscountAction()
	 * @generated
	 */
	EReference getPercentageProductDiscountAction_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FreeItemAction <em>Free Item Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Item Action</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FreeItemAction
	 * @generated
	 */
	EClass getFreeItemAction();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.FreeItemAction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FreeItemAction#getProduct()
	 * @see #getFreeItemAction()
	 * @generated
	 */
	EReference getFreeItemAction_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FreeItemAction#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FreeItemAction#getQuantity()
	 * @see #getFreeItemAction()
	 * @generated
	 */
	EAttribute getFreeItemAction_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OfferRule <em>Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule
	 * @generated
	 */
	EClass getOfferRule();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OfferRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getName()
	 * @see #getOfferRule()
	 * @generated
	 */
	EAttribute getOfferRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getConditions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.york.cs.eng2.offers.OfferRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OfferRule#getActions()
	 * @see #getOfferRule()
	 * @generated
	 */
	EReference getOfferRule_Actions();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.SingleOfferRule <em>Single Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.SingleOfferRule
	 * @generated
	 */
	EClass getSingleOfferRule();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MultiOfferRule <em>Multi Offer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Offer Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MultiOfferRule
	 * @generated
	 */
	EClass getMultiOfferRule();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.york.cs.eng2.offers.MultiOfferRule#getTriggerRule <em>Trigger Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MultiOfferRule#getTriggerRule()
	 * @see #getMultiOfferRule()
	 * @generated
	 */
	EReference getMultiOfferRule_TriggerRule();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.TriggerRule <em>Trigger Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerRule
	 * @generated
	 */
	EClass getTriggerRule();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerRule#getTrigger()
	 * @see #getTriggerRule()
	 * @generated
	 */
	EAttribute getTriggerRule_Trigger();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.TriggerRule#getSecondaryRule <em>Secondary Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Rule</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerRule#getSecondaryRule()
	 * @see #getTriggerRule()
	 * @generated
	 */
	EReference getTriggerRule_SecondaryRule();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition <em>Min Order Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Order Value Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinOrderValueCondition
	 * @generated
	 */
	EClass getMinOrderValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinimumAmount <em>Minimum Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Amount</em>'.
	 * @see uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinimumAmount()
	 * @see #getMinOrderValueCondition()
	 * @generated
	 */
	EAttribute getMinOrderValueCondition_MinimumAmount();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ContainsProductCondition <em>Contains Product Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Product Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ContainsProductCondition
	 * @generated
	 */
	EClass getContainsProductCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ContainsProductCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ContainsProductCondition#getProduct()
	 * @see #getContainsProductCondition()
	 * @generated
	 */
	EReference getContainsProductCondition_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductTagCondition <em>Product Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Tag Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTagCondition
	 * @generated
	 */
	EClass getProductTagCondition();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.ProductTagCondition#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductTagCondition#getTags()
	 * @see #getProductTagCondition()
	 * @generated
	 */
	EReference getProductTagCondition_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.OrderDateCondition <em>Order Date Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Date Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderDateCondition
	 * @generated
	 */
	EClass getOrderDateCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.OrderDateCondition#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see uk.ac.york.cs.eng2.offers.OrderDateCondition#getDate()
	 * @see #getOrderDateCondition()
	 * @generated
	 */
	EAttribute getOrderDateCondition_Date();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition <em>First NOrders Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First NOrders Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FirstNOrdersCondition
	 * @generated
	 */
	EClass getFirstNOrdersCondition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getNumberOfOrders <em>Number Of Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Orders</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getNumberOfOrders()
	 * @see #getFirstNOrdersCondition()
	 * @generated
	 */
	EAttribute getFirstNOrdersCondition_NumberOfOrders();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getDay()
	 * @see #getFirstNOrdersCondition()
	 * @generated
	 */
	EAttribute getFirstNOrdersCondition_Day();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.FirstNOrdersCondition#getProduct()
	 * @see #getFirstNOrdersCondition()
	 * @generated
	 */
	EReference getFirstNOrdersCondition_Product();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.ProductQuantityCondition <em>Product Quantity Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Quantity Condition</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductQuantityCondition
	 * @generated
	 */
	EClass getProductQuantityCondition();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.york.cs.eng2.offers.ProductQuantityCondition#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductQuantityCondition#getProduct()
	 * @see #getProductQuantityCondition()
	 * @generated
	 */
	EReference getProductQuantityCondition_Product();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.ProductQuantityCondition#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see uk.ac.york.cs.eng2.offers.ProductQuantityCondition#getQuantity()
	 * @see #getProductQuantityCondition()
	 * @generated
	 */
	EAttribute getProductQuantityCondition_Quantity();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Product#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getUnitPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UnitPrice();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.york.cs.eng2.offers.Product#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Product#getTags()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Tags();

	/**
	 * Returns the meta object for class '{@link uk.ac.york.cs.eng2.offers.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.york.cs.eng2.offers.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.york.cs.eng2.offers.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for enum '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see uk.ac.york.cs.eng2.offers.TriggerType
	 * @generated
	 */
	EEnum getTriggerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OffersFactory getOffersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ModelImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();
		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PRODUCTS = eINSTANCE.getModel_Products();
		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TAGS = eINSTANCE.getModel_Tags();
		/**
		 * The meta object literal for the '<em><b>Offer Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OFFER_RULES = eINSTANCE.getModel_OfferRules();
		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CATEGORIES = eINSTANCE.getModel_Categories();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.CategoryImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();
		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();
		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PRODUCTS = eINSTANCE.getCategory_Products();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FixedAmountDiscountActionImpl <em>Fixed Amount Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FixedAmountDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFixedAmountDiscountAction()
		 * @generated
		 */
		EClass FIXED_AMOUNT_DISCOUNT_ACTION = eINSTANCE.getFixedAmountDiscountAction();
		/**
		 * The meta object literal for the '<em><b>Discount Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_AMOUNT_DISCOUNT_ACTION__DISCOUNT_AMOUNT = eINSTANCE.getFixedAmountDiscountAction_DiscountAmount();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl <em>Set Fixed Price Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.SetFixedPriceActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSetFixedPriceAction()
		 * @generated
		 */
		EClass SET_FIXED_PRICE_ACTION = eINSTANCE.getSetFixedPriceAction();
		/**
		 * The meta object literal for the '<em><b>Fixed Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FIXED_PRICE_ACTION__FIXED_PRICE = eINSTANCE.getSetFixedPriceAction_FixedPrice();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_FIXED_PRICE_ACTION__PRODUCT = eINSTANCE.getSetFixedPriceAction_Product();
		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_FIXED_PRICE_ACTION__QUANTITY = eINSTANCE.getSetFixedPriceAction_Quantity();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl <em>Percentage Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.PercentageDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageDiscountAction()
		 * @generated
		 */
		EClass PERCENTAGE_DISCOUNT_ACTION = eINSTANCE.getPercentageDiscountAction();
		/**
		 * The meta object literal for the '<em><b>Discount Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_DISCOUNT_ACTION__DISCOUNT_PERCENTAGE = eINSTANCE.getPercentageDiscountAction_DiscountPercentage();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.PercentageProductDiscountActionImpl <em>Percentage Product Discount Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.PercentageProductDiscountActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getPercentageProductDiscountAction()
		 * @generated
		 */
		EClass PERCENTAGE_PRODUCT_DISCOUNT_ACTION = eINSTANCE.getPercentageProductDiscountAction();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERCENTAGE_PRODUCT_DISCOUNT_ACTION__PRODUCT = eINSTANCE.getPercentageProductDiscountAction_Product();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FreeItemActionImpl <em>Free Item Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FreeItemActionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFreeItemAction()
		 * @generated
		 */
		EClass FREE_ITEM_ACTION = eINSTANCE.getFreeItemAction();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_ITEM_ACTION__PRODUCT = eINSTANCE.getFreeItemAction_Product();
		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_ITEM_ACTION__QUANTITY = eINSTANCE.getFreeItemAction_Quantity();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl <em>Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOfferRule()
		 * @generated
		 */
		EClass OFFER_RULE = eINSTANCE.getOfferRule();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_RULE__NAME = eINSTANCE.getOfferRule_Name();
		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__CONDITIONS = eINSTANCE.getOfferRule_Conditions();
		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFER_RULE__ACTIONS = eINSTANCE.getOfferRule_Actions();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.SingleOfferRuleImpl <em>Single Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.SingleOfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getSingleOfferRule()
		 * @generated
		 */
		EClass SINGLE_OFFER_RULE = eINSTANCE.getSingleOfferRule();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MultiOfferRuleImpl <em>Multi Offer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MultiOfferRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMultiOfferRule()
		 * @generated
		 */
		EClass MULTI_OFFER_RULE = eINSTANCE.getMultiOfferRule();
		/**
		 * The meta object literal for the '<em><b>Trigger Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_OFFER_RULE__TRIGGER_RULE = eINSTANCE.getMultiOfferRule_TriggerRule();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl <em>Trigger Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TriggerRuleImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerRule()
		 * @generated
		 */
		EClass TRIGGER_RULE = eINSTANCE.getTriggerRule();
		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_RULE__TRIGGER = eINSTANCE.getTriggerRule_Trigger();
		/**
		 * The meta object literal for the '<em><b>Secondary Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_RULE__SECONDARY_RULE = eINSTANCE.getTriggerRule_SecondaryRule();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl <em>Min Order Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.MinOrderValueConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getMinOrderValueCondition()
		 * @generated
		 */
		EClass MIN_ORDER_VALUE_CONDITION = eINSTANCE.getMinOrderValueCondition();
		/**
		 * The meta object literal for the '<em><b>Minimum Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_ORDER_VALUE_CONDITION__MINIMUM_AMOUNT = eINSTANCE.getMinOrderValueCondition_MinimumAmount();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ContainsProductConditionImpl <em>Contains Product Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ContainsProductConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getContainsProductCondition()
		 * @generated
		 */
		EClass CONTAINS_PRODUCT_CONDITION = eINSTANCE.getContainsProductCondition();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_PRODUCT_CONDITION__PRODUCT = eINSTANCE.getContainsProductCondition_Product();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl <em>Product Tag Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductTagConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductTagCondition()
		 * @generated
		 */
		EClass PRODUCT_TAG_CONDITION = eINSTANCE.getProductTagCondition();
		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TAG_CONDITION__TAGS = eINSTANCE.getProductTagCondition_Tags();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.OrderDateConditionImpl <em>Order Date Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.OrderDateConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getOrderDateCondition()
		 * @generated
		 */
		EClass ORDER_DATE_CONDITION = eINSTANCE.getOrderDateCondition();
		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DATE_CONDITION__DATE = eINSTANCE.getOrderDateCondition_Date();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl <em>First NOrders Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.FirstNOrdersConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getFirstNOrdersCondition()
		 * @generated
		 */
		EClass FIRST_NORDERS_CONDITION = eINSTANCE.getFirstNOrdersCondition();
		/**
		 * The meta object literal for the '<em><b>Number Of Orders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NORDERS_CONDITION__NUMBER_OF_ORDERS = eINSTANCE.getFirstNOrdersCondition_NumberOfOrders();
		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_NORDERS_CONDITION__DAY = eINSTANCE.getFirstNOrdersCondition_Day();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIRST_NORDERS_CONDITION__PRODUCT = eINSTANCE.getFirstNOrdersCondition_Product();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductQuantityConditionImpl <em>Product Quantity Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductQuantityConditionImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProductQuantityCondition()
		 * @generated
		 */
		EClass PRODUCT_QUANTITY_CONDITION = eINSTANCE.getProductQuantityCondition();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_QUANTITY_CONDITION__PRODUCT = eINSTANCE.getProductQuantityCondition_Product();
		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_QUANTITY_CONDITION__QUANTITY = eINSTANCE.getProductQuantityCondition_Quantity();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.ProductImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();
		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__UNIT_PRICE = eINSTANCE.getProduct_UnitPrice();
		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__TAGS = eINSTANCE.getProduct_Tags();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.impl.TagImpl
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();
		/**
		 * The meta object literal for the '{@link uk.ac.york.cs.eng2.offers.TriggerType <em>Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.york.cs.eng2.offers.TriggerType
		 * @see uk.ac.york.cs.eng2.offers.impl.OffersPackageImpl#getTriggerType()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTriggerType();

	}

} //OffersPackage
