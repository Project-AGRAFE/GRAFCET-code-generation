/**
 */
package plccode.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plccode.PlccodePackage;
import plccode.TimeAssignment;
import plccode.TimeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link plccode.impl.TimeAssignmentImpl#getTime <em>Time</em>}</li>
 *   <li>{@link plccode.impl.TimeAssignmentImpl#getTimeType <em>Time Type</em>}</li>
 *   <li>{@link plccode.impl.TimeAssignmentImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeAssignmentImpl extends SuperAssignmentImpl implements TimeAssignment {
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
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected String variable = VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlccodePackage.Literals.TIME_ASSIGNMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.TIME_ASSIGNMENT__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.TIME_ASSIGNMENT__TIME_TYPE, oldTimeType, timeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(String newVariable) {
		String oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.TIME_ASSIGNMENT__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlccodePackage.TIME_ASSIGNMENT__TIME:
				return getTime();
			case PlccodePackage.TIME_ASSIGNMENT__TIME_TYPE:
				return getTimeType();
			case PlccodePackage.TIME_ASSIGNMENT__VARIABLE:
				return getVariable();
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
			case PlccodePackage.TIME_ASSIGNMENT__TIME:
				setTime((Integer)newValue);
				return;
			case PlccodePackage.TIME_ASSIGNMENT__TIME_TYPE:
				setTimeType((TimeType)newValue);
				return;
			case PlccodePackage.TIME_ASSIGNMENT__VARIABLE:
				setVariable((String)newValue);
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
			case PlccodePackage.TIME_ASSIGNMENT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case PlccodePackage.TIME_ASSIGNMENT__TIME_TYPE:
				setTimeType(TIME_TYPE_EDEFAULT);
				return;
			case PlccodePackage.TIME_ASSIGNMENT__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
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
			case PlccodePackage.TIME_ASSIGNMENT__TIME:
				return time != TIME_EDEFAULT;
			case PlccodePackage.TIME_ASSIGNMENT__TIME_TYPE:
				return timeType != TIME_TYPE_EDEFAULT;
			case PlccodePackage.TIME_ASSIGNMENT__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
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
		result.append(", variable: ");
		result.append(variable);
		result.append(')');
		return result.toString();
	}

} //TimeAssignmentImpl
