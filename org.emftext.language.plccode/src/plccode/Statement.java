/**
 */
package plccode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.Statement#getEmbeddedStatements <em>Embedded Statements</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends Expression {
	/**
	 * Returns the value of the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * The list contents are of type {@link plccode.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Statements</em>' containment reference list.
	 * @see plccode.PlccodePackage#getStatement_EmbeddedStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getEmbeddedStatements();

} // Statement
