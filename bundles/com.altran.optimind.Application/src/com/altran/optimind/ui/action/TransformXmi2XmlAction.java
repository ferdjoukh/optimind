package com.altran.optimind.ui.action;


import org.dom4j.Document;
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
import com.altran.optimind.model.workflow.Workflow;
import com.altran.optimind.util.Utils;


public class TransformXmi2XmlAction extends Action {
	
	protected Shell shell;
	protected ISelectionProvider selectionProvider;
	
	public TransformXmi2XmlAction(Shell shell, ISelectionProvider selectionProvider) {
		this.shell = shell;
		this.selectionProvider = selectionProvider;
		setText("transform");
		
		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "icons//transform.gif");
		setImageDescriptor(imageDesc);
	}

	@Override
	public void run() {
		
		IStructuredSelection selection = (IStructuredSelection) selectionProvider.getSelection();
		File workflowFile =(File) selection.getFirstElement();	
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(workflowFile.getLocationURI().getPath());
		Resource resource = resourceSet.getResource(fileURI, true);
		Workflow rootpackage = (Workflow) resource.getContents().get(0);
		
		Document document=Utils.createDocument(rootpackage);
		
		Utils.writeDocToXMLFile(document,workflowFile.getLocationURI().getPath()+".xml");
		
	}

}
