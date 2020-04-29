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

public class ShowGraphAction extends Action {

	protected Shell shell;
	protected ISelectionProvider selectionProvider;

	public ShowGraphAction(Shell shell, ISelectionProvider selectionProvider) {
		super();
		this.shell = shell;
		this.selectionProvider = selectionProvider;
		setText("Show graph");

		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
				"icons//transform.gif");
		setImageDescriptor(imageDesc);
	}

	@Override
	public void run() {
		String imageAbsolutePath = getResourceAbsulotePath();
		View.lanchAndUpdateView(imageAbsolutePath);
	}
	
	private String getResourceAbsulotePath() {
		IStructuredSelection selection = (IStructuredSelection) selectionProvider.getSelection();
		File workflowFile = (File) selection.getFirstElement();
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(workflowFile.getLocationURI().getPath());
		Resource resource = resourceSet.getResource(fileURI, true);
		
		return nameConvertortoPng(resource.getURI().device() + resource.getURI().path());
	}

	private String nameConvertortoPng(String absolutePath) {
		String name;
		String pngFilePath;
		
		if (absolutePath.contains(".")) {
			int last = absolutePath.lastIndexOf(".");
			name = absolutePath.substring(0, last);
			// String extension = workflowFilePath.substring(last+1);
		} else {
			name = absolutePath;
		}
		return pngFilePath = name + ".png";
	}
}
