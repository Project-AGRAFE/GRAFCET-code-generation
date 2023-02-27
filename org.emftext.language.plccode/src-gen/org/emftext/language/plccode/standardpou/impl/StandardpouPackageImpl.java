/**
 */
package org.emftext.language.plccode.standardpou.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.plccode.PlccodePackage;

import org.emftext.language.plccode.declaration.DeclarationPackage;

import org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl;

import org.emftext.language.plccode.impl.PlccodePackageImpl;

import org.emftext.language.plccode.standardpou.CallGrafcetPou;
import org.emftext.language.plccode.standardpou.CallStandardPou;
import org.emftext.language.plccode.standardpou.F_Trig;
import org.emftext.language.plccode.standardpou.R_Trig;
import org.emftext.language.plccode.standardpou.StandardpouFactory;
import org.emftext.language.plccode.standardpou.StandardpouPackage;
import org.emftext.language.plccode.standardpou.TB_Action;
import org.emftext.language.plccode.standardpou.Time;
import org.emftext.language.plccode.standardpou.TimePou;
import org.emftext.language.plccode.standardpou.Trigger;

import org.emftext.language.plccode.structuredtext.StructuredtextPackage;

import org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardpouPackageImpl extends EPackageImpl implements StandardpouPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callStandardPouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass r_TrigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass f_TrigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tofEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tB_ActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callGrafcetPouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.emftext.language.plccode.standardpou.StandardpouPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StandardpouPackageImpl() {
		super(eNS_URI, StandardpouFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StandardpouPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StandardpouPackage init() {
		if (isInited) return (StandardpouPackage)EPackage.Registry.INSTANCE.getEPackage(StandardpouPackage.eNS_URI);

		// Obtain or create and register package
		StandardpouPackageImpl theStandardpouPackage = (StandardpouPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StandardpouPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StandardpouPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PlccodePackageImpl thePlccodePackage = (PlccodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlccodePackage.eNS_URI) instanceof PlccodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlccodePackage.eNS_URI) : PlccodePackage.eINSTANCE);
		StructuredtextPackageImpl theStructuredtextPackage = (StructuredtextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI) instanceof StructuredtextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI) : StructuredtextPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);

		// Create package meta-data objects
		theStandardpouPackage.createPackageContents();
		thePlccodePackage.createPackageContents();
		theStructuredtextPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();

		// Initialize created meta-data
		theStandardpouPackage.initializePackageContents();
		thePlccodePackage.initializePackageContents();
		theStructuredtextPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStandardpouPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StandardpouPackage.eNS_URI, theStandardpouPackage);
		return theStandardpouPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallStandardPou() {
		return callStandardPouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_CLK() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR_Trig() {
		return r_TrigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getF_Trig() {
		return f_TrigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePou() {
		return timePouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePou_In() {
		return (EAttribute)timePouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimePou_Pt() {
		return (EReference)timePouEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTON() {
		return tonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTOF() {
		return tofEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTB_Action() {
		return tB_ActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTB_Action_Term() {
		return (EAttribute)tB_ActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTB_Action_DelayTime() {
		return (EReference)tB_ActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTB_Action_ResetTime() {
		return (EReference)tB_ActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallGrafcetPou() {
		return callGrafcetPouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallGrafcetPou_Enable() {
		return (EAttribute)callGrafcetPouEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallGrafcetPou_Init() {
		return (EAttribute)callGrafcetPouEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallGrafcetPou_End() {
		return (EAttribute)callGrafcetPouEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Time() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_TimeType() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardpouFactory getStandardpouFactory() {
		return (StandardpouFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callStandardPouEClass = createEClass(CALL_STANDARD_POU);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__CLK);

		r_TrigEClass = createEClass(RTRIG);

		f_TrigEClass = createEClass(FTRIG);

		timePouEClass = createEClass(TIME_POU);
		createEAttribute(timePouEClass, TIME_POU__IN);
		createEReference(timePouEClass, TIME_POU__PT);

		tonEClass = createEClass(TON);

		tofEClass = createEClass(TOF);

		tB_ActionEClass = createEClass(TB_ACTION);
		createEAttribute(tB_ActionEClass, TB_ACTION__TERM);
		createEReference(tB_ActionEClass, TB_ACTION__DELAY_TIME);
		createEReference(tB_ActionEClass, TB_ACTION__RESET_TIME);

		callGrafcetPouEClass = createEClass(CALL_GRAFCET_POU);
		createEAttribute(callGrafcetPouEClass, CALL_GRAFCET_POU__ENABLE);
		createEAttribute(callGrafcetPouEClass, CALL_GRAFCET_POU__INIT);
		createEAttribute(callGrafcetPouEClass, CALL_GRAFCET_POU__END);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__TIME);
		createEAttribute(timeEClass, TIME__TIME_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructuredtextPackage theStructuredtextPackage = (StructuredtextPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI);
		PlccodePackage thePlccodePackage = (PlccodePackage)EPackage.Registry.INSTANCE.getEPackage(PlccodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callStandardPouEClass.getESuperTypes().add(theStructuredtextPackage.getCall());
		triggerEClass.getESuperTypes().add(this.getCallStandardPou());
		r_TrigEClass.getESuperTypes().add(this.getTrigger());
		f_TrigEClass.getESuperTypes().add(this.getTrigger());
		timePouEClass.getESuperTypes().add(this.getCallStandardPou());
		tonEClass.getESuperTypes().add(this.getTimePou());
		tofEClass.getESuperTypes().add(this.getTimePou());
		tB_ActionEClass.getESuperTypes().add(this.getCallStandardPou());
		callGrafcetPouEClass.getESuperTypes().add(theStructuredtextPackage.getCall());

		// Initialize classes and features; add operations and parameters
		initEClass(callStandardPouEClass, CallStandardPou.class, "CallStandardPou", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_CLK(), ecorePackage.getEString(), "CLK", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(r_TrigEClass, R_Trig.class, "R_Trig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(f_TrigEClass, F_Trig.class, "F_Trig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timePouEClass, TimePou.class, "TimePou", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePou_In(), ecorePackage.getEString(), "In", null, 1, 1, TimePou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimePou_Pt(), this.getTime(), null, "pt", null, 1, 1, TimePou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tonEClass, org.emftext.language.plccode.standardpou.TON.class, "TON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tofEClass, org.emftext.language.plccode.standardpou.TOF.class, "TOF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tB_ActionEClass, TB_Action.class, "TB_Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTB_Action_Term(), ecorePackage.getEString(), "Term", null, 1, 1, TB_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTB_Action_DelayTime(), this.getTime(), null, "delayTime", null, 1, 1, TB_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTB_Action_ResetTime(), this.getTime(), null, "resetTime", null, 1, 1, TB_Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callGrafcetPouEClass, CallGrafcetPou.class, "CallGrafcetPou", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallGrafcetPou_Enable(), ecorePackage.getEBoolean(), "enable", null, 1, 1, CallGrafcetPou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallGrafcetPou_Init(), ecorePackage.getEBoolean(), "init", null, 1, 1, CallGrafcetPou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallGrafcetPou_End(), ecorePackage.getEBoolean(), "end", null, 1, 1, CallGrafcetPou.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Time(), ecorePackage.getEInt(), "time", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_TimeType(), thePlccodePackage.getTimeType(), "timeType", null, 1, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //StandardpouPackageImpl
