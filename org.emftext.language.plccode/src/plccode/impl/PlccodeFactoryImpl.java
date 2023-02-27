/**
 */
package plccode.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import plccode.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlccodeFactoryImpl extends EFactoryImpl implements PlccodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlccodeFactory init() {
		try {
			PlccodeFactory thePlccodeFactory = (PlccodeFactory)EPackage.Registry.INSTANCE.getEFactory(PlccodePackage.eNS_URI);
			if (thePlccodeFactory != null) {
				return thePlccodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlccodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlccodeFactoryImpl() {
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
			case PlccodePackage.PROGRAM_ORGANISATION_UNIT: return createProgramOrganisationUnit();
			case PlccodePackage.SPECIFICATION: return createSpecification();
			case PlccodePackage.FUNCTION_BLOCK: return createFunctionBlock();
			case PlccodePackage.FUNCTION: return createFunction();
			case PlccodePackage.STRUCTURE: return createStructure();
			case PlccodePackage.STRUCTURED_TEXT: return createStructuredText();
			case PlccodePackage.IF: return createIf();
			case PlccodePackage.WHILE: return createWhile();
			case PlccodePackage.ELS_IF: return createElsIf();
			case PlccodePackage.ELSE: return createElse();
			case PlccodePackage.EXPRESSION: return createExpression();
			case PlccodePackage.STATEMENT: return createStatement();
			case PlccodePackage.COMMENT: return createComment();
			case PlccodePackage.CONDITION: return createCondition();
			case PlccodePackage.CALL: return createCall();
			case PlccodePackage.EMPTY_EXPRESION: return createEmptyExpresion();
			case PlccodePackage.PROGRAM: return createProgram();
			case PlccodePackage.PROJECT: return createProject();
			case PlccodePackage.POU_PROGRAM: return createPouProgram();
			case PlccodePackage.DECLARATION: return createDeclaration();
			case PlccodePackage.INPUT_VARIABLE: return createInputVariable();
			case PlccodePackage.OUTPUT_VARIABLE: return createOutputVariable();
			case PlccodePackage.LOCAL_VARIABLE: return createLocalVariable();
			case PlccodePackage.PLC_VARIABLE: return createPlcVariable();
			case PlccodePackage.TYPE: return createType();
			case PlccodePackage.BOOL: return createBOOL();
			case PlccodePackage.INT: return createINT();
			case PlccodePackage.REAL: return createREAL();
			case PlccodePackage.DERIVED: return createDerived();
			case PlccodePackage.INITIAL_VALUE: return createInitialValue();
			case PlccodePackage.TIME: return createTIME();
			case PlccodePackage.DOCUMENTATION: return createDocumentation();
			case PlccodePackage.GLOBAL_VAR_LIST: return createGlobalVarList();
			case PlccodePackage.ASSIGNMENT: return createAssignment();
			case PlccodePackage.BOOLEAN_ASSIGNMENT: return createBooleanAssignment();
			case PlccodePackage.SUPER_ASSIGNMENT: return createSuperAssignment();
			case PlccodePackage.TIME_ASSIGNMENT: return createTimeAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlccodePackage.DECLARATION_TYPE:
				return createDeclarationTypeFromString(eDataType, initialValue);
			case PlccodePackage.TIME_TYPE:
				return createTimeTypeFromString(eDataType, initialValue);
			case PlccodePackage.VAR_TYPE:
				return createVarTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlccodePackage.DECLARATION_TYPE:
				return convertDeclarationTypeToString(eDataType, instanceValue);
			case PlccodePackage.TIME_TYPE:
				return convertTimeTypeToString(eDataType, instanceValue);
			case PlccodePackage.VAR_TYPE:
				return convertVarTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramOrganisationUnit createProgramOrganisationUnit() {
		ProgramOrganisationUnitImpl programOrganisationUnit = new ProgramOrganisationUnitImpl();
		return programOrganisationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBlock createFunctionBlock() {
		FunctionBlockImpl functionBlock = new FunctionBlockImpl();
		return functionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredText createStructuredText() {
		StructuredTextImpl structuredText = new StructuredTextImpl();
		return structuredText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElsIf createElsIf() {
		ElsIfImpl elsIf = new ElsIfImpl();
		return elsIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else createElse() {
		ElseImpl else_ = new ElseImpl();
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyExpresion createEmptyExpresion() {
		EmptyExpresionImpl emptyExpresion = new EmptyExpresionImpl();
		return emptyExpresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouProgram createPouProgram() {
		PouProgramImpl pouProgram = new PouProgramImpl();
		return pouProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVariable createInputVariable() {
		InputVariableImpl inputVariable = new InputVariableImpl();
		return inputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariable createOutputVariable() {
		OutputVariableImpl outputVariable = new OutputVariableImpl();
		return outputVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariable createLocalVariable() {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlcVariable createPlcVariable() {
		PlcVariableImpl plcVariable = new PlcVariableImpl();
		return plcVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOL createBOOL() {
		BOOLImpl bool = new BOOLImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT createINT() {
		INTImpl int_ = new INTImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REAL createREAL() {
		REALImpl real = new REALImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derived createDerived() {
		DerivedImpl derived = new DerivedImpl();
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialValue createInitialValue() {
		InitialValueImpl initialValue = new InitialValueImpl();
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME createTIME() {
		TIMEImpl time = new TIMEImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarList createGlobalVarList() {
		GlobalVarListImpl globalVarList = new GlobalVarListImpl();
		return globalVarList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAssignment createBooleanAssignment() {
		BooleanAssignmentImpl booleanAssignment = new BooleanAssignmentImpl();
		return booleanAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperAssignment createSuperAssignment() {
		SuperAssignmentImpl superAssignment = new SuperAssignmentImpl();
		return superAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAssignment createTimeAssignment() {
		TimeAssignmentImpl timeAssignment = new TimeAssignmentImpl();
		return timeAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationType createDeclarationTypeFromString(EDataType eDataType, String initialValue) {
		DeclarationType result = DeclarationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclarationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeTypeFromString(EDataType eDataType, String initialValue) {
		TimeType result = TimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarTypeFromString(EDataType eDataType, String initialValue) {
		VarType result = VarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlccodePackage getPlccodePackage() {
		return (PlccodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlccodePackage getPackage() {
		return PlccodePackage.eINSTANCE;
	}

} //PlccodeFactoryImpl
