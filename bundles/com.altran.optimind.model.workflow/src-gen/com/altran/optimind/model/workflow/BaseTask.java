/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.BaseTask#getChildren <em>Children</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.BaseTask#getAbstractstatement <em>Abstractstatement</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getBaseTask()
 * @model
 * @generated
 */
public interface BaseTask extends AbstractTask {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.AbstractTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getBaseTask_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTask> getChildren();

	/**
	 * Returns the value of the '<em><b>Abstractstatement</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.AbstractStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractstatement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractstatement</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getBaseTask_Abstractstatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractStatement> getAbstractstatement();

} // BaseTask
