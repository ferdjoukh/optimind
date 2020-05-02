/**
 */
package com.altran.optimind.model.workflow.provider;

import com.altran.optimind.model.workflow.AbstractStatement;
import com.altran.optimind.model.workflow.WorkflowFactory;
import com.altran.optimind.model.workflow.WorkflowPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.altran.optimind.model.workflow.AbstractStatement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractStatementItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStatementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractTask_status_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AbstractTask_status_feature",
								"_UI_AbstractTask_type"),
						WorkflowPackage.Literals.ABSTRACT_TASK__STATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS);
			childrenFeatures.add(WorkflowPackage.Literals.ABSTRACT_TASK__OUTPUTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractStatement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_AbstractStatement_type")
				: getString("_UI_AbstractStatement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractStatement.class)) {
		case WorkflowPackage.ABSTRACT_STATEMENT__STATUS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case WorkflowPackage.ABSTRACT_STATEMENT__INPUTS:
		case WorkflowPackage.ABSTRACT_STATEMENT__OUTPUTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS,
				WorkflowFactory.eINSTANCE.createSetter()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS,
				WorkflowFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS,
				WorkflowFactory.eINSTANCE.createNsetter()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS,
				WorkflowFactory.eINSTANCE.createIsInitSetter()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__INPUTS,
				WorkflowFactory.eINSTANCE.createIsNotInitSetter()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ABSTRACT_TASK__OUTPUTS,
				WorkflowFactory.eINSTANCE.createTaskOutput()));
	}

}
