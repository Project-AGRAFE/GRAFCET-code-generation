/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.plccode.standardpou.CallGrafcetPou;
import org.emftext.language.plccode.standardpou.StandardpouPackage;

import org.emftext.language.plccode.structuredtext.impl.CallImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Grafcet Pou</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl#isEnable <em>Enable</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl#isInit <em>Init</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl#isEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallGrafcetPouImpl extends CallImpl implements CallGrafcetPou {
	/**
	 * The default value of the '{@link #isEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean enable = ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallGrafcetPouImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardpouPackage.Literals.CALL_GRAFCET_POU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable() {
		return enable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(boolean newEnable) {
		boolean oldEnable = enable;
		enable = newEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.CALL_GRAFCET_POU__ENABLE, oldEnable, enable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.CALL_GRAFCET_POU__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(boolean newEnd) {
		boolean oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.CALL_GRAFCET_POU__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardpouPackage.CALL_GRAFCET_POU__ENABLE:
				return isEnable();
			case StandardpouPackage.CALL_GRAFCET_POU__INIT:
				return isInit();
			case StandardpouPackage.CALL_GRAFCET_POU__END:
				return isEnd();
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
			case StandardpouPackage.CALL_GRAFCET_POU__ENABLE:
				setEnable((Boolean)newValue);
				return;
			case StandardpouPackage.CALL_GRAFCET_POU__INIT:
				setInit((Boolean)newValue);
				return;
			case StandardpouPackage.CALL_GRAFCET_POU__END:
				setEnd((Boolean)newValue);
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
			case StandardpouPackage.CALL_GRAFCET_POU__ENABLE:
				setEnable(ENABLE_EDEFAULT);
				return;
			case StandardpouPackage.CALL_GRAFCET_POU__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case StandardpouPackage.CALL_GRAFCET_POU__END:
				setEnd(END_EDEFAULT);
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
			case StandardpouPackage.CALL_GRAFCET_POU__ENABLE:
				return enable != ENABLE_EDEFAULT;
			case StandardpouPackage.CALL_GRAFCET_POU__INIT:
				return init != INIT_EDEFAULT;
			case StandardpouPackage.CALL_GRAFCET_POU__END:
				return end != END_EDEFAULT;
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
		result.append(" (enable: ");
		result.append(enable);
		result.append(", init: ");
		result.append(init);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //CallGrafcetPouImpl
