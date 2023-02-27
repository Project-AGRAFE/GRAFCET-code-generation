/**
 */
package org.emftext.language.plccode.standardpou;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.plccode.TimeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.Time#getTime <em>Time</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.Time#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject {
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
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTime_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.Time#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Time Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emftext.language.plccode.TimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Type</em>' attribute.
	 * @see org.emftext.language.plccode.TimeType
	 * @see #setTimeType(TimeType)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTime_TimeType()
	 * @model required="true"
	 * @generated
	 */
	TimeType getTimeType();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.Time#getTimeType <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Type</em>' attribute.
	 * @see org.emftext.language.plccode.TimeType
	 * @see #getTimeType()
	 * @generated
	 */
	void setTimeType(TimeType value);

} // Time
