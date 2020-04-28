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
		}
		
		writeContent( generateBaseTaskClass(), libraryFunctionPackagePath+"BaseTask.java")	
		writeContent( generateLibraryTaskClass(), libraryFunctionPackagePath+"LibraryTask.java")	
	}
	
	def String generateBaseTaskClass(){
		'''
		«var allLibraryFunction = workflow.functions»
		
		package scripts;
		
		import java.util.ArrayList;
		import java.util.List;
		
		public class BaseTask {
		
			String m_nameBaseTask; 
			List<LibraryTask> m_listTask; 
			
			public BaseTask(String name, Object nullObject1, Object nullObject2)
			{
				this.m_nameBaseTask = name ; 
				this.m_listTask = new ArrayList<LibraryTask>();
			}
			
			public void addTaskToList(LibraryTask task)
			{
				m_listTask.add(task); 
			}
			
			public void add_setter(String nameLibrary, int value)
			{
				
			}
			
			public void create_connection(LibraryTask task1, String variableName, LibraryTask task2, String variableName2)
			{
				
			}
			
			public void create_connection(BaseTask task1, String variableName, LibraryTask task2, String variableName2)
			{
				
			}
			
		}
		'''
	}
	
	def String generateLibraryTaskClass()
	{
		'''
		package scripts;
		
		public class LibraryTask {
		
			String m_nameTask ; 
			BaseTask m_baseTaskParent; 
			Object m_libraryFunction;
			
			public LibraryTask(String name, BaseTask baseTask, Object nullObject, Object libraryFunction)
			{
				this.m_nameTask = name ; 
				this.m_baseTaskParent = baseTask ; 
				this.m_libraryFunction = libraryFunction; 
				
				
						
			}	
		
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
				public static int «outputName» («FOR Input input : inputs» «input.typeAsString» «input.name»«IF cammaCounter<size1-1»«increamentCammaCounter»,«ENDIF»«ENDFOR») {
							
					// Write your code after this line 
					«var int size2= inputs.size»	
					«reInitCammaCounter»	
					return «outputName»(«FOR Input input : inputs» «input.name»«IF cammaCounter<size2-1»«increamentCammaCounter»,«ENDIF»«ENDFOR»);
					
				}
				
				«FOR Input input : inputs» public void set_«input.name»(«input.typeAsString» value) {this.«input.name» = value;} «IF cammaCounter<size-1»«increamentCammaCounter» \n «ENDIF»«ENDFOR»
				
				«FOR Input input : inputs» public «input.typeAsString» get_«input.name»() {return this.«input.name»;} «IF cammaCounter<size-1»«increamentCammaCounter» \n «ENDIF»«ENDFOR»
				
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
