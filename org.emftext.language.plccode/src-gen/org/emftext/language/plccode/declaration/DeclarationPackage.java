/**
 */
package org.emftext.language.plccode.declaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.emftext.language.plccode.declaration.DeclarationFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declaration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.emftext.language.plccode/model/PlcCode/declaration.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declaration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationPackage eINSTANCE = org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Input Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__INPUT_VARS = 0;

	/**
	 * The feature id for the '<em><b>Output Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__OUTPUT_VARS = 1;

	/**
	 * The feature id for the '<em><b>Local Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__LOCAL_VARS = 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.InputVariableImpl <em>Input Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.InputVariableImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getInputVariable()
	 * @generated
	 */
	int INPUT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE__VARS = 0;

	/**
	 * The number of structural features of the '<em>Input Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.OutputVariableImpl <em>Output Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.OutputVariableImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getOutputVariable()
	 * @generated
	 */
	int OUTPUT_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE__VARS = 0;

	/**
	 * The number of structural features of the '<em>Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.LocalVariableImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VARS = 0;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.PlcVariableImpl <em>Plc Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.PlcVariableImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getPlcVariable()
	 * @generated
	 */
	int PLC_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE__INITIAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE__DOCUMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Plc Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.TypeImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.BOOLImpl <em>BOOL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.BOOLImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getBOOL()
	 * @generated
	 */
	int BOOL = 6;

	/**
	 * The number of structural features of the '<em>BOOL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.INTImpl <em>INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.INTImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getINT()
	 * @generated
	 */
	int INT = 7;

	/**
	 * The number of structural features of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.REALImpl <em>REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.REALImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getREAL()
	 * @generated
	 */
	int REAL = 8;

	/**
	 * The number of structural features of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.DerivedImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.InitialValueImpl <em>Initial Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.InitialValueImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getInitialValue()
	 * @generated
	 */
	int INITIAL_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.TIMEImpl <em>TIME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.TIMEImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getTIME()
	 * @generated
	 */
	int TIME = 11;

	/**
	 * The number of structural features of the '<em>TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.declaration.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.declaration.impl.DocumentationImpl
	 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Docu Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DOCU_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see org.emftext.language.plccode.declaration.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.Declaration#getInputVars <em>Input Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.Declaration#getInputVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_InputVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.Declaration#getOutputVars <em>Output Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.Declaration#getOutputVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_OutputVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.Declaration#getLocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.Declaration#getLocalVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_LocalVars();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.InputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variable</em>'.
	 * @see org.emftext.language.plccode.declaration.InputVariable
	 * @generated
	 */
	EClass getInputVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.declaration.InputVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.InputVariable#getVars()
	 * @see #getInputVariable()
	 * @generated
	 */
	EReference getInputVariable_Vars();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.OutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variable</em>'.
	 * @see org.emftext.language.plccode.declaration.OutputVariable
	 * @generated
	 */
	EClass getOutputVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.declaration.OutputVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.OutputVariable#getVars()
	 * @see #getOutputVariable()
	 * @generated
	 */
	EReference getOutputVariable_Vars();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see org.emftext.language.plccode.declaration.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.declaration.LocalVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see org.emftext.language.plccode.declaration.LocalVariable#getVars()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Vars();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.PlcVariable <em>Plc Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plc Variable</em>'.
	 * @see org.emftext.language.plccode.declaration.PlcVariable
	 * @generated
	 */
	EClass getPlcVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.declaration.PlcVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.plccode.declaration.PlcVariable#getName()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EAttribute getPlcVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.PlcVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.emftext.language.plccode.declaration.PlcVariable#getType()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.PlcVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.emftext.language.plccode.declaration.PlcVariable#getInitialValue()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.declaration.PlcVariable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.emftext.language.plccode.declaration.PlcVariable#getDocumentation()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_Documentation();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.emftext.language.plccode.declaration.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.BOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOOL</em>'.
	 * @see org.emftext.language.plccode.declaration.BOOL
	 * @generated
	 */
	EClass getBOOL();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INT</em>'.
	 * @see org.emftext.language.plccode.declaration.INT
	 * @generated
	 */
	EClass getINT();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REAL</em>'.
	 * @see org.emftext.language.plccode.declaration.REAL
	 * @generated
	 */
	EClass getREAL();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see org.emftext.language.plccode.declaration.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.declaration.Derived#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.plccode.declaration.Derived#getName()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Value</em>'.
	 * @see org.emftext.language.plccode.declaration.InitialValue
	 * @generated
	 */
	EClass getInitialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.declaration.InitialValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.plccode.declaration.InitialValue#getValue()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.TIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIME</em>'.
	 * @see org.emftext.language.plccode.declaration.TIME
	 * @generated
	 */
	EClass getTIME();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.declaration.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.emftext.language.plccode.declaration.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.declaration.Documentation#getDocuText <em>Docu Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docu Text</em>'.
	 * @see org.emftext.language.plccode.declaration.Documentation#getDocuText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_DocuText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationFactory getDeclarationFactory();

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
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Input Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__INPUT_VARS = eINSTANCE.getDeclaration_InputVars();

		/**
		 * The meta object literal for the '<em><b>Output Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__OUTPUT_VARS = eINSTANCE.getDeclaration_OutputVars();

		/**
		 * The meta object literal for the '<em><b>Local Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__LOCAL_VARS = eINSTANCE.getDeclaration_LocalVars();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.InputVariableImpl <em>Input Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.InputVariableImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getInputVariable()
		 * @generated
		 */
		EClass INPUT_VARIABLE = eINSTANCE.getInputVariable();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VARIABLE__VARS = eINSTANCE.getInputVariable_Vars();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.OutputVariableImpl <em>Output Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.OutputVariableImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getOutputVariable()
		 * @generated
		 */
		EClass OUTPUT_VARIABLE = eINSTANCE.getOutputVariable();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_VARIABLE__VARS = eINSTANCE.getOutputVariable_Vars();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.LocalVariableImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__VARS = eINSTANCE.getLocalVariable_Vars();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.PlcVariableImpl <em>Plc Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.PlcVariableImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getPlcVariable()
		 * @generated
		 */
		EClass PLC_VARIABLE = eINSTANCE.getPlcVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLC_VARIABLE__NAME = eINSTANCE.getPlcVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLC_VARIABLE__TYPE = eINSTANCE.getPlcVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLC_VARIABLE__INITIAL_VALUE = eINSTANCE.getPlcVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLC_VARIABLE__DOCUMENTATION = eINSTANCE.getPlcVariable_Documentation();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.TypeImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.BOOLImpl <em>BOOL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.BOOLImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getBOOL()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBOOL();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.INTImpl <em>INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.INTImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getINT()
		 * @generated
		 */
		EClass INT = eINSTANCE.getINT();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.REALImpl <em>REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.REALImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getREAL()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getREAL();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.DerivedImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDerived()
		 * @generated
		 */
		EClass DERIVED = eINSTANCE.getDerived();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED__NAME = eINSTANCE.getDerived_Name();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.InitialValueImpl <em>Initial Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.InitialValueImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getInitialValue()
		 * @generated
		 */
		EClass INITIAL_VALUE = eINSTANCE.getInitialValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_VALUE__VALUE = eINSTANCE.getInitialValue_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.TIMEImpl <em>TIME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.TIMEImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getTIME()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTIME();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.declaration.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.declaration.impl.DocumentationImpl
		 * @see org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Docu Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__DOCU_TEXT = eINSTANCE.getDocumentation_DocuText();

	}

} //DeclarationPackage
