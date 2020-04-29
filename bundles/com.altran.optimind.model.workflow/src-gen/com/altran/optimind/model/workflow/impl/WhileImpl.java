/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.While;
import com.altran.optimind.model.workflow.WorkflowPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.WhileImpl#getAbstracttask <em>Abstracttask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileImpl extends AbstractStatementImpl implements While {
	/**
	 * The cached value of the '{@link #getAbstracttask() <em>Abstracttask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstracttask()
	 * @generated
	 * @ordered
	 */
	protected AbstractTask abstracttask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTask getAbstracttask() {
		return abstracttask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstracttask(AbstractTask newAbstracttask, NotificationChain msgs) {
		AbstractTask oldAbstracttask = abstracttask;
		abstracttask = newAbstracttask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.WHILE__ABSTRACTTASK, oldAbstracttask, newAbstracttask);
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
	public void setAbstracttask(AbstractTask newAbstracttask) {
		if (newAbstracttask != abstracttask) {
			NotificationChain msgs = null;
			if (abstracttask != null)
				msgs = ((InternalEObject) abstracttask).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.WHILE__ABSTRACTTASK, null, msgs);
			if (newAbstracttask != null)
				msgs = ((InternalEObject) newAbstracttask).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.WHILE__ABSTRACTTASK, null, msgs);
			msgs = basicSetAbstracttask(newAbstracttask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WHILE__ABSTRACTTASK, newAbstracttask,
					newAbstracttask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.WHILE__ABSTRACTTASK:
			return basicSetAbstracttask(null, msgs);
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
		case WorkflowPackage.WHILE__ABSTRACTTASK:
			return getAbstracttask();
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
		case WorkflowPackage.WHILE__ABSTRACTTASK:
			setAbstracttask((AbstractTask) newValue);
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
		case WorkflowPackage.WHILE__ABSTRACTTASK:
			setAbstracttask((AbstractTask) null);
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
		case WorkflowPackage.WHILE__ABSTRACTTASK:
			return abstracttask != null;
		}
		return super.eIsSet(featureID);
	}

} //WhileImpl
