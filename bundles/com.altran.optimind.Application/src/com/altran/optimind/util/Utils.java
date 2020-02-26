package com.altran.optimind.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import com.altran.optimind.model.workflow.*;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


public class Utils {
	
	public static Workflow loadWorkflowFromXMI(String modelInstanceURI) {

		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, WorkflowPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(modelInstanceURI);
		Resource resource = resourceSet.getResource(fileURI, true);
		Workflow rootpackage = (Workflow) resource.getContents().get(0);
		return rootpackage;
		
	}
	
	public static Document createDocument(Workflow rootObject) {
		
		Document document = DocumentHelper.createDocument();
        Element root = document.addElement("root");
		
		BaseTask task = rootObject.getBaseTask(); 
        createAbstractTaskElement(root, task);

        return document;
    }

	public static void writeDocToXMLFile(Document document,String fileName) {
		
		FileWriter out;
		try {
			out = new FileWriter(fileName);
			document.write(out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void createAbstractTaskElement(Element root, AbstractTask task) {
		
		if(task instanceof BaseTask) 
			createBaseTaskElement(root, (BaseTask) task);	
		
		else if (task instanceof LibraryTask) {
			createLibraryTaskElement(root,(LibraryTask) task);
		}
		else if (task instanceof CustomTask) {
			createCustomTaskElement(root,(CustomTask) task);
		}
	}

	
	private static void createBaseTaskElement(Element root, BaseTask basetask) {
		
		Element baseTaskElement = root.addElement("BaseTask")
				.addAttribute("is_prepared", basetask.getStatus().getLiteral())
				.addAttribute("local_name", basetask.getName())
				.addAttribute("master_value", "False")
				.addAttribute("n", "0")
				.addAttribute("plugged_outputs", "set()");
		
		createTaskBodyElements(baseTaskElement, basetask);
		
	}

	private static void createLibraryTaskElement(Element root, LibraryTask libraryTask) {
		
		Element libraryTaskElement = root.addElement("LibraryTask")
				.addAttribute("is_prepared", libraryTask.getStatus().getLiteral())
				.addAttribute("is_single_output", "true")
				.addAttribute("library_function", "xxxx")
				.addAttribute("local_name", libraryTask.getName())
				.addAttribute("master_value", "False")
				.addAttribute("n", "0")
				.addAttribute("plugged_outputs", "set()");
		
		createTaskBodyElements(libraryTaskElement, libraryTask);
		
	}
	
	private static void createCustomTaskElement(Element root, CustomTask task) {
		// TODO createCustomTaskElement
		
	}
	
	private static void createTaskBodyElements(Element AbstractTaskElement, AbstractTask task) {
		
		createErrorsElementElement(AbstractTaskElement, task);
		
		createOptionalDataObjectElement(AbstractTaskElement, task);
		
		createMandatoryDataObjectElement(AbstractTaskElement, task);
		
		createInputElements(AbstractTaskElement, task);
		
		createChildrenElement(AbstractTaskElement, task);
		
	}
	
	
	private static void createErrorsElementElement(Element rootTaskElement, AbstractTask task) {
		Element errors = rootTaskElement.addElement("errors");
		// TODO errors
	}
	
	private static void createOptionalDataObjectElement(Element rootTaskElement, AbstractTask task) {
		Element optionalDataObject = rootTaskElement.addElement("WithOptionalDataObject");
		// TODO createOptionalDataObjectElement
	}
	
	private static void createMandatoryDataObjectElement(Element rootTaskElement, AbstractTask task) {
		Element mandatoryDataObject = rootTaskElement.addElement("AllMandatoryDataObject");
		// TODO createMandatoryDataObjectElement
	}
	
	private static void createInputElements(Element rootTaskElement, AbstractTask task) {
		
		Element setter = rootTaskElement.addElement("setters");
		Element input_connector = rootTaskElement.addElement("input_connectors");
		
		List<TaskInput> inputs =task.getInputs();
		for(TaskInput input:inputs) {
			if(Setter.class.isAssignableFrom(input.getClass()) ) {
				createSetterSubElement(setter, (Setter)input);
			}
			else if (input instanceof Connection) {
				createConnectorElement(input_connector, (Connection) input);
			}
		}
	}
	
	private static void createSetterSubElement(Element rootSetterElement, Setter subSetter) {
		
		if(subSetter instanceof Nsetter) {
			addSetterSubElement(rootSetterElement, subSetter, "Nsetter");
		}
		
		else if (subSetter instanceof IsInitSetter) {
			addSetterSubElement(rootSetterElement, subSetter, "IsInitSetter");
		}
		
		else if (subSetter instanceof IsNotInitSetter) {
			addSetterSubElement(rootSetterElement, subSetter, "IsNotInitSetter");
		}
		else {
			addSetterSubElement(rootSetterElement, subSetter, "InputSetter");
			
		}
		
	}

	private static void addSetterSubElement(Element rootSetterElement, Setter setter, String tagName) {
		Element subSetter = rootSetterElement.addElement(tagName)
				.addAttribute("input_name", setter.getName());
		Element subSetterTypeValue = subSetter.addElement(setter.getTypeAsString())
				.addAttribute("complete_type", setter.getTypeAsString())
				.addAttribute("value", setter.getValueAsString());
		
	}

	private static void createConnectorElement(Element rootConnectorElement, Connection connection) {
		Element connector = rootConnectorElement.addElement("Connector")
				.addAttribute("external_input_name", "")
				.addAttribute("external_output_name", "")
				.addAttribute("object_with_input", "")
				.addAttribute("object_with_output", "");
	}

	private static void createChildrenElement(Element rootTaskElement, AbstractTask task) {
		Element childrenElemnt = rootTaskElement.addElement("children");
		Element children_status = rootTaskElement.addElement("children_status");
		if(task instanceof BaseTask) {
			BaseTask baseTask=(BaseTask) task;
			
			for(AbstractTask abstractTask:baseTask.getChildren()) {
				createAbstractTaskElement(childrenElemnt, abstractTask);
				createChildrenStatusSubElement(children_status, abstractTask);
			}
		}
	}
	
	private static void createChildrenStatusSubElement(Element rootChildrenStatusElement, AbstractTask task) {
		Element childStatus = rootChildrenStatusElement.addElement("child_status")
				.addAttribute("child_name", task.getName())
				.addAttribute("status", task.getStatus().getLiteral());
	}


}
