/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory) EPackage.Registry.INSTANCE
					.getEFactory(WorkflowPackage.eNS_URI);
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WorkflowPackage.TYPED_ELEMENT:
			return createTypedElement();
		case WorkflowPackage.NAMED_ELEMENT:
			return createNamedElement();
		case WorkflowPackage.BASE_TASK:
			return createBaseTask();
		case WorkflowPackage.TASK_OUTPUT:
			return createTaskOutput();
		case WorkflowPackage.LIBRARY_FUNCTION:
			return createLibraryFunction();
		case WorkflowPackage.LIBRARY_TASK:
			return createLibraryTask();
		case WorkflowPackage.WORKFLOW:
			return createWorkflow();
		case WorkflowPackage.SETTER:
			return createSetter();
		case WorkflowPackage.CONNECTION:
			return createConnection();
		case WorkflowPackage.CUSTOM_TASK:
			return createCustomTask();
		case WorkflowPackage.NSETTER:
			return createNsetter();
		case WorkflowPackage.IS_INIT_SETTER:
			return createIsInitSetter();
		case WorkflowPackage.IS_NOT_INIT_SETTER:
			return createIsNotInitSetter();
		case WorkflowPackage.INPUT:
			return createInput();
		case WorkflowPackage.OUTPUT:
			return createOutput();
		case WorkflowPackage.WHILE_STATEMENT:
			return createWhileStatement();
		case WorkflowPackage.FOR_STATEMENT:
			return createForStatement();
		case WorkflowPackage.IF_STATEMENT:
			return createIfStatement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.TASK_STATUS:
			return createTaskStatusFromString(eDataType, initialValue);
		case WorkflowPackage.LANGUAGE:
			return createLanguageFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.TASK_STATUS:
			return convertTaskStatusToString(eDataType, instanceValue);
		case WorkflowPackage.LANGUAGE:
			return convertLanguageToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseTask createBaseTask() {
		BaseTaskImpl baseTask = new BaseTaskImpl();
		return baseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskOutput createTaskOutput() {
		TaskOutputImpl taskOutput = new TaskOutputImpl();
		return taskOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LibraryFunction createLibraryFunction() {
		LibraryFunctionImpl libraryFunction = new LibraryFunctionImpl();
		return libraryFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LibraryTask createLibraryTask() {
		LibraryTaskImpl libraryTask = new LibraryTaskImpl();
		return libraryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Setter createSetter() {
		SetterImpl setter = new SetterImpl();
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTask createCustomTask() {
		CustomTaskImpl customTask = new CustomTaskImpl();
		return customTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nsetter createNsetter() {
		NsetterImpl nsetter = new NsetterImpl();
		return nsetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsInitSetter createIsInitSetter() {
		IsInitSetterImpl isInitSetter = new IsInitSetterImpl();
		return isInitSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsNotInitSetter createIsNotInitSetter() {
		IsNotInitSetterImpl isNotInitSetter = new IsNotInitSetterImpl();
		return isNotInitSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskStatus createTaskStatusFromString(EDataType eDataType, String initialValue) {
		TaskStatus result = TaskStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
