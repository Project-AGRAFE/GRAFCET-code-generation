/**
 */
package plccode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link plccode.Call#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link plccode.Call#getInstanceVars <em>Instance Vars</em>}</li>
 * </ul>
 *
 * @see plccode.PlccodePackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression {
	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see plccode.PlccodePackage#getCall_InstanceName()
	 * @model required="true"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link plccode.Call#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Vars</b></em>' containment reference list.
	 * The list contents are of type {@link plccode.SuperAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Vars</em>' containment reference list.
	 * @see plccode.PlccodePackage#getCall_InstanceVars()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperAssignment> getInstanceVars();

} // Call
