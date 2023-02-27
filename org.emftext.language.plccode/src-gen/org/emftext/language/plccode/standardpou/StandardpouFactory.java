/**
 */
package org.emftext.language.plccode.standardpou;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.plccode.standardpou.StandardpouPackage
 * @generated
 */
public interface StandardpouFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardpouFactory eINSTANCE = org.emftext.language.plccode.standardpou.impl.StandardpouFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call Standard Pou</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Standard Pou</em>'.
	 * @generated
	 */
	CallStandardPou createCallStandardPou();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>RTrig</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RTrig</em>'.
	 * @generated
	 */
	R_Trig createR_Trig();

	/**
	 * Returns a new object of class '<em>FTrig</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTrig</em>'.
	 * @generated
	 */
	F_Trig createF_Trig();

	/**
	 * Returns a new object of class '<em>Time Pou</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Pou</em>'.
	 * @generated
	 */
	TimePou createTimePou();

	/**
	 * Returns a new object of class '<em>TON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TON</em>'.
	 * @generated
	 */
	TON createTON();

	/**
	 * Returns a new object of class '<em>TOF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOF</em>'.
	 * @generated
	 */
	TOF createTOF();

	/**
	 * Returns a new object of class '<em>TB Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TB Action</em>'.
	 * @generated
	 */
	TB_Action createTB_Action();

	/**
	 * Returns a new object of class '<em>Call Grafcet Pou</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Grafcet Pou</em>'.
	 * @generated
	 */
	CallGrafcetPou createCallGrafcetPou();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	Time createTime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandardpouPackage getStandardpouPackage();

} //StandardpouFactory
