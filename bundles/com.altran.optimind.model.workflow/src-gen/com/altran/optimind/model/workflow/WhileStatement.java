/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.WhileStatement#getAbstracttask <em>Abstracttask</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Abstracttask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstracttask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstracttask</em>' containment reference.
	 * @see #setAbstracttask(AbstractTask)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWhileStatement_Abstracttask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractTask getAbstracttask();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.WhileStatement#getAbstracttask <em>Abstracttask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstracttask</em>' containment reference.
	 * @see #getAbstracttask()
	 * @generated
	 */
	void setAbstracttask(AbstractTask value);

} // WhileStatement
