/**
 */
package plccode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.Documentation#getDocuText <em>Docu Text</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Docu Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docu Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docu Text</em>' attribute.
	 * @see #setDocuText(String)
	 * @see plccode.PlccodePackage#getDocumentation_DocuText()
	 * @model required="true"
	 * @generated
	 */
	String getDocuText();

	/**
	 * Sets the value of the '{@link plccode.Documentation#getDocuText <em>Docu Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docu Text</em>' attribute.
	 * @see #getDocuText()
	 * @generated
	 */
	void setDocuText(String value);

} // Documentation
