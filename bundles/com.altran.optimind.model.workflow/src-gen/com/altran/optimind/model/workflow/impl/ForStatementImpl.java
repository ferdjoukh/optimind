/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.ForStatement;
import com.altran.optimind.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.ForStatementImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.ForStatementImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.ForStatementImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends WhileStatementImpl implements ForStatement {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected int from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected int to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final int INCREMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected int increment = INCREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.FOR_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(int newFrom) {
		int oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FOR_STATEMENT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(int newTo) {
		int oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FOR_STATEMENT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(int newIncrement) {
		int oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FOR_STATEMENT__INCREMENT,
					oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.FOR_STATEMENT__FROM:
			return getFrom();
		case WorkflowPackage.FOR_STATEMENT__TO:
			return getTo();
		case WorkflowPackage.FOR_STATEMENT__INCREMENT:
			return getIncrement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.FOR_STATEMENT__FROM:
			setFrom((Integer) newValue);
			return;
		case WorkflowPackage.FOR_STATEMENT__TO:
			setTo((Integer) newValue);
			return;
		case WorkflowPackage.FOR_STATEMENT__INCREMENT:
			setIncrement((Integer) newValue);
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
		case WorkflowPackage.FOR_STATEMENT__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case WorkflowPackage.FOR_STATEMENT__TO:
			setTo(TO_EDEFAULT);
			return;
		case WorkflowPackage.FOR_STATEMENT__INCREMENT:
			setIncrement(INCREMENT_EDEFAULT);
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
		case WorkflowPackage.FOR_STATEMENT__FROM:
			return from != FROM_EDEFAULT;
		case WorkflowPackage.FOR_STATEMENT__TO:
			return to != TO_EDEFAULT;
		case WorkflowPackage.FOR_STATEMENT__INCREMENT:
			return increment != INCREMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", increment: ");
		result.append(increment);
		result.append(')');
		return result.toString();
	}

} //ForStatementImpl
