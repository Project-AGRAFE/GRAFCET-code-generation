/**
 */
package plccode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.InputVariable#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getInputVariable()
 * @model
 * @generated
 */
public interface InputVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link plccode.PlcVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see plccode.PlccodePackage#getInputVariable_Vars()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlcVariable> getVars();

} // InputVariable
