package com.altran.generator

import com.altran.optimind.model.workflow.Workflow
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import com.altran.optimind.model.workflow.LibraryFunction
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter
import com.altran.optimind.model.workflow.Input

class LibraryFunctionGenerator {
	
	@Accessors(PUBLIC_GETTER) var Workflow workflow
	@Accessors(PUBLIC_GETTER) var String libraryFunctionPackagePath
	@Accessors(PUBLIC_GETTER) var int cammaCounter=0
	
	new(Workflow workflow, String path) {
		
		this.workflow = workflow
		this.libraryFunctionPackagePath = path
		
	}
	
	def generate() {
		
		var children = workflow.eContents
		for (EObject child : children) {
			if (child instanceof LibraryFunction){
				createLibFunctionPythonFile(child)
				cammaCounter=0
			}
		}
	}
	
	def createLibFunctionPythonFile(LibraryFunction function) {
		writeContent( generateFileContent(function), libraryFunctionPackagePath+function.name+"."+"py")
		
	}
	
	def String generateFileContent(LibraryFunction libfunction) {
		'''
		# ==================================================================================================
		# MODULE IMPORT
		# ==================================================================================================
		
		# ==================================================================================================
		
		
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
}