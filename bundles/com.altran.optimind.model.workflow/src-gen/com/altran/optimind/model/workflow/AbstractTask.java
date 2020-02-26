/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.AbstractTask#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.AbstractTask#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.AbstractTask#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getAbstractTask()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTask extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.TaskInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getAbstractTask_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getAbstractTask_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskOutput> getOutputs();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"NOT_PREPARED"</code>.
	 * The literals are from the enumeration {@link com.altran.optimind.model.workflow.TaskStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.altran.optimind.model.workflow.TaskStatus
	 * @see #setStatus(TaskStatus)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getAbstractTask_Status()
	 * @model default="NOT_PREPARED"
	 * @generated
	 */
	TaskStatus getStatus();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.AbstractTask#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.altran.optimind.model.workflow.TaskStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TaskStatus value);

} // AbstractTask
