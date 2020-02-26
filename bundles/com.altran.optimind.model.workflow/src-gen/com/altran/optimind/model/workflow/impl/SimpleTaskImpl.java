/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.SimpleTask;
import com.altran.optimind.model.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SimpleTaskImpl extends AbstractTaskImpl implements SimpleTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.SIMPLE_TASK;
	}

} //SimpleTaskImpl
