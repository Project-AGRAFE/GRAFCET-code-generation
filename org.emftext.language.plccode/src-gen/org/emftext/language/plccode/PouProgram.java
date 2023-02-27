/**
 */
package org.emftext.language.plccode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pou Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.PouProgram#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see org.emftext.language.plccode.PlccodePackage#getPouProgram()
 * @model
 * @generated
 */
public interface PouProgram extends ProgramOrganisationUnit {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(Specification)
	 * @see org.emftext.language.plccode.PlccodePackage#getPouProgram_Specification()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link org.emftext.language.plccode.PouProgram#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // PouProgram
