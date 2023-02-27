/**
 */
package org.emftext.language.plccode.standardpou;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.Trigger#getCLK <em>CLK</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends CallStandardPou {
	/**
	 * Returns the value of the '<em><b>CLK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CLK</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CLK</em>' attribute.
	 * @see #setCLK(String)
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#getTrigger_CLK()
	 * @model required="true"
	 * @generated
	 */
	String getCLK();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.standardpou.Trigger#getCLK <em>CLK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CLK</em>' attribute.
	 * @see #getCLK()
	 * @generated
	 */
	void setCLK(String value);

} // Trigger
