/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.Connection#getTaskoutput <em>Taskoutput</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends TaskInput {
	/**
	 * Returns the value of the '<em><b>Taskoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taskoutput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskoutput</em>' reference.
	 * @see #setTaskoutput(TaskOutput)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getConnection_Taskoutput()
	 * @model
	 * @generated
	 */
	TaskOutput getTaskoutput();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.Connection#getTaskoutput <em>Taskoutput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taskoutput</em>' reference.
	 * @see #getTaskoutput()
	 * @generated
	 */
	void setTaskoutput(TaskOutput value);

} // Connection
