package com.altran.optimind.ui.action;

import java.util.ArrayList;

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
import com.altran.optimind.application.View;
import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.Workflow;
import com.altran.optimind.util.Utils;

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
		IStructuredSelection selection = (IStructuredSelection) selectionProvider.getSelection();
		File workflowFile =(File) selection.getFirstElement();	
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(workflowFile.getLocationURI().getPath());
		Resource resource = resourceSet.getResource(fileURI, true);
		Workflow rootpackage = (Workflow) resource.getContents().get(0);
		ArrayList<BaseTask> tabBaseTask = new ArrayList<BaseTask>();
		BaseTask baseTask = rootpackage.getBaseTask();
		for(int i = 0; i < baseTask.getChildren().size(); i++) {
			switch(baseTask.getChildren().get(i).eClass().getName()) {
				case "CustomTask" :
					CustomTask customTask = (CustomTask) baseTask.getChildren().get(i);
					System.out.println(customTask);
					break;
				case "LibraryTask" :
					LibraryTask libraryTask = (LibraryTask) baseTask.getChildren().get(i);
					System.out.println(libraryTask);
					break;
				case "BaseTask" :
					BaseTask newBaseTask = (BaseTask) baseTask.getChildren().get(i);
					System.out.println(newBaseTask);
					for(int x = 0; x < newBaseTask.getChildren().size(); x++) {
						switch(newBaseTask.getChildren().get(i).eClass().getName()) {
						case "CustomTask" :
							CustomTask newCustomTask = (CustomTask) newBaseTask.getChildren().get(x);
							System.out.println(newCustomTask);
							System.out.println(newCustomTask.getInputs());
							break;
						case "LibraryTask" :
							LibraryTask newLibraryTask = (LibraryTask) newBaseTask.getChildren().get(x);
							System.out.println(newLibraryTask);
							System.out.println(newLibraryTask.getInputs());
							break;
						default :
							break;
						}
					}
					break;
				default :
					break;
			}
			/*if(baseTask.getChildren().get(i).eClass().getName().equals("BaseTask")) {
				System.out.println("True");
				
			} else {
				System.out.println("False");
			}*/
		}
		//AbstractTask task = baseTask.getChildren().get(0);
		
		/*System.out.println(rootpackage.getLanguage());
		System.out.println(rootpackage.getFunctions());*/
	}
}
