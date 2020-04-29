/**
 */
package com.altran.optimind.model.workflow.impl;

import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.TypedElement;
import com.altran.optimind.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.optimind.model.workflow.impl.TaskOutputImpl#getTypeAsString <em>Type As String</em>}</li>
 *   <li>{@link com.altran.optimind.model.workflow.impl.TaskOutputImpl#getValueAsString <em>Value As String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskOutputImpl extends NamedElementImpl implements TaskOutput {
	/**
	 * The default value of the '{@link #getTypeAsString() <em>Type As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAsString() <em>Type As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAsString()
	 * @generated
	 * @ordered
	 */
	protected String typeAsString = TYPE_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueAsString() <em>Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueAsString() <em>Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String valueAsString = VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeAsString() {
		return typeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeAsString(String newTypeAsString) {
		String oldTypeAsString = typeAsString;
		typeAsString = newTypeAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING,
					oldTypeAsString, typeAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueAsString() {
		return valueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueAsString(String newValueAsString) {
		String oldValueAsString = valueAsString;
		valueAsString = newValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING,
					oldValueAsString, valueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING:
			return getTypeAsString();
		case WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING:
			return getValueAsString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING:
			setTypeAsString((String) newValue);
			return;
		case WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING:
			setValueAsString((String) newValue);
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
		case WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING:
			setTypeAsString(TYPE_AS_STRING_EDEFAULT);
			return;
		case WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING:
			setValueAsString(VALUE_AS_STRING_EDEFAULT);
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
		case WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING:
			return TYPE_AS_STRING_EDEFAULT == null ? typeAsString != null
					: !TYPE_AS_STRING_EDEFAULT.equals(typeAsString);
		case WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING:
			return VALUE_AS_STRING_EDEFAULT == null ? valueAsString != null
					: !VALUE_AS_STRING_EDEFAULT.equals(valueAsString);
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING:
				return WorkflowPackage.TYPED_ELEMENT__TYPE_AS_STRING;
			case WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING:
				return WorkflowPackage.TYPED_ELEMENT__VALUE_AS_STRING;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case WorkflowPackage.TYPED_ELEMENT__TYPE_AS_STRING:
				return WorkflowPackage.TASK_OUTPUT__TYPE_AS_STRING;
			case WorkflowPackage.TYPED_ELEMENT__VALUE_AS_STRING:
				return WorkflowPackage.TASK_OUTPUT__VALUE_AS_STRING;
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
		result.append(" (typeAsString: ");
		result.append(typeAsString);
		result.append(", valueAsString: ");
		result.append(valueAsString);
		result.append(')');
		return result.toString();
	}

} //TaskOutputImpl
