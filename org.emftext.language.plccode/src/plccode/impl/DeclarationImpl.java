/**
 */
package plccode.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import plccode.Declaration;
import plccode.InputVariable;
import plccode.LocalVariable;
import plccode.OutputVariable;
import plccode.PlccodePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link plccode.impl.DeclarationImpl#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link plccode.impl.DeclarationImpl#getOutputVars <em>Output Vars</em>}</li>
 *   <li>{@link plccode.impl.DeclarationImpl#getLocalVars <em>Local Vars</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration {
	/**
	 * The cached value of the '{@link #getInputVars() <em>Input Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVars()
	 * @generated
	 * @ordered
	 */
	protected InputVariable inputVars;

	/**
	 * The cached value of the '{@link #getOutputVars() <em>Output Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVars()
	 * @generated
	 * @ordered
	 */
	protected OutputVariable outputVars;

	/**
	 * The cached value of the '{@link #getLocalVars() <em>Local Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVars()
	 * @generated
	 * @ordered
	 */
	protected LocalVariable localVars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlccodePackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVariable getInputVars() {
		return inputVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputVars(InputVariable newInputVars, NotificationChain msgs) {
		InputVariable oldInputVars = inputVars;
		inputVars = newInputVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__INPUT_VARS, oldInputVars, newInputVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVars(InputVariable newInputVars) {
		if (newInputVars != inputVars) {
			NotificationChain msgs = null;
			if (inputVars != null)
				msgs = ((InternalEObject)inputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__INPUT_VARS, null, msgs);
			if (newInputVars != null)
				msgs = ((InternalEObject)newInputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__INPUT_VARS, null, msgs);
			msgs = basicSetInputVars(newInputVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__INPUT_VARS, newInputVars, newInputVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariable getOutputVars() {
		return outputVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputVars(OutputVariable newOutputVars, NotificationChain msgs) {
		OutputVariable oldOutputVars = outputVars;
		outputVars = newOutputVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__OUTPUT_VARS, oldOutputVars, newOutputVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVars(OutputVariable newOutputVars) {
		if (newOutputVars != outputVars) {
			NotificationChain msgs = null;
			if (outputVars != null)
				msgs = ((InternalEObject)outputVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__OUTPUT_VARS, null, msgs);
			if (newOutputVars != null)
				msgs = ((InternalEObject)newOutputVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__OUTPUT_VARS, null, msgs);
			msgs = basicSetOutputVars(newOutputVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__OUTPUT_VARS, newOutputVars, newOutputVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable getLocalVars() {
		return localVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalVars(LocalVariable newLocalVars, NotificationChain msgs) {
		LocalVariable oldLocalVars = localVars;
		localVars = newLocalVars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__LOCAL_VARS, oldLocalVars, newLocalVars);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalVars(LocalVariable newLocalVars) {
		if (newLocalVars != localVars) {
			NotificationChain msgs = null;
			if (localVars != null)
				msgs = ((InternalEObject)localVars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__LOCAL_VARS, null, msgs);
			if (newLocalVars != null)
				msgs = ((InternalEObject)newLocalVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlccodePackage.DECLARATION__LOCAL_VARS, null, msgs);
			msgs = basicSetLocalVars(newLocalVars, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlccodePackage.DECLARATION__LOCAL_VARS, newLocalVars, newLocalVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlccodePackage.DECLARATION__INPUT_VARS:
				return basicSetInputVars(null, msgs);
			case PlccodePackage.DECLARATION__OUTPUT_VARS:
				return basicSetOutputVars(null, msgs);
			case PlccodePackage.DECLARATION__LOCAL_VARS:
				return basicSetLocalVars(null, msgs);
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
			case PlccodePackage.DECLARATION__INPUT_VARS:
				return getInputVars();
			case PlccodePackage.DECLARATION__OUTPUT_VARS:
				return getOutputVars();
			case PlccodePackage.DECLARATION__LOCAL_VARS:
				return getLocalVars();
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
			case PlccodePackage.DECLARATION__INPUT_VARS:
				setInputVars((InputVariable)newValue);
				return;
			case PlccodePackage.DECLARATION__OUTPUT_VARS:
				setOutputVars((OutputVariable)newValue);
				return;
			case PlccodePackage.DECLARATION__LOCAL_VARS:
				setLocalVars((LocalVariable)newValue);
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
			case PlccodePackage.DECLARATION__INPUT_VARS:
				setInputVars((InputVariable)null);
				return;
			case PlccodePackage.DECLARATION__OUTPUT_VARS:
				setOutputVars((OutputVariable)null);
				return;
			case PlccodePackage.DECLARATION__LOCAL_VARS:
				setLocalVars((LocalVariable)null);
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
			case PlccodePackage.DECLARATION__INPUT_VARS:
				return inputVars != null;
			case PlccodePackage.DECLARATION__OUTPUT_VARS:
				return outputVars != null;
			case PlccodePackage.DECLARATION__LOCAL_VARS:
				return localVars != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
