/**
 */
package plccode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.While#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getWhile()
 * @model
 * @generated
 */
public interface While extends Statement {
	/**
	 * Returns the value of the '<em><b>Break Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break Condition</em>' containment reference.
	 * @see #setBreakCondition(Condition)
	 * @see plccode.PlccodePackage#getWhile_BreakCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getBreakCondition();

	/**
	 * Sets the value of the '{@link plccode.While#getBreakCondition <em>Break Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Break Condition</em>' containment reference.
	 * @see #getBreakCondition()
	 * @generated
	 */
	void setBreakCondition(Condition value);

} // While
