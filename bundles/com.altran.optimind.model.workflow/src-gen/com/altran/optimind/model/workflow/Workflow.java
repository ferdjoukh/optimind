/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.Workflow#getBaseTask <em>Base Task</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.Workflow#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.Workflow#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Base Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Task</em>' containment reference.
	 * @see #setBaseTask(BaseTask)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWorkflow_BaseTask()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseTask getBaseTask();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.Workflow#getBaseTask <em>Base Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Task</em>' containment reference.
	 * @see #getBaseTask()
	 * @generated
	 */
	void setBaseTask(BaseTask value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.LibraryFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWorkflow_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"Python"</code>.
	 * The literals are from the enumeration {@link com.altran.optimind.model.workflow.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see com.altran.optimind.model.workflow.Language
	 * @see #setLanguage(Language)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getWorkflow_Language()
	 * @model default="Python"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.Workflow#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see com.altran.optimind.model.workflow.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // Workflow
