/*
 * generated by Xtext 2.15.0
 */
package com.altran.formatting2

import com.altran.optimind.model.workflow.BaseTask
import com.altran.optimind.model.workflow.Workflow
import com.altran.services.OptimindGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class OptimindFormatter extends AbstractFormatter2 {
	
	@Inject extension OptimindGrammarAccess

	def dispatch void format(Workflow workflow, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (abstractTask : workflow.tasks) {
//			abstractTask.format
//		}
	}

	def dispatch void format(BaseTask baseTask, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (taskInput : baseTask.inputs) {
			taskInput.format
		}
		for (taskOutput : baseTask.outputs) {
			taskOutput.format
		}
		for (abstractTask : baseTask.children) {
			abstractTask.format
		}
	}
	
	// TODO: implement for LibraryTask, CustomTask
}