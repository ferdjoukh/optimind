/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.AbstractStatement;
import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.TaskInput;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.TaskStatus;
import com.altran.optimind.model.workflow.WorkflowPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.AbstractStatementImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.AbstractStatementImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.AbstractStatementImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStatementImpl extends NamedElementImpl implements AbstractStatement {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskInput> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskOutput> outputs;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TaskStatus STATUS_EDEFAULT = TaskStatus.NOT_PREPARED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TaskStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ABSTRACT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<TaskInput>(TaskInput.class, this,
					WorkflowPackage.ABSTRACT_STATEMENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<TaskOutput>(TaskOutput.class, this,
					WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(TaskStatus newStatus) {
		TaskStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ABSTRACT_STATEMENT__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
			return getInputs();
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			return getOutputs();
		case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
			return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends TaskInput>) newValue);
			return;
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends TaskOutput>) newValue);
			return;
		case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
			setStatus((TaskStatus) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
			getInputs().clear();
			return;
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			getOutputs().clear();
			return;
		case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
			return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractTask.class) {
			switch (derivedFeatureID) {
			case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
				return WorkflowPackage.ABSTRACT_TASK__INPUTS;
			case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
				return WorkflowPackage.ABSTRACT_TASK__OUTPUTS;
			case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
				return WorkflowPackage.ABSTRACT_TASK__STATUS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractTask.class) {
			switch (baseFeatureID) {
			case WorkflowPackage.ABSTRACT_TASK__INPUTS:
				return WorkflowPackage.ABSTRACT_STATEMENT__INPUTS;
			case WorkflowPackage.ABSTRACT_TASK__OUTPUTS:
				return WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS;
			case WorkflowPackage.ABSTRACT_TASK__STATUS:
				return WorkflowPackage.ABSTRACT_STATEMENT__STATUS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AbstractStatementImpl
