/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.york.cs.eng2.offers.OffersPackage
 * @generated
 */
public interface OffersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OffersFactory eINSTANCE = uk.ac.york.cs.eng2.offers.impl.OffersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Fixed Amount Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Amount Discount Action</em>'.
	 * @generated
	 */
	FixedAmountDiscountAction createFixedAmountDiscountAction();

	/**
	 * Returns a new object of class '<em>Set Fixed Price Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Fixed Price Action</em>'.
	 * @generated
	 */
	SetFixedPriceAction createSetFixedPriceAction();

	/**
	 * Returns a new object of class '<em>Percentage Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Discount Action</em>'.
	 * @generated
	 */
	PercentageDiscountAction createPercentageDiscountAction();

	/**
	 * Returns a new object of class '<em>Percentage Product Discount Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Percentage Product Discount Action</em>'.
	 * @generated
	 */
	PercentageProductDiscountAction createPercentageProductDiscountAction();

	/**
	 * Returns a new object of class '<em>Free Item Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Item Action</em>'.
	 * @generated
	 */
	FreeItemAction createFreeItemAction();

	/**
	 * Returns a new object of class '<em>Single Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Offer Rule</em>'.
	 * @generated
	 */
	SingleOfferRule createSingleOfferRule();

	/**
	 * Returns a new object of class '<em>Multi Offer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Offer Rule</em>'.
	 * @generated
	 */
	MultiOfferRule createMultiOfferRule();

	/**
	 * Returns a new object of class '<em>Trigger Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Rule</em>'.
	 * @generated
	 */
	TriggerRule createTriggerRule();

	/**
	 * Returns a new object of class '<em>Min Order Value Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Order Value Condition</em>'.
	 * @generated
	 */
	MinOrderValueCondition createMinOrderValueCondition();

	/**
	 * Returns a new object of class '<em>Contains Product Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contains Product Condition</em>'.
	 * @generated
	 */
	ContainsProductCondition createContainsProductCondition();

	/**
	 * Returns a new object of class '<em>Product Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Tag Condition</em>'.
	 * @generated
	 */
	ProductTagCondition createProductTagCondition();

	/**
	 * Returns a new object of class '<em>Order Date Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Date Condition</em>'.
	 * @generated
	 */
	OrderDateCondition createOrderDateCondition();

	/**
	 * Returns a new object of class '<em>First NOrders Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First NOrders Condition</em>'.
	 * @generated
	 */
	FirstNOrdersCondition createFirstNOrdersCondition();

	/**
	 * Returns a new object of class '<em>Product Quantity Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Quantity Condition</em>'.
	 * @generated
	 */
	ProductQuantityCondition createProductQuantityCondition();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OffersPackage getOffersPackage();

} //OffersFactory
