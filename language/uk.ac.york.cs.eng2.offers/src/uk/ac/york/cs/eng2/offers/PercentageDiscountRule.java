/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Percentage Discount Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.PercentageDiscountRule#getDiscountPercentage <em>Discount Percentage</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscountRule()
 * @model
 * @generated
 */
public interface PercentageDiscountRule extends OfferRule {
	/**
	 * Returns the value of the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Percentage</em>' attribute.
	 * @see #setDiscountPercentage(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getPercentageDiscountRule_DiscountPercentage()
	 * @model
	 * @generated
	 */
	float getDiscountPercentage();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.PercentageDiscountRule#getDiscountPercentage <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Percentage</em>' attribute.
	 * @see #getDiscountPercentage()
	 * @generated
	 */
	void setDiscountPercentage(float value);

} // PercentageDiscountRule
