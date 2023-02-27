/**
 */
package org.emftext.language.plccode.declaration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.declaration.LocalVariable#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.declaration.DeclarationPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link org.emftext.language.plccode.declaration.PlcVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see org.emftext.language.plccode.declaration.DeclarationPackage#getLocalVariable_Vars()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlcVariable> getVars();

} // LocalVariable
