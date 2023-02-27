/**
 */
package org.emftext.language.plccode.structuredtext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.plccode.structuredtext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredtextFactoryImpl extends EFactoryImpl implements StructuredtextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredtextFactory init() {
		try {
			StructuredtextFactory theStructuredtextFactory = (StructuredtextFactory)EPackage.Registry.INSTANCE.getEFactory(StructuredtextPackage.eNS_URI);
			if (theStructuredtextFactory != null) {
				return theStructuredtextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredtextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredtextFactoryImpl() {
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
			case StructuredtextPackage.STRUCTURED_TEXT: return createStructuredText();
			case StructuredtextPackage.IF: return createIf();
			case StructuredtextPackage.WHILE: return createWhile();
			case StructuredtextPackage.ELS_IF: return createElsIf();
			case StructuredtextPackage.ELSE: return createElse();
			case StructuredtextPackage.EXPRESSION: return createExpression();
			case StructuredtextPackage.STATEMENT: return createStatement();
			case StructuredtextPackage.COMMENT: return createComment();
			case StructuredtextPackage.ASSIGMENT: return createAssigment();
			case StructuredtextPackage.CONDITION: return createCondition();
			case StructuredtextPackage.CALL: return createCall();
			case StructuredtextPackage.EMPTY_EXPRESION: return createEmptyExpresion();
			case StructuredtextPackage.BOOLEAN_ASSIGMENT: return createBooleanAssigment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Assigment createAssigment() {
		AssigmentImpl assigment = new AssigmentImpl();
		return assigment;
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
	public BooleanAssigment createBooleanAssigment() {
		BooleanAssigmentImpl booleanAssigment = new BooleanAssigmentImpl();
		return booleanAssigment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredtextPackage getStructuredtextPackage() {
		return (StructuredtextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredtextPackage getPackage() {
		return StructuredtextPackage.eINSTANCE;
	}

} //StructuredtextFactoryImpl
