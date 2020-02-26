/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.LibraryFunction#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.LibraryFunction#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.LibraryFunction#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryFunction()
 * @model
 * @generated
 */
public interface LibraryFunction extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryFunction_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.altran.optimind.model.workflow.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryFunction_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryFunction_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.LibraryFunction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);
} // LibraryFunction
