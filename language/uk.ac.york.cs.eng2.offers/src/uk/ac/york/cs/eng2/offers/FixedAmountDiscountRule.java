/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Amount Discount Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.FixedAmountDiscountRule#getDiscountAmount <em>Discount Amount</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFixedAmountDiscountRule()
 * @model
 * @generated
 */
public interface FixedAmountDiscountRule extends OfferRule {
	/**
	 * Returns the value of the '<em><b>Discount Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Amount</em>' attribute.
	 * @see #setDiscountAmount(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getFixedAmountDiscountRule_DiscountAmount()
	 * @model
	 * @generated
	 */
	float getDiscountAmount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.FixedAmountDiscountRule#getDiscountAmount <em>Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Amount</em>' attribute.
	 * @see #getDiscountAmount()
	 * @generated
	 */
	void setDiscountAmount(float value);

} // FixedAmountDiscountRule
