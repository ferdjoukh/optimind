package com.altran.graphs

//import com.altran.OptimindStandaloneSetup

import com.altran.optimind.model.workflow.AbstractTask
import com.altran.optimind.model.workflow.BaseTask
import com.altran.optimind.model.workflow.Connection
import com.altran.optimind.model.workflow.Workflow
import java.io.BufferedWriter
import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter
import org.eclipse.core.runtime.Platform
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.EcoreUtil2
import org.osgi.framework.Bundle
import com.altran.optimind.model.workflow.LibraryTask
import com.altran.optimind.model.workflow.CustomTask

@Accessors class DotGraphGenerator {
	
	@Accessors(PUBLIC_GETTER) var String workflowFilePath
	@Accessors(PUBLIC_GETTER) var String dotFilePath;
	@Accessors(PUBLIC_GETTER) var String pngFilePath;
	@Accessors(PUBLIC_GETTER) var String pdfFilePath;
	@Accessors(PUBLIC_GETTER) var Workflow workflow;
	
	var Bundle bundle = Platform.getBundle("com.altran.optimind.xtext");
	var String bundlePath = bundle.location;
	var String dotCommandWindows =  "graphviz\\release\\bin\\dot.exe";
    //var String dotCommandWindows =  "C:\\Users\\aferdjoukh\\Documents\\Optimind\\optimind_rcp\\features\\com.altran.optimind.feature\\graphviz\\release\\bin\\dot.exe";
    //var String dotCommandWindows =  "C:\\Users\\aouadaf\\git\\optimind_rcp\\features\\com.altran.optimind.feature\\graphviz\\release\\bin\\dot.exe";
    
    
	var int cluster = 0;
	
	new(String filePath){
		
		this.dotCommandWindows = bundlePath.split("file:").get(1) + this.dotCommandWindows;
		this.workflowFilePath = filePath;
		var String name
		
		if (workflowFilePath.contains(".")) {
			var int last = workflowFilePath.lastIndexOf(".");
			name = workflowFilePath.substring(0, last);
			//String extension = workflowFilePath.substring(last+1);
		}else {
			name = workflowFilePath;
		}
		
		this.dotFilePath = name + ".dot";	
		this.pngFilePath = name + ".png";
		this.pdfFilePath = name + ".pdf";
	}
	
	new(String filePath, Workflow workflow){
		
		this.dotCommandWindows = bundlePath.split("file:").get(1) + this.dotCommandWindows;
		this.workflow = workflow;
		
		this.workflowFilePath = filePath;
		var String name
		
		if (workflowFilePath.contains(".")) {
			var int last = workflowFilePath.lastIndexOf(".");
			name = workflowFilePath.substring(0, last);
			//String extension = workflowFilePath.substring(last+1);
		}else {
			name = workflowFilePath;
		}
		
		this.dotFilePath = name + ".dot";	
		this.pngFilePath = name + ".png";
		this.pdfFilePath = name + ".pdf";
	}
	
	def boolean doesWorkflowExists() throws FileNotFoundException {
		
		var File workflow = new File(workflowFilePath);		
		if (workflow.exists()) {
			return true;
		}else {
			throw new FileNotFoundException(workflowFilePath + " does not exist or not file");
		}		
	}
	
	def boolean correctExtensionForWorkflow() throws IllegalArgumentException {
		
		if (workflowFilePath.endsWith("workflow") || workflowFilePath.endsWith("optimind") || workflowFilePath.endsWith("xmi")) {
			return true;
		}		
		throw new IllegalArgumentException(workflowFilePath + " has an incorrect file extension");	
	}
	
	def void createDotFile() throws IOException {
		
		System.out.println(bundlePath);
		
		
		 
		 if(doesWorkflowExists() && correctExtensionForWorkflow()){
		 	//this.workflow = loadWorkflow();
		 	var PrintWriter writer;
			writer =  new PrintWriter(new BufferedWriter(new FileWriter(this.dotFilePath)));
			writer.write(generateGraphContent(this.workflow))
			writer.close();
			
			createPngFile(this.dotFilePath, this.pngFilePath)
			createPdfFile(this.dotFilePath, this.pdfFilePath)
		 }		 
	}
	
	def createPdfFile(String dot, String pdf) {
		var String cmd = '''«dotCommandWindows» -Tpdf «dot» -o «pdf»''';
		try {
			Runtime.getRuntime().exec(cmd);
			System.out.println("[OK] " + pdf +" file generated");
		}
		catch(Exception e){
			System.out.println("[NOK] " + pdf +" file was not generated");
			e.printStackTrace()
		}	
	}
	
