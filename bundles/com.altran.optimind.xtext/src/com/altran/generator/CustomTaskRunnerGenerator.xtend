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
import com.altran.optimind.model.workflow.Language

class CustomTaskRunnerGenerator {
	
	@Accessors(PUBLIC_GETTER) var Workflow workflow
	@Accessors(PUBLIC_GETTER) var String scriptsPackagePath
	@Accessors(PUBLIC_GETTER) var int cammaCounter=0
	@Accessors(PUBLIC_GETTER) var Language language
	
	new(Workflow workflow, String path, Language lang) {
		this.workflow = workflow
		this.scriptsPackagePath = path
		this.language = lang
	}
	
	def generate() {
		var allCustomTasks = EcoreUtil2.getAllContentsOfType(workflow, CustomTask)
		for (CustomTask task : allCustomTasks) {
			createCustomTaskRunnerFile(task)
			cammaCounter=0
		}
	}
	
	def createCustomTaskRunnerFile(CustomTask task) {
		if(language == Language.PYTHON)
		{
			writeContent( generateFileContent(task), scriptsPackagePath+task.name+"."+"py")	
		}
		else
		{
			writeContent( generateLibraryTaskFile(task), scriptsPackagePath+task.name+"."+"java")
		}	
	}
	
	def String generateLibraryTaskFile(CustomTask task){
		'''
			package scripts;
			import java.io.File;
				// ==================================================================================================
				// MODULE IMPORT
				// ==================================================================================================
										
				// ==================================================================================================
				// ==================================================================================================
				public class «task.name» 
				// ==================================================================================================
				{
					//All Inputs 
					«var allSetter = EcoreUtil2.getAllContentsOfType(task, Setter)»
					«FOR setter : allSetter»
						private «setter.typeAsString» «setter.name» = «setter.valueAsString»;
						public void set_«setter.name»(«setter.typeAsString» value) {this.«setter.name» = value;} ; 										
						public «setter.typeAsString» get_«setter.name»() {return this.«setter.name»;}; 
						
					«ENDFOR»
				
					//All Outputs 
					«FOR otput : task.outputs»
						private «otput.typeAsString» «otput.name»;
						public void set_«otput.name»(«otput.typeAsString» value) {this.«otput.name» = value;} ; 										
						public «otput.typeAsString» get_«otput.name»() {return this.«otput.name»;}; 
						
					«ENDFOR»
					«var allConnection = EcoreUtil2.getAllContentsOfType(task, Connection)»
					«FOR connection : allConnection»
						
					«ENDFOR»
				
					public void run(){
					//Write your code after this line
					
					}
				}
				
		'''
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
