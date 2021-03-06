/*
 * generated by Xtext 2.21.0
 */
package com.altran.parser.antlr;

import com.altran.parser.antlr.internal.InternalOptimindParser;
import com.altran.services.OptimindGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OptimindParser extends AbstractAntlrParser {

	@Inject
	private OptimindGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOptimindParser createParser(XtextTokenStream stream) {
		return new InternalOptimindParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Workflow";
	}

	public OptimindGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OptimindGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
