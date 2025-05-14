/**
 */
package uk.ac.york.cs.eng2.offers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Tag Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.eng2.offers.ProductTagCondition#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductTagCondition()
 * @model
 * @generated
 */
public interface ProductTagCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.eng2.offers.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see uk.ac.york.cs.eng2.offers.OffersPackage#getProductTagCondition_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // ProductTagCondition
