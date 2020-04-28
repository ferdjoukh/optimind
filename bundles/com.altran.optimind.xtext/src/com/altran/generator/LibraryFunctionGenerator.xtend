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
import com.altran.optimind.model.workflow.BaseTask


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
