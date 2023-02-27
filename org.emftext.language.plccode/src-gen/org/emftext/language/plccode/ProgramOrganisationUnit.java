/**
 */
package org.emftext.language.plccode;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.plccode.declaration.Declaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Organisation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.ProgramOrganisationUnit#getName <em>Name</em>}</li>
 *   <li>{@link org.emftext.language.plccode.ProgramOrganisationUnit#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.PlccodePackage#getProgramOrganisationUnit()
 * @model
 * @generated
 */
public interface ProgramOrganisationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.emftext.language.plccode.PlccodePackage#getProgramOrganisationUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.ProgramOrganisationUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Declaration)
	 * @see org.emftext.language.plccode.PlccodePackage#getProgramOrganisationUnit_Interface()
	 * @model containment="true"
	 * @generated
	 */
	Declaration getInterface();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.ProgramOrganisationUnit#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Declaration value);

} // ProgramOrganisationUnit
