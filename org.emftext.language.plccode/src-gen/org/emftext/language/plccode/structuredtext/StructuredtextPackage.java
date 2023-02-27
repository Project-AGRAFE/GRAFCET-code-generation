/**
 */
package org.emftext.language.plccode.structuredtext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.plccode.PlccodePackage;

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
 * @see org.emftext.language.plccode.structuredtext.StructuredtextFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredtextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structuredtext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/org.emftext.language.plccode/model/PlcCode/structuredtext.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structuredtext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredtextPackage eINSTANCE = org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.StructuredTextImpl <em>Structured Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredTextImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getStructuredText()
	 * @generated
	 */
	int STRUCTURED_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Embedded Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT__EMBEDDED_STATEMENTS = PlccodePackage.SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_TEXT_FEATURE_COUNT = PlccodePackage.SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.ExpressionImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.StatementImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 6;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.IfImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getIf()
	 * @generated
	 */
	int IF = 1;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.WhileImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 2;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.ElsIfImpl <em>Els If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.ElsIfImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getElsIf()
	 * @generated
	 */
	int ELS_IF = 3;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.ElseImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 4;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.CommentImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 7;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.AssigmentImpl <em>Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.AssigmentImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getAssigment()
	 * @generated
	 */
	int ASSIGMENT = 8;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGMENT__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.ConditionImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.CallImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 10;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__INSTANCE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.EmptyExpresionImpl <em>Empty Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.EmptyExpresionImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getEmptyExpresion()
	 * @generated
	 */
	int EMPTY_EXPRESION = 11;

	/**
	 * The number of structural features of the '<em>Empty Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_EXPRESION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.structuredtext.impl.BooleanAssigmentImpl <em>Boolean Assigment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.structuredtext.impl.BooleanAssigmentImpl
	 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getBooleanAssigment()
	 * @generated
	 */
	int BOOLEAN_ASSIGMENT = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGMENT__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Assigment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ASSIGMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.StructuredText <em>Structured Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Text</em>'.
	 * @see org.emftext.language.plccode.structuredtext.StructuredText
	 * @generated
	 */
	EClass getStructuredText();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.structuredtext.StructuredText#getEmbeddedStatements <em>Embedded Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Statements</em>'.
	 * @see org.emftext.language.plccode.structuredtext.StructuredText#getEmbeddedStatements()
	 * @see #getStructuredText()
	 * @generated
	 */
	EReference getStructuredText_EmbeddedStatements();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.emftext.language.plccode.structuredtext.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.structuredtext.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.emftext.language.plccode.structuredtext.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.structuredtext.If#getElsif <em>Elsif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsif</em>'.
	 * @see org.emftext.language.plccode.structuredtext.If#getElsif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elsif();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.structuredtext.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftext.language.plccode.structuredtext.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.emftext.language.plccode.structuredtext.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.structuredtext.While#getBreakCondition <em>Break Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Break Condition</em>'.
	 * @see org.emftext.language.plccode.structuredtext.While#getBreakCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_BreakCondition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.ElsIf <em>Els If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Els If</em>'.
	 * @see org.emftext.language.plccode.structuredtext.ElsIf
	 * @generated
	 */
	EClass getElsIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.structuredtext.ElsIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.emftext.language.plccode.structuredtext.ElsIf#getCondition()
	 * @see #getElsIf()
	 * @generated
	 */
	EReference getElsIf_Condition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.structuredtext.Statement#getEmbeddedStatements <em>Embedded Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Embedded Statements</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Statement#getEmbeddedStatements()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_EmbeddedStatements();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.Comment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Comment#getText()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Text();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Assigment <em>Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assigment</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Assigment
	 * @generated
	 */
	EClass getAssigment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.Assigment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Assigment#getVariable()
	 * @see #getAssigment()
	 * @generated
	 */
	EAttribute getAssigment_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.Assigment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Assigment#getValue()
	 * @see #getAssigment()
	 * @generated
	 */
	EAttribute getAssigment_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.Condition#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Condition#getTerm()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Term();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.Call#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see org.emftext.language.plccode.structuredtext.Call#getInstanceName()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_InstanceName();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.EmptyExpresion <em>Empty Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Expresion</em>'.
	 * @see org.emftext.language.plccode.structuredtext.EmptyExpresion
	 * @generated
	 */
	EClass getEmptyExpresion();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.structuredtext.BooleanAssigment <em>Boolean Assigment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Assigment</em>'.
	 * @see org.emftext.language.plccode.structuredtext.BooleanAssigment
	 * @generated
	 */
	EClass getBooleanAssigment();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.BooleanAssigment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.emftext.language.plccode.structuredtext.BooleanAssigment#getVariable()
	 * @see #getBooleanAssigment()
	 * @generated
	 */
	EAttribute getBooleanAssigment_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.structuredtext.BooleanAssigment#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.plccode.structuredtext.BooleanAssigment#isValue()
	 * @see #getBooleanAssigment()
	 * @generated
	 */
	EAttribute getBooleanAssigment_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredtextFactory getStructuredtextFactory();

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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.StructuredTextImpl <em>Structured Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredTextImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getStructuredText()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.IfImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getIf()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.WhileImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getWhile()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.ElsIfImpl <em>Els If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.ElsIfImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getElsIf()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.ElseImpl <em>Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.ElseImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getElse()
		 * @generated
		 */
		EClass ELSE = eINSTANCE.getElse();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.ExpressionImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.StatementImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getStatement()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.CommentImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getComment()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.AssigmentImpl <em>Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.AssigmentImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getAssigment()
		 * @generated
		 */
		EClass ASSIGMENT = eINSTANCE.getAssigment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGMENT__VARIABLE = eINSTANCE.getAssigment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGMENT__VALUE = eINSTANCE.getAssigment_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.ConditionImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.CallImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getCall()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.EmptyExpresionImpl <em>Empty Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.EmptyExpresionImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getEmptyExpresion()
		 * @generated
		 */
		EClass EMPTY_EXPRESION = eINSTANCE.getEmptyExpresion();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.structuredtext.impl.BooleanAssigmentImpl <em>Boolean Assigment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.structuredtext.impl.BooleanAssigmentImpl
		 * @see org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl#getBooleanAssigment()
		 * @generated
		 */
		EClass BOOLEAN_ASSIGMENT = eINSTANCE.getBooleanAssigment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ASSIGMENT__VARIABLE = eINSTANCE.getBooleanAssigment_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ASSIGMENT__VALUE = eINSTANCE.getBooleanAssigment_Value();

	}

} //StructuredtextPackage
