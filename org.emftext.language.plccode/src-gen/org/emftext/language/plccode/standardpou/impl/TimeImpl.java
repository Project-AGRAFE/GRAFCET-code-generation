/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.emftext.language.plccode.TimeType;

import org.emftext.language.plccode.standardpou.StandardpouPackage;
import org.emftext.language.plccode.standardpou.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TimeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TimeImpl#getTimeType <em>Time Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends EObjectImpl implements Time {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeType TIME_TYPE_EDEFAULT = TimeType.SECONDS;

	/**
	 * The cached value of the '{@link #getTimeType() <em>Time Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeType()
	 * @generated
	 * @ordered
	 */
	protected TimeType timeType = TIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardpouPackage.Literals.TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TIME__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTimeType() {
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeType(TimeType newTimeType) {
		TimeType oldTimeType = timeType;
		timeType = newTimeType == null ? TIME_TYPE_EDEFAULT : newTimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TIME__TIME_TYPE, oldTimeType, timeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardpouPackage.TIME__TIME:
				return getTime();
			case StandardpouPackage.TIME__TIME_TYPE:
				return getTimeType();
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
			case StandardpouPackage.TIME__TIME:
				setTime((Integer)newValue);
				return;
			case StandardpouPackage.TIME__TIME_TYPE:
				setTimeType((TimeType)newValue);
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
			case StandardpouPackage.TIME__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case StandardpouPackage.TIME__TIME_TYPE:
				setTimeType(TIME_TYPE_EDEFAULT);
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
			case StandardpouPackage.TIME__TIME:
				return time != TIME_EDEFAULT;
			case StandardpouPackage.TIME__TIME_TYPE:
				return timeType != TIME_TYPE_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", timeType: ");
		result.append(timeType);
		result.append(')');
		return result.toString();
	}

} //TimeImpl
