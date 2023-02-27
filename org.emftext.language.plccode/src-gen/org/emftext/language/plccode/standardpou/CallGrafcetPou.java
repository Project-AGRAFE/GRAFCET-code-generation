/**
 */
package org.emftext.language.plccode.standardpou;

import org.emftext.language.plccode.structuredtext.Call;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Grafcet Pou</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnable <em>Enable</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isInit <em>Init</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getCallGrafcetPou()
 * @model
 * @generated
 */
public interface CallGrafcetPou extends Call {
	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getCallGrafcetPou_Enable()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getCallGrafcetPou_Init()
	 * @model required="true"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(boolean)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getCallGrafcetPou_End()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnd();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isEnd()
	 * @generated
	 */
	void setEnd(boolean value);

} // CallGrafcetPou