	def createPngFile(String dot, String png) {
		
		var String cmd = '''«dotCommandWindows» -Tpng «dot» -o «png»'''
		try {
			Runtime.getRuntime().exec(cmd);
			System.out.println("[OK] " + png +" file generated");
		}
		catch(Exception e){
			System.out.println("[NOK] " + png +" file was not generated");
			e.printStackTrace()
		}			
	}
	
//	def Workflow loadWorkflow() {
//		var Injector injector = new OptimindStandaloneSetup().createInjectorAndDoEMFRegistration();
// 		var XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
// 		var Resource resource = resourceSet.getResource(URI.createFileURI(this.workflowFilePath), true);
// 		var Workflow workflow = resource.getContents().get(0) as Workflow;
// 		return workflow;		
//	}
			
	def String generateGraphContent(Workflow workflow){
		'''digraph «workflow.name» {
		
			«««»«FOR basetask : workflow.tasks.filter(BaseTask)»
			«generateCluster(workflow.baseTask)»
			«««»«ENDFOR»	
			
			//Connections
			«var allConnections = EcoreUtil2.getAllContentsOfType(workflow, Connection)»
			
			«FOR connection : allConnections» 
				«var inputTask = connection.eContainer as AbstractTask»
				«var inputRef = connection.name»
				«var outputTask = connection.taskoutput.eContainer as AbstractTask»
				«var outputRef = connection.taskoutput.name»
				«outputTask.name»:«outputRef» -> «inputTask.name»:«inputRef» ; 	
			«ENDFOR» 	
		}'''
	}
	
	def String generateCluster(BaseTask baseTask){
		'''
		subgraph cluster«this.cluster++» {
			«var toto = "pouet"»
			style=filled;
			fillcolor=white;
			color=blue;
			margin=20;
			label = "«baseTask.name»";
			
			//Children
			«FOR task : baseTask.children»
				«IF task instanceof BaseTask»
					«generateCluster(task)»
				«ELSE»
					««««task.name» [shape=record,style=filled,color=black,fillcolor=white,label="{ «taskInputs(task)» | {«task.name»} | «taskOutputs(task)» }"];
					«task.name» [shape=none,style=filled,color=black,fillcolor=none,label = <
					<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="4" CELLPADDING="4">
						<TR><TD BORDER="0"></TD>«taskInputsHTML(task)» <TD BORDER="0"></TD></TR>
						<TR><TD BGCOLOR="gray" COLSPAN="«maxIO(task)+2»">«task.name»</TD></TR>
						
						«IF task instanceof LibraryTask»
						<TR><TD BGCOLOR="blue" COLSPAN="«maxIO(task)+2»">«task.libraryfunction.name»</TD></TR>
						«ENDIF»
						
						«IF task instanceof CustomTask»
						<TR><TD BGCOLOR="lightblue" COLSPAN="«maxIO(task)+2»">«task.runner»</TD></TR>
						«ENDIF»
						
						<TR><TD BORDER="0"></TD>«taskOutputsHTML(task)» <TD BORDER="0"></TD></TR>
					</TABLE>>];
				«ENDIF»	
			«ENDFOR»
				
		}
		'''
	}
	
	def taskOutputsHTML(AbstractTask task) {
		'''
		«FOR output : task.outputs BEFORE '' SEPARATOR '' AFTER ''»
			<TD PORT="«output.name»" BGCOLOR="green" BORDER="0">«output.name»</TD>			
		«ENDFOR»
		'''	
	}
	
	def taskInputsHTML(AbstractTask task) {
		'''
		«FOR input : task.inputs BEFORE '' SEPARATOR '' AFTER ''»
			<TD PORT="«input.name»" BGCOLOR="yellow" BORDER="0">«input.name»</TD>			
		«ENDFOR»
		'''	
	}
	
	def int maxIO(AbstractTask task){
		if (task.inputs.size >= task.outputs.size){
			return task.inputs.size
		}else{
			return task.outputs.size
		}
	}
	
	def taskOutputs(AbstractTask task) {
		'''
		{
		«FOR output : task.outputs BEFORE '' SEPARATOR '|' AFTER ''»
			<«output.name»> «output.name»
		«ENDFOR»
		}
		'''	
	}
	
	def taskInputs(AbstractTask task) {
		'''
		{
		«FOR input : task.inputs BEFORE '' SEPARATOR '|' AFTER ''»
			<«input.name»> «input.name»
		«ENDFOR»
		}
		'''	
	}
	
}