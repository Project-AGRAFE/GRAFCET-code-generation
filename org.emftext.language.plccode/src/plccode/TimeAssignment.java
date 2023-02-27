/**
 */
package plccode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.TimeAssignment#getTime <em>Time</em>}</li>
 *   <li>{@link plccode.TimeAssignment#getTimeType <em>Time Type</em>}</li>
 *   <li>{@link plccode.TimeAssignment#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getTimeAssignment()
 * @model
 * @generated
 */
public interface TimeAssignment extends SuperAssignment {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see plccode.PlccodePackage#getTimeAssignment_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link plccode.TimeAssignment#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link plccode.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see plccode.TimeType
	 * @see #setTimeType(TimeType)
	 * @see plccode.PlccodePackage#getTimeAssignment_TimeType()
	 * @model
	 * @generated
	 */
	TimeType getTimeType();

	/**
	 * Sets the value of the '{@link plccode.TimeAssignment#getTimeType <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see plccode.TimeType
	 * @see #getTimeType()
	 * @generated
	 */
	void setTimeType(TimeType value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see plccode.PlccodePackage#getTimeAssignment_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link plccode.TimeAssignment#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // TimeAssignment
