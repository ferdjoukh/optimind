/**
 */
package com.altran.optimind.model.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.altran.optimind.model.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.altran.com/optimind/model.workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = com.altran.optimind.model.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.NamedElementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.AbstractTaskImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getAbstractTask()
	 * @generated
	 */
	int ABSTRACT_TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__OUTPUTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.TypedElementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE_AS_STRING = 0;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__VALUE_AS_STRING = 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.SimpleTaskImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getSimpleTask()
	 * @generated
	 */
	int SIMPLE_TASK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__INPUTS = ABSTRACT_TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__OUTPUTS = ABSTRACT_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK__STATUS = ABSTRACT_TASK__STATUS;

	/**
	 * The number of structural features of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.BaseTaskImpl <em>Base Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.BaseTaskImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getBaseTask()
	 * @generated
	 */
	int BASE_TASK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK__NAME = ABSTRACT_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK__INPUTS = ABSTRACT_TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK__OUTPUTS = ABSTRACT_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK__STATUS = ABSTRACT_TASK__STATUS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK__CHILDREN = ABSTRACT_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK_FEATURE_COUNT = ABSTRACT_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Base Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TASK_OPERATION_COUNT = ABSTRACT_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.TaskOutputImpl <em>Task Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.TaskOutputImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskOutput()
	 * @generated
	 */
	int TASK_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__TYPE_AS_STRING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT__VALUE_AS_STRING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OUTPUT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.TaskInputImpl <em>Task Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.TaskInputImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskInput()
	 * @generated
	 */
	int TASK_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_INPUT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.LibraryFunctionImpl <em>Library Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.LibraryFunctionImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLibraryFunction()
	 * @generated
	 */
	int LIBRARY_FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__OUTPUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION__FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Library Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Library Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.LibraryTaskImpl <em>Library Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.LibraryTaskImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLibraryTask()
	 * @generated
	 */
	int LIBRARY_TASK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__INPUTS = SIMPLE_TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__OUTPUTS = SIMPLE_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__STATUS = SIMPLE_TASK__STATUS;

	/**
	 * The feature id for the '<em><b>Libraryfunction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__LIBRARYFUNCTION = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Library Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Library Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK_OPERATION_COUNT = SIMPLE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.WorkflowImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Base Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__BASE_TASK = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__LANGUAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.SetterImpl <em>Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.SetterImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getSetter()
	 * @generated
	 */
	int SETTER = 10;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__TYPE_AS_STRING = TYPED_ELEMENT__TYPE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__VALUE_AS_STRING = TYPED_ELEMENT__VALUE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.ConnectionImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = TASK_INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Taskoutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TASKOUTPUT = TASK_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = TASK_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = TASK_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.CustomTaskImpl <em>Custom Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.CustomTaskImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getCustomTask()
	 * @generated
	 */
	int CUSTOM_TASK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK__NAME = SIMPLE_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK__INPUTS = SIMPLE_TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK__OUTPUTS = SIMPLE_TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK__STATUS = SIMPLE_TASK__STATUS;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK__RUNNER = SIMPLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_FEATURE_COUNT = SIMPLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TASK_OPERATION_COUNT = SIMPLE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.NsetterImpl <em>Nsetter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.NsetterImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getNsetter()
	 * @generated
	 */
	int NSETTER = 13;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSETTER__TYPE_AS_STRING = SETTER__TYPE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSETTER__VALUE_AS_STRING = SETTER__VALUE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSETTER__NAME = SETTER__NAME;

	/**
	 * The number of structural features of the '<em>Nsetter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSETTER_FEATURE_COUNT = SETTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nsetter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSETTER_OPERATION_COUNT = SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.IsInitSetterImpl <em>Is Init Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.IsInitSetterImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIsInitSetter()
	 * @generated
	 */
	int IS_INIT_SETTER = 14;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INIT_SETTER__TYPE_AS_STRING = NSETTER__TYPE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INIT_SETTER__VALUE_AS_STRING = NSETTER__VALUE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INIT_SETTER__NAME = NSETTER__NAME;

	/**
	 * The number of structural features of the '<em>Is Init Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INIT_SETTER_FEATURE_COUNT = NSETTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Init Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INIT_SETTER_OPERATION_COUNT = NSETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.IsNotInitSetterImpl <em>Is Not Init Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.IsNotInitSetterImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIsNotInitSetter()
	 * @generated
	 */
	int IS_NOT_INIT_SETTER = 15;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_INIT_SETTER__TYPE_AS_STRING = IS_INIT_SETTER__TYPE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_INIT_SETTER__VALUE_AS_STRING = IS_INIT_SETTER__VALUE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_INIT_SETTER__NAME = IS_INIT_SETTER__NAME;

	/**
	 * The number of structural features of the '<em>Is Not Init Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_INIT_SETTER_FEATURE_COUNT = IS_INIT_SETTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Not Init Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NOT_INIT_SETTER_OPERATION_COUNT = IS_INIT_SETTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.InputImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 16;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE_AS_STRING = TYPED_ELEMENT__TYPE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE_AS_STRING = TYPED_ELEMENT__VALUE_AS_STRING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.OutputImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE_AS_STRING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE_AS_STRING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.AbstractStatementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getAbstractStatement()
	 * @generated
	 */
	int ABSTRACT_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__OUTPUTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT__CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STATEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.WhileStatementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__NAME = ABSTRACT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__INPUTS = ABSTRACT_STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__OUTPUTS = ABSTRACT_STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__STATUS = ABSTRACT_STATEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = ABSTRACT_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Abstracttask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__ABSTRACTTASK = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_OPERATION_COUNT = ABSTRACT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.ForStatementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__NAME = WHILE_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INPUTS = WHILE_STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__OUTPUTS = WHILE_STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__STATUS = WHILE_STATEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONDITION = WHILE_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Abstracttask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__ABSTRACTTASK = WHILE_STATEMENT__ABSTRACTTASK;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__FROM = WHILE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__TO = WHILE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INCREMENT = WHILE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = WHILE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_OPERATION_COUNT = WHILE_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.impl.IfStatementImpl
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__NAME = ABSTRACT_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__INPUTS = ABSTRACT_STATEMENT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__OUTPUTS = ABSTRACT_STATEMENT__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__STATUS = ABSTRACT_STATEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = ABSTRACT_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN = ABSTRACT_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE = ABSTRACT_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = ABSTRACT_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_OPERATION_COUNT = ABSTRACT_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.TaskStatus <em>Task Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.TaskStatus
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskStatus()
	 * @generated
	 */
	int TASK_STATUS = 22;

	/**
	 * The meta object id for the '{@link com.altran.optimind.model.workflow.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.altran.optimind.model.workflow.Language
	 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 23;

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.AbstractTask <em>Abstract Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Task</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractTask
	 * @generated
	 */
	EClass getAbstractTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.AbstractTask#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractTask#getInputs()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.AbstractTask#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractTask#getOutputs()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EReference getAbstractTask_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.AbstractTask#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractTask#getStatus()
	 * @see #getAbstractTask()
	 * @generated
	 */
	EAttribute getAbstractTask_Status();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see com.altran.optimind.model.workflow.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.TypedElement#getTypeAsString <em>Type As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type As String</em>'.
	 * @see com.altran.optimind.model.workflow.TypedElement#getTypeAsString()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_TypeAsString();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.TypedElement#getValueAsString <em>Value As String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value As String</em>'.
	 * @see com.altran.optimind.model.workflow.TypedElement#getValueAsString()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_ValueAsString();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.altran.optimind.model.workflow.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.altran.optimind.model.workflow.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Task</em>'.
	 * @see com.altran.optimind.model.workflow.SimpleTask
	 * @generated
	 */
	EClass getSimpleTask();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.BaseTask <em>Base Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Task</em>'.
	 * @see com.altran.optimind.model.workflow.BaseTask
	 * @generated
	 */
	EClass getBaseTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.BaseTask#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.altran.optimind.model.workflow.BaseTask#getChildren()
	 * @see #getBaseTask()
	 * @generated
	 */
	EReference getBaseTask_Children();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.TaskOutput <em>Task Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Output</em>'.
	 * @see com.altran.optimind.model.workflow.TaskOutput
	 * @generated
	 */
	EClass getTaskOutput();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.TaskInput <em>Task Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Input</em>'.
	 * @see com.altran.optimind.model.workflow.TaskInput
	 * @generated
	 */
	EClass getTaskInput();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.LibraryFunction <em>Library Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Function</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryFunction
	 * @generated
	 */
	EClass getLibraryFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.LibraryFunction#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryFunction#getOutputs()
	 * @see #getLibraryFunction()
	 * @generated
	 */
	EReference getLibraryFunction_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.LibraryFunction#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryFunction#getInputs()
	 * @see #getLibraryFunction()
	 * @generated
	 */
	EReference getLibraryFunction_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.LibraryFunction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryFunction#getFunction()
	 * @see #getLibraryFunction()
	 * @generated
	 */
	EAttribute getLibraryFunction_Function();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.LibraryTask <em>Library Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Task</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryTask
	 * @generated
	 */
	EClass getLibraryTask();

	/**
	 * Returns the meta object for the reference '{@link com.altran.optimind.model.workflow.LibraryTask#getLibraryfunction <em>Libraryfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Libraryfunction</em>'.
	 * @see com.altran.optimind.model.workflow.LibraryTask#getLibraryfunction()
	 * @see #getLibraryTask()
	 * @generated
	 */
	EReference getLibraryTask_Libraryfunction();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see com.altran.optimind.model.workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.optimind.model.workflow.Workflow#getBaseTask <em>Base Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Task</em>'.
	 * @see com.altran.optimind.model.workflow.Workflow#getBaseTask()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_BaseTask();

	/**
	 * Returns the meta object for the containment reference list '{@link com.altran.optimind.model.workflow.Workflow#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.altran.optimind.model.workflow.Workflow#getFunctions()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Functions();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.Workflow#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see com.altran.optimind.model.workflow.Workflow#getLanguage()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Language();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter</em>'.
	 * @see com.altran.optimind.model.workflow.Setter
	 * @generated
	 */
	EClass getSetter();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see com.altran.optimind.model.workflow.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link com.altran.optimind.model.workflow.Connection#getTaskoutput <em>Taskoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taskoutput</em>'.
	 * @see com.altran.optimind.model.workflow.Connection#getTaskoutput()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Taskoutput();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.CustomTask <em>Custom Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Task</em>'.
	 * @see com.altran.optimind.model.workflow.CustomTask
	 * @generated
	 */
	EClass getCustomTask();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.CustomTask#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runner</em>'.
	 * @see com.altran.optimind.model.workflow.CustomTask#getRunner()
	 * @see #getCustomTask()
	 * @generated
	 */
	EAttribute getCustomTask_Runner();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Nsetter <em>Nsetter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nsetter</em>'.
	 * @see com.altran.optimind.model.workflow.Nsetter
	 * @generated
	 */
	EClass getNsetter();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.IsInitSetter <em>Is Init Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Init Setter</em>'.
	 * @see com.altran.optimind.model.workflow.IsInitSetter
	 * @generated
	 */
	EClass getIsInitSetter();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.IsNotInitSetter <em>Is Not Init Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Not Init Setter</em>'.
	 * @see com.altran.optimind.model.workflow.IsNotInitSetter
	 * @generated
	 */
	EClass getIsNotInitSetter();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.altran.optimind.model.workflow.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.altran.optimind.model.workflow.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see com.altran.optimind.model.workflow.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.optimind.model.workflow.WhileStatement#getAbstracttask <em>Abstracttask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstracttask</em>'.
	 * @see com.altran.optimind.model.workflow.WhileStatement#getAbstracttask()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Abstracttask();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.AbstractStatement <em>Abstract Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Statement</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractStatement
	 * @generated
	 */
	EClass getAbstractStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.AbstractStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.altran.optimind.model.workflow.AbstractStatement#getCondition()
	 * @see #getAbstractStatement()
	 * @generated
	 */
	EAttribute getAbstractStatement_Condition();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see com.altran.optimind.model.workflow.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.ForStatement#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.altran.optimind.model.workflow.ForStatement#getFrom()
	 * @see #getForStatement()
	 * @generated
	 */
	EAttribute getForStatement_From();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.ForStatement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.altran.optimind.model.workflow.ForStatement#getTo()
	 * @see #getForStatement()
	 * @generated
	 */
	EAttribute getForStatement_To();

	/**
	 * Returns the meta object for the attribute '{@link com.altran.optimind.model.workflow.ForStatement#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see com.altran.optimind.model.workflow.ForStatement#getIncrement()
	 * @see #getForStatement()
	 * @generated
	 */
	EAttribute getForStatement_Increment();

	/**
	 * Returns the meta object for class '{@link com.altran.optimind.model.workflow.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see com.altran.optimind.model.workflow.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.optimind.model.workflow.IfStatement#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.altran.optimind.model.workflow.IfStatement#getThen()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.altran.optimind.model.workflow.IfStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.altran.optimind.model.workflow.IfStatement#getElse()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Else();

	/**
	 * Returns the meta object for enum '{@link com.altran.optimind.model.workflow.TaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Status</em>'.
	 * @see com.altran.optimind.model.workflow.TaskStatus
	 * @generated
	 */
	EEnum getTaskStatus();

	/**
	 * Returns the meta object for enum '{@link com.altran.optimind.model.workflow.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see com.altran.optimind.model.workflow.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.AbstractTaskImpl <em>Abstract Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.AbstractTaskImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getAbstractTask()
		 * @generated
		 */
		EClass ABSTRACT_TASK = eINSTANCE.getAbstractTask();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__INPUTS = eINSTANCE.getAbstractTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TASK__OUTPUTS = eINSTANCE.getAbstractTask_Outputs();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TASK__STATUS = eINSTANCE.getAbstractTask_Status();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.TypedElementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE_AS_STRING = eINSTANCE.getTypedElement_TypeAsString();

		/**
		 * The meta object literal for the '<em><b>Value As String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__VALUE_AS_STRING = eINSTANCE.getTypedElement_ValueAsString();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.NamedElementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.SimpleTaskImpl <em>Simple Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.SimpleTaskImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getSimpleTask()
		 * @generated
		 */
		EClass SIMPLE_TASK = eINSTANCE.getSimpleTask();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.BaseTaskImpl <em>Base Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.BaseTaskImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getBaseTask()
		 * @generated
		 */
		EClass BASE_TASK = eINSTANCE.getBaseTask();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_TASK__CHILDREN = eINSTANCE.getBaseTask_Children();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.TaskOutputImpl <em>Task Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.TaskOutputImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskOutput()
		 * @generated
		 */
		EClass TASK_OUTPUT = eINSTANCE.getTaskOutput();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.TaskInputImpl <em>Task Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.TaskInputImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskInput()
		 * @generated
		 */
		EClass TASK_INPUT = eINSTANCE.getTaskInput();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.LibraryFunctionImpl <em>Library Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.LibraryFunctionImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLibraryFunction()
		 * @generated
		 */
		EClass LIBRARY_FUNCTION = eINSTANCE.getLibraryFunction();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_FUNCTION__OUTPUTS = eINSTANCE.getLibraryFunction_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_FUNCTION__INPUTS = eINSTANCE.getLibraryFunction_Inputs();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY_FUNCTION__FUNCTION = eINSTANCE.getLibraryFunction_Function();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.LibraryTaskImpl <em>Library Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.LibraryTaskImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLibraryTask()
		 * @generated
		 */
		EClass LIBRARY_TASK = eINSTANCE.getLibraryTask();

		/**
		 * The meta object literal for the '<em><b>Libraryfunction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY_TASK__LIBRARYFUNCTION = eINSTANCE.getLibraryTask_Libraryfunction();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.WorkflowImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Base Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__BASE_TASK = eINSTANCE.getWorkflow_BaseTask();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__FUNCTIONS = eINSTANCE.getWorkflow_Functions();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__LANGUAGE = eINSTANCE.getWorkflow_Language();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.SetterImpl <em>Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.SetterImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getSetter()
		 * @generated
		 */
		EClass SETTER = eINSTANCE.getSetter();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.ConnectionImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Taskoutput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TASKOUTPUT = eINSTANCE.getConnection_Taskoutput();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.CustomTaskImpl <em>Custom Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.CustomTaskImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getCustomTask()
		 * @generated
		 */
		EClass CUSTOM_TASK = eINSTANCE.getCustomTask();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TASK__RUNNER = eINSTANCE.getCustomTask_Runner();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.NsetterImpl <em>Nsetter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.NsetterImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getNsetter()
		 * @generated
		 */
		EClass NSETTER = eINSTANCE.getNsetter();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.IsInitSetterImpl <em>Is Init Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.IsInitSetterImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIsInitSetter()
		 * @generated
		 */
		EClass IS_INIT_SETTER = eINSTANCE.getIsInitSetter();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.IsNotInitSetterImpl <em>Is Not Init Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.IsNotInitSetterImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIsNotInitSetter()
		 * @generated
		 */
		EClass IS_NOT_INIT_SETTER = eINSTANCE.getIsNotInitSetter();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.InputImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.OutputImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.WhileStatementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Abstracttask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__ABSTRACTTASK = eINSTANCE.getWhileStatement_Abstracttask();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.AbstractStatementImpl <em>Abstract Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.AbstractStatementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getAbstractStatement()
		 * @generated
		 */
		EClass ABSTRACT_STATEMENT = eINSTANCE.getAbstractStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STATEMENT__CONDITION = eINSTANCE.getAbstractStatement_Condition();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.ForStatementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_STATEMENT__FROM = eINSTANCE.getForStatement_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_STATEMENT__TO = eINSTANCE.getForStatement_To();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_STATEMENT__INCREMENT = eINSTANCE.getForStatement_Increment();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.impl.IfStatementImpl
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN = eINSTANCE.getIfStatement_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE = eINSTANCE.getIfStatement_Else();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.TaskStatus <em>Task Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.TaskStatus
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getTaskStatus()
		 * @generated
		 */
		EEnum TASK_STATUS = eINSTANCE.getTaskStatus();

		/**
		 * The meta object literal for the '{@link com.altran.optimind.model.workflow.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.altran.optimind.model.workflow.Language
		 * @see com.altran.optimind.model.workflow.impl.WorkflowPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //WorkflowPackage
