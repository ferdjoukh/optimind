/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.WorkflowPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.LibraryTaskImpl#getLibraryfunction <em>Libraryfunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryTaskImpl extends SimpleTaskImpl implements LibraryTask {
	/**
	 * The cached value of the '{@link #getLibraryfunction() <em>Libraryfunction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryfunction()
	 * @generated
	 * @ordered
	 */
	protected LibraryFunction libraryfunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.LIBRARY_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LibraryFunction getLibraryfunction() {
		if (libraryfunction != null && libraryfunction.eIsProxy()) {
			InternalEObject oldLibraryfunction = (InternalEObject) libraryfunction;
			libraryfunction = (LibraryFunction) eResolveProxy(oldLibraryfunction);
			if (libraryfunction != oldLibraryfunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION, oldLibraryfunction, libraryfunction));
			}
		}
		return libraryfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryFunction basicGetLibraryfunction() {
		return libraryfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibraryfunction(LibraryFunction newLibraryfunction) {
		LibraryFunction oldLibraryfunction = libraryfunction;
		libraryfunction = newLibraryfunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION,
					oldLibraryfunction, libraryfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION:
			if (resolve)
				return getLibraryfunction();
			return basicGetLibraryfunction();
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
		case WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION:
			setLibraryfunction((LibraryFunction) newValue);
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
		case WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION:
			setLibraryfunction((LibraryFunction) null);
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
		case WorkflowPackage.LIBRARY_TASK__LIBRARYFUNCTION:
			return libraryfunction != null;
		}
		return super.eIsSet(featureID);
	}

} //LibraryTaskImpl
