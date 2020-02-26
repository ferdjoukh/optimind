package com.altran.generator

import com.altran.optimind.model.workflow.Workflow
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.EcoreUtil2
import com.altran.optimind.model.workflow.CustomTask
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import com.altran.optimind.model.workflow.TaskInput
import com.altran.optimind.model.workflow.Setter
import com.altran.optimind.model.workflow.Connection

class CustomTaskRunnerGenerator {
	
	@Accessors(PUBLIC_GETTER) var Workflow workflow
	@Accessors(PUBLIC_GETTER) var String scriptsPackagePath
	@Accessors(PUBLIC_GETTER) var int cammaCounter=0
	
	new(Workflow workflow, String path) {
		this.workflow = workflow
		this.scriptsPackagePath = path
	}
	
	def generate() {
		var allCustomTasks = EcoreUtil2.getAllContentsOfType(workflow, CustomTask)
		for (CustomTask task : allCustomTasks) {
			createCustomTaskRunnerFile(task)
			cammaCounter=0
		}
	}
	
	def createCustomTaskRunnerFile(CustomTask task) {
		writeContent( generateFileContent(task), scriptsPackagePath+task.name+"."+"py")
	}
	
	def String generateFileContent(CustomTask task) {
		'''
		# ==================================================================================================
		# MODULE IMPORT
		# ==================================================================================================
		
		# ==================================================================================================
		
		
		# ==================================================================================================
		# Custom Task Runner
		# ==================================================================================================
		«var inputs= task.inputs»
		«var int size= inputs.size»
		def «task.name» («FOR TaskInput input : inputs» «input.name»«IF cammaCounter<size-1»«increamentCammaCounter»,«ENDIF»«ENDFOR»):
			"""
			This Runner is designed to perform the operation "«task.runner»"
			«FOR TaskInput input : inputs»
				:param «input.name»: description
				«IF input instanceof Setter»
				:type  «input.name»: «input.typeAsString»
				«ELSEIF input instanceof Connection»
				:type  «input.name»: «input.taskoutput.typeAsString»	
				«ENDIF»
				
			«ENDFOR»
			«var output=task.outputs»
			«IF output.empty »
			# Write your code after this line 
			"""
			«ELSE»
			:return «output.get(0).typeAsString»: results Description
			:rtype «output.get(0).typeAsString»: «task.outputs.get(0).typeAsString»
			"""
								
			# Write your code after this line 
								
			return «output.get(0).typeAsString»	
			«ENDIF»
			
			
		# ==================================================================================================
		'''
	}
	
	def writeContent(String content,String path) {
		var PrintWriter writer;
		writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
		writer.write(content)
		writer.close();
	}
	
	def void increamentCammaCounter(){
		cammaCounter++
	}
	
}