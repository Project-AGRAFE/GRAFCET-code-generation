package org.eclipse.emf.grafcet2plccode.commands;


import de.hsu.grafcet.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.naming.directory.InvalidAttributeValueException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import plccode.*;
import plccode.Condition;
import terms.*;
import terms.Integer;

//import org.emftext.language.plccode.src.plccode;



public class generatePlcModel {

	private String stepName ="Step_";
	private String macStepName ="MacStep_";
	private String enStepName ="EncStep_";
	private String entryStepName ="E_";
	private String exitStepName ="S_";
	private String tranName ="T_";
	
	private String tbTranName ="TbAct_T_";
	private String tbActName ="TbAct_A_";
	private String rEdgeTranName ="RTrig_T_";
	private String fEdgeTranName ="FTrig_T_";
	private String rEdgeActName ="RTrig_A_";
	private String fEdgeActName ="FTrig_A_";
	
	private String rTriggerName = "R_TRIG";
	private String fTriggerName = "F_TRIG";
	private String TBActionFBName = "TimeBasedAction";
	
	private String FBNameaddition = "PartialGrafcet_";
	
	private List<Step> steps = new ArrayList<Step>();
	private List<Node> allSteps = new ArrayList<Node>();
	private List<Macrostep> macroSteps = new ArrayList<Macrostep>();
	private List<EnclosingStep> enclosingsteps = new ArrayList<EnclosingStep>();
	private List<EntryStep> entrySteps = new ArrayList<EntryStep>();
	private List<ExitStep> exitSteps = new ArrayList<ExitStep>();
	private List<Synchronization> syncs = new ArrayList<Synchronization>();
	private List<Arc> arcs = new ArrayList<Arc>();
	private List<Transition> transitions = new ArrayList<Transition>();
	private List<MacrostepExpansion> macroStepExpansions = new ArrayList<MacrostepExpansion>();
	private List<PartialGrafcet> partialGrafcets = new ArrayList<PartialGrafcet>();
	private List<ContinuousAction> conActions = new ArrayList<ContinuousAction>();
	private List<StoredAction> stActions = new ArrayList<StoredAction>();
	private List<ForcingOrder> forcingOrders = new ArrayList<ForcingOrder>();
	private List<ActionLink> actionLink = new ArrayList<ActionLink>();
	private IFile model;
	
	/**
	 * Grafcet model
	 */
	private Grafcet grafDoc;
	
	/**
	 * PLC model
	 */
	private Project PlcDoc;
		
	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;
	
	/**
	 * The output folder.
	 */
	private PlcModelHelper helper;
	
