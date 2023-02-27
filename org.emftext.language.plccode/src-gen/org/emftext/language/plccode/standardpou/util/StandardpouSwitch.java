/**
 */
package org.emftext.language.plccode.standardpou.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.plccode.standardpou.*;

import org.emftext.language.plccode.structuredtext.Call;
import org.emftext.language.plccode.structuredtext.Expression;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage
 * @generated
 */
public class StandardpouSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StandardpouPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardpouSwitch() {
		if (modelPackage == null) {
			modelPackage = StandardpouPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StandardpouPackage.CALL_STANDARD_POU: {
				CallStandardPou callStandardPou = (CallStandardPou)theEObject;
				T result = caseCallStandardPou(callStandardPou);
				if (result == null) result = caseCall(callStandardPou);
				if (result == null) result = caseExpression(callStandardPou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseCallStandardPou(trigger);
				if (result == null) result = caseCall(trigger);
				if (result == null) result = caseExpression(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.RTRIG: {
				R_Trig r_Trig = (R_Trig)theEObject;
				T result = caseR_Trig(r_Trig);
				if (result == null) result = caseTrigger(r_Trig);
				if (result == null) result = caseCallStandardPou(r_Trig);
				if (result == null) result = caseCall(r_Trig);
				if (result == null) result = caseExpression(r_Trig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.FTRIG: {
				F_Trig f_Trig = (F_Trig)theEObject;
				T result = caseF_Trig(f_Trig);
				if (result == null) result = caseTrigger(f_Trig);
				if (result == null) result = caseCallStandardPou(f_Trig);
				if (result == null) result = caseCall(f_Trig);
				if (result == null) result = caseExpression(f_Trig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TIME_POU: {
				TimePou timePou = (TimePou)theEObject;
				T result = caseTimePou(timePou);
				if (result == null) result = caseCallStandardPou(timePou);
				if (result == null) result = caseCall(timePou);
				if (result == null) result = caseExpression(timePou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TON: {
				TON ton = (TON)theEObject;
				T result = caseTON(ton);
				if (result == null) result = caseTimePou(ton);
				if (result == null) result = caseCallStandardPou(ton);
				if (result == null) result = caseCall(ton);
				if (result == null) result = caseExpression(ton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TOF: {
				TOF tof = (TOF)theEObject;
				T result = caseTOF(tof);
				if (result == null) result = caseTimePou(tof);
				if (result == null) result = caseCallStandardPou(tof);
				if (result == null) result = caseCall(tof);
				if (result == null) result = caseExpression(tof);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TB_ACTION: {
				TB_Action tB_Action = (TB_Action)theEObject;
				T result = caseTB_Action(tB_Action);
				if (result == null) result = caseCallStandardPou(tB_Action);
				if (result == null) result = caseCall(tB_Action);
				if (result == null) result = caseExpression(tB_Action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.CALL_GRAFCET_POU: {
				CallGrafcetPou callGrafcetPou = (CallGrafcetPou)theEObject;
				T result = caseCallGrafcetPou(callGrafcetPou);
				if (result == null) result = caseCall(callGrafcetPou);
				if (result == null) result = caseExpression(callGrafcetPou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StandardpouPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Standard Pou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Standard Pou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallStandardPou(CallStandardPou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTrig</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTrig</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR_Trig(R_Trig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTrig</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTrig</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseF_Trig(F_Trig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Pou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Pou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePou(TimePou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTON(TON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOF(TOF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TB Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TB Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTB_Action(TB_Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Grafcet Pou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Grafcet Pou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallGrafcetPou(CallGrafcetPou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StandardpouSwitch
