package org.eclipse.emf.grafcet2plccode.commands;



import de.hsu.grafcet.TimeUnit;
import plccode.*;

/**
 * Helper class to initialize objects from terms meta model. 
 * Straight forward. 
 */
public class PlcModelHelper {
	
	public static PlcVariable genBooleanVar(String name, Boolean initvalue){
		PlcVariable vd = PlccodeFactory.eINSTANCE.createPlcVariable();
		vd.setType(PlccodeFactory.eINSTANCE.createBOOL());
		vd.setName(name);
		InitialValue initVal = PlccodeFactory.eINSTANCE.createInitialValue();
		vd.setInitialValue(initVal);
		vd.getInitialValue().setValue(initvalue.toString());
		return vd;
	}
	public static PlcVariable genIntegerVar(String name, int initvalue){
		PlcVariable vd = PlccodeFactory.eINSTANCE.createPlcVariable();
		vd.setType(PlccodeFactory.eINSTANCE.createINT());
		InitialValue initVal = PlccodeFactory.eINSTANCE.createInitialValue();
		vd.setInitialValue(initVal);
		vd.setName(name);
		vd.getInitialValue().setValue(java.lang.Integer.toString(initvalue));			
		return vd;
	}	
	public static PlcVariable genFbVar(String name, String type){
		PlcVariable vd = PlccodeFactory.eINSTANCE.createPlcVariable();
		Derived derived = PlccodeFactory.eINSTANCE.createDerived();
		derived.setName(type);
		vd.setType(derived);
		vd.setName(name);
		return vd;
	}
	
	public static Assignment genAssignment(String varname, String value){
		Assignment tempAss =PlccodeFactory.eINSTANCE.createAssignment();
		tempAss.setVariable(varname);
		tempAss.setValue(value);						
		return tempAss;
	}
	
	public static BooleanAssignment genBooleanAss(String varname, Boolean value){
		BooleanAssignment tempAss =PlccodeFactory.eINSTANCE.createBooleanAssignment();
		tempAss.setVariable(varname);
		tempAss.setValue(value);			
		return tempAss;
	}
	public static TimeAssignment genTimeAssignment(String varname, int value, TimeUnit type){
		TimeAssignment tempAss =PlccodeFactory.eINSTANCE.createTimeAssignment();
		tempAss.setVariable(varname);
		tempAss.setTime(value);	
		if (type == TimeUnit.MILLISECOND) {
			tempAss.setTimeType(TimeType.MILLISECONDS);
		}
		else {
			tempAss.setTimeType(TimeType.SECONDS);
		}
		return tempAss;
	}
	public static Comment  genComment(String comment){
		Comment com  = PlccodeFactory.eINSTANCE.createComment();
		com.setText(comment);
		return com;
	}
	public static String genTerm(String term) {
		String newTerm = term;
		String tempTerm = term;
		Boolean finished = false;
		do {
			finished = true;
			if(tempTerm.contains("<")) {
				newTerm = tempTerm.substring(0,tempTerm.lastIndexOf("<"));
				newTerm += "&lt;" + tempTerm.substring(tempTerm.lastIndexOf("<")+1,tempTerm.length());
				tempTerm = newTerm;
			}
			else if(tempTerm.contains(">")) {
				newTerm = tempTerm.substring(0,tempTerm.lastIndexOf(">"));
				newTerm += "&gt;" + tempTerm.substring(tempTerm.lastIndexOf(">")+1,tempTerm.length());
				tempTerm = newTerm;
			}
			if(tempTerm.contains("<") || tempTerm.contains(">")){
				finished = false;
			}
		}while(!finished);
		return newTerm;
	}
}
