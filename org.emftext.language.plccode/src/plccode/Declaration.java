/**
 */
package plccode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.Declaration#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link plccode.Declaration#getOutputVars <em>Output Vars</em>}</li>
 *   <li>{@link plccode.Declaration#getLocalVars <em>Local Vars</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Vars</em>' containment reference.
	 * @see #setInputVars(InputVariable)
	 * @see plccode.PlccodePackage#getDeclaration_InputVars()
	 * @model containment="true"
	 * @generated
	 */
	InputVariable getInputVars();

	/**
	 * Sets the value of the '{@link plccode.Declaration#getInputVars <em>Input Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Vars</em>' containment reference.
	 * @see #getInputVars()
	 * @generated
	 */
	void setInputVars(InputVariable value);

	/**
	 * Returns the value of the '<em><b>Output Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Vars</em>' containment reference.
	 * @see #setOutputVars(OutputVariable)
	 * @see plccode.PlccodePackage#getDeclaration_OutputVars()
	 * @model containment="true"
	 * @generated
	 */
	OutputVariable getOutputVars();

	/**
	 * Sets the value of the '{@link plccode.Declaration#getOutputVars <em>Output Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Vars</em>' containment reference.
	 * @see #getOutputVars()
	 * @generated
	 */
	void setOutputVars(OutputVariable value);

	/**
	 * Returns the value of the '<em><b>Local Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Vars</em>' containment reference.
	 * @see #setLocalVars(LocalVariable)
	 * @see plccode.PlccodePackage#getDeclaration_LocalVars()
	 * @model containment="true"
	 * @generated
	 */
	LocalVariable getLocalVars();

	/**
	 * Sets the value of the '{@link plccode.Declaration#getLocalVars <em>Local Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Vars</em>' containment reference.
	 * @see #getLocalVars()
	 * @generated
	 */
	void setLocalVars(LocalVariable value);

} // Declaration
