/**
 */
package org.emftext.language.plccode.standardpou;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.plccode.structuredtext.StructuredtextPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.plccode.standardpou.StandardpouFactory
 * @model kind="package"
 * @generated
 */
public interface StandardpouPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "standardpou";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.emftext.language.plccode/model/PlcCode/standardpou.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "standardpou";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardpouPackage eINSTANCE = org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.CallStandardPouImpl <em>Call Standard Pou</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.CallStandardPouImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getCallStandardPou()
	 * @generated
	 */
	int CALL_STANDARD_POU = 0;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STANDARD_POU__INSTANCE_NAME = StructuredtextPackage.CALL__INSTANCE_NAME;

	/**
	 * The number of structural features of the '<em>Call Standard Pou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STANDARD_POU_FEATURE_COUNT = StructuredtextPackage.CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TriggerImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__INSTANCE_NAME = CALL_STANDARD_POU__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>CLK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CLK = CALL_STANDARD_POU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = CALL_STANDARD_POU_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.R_TrigImpl <em>RTrig</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.R_TrigImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getR_Trig()
	 * @generated
	 */
	int RTRIG = 2;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRIG__INSTANCE_NAME = TRIGGER__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>CLK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRIG__CLK = TRIGGER__CLK;

	/**
	 * The number of structural features of the '<em>RTrig</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTRIG_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.F_TrigImpl <em>FTrig</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.F_TrigImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getF_Trig()
	 * @generated
	 */
	int FTRIG = 3;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRIG__INSTANCE_NAME = TRIGGER__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>CLK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRIG__CLK = TRIGGER__CLK;

	/**
	 * The number of structural features of the '<em>FTrig</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTRIG_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TimePouImpl <em>Time Pou</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TimePouImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTimePou()
	 * @generated
	 */
	int TIME_POU = 4;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POU__INSTANCE_NAME = CALL_STANDARD_POU__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POU__IN = CALL_STANDARD_POU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POU__PT = CALL_STANDARD_POU_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Pou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POU_FEATURE_COUNT = CALL_STANDARD_POU_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TONImpl <em>TON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TONImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTON()
	 * @generated
	 */
	int TON = 5;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON__INSTANCE_NAME = TIME_POU__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON__IN = TIME_POU__IN;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON__PT = TIME_POU__PT;

	/**
	 * The number of structural features of the '<em>TON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_FEATURE_COUNT = TIME_POU_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TOFImpl <em>TOF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TOFImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTOF()
	 * @generated
	 */
	int TOF = 6;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOF__INSTANCE_NAME = TIME_POU__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOF__IN = TIME_POU__IN;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOF__PT = TIME_POU__PT;

	/**
	 * The number of structural features of the '<em>TOF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOF_FEATURE_COUNT = TIME_POU_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TB_ActionImpl <em>TB Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TB_ActionImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTB_Action()
	 * @generated
	 */
	int TB_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ACTION__INSTANCE_NAME = CALL_STANDARD_POU__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ACTION__TERM = CALL_STANDARD_POU_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ACTION__DELAY_TIME = CALL_STANDARD_POU_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ACTION__RESET_TIME = CALL_STANDARD_POU_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TB Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TB_ACTION_FEATURE_COUNT = CALL_STANDARD_POU_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl <em>Call Grafcet Pou</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getCallGrafcetPou()
	 * @generated
	 */
	int CALL_GRAFCET_POU = 8;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAFCET_POU__INSTANCE_NAME = StructuredtextPackage.CALL__INSTANCE_NAME;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAFCET_POU__ENABLE = StructuredtextPackage.CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAFCET_POU__INIT = StructuredtextPackage.CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAFCET_POU__END = StructuredtextPackage.CALL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call Grafcet Pou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAFCET_POU_FEATURE_COUNT = StructuredtextPackage.CALL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.standardpou.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.standardpou.impl.TimeImpl
	 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 9;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIME = 0;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TIME_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.CallStandardPou <em>Call Standard Pou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Standard Pou</em>'.
	 * @see org.emftext.language.plccode.standardpou.CallStandardPou
	 * @generated
	 */
	EClass getCallStandardPou();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.emftext.language.plccode.standardpou.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.Trigger#getCLK <em>CLK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CLK</em>'.
	 * @see org.emftext.language.plccode.standardpou.Trigger#getCLK()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_CLK();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.R_Trig <em>RTrig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTrig</em>'.
	 * @see org.emftext.language.plccode.standardpou.R_Trig
	 * @generated
	 */
	EClass getR_Trig();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.F_Trig <em>FTrig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTrig</em>'.
	 * @see org.emftext.language.plccode.standardpou.F_Trig
	 * @generated
	 */
	EClass getF_Trig();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.TimePou <em>Time Pou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Pou</em>'.
	 * @see org.emftext.language.plccode.standardpou.TimePou
	 * @generated
	 */
	EClass getTimePou();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.TimePou#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see org.emftext.language.plccode.standardpou.TimePou#getIn()
	 * @see #getTimePou()
	 * @generated
	 */
	EAttribute getTimePou_In();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.standardpou.TimePou#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pt</em>'.
	 * @see org.emftext.language.plccode.standardpou.TimePou#getPt()
	 * @see #getTimePou()
	 * @generated
	 */
	EReference getTimePou_Pt();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.TON <em>TON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TON</em>'.
	 * @see org.emftext.language.plccode.standardpou.TON
	 * @generated
	 */
	EClass getTON();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.TOF <em>TOF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOF</em>'.
	 * @see org.emftext.language.plccode.standardpou.TOF
	 * @generated
	 */
	EClass getTOF();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.TB_Action <em>TB Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TB Action</em>'.
	 * @see org.emftext.language.plccode.standardpou.TB_Action
	 * @generated
	 */
	EClass getTB_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.TB_Action#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.emftext.language.plccode.standardpou.TB_Action#getTerm()
	 * @see #getTB_Action()
	 * @generated
	 */
	EAttribute getTB_Action_Term();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.standardpou.TB_Action#getDelayTime <em>Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delay Time</em>'.
	 * @see org.emftext.language.plccode.standardpou.TB_Action#getDelayTime()
	 * @see #getTB_Action()
	 * @generated
	 */
	EReference getTB_Action_DelayTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.standardpou.TB_Action#getResetTime <em>Reset Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset Time</em>'.
	 * @see org.emftext.language.plccode.standardpou.TB_Action#getResetTime()
	 * @see #getTB_Action()
	 * @generated
	 */
	EReference getTB_Action_ResetTime();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou <em>Call Grafcet Pou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Grafcet Pou</em>'.
	 * @see org.emftext.language.plccode.standardpou.CallGrafcetPou
	 * @generated
	 */
	EClass getCallGrafcetPou();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnable()
	 * @see #getCallGrafcetPou()
	 * @generated
	 */
	EAttribute getCallGrafcetPou_Enable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see org.emftext.language.plccode.standardpou.CallGrafcetPou#isInit()
	 * @see #getCallGrafcetPou()
	 * @generated
	 */
	EAttribute getCallGrafcetPou_Init();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.emftext.language.plccode.standardpou.CallGrafcetPou#isEnd()
	 * @see #getCallGrafcetPou()
	 * @generated
	 */
	EAttribute getCallGrafcetPou_End();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.standardpou.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.emftext.language.plccode.standardpou.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.Time#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.emftext.language.plccode.standardpou.Time#getTime()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.standardpou.Time#getTimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see org.emftext.language.plccode.standardpou.Time#getTimeType()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_TimeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StandardpouFactory getStandardpouFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.CallStandardPouImpl <em>Call Standard Pou</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.CallStandardPouImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getCallStandardPou()
		 * @generated
		 */
		EClass CALL_STANDARD_POU = eINSTANCE.getCallStandardPou();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TriggerImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>CLK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CLK = eINSTANCE.getTrigger_CLK();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.R_TrigImpl <em>RTrig</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.R_TrigImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getR_Trig()
		 * @generated
		 */
		EClass RTRIG = eINSTANCE.getR_Trig();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.F_TrigImpl <em>FTrig</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.F_TrigImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getF_Trig()
		 * @generated
		 */
		EClass FTRIG = eINSTANCE.getF_Trig();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TimePouImpl <em>Time Pou</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TimePouImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTimePou()
		 * @generated
		 */
		EClass TIME_POU = eINSTANCE.getTimePou();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POU__IN = eINSTANCE.getTimePou_In();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_POU__PT = eINSTANCE.getTimePou_Pt();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TONImpl <em>TON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TONImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTON()
		 * @generated
		 */
		EClass TON = eINSTANCE.getTON();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TOFImpl <em>TOF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TOFImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTOF()
		 * @generated
		 */
		EClass TOF = eINSTANCE.getTOF();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TB_ActionImpl <em>TB Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TB_ActionImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTB_Action()
		 * @generated
		 */
		EClass TB_ACTION = eINSTANCE.getTB_Action();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TB_ACTION__TERM = eINSTANCE.getTB_Action_Term();

		/**
		 * The meta object literal for the '<em><b>Delay Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TB_ACTION__DELAY_TIME = eINSTANCE.getTB_Action_DelayTime();

		/**
		 * The meta object literal for the '<em><b>Reset Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TB_ACTION__RESET_TIME = eINSTANCE.getTB_Action_ResetTime();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl <em>Call Grafcet Pou</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.CallGrafcetPouImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getCallGrafcetPou()
		 * @generated
		 */
		EClass CALL_GRAFCET_POU = eINSTANCE.getCallGrafcetPou();

		/**
		 * The meta object literal for the '<em><b>Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_GRAFCET_POU__ENABLE = eINSTANCE.getCallGrafcetPou_Enable();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_GRAFCET_POU__INIT = eINSTANCE.getCallGrafcetPou_Init();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_GRAFCET_POU__END = eINSTANCE.getCallGrafcetPou_End();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.standardpou.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.standardpou.impl.TimeImpl
		 * @see org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TIME = eINSTANCE.getTime_Time();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TIME_TYPE = eINSTANCE.getTime_TimeType();

	}

} //StandardpouPackage
