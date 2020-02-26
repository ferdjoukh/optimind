/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.TypedElement#getTypeAsString <em>Type As String</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.TypedElement#getValueAsString <em>Value As String</em>}</li>
 * </ul>
 *
 * @see com.altran.optimind.model.workflow.WorkflowPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type As String</em>' attribute.
	 * @see #setTypeAsString(String)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getTypedElement_TypeAsString()
	 * @model
	 * @generated
	 */
	String getTypeAsString();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.TypedElement#getTypeAsString <em>Type As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type As String</em>' attribute.
	 * @see #getTypeAsString()
	 * @generated
	 */
	void setTypeAsString(String value);

	/**
	 * Returns the value of the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value As String</em>' attribute.
	 * @see #setValueAsString(String)
	 * @see com.altran.optimind.model.workflow.WorkflowPackage#getTypedElement_ValueAsString()
	 * @model
	 * @generated
	 */
	String getValueAsString();

	/**
	 * Sets the value of the '{@link com.altran.optimind.model.workflow.TypedElement#getValueAsString <em>Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value As String</em>' attribute.
	 * @see #getValueAsString()
	 * @generated
	 */
	void setValueAsString(String value);

} // TypedElement
