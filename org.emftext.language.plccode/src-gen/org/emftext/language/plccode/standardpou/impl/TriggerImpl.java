/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.plccode.standardpou.StandardpouPackage;
import org.emftext.language.plccode.standardpou.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TriggerImpl#getCLK <em>CLK</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends CallStandardPouImpl implements Trigger {
	/**
	 * The default value of the '{@link #getCLK() <em>CLK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLK()
	 * @generated
	 * @ordered
	 */
	protected static final String CLK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCLK() <em>CLK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLK()
	 * @generated
	 * @ordered
	 */
	protected String clk = CLK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardpouPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCLK() {
		return clk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCLK(String newCLK) {
		String oldCLK = clk;
		clk = newCLK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TRIGGER__CLK, oldCLK, clk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardpouPackage.TRIGGER__CLK:
				return getCLK();
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
			case StandardpouPackage.TRIGGER__CLK:
				setCLK((String)newValue);
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
			case StandardpouPackage.TRIGGER__CLK:
				setCLK(CLK_EDEFAULT);
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
			case StandardpouPackage.TRIGGER__CLK:
				return CLK_EDEFAULT == null ? clk != null : !CLK_EDEFAULT.equals(clk);
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
		result.append(" (CLK: ");
		result.append(clk);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
