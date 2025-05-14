/**
 */
package uk.ac.york.cs.eng2.offers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Order Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinimumAmount <em>Minimum Amount</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinOrderValueCondition()
 * @model
 * @generated
 */
public interface MinOrderValueCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Minimum Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Amount</em>' attribute.
	 * @see #setMinimumAmount(float)
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getMinOrderValueCondition_MinimumAmount()
	 * @model
	 * @generated
	 */
	float getMinimumAmount();

	/**
	 * Sets the value of the '{@link uk.ac.york.cs.eng2.offers.MinOrderValueCondition#getMinimumAmount <em>Minimum Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Amount</em>' attribute.
	 * @see #getMinimumAmount()
	 * @generated
	 */
	void setMinimumAmount(float value);

} // MinOrderValueCondition
