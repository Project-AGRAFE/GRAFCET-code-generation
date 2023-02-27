/**
 */
package plccode.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import plccode.Documentation;
import plccode.PlccodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link plccode.impl.DocumentationImpl#getDocuText <em>Docu Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
	/**
	 * The default value of the '{@link #getDocuText() <em>Docu Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuText()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCU_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocuText() <em>Docu Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuText()
	 * @generated
	 * @ordered
	 */
	protected String docuText = DOCU_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlccodePackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocuText() {
		return docuText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocuText(String newDocuText) {
		String oldDocuText = docuText;
		docuText = newDocuText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.DOCUMENTATION__DOCU_TEXT, oldDocuText, docuText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlccodePackage.DOCUMENTATION__DOCU_TEXT:
				return getDocuText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlccodePackage.DOCUMENTATION__DOCU_TEXT:
				setDocuText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlccodePackage.DOCUMENTATION__DOCU_TEXT:
				setDocuText(DOCU_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlccodePackage.DOCUMENTATION__DOCU_TEXT:
				return DOCU_TEXT_EDEFAULT == null ? docuText != null : !DOCU_TEXT_EDEFAULT.equals(docuText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (docuText: ");
		result.append(docuText);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
