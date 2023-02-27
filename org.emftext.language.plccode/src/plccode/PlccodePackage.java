/**
 */
package plccode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see plccode.PlccodeFactory
 * @model kind="package"
 * @generated
 */
public interface PlccodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plccode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.emftext.language.plccode/metamodel/plccode.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plccode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlccodePackage eINSTANCE = plccode.impl.PlccodePackageImpl.init();

	/**
	 * The meta object id for the '{@link plccode.impl.ProgramOrganisationUnitImpl <em>Program Organisation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ProgramOrganisationUnitImpl
	 * @see plccode.impl.PlccodePackageImpl#getProgramOrganisationUnit()
	 * @generated
	 */
	int PROGRAM_ORGANISATION_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ORGANISATION_UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ORGANISATION_UNIT__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Program Organisation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ORGANISATION_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program Organisation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_ORGANISATION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.SpecificationImpl
	 * @see plccode.impl.PlccodePackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.PouProgramImpl <em>Pou Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.PouProgramImpl
	 * @see plccode.impl.PlccodePackageImpl#getPouProgram()
	 * @generated
	 */
	int POU_PROGRAM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_PROGRAM__NAME = PROGRAM_ORGANISATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_PROGRAM__INTERFACE = PROGRAM_ORGANISATION_UNIT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_PROGRAM__SPECIFICATION = PROGRAM_ORGANISATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pou Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_PROGRAM_FEATURE_COUNT = PROGRAM_ORGANISATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pou Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_PROGRAM_OPERATION_COUNT = PROGRAM_ORGANISATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.FunctionBlockImpl
	 * @see plccode.impl.PlccodePackageImpl#getFunctionBlock()
	 * @generated
	 */
	int FUNCTION_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__NAME = POU_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__INTERFACE = POU_PROGRAM__INTERFACE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK__SPECIFICATION = POU_PROGRAM__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_FEATURE_COUNT = POU_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BLOCK_OPERATION_COUNT = POU_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.FunctionImpl
	 * @see plccode.impl.PlccodePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = POU_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INTERFACE = POU_PROGRAM__INTERFACE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SPECIFICATION = POU_PROGRAM__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = POU_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = POU_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.StructureImpl
	 * @see plccode.impl.PlccodePackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = PROGRAM_ORGANISATION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__INTERFACE = PROGRAM_ORGANISATION_UNIT__INTERFACE;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = PROGRAM_ORGANISATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_OPERATION_COUNT = PROGRAM_ORGANISATION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.StructuredTextImpl <em>Structured Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.StructuredTextImpl
	 * @see plccode.impl.PlccodePackageImpl#getStructuredText()
	 * @generated
	 */
	int STRUCTURED_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__EMBEDDED_STATEMENTS = SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT_FEATURE_COUNT = SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structured Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT_OPERATION_COUNT = SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ExpressionImpl
	 * @see plccode.impl.PlccodePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.StatementImpl
	 * @see plccode.impl.PlccodePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__EMBEDDED_STATEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.IfImpl
	 * @see plccode.impl.PlccodePackageImpl#getIf()
	 * @generated
	 */
	int IF = 6;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EMBEDDED_STATEMENTS = STATEMENT__EMBEDDED_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSIF = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.WhileImpl
	 * @see plccode.impl.PlccodePackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 7;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__EMBEDDED_STATEMENTS = STATEMENT__EMBEDDED_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Break Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BREAK_CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ElsIfImpl <em>Els If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ElsIfImpl
	 * @see plccode.impl.PlccodePackageImpl#getElsIf()
	 * @generated
	 */
	int ELS_IF = 8;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELS_IF__EMBEDDED_STATEMENTS = STATEMENT__EMBEDDED_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELS_IF__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Els If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELS_IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Els If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELS_IF_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ElseImpl
	 * @see plccode.impl.PlccodePackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 9;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__EMBEDDED_STATEMENTS = STATEMENT__EMBEDDED_STATEMENTS;

	/**
	 * The number of structural features of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.CommentImpl
	 * @see plccode.impl.PlccodePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TEXT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ConditionImpl
	 * @see plccode.impl.PlccodePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TERM = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.CallImpl
	 * @see plccode.impl.PlccodePackageImpl#getCall()
	 * @generated
	 */
	int CALL = 14;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__INSTANCE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__INSTANCE_VARS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.EmptyExpresionImpl <em>Empty Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.EmptyExpresionImpl
	 * @see plccode.impl.PlccodePackageImpl#getEmptyExpresion()
	 * @generated
	 */
	int EMPTY_EXPRESION = 15;

	/**
	 * The number of structural features of the '<em>Empty Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ProgramImpl
	 * @see plccode.impl.PlccodePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = POU_PROGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INTERFACE = POU_PROGRAM__INTERFACE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIFICATION = POU_PROGRAM__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = POU_PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = POU_PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.ProjectImpl
	 * @see plccode.impl.PlccodePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 17;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__UNITS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GLOBAL_VARS = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.DeclarationImpl
	 * @see plccode.impl.PlccodePackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 19;

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
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.InputVariableImpl <em>Input Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.InputVariableImpl
	 * @see plccode.impl.PlccodePackageImpl#getInputVariable()
	 * @generated
	 */
	int INPUT_VARIABLE = 20;

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
	 * The number of operations of the '<em>Input Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.OutputVariableImpl <em>Output Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.OutputVariableImpl
	 * @see plccode.impl.PlccodePackageImpl#getOutputVariable()
	 * @generated
	 */
	int OUTPUT_VARIABLE = 21;

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
	 * The number of operations of the '<em>Output Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.LocalVariableImpl
	 * @see plccode.impl.PlccodePackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 22;

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
	 * The number of operations of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.PlcVariableImpl <em>Plc Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.PlcVariableImpl
	 * @see plccode.impl.PlccodePackageImpl#getPlcVariable()
	 * @generated
	 */
	int PLC_VARIABLE = 23;

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
	 * The number of operations of the '<em>Plc Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLC_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.TypeImpl
	 * @see plccode.impl.PlccodePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 24;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.BOOLImpl <em>BOOL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.BOOLImpl
	 * @see plccode.impl.PlccodePackageImpl#getBOOL()
	 * @generated
	 */
	int BOOL = 25;

	/**
	 * The number of structural features of the '<em>BOOL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BOOL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.INTImpl <em>INT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.INTImpl
	 * @see plccode.impl.PlccodePackageImpl#getINT()
	 * @generated
	 */
	int INT = 26;

	/**
	 * The number of structural features of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>INT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.REALImpl <em>REAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.REALImpl
	 * @see plccode.impl.PlccodePackageImpl#getREAL()
	 * @generated
	 */
	int REAL = 27;

	/**
	 * The number of structural features of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>REAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.DerivedImpl <em>Derived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.DerivedImpl
	 * @see plccode.impl.PlccodePackageImpl#getDerived()
	 * @generated
	 */
	int DERIVED = 28;

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
	 * The number of operations of the '<em>Derived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.InitialValueImpl <em>Initial Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.InitialValueImpl
	 * @see plccode.impl.PlccodePackageImpl#getInitialValue()
	 * @generated
	 */
	int INITIAL_VALUE = 29;

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
	 * The number of operations of the '<em>Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.TIMEImpl <em>TIME</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.TIMEImpl
	 * @see plccode.impl.PlccodePackageImpl#getTIME()
	 * @generated
	 */
	int TIME = 30;

	/**
	 * The number of structural features of the '<em>TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIME</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.DocumentationImpl
	 * @see plccode.impl.PlccodePackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 31;

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
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.GlobalVarListImpl <em>Global Var List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.GlobalVarListImpl
	 * @see plccode.impl.PlccodePackageImpl#getGlobalVarList()
	 * @generated
	 */
	int GLOBAL_VAR_LIST = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_LIST__VARS = 1;

	/**
	 * The number of structural features of the '<em>Global Var List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Global Var List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VAR_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link plccode.impl.SuperAssignmentImpl <em>Super Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.SuperAssignmentImpl
	 * @see plccode.impl.PlccodePackageImpl#getSuperAssignment()
	 * @generated
	 */
	int SUPER_ASSIGNMENT = 35;

	/**
	 * The number of structural features of the '<em>Super Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Super Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_ASSIGNMENT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.AssignmentImpl
	 * @see plccode.impl.PlccodePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = SUPER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE = SUPER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.BooleanAssignmentImpl
	 * @see plccode.impl.PlccodePackageImpl#getBooleanAssignment()
	 * @generated
	 */
	int BOOLEAN_ASSIGNMENT = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VALUE = SUPER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT__VARIABLE = SUPER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.impl.TimeAssignmentImpl <em>Time Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.impl.TimeAssignmentImpl
	 * @see plccode.impl.PlccodePackageImpl#getTimeAssignment()
	 * @generated
	 */
	int TIME_ASSIGNMENT = 36;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSIGNMENT__TIME = SUPER_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSIGNMENT__TIME_TYPE = SUPER_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSIGNMENT__VARIABLE = SUPER_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSIGNMENT_FEATURE_COUNT = SUPER_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ASSIGNMENT_OPERATION_COUNT = SUPER_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link plccode.DeclarationType <em>Declaration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.DeclarationType
	 * @see plccode.impl.PlccodePackageImpl#getDeclarationType()
	 * @generated
	 */
	int DECLARATION_TYPE = 37;

	/**
	 * The meta object id for the '{@link plccode.TimeType <em>Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.TimeType
	 * @see plccode.impl.PlccodePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 38;

	/**
	 * The meta object id for the '{@link plccode.VarType <em>Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see plccode.VarType
	 * @see plccode.impl.PlccodePackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link plccode.ProgramOrganisationUnit <em>Program Organisation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Organisation Unit</em>'.
	 * @see plccode.ProgramOrganisationUnit
	 * @generated
	 */
	EClass getProgramOrganisationUnit();

	/**
	 * Returns the meta object for the attribute '{@link plccode.ProgramOrganisationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plccode.ProgramOrganisationUnit#getName()
	 * @see #getProgramOrganisationUnit()
	 * @generated
	 */
	EAttribute getProgramOrganisationUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.ProgramOrganisationUnit#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see plccode.ProgramOrganisationUnit#getInterface()
	 * @see #getProgramOrganisationUnit()
	 * @generated
	 */
	EReference getProgramOrganisationUnit_Interface();

	/**
	 * Returns the meta object for class '{@link plccode.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see plccode.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for class '{@link plccode.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see plccode.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for class '{@link plccode.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see plccode.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link plccode.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see plccode.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for class '{@link plccode.StructuredText <em>Structured Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Text</em>'.
	 * @see plccode.StructuredText
	 * @generated
	 */
	EClass getStructuredText();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.StructuredText#getEmbeddedStatements <em>Embedded Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Statements</em>'.
	 * @see plccode.StructuredText#getEmbeddedStatements()
	 * @see #getStructuredText()
	 * @generated
	 */
	EReference getStructuredText_EmbeddedStatements();

	/**
	 * Returns the meta object for class '{@link plccode.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see plccode.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see plccode.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.If#getElsif <em>Elsif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsif</em>'.
	 * @see plccode.If#getElsif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elsif();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see plccode.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for class '{@link plccode.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see plccode.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.While#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Break Condition</em>'.
	 * @see plccode.While#getBreakCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_BreakCondition();

	/**
	 * Returns the meta object for class '{@link plccode.ElsIf <em>Els If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Els If</em>'.
	 * @see plccode.ElsIf
	 * @generated
	 */
	EClass getElsIf();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.ElsIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see plccode.ElsIf#getCondition()
	 * @see #getElsIf()
	 * @generated
	 */
	EReference getElsIf_Condition();

	/**
	 * Returns the meta object for class '{@link plccode.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see plccode.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for class '{@link plccode.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see plccode.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link plccode.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see plccode.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.Statement#getEmbeddedStatements <em>Embedded Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Statements</em>'.
	 * @see plccode.Statement#getEmbeddedStatements()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_EmbeddedStatements();

	/**
	 * Returns the meta object for class '{@link plccode.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see plccode.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see plccode.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for class '{@link plccode.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see plccode.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Condition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see plccode.Condition#getTerm()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Term();

	/**
	 * Returns the meta object for class '{@link plccode.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see plccode.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Call#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see plccode.Call#getInstanceName()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_InstanceName();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.Call#getInstanceVars <em>Instance Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Vars</em>'.
	 * @see plccode.Call#getInstanceVars()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_InstanceVars();

	/**
	 * Returns the meta object for class '{@link plccode.EmptyExpresion <em>Empty Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Expresion</em>'.
	 * @see plccode.EmptyExpresion
	 * @generated
	 */
	EClass getEmptyExpresion();

	/**
	 * Returns the meta object for class '{@link plccode.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see plccode.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for class '{@link plccode.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see plccode.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.Project#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see plccode.Project#getUnits()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Units();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plccode.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.Project#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Vars</em>'.
	 * @see plccode.Project#getGlobalVars()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_GlobalVars();

	/**
	 * Returns the meta object for class '{@link plccode.PouProgram <em>Pou Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pou Program</em>'.
	 * @see plccode.PouProgram
	 * @generated
	 */
	EClass getPouProgram();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.PouProgram#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see plccode.PouProgram#getSpecification()
	 * @see #getPouProgram()
	 * @generated
	 */
	EReference getPouProgram_Specification();

	/**
	 * Returns the meta object for class '{@link plccode.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see plccode.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.Declaration#getInputVars <em>Input Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Vars</em>'.
	 * @see plccode.Declaration#getInputVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_InputVars();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.Declaration#getOutputVars <em>Output Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Vars</em>'.
	 * @see plccode.Declaration#getOutputVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_OutputVars();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.Declaration#getLocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Vars</em>'.
	 * @see plccode.Declaration#getLocalVars()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_LocalVars();

	/**
	 * Returns the meta object for class '{@link plccode.InputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variable</em>'.
	 * @see plccode.InputVariable
	 * @generated
	 */
	EClass getInputVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.InputVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see plccode.InputVariable#getVars()
	 * @see #getInputVariable()
	 * @generated
	 */
	EReference getInputVariable_Vars();

	/**
	 * Returns the meta object for class '{@link plccode.OutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variable</em>'.
	 * @see plccode.OutputVariable
	 * @generated
	 */
	EClass getOutputVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.OutputVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see plccode.OutputVariable#getVars()
	 * @see #getOutputVariable()
	 * @generated
	 */
	EReference getOutputVariable_Vars();

	/**
	 * Returns the meta object for class '{@link plccode.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see plccode.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.LocalVariable#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see plccode.LocalVariable#getVars()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_Vars();

	/**
	 * Returns the meta object for class '{@link plccode.PlcVariable <em>Plc Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plc Variable</em>'.
	 * @see plccode.PlcVariable
	 * @generated
	 */
	EClass getPlcVariable();

	/**
	 * Returns the meta object for the attribute '{@link plccode.PlcVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plccode.PlcVariable#getName()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EAttribute getPlcVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.PlcVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see plccode.PlcVariable#getType()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_Type();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.PlcVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see plccode.PlcVariable#getInitialValue()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link plccode.PlcVariable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see plccode.PlcVariable#getDocumentation()
	 * @see #getPlcVariable()
	 * @generated
	 */
	EReference getPlcVariable_Documentation();

	/**
	 * Returns the meta object for class '{@link plccode.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see plccode.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link plccode.BOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOOL</em>'.
	 * @see plccode.BOOL
	 * @generated
	 */
	EClass getBOOL();

	/**
	 * Returns the meta object for class '{@link plccode.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INT</em>'.
	 * @see plccode.INT
	 * @generated
	 */
	EClass getINT();

	/**
	 * Returns the meta object for class '{@link plccode.REAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REAL</em>'.
	 * @see plccode.REAL
	 * @generated
	 */
	EClass getREAL();

	/**
	 * Returns the meta object for class '{@link plccode.Derived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived</em>'.
	 * @see plccode.Derived
	 * @generated
	 */
	EClass getDerived();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Derived#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plccode.Derived#getName()
	 * @see #getDerived()
	 * @generated
	 */
	EAttribute getDerived_Name();

	/**
	 * Returns the meta object for class '{@link plccode.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Value</em>'.
	 * @see plccode.InitialValue
	 * @generated
	 */
	EClass getInitialValue();

	/**
	 * Returns the meta object for the attribute '{@link plccode.InitialValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see plccode.InitialValue#getValue()
	 * @see #getInitialValue()
	 * @generated
	 */
	EAttribute getInitialValue_Value();

	/**
	 * Returns the meta object for class '{@link plccode.TIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIME</em>'.
	 * @see plccode.TIME
	 * @generated
	 */
	EClass getTIME();

	/**
	 * Returns the meta object for class '{@link plccode.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see plccode.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Documentation#getDocuText <em>Docu Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docu Text</em>'.
	 * @see plccode.Documentation#getDocuText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_DocuText();

	/**
	 * Returns the meta object for class '{@link plccode.GlobalVarList <em>Global Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Var List</em>'.
	 * @see plccode.GlobalVarList
	 * @generated
	 */
	EClass getGlobalVarList();

	/**
	 * Returns the meta object for the attribute '{@link plccode.GlobalVarList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see plccode.GlobalVarList#getName()
	 * @see #getGlobalVarList()
	 * @generated
	 */
	EAttribute getGlobalVarList_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link plccode.GlobalVarList#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see plccode.GlobalVarList#getVars()
	 * @see #getGlobalVarList()
	 * @generated
	 */
	EReference getGlobalVarList_Vars();

	/**
	 * Returns the meta object for class '{@link plccode.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see plccode.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see plccode.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link plccode.Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see plccode.Assignment#getVariable()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link plccode.BooleanAssignment <em>Boolean Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Assignment</em>'.
	 * @see plccode.BooleanAssignment
	 * @generated
	 */
	EClass getBooleanAssignment();

	/**
	 * Returns the meta object for the attribute '{@link plccode.BooleanAssignment#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see plccode.BooleanAssignment#isValue()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EAttribute getBooleanAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link plccode.BooleanAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see plccode.BooleanAssignment#getVariable()
	 * @see #getBooleanAssignment()
	 * @generated
	 */
	EAttribute getBooleanAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link plccode.SuperAssignment <em>Super Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Assignment</em>'.
	 * @see plccode.SuperAssignment
	 * @generated
	 */
	EClass getSuperAssignment();

	/**
	 * Returns the meta object for class '{@link plccode.TimeAssignment <em>Time Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Assignment</em>'.
	 * @see plccode.TimeAssignment
	 * @generated
	 */
	EClass getTimeAssignment();

	/**
	 * Returns the meta object for the attribute '{@link plccode.TimeAssignment#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see plccode.TimeAssignment#getTime()
	 * @see #getTimeAssignment()
	 * @generated
	 */
	EAttribute getTimeAssignment_Time();

	/**
	 * Returns the meta object for the attribute '{@link plccode.TimeAssignment#getTimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Type</em>'.
	 * @see plccode.TimeAssignment#getTimeType()
	 * @see #getTimeAssignment()
	 * @generated
	 */
	EAttribute getTimeAssignment_TimeType();

	/**
	 * Returns the meta object for the attribute '{@link plccode.TimeAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see plccode.TimeAssignment#getVariable()
	 * @see #getTimeAssignment()
	 * @generated
	 */
	EAttribute getTimeAssignment_Variable();

	/**
	 * Returns the meta object for enum '{@link plccode.DeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Declaration Type</em>'.
	 * @see plccode.DeclarationType
	 * @generated
	 */
	EEnum getDeclarationType();

	/**
	 * Returns the meta object for enum '{@link plccode.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type</em>'.
	 * @see plccode.TimeType
	 * @generated
	 */
	EEnum getTimeType();

	/**
	 * Returns the meta object for enum '{@link plccode.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Type</em>'.
	 * @see plccode.VarType
	 * @generated
	 */
	EEnum getVarType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlccodeFactory getPlccodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link plccode.impl.ProgramOrganisationUnitImpl <em>Program Organisation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ProgramOrganisationUnitImpl
		 * @see plccode.impl.PlccodePackageImpl#getProgramOrganisationUnit()
		 * @generated
		 */
		EClass PROGRAM_ORGANISATION_UNIT = eINSTANCE.getProgramOrganisationUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_ORGANISATION_UNIT__NAME = eINSTANCE.getProgramOrganisationUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_ORGANISATION_UNIT__INTERFACE = eINSTANCE.getProgramOrganisationUnit_Interface();

		/**
		 * The meta object literal for the '{@link plccode.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.SpecificationImpl
		 * @see plccode.impl.PlccodePackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '{@link plccode.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.FunctionBlockImpl
		 * @see plccode.impl.PlccodePackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '{@link plccode.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.FunctionImpl
		 * @see plccode.impl.PlccodePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link plccode.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.StructureImpl
		 * @see plccode.impl.PlccodePackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '{@link plccode.impl.StructuredTextImpl <em>Structured Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.StructuredTextImpl
		 * @see plccode.impl.PlccodePackageImpl#getStructuredText()
		 * @generated
		 */
		EClass STRUCTURED_TEXT = eINSTANCE.getStructuredText();

		/**
		 * The meta object literal for the '<em><b>Embedded Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_TEXT__EMBEDDED_STATEMENTS = eINSTANCE.getStructuredText_EmbeddedStatements();

		/**
		 * The meta object literal for the '{@link plccode.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.IfImpl
		 * @see plccode.impl.PlccodePackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSE = eINSTANCE.getIf_Else();

		/**
		 * The meta object literal for the '<em><b>Elsif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSIF = eINSTANCE.getIf_Elsif();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '{@link plccode.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.WhileImpl
		 * @see plccode.impl.PlccodePackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Break Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__BREAK_CONDITION = eINSTANCE.getWhile_BreakCondition();

		/**
		 * The meta object literal for the '{@link plccode.impl.ElsIfImpl <em>Els If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ElsIfImpl
		 * @see plccode.impl.PlccodePackageImpl#getElsIf()
		 * @generated
		 */
		EClass ELS_IF = eINSTANCE.getElsIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELS_IF__CONDITION = eINSTANCE.getElsIf_Condition();

		/**
		 * The meta object literal for the '{@link plccode.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ElseImpl
		 * @see plccode.impl.PlccodePackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '{@link plccode.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ExpressionImpl
		 * @see plccode.impl.PlccodePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link plccode.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.StatementImpl
		 * @see plccode.impl.PlccodePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Embedded Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__EMBEDDED_STATEMENTS = eINSTANCE.getStatement_EmbeddedStatements();

		/**
		 * The meta object literal for the '{@link plccode.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.CommentImpl
		 * @see plccode.impl.PlccodePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

		/**
		 * The meta object literal for the '{@link plccode.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ConditionImpl
		 * @see plccode.impl.PlccodePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TERM = eINSTANCE.getCondition_Term();

		/**
		 * The meta object literal for the '{@link plccode.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.CallImpl
		 * @see plccode.impl.PlccodePackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__INSTANCE_NAME = eINSTANCE.getCall_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Instance Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__INSTANCE_VARS = eINSTANCE.getCall_InstanceVars();

		/**
		 * The meta object literal for the '{@link plccode.impl.EmptyExpresionImpl <em>Empty Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.EmptyExpresionImpl
		 * @see plccode.impl.PlccodePackageImpl#getEmptyExpresion()
		 * @generated
		 */
		EClass EMPTY_EXPRESION = eINSTANCE.getEmptyExpresion();

		/**
		 * The meta object literal for the '{@link plccode.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ProgramImpl
		 * @see plccode.impl.PlccodePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '{@link plccode.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.ProjectImpl
		 * @see plccode.impl.PlccodePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__UNITS = eINSTANCE.getProject_Units();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Global Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__GLOBAL_VARS = eINSTANCE.getProject_GlobalVars();

		/**
		 * The meta object literal for the '{@link plccode.impl.PouProgramImpl <em>Pou Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.PouProgramImpl
		 * @see plccode.impl.PlccodePackageImpl#getPouProgram()
		 * @generated
		 */
		EClass POU_PROGRAM = eINSTANCE.getPouProgram();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POU_PROGRAM__SPECIFICATION = eINSTANCE.getPouProgram_Specification();

		/**
		 * The meta object literal for the '{@link plccode.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.DeclarationImpl
		 * @see plccode.impl.PlccodePackageImpl#getDeclaration()
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
		 * The meta object literal for the '{@link plccode.impl.InputVariableImpl <em>Input Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.InputVariableImpl
		 * @see plccode.impl.PlccodePackageImpl#getInputVariable()
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
		 * The meta object literal for the '{@link plccode.impl.OutputVariableImpl <em>Output Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.OutputVariableImpl
		 * @see plccode.impl.PlccodePackageImpl#getOutputVariable()
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
		 * The meta object literal for the '{@link plccode.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.LocalVariableImpl
		 * @see plccode.impl.PlccodePackageImpl#getLocalVariable()
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
		 * The meta object literal for the '{@link plccode.impl.PlcVariableImpl <em>Plc Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.PlcVariableImpl
		 * @see plccode.impl.PlccodePackageImpl#getPlcVariable()
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
		 * The meta object literal for the '{@link plccode.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.TypeImpl
		 * @see plccode.impl.PlccodePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link plccode.impl.BOOLImpl <em>BOOL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.BOOLImpl
		 * @see plccode.impl.PlccodePackageImpl#getBOOL()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBOOL();

		/**
		 * The meta object literal for the '{@link plccode.impl.INTImpl <em>INT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.INTImpl
		 * @see plccode.impl.PlccodePackageImpl#getINT()
		 * @generated
		 */
		EClass INT = eINSTANCE.getINT();

		/**
		 * The meta object literal for the '{@link plccode.impl.REALImpl <em>REAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.REALImpl
		 * @see plccode.impl.PlccodePackageImpl#getREAL()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getREAL();

		/**
		 * The meta object literal for the '{@link plccode.impl.DerivedImpl <em>Derived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.DerivedImpl
		 * @see plccode.impl.PlccodePackageImpl#getDerived()
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
		 * The meta object literal for the '{@link plccode.impl.InitialValueImpl <em>Initial Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.InitialValueImpl
		 * @see plccode.impl.PlccodePackageImpl#getInitialValue()
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
		 * The meta object literal for the '{@link plccode.impl.TIMEImpl <em>TIME</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.TIMEImpl
		 * @see plccode.impl.PlccodePackageImpl#getTIME()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTIME();

		/**
		 * The meta object literal for the '{@link plccode.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.DocumentationImpl
		 * @see plccode.impl.PlccodePackageImpl#getDocumentation()
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

		/**
		 * The meta object literal for the '{@link plccode.impl.GlobalVarListImpl <em>Global Var List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.GlobalVarListImpl
		 * @see plccode.impl.PlccodePackageImpl#getGlobalVarList()
		 * @generated
		 */
		EClass GLOBAL_VAR_LIST = eINSTANCE.getGlobalVarList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VAR_LIST__NAME = eINSTANCE.getGlobalVarList_Name();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_VAR_LIST__VARS = eINSTANCE.getGlobalVarList_Vars();

		/**
		 * The meta object literal for the '{@link plccode.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.AssignmentImpl
		 * @see plccode.impl.PlccodePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

		/**
		 * The meta object literal for the '{@link plccode.impl.BooleanAssignmentImpl <em>Boolean Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.BooleanAssignmentImpl
		 * @see plccode.impl.PlccodePackageImpl#getBooleanAssignment()
		 * @generated
		 */
		EClass BOOLEAN_ASSIGNMENT = eINSTANCE.getBooleanAssignment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ASSIGNMENT__VALUE = eINSTANCE.getBooleanAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ASSIGNMENT__VARIABLE = eINSTANCE.getBooleanAssignment_Variable();

		/**
		 * The meta object literal for the '{@link plccode.impl.SuperAssignmentImpl <em>Super Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.SuperAssignmentImpl
		 * @see plccode.impl.PlccodePackageImpl#getSuperAssignment()
		 * @generated
		 */
		EClass SUPER_ASSIGNMENT = eINSTANCE.getSuperAssignment();

		/**
		 * The meta object literal for the '{@link plccode.impl.TimeAssignmentImpl <em>Time Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.impl.TimeAssignmentImpl
		 * @see plccode.impl.PlccodePackageImpl#getTimeAssignment()
		 * @generated
		 */
		EClass TIME_ASSIGNMENT = eINSTANCE.getTimeAssignment();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ASSIGNMENT__TIME = eINSTANCE.getTimeAssignment_Time();

		/**
		 * The meta object literal for the '<em><b>Time Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ASSIGNMENT__TIME_TYPE = eINSTANCE.getTimeAssignment_TimeType();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ASSIGNMENT__VARIABLE = eINSTANCE.getTimeAssignment_Variable();

		/**
		 * The meta object literal for the '{@link plccode.DeclarationType <em>Declaration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.DeclarationType
		 * @see plccode.impl.PlccodePackageImpl#getDeclarationType()
		 * @generated
		 */
		EEnum DECLARATION_TYPE = eINSTANCE.getDeclarationType();

		/**
		 * The meta object literal for the '{@link plccode.TimeType <em>Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.TimeType
		 * @see plccode.impl.PlccodePackageImpl#getTimeType()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link plccode.VarType <em>Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see plccode.VarType
		 * @see plccode.impl.PlccodePackageImpl#getVarType()
		 * @generated
		 */
		EEnum VAR_TYPE = eINSTANCE.getVarType();

	}

} //PlccodePackage
