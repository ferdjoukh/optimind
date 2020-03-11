/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.ForStatement#getFrom <em>From</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.ForStatement#getTo <em>To</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.ForStatement#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends WhileStatement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getForStatement_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.ForStatement#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getForStatement_To()
	 * @model
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.ForStatement#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(int)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getForStatement_Increment()
	 * @model
	 * @generated
	 */
	int getIncrement();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.ForStatement#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(int value);

} // ForStatement
