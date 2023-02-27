/**
 */
package org.emftext.language.plccode.structuredtext;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.plccode.Specification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.structuredtext.StructuredText#getEmbeddedStatements <em>Embedded Statements</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getStructuredText()
 * @model
 * @generated
 */
public interface StructuredText extends Specification {
	/**
	 * Returns the value of the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.plccode.structuredtext.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Statements</em>' containment reference list.
	 * @see org.emftext.language.plccode.structuredtext.StructuredtextPackage#getStructuredText_EmbeddedStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getEmbeddedStatements();

} // StructuredText
