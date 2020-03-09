/**
 */
package com.altran.optimind.model.workflow.provider;

import com.altran.optimind.model.workflow.util.WorkflowAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProviderAdapterFactory extends WorkflowAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.TypedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementItemProvider typedElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.TypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypedElementAdapter() {
		if (typedElementItemProvider == null) {
			typedElementItemProvider = new TypedElementItemProvider(this);
		}

		return typedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.BaseTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseTaskItemProvider baseTaskItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.BaseTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseTaskAdapter() {
		if (baseTaskItemProvider == null) {
			baseTaskItemProvider = new BaseTaskItemProvider(this);
		}

		return baseTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.TaskOutput} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputItemProvider taskOutputItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.TaskOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskOutputAdapter() {
		if (taskOutputItemProvider == null) {
			taskOutputItemProvider = new TaskOutputItemProvider(this);
		}

		return taskOutputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.LibraryFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryFunctionItemProvider libraryFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.LibraryFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryFunctionAdapter() {
		if (libraryFunctionItemProvider == null) {
			libraryFunctionItemProvider = new LibraryFunctionItemProvider(this);
		}

		return libraryFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.LibraryTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryTaskItemProvider libraryTaskItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.LibraryTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryTaskAdapter() {
		if (libraryTaskItemProvider == null) {
			libraryTaskItemProvider = new LibraryTaskItemProvider(this);
		}

		return libraryTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Workflow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowItemProvider workflowItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowAdapter() {
		if (workflowItemProvider == null) {
			workflowItemProvider = new WorkflowItemProvider(this);
		}

		return workflowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Setter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterItemProvider setterItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Setter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetterAdapter() {
		if (setterItemProvider == null) {
			setterItemProvider = new SetterItemProvider(this);
		}

		return setterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.CustomTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTaskItemProvider customTaskItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.CustomTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomTaskAdapter() {
		if (customTaskItemProvider == null) {
			customTaskItemProvider = new CustomTaskItemProvider(this);
		}

		return customTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Nsetter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NsetterItemProvider nsetterItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Nsetter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNsetterAdapter() {
		if (nsetterItemProvider == null) {
			nsetterItemProvider = new NsetterItemProvider(this);
		}

		return nsetterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.IsInitSetter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsInitSetterItemProvider isInitSetterItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.IsInitSetter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsInitSetterAdapter() {
		if (isInitSetterItemProvider == null) {
			isInitSetterItemProvider = new IsInitSetterItemProvider(this);
		}

		return isInitSetterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.IsNotInitSetter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsNotInitSetterItemProvider isNotInitSetterItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.IsNotInitSetter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIsNotInitSetterAdapter() {
		if (isNotInitSetterItemProvider == null) {
			isNotInitSetterItemProvider = new IsNotInitSetterItemProvider(this);
		}

		return isNotInitSetterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.While} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileItemProvider whileItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.While}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileAdapter() {
		if (whileItemProvider == null) {
			whileItemProvider = new WhileItemProvider(this);
		}

		return whileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.For} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForItemProvider forItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.For}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForAdapter() {
		if (forItemProvider == null) {
			forItemProvider = new ForItemProvider(this);
		}

		return forItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.altran.optimind.model.workflow.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link com.altran.optimind.model.workflow.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (typedElementItemProvider != null)
			typedElementItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (baseTaskItemProvider != null)
			baseTaskItemProvider.dispose();
		if (taskOutputItemProvider != null)
			taskOutputItemProvider.dispose();
		if (libraryFunctionItemProvider != null)
			libraryFunctionItemProvider.dispose();
		if (libraryTaskItemProvider != null)
			libraryTaskItemProvider.dispose();
		if (workflowItemProvider != null)
			workflowItemProvider.dispose();
		if (setterItemProvider != null)
			setterItemProvider.dispose();
		if (connectionItemProvider != null)
			connectionItemProvider.dispose();
		if (customTaskItemProvider != null)
			customTaskItemProvider.dispose();
		if (nsetterItemProvider != null)
			nsetterItemProvider.dispose();
		if (isInitSetterItemProvider != null)
			isInitSetterItemProvider.dispose();
		if (isNotInitSetterItemProvider != null)
			isNotInitSetterItemProvider.dispose();
		if (inputItemProvider != null)
			inputItemProvider.dispose();
		if (outputItemProvider != null)
			outputItemProvider.dispose();
		if (whileItemProvider != null)
			whileItemProvider.dispose();
		if (forItemProvider != null)
			forItemProvider.dispose();
		if (ifItemProvider != null)
			ifItemProvider.dispose();
	}

}
