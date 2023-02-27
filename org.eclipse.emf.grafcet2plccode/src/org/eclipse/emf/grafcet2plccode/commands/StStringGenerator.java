package org.eclipse.emf.grafcet2plccode.commands;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import plccode.Call;
import plccode.PlcVariable;
import plccode.PlccodeFactory;
import terms.Addition;
import terms.And;
import terms.BooleanConstant;
import terms.Equality;
import terms.FallingEdge;
import terms.GreaterThan;
import terms.IntegerConstant;
import terms.LessThan;
import terms.Not;
import terms.Operator;
import terms.Or;
import terms.RisingEdge;
import terms.Substraction;
import terms.Term;
import terms.Variable;
import terms.VariableDeclarationType;


/**
 * Helper class to perform model to text transformation for {@link terms.Term} into ST syntax.
 * Transforms events to Function Blocks (FB) (i.e. R_TRIG or F_TRIG). 
 * Therefore genStString() creates the FB declaration (outVars) and FB calls (outCalls; to execute the FB).
 * 
 * @author Schnakenbeck
 */
public class StStringGenerator {

	private Term termRoot;
	private String name;
	private ArrayList<Call> outCalls = new ArrayList<Call>();
	private ArrayList<PlcVariable> outVars= new ArrayList<PlcVariable>(); //TODO use genBooleanVar
	private String outStString = "";
	private final String stepName = "Step_";
	private final String rTriggerName = "R_TRIG";
	private final String fTriggerName = "F_TRIG";
	//private PlccodeFactory fac = PlccodeFactory.eINSTANCE;

	
	
	/**
	 * Generates String in Structured Text syntax from {@link terms.Term}. Root method
	 * @param term object 
	 * @return term as ST-String
	 */
	public StStringGenerator(Term term, String name) {
		this.termRoot = term;
		this.name = name;
		this.genStString();
	}
	


	
	public String getStString() {
		return outStString;
	}
		public ArrayList<Call> getCalls() {
		return outCalls;
	}
	public ArrayList<PlcVariable> getVars() {
		return outVars;
	}


	private void genStString () {
	this.outStString = genFromTerm(this.termRoot, true);
	}

	/**
	 * Generates String in Structured Text syntax from {@link terms.Term} or subterm. 
	 * @param term to be transformed
	 * @param root flag if its the root object (needed to set parenthesis properly
	 * @return transformed term in ST syntax
	 */
	private	String genFromTerm(Term term, boolean root) {		
		String stOut = "";
		if (term instanceof Operator){
			if ( ((Operator) term).getInput().size() > 0){
				stOut = genFromRecrusion((Operator) term, root);
			}
			else {stOut = genFromLeave(term);}
		}
		else {stOut = genFromLeave(term);}

		return stOut;
	}
	
	/**
	 * Creates String from leaves (i.e. variables, boolean constant; which have no subterms)
	 * @param term leave object to transform
	 * @return transformed term in ST syntax
	 */
	private	String genFromLeave(Term term){
			String stOut = "";
			if (term instanceof BooleanConstant){
				if(((BooleanConstant) term).isValue()){stOut = "TRUE";}
				else{stOut = "FALSE";}
			}
			if (term instanceof IntegerConstant){
				stOut = String.valueOf(((IntegerConstant) term).getValue());
			}
			else if (term instanceof Variable){
				if (((Variable) term).getVariableDeclaration().getVariableDeclarationType().equals(VariableDeclarationType.STEP)){
					stOut = stepName + ((Variable) term).getVariableDeclaration().getStep().getId();
				}
				else {
					stOut = ((Variable) term).getVariableDeclaration().getName();
				}
			}
			return stOut;
	}
	/**
	 * Creates String from object and its subterms. Recursively calls genFromTerm() therefore. Adds declaration and Function Block call for event operators.
	 * @param term to be transformed
	 * @param root flag if its the root object (needed to set parenthesis properly
	 * @return transformed term in ST syntax
	 */
	private	String genFromRecrusion(Operator term, boolean root){	
			String stOut = "";
			String stOutOp = "";
			if (term instanceof And){
				stOutOp = " AND ";
			}
			else if (term instanceof Or){
				stOutOp = " OR ";
			}
			else if (term instanceof Not){
				stOutOp = " NOT ";
			}
			else if (term instanceof Equality){
				stOutOp = " = ";
			}
			else if (term instanceof Addition){
				stOutOp = " + ";
			}
			else if (term instanceof Substraction){
				stOutOp = " - ";
			}
			else if (term instanceof GreaterThan){
				stOutOp = " > ";
			}
			else if (term instanceof LessThan){
				stOutOp = " < ";
			}

			
			EList<Term> subterms = term.getSubterm();
			if(!root){stOut += "(";}
			switch (subterms.size()) {
				case 0:
					throw new IllegalArgumentException("Term has zero subterms!");
				case 1:
					
					
					Term subterm = subterms.get(0);
					if (term instanceof Not){
						stOut += stOutOp;
						stOut += genFromTerm(subterms.get(0), false);
					}
					else {
						String trigName = "";
						if (term instanceof RisingEdge){
							trigName = "RTrig_" + this.name + "_" + String.valueOf(outVars.size() + 1);
							//Deklaration:
							outVars.add(PlcModelHelper.genFbVar(trigName, rTriggerName));				
						}
						else if (term instanceof FallingEdge){
							trigName = "FTrig_" + this.name + "_" + String.valueOf(outVars.size() + 1);
							//Deklaration:
							outVars.add(PlcModelHelper.genFbVar(trigName, fTriggerName));
						}
						//Call event FB:
						Call trigger = PlccodeFactory.eINSTANCE.createCall();
						trigger.setInstanceName(trigName);
						trigger.getInstanceVars().add(PlcModelHelper.genAssignment("CLK", genFromTerm(subterms.get(0), true)));
						outCalls.add(trigger);
						//String in Bedingung
						stOut += trigName + ".Q";
					}					
				break;
				case 2:
					stOut += genFromTerm(subterms.get(0), false);
					stOut += stOutOp;
					stOut += genFromTerm(subterms.get(1), false);
				break;
				default:
					throw new IllegalArgumentException("Not supported: Term has more than two subterms!");
			}
			if(!root){stOut += ")";}
			
			return stOut;
	}
}
