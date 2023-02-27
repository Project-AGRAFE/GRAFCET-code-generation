/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.plccode.standardpou.StandardpouPackage;
import org.emftext.language.plccode.standardpou.TB_Action;
import org.emftext.language.plccode.standardpou.Time;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TB Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TB_ActionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TB_ActionImpl#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TB_ActionImpl#getResetTime <em>Reset Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TB_ActionImpl extends CallStandardPouImpl implements TB_Action {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelayTime() <em>Delay Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected Time delayTime;

	/**
	 * The cached value of the '{@link #getResetTime() <em>Reset Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected Time resetTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TB_ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardpouPackage.Literals.TB_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TB_ACTION__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDelayTime() {
		return delayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelayTime(Time newDelayTime, NotificationChain msgs) {
		Time oldDelayTime = delayTime;
		delayTime = newDelayTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardpouPackage.TB_ACTION__DELAY_TIME, oldDelayTime, newDelayTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTime(Time newDelayTime) {
		if (newDelayTime != delayTime) {
			NotificationChain msgs = null;
			if (delayTime != null)
				msgs = ((InternalEObject)delayTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TB_ACTION__DELAY_TIME, null, msgs);
			if (newDelayTime != null)
				msgs = ((InternalEObject)newDelayTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TB_ACTION__DELAY_TIME, null, msgs);
			msgs = basicSetDelayTime(newDelayTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TB_ACTION__DELAY_TIME, newDelayTime, newDelayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getResetTime() {
		return resetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResetTime(Time newResetTime, NotificationChain msgs) {
		Time oldResetTime = resetTime;
		resetTime = newResetTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardpouPackage.TB_ACTION__RESET_TIME, oldResetTime, newResetTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetTime(Time newResetTime) {
		if (newResetTime != resetTime) {
			NotificationChain msgs = null;
			if (resetTime != null)
				msgs = ((InternalEObject)resetTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TB_ACTION__RESET_TIME, null, msgs);
			if (newResetTime != null)
				msgs = ((InternalEObject)newResetTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TB_ACTION__RESET_TIME, null, msgs);
			msgs = basicSetResetTime(newResetTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TB_ACTION__RESET_TIME, newResetTime, newResetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StandardpouPackage.TB_ACTION__DELAY_TIME:
				return basicSetDelayTime(null, msgs);
			case StandardpouPackage.TB_ACTION__RESET_TIME:
				return basicSetResetTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StandardpouPackage.TB_ACTION__TERM:
				return getTerm();
			case StandardpouPackage.TB_ACTION__DELAY_TIME:
				return getDelayTime();
			case StandardpouPackage.TB_ACTION__RESET_TIME:
				return getResetTime();
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
			case StandardpouPackage.TB_ACTION__TERM:
				setTerm((String)newValue);
				return;
			case StandardpouPackage.TB_ACTION__DELAY_TIME:
				setDelayTime((Time)newValue);
				return;
			case StandardpouPackage.TB_ACTION__RESET_TIME:
				setResetTime((Time)newValue);
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
			case StandardpouPackage.TB_ACTION__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case StandardpouPackage.TB_ACTION__DELAY_TIME:
				setDelayTime((Time)null);
				return;
			case StandardpouPackage.TB_ACTION__RESET_TIME:
				setResetTime((Time)null);
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
			case StandardpouPackage.TB_ACTION__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case StandardpouPackage.TB_ACTION__DELAY_TIME:
				return delayTime != null;
			case StandardpouPackage.TB_ACTION__RESET_TIME:
				return resetTime != null;
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
		result.append(" (Term: ");
		result.append(term);
		result.append(')');
		return result.toString();
	}

} //TB_ActionImpl
