/**
 */
package plccode.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import plccode.Condition;
import plccode.PlccodePackage;
import plccode.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link plccode.impl.WhileImpl#getBreakCondition <em>Break Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileImpl extends StatementImpl implements While {
	/**
	 * The cached value of the '{@link #getBreakCondition() <em>Break Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition breakCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlccodePackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getBreakCondition() {
		return breakCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreakCondition(Condition newBreakCondition, NotificationChain msgs) {
		Condition oldBreakCondition = breakCondition;
		breakCondition = newBreakCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlccodePackage.WHILE__BREAK_CONDITION, oldBreakCondition, newBreakCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakCondition(Condition newBreakCondition) {
		if (newBreakCondition != breakCondition) {
			NotificationChain msgs = null;
			if (breakCondition != null)
				msgs = ((InternalEObject)breakCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.WHILE__BREAK_CONDITION, null, msgs);
			if (newBreakCondition != null)
				msgs = ((InternalEObject)newBreakCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.WHILE__BREAK_CONDITION, null, msgs);
			msgs = basicSetBreakCondition(newBreakCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.WHILE__BREAK_CONDITION, newBreakCondition, newBreakCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlccodePackage.WHILE__BREAK_CONDITION:
				return basicSetBreakCondition(null, msgs);
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
			case PlccodePackage.WHILE__BREAK_CONDITION:
				return getBreakCondition();
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
			case PlccodePackage.WHILE__BREAK_CONDITION:
				setBreakCondition((Condition)newValue);
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
			case PlccodePackage.WHILE__BREAK_CONDITION:
				setBreakCondition((Condition)null);
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
			case PlccodePackage.WHILE__BREAK_CONDITION:
				return breakCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
