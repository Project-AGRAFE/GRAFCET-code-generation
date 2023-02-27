/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.emftext.language.plccode.standardpou.StandardpouPackage;
import org.emftext.language.plccode.standardpou.Time;
import org.emftext.language.plccode.standardpou.TimePou;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Pou</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TimePouImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.emftext.language.plccode.standardpou.impl.TimePouImpl#getPt <em>Pt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePouImpl extends CallStandardPouImpl implements TimePou {
	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected String in = IN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPt() <em>Pt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPt()
	 * @generated
	 * @ordered
	 */
	protected Time pt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePouImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardpouPackage.Literals.TIME_POU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(String newIn) {
		String oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TIME_POU__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getPt() {
		return pt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPt(Time newPt, NotificationChain msgs) {
		Time oldPt = pt;
		pt = newPt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardpouPackage.TIME_POU__PT, oldPt, newPt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPt(Time newPt) {
		if (newPt != pt) {
			NotificationChain msgs = null;
			if (pt != null)
				msgs = ((InternalEObject)pt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TIME_POU__PT, null, msgs);
			if (newPt != null)
				msgs = ((InternalEObject)newPt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardpouPackage.TIME_POU__PT, null, msgs);
			msgs = basicSetPt(newPt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardpouPackage.TIME_POU__PT, newPt, newPt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StandardpouPackage.TIME_POU__PT:
				return basicSetPt(null, msgs);
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
			case StandardpouPackage.TIME_POU__IN:
				return getIn();
			case StandardpouPackage.TIME_POU__PT:
				return getPt();
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
			case StandardpouPackage.TIME_POU__IN:
				setIn((String)newValue);
				return;
			case StandardpouPackage.TIME_POU__PT:
				setPt((Time)newValue);
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
			case StandardpouPackage.TIME_POU__IN:
				setIn(IN_EDEFAULT);
				return;
			case StandardpouPackage.TIME_POU__PT:
				setPt((Time)null);
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
			case StandardpouPackage.TIME_POU__IN:
				return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
			case StandardpouPackage.TIME_POU__PT:
				return pt != null;
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
		result.append(" (In: ");
		result.append(in);
		result.append(')');
		return result.toString();
	}

} //TimePouImpl
