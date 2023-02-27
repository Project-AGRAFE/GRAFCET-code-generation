/**
 */
package org.emftext.language.plccode.standardpou;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TB Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.TB_Action#getTerm <em>Term</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.TB_Action#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.TB_Action#getResetTime <em>Reset Time</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTB_Action()
 * @model
 * @generated
 */
public interface TB_Action extends CallStandardPou {
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
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTB_Action_Term()
	 * @model required="true"
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.TB_Action#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Delay Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Time</em>' containment reference.
	 * @see #setDelayTime(Time)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTB_Action_DelayTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getDelayTime();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.TB_Action#getDelayTime <em>Delay Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Time</em>' containment reference.
	 * @see #getDelayTime()
	 * @generated
	 */
	void setDelayTime(Time value);

	/**
	 * Returns the value of the '<em><b>Reset Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Time</em>' containment reference.
	 * @see #setResetTime(Time)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTB_Action_ResetTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getResetTime();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.TB_Action#getResetTime <em>Reset Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Time</em>' containment reference.
	 * @see #getResetTime()
	 * @generated
	 */
	void setResetTime(Time value);

} // TB_Action
