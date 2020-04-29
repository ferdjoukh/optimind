/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.IfStatement#getThen <em>Then</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.IfStatement#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends AbstractStatement {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(AbstractTask)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getIfStatement_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractTask getThen();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.IfStatement#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(AbstractTask value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(AbstractTask)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getIfStatement_Else()
	 * @model containment="true"
	 * @generated
	 */
	AbstractTask getElse();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.IfStatement#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(AbstractTask value);

} // IfStatement
