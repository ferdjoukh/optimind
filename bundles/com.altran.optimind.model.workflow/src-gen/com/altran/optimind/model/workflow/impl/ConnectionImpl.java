/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.ConnectionImpl#getTaskoutput <em>Taskoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends TaskInputImpl implements Connection {
	/**
	 * The cached value of the '{@link #getTaskoutput() <em>Taskoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskoutput()
	 * @generated
	 * @ordered
	 */
	protected TaskOutput taskoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutput getTaskoutput() {
		if (taskoutput != null && taskoutput.eIsProxy()) {
			InternalEObject oldTaskoutput = (InternalEObject) taskoutput;
			taskoutput = (TaskOutput) eResolveProxy(oldTaskoutput);
			if (taskoutput != oldTaskoutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CONNECTION__TASKOUTPUT,
							oldTaskoutput, taskoutput));
			}
		}
		return taskoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskOutput basicGetTaskoutput() {
		return taskoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskoutput(TaskOutput newTaskoutput) {
		TaskOutput oldTaskoutput = taskoutput;
		taskoutput = newTaskoutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONNECTION__TASKOUTPUT, oldTaskoutput,
					taskoutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.CONNECTION__TASKOUTPUT:
			if (resolve)
				return getTaskoutput();
			return basicGetTaskoutput();
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
		case WorkflowPackage.CONNECTION__TASKOUTPUT:
			setTaskoutput((TaskOutput) newValue);
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
		case WorkflowPackage.CONNECTION__TASKOUTPUT:
			setTaskoutput((TaskOutput) null);
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
		case WorkflowPackage.CONNECTION__TASKOUTPUT:
			return taskoutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
