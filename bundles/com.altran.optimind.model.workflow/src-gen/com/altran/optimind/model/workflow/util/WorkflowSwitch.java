/**
 */
package com.altran.optimind.model.workflow.util;

import com.altran.optimind.model.workflow.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.altran.optimind.model.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case WorkflowPackage.ABSTRACT_TASK: {
			AbstractTask abstractTask = (AbstractTask) theEObject;
			T result = caseAbstractTask(abstractTask);
			if (result == null)
				result = caseNamedElement(abstractTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.SIMPLE_TASK: {
			SimpleTask simpleTask = (SimpleTask) theEObject;
			T result = caseSimpleTask(simpleTask);
			if (result == null)
				result = caseAbstractTask(simpleTask);
			if (result == null)
				result = caseNamedElement(simpleTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.BASE_TASK: {
			BaseTask baseTask = (BaseTask) theEObject;
			T result = caseBaseTask(baseTask);
			if (result == null)
				result = caseAbstractTask(baseTask);
			if (result == null)
				result = caseNamedElement(baseTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.TASK_OUTPUT: {
			TaskOutput taskOutput = (TaskOutput) theEObject;
			T result = caseTaskOutput(taskOutput);
			if (result == null)
				result = caseNamedElement(taskOutput);
			if (result == null)
				result = caseTypedElement(taskOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.TASK_INPUT: {
			TaskInput taskInput = (TaskInput) theEObject;
			T result = caseTaskInput(taskInput);
			if (result == null)
				result = caseNamedElement(taskInput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.LIBRARY_FUNCTION: {
			LibraryFunction libraryFunction = (LibraryFunction) theEObject;
			T result = caseLibraryFunction(libraryFunction);
			if (result == null)
				result = caseNamedElement(libraryFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.LIBRARY_TASK: {
			LibraryTask libraryTask = (LibraryTask) theEObject;
			T result = caseLibraryTask(libraryTask);
			if (result == null)
				result = caseSimpleTask(libraryTask);
			if (result == null)
				result = caseAbstractTask(libraryTask);
			if (result == null)
				result = caseNamedElement(libraryTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.WORKFLOW: {
			Workflow workflow = (Workflow) theEObject;
			T result = caseWorkflow(workflow);
			if (result == null)
				result = caseNamedElement(workflow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.SETTER: {
			Setter setter = (Setter) theEObject;
			T result = caseSetter(setter);
			if (result == null)
				result = caseTypedElement(setter);
			if (result == null)
				result = caseTaskInput(setter);
			if (result == null)
				result = caseNamedElement(setter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = caseTaskInput(connection);
			if (result == null)
				result = caseNamedElement(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.CUSTOM_TASK: {
			CustomTask customTask = (CustomTask) theEObject;
			T result = caseCustomTask(customTask);
			if (result == null)
				result = caseSimpleTask(customTask);
			if (result == null)
				result = caseAbstractTask(customTask);
			if (result == null)
				result = caseNamedElement(customTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.NSETTER: {
			Nsetter nsetter = (Nsetter) theEObject;
			T result = caseNsetter(nsetter);
			if (result == null)
				result = caseSetter(nsetter);
			if (result == null)
				result = caseTypedElement(nsetter);
			if (result == null)
				result = caseTaskInput(nsetter);
			if (result == null)
				result = caseNamedElement(nsetter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.IS_INIT_SETTER: {
			IsInitSetter isInitSetter = (IsInitSetter) theEObject;
			T result = caseIsInitSetter(isInitSetter);
			if (result == null)
				result = caseNsetter(isInitSetter);
			if (result == null)
				result = caseSetter(isInitSetter);
			if (result == null)
				result = caseTypedElement(isInitSetter);
			if (result == null)
				result = caseTaskInput(isInitSetter);
			if (result == null)
				result = caseNamedElement(isInitSetter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.IS_NOT_INIT_SETTER: {
			IsNotInitSetter isNotInitSetter = (IsNotInitSetter) theEObject;
			T result = caseIsNotInitSetter(isNotInitSetter);
			if (result == null)
				result = caseIsInitSetter(isNotInitSetter);
			if (result == null)
				result = caseNsetter(isNotInitSetter);
			if (result == null)
				result = caseSetter(isNotInitSetter);
			if (result == null)
				result = caseTypedElement(isNotInitSetter);
			if (result == null)
				result = caseTaskInput(isNotInitSetter);
			if (result == null)
				result = caseNamedElement(isNotInitSetter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseTypedElement(input);
			if (result == null)
				result = caseNamedElement(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case WorkflowPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = caseNamedElement(output);
			if (result == null)
				result = caseTypedElement(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTask(AbstractTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTask(SimpleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseTask(BaseTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInput(TaskInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryFunction(LibraryFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryTask(LibraryTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetter(Setter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTask(CustomTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nsetter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nsetter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNsetter(Nsetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Init Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Init Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsInitSetter(IsInitSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Not Init Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Not Init Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsNotInitSetter(IsNotInitSetter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WorkflowSwitch
