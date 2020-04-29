/*
 * generated by Xtext 2.16.0
 */
package com.altran.ide.contentassist.antlr;

import com.altran.ide.contentassist.antlr.internal.InternalOptimindParser;
import com.altran.services.OptimindGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class OptimindParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OptimindGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OptimindGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractTaskAccess().getAlternatives(), "rule__AbstractTask__Alternatives");
			builder.put(grammarAccess.getTaskInputAccess().getAlternatives(), "rule__TaskInput__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getAbstractStatementAccess().getAlternatives(), "rule__AbstractStatement__Alternatives");
			builder.put(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_0_0(), "rule__BaseTask__ChildrenAlternatives_7_0_0");
			builder.put(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_1_0(), "rule__BaseTask__ChildrenAlternatives_7_1_0");
			builder.put(grammarAccess.getProgLanguageAccess().getAlternatives(), "rule__ProgLanguage__Alternatives");
			builder.put(grammarAccess.getTaskStatusAccess().getAlternatives(), "rule__TaskStatus__Alternatives");
			builder.put(grammarAccess.getWorkflowAccess().getGroup(), "rule__Workflow__Group__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup_4(), "rule__Workflow__Group_4__0");
			builder.put(grammarAccess.getWorkflowAccess().getGroup_6(), "rule__Workflow__Group_6__0");
			builder.put(grammarAccess.getTaskOutputAccess().getGroup(), "rule__TaskOutput__Group__0");
			builder.put(grammarAccess.getTaskOutputAccess().getGroup_3(), "rule__TaskOutput__Group_3__0");
			builder.put(grammarAccess.getTaskOutputAccess().getGroup_4(), "rule__TaskOutput__Group_4__0");
			builder.put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
			builder.put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_8(), "rule__If__Group_8__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup(), "rule__BaseTask__Group__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_4(), "rule__BaseTask__Group_4__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_5(), "rule__BaseTask__Group_5__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_5_3(), "rule__BaseTask__Group_5_3__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_6(), "rule__BaseTask__Group_6__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_6_3(), "rule__BaseTask__Group_6_3__0");
			builder.put(grammarAccess.getBaseTaskAccess().getGroup_7(), "rule__BaseTask__Group_7__0");
			builder.put(grammarAccess.getLibraryTaskAccess().getGroup(), "rule__LibraryTask__Group__0");
			builder.put(grammarAccess.getLibraryTaskAccess().getGroup_4(), "rule__LibraryTask__Group_4__0");
			builder.put(grammarAccess.getLibraryTaskAccess().getGroup_5(), "rule__LibraryTask__Group_5__0");
			builder.put(grammarAccess.getLibraryTaskAccess().getGroup_6(), "rule__LibraryTask__Group_6__0");
			builder.put(grammarAccess.getLibraryTaskAccess().getGroup_7(), "rule__LibraryTask__Group_7__0");
			builder.put(grammarAccess.getCustomTaskAccess().getGroup(), "rule__CustomTask__Group__0");
			builder.put(grammarAccess.getCustomTaskAccess().getGroup_4(), "rule__CustomTask__Group_4__0");
			builder.put(grammarAccess.getCustomTaskAccess().getGroup_5(), "rule__CustomTask__Group_5__0");
			builder.put(grammarAccess.getCustomTaskAccess().getGroup_6(), "rule__CustomTask__Group_6__0");
			builder.put(grammarAccess.getCustomTaskAccess().getGroup_7(), "rule__CustomTask__Group_7__0");
			builder.put(grammarAccess.getSetterAccess().getGroup(), "rule__Setter__Group__0");
			builder.put(grammarAccess.getSetterAccess().getGroup_3(), "rule__Setter__Group_3__0");
			builder.put(grammarAccess.getSetterAccess().getGroup_4(), "rule__Setter__Group_4__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_3(), "rule__Connection__Group_3__0");
			builder.put(grammarAccess.getLibraryFunctionAccess().getGroup(), "rule__LibraryFunction__Group__0");
			builder.put(grammarAccess.getLibraryFunctionAccess().getGroup_6(), "rule__LibraryFunction__Group_6__0");
			builder.put(grammarAccess.getLibraryFunctionAccess().getGroup_7(), "rule__LibraryFunction__Group_7__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup_3(), "rule__Input__Group_3__0");
			builder.put(grammarAccess.getInputAccess().getGroup_4(), "rule__Input__Group_4__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_3(), "rule__Output__Group_3__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_4(), "rule__Output__Group_4__0");
			builder.put(grammarAccess.getWorkflowAccess().getNameAssignment_2(), "rule__Workflow__NameAssignment_2");
			builder.put(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1(), "rule__Workflow__LanguageAssignment_4_1");
			builder.put(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5(), "rule__Workflow__BaseTaskAssignment_5");
			builder.put(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0(), "rule__Workflow__FunctionsAssignment_6_0");
			builder.put(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1(), "rule__Workflow__FunctionsAssignment_6_1");
			builder.put(grammarAccess.getTaskOutputAccess().getNameAssignment_2(), "rule__TaskOutput__NameAssignment_2");
			builder.put(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1(), "rule__TaskOutput__TypeAsStringAssignment_3_1");
			builder.put(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1(), "rule__TaskOutput__ValueAsStringAssignment_4_1");
			builder.put(grammarAccess.getForAccess().getNameAssignment_2(), "rule__For__NameAssignment_2");
			builder.put(grammarAccess.getForAccess().getFromAssignment_5(), "rule__For__FromAssignment_5");
			builder.put(grammarAccess.getForAccess().getToAssignment_7(), "rule__For__ToAssignment_7");
			builder.put(grammarAccess.getForAccess().getIncrementAssignment_9(), "rule__For__IncrementAssignment_9");
			builder.put(grammarAccess.getForAccess().getAbstracttaskAssignment_11(), "rule__For__AbstracttaskAssignment_11");
			builder.put(grammarAccess.getWhileAccess().getNameAssignment_2(), "rule__While__NameAssignment_2");
			builder.put(grammarAccess.getWhileAccess().getConditionAssignment_5(), "rule__While__ConditionAssignment_5");
			builder.put(grammarAccess.getWhileAccess().getAbstracttaskAssignment_7(), "rule__While__AbstracttaskAssignment_7");
			builder.put(grammarAccess.getIfAccess().getNameAssignment_2(), "rule__If__NameAssignment_2");
			builder.put(grammarAccess.getIfAccess().getConditionAssignment_5(), "rule__If__ConditionAssignment_5");
			builder.put(grammarAccess.getIfAccess().getThenAssignment_7(), "rule__If__ThenAssignment_7");
			builder.put(grammarAccess.getIfAccess().getElseAssignment_8_1(), "rule__If__ElseAssignment_8_1");
			builder.put(grammarAccess.getBaseTaskAccess().getNameAssignment_2(), "rule__BaseTask__NameAssignment_2");
			builder.put(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1(), "rule__BaseTask__StatusAssignment_4_1");
			builder.put(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2(), "rule__BaseTask__InputsAssignment_5_2");
			builder.put(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1(), "rule__BaseTask__InputsAssignment_5_3_1");
			builder.put(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2(), "rule__BaseTask__OutputsAssignment_6_2");
			builder.put(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1(), "rule__BaseTask__OutputsAssignment_6_3_1");
			builder.put(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0(), "rule__BaseTask__ChildrenAssignment_7_0");
			builder.put(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_1(), "rule__BaseTask__ChildrenAssignment_7_1");
			builder.put(grammarAccess.getLibraryTaskAccess().getNameAssignment_2(), "rule__LibraryTask__NameAssignment_2");
			builder.put(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1(), "rule__LibraryTask__StatusAssignment_4_1");
			builder.put(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0(), "rule__LibraryTask__InputsAssignment_5_0");
			builder.put(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1(), "rule__LibraryTask__InputsAssignment_5_1");
			builder.put(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0(), "rule__LibraryTask__OutputsAssignment_6_0");
			builder.put(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1(), "rule__LibraryTask__OutputsAssignment_6_1");
			builder.put(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1(), "rule__LibraryTask__LibraryfunctionAssignment_7_1");
			builder.put(grammarAccess.getCustomTaskAccess().getNameAssignment_2(), "rule__CustomTask__NameAssignment_2");
			builder.put(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1(), "rule__CustomTask__StatusAssignment_4_1");
			builder.put(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0(), "rule__CustomTask__InputsAssignment_5_0");
			builder.put(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1(), "rule__CustomTask__InputsAssignment_5_1");
			builder.put(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0(), "rule__CustomTask__OutputsAssignment_6_0");
			builder.put(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1(), "rule__CustomTask__OutputsAssignment_6_1");
			builder.put(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1(), "rule__CustomTask__RunnerAssignment_7_1");
			builder.put(grammarAccess.getSetterAccess().getNameAssignment_2(), "rule__Setter__NameAssignment_2");
			builder.put(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1(), "rule__Setter__TypeAsStringAssignment_3_1");
			builder.put(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1(), "rule__Setter__ValueAsStringAssignment_4_1");
			builder.put(grammarAccess.getConnectionAccess().getNameAssignment_2(), "rule__Connection__NameAssignment_2");
			builder.put(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1(), "rule__Connection__TaskoutputAssignment_3_1");
			builder.put(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2(), "rule__LibraryFunction__NameAssignment_2");
			builder.put(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5(), "rule__LibraryFunction__FunctionAssignment_5");
			builder.put(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0(), "rule__LibraryFunction__InputsAssignment_6_0");
			builder.put(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1(), "rule__LibraryFunction__InputsAssignment_6_1");
			builder.put(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0(), "rule__LibraryFunction__OutputsAssignment_7_0");
			builder.put(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1(), "rule__LibraryFunction__OutputsAssignment_7_1");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_2(), "rule__Input__NameAssignment_2");
			builder.put(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1(), "rule__Input__TypeAsStringAssignment_3_1");
			builder.put(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1(), "rule__Input__ValueAsStringAssignment_4_1");
			builder.put(grammarAccess.getOutputAccess().getNameAssignment_2(), "rule__Output__NameAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1(), "rule__Output__TypeAsStringAssignment_3_1");
			builder.put(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1(), "rule__Output__ValueAsStringAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OptimindGrammarAccess grammarAccess;

	@Override
	protected InternalOptimindParser createParser() {
		InternalOptimindParser result = new InternalOptimindParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OptimindGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OptimindGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
