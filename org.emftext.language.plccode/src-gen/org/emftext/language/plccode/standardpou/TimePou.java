/**
 */
package org.emftext.language.plccode.standardpou;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Pou</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.TimePou#getIn <em>In</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.TimePou#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTimePou()
 * @model
 * @generated
 */
public interface TimePou extends CallStandardPou {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTimePou_In()
	 * @model required="true"
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.TimePou#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference.
	 * @see #setPt(Time)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTimePou_Pt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getPt();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.TimePou#getPt <em>Pt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt</em>' containment reference.
	 * @see #getPt()
	 * @generated
	 */
	void setPt(Time value);

} // TimePou
