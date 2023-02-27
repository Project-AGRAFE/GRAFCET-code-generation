/**
 */
package org.emftext.language.plccode.structuredtext;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.structuredtext.Condition#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getCondition_Term()
	 * @model required="true"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.structuredtext.Condition#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

} // Condition
