package com.altran.generator

import com.altran.optimind.model.workflow.Workflow
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import com.altran.optimind.model.workflow.LibraryFunction
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import com.altran.optimind.model.workflow.Input
import com.altran.optimind.model.workflow.Language
import com.altran.optimind.model.workflow.LibraryTask
import com.altran.optimind.model.workflow.Setter
import com.altran.optimind.model.workflow.BaseTask
import com.altran.optimind.model.workflow.Connection
import org.eclipse.xtext.EcoreUtil2
import com.altran.optimind.model.workflow.CustomTask
import com.altran.optimind.model.workflow.AbstractTask
import com.altran.optimind.model.workflow.WhileStatement
import com.altran.optimind.model.workflow.ForStatement

class LibraryFunctionGenerator {
	
	@Accessors(PUBLIC_GETTER) var Workflow workflow
	@Accessors(PUBLIC_GETTER) var String libraryFunctionPackagePath
	@Accessors(PUBLIC_GETTER) var int cammaCounter=0
	@Accessors(PUBLIC_GETTER) var Language language
	
	new(Workflow workflow, String path, Language language) {
		
		this.workflow = workflow
		this.libraryFunctionPackagePath = path
		this.language = language ; 
		
	}
	
	def generate() {
		
		var children = workflow.eContents
		for (EObject child : children) {
			if (child instanceof LibraryFunction){
				createLibFunctionFile(child)
				cammaCounter=0
			}
		}
	}
	
	def createLibFunctionFile(LibraryFunction function) {
		if(language == Language.PYTHON)
		{
			writeContent( generateFilePythonContent(function), libraryFunctionPackagePath+function.name+"."+"py")		
		}
		else
		{
			
			writeContent( generateFileJavaContent(function), libraryFunctionPackagePath+function.name+"."+"java")
			generateTaskFile(workflow.baseTask)
			for (WhileStatement loop : EcoreUtil2.getAllContentsOfType(workflow, WhileStatement))
			{
				writeContent(generateLoopCodeWhile(loop), libraryFunctionPackagePath+loop.name+"."+"java")
			} 				
			
		}	
		
	}
	
	def String generateLibraryTaskFile(LibraryTask task){
		'''
		package scripts;
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
			private «otput.typeAsString» «otput.name» = «task.libraryfunction.name».«otput.name»(this);
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
	
	
	def String generateLoopCodeFor()
	{
		'''
		«var allloopFor = EcoreUtil2.getAllContentsOfType(workflow, ForStatement)»
		'''
		
	}
	
	def String generateLoopCodeWhile(WhileStatement loop)
	{
		
		'''				
		package scripts;	
		// ==================================================================================================
		public class «loop.name» 
		// ==================================================================================================
		{
			//generateClassContent»
			«var AbstractTask task = loop.abstracttask»
			«task.class.typeName» «task.name»;
			 					
			public «task.class.typeName» getTask() { return «task.name» ;}
			 					
			public boolean verify()
			{
				//Here you can write your code
			 	return true;			 						
			}
			 					
		}					

		'''
	}
	
	
	def String generateTaskFile(BaseTask task) {
		
			var childrenTasks = task.children
			if ((childrenTasks !== null)){
				for (EObject childTask : childrenTasks)
				{
					if(childTask instanceof BaseTask)
					{
						writeContent(generateBaseTaskFile(childTask), libraryFunctionPackagePath+childTask.name+"."+"java")
						generateTaskFile(childTask)
					}
						
					if(childTask instanceof LibraryTask)
						writeContent(generateLibraryTaskFile(childTask), libraryFunctionPackagePath+childTask.name+"."+"java")		
					
				}
			}					
	}
	
	def String generateBaseTaskFile(BaseTask task){
		'''
		package scripts;
		// ==================================================================================================
		// MODULE IMPORT
		// ==================================================================================================
			
		// ==================================================================================================
			
		// ==================================================================================================
		public class «task.name» 
		// ==================================================================================================
		{
			
			
		}
			
		'''
	}

	def String generateFileJavaContent(LibraryFunction libfunction){
		'''
		package scripts;
		// ==================================================================================================
		// MODULE IMPORT
		// ==================================================================================================
									
		// ==================================================================================================
		«var inputs= libfunction.inputs»
		«var int size= inputs.size»
		// ==================================================================================================
		public class «libfunction.name» 
		// ==================================================================================================
		{
			«var outputName=libfunction.outputs.get(0).name»
			«FOR Input input : inputs»«input.typeAsString» «input.name»«IF cammaCounter<size»«increamentCammaCounter»;«ENDIF»«ENDFOR»
			«var int size1= inputs.size»	
			«reInitCammaCounter»	
			public static int «outputName» (Object task) {
				
				// Write your code after this line 
				
				return 0;				
			}	
				
			«FOR Input input : inputs» public void set_«input.name»(«input.typeAsString» value) {this.«input.name» = value;} «IF cammaCounter<size-1»«increamentCammaCounter»  «ENDIF»«ENDFOR»
				
			«FOR Input input : inputs» public «input.typeAsString» get_«input.name»() {return this.«input.name»;} «IF cammaCounter<size-1»«increamentCammaCounter» «ENDIF»«ENDFOR»
				
		}
		
		'''
	}
	
	
	def String generateFilePythonContent(LibraryFunction libfunction) {
		
		'''					
			# ==================================================================================================
			# Library Functions
			# ==================================================================================================
			«var inputs= libfunction.inputs»
			«var int size= inputs.size»
			def «libfunction.name» («FOR Input input : inputs» «input.name»«IF cammaCounter<size-1»«increamentCammaCounter»,«ENDIF»«ENDFOR»):
				"""
				This Library Function is designed to perform the operation "«libfunction.function»"
				
				«FOR Input input : inputs»
					:param «input.name»: description
					:type «input.name»: «input.typeAsString»
				«ENDFOR»
				«var outputName=libfunction.outputs.get(0).name»
				:return «outputName»: results Description
				:rtype «outputName»: «libfunction.outputs.get(0).typeAsString»
				"""
			
				# Write your code after this line 
			
				return «outputName»
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
	
	def void reInitCammaCounter(){
		cammaCounter = 0
	}
}
