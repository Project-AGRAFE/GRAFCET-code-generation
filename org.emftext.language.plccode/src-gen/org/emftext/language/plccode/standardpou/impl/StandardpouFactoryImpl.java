/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.plccode.standardpou.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardpouFactoryImpl extends EFactoryImpl implements StandardpouFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardpouFactory init() {
		try {
			StandardpouFactory theStandardpouFactory = (StandardpouFactory)EPackage.Registry.INSTANCE.getEFactory(StandardpouPackage.eNS_URI);
			if (theStandardpouFactory != null) {
				return theStandardpouFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardpouFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardpouFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StandardpouPackage.CALL_STANDARD_POU: return createCallStandardPou();
			case StandardpouPackage.TRIGGER: return createTrigger();
			case StandardpouPackage.RTRIG: return createR_Trig();
			case StandardpouPackage.FTRIG: return createF_Trig();
			case StandardpouPackage.TIME_POU: return createTimePou();
			case StandardpouPackage.TON: return createTON();
			case StandardpouPackage.TOF: return createTOF();
			case StandardpouPackage.TB_ACTION: return createTB_Action();
			case StandardpouPackage.CALL_GRAFCET_POU: return createCallGrafcetPou();
			case StandardpouPackage.TIME: return createTime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallStandardPou createCallStandardPou() {
		CallStandardPouImpl callStandardPou = new CallStandardPouImpl();
		return callStandardPou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R_Trig createR_Trig() {
		R_TrigImpl r_Trig = new R_TrigImpl();
		return r_Trig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public F_Trig createF_Trig() {
		F_TrigImpl f_Trig = new F_TrigImpl();
		return f_Trig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePou createTimePou() {
		TimePouImpl timePou = new TimePouImpl();
		return timePou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TON createTON() {
		TONImpl ton = new TONImpl();
		return ton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOF createTOF() {
		TOFImpl tof = new TOFImpl();
		return tof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TB_Action createTB_Action() {
		TB_ActionImpl tB_Action = new TB_ActionImpl();
		return tB_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGrafcetPou createCallGrafcetPou() {
		CallGrafcetPouImpl callGrafcetPou = new CallGrafcetPouImpl();
		return callGrafcetPou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardpouPackage getStandardpouPackage() {
		return (StandardpouPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandardpouPackage getPackage() {
		return StandardpouPackage.eINSTANCE;
	}

} //StandardpouFactoryImpl
