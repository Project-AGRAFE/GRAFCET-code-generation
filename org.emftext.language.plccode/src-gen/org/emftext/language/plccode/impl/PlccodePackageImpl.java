/**
 */
package org.emftext.language.plccode.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.plccode.DeclarationType;
import org.emftext.language.plccode.Function;
import org.emftext.language.plccode.FunctionBlock;
import org.emftext.language.plccode.PlccodeFactory;
import org.emftext.language.plccode.PlccodePackage;
import org.emftext.language.plccode.PouProgram;
import org.emftext.language.plccode.Program;
import org.emftext.language.plccode.ProgramOrganisationUnit;
import org.emftext.language.plccode.Project;
import org.emftext.language.plccode.Specification;
import org.emftext.language.plccode.Structure;
import org.emftext.language.plccode.TimeType;
import org.emftext.language.plccode.VarType;

import org.emftext.language.plccode.declaration.DeclarationPackage;

import org.emftext.language.plccode.declaration.impl.DeclarationPackageImpl;

import org.emftext.language.plccode.standardpou.StandardpouPackage;

import org.emftext.language.plccode.standardpou.impl.StandardpouPackageImpl;

import org.emftext.language.plccode.structuredtext.StructuredtextPackage;

import org.emftext.language.plccode.structuredtext.impl.StructuredtextPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlccodePackageImpl extends EPackageImpl implements PlccodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programOrganisationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pouProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum declarationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum varTypeEEnum = null;

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
	 * @see org.emftext.language.plccode.PlccodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlccodePackageImpl() {
		super(eNS_URI, PlccodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlccodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlccodePackage init() {
		if (isInited) return (PlccodePackage)EPackage.Registry.INSTANCE.getEPackage(PlccodePackage.eNS_URI);

		// Obtain or create and register package
		PlccodePackageImpl thePlccodePackage = (PlccodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlccodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlccodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StandardpouPackageImpl theStandardpouPackage = (StandardpouPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StandardpouPackage.eNS_URI) instanceof StandardpouPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StandardpouPackage.eNS_URI) : StandardpouPackage.eINSTANCE);
		StructuredtextPackageImpl theStructuredtextPackage = (StructuredtextPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI) instanceof StructuredtextPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI) : StructuredtextPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);

		// Create package meta-data objects
		thePlccodePackage.createPackageContents();
		theStandardpouPackage.createPackageContents();
		theStructuredtextPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();

		// Initialize created meta-data
		thePlccodePackage.initializePackageContents();
		theStandardpouPackage.initializePackageContents();
		theStructuredtextPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlccodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlccodePackage.eNS_URI, thePlccodePackage);
		return thePlccodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramOrganisationUnit() {
		return programOrganisationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramOrganisationUnit_Name() {
		return (EAttribute)programOrganisationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramOrganisationUnit_Interface() {
		return (EReference)programOrganisationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBlock() {
		return functionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Units() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPouProgram() {
		return pouProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPouProgram_Specification() {
		return (EReference)pouProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeclarationType() {
		return declarationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeType() {
		return timeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVarType() {
		return varTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlccodeFactory getPlccodeFactory() {
		return (PlccodeFactory)getEFactoryInstance();
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
		programOrganisationUnitEClass = createEClass(PROGRAM_ORGANISATION_UNIT);
		createEAttribute(programOrganisationUnitEClass, PROGRAM_ORGANISATION_UNIT__NAME);
		createEReference(programOrganisationUnitEClass, PROGRAM_ORGANISATION_UNIT__INTERFACE);

		specificationEClass = createEClass(SPECIFICATION);

		functionBlockEClass = createEClass(FUNCTION_BLOCK);

		functionEClass = createEClass(FUNCTION);

		structureEClass = createEClass(STRUCTURE);

		programEClass = createEClass(PROGRAM);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__UNITS);
		createEAttribute(projectEClass, PROJECT__NAME);

		pouProgramEClass = createEClass(POU_PROGRAM);
		createEReference(pouProgramEClass, POU_PROGRAM__SPECIFICATION);

		// Create enums
		declarationTypeEEnum = createEEnum(DECLARATION_TYPE);
		timeTypeEEnum = createEEnum(TIME_TYPE);
		varTypeEEnum = createEEnum(VAR_TYPE);
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
		StandardpouPackage theStandardpouPackage = (StandardpouPackage)EPackage.Registry.INSTANCE.getEPackage(StandardpouPackage.eNS_URI);
		StructuredtextPackage theStructuredtextPackage = (StructuredtextPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredtextPackage.eNS_URI);
		DeclarationPackage theDeclarationPackage = (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStandardpouPackage);
		getESubpackages().add(theStructuredtextPackage);
		getESubpackages().add(theDeclarationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionBlockEClass.getESuperTypes().add(this.getPouProgram());
		functionEClass.getESuperTypes().add(this.getPouProgram());
		structureEClass.getESuperTypes().add(this.getProgramOrganisationUnit());
		programEClass.getESuperTypes().add(this.getPouProgram());
		pouProgramEClass.getESuperTypes().add(this.getProgramOrganisationUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(programOrganisationUnitEClass, ProgramOrganisationUnit.class, "ProgramOrganisationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramOrganisationUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProgramOrganisationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramOrganisationUnit_Interface(), theDeclarationPackage.getDeclaration(), null, "interface", null, 0, 1, ProgramOrganisationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionBlockEClass, FunctionBlock.class, "FunctionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Units(), this.getProgramOrganisationUnit(), null, "units", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pouProgramEClass, PouProgram.class, "PouProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPouProgram_Specification(), this.getSpecification(), null, "specification", null, 1, 1, PouProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(declarationTypeEEnum, DeclarationType.class, "DeclarationType");
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.GLOBAL);
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.INPUT);
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.OUTPUT);
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.IN_OUT);
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.TEMP);
		addEEnumLiteral(declarationTypeEEnum, DeclarationType.LOCAL);

		initEEnum(timeTypeEEnum, TimeType.class, "TimeType");
		addEEnumLiteral(timeTypeEEnum, TimeType.SECONDS);
		addEEnumLiteral(timeTypeEEnum, TimeType.MILLISECONDS);

		initEEnum(varTypeEEnum, VarType.class, "VarType");
		addEEnumLiteral(varTypeEEnum, VarType.BOOL);
		addEEnumLiteral(varTypeEEnum, VarType.INT);
		addEEnumLiteral(varTypeEEnum, VarType.REAL);

		// Create resource
		createResource(eNS_URI);
	}

} //PlccodePackageImpl
