package com.altran.optimind.testGeneration;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.altran.optimind.model.workflow.Workflow;
import com.altran.optimind.model.workflow.WorkflowPackage;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		Workflow w = loadWorkflowFromXMI("resources/Workflow1.xmi");
		
		System.out.println(w.getName());
		
	}

	
	public static Workflow loadWorkflowFromXMI(String modelInstanceURI) {

		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, WorkflowPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("optimind", new XMIResourceFactoryImpl());

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(modelInstanceURI);
		Resource resource = resourceSet.getResource(fileURI, true);
		Workflow rootpackage = (Workflow) resource.getContents().get(0);
		return rootpackage;
		
	}
}
