package com.altran.generator

import org.eclipse.xtend.lib.annotations.Accessors
import com.altran.optimind.model.workflow.Workflow
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import com.altran.optimind.model.workflow.BaseTask
import org.eclipse.xtext.EcoreUtil2
import com.altran.optimind.model.workflow.AbstractTask
import com.altran.optimind.model.workflow.LibraryTask
import com.altran.optimind.model.workflow.CustomTask
import com.altran.optimind.model.workflow.Connection
import com.altran.optimind.model.workflow.Setter
import com.altran.optimind.model.workflow.ForStatement
import com.altran.optimind.model.workflow.WhileStatement

@Accessors class JavaCodeGenerator {
	
	@Accessors(PUBLIC_GETTER) var Workflow workflow
	@Accessors(PUBLIC_GETTER) var String javaFilePath
	

	new(Workflow workflow, String filePath) {
		this.workflow = workflow
		this.javaFilePath = filePath
	}
	
	def generate() {
		writeContent(generateFileContent)
		
	}
	
	def String generateLoopCode()
	{
		'''
			«var allloopFor = EcoreUtil2.getAllContentsOfType(workflow, ForStatement)»
			«var allloopWhile = EcoreUtil2.getAllContentsOfType(workflow, WhileStatement)»
			
			«FOR loop : allloopFor» 
				
			«ENDFOR»
			
			
		'''
	}
	
	def String generateFileContent() {

		'''
			// ==================================================================================================
			// MODULE IMPORT
			// ==================================================================================================
			
			«generateImports»
			
			// ==================================================================================================
			public class «workflow.name» 
			// ==================================================================================================
			{
				//generateClassContent»
			}
			
				
		'''
	}
	
	def String generateImports() {
		'''
			package workflow;
			
			import scripts.*; 
			
		'''
	}
	
	def String generateClassContent() {
		
		'''	
			//Load Library functions
			«getAllLibraryFunction»
			«var BaseTask rootBasetask= workflow.baseTask»
			
			//Main Task		
			BaseTask «workflow.baseTask.name»; 
			
			public «workflow.name» ()
			{
				«addRootBaseTaskContent(rootBasetask)»
				
				// Create workflows
				«getTaskTree(rootBasetask)»
				
				// Connect inputs and outputs
				«createConnectionContent1»
								
				// Fill setters
				«createSetterContent»
			}
			
			public BaseTask run_workflow()
			{
				// Return the workflow
				return «rootBasetask.name»;
			}
			
		'''
	}
	
	
	def writeContent(String content) {
		var PrintWriter writer;
		writer = new PrintWriter(new BufferedWriter(new FileWriter(this.javaFilePath)));
		writer.write(content)
		writer.close();
	}
	
	def writeContent(String content,String path) {
		var PrintWriter writer;
		writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
		writer.write(content)
		writer.close();
	}
	
	def String getAllLibraryFunction() {
		
		'''
			«var allLibraryFunction = workflow.functions»
			«FOR libraryFunction : allLibraryFunction» 
				«libraryFunction.name» m_«libraryFunction.name»;
			«ENDFOR»
			
		'''
	}
	
	def String addRootBaseTaskContent(BaseTask rootBaseTask) {
		'''
			«rootBaseTask.name» = new BaseTask("«rootBaseTask.name»", null, null);
		'''
	}
	
	def String getTaskTree(BaseTask task) {
		'''
			«var childrenTasks = task.children»
			«IF !(childrenTasks === null) »
				«FOR childTask : childrenTasks» 
					«IF childTask instanceof BaseTask»
						BaseTask «childTask.name» = new BaseTask("«childTask.name»", «task.name», null);					
						«getTaskTree(childTask)»
					«ENDIF»
					«IF childTask instanceof LibraryTask»
						LibraryTask «childTask.name» = new LibraryTask("«childTask.name»",«task.name», null, m_«childTask.libraryfunction.name»);
						«task.name».addTaskToList(«childTask.name»);
					«ENDIF»
					«IF childTask instanceof CustomTask»
						#CustomTask «childTask.name» = new CustomTask("«childTask.name»",«task.name», null, «childTask.runner»);
					«ENDIF»
					
				«ENDFOR»
			«ENDIF»
		'''
	}
	
	def String createConnectionContent1() {

		'''
			«var allConnection = EcoreUtil2.getAllContentsOfType(workflow, Connection)»
			«FOR connection : allConnection»
				«IF connection instanceof Connection»
					«var connectionContainer=connection.eContainer as AbstractTask»
					«var outputContainer=connection.taskoutput.eContainer as AbstractTask»
					«IF connectionContainer.eContainer === outputContainer.eContainer»
						«workflow.baseTask.name».create_connection(«outputContainer.name», "«connection.taskoutput.name»",«connectionContainer.name», "«connection.name»" );
					«ELSEIF connectionContainer.eContainer.eContainer instanceof Workflow »
						«workflow.baseTask.name».create_connection(«(outputContainer.eContainer as AbstractTask).name», "«outputContainer.name+"."+connection.taskoutput.name»",«connectionContainer.name», "«connection.name»" );
					«ELSEIF outputContainer.eContainer.eContainer instanceof Workflow  »
						«workflow.baseTask.name».create_connection(«outputContainer.name», "«connection.taskoutput.name»",«(connectionContainer.eContainer as AbstractTask).name», "«connectionContainer.name+"."+connection.name»" );
					«ELSE»
						«checkNextParentBaseTask(connectionContainer.eContainer as AbstractTask,
							connectionContainer.name+"."+connection.name,
							outputContainer.eContainer as AbstractTask,
							outputContainer.name+"."+connection.taskoutput.name
						)»
					«ENDIF»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	def String checkNextParentBaseTask(AbstractTask connectionParent, String connectionExternalName, AbstractTask outputParent,
		String outputExternalName) {
		'''
			«IF connectionParent.eContainer === outputParent.eContainer»
				«workflow.baseTask.name».create_connection(«outputParent.name», "«outputExternalName»",«connectionParent.name», "«connectionExternalName»" );
			«ELSEIF connectionParent.eContainer.eContainer instanceof Workflow »
				«workflow.baseTask.name».create_connection(«(outputParent.eContainer as AbstractTask).name», "«outputParent.name+"."+outputExternalName»",«connectionParent.name», "«connectionExternalName»" );
			«ELSEIF outputParent.eContainer.eContainer instanceof Workflow  »
				«workflow.baseTask.name».create_connection(«outputParent.name», "«outputExternalName»",«(connectionParent.eContainer as AbstractTask).name», "«connectionParent.name+"."+connectionExternalName»" );
			«ELSE»
				«checkNextParentBaseTask(connectionParent.eContainer as AbstractTask,
					connectionParent.name+"."+connectionExternalName,
					outputParent.eContainer as AbstractTask,
					outputParent.name+"."+outputExternalName
				)»
			«ENDIF»
		'''
	}
	
	def String createSetterContent() {

		'''
			«var allSetter = EcoreUtil2.getAllContentsOfType(workflow, Setter)»
			«FOR setter : allSetter»
				«var String externalName=setter.name»«««			«var firstContainer= EcoreUtil2.getContainerOfType( setter, AbstractTask) »
				«var containers= EcoreUtil2.getAllContainers(setter) »
				«var int i»
				«for (i=0; i<containers.size-2; i++){
				var task= containers.get(i) as AbstractTask
				externalName=task.name+"."+externalName
			}»
				«workflow.baseTask.name».add_setter("«externalName»",«setter.valueAsString»);
			«ENDFOR»
		'''
	}
}
