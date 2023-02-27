/**
 */
package plccode.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import plccode.Expression;
import plccode.PlccodePackage;
import plccode.StructuredText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link plccode.impl.StructuredTextImpl#getEmbeddedStatements <em>Embedded Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredTextImpl extends SpecificationImpl implements StructuredText {
	/**
	 * The cached value of the '{@link #getEmbeddedStatements() <em>Embedded Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> embeddedStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlccodePackage.Literals.STRUCTURED_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getEmbeddedStatements() {
		if (embeddedStatements == null) {
			embeddedStatements = new EObjectContainmentEList<Expression>(Expression.class, this, PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS);
		}
		return embeddedStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS:
				return ((InternalEList<?>)getEmbeddedStatements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS:
				return getEmbeddedStatements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS:
				getEmbeddedStatements().clear();
				getEmbeddedStatements().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS:
				getEmbeddedStatements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlccodePackage.STRUCTURED_TEXT__EMBEDDED_STATEMENTS:
				return embeddedStatements != null && !embeddedStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredTextImpl
