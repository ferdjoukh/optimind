/*
 * generated by Xtext 2.14.0
 */
package com.altran.serializer;

import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.ForStatement;
import com.altran.optimind.model.workflow.IfStatement;
import com.altran.optimind.model.workflow.Input;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.Output;
import com.altran.optimind.model.workflow.Setter;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.WhileStatement;
import com.altran.optimind.model.workflow.Workflow;
import com.altran.optimind.model.workflow.WorkflowPackage;
import com.altran.services.OptimindGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OptimindSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OptimindGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WorkflowPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WorkflowPackage.BASE_TASK:
				sequence_BaseTask(context, (BaseTask) semanticObject); 
				return; 
			case WorkflowPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case WorkflowPackage.CUSTOM_TASK:
				sequence_CustomTask(context, (CustomTask) semanticObject); 
				return; 
			case WorkflowPackage.FOR_STATEMENT:
				sequence_For(context, (ForStatement) semanticObject); 
				return; 
			case WorkflowPackage.IF_STATEMENT:
				sequence_If(context, (IfStatement) semanticObject); 
				return; 
			case WorkflowPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case WorkflowPackage.LIBRARY_FUNCTION:
				sequence_LibraryFunction(context, (LibraryFunction) semanticObject); 
				return; 
			case WorkflowPackage.LIBRARY_TASK:
				sequence_LibraryTask(context, (LibraryTask) semanticObject); 
				return; 
			case WorkflowPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case WorkflowPackage.SETTER:
				sequence_Setter(context, (Setter) semanticObject); 
				return; 
			case WorkflowPackage.TASK_OUTPUT:
				sequence_TaskOutput(context, (TaskOutput) semanticObject); 
				return; 
			case WorkflowPackage.WHILE_STATEMENT:
				sequence_While(context, (WhileStatement) semanticObject); 
				return; 
			case WorkflowPackage.WORKFLOW:
				sequence_Workflow(context, (Workflow) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractTask returns BaseTask
	 *     BaseTask returns BaseTask
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         status=TaskStatus? 
	 *         (inputs+=TaskInput inputs+=TaskInput*)? 
	 *         (outputs+=TaskOutput outputs+=TaskOutput*)? 
	 *         (children+=AbstractTask | abstractstatement+=AbstractStatement)*
	 *     )
	 */
	protected void sequence_BaseTask(ISerializationContext context, BaseTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskInput returns Connection
	 *     Connection returns Connection
	 *
	 * Constraint:
	 *     (name=EString taskoutput=[TaskOutput|EString]?)
	 */
	protected void sequence_Connection(ISerializationContext context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTask returns CustomTask
	 *     CustomTask returns CustomTask
	 *
	 * Constraint:
	 *     (name=EString status=TaskStatus? (inputs+=TaskInput inputs+=TaskInput*)? (outputs+=TaskOutput outputs+=TaskOutput*)? runner=EString?)
	 */
	protected void sequence_CustomTask(ISerializationContext context, CustomTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractStatement returns ForStatement
	 *     For returns ForStatement
	 *
	 * Constraint:
	 *     (name=EString from=EInt to=EInt increment=EInt abstracttask=AbstractTask)
	 */
	protected void sequence_For(ISerializationContext context, ForStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__FROM));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__TO));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__INCREMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.FOR_STATEMENT__INCREMENT));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.WHILE_STATEMENT__ABSTRACTTASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.WHILE_STATEMENT__ABSTRACTTASK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getForAccess().getFromEIntParserRuleCall_5_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getForAccess().getToEIntParserRuleCall_7_0(), semanticObject.getTo());
		feeder.accept(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_9_0(), semanticObject.getIncrement());
		feeder.accept(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_11_0(), semanticObject.getAbstracttask());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractStatement returns IfStatement
	 *     If returns IfStatement
	 *
	 * Constraint:
	 *     (name=EString condition=EString then=AbstractTask else=AbstractTask?)
	 */
	protected void sequence_If(ISerializationContext context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (name=EString typeAsString=Type? valueAsString=EString?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LibraryFunction returns LibraryFunction
	 *
	 * Constraint:
	 *     (name=EString function=EString (inputs+=Input inputs+=Input*)? (outputs+=Output outputs+=Output*)?)
	 */
	protected void sequence_LibraryFunction(ISerializationContext context, LibraryFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractTask returns LibraryTask
	 *     LibraryTask returns LibraryTask
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         status=TaskStatus? 
	 *         (inputs+=TaskInput inputs+=TaskInput*)? 
	 *         (outputs+=TaskOutput outputs+=TaskOutput*)? 
	 *         libraryfunction=[LibraryFunction|EString]?
	 *     )
	 */
	protected void sequence_LibraryTask(ISerializationContext context, LibraryTask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (name=EString typeAsString=Type? valueAsString=EString?)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskInput returns Setter
	 *     Setter returns Setter
	 *
	 * Constraint:
	 *     (name=EString typeAsString=Type? valueAsString=EString?)
	 */
	protected void sequence_Setter(ISerializationContext context, Setter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TaskOutput returns TaskOutput
	 *
	 * Constraint:
	 *     (name=EString typeAsString=Type? valueAsString=EString?)
	 */
	protected void sequence_TaskOutput(ISerializationContext context, TaskOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractStatement returns WhileStatement
	 *     While returns WhileStatement
	 *
	 * Constraint:
	 *     (name=EString condition=EString abstracttask=AbstractTask)
	 */
	protected void sequence_While(ISerializationContext context, WhileStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.ABSTRACT_STATEMENT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.ABSTRACT_STATEMENT__CONDITION));
			if (transientValues.isValueTransient(semanticObject, WorkflowPackage.Literals.WHILE_STATEMENT__ABSTRACTTASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WorkflowPackage.Literals.WHILE_STATEMENT__ABSTRACTTASK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_5_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_7_0(), semanticObject.getAbstracttask());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Workflow returns Workflow
	 *
	 * Constraint:
	 *     (name=EString language=ProgLanguage? baseTask=BaseTask? (functions+=LibraryFunction functions+=LibraryFunction*)?)
	 */
	protected void sequence_Workflow(ISerializationContext context, Workflow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
