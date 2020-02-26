/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.CustomTask#getRunner <em>Runner</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getCustomTask()
 * @model
 * @generated
 */
public interface CustomTask extends SimpleTask {
	/**
	 * Returns the value of the '<em><b>Runner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' attribute.
	 * @see #setRunner(String)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getCustomTask_Runner()
	 * @model
	 * @generated
	 */
	String getRunner();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.CustomTask#getRunner <em>Runner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' attribute.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(String value);

} // CustomTask