	public generatePlcModel(URI modelURI, IContainer targetFolder, List<? extends Object> arguments, IFile model) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
		this.model = model;
		this.helper = new PlcModelHelper();
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.getResource(modelURI,	true);
		grafDoc =  (Grafcet)res.getContents().get(0);
	}
	
	public void rungeneration(){
		TreeIterator<EObject> iterator = grafDoc.eAllContents();
		
		PlcDoc = PlccodeFactory.eINSTANCE.createProject();
		PlcDoc.setName(this.model.getName().substring(0,this.model.getName().lastIndexOf(".grafcet")));
		FunctionBlock globalfb =  PlccodeFactory.eINSTANCE.createFunctionBlock();
		
		GlobalVarList glVarList = PlccodeFactory.eINSTANCE.createGlobalVarList();
		GlobalVarList glPartialGrafcets = PlccodeFactory.eINSTANCE.createGlobalVarList();
		glVarList.setName("Global_GrafcetVars");	//TODO updated
		glPartialGrafcets.setName("Global_GrafcetParts");
		globalfb.setName("Grafcet_Control");
		
		PlcDoc.getUnits().add(globalfb);
		
		PlcDoc.getGlobalVars().add(glVarList);
		PlcDoc.getGlobalVars().add(glPartialGrafcets);
		
		glVarList = genStepVar(glVarList, grafDoc);
		glVarList = genInterpretationVar(glVarList, grafDoc);	//TODO added
		globalfb = genGrafcetFrame(globalfb, grafDoc, glVarList,1);
		glPartialGrafcets.getVars().add(PlcModelHelper.genFbVar("Global_Grafcet","Grafcet_Control"));
		
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof MacrostepExpansion || object instanceof PartialGrafcet) {
			
				FunctionBlock fb =  PlccodeFactory.eINSTANCE.createFunctionBlock();
				
				int mod = 0;
				String fbName = null;
				if(object instanceof PartialGrafcet) {
					mod = 2;
					fbName=((PartialGrafcet)object).getName();
					glPartialGrafcets.getVars().add(PlcModelHelper.genFbVar(FBNameaddition+fbName,fbName));
				}
				else if (object instanceof MacrostepExpansion) {
					mod = 3;
					fbName=((MacrostepExpansion)object).getName();
					glPartialGrafcets.getVars().add(PlcModelHelper.genFbVar(FBNameaddition+fbName,fbName));
				}
				fb = genGrafcetFrame(fb, (Grafcet)object, glVarList, mod);
				fb.setName(fbName);
				PlcDoc.getUnits().add(fb);
			}
		}
		
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the default resource factory -- only needed for stand-alone!
		// this tells EMF to use XML to save the model
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		// Get the URI of the model file.
		//URI fileURI = URI.createFileURI( targetFolder.getLocation().toString());
		File newplcfile = new File(targetFolder.getLocation().toString() + "/gen_" + this.model.getName().substring(0, this.model.getName().lastIndexOf(".grafcet"))+".xmi");
		URI fileURI = URI.createFileURI(newplcfile.getAbsolutePath());
		// Create a resource for this file.
		//Resource resource = resourceSet.createResource(fileURI);
		Resource resource = resourceSet.createResource(fileURI);
		// Add the model objects to the contents.
		resource.getContents().add(PlcDoc);
		// Save the contents of the resource to the file system.
		try
		{
		    resource.save(Collections.EMPTY_MAP); // the map can pass special saving options to the operation
		} catch (IOException e) {
		    /* error handling */
			System.err.println("Problem writing to the file statsTest.txt");
		}
	}
	
	private GlobalVarList genStepVar(GlobalVarList struc, Grafcet chart){
		TreeIterator<EObject> iterator = chart.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Step) {
				struc.getVars().add(PlcModelHelper.genBooleanVar("act"+ stepName + ((Step)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar("deact"+ stepName + ((Step)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar( stepName + ((Step)object).getId(),false));								
			}
			if (object instanceof Macrostep) {
				struc.getVars().add(PlcModelHelper.genBooleanVar("act"+ macStepName + ((Macrostep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar("deact"+ macStepName + ((Macrostep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar( macStepName + ((Macrostep)object).getId(),false));							
			}
			if (object instanceof EnclosingStep) {
				struc.getVars().add(PlcModelHelper.genBooleanVar("act"+ enStepName + ((EnclosingStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar("deact"+ enStepName+ ((EnclosingStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar( enStepName + ((EnclosingStep)object).getId(),false));							
			}
			if (object instanceof EntryStep) {
				struc.getVars().add(PlcModelHelper.genBooleanVar("act"+ entryStepName+ ((EntryStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar("deact"+ entryStepName+ ((EntryStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar( entryStepName + ((EntryStep)object).getId(),false));						
			}
			if (object instanceof ExitStep) {
				struc.getVars().add(PlcModelHelper.genBooleanVar("act"+ exitStepName + ((ExitStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar("deact"+ exitStepName+ ((ExitStep)object).getId(),false));
				struc.getVars().add(PlcModelHelper.genBooleanVar( exitStepName + ((ExitStep)object).getId(),false));			
			}
		}
		return struc;
	}
	
	/**
	 * Generates a global variable list for all input, output and internal variables, except step variables.
	 * @param struc
	 * @param chart
	 * @return
	 */
	private GlobalVarList genInterpretationVar(GlobalVarList struc, Grafcet chart){
		TreeIterator<EObject> iterator = chart.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof VariableDeclaration) {
				if (!((VariableDeclaration)object).getVariableDeclarationType().equals(VariableDeclarationType.STEP)) {
					if (((VariableDeclaration)object).getSort() instanceof Bool){
						struc.getVars().add(PlcModelHelper.genBooleanVar(((VariableDeclaration)object).getName(),false));
					}
					else if (((VariableDeclaration)object).getSort() instanceof Integer){
						struc.getVars().add(genIntegerVar(((VariableDeclaration)object).getName(),0));
					}
				}
			}
		}
		return struc;
	}
	
	private FunctionBlock genTranVar(FunctionBlock fb, Grafcet chart){
		TreeIterator<EObject> iterator = chart.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			
			if (object instanceof Transition) {
				
				if(object.eContainer() == chart){
					fb.getInterface().getLocalVars().getVars().add(PlcModelHelper.genBooleanVar(tranName + ((Transition)object).getId(),false));
				}				
			}
		}
		return fb;
	}
	
	/**
	 * Main GRAFCET interpretation method.
	 * @param fb
	 * @param chart Main, partial Grafcet or macro step
	 * @param glVarList
	 * @param Modus flag (1 = global GRFACET, 2 = enclosing step expansion (partial GRAFCET), 3 = macro step) 
	 * @return ST function block 
	 */
	private FunctionBlock genGrafcetFrame(FunctionBlock fb, Grafcet chart, GlobalVarList glVarList, int Modus){
		//System.out.println("C:" + chart);
		steps.clear();
		allSteps.clear();
		enclosingsteps.clear();
		entrySteps.clear();
		exitSteps.clear();
		syncs.clear();
		arcs.clear();
		transitions.clear();
		macroStepExpansions.clear();
		partialGrafcets.clear();
		conActions.clear();
		stActions.clear();
		forcingOrders.clear();
		actionLink.clear();
		//collect all grafect elements
		TreeIterator<EObject> iterator = chart.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object.eContainer() == chart){
				if(object instanceof Step){
					steps.add((Step)object);
					allSteps.add((Step)object);
				}
				if(object instanceof Macrostep){
					macroSteps.add((Macrostep)object);
					allSteps.add((Macrostep)object);
				}
				if(object instanceof EnclosingStep){
					enclosingsteps.add((EnclosingStep)object);
					allSteps.add((EnclosingStep)object);
				}
				if(object instanceof EntryStep){
					entrySteps.add((EntryStep)object);
					allSteps.add((EntryStep)object);
				}
				if(object instanceof ExitStep){
					exitSteps.add((ExitStep)object);
					allSteps.add((ExitStep)object);
				}
				if(object instanceof Synchronization){
					syncs.add((Synchronization)object);
				}
				if(object instanceof Arc){
					arcs.add((Arc)object);
				}
				if(object instanceof Transition){
					transitions.add((Transition)object);
				}
				if(object instanceof MacrostepExpansion){
					macroStepExpansions.add((MacrostepExpansion)object);
				}
				if(object instanceof PartialGrafcet){
					partialGrafcets.add((PartialGrafcet)object);
				}
				if(object instanceof ContinuousAction){
					conActions.add((ContinuousAction)object);
				}
				if(object instanceof StoredAction){
					stActions.add((StoredAction)object);
				}
				if(object instanceof ForcingOrder){
					forcingOrders.add((ForcingOrder)object);
				}
				if(object instanceof ActionLink){
					actionLink.add((ActionLink)object);
				}
			}
		}
		
			
		StructuredText stcode = PlccodeFactory.eINSTANCE.createStructuredText();
		// declaration of standard variables
		
		
		PlcVariable vd = PlccodeFactory.eINSTANCE.createPlcVariable();
		Declaration dec = PlccodeFactory.eINSTANCE.createDeclaration();
		InputVariable inVar = PlccodeFactory.eINSTANCE.createInputVariable();
		LocalVariable localVar = PlccodeFactory.eINSTANCE.createLocalVariable();
		dec.setInputVars(inVar);
		dec.setLocalVars(localVar);
		
		fb.setInterface(dec);
		//fb.getInterface().getInputVars().getVars().add(vd);
		
		fb.getInterface().getInputVars().getVars().add(PlcModelHelper.genBooleanVar("Enable",false));
		fb.getInterface().getInputVars().getVars().add(PlcModelHelper.genBooleanVar("Init",false));
		
		fb.getInterface().getInputVars().getVars().add(PlcModelHelper.genBooleanVar("End",false));
	
		if(Modus>1) {
			fb.getInterface().getInputVars().getVars().add(PlcModelHelper.genBooleanVar("Activate",false));
			fb.getInterface().getInputVars().getVars().add(PlcModelHelper.genBooleanVar("Freeze",false));
		}
		fb.getInterface().getLocalVars().getVars().add(PlcModelHelper.genBooleanVar("StableState",false));
		
		fb.getInterface().getLocalVars().getVars().add(genIntegerVar("TranLoops",0));
		fb.getInterface().getLocalVars().getVars().add(genIntegerVar("NumTran",transitions.size()));
		
		
		// standard functions
		
		//stcode.getEmbeddedStatements().add(genComment( "Init_Grafcet"));
		stcode.getEmbeddedStatements().add(genStandardFunction(allSteps, glVarList, fb,1));
		
		if(Modus>1) {		
			//stcode.getEmbeddedStatements().add(genComment( "Activate_Grafcet"));
			stcode.getEmbeddedStatements().add(genStandardFunction(allSteps, glVarList, fb,2));
		}		
	
		//stcode.getEmbeddedStatements().add(genComment("End_Grafcet"));
		stcode.getEmbeddedStatements().add(genStandardFunction(allSteps, glVarList, fb,3));
		
		//
		//stcode.getEmbeddedStatements().add(genComment("Program"));
		//Imply tempTerm = TermFactory.eINSTANCE.createImply();
		//tempTerm.setVar((BooleanVariable)getVar("Enable",fb));
		If proFunction = PlccodeFactory.eINSTANCE.createIf();
		Condition proCon = PlccodeFactory.eINSTANCE.createCondition();
		proCon.setTerm("(Enable)");
		proFunction.setCondition(proCon);
	
		//System.out.println("Bl1");
		fb = genTranVar(fb, chart);	
		//System.out.println("Bl1");
		proFunction =  genGrafcetProgram(proFunction, fb, Modus);
		
		stcode.getEmbeddedStatements().add(proFunction);
	//	System.out.println("Bl2");
		fb.setSpecification(stcode);
		
		
		
		
		return fb;
	}
	
	private If genGrafcetProgram(If sourceIf, FunctionBlock fb , int Modus){
		sourceIf.getEmbeddedStatements().add(genAssignment("TranLoops","(0)"));
		sourceIf.getEmbeddedStatements().add(genBooleanAss("StableState", true));
		While progLoop = PlccodeFactory.eINSTANCE.createWhile();
		Condition whileCon = PlccodeFactory.eINSTANCE.createCondition();
		whileCon.setTerm("((StableState)AND(TranLoops<NumTran))");
		progLoop.setBreakCondition(whileCon);
		progLoop.getEmbeddedStatements().add(genBooleanAss("StableState", false));
		progLoop.getEmbeddedStatements().add(genAssignment("TranLoops","(TranLoops+1)"));
		progLoop.getEmbeddedStatements().add(genTransitionPart(fb, Modus));
		/*
		 * Generate Step Part 
		 * 			|
		 * 			|
		 * 			V
		 */
		for(int i = 0; i< allSteps.size();i++){
			String stringType = "";
			If actStepIf = PlccodeFactory.eINSTANCE.createIf();
			Condition actStepIfCon = PlccodeFactory.eINSTANCE.createCondition();
			//actStepIf.getEmbeddedStatements().add(genBooleanAss("act"+stringType, false));
			If conStepIf = PlccodeFactory.eINSTANCE.createIf();
			Condition conStepIfCon = PlccodeFactory.eINSTANCE.createCondition();
			If deactStepIf = PlccodeFactory.eINSTANCE.createIf();
			Condition deactStepIfCon = PlccodeFactory.eINSTANCE.createCondition();
			
			if(allSteps.get(i) instanceof Step){
				stringType = stepName+((Step)allSteps.get(i)).getId();			
			}
			if(allSteps.get(i) instanceof EnclosingStep){
				stringType = enStepName+((EnclosingStep)allSteps.get(i)).getId();							
			}
			if(allSteps.get(i) instanceof Macrostep){
				stringType = macStepName+((Macrostep)allSteps.get(i)).getId();				
			}
			if(allSteps.get(i) instanceof EntryStep){
				stringType = entryStepName+((EntryStep)allSteps.get(i)).getId();	
			}
			if(allSteps.get(i) instanceof ExitStep){
				stringType = exitStepName+((ExitStep)allSteps.get(i)).getId();
			}			
			//System.out.println("en1");
			actStepIfCon.setTerm("act"+stringType);
			actStepIf.setCondition(actStepIfCon);
			actStepIf.getEmbeddedStatements().add(genBooleanAss("act"+stringType, false));
			
			
			conStepIfCon.setTerm(stringType);
			conStepIf.setCondition(conStepIfCon);
			//conStepIf.getEmbeddedStatements().add(PlccodeFactory.eINSTANCE.createEmptyExpresion());
			
			deactStepIfCon.setTerm("deact"+stringType);
			deactStepIf.setCondition(deactStepIfCon);
			deactStepIf.getEmbeddedStatements().add(genBooleanAss("deact"+stringType, false));
			
			if(allSteps.get(i) instanceof EnclosingStep){
				for(int a= 0;a< ((EnclosingStep)allSteps.get(i)).getPartialGrafcets().size();a++){	
					String pGrafcetName = FBNameaddition + ((EnclosingStep)allSteps.get(i)).getPartialGrafcets().get(a).getName();
					
					Call callStart = PlccodeFactory.eINSTANCE.createCall();
					callStart.setInstanceName(pGrafcetName);
					callStart.getInstanceVars().add(genBooleanAss("Enable", false));
					callStart.getInstanceVars().add(genBooleanAss("Init", false));
					callStart.getInstanceVars().add(genBooleanAss("Activate", true));
					callStart.getInstanceVars().add(genBooleanAss("End", false));
					Call callCon = PlccodeFactory.eINSTANCE.createCall();
					callCon.setInstanceName(pGrafcetName);
					callCon.getInstanceVars().add(genBooleanAss("Enable", true));
					callCon.getInstanceVars().add(genBooleanAss("Init", false));
					callCon.getInstanceVars().add(genBooleanAss("Activate", false));
					callCon.getInstanceVars().add(genBooleanAss("End", false));
					Call callEnd = PlccodeFactory.eINSTANCE.createCall();
					callEnd.setInstanceName(pGrafcetName);
					callEnd.getInstanceVars().add(genBooleanAss("Enable", false));
					callEnd.getInstanceVars().add(genBooleanAss("Init", false));
					callEnd.getInstanceVars().add(genBooleanAss("Activate", false));
					callEnd.getInstanceVars().add(genBooleanAss("End", true));
					
					actStepIf.getEmbeddedStatements().add( callStart);
					conStepIf.getEmbeddedStatements().add( callCon);
					deactStepIf.getEmbeddedStatements().add( callEnd);
				}
			}
			if(allSteps.get(i) instanceof Macrostep){
				//String pGrafcetName = FBNameaddition +"M"+((Macrostep)allSteps.get(i)).getId();
				String pGrafcetName = FBNameaddition +((MacrostepExpansion)((Macrostep)allSteps.get(i)).getExpansion()).getName();
				Call callStart = PlccodeFactory.eINSTANCE.createCall();
				callStart.setInstanceName(pGrafcetName);
				
				callStart.getInstanceVars().add(genBooleanAss("Enable", false));
				callStart.getInstanceVars().add(genBooleanAss("Init",true));
				callStart.getInstanceVars().add(genBooleanAss("End", false));
				//callStart.getInstanceVars().add(genBooleanAss("Freeze", false));
				Call callCon = PlccodeFactory.eINSTANCE.createCall();
				callCon.setInstanceName(pGrafcetName);
				callCon.getInstanceVars().add(genBooleanAss("Enable", true));
				callCon.getInstanceVars().add(genBooleanAss("Init", false));
				callCon.getInstanceVars().add(genBooleanAss("End", false));
				Call callEnd = PlccodeFactory.eINSTANCE.createCall();
				callEnd.setInstanceName(pGrafcetName);
				callEnd.getInstanceVars().add(genBooleanAss("Enable", false));
				callEnd.getInstanceVars().add(genBooleanAss("Init", false));
				callEnd.getInstanceVars().add(genBooleanAss("End", true));
				
				actStepIf.getEmbeddedStatements().add( callStart);
				conStepIf.getEmbeddedStatements().add( callCon);
				deactStepIf.getEmbeddedStatements().add( callEnd);		
			}
			
			If StepIf = PlccodeFactory.eINSTANCE.createIf();
			Condition StepIfCon = PlccodeFactory.eINSTANCE.createCondition();
			StepIfCon.setTerm("(act"+stringType+")OR("+stringType+")OR(deact"+stringType+")");
			StepIf.setCondition(StepIfCon);
	
			// collect actions and forcingorders
			for(int a= 0;a< actionLink.size();a++){
				if (actionLink.get(a).getStep() == allSteps.get(i)){
					//preSteps.add(actionLink.get(a).getSource());
					/* Continous Action*/
					if(actionLink.get(a).getActionType() instanceof ContinuousAction){
						//conActions.add((ContinuousAction)object);
						if (((ContinuousAction)actionLink.get(a).getActionType()).getContinuousActionType() == ContinuousActionType.CONTINUOUS_ACTION){
							conStepIf.getEmbeddedStatements().add(genBooleanAss(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), true));
							deactStepIf.getEmbeddedStatements().add(genBooleanAss(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), false));
						}
						else if (((ContinuousAction)actionLink.get(a).getActionType()).getContinuousActionType() == ContinuousActionType.ASSIGNATION_CONDITION){
							if (((ContinuousAction)actionLink.get(a).getActionType()).getTimeConditionType() == TimeConditionType.NONE) {
								conStepIf.getEmbeddedStatements().add(genAssignment(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), genStString(((ContinuousAction)actionLink.get(a).getActionType()).getTerm())));
								deactStepIf.getEmbeddedStatements().add(genBooleanAss(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), false));
							}
							else {
								fb.getInterface().getLocalVars().getVars().add(PlcModelHelper.genFbVar(tbActName + ((ContinuousAction)actionLink.get(a).getActionType()).getId(),TBActionFBName));
								Call tbAction = PlccodeFactory.eINSTANCE.createCall();
								tbAction.setInstanceName(tbActName+((ContinuousAction)actionLink.get(a).getActionType()).getId());
								tbAction.getInstanceVars().add(genAssignment("Term", genStString(((ContinuousAction)actionLink.get(a).getActionType()).getTerm())));
								
								//tranIf.getEmbeddedStatements().add(tbAction);
								//tranConString += "TbActionT_"+ transitions.get(t).getId()+"()";
								if (((ContinuousAction)actionLink.get(a).getActionType()).getTimeConditionType() == TimeConditionType.TIME_DEPENDENT) {
									tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", ((ContinuousAction)actionLink.get(a).getActionType()).getDelayTime(), ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
									tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", ((ContinuousAction)actionLink.get(a).getActionType()).getResetTime(), ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
								}
								else if (((ContinuousAction)actionLink.get(a).getActionType()).getTimeConditionType() == TimeConditionType.TIME_DELAYED) {
									tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", ((ContinuousAction)actionLink.get(a).getActionType()).getDelayTime(), ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
									tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", 0, ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
								}
								else if (((ContinuousAction)actionLink.get(a).getActionType()).getTimeConditionType() == TimeConditionType.TIME_LIMITED) {
									tbAction.getInstanceVars().add(genTimeAssignment("DelayTime",0, ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
									tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", ((ContinuousAction)actionLink.get(a).getActionType()).getResetTime(), ((ContinuousAction)actionLink.get(a).getActionType()).getUnit()));
								}
								conStepIf.getEmbeddedStatements().add(tbAction);
								conStepIf.getEmbeddedStatements().add(genAssignment(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), tbActName + ((ContinuousAction)actionLink.get(a).getActionType()).getId()+".Q" ));
								deactStepIf.getEmbeddedStatements().add(genBooleanAss(((ContinuousAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName(), false));
							}
						}
						
					}
					/* Stored Action*/												
					if(actionLink.get(a).getActionType() instanceof StoredAction){
						String variableName, assignedValue = "";
						variableName = ((StoredAction)actionLink.get(a).getActionType()).getVariable().getVariableDeclaration().getName();
						assignedValue = genStString(((StoredAction)actionLink.get(a).getActionType()).getValue());
						if (((StoredAction)actionLink.get(a).getActionType()).getStoredActionType() == StoredActionType.ACTIVATION){
							actStepIf.getEmbeddedStatements().add(genAssignment(variableName,assignedValue));
						}
						else if (((StoredAction)actionLink.get(a).getActionType()).getStoredActionType() == StoredActionType.DEACTIVATION){
							deactStepIf.getEmbeddedStatements().add(genAssignment(variableName,assignedValue));
						}
						else if (((StoredAction)actionLink.get(a).getActionType()).getStoredActionType() == StoredActionType.EVENT){
							If eventIf = PlccodeFactory.eINSTANCE.createIf();
							Condition eventIfCon = PlccodeFactory.eINSTANCE.createCondition();
							
							//TODO updatet for event operator support
							//generating event condition
							StStringGenerator stGen = new StStringGenerator(((StoredAction)actionLink.get(a).getActionType()).getTerm(),"A" + ((StoredAction)actionLink.get(a).getActionType()).getId());
							for (PlcVariable plcVar : stGen.getVars()) {
								fb.getInterface().getLocalVars().getVars().add(plcVar);
							}
							for (Call call : stGen.getCalls()) {
								conStepIf.getEmbeddedStatements().add(call);
							}
							eventIfCon.setTerm(stGen.getStString());
							eventIf.setCondition(eventIfCon);
							eventIf.getEmbeddedStatements().add(genAssignment(variableName,assignedValue));
							conStepIf.getEmbeddedStatements().add(eventIf);
						}
					}
					/* Forcing Orders*/
					
					if(actionLink.get(a).getActionType() instanceof ForcingOrder){
						//forcingOrders.add((ForcingOrder)object);
						
						String pGrafcetName = FBNameaddition + ((ForcingOrder)actionLink.get(a).getActionType()).getPartialGrafcet().getName();
						
						Call callCon = PlccodeFactory.eINSTANCE.createCall();
						Call callEnd = PlccodeFactory.eINSTANCE.createCall();
						callCon.setInstanceName(pGrafcetName);
						callEnd.setInstanceName(pGrafcetName);
						if (((ForcingOrder)actionLink.get(a).getActionType()).getForcingOrderType() == ForcingOrderType.CURRENT_SITUATION){
							
							callCon.getInstanceVars().add(genBooleanAss("Enable", false));
							callCon.getInstanceVars().add(genBooleanAss("Init", false));
							callCon.getInstanceVars().add(genBooleanAss("End", false));
							callCon.getInstanceVars().add(genBooleanAss("Freeze",true));
							conStepIf.getEmbeddedStatements().add( callCon);
						}
						
						if (((ForcingOrder)actionLink.get(a).getActionType()).getForcingOrderType() == ForcingOrderType.EMPTY_SITUATION){
							callCon.getInstanceVars().add(genBooleanAss("Enable", false));
							callCon.getInstanceVars().add(genBooleanAss("Init", false));
							callCon.getInstanceVars().add(genBooleanAss("End", true));
							callCon.getInstanceVars().add(genBooleanAss("Freeze",true));
							conStepIf.getEmbeddedStatements().add( callCon);
						}
						
						
						if (((ForcingOrder)actionLink.get(a).getActionType()).getForcingOrderType() == ForcingOrderType.INITIAL_SITUATION){
							callCon.getInstanceVars().add(genBooleanAss("Enable", false));
							callCon.getInstanceVars().add(genBooleanAss("Init", true));
							callCon.getInstanceVars().add(genBooleanAss("End", false));
							callCon.getInstanceVars().add(genBooleanAss("Freeze",true));
							conStepIf.getEmbeddedStatements().add( callCon);
						}
						if (((ForcingOrder)actionLink.get(a).getActionType()).getForcingOrderType() == ForcingOrderType.EXPLICIT_SITUATION){
							callCon.getInstanceVars().add(genBooleanAss("Enable", false));
							callCon.getInstanceVars().add(genBooleanAss("Init", false));
							callCon.getInstanceVars().add(genBooleanAss("End", true));
							callCon.getInstanceVars().add(genBooleanAss("Freeze",true));
							conStepIf.getEmbeddedStatements().add( callCon);
							String temp="";
							
							for(int forcing=0; forcing < ((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().size(); forcing++) {
								
								if (((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing) instanceof Step){
									temp= stepName+((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing).getId();
								}
								else if (((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing) instanceof Macrostep){
									temp= macStepName+ ((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing).getId();
								}
								else if (((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing) instanceof EnclosingStep){
									temp=  enStepName+((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing).getId();
								}
								else if (((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing) instanceof EntryStep){
									temp=  entryStepName+((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing).getId();
								}
								else if (((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing) instanceof ExitStep){
									temp=  exitStepName+((ForcingOrder)actionLink.get(a).getActionType()).getForcedSteps().get(forcing).getId();
								}
								conStepIf.getEmbeddedStatements().add(genBooleanAss(temp,true));
								System.out.println("ss"+temp);
							}
						}
						callEnd.getInstanceVars().add(genBooleanAss("Enable", false));
						callEnd.getInstanceVars().add(genBooleanAss("Init", false));
						callEnd.getInstanceVars().add(genBooleanAss("End", false));
						callEnd.getInstanceVars().add(genBooleanAss("Freeze", false));
						deactStepIf.getEmbeddedStatements().add( callEnd);	
					}
					
				}
			}
			
			//progLoop.getEmbeddedStatements().add(genComment(stringType));
			StepIf.getEmbeddedStatements().add(actStepIf);
			StepIf.getEmbeddedStatements().add(conStepIf);
			StepIf.getEmbeddedStatements().add(deactStepIf);
			progLoop.getEmbeddedStatements().add(StepIf);
			
		}
		sourceIf.getEmbeddedStatements().add(progLoop);
		return sourceIf;
	}
	

	
	/*
	 * Generate Transition Part 
	 * 			|
	 * 			|
	 * 			V
	 */
	private If genTransitionPart( FunctionBlock fb , int Modus){
		//int row = 3;
		If tranIf = PlccodeFactory.eINSTANCE.createIf();
		Condition tranIfCon = PlccodeFactory.eINSTANCE.createCondition();
		tranIfCon.setTerm("((INIT=FALSE)AND(END=FALSE))");
		tranIf.setCondition(tranIfCon);
		for(int t= 0;t< transitions.size();t++){
			List<Node> preSteps = new ArrayList<Node>();
			List<Node> postSteps = new ArrayList<Node>();
			for(int a= 0;a< arcs.size();a++){
				if (arcs.get(a).getTarget() == transitions.get(t)){
					//Source == Synchronization
					if (arcs.get(a).getSource() instanceof Synchronization){
						for(int temp=0;temp< arcs.size();temp++){
							if(arcs.get(temp).getTarget() == arcs.get(a).getSource()){
								preSteps.add(arcs.get(temp).getSource());
							}
						}
					}
					else{
						preSteps.add(arcs.get(a).getSource());
					}
				}
				if (arcs.get(a).getSource() == transitions.get(t)){
					//Target == Synchronization
					if (arcs.get(a).getTarget() instanceof Synchronization){
						for(int temp=0;temp< arcs.size();temp++){
							if(arcs.get(temp).getSource() == arcs.get(a).getTarget()){
								postSteps.add(arcs.get(temp).getTarget());
							}
						}
						
					}
					//Target == Step
					else{
						postSteps.add(arcs.get(a).getTarget());
					}
				}
			}
			String AssValue = "(";
			// transition releases
			if(preSteps.size() > 1){
				for (int temp = 0; temp< preSteps.size()-1; temp++){
					if (preSteps.get(temp) instanceof Step){
						AssValue += stepName+((Step)preSteps.get(temp)).getId();
					}
					else if (preSteps.get(temp) instanceof Macrostep){
						AssValue += macStepName+((Macrostep)preSteps.get(temp)).getId()+ ")AND("+	exitStepName+ ((Macrostep)preSteps.get(temp)).getExpansion().getExitStep().getId();
					}
					else if (preSteps.get(temp) instanceof EnclosingStep){
						AssValue += enStepName+((EnclosingStep)preSteps.get(temp)).getId();
					}
					else if (preSteps.get(temp) instanceof EntryStep){
						AssValue += entryStepName+((EntryStep)preSteps.get(temp)).getId();
					}
					else if (preSteps.get(temp) instanceof ExitStep){
						AssValue += exitStepName+((ExitStep)preSteps.get(temp)).getId();
					}
					AssValue += ")AND(";
				}
				if (preSteps.get(preSteps.size()-1) instanceof Step){
					AssValue += stepName+((Step)preSteps.get(preSteps.size()-1)).getId();
				}
				else if (preSteps.get(preSteps.size()-1) instanceof Macrostep){
					AssValue += macStepName+((Macrostep)preSteps.get(preSteps.size()-1)).getId()+ ")AND("+	exitStepName+ ((Macrostep)preSteps.get(preSteps.size()-1)).getExpansion().getExitStep().getId();
				}
				else if (preSteps.get(preSteps.size()-1) instanceof EnclosingStep){
					AssValue += enStepName+((EnclosingStep)preSteps.get(preSteps.size()-1)).getId();
				}
				else if (preSteps.get(preSteps.size()-1) instanceof EntryStep){
					AssValue += entryStepName+((EntryStep)preSteps.get(preSteps.size()-1)).getId();
				}
				else if (preSteps.get(preSteps.size()-1) instanceof ExitStep){
					AssValue += exitStepName+((ExitStep)preSteps.get(preSteps.size()-1)).getId();
				}
				AssValue += ")";
				
				
			}
			else if(preSteps.size() == 1){
				if (preSteps.get(0) instanceof Step){
					AssValue += stepName+((Step)preSteps.get(0)).getId();
				}
				else if (preSteps.get(0) instanceof Macrostep){
					//AssValue += macStepName+((Macrostep)preSteps.get(0)).getId();
					AssValue += macStepName+((Macrostep)preSteps.get(0)).getId()+ ")AND("+	exitStepName+ ((Macrostep)preSteps.get(0)).getExpansion().getExitStep().getId();
				}
				else if (preSteps.get(0) instanceof EnclosingStep){
					AssValue += enStepName+((EnclosingStep)preSteps.get(0)).getId();
				}
				else if (preSteps.get(0) instanceof EntryStep){
					AssValue +=entryStepName+((EntryStep)preSteps.get(0)).getId();
				}
				else if (preSteps.get(0) instanceof ExitStep){
					AssValue += exitStepName+((ExitStep)preSteps.get(0)).getId();
				}
				AssValue += ")";
			}
			else if(preSteps.size() == 0){
				tranIf.getEmbeddedStatements().add(genBooleanAss(tranName +transitions.get(t).getId(), false));
			}
			
			if(Modus>1 && preSteps.size() != 0) {
				AssValue += "AND(Freeze=FALSE)";
			}
			
			tranIf.getEmbeddedStatements().add(genAssignment(tranName + transitions.get(t).getId() ,AssValue));
		}
		//System.out.println("tran2");
		for(int t= 0;t< transitions.size();t++){
			
			List<Node> preSteps = new ArrayList<Node>();
			List<Node> postSteps = new ArrayList<Node>();
			// collect pre and post steps
			for(int a= 0;a< arcs.size();a++){
				if (arcs.get(a).getTarget() == transitions.get(t)){
					//Source == Synchronization
					if (arcs.get(a).getSource() instanceof Synchronization){
						for(int temp=0;temp< arcs.size();temp++){
							if(arcs.get(temp).getTarget() == arcs.get(a).getSource()){
								preSteps.add(arcs.get(temp).getSource());
							}
						}
					}
					//Source == Step
					else{
						preSteps.add(arcs.get(a).getSource());
					}
				}
				
				if (arcs.get(a).getSource() == transitions.get(t)){
					//Target == Synchronization
					if (arcs.get(a).getTarget() instanceof Synchronization){
						for(int temp=0;temp< arcs.size();temp++){
							if(arcs.get(temp).getSource() == arcs.get(a).getTarget()){
								postSteps.add(arcs.get(temp).getTarget());
							}
						}
						
					}
					//Target == Step
					else{
						postSteps.add(arcs.get(a).getTarget());
					}
				}
			}			
			//TODO: updated for event support
			//Creation of Transition Codition:
			String tranConString = "((";
			// check for time condition
			if(transitions.get(t).getTimeConditionType() == TimeConditionType.NONE){
				//Create transition condion
				StStringGenerator stGen = new StStringGenerator(transitions.get(t).getTerm(),"T" + transitions.get(t).getId());
				for (PlcVariable plcVar : stGen.getVars()) {
					fb.getInterface().getLocalVars().getVars().add(plcVar);
				}
				for (Call call : stGen.getCalls()) {
					tranIf.getEmbeddedStatements().add(call);
				}
								
				tranConString +=  stGen.getStString();			
				
			}
			//time condition indeed:
			else if (transitions.get(t).getTimeConditionType() != TimeConditionType.NONE){
				//create transition condition
				StStringGenerator stGen = new StStringGenerator(transitions.get(t).getTerm(),"T" + transitions.get(t).getId());
				for (PlcVariable plcVar : stGen.getVars()) {
					fb.getInterface().getLocalVars().getVars().add(plcVar);
				}
				for (Call call : stGen.getCalls()) {
					tranIf.getEmbeddedStatements().add(call);
				}
				fb.getInterface().getLocalVars().getVars().add(PlcModelHelper.genFbVar(tbTranName+ transitions.get(t).getId(),TBActionFBName));
				Call tbAction = PlccodeFactory.eINSTANCE.createCall();
				tbAction.setInstanceName(tbTranName+ transitions.get(t).getId());
				tbAction.getInstanceVars().add(genAssignment("TERM", stGen.getStString()));
				
				if (transitions.get(t).getTimeConditionType() == TimeConditionType.TIME_DEPENDENT) {
					tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", transitions.get(t).getDelayTime(), transitions.get(t).getUnit()));
					tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", transitions.get(t).getResetTime(),  transitions.get(t).getUnit()));
				}
				else if (transitions.get(t).getTimeConditionType() == TimeConditionType.TIME_DELAYED) {
					tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", transitions.get(t).getDelayTime(), transitions.get(t).getUnit()));
					tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", 0,  transitions.get(t).getUnit()));
				}
				else if (transitions.get(t).getTimeConditionType() == TimeConditionType.TIME_LIMITED) {
					tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", 0, transitions.get(t).getUnit()));
					tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", transitions.get(t).getResetTime(),  transitions.get(t).getUnit()));
				}
				
				//tbAction.getInstanceVars().add(genTimeAssignment("DelayTime", transitions.get(t).getDelayTime(), transitions.get(t).getUnit()));
				//tbAction.getInstanceVars().add(genTimeAssignment("ResetTime", transitions.get(t).getResetTime(),  transitions.get(t).getUnit()));
				tranIf.getEmbeddedStatements().add(tbAction);
				tranConString +=tbTranName+ transitions.get(t).getId()+"().Q";
			}
			tranConString= PlcModelHelper.genTerm(tranConString);
			tranConString +=  ")AND("+ tranName  + transitions.get(t).getId() + "))";
			
			//System.out.println(tranConString);
			If tempTranIf =  PlccodeFactory.eINSTANCE.createIf();
			Condition temptranIfCon = PlccodeFactory.eINSTANCE.createCondition();
			temptranIfCon.setTerm(tranConString);
			tempTranIf.setCondition(temptranIfCon);
		//	System.out.println("tran5");
			// deactivate pre Steps
			tempTranIf.getEmbeddedStatements().add(genBooleanAss("StableState", true));
			//tempTranIf.getEmbeddedStatements().add(genComment( "deactivate_presteps"));
			for(int pre = 0;pre < preSteps.size();pre++){
				String temp = "";
				int id = 0;
				if (preSteps.get(pre) instanceof Step){
					temp= stepName;
					id = ((Step)preSteps.get(pre)).getId();
				}
				else if (preSteps.get(pre) instanceof Macrostep){
					temp= macStepName;	
					id = ((Macrostep)preSteps.get(pre)).getId();
				}
				else if (preSteps.get(pre) instanceof EnclosingStep){
					temp=  enStepName;
					id = ((EnclosingStep)preSteps.get(pre)).getId();
				}
				else if (preSteps.get(pre) instanceof EntryStep){
					temp=  entryStepName;
					id = ((EntryStep)preSteps.get(pre)).getId();
				}
				else if (preSteps.get(pre) instanceof ExitStep){
					temp=  exitStepName;
					id = ((ExitStep)preSteps.get(pre)).getId();
				}
				tempTranIf.getEmbeddedStatements().add(genBooleanAss(temp+id, false));
				tempTranIf.getEmbeddedStatements().add(genBooleanAss("act"+temp+id, false));
				tempTranIf.getEmbeddedStatements().add(genBooleanAss("deact"+temp+id,  true));				
			}
			//System.out.println("tran6");
			// activate post
			//tempTranIf.getEmbeddedStatements().add(genComment("activate_poststeps"));
			for(int post = 0;post < postSteps.size();post++){
				
				String temp = "";
				int id = 0;
				if (postSteps.get(post) instanceof Step){
					temp= stepName;
					id = ((Step)postSteps.get(post)).getId();
				}
				else if (postSteps.get(post) instanceof Macrostep){
					temp= macStepName;	
					id = ((Macrostep)postSteps.get(post)).getId();
				}
				else if (postSteps.get(post) instanceof EnclosingStep){
					temp=  enStepName;
					id = ((EnclosingStep)postSteps.get(post)).getId();
					
					//System.out.println("enst1");
				}
				else if (postSteps.get(post) instanceof EntryStep){
					temp=  entryStepName;	
					id = ((EntryStep)postSteps.get(post)).getId();
				}
				else if (postSteps.get(post) instanceof ExitStep){
					temp=  exitStepName;
					id = ((ExitStep)postSteps.get(post)).getId();
				}
				//System.out.println(temp+id+" "+post);
				tempTranIf.getEmbeddedStatements().add(genBooleanAss(temp+id, true));
				tempTranIf.getEmbeddedStatements().add(genBooleanAss("act"+temp+id, true));
				tempTranIf.getEmbeddedStatements().add(genBooleanAss("deact"+temp+id, false));
			}
			
		//	System.out.println("tran7");
			tranIf.getEmbeddedStatements().add(tempTranIf);
		}
		
		return tranIf;
		
	}
	
	private If genStandardFunction(List<Node> allSteps, GlobalVarList glVarList, FunctionBlock fb, int mode){
		
		String functionName[] = {"Init","Activate","End"};
		// Generate Init function
		If function = PlccodeFactory.eINSTANCE.createIf();
		//function.setTransComment("//");;
		//function.setPlacenumber(mode*2);
		Condition con = PlccodeFactory.eINSTANCE.createCondition();
		con.setTerm(functionName[mode-1]);
		function.setCondition(con);
		//Imply tempTerm = TermFactory.eINSTANCE.createImply();
		//tempTerm.setVar((BooleanVariable)getVar(functionName[mode-1],fb));
		//function.setCondition((StructuredtextFactory.eINSTANCE.createCondition()));
		//function.getCondition().getSubterm().add(tempTerm);
		
		for(int i = 0; i< allSteps.size();i++){
			String stringType = "";	
	
			// Init or Activation
			if (mode == 1 || mode == 2){
				
				if(allSteps.get(i) instanceof Step){
					stringType = stepName+((Step)allSteps.get(i)).getId();
					if (mode == 1){
						function.getEmbeddedStatements().add(genBooleanAss(stringType, ((Step)allSteps.get(i)).isInitial()));
						function.getEmbeddedStatements().add(genBooleanAss("act"+stringType, false));
					}
					else{
						function.getEmbeddedStatements().add(genBooleanAss(stringType,((Step)allSteps.get(i)).isActivationLink()));
						function.getEmbeddedStatements().add(genBooleanAss("act"+stringType,((Step)allSteps.get(i)).isActivationLink()));
					}
					function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
				}
				if(allSteps.get(i) instanceof EnclosingStep){
					stringType = enStepName+((EnclosingStep)allSteps.get(i)).getId();
					
					if (mode == 1){
						function.getEmbeddedStatements().add(genBooleanAss(stringType, ((EnclosingStep)allSteps.get(i)).isInitial()));
						function.getEmbeddedStatements().add(genBooleanAss("act"+stringType, false));
					}
					else{
						function.getEmbeddedStatements().add(genBooleanAss(stringType,((EnclosingStep)allSteps.get(i)).isActivationLink()));
						function.getEmbeddedStatements().add(genBooleanAss("act"+stringType,((EnclosingStep)allSteps.get(i)).isActivationLink()));
					}
					function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
				}
				if(allSteps.get(i) instanceof Macrostep){
					stringType = macStepName+((Macrostep)allSteps.get(i)).getId();
					function.getEmbeddedStatements().add(genBooleanAss(stringType,false));
					function.getEmbeddedStatements().add(genBooleanAss("act"+stringType,false));
					function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
				}
				if(allSteps.get(i) instanceof EntryStep){
					stringType = entryStepName+((EntryStep)allSteps.get(i)).getId();
					function.getEmbeddedStatements().add(genBooleanAss(stringType,true));
					function.getEmbeddedStatements().add(genBooleanAss("act"+stringType,false));
					function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
				}
				if(allSteps.get(i) instanceof ExitStep){
					stringType = exitStepName+((ExitStep)allSteps.get(i)).getId();
					function.getEmbeddedStatements().add(genBooleanAss(stringType,false));
					function.getEmbeddedStatements().add(genBooleanAss("act"+stringType,false));
					function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
				}
			}
			
			// End
			else if (mode == 3){
				
				//Imply tempImply = TermFactory.eINSTANCE.createImply();
				
				if(allSteps.get(i) instanceof Step){
					stringType = stepName+((Step)allSteps.get(i)).getId();
			
					
				}
				if(allSteps.get(i) instanceof EnclosingStep){
					stringType = enStepName+((EnclosingStep)allSteps.get(i)).getId();
					
					
				}
				if(allSteps.get(i) instanceof Macrostep){
					stringType = macStepName+((Macrostep)allSteps.get(i)).getId();
					
					
				}
				if(allSteps.get(i) instanceof EntryStep){
					stringType = entryStepName+((EntryStep)allSteps.get(i)).getId();
					
					
				}
				if(allSteps.get(i) instanceof ExitStep){
					stringType = exitStepName+((ExitStep)allSteps.get(i)).getId();
				
					
				}
				function.getEmbeddedStatements().add(genBooleanAss(stringType, false));
				function.getEmbeddedStatements().add(genBooleanAss("act"+stringType, false));	
				function.getEmbeddedStatements().add(genBooleanAss("deact"+stringType,false));
			}
			
		}
						
		return function;
	}
	
	
	//call of helper methods:
	
	private BooleanAssignment genBooleanAss(String varname, Boolean value){
		return PlcModelHelper.genBooleanAss(varname, value);
	}
	private Assignment genAssignment(String varname, String value){
		return PlcModelHelper.genAssignment(varname, value);
	}
	
	private TimeAssignment genTimeAssignment(String varname,int value, TimeUnit type){
		return PlcModelHelper.genTimeAssignment(varname, value, type);
	}
	
	/**
	 * Generates ST-String from {@link terms.Term} using {@link StStringGenerator}.
	 * @param term Term to transform into ST
	 * @return String in ST syntax
	 */
	private String genStString (Term term){
		StStringGenerator stGen = new StStringGenerator(term, "");
		if (stGen.getVars().size() > 0) {
			System.out.println("Term contains events (rising/falling edge). Check syntax of GRAFCET model and remove event from condition/assignment.\nTerm: " + stGen.getStString());
		}
		return stGen.getStString();
	}
	
	private PlcVariable genIntegerVar(String name, int initvalue){
		return PlcModelHelper.genIntegerVar(name, initvalue);
	}	
}
