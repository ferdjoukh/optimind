/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.While#getAbstracttask <em>Abstracttask</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWhile()
 * @model
 * @generated
 */
public interface While extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Abstracttask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstracttask</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstracttask</em>' containment reference.
	 * @see #setAbstracttask(AbstractTask)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWhile_Abstracttask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractTask getAbstracttask();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.While#getAbstracttask <em>Abstracttask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstracttask</em>' containment reference.
	 * @see #getAbstracttask()
	 * @generated
	 */
	void setAbstracttask(AbstractTask value);

} // While
