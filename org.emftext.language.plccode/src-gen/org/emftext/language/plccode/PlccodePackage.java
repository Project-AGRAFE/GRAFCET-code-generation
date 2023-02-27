/**
 */
package org.emftext.language.plccode;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.plccode.PlccodeFactory
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
	PlccodePackage eINSTANCE = org.emftext.language.plccode.impl.PlccodePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.ProgramOrganisationUnitImpl <em>Program Organisation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.ProgramOrganisationUnitImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProgramOrganisationUnit()
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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.SpecificationImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getSpecification()
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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.PouProgramImpl <em>Pou Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.PouProgramImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getPouProgram()
	 * @generated
	 */
	int POU_PROGRAM = 7;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.FunctionBlockImpl <em>Function Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.FunctionBlockImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getFunctionBlock()
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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.FunctionImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getFunction()
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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.StructureImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getStructure()
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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.ProgramImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 5;

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
	 * The meta object id for the '{@link org.emftext.language.plccode.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.impl.ProjectImpl
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 6;

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
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.DeclarationType <em>Declaration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.DeclarationType
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getDeclarationType()
	 * @generated
	 */
	int DECLARATION_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.TimeType <em>Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.TimeType
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.emftext.language.plccode.VarType <em>Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.plccode.VarType
	 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.ProgramOrganisationUnit <em>Program Organisation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Organisation Unit</em>'.
	 * @see org.emftext.language.plccode.ProgramOrganisationUnit
	 * @generated
	 */
	EClass getProgramOrganisationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.ProgramOrganisationUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.plccode.ProgramOrganisationUnit#getName()
	 * @see #getProgramOrganisationUnit()
	 * @generated
	 */
	EAttribute getProgramOrganisationUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.ProgramOrganisationUnit#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.emftext.language.plccode.ProgramOrganisationUnit#getInterface()
	 * @see #getProgramOrganisationUnit()
	 * @generated
	 */
	EReference getProgramOrganisationUnit_Interface();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.emftext.language.plccode.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.FunctionBlock <em>Function Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Block</em>'.
	 * @see org.emftext.language.plccode.FunctionBlock
	 * @generated
	 */
	EClass getFunctionBlock();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.emftext.language.plccode.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see org.emftext.language.plccode.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see org.emftext.language.plccode.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.emftext.language.plccode.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.plccode.Project#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see org.emftext.language.plccode.Project#getUnits()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Units();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.plccode.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.plccode.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.plccode.PouProgram <em>Pou Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pou Program</em>'.
	 * @see org.emftext.language.plccode.PouProgram
	 * @generated
	 */
	EClass getPouProgram();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.plccode.PouProgram#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see org.emftext.language.plccode.PouProgram#getSpecification()
	 * @see #getPouProgram()
	 * @generated
	 */
	EReference getPouProgram_Specification();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.plccode.DeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Declaration Type</em>'.
	 * @see org.emftext.language.plccode.DeclarationType
	 * @generated
	 */
	EEnum getDeclarationType();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.plccode.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Type</em>'.
	 * @see org.emftext.language.plccode.TimeType
	 * @generated
	 */
	EEnum getTimeType();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.plccode.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Var Type</em>'.
	 * @see org.emftext.language.plccode.VarType
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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.ProgramOrganisationUnitImpl <em>Program Organisation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.ProgramOrganisationUnitImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProgramOrganisationUnit()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.SpecificationImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.FunctionBlockImpl <em>Function Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.FunctionBlockImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getFunctionBlock()
		 * @generated
		 */
		EClass FUNCTION_BLOCK = eINSTANCE.getFunctionBlock();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.FunctionImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.StructureImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.ProgramImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.ProjectImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getProject()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.impl.PouProgramImpl <em>Pou Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.impl.PouProgramImpl
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getPouProgram()
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
		 * The meta object literal for the '{@link org.emftext.language.plccode.DeclarationType <em>Declaration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.DeclarationType
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getDeclarationType()
		 * @generated
		 */
		EEnum DECLARATION_TYPE = eINSTANCE.getDeclarationType();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.TimeType <em>Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.TimeType
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getTimeType()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '{@link org.emftext.language.plccode.VarType <em>Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.plccode.VarType
		 * @see org.emftext.language.plccode.impl.PlccodePackageImpl#getVarType()
		 * @generated
		 */
		EEnum VAR_TYPE = eINSTANCE.getVarType();

	}

} //PlccodePackage
