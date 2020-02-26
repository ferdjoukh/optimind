/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.CustomTaskImpl#getRunner <em>Runner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTaskImpl extends SimpleTaskImpl implements CustomTask {
	/**
	 * The default value of the '{@link #getRunner() <em>Runner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunner() <em>Runner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunner()
	 * @generated
	 * @ordered
	 */
	protected String runner = RUNNER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CUSTOM_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRunner() {
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunner(String newRunner) {
		String oldRunner = runner;
		runner = newRunner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CUSTOM_TASK__RUNNER, oldRunner,
					runner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.CUSTOM_TASK__RUNNER:
			return getRunner();
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
		case WorkflowPackage.CUSTOM_TASK__RUNNER:
			setRunner((String) newValue);
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
		case WorkflowPackage.CUSTOM_TASK__RUNNER:
			setRunner(RUNNER_EDEFAULT);
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
		case WorkflowPackage.CUSTOM_TASK__RUNNER:
			return RUNNER_EDEFAULT == null ? runner != null : !RUNNER_EDEFAULT.equals(runner);
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
		result.append(" (runner: ");
		result.append(runner);
		result.append(')');
		return result.toString();
	}

} //CustomTaskImpl
