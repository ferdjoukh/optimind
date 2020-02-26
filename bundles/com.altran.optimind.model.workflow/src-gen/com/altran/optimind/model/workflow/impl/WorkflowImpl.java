/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Language;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.Workflow;
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
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.WorkflowImpl#getBaseTask <em>Base Task</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.WorkflowImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.WorkflowImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends NamedElementImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getBaseTask() <em>Base Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTask()
	 * @generated
	 * @ordered
	 */
	protected BaseTask baseTask;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryFunction> functions;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Language LANGUAGE_EDEFAULT = Language.PYTHON;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language = LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseTask getBaseTask() {
		return baseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseTask(BaseTask newBaseTask, NotificationChain msgs) {
		BaseTask oldBaseTask = baseTask;
		baseTask = newBaseTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.WORKFLOW__BASE_TASK, oldBaseTask, newBaseTask);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTask(BaseTask newBaseTask) {
		if (newBaseTask != baseTask) {
			NotificationChain msgs = null;
			if (baseTask != null)
				msgs = ((InternalEObject) baseTask).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW__BASE_TASK, null, msgs);
			if (newBaseTask != null)
				msgs = ((InternalEObject) newBaseTask).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW__BASE_TASK, null, msgs);
			msgs = basicSetBaseTask(newBaseTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW__BASE_TASK, newBaseTask,
					newBaseTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<LibraryFunction>(LibraryFunction.class, this,
					WorkflowPackage.WORKFLOW__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW__LANGUAGE, oldLanguage,
					language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.WORKFLOW__BASE_TASK:
			return basicSetBaseTask(null, msgs);
		case WorkflowPackage.WORKFLOW__FUNCTIONS:
			return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.WORKFLOW__BASE_TASK:
			return getBaseTask();
		case WorkflowPackage.WORKFLOW__FUNCTIONS:
			return getFunctions();
		case WorkflowPackage.WORKFLOW__LANGUAGE:
			return getLanguage();
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
		case WorkflowPackage.WORKFLOW__BASE_TASK:
			setBaseTask((BaseTask) newValue);
			return;
		case WorkflowPackage.WORKFLOW__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends LibraryFunction>) newValue);
			return;
		case WorkflowPackage.WORKFLOW__LANGUAGE:
			setLanguage((Language) newValue);
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
		case WorkflowPackage.WORKFLOW__BASE_TASK:
			setBaseTask((BaseTask) null);
			return;
		case WorkflowPackage.WORKFLOW__FUNCTIONS:
			getFunctions().clear();
			return;
		case WorkflowPackage.WORKFLOW__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
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
		case WorkflowPackage.WORKFLOW__BASE_TASK:
			return baseTask != null;
		case WorkflowPackage.WORKFLOW__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		case WorkflowPackage.WORKFLOW__LANGUAGE:
			return language != LANGUAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
