/**
 */
package org.emftext.language.plccode.structuredtext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Els If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.structuredtext.ElsIf#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getElsIf()
 * @model
 * @generated
 */
public interface ElsIf extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getElsIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.structuredtext.ElsIf#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // ElsIf
