package com.altran.optimind.model.workflow;

import org.dom4j.Document;
import com.altran.optimind.model.workflow.*;

public class ModelTransformer {
	
	
	public static void main(String[] args) {
		
		Workflow workflow=Utils.loadWorkflowFromXMI("model//Workflow.xmi");
		
		Document document=Utils.createDocument(workflow);
		
		Utils.writeDocToXMLFile(document,"workflow.xml");

	}

}
