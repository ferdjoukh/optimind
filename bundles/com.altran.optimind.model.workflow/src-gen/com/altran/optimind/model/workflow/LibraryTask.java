/**
 */
package com.altran.optimind.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.LibraryTask#getLibraryfunction <em>Libraryfunction</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryTask()
 * @model
 * @generated
 */
public interface LibraryTask extends SimpleTask {
	/**
	 * Returns the value of the '<em><b>Libraryfunction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraryfunction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraryfunction</em>' reference.
	 * @see #setLibraryfunction(LibraryFunction)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getLibraryTask_Libraryfunction()
	 * @model required="true"
	 * @generated
	 */
	LibraryFunction getLibraryfunction();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.LibraryTask#getLibraryfunction <em>Libraryfunction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraryfunction</em>' reference.
	 * @see #getLibraryfunction()
	 * @generated
	 */
	void setLibraryfunction(LibraryFunction value);

} // LibraryTask
