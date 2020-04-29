package com.altran.optimind.ui.action;

import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.altran.optimind.application.Activator;
import com.altran.optimind.application.View;

public class ExecuteWorkflowAction extends Action{
	
	protected Shell shell;
	protected ISelectionProvider selectionProvider;
	
	public ExecuteWorkflowAction(Shell shell, ISelectionProvider selectionProvider) {
		super();
		this.shell = shell;
		this.selectionProvider = selectionProvider;
		setText("Run");

		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
				"icons//finish_flag.png");
		setImageDescriptor(imageDesc);
	}
	
	@Override
	public void run() {
		System.out.println("J'exécute le workflow !!!");
	}
}
