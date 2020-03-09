package com.altran.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.altran.services.OptimindGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptimindParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'", "'Workflow'", "'{'", "'}'", "'Language'", "'Output'", "'type'", "'value'", "'For{'", "'from'", "'to'", "'increment'", "'do'", "'While{'", "'condition'", "'If{'", "'then'", "'else'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'LibraryFunction'", "'function'", "'Input'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOptimindParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOptimindParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOptimindParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOptimind.g"; }


    	private OptimindGrammarAccess grammarAccess;

    	public void setGrammarAccess(OptimindGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleWorkflow"
    // InternalOptimind.g:53:1: entryRuleWorkflow : ruleWorkflow EOF ;
    public final void entryRuleWorkflow() throws RecognitionException {
        try {
            // InternalOptimind.g:54:1: ( ruleWorkflow EOF )
            // InternalOptimind.g:55:1: ruleWorkflow EOF
            {
             before(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkflow();

            state._fsp--;

             after(grammarAccess.getWorkflowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalOptimind.g:62:1: ruleWorkflow : ( ( rule__Workflow__Group__0 ) ) ;
    public final void ruleWorkflow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:66:2: ( ( ( rule__Workflow__Group__0 ) ) )
            // InternalOptimind.g:67:2: ( ( rule__Workflow__Group__0 ) )
            {
            // InternalOptimind.g:67:2: ( ( rule__Workflow__Group__0 ) )
            // InternalOptimind.g:68:3: ( rule__Workflow__Group__0 )
            {
             before(grammarAccess.getWorkflowAccess().getGroup()); 
            // InternalOptimind.g:69:3: ( rule__Workflow__Group__0 )
            // InternalOptimind.g:69:4: rule__Workflow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalOptimind.g:78:1: entryRuleAbstractTask : ruleAbstractTask EOF ;
    public final void entryRuleAbstractTask() throws RecognitionException {
        try {
            // InternalOptimind.g:79:1: ( ruleAbstractTask EOF )
            // InternalOptimind.g:80:1: ruleAbstractTask EOF
            {
             before(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getAbstractTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalOptimind.g:87:1: ruleAbstractTask : ( ( rule__AbstractTask__Alternatives ) ) ;
    public final void ruleAbstractTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:91:2: ( ( ( rule__AbstractTask__Alternatives ) ) )
            // InternalOptimind.g:92:2: ( ( rule__AbstractTask__Alternatives ) )
            {
            // InternalOptimind.g:92:2: ( ( rule__AbstractTask__Alternatives ) )
            // InternalOptimind.g:93:3: ( rule__AbstractTask__Alternatives )
            {
             before(grammarAccess.getAbstractTaskAccess().getAlternatives()); 
            // InternalOptimind.g:94:3: ( rule__AbstractTask__Alternatives )
            // InternalOptimind.g:94:4: rule__AbstractTask__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTask__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTaskAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTaskInput"
    // InternalOptimind.g:103:1: entryRuleTaskInput : ruleTaskInput EOF ;
    public final void entryRuleTaskInput() throws RecognitionException {
        try {
            // InternalOptimind.g:104:1: ( ruleTaskInput EOF )
            // InternalOptimind.g:105:1: ruleTaskInput EOF
            {
             before(grammarAccess.getTaskInputRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getTaskInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskInput"


    // $ANTLR start "ruleTaskInput"
    // InternalOptimind.g:112:1: ruleTaskInput : ( ( rule__TaskInput__Alternatives ) ) ;
    public final void ruleTaskInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:116:2: ( ( ( rule__TaskInput__Alternatives ) ) )
            // InternalOptimind.g:117:2: ( ( rule__TaskInput__Alternatives ) )
            {
            // InternalOptimind.g:117:2: ( ( rule__TaskInput__Alternatives ) )
            // InternalOptimind.g:118:3: ( rule__TaskInput__Alternatives )
            {
             before(grammarAccess.getTaskInputAccess().getAlternatives()); 
            // InternalOptimind.g:119:3: ( rule__TaskInput__Alternatives )
            // InternalOptimind.g:119:4: rule__TaskInput__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskInputAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskInput"


    // $ANTLR start "entryRuleEString"
    // InternalOptimind.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOptimind.g:129:1: ( ruleEString EOF )
            // InternalOptimind.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOptimind.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOptimind.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOptimind.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalOptimind.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOptimind.g:144:3: ( rule__EString__Alternatives )
            // InternalOptimind.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalOptimind.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalOptimind.g:154:1: ( ruleEInt EOF )
            // InternalOptimind.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalOptimind.g:162:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:166:2: ( ( RULE_INT ) )
            // InternalOptimind.g:167:2: ( RULE_INT )
            {
            // InternalOptimind.g:167:2: ( RULE_INT )
            // InternalOptimind.g:168:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleType"
    // InternalOptimind.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalOptimind.g:179:1: ( ruleType EOF )
            // InternalOptimind.g:180:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalOptimind.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalOptimind.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalOptimind.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalOptimind.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalOptimind.g:194:3: ( rule__Type__Alternatives )
            // InternalOptimind.g:194:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTaskOutput"
    // InternalOptimind.g:203:1: entryRuleTaskOutput : ruleTaskOutput EOF ;
    public final void entryRuleTaskOutput() throws RecognitionException {
        try {
            // InternalOptimind.g:204:1: ( ruleTaskOutput EOF )
            // InternalOptimind.g:205:1: ruleTaskOutput EOF
            {
             before(grammarAccess.getTaskOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getTaskOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskOutput"


    // $ANTLR start "ruleTaskOutput"
    // InternalOptimind.g:212:1: ruleTaskOutput : ( ( rule__TaskOutput__Group__0 ) ) ;
    public final void ruleTaskOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:216:2: ( ( ( rule__TaskOutput__Group__0 ) ) )
            // InternalOptimind.g:217:2: ( ( rule__TaskOutput__Group__0 ) )
            {
            // InternalOptimind.g:217:2: ( ( rule__TaskOutput__Group__0 ) )
            // InternalOptimind.g:218:3: ( rule__TaskOutput__Group__0 )
            {
             before(grammarAccess.getTaskOutputAccess().getGroup()); 
            // InternalOptimind.g:219:3: ( rule__TaskOutput__Group__0 )
            // InternalOptimind.g:219:4: rule__TaskOutput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskOutput"


    // $ANTLR start "entryRuleAbstractStatement"
    // InternalOptimind.g:228:1: entryRuleAbstractStatement : ruleAbstractStatement EOF ;
    public final void entryRuleAbstractStatement() throws RecognitionException {
        try {
            // InternalOptimind.g:229:1: ( ruleAbstractStatement EOF )
            // InternalOptimind.g:230:1: ruleAbstractStatement EOF
            {
             before(grammarAccess.getAbstractStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractStatement();

            state._fsp--;

             after(grammarAccess.getAbstractStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractStatement"


    // $ANTLR start "ruleAbstractStatement"
    // InternalOptimind.g:237:1: ruleAbstractStatement : ( ( rule__AbstractStatement__Alternatives ) ) ;
    public final void ruleAbstractStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:241:2: ( ( ( rule__AbstractStatement__Alternatives ) ) )
            // InternalOptimind.g:242:2: ( ( rule__AbstractStatement__Alternatives ) )
            {
            // InternalOptimind.g:242:2: ( ( rule__AbstractStatement__Alternatives ) )
            // InternalOptimind.g:243:3: ( rule__AbstractStatement__Alternatives )
            {
             before(grammarAccess.getAbstractStatementAccess().getAlternatives()); 
            // InternalOptimind.g:244:3: ( rule__AbstractStatement__Alternatives )
            // InternalOptimind.g:244:4: rule__AbstractStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractStatement"


    // $ANTLR start "entryRuleFor"
    // InternalOptimind.g:253:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // InternalOptimind.g:254:1: ( ruleFor EOF )
            // InternalOptimind.g:255:1: ruleFor EOF
            {
             before(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            ruleFor();

            state._fsp--;

             after(grammarAccess.getForRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalOptimind.g:262:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:266:2: ( ( ( rule__For__Group__0 ) ) )
            // InternalOptimind.g:267:2: ( ( rule__For__Group__0 ) )
            {
            // InternalOptimind.g:267:2: ( ( rule__For__Group__0 ) )
            // InternalOptimind.g:268:3: ( rule__For__Group__0 )
            {
             before(grammarAccess.getForAccess().getGroup()); 
            // InternalOptimind.g:269:3: ( rule__For__Group__0 )
            // InternalOptimind.g:269:4: rule__For__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__For__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalOptimind.g:278:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalOptimind.g:279:1: ( ruleWhile EOF )
            // InternalOptimind.g:280:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalOptimind.g:287:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:291:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalOptimind.g:292:2: ( ( rule__While__Group__0 ) )
            {
            // InternalOptimind.g:292:2: ( ( rule__While__Group__0 ) )
            // InternalOptimind.g:293:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalOptimind.g:294:3: ( rule__While__Group__0 )
            // InternalOptimind.g:294:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleIf"
    // InternalOptimind.g:303:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalOptimind.g:304:1: ( ruleIf EOF )
            // InternalOptimind.g:305:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalOptimind.g:312:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:316:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalOptimind.g:317:2: ( ( rule__If__Group__0 ) )
            {
            // InternalOptimind.g:317:2: ( ( rule__If__Group__0 ) )
            // InternalOptimind.g:318:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalOptimind.g:319:3: ( rule__If__Group__0 )
            // InternalOptimind.g:319:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleBaseTask"
    // InternalOptimind.g:328:1: entryRuleBaseTask : ruleBaseTask EOF ;
    public final void entryRuleBaseTask() throws RecognitionException {
        try {
            // InternalOptimind.g:329:1: ( ruleBaseTask EOF )
            // InternalOptimind.g:330:1: ruleBaseTask EOF
            {
             before(grammarAccess.getBaseTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseTask();

            state._fsp--;

             after(grammarAccess.getBaseTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseTask"


    // $ANTLR start "ruleBaseTask"
    // InternalOptimind.g:337:1: ruleBaseTask : ( ( rule__BaseTask__Group__0 ) ) ;
    public final void ruleBaseTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:341:2: ( ( ( rule__BaseTask__Group__0 ) ) )
            // InternalOptimind.g:342:2: ( ( rule__BaseTask__Group__0 ) )
            {
            // InternalOptimind.g:342:2: ( ( rule__BaseTask__Group__0 ) )
            // InternalOptimind.g:343:3: ( rule__BaseTask__Group__0 )
            {
             before(grammarAccess.getBaseTaskAccess().getGroup()); 
            // InternalOptimind.g:344:3: ( rule__BaseTask__Group__0 )
            // InternalOptimind.g:344:4: rule__BaseTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseTask"


    // $ANTLR start "entryRuleLibraryTask"
    // InternalOptimind.g:353:1: entryRuleLibraryTask : ruleLibraryTask EOF ;
    public final void entryRuleLibraryTask() throws RecognitionException {
        try {
            // InternalOptimind.g:354:1: ( ruleLibraryTask EOF )
            // InternalOptimind.g:355:1: ruleLibraryTask EOF
            {
             before(grammarAccess.getLibraryTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraryTask();

            state._fsp--;

             after(grammarAccess.getLibraryTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLibraryTask"


    // $ANTLR start "ruleLibraryTask"
    // InternalOptimind.g:362:1: ruleLibraryTask : ( ( rule__LibraryTask__Group__0 ) ) ;
    public final void ruleLibraryTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:366:2: ( ( ( rule__LibraryTask__Group__0 ) ) )
            // InternalOptimind.g:367:2: ( ( rule__LibraryTask__Group__0 ) )
            {
            // InternalOptimind.g:367:2: ( ( rule__LibraryTask__Group__0 ) )
            // InternalOptimind.g:368:3: ( rule__LibraryTask__Group__0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup()); 
            // InternalOptimind.g:369:3: ( rule__LibraryTask__Group__0 )
            // InternalOptimind.g:369:4: rule__LibraryTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryTask"


    // $ANTLR start "entryRuleCustomTask"
    // InternalOptimind.g:378:1: entryRuleCustomTask : ruleCustomTask EOF ;
    public final void entryRuleCustomTask() throws RecognitionException {
        try {
            // InternalOptimind.g:379:1: ( ruleCustomTask EOF )
            // InternalOptimind.g:380:1: ruleCustomTask EOF
            {
             before(grammarAccess.getCustomTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomTask();

            state._fsp--;

             after(grammarAccess.getCustomTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomTask"


    // $ANTLR start "ruleCustomTask"
    // InternalOptimind.g:387:1: ruleCustomTask : ( ( rule__CustomTask__Group__0 ) ) ;
    public final void ruleCustomTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:391:2: ( ( ( rule__CustomTask__Group__0 ) ) )
            // InternalOptimind.g:392:2: ( ( rule__CustomTask__Group__0 ) )
            {
            // InternalOptimind.g:392:2: ( ( rule__CustomTask__Group__0 ) )
            // InternalOptimind.g:393:3: ( rule__CustomTask__Group__0 )
            {
             before(grammarAccess.getCustomTaskAccess().getGroup()); 
            // InternalOptimind.g:394:3: ( rule__CustomTask__Group__0 )
            // InternalOptimind.g:394:4: rule__CustomTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTask"


    // $ANTLR start "entryRuleSetter"
    // InternalOptimind.g:403:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // InternalOptimind.g:404:1: ( ruleSetter EOF )
            // InternalOptimind.g:405:1: ruleSetter EOF
            {
             before(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_1);
            ruleSetter();

            state._fsp--;

             after(grammarAccess.getSetterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetter"


    // $ANTLR start "ruleSetter"
    // InternalOptimind.g:412:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:416:2: ( ( ( rule__Setter__Group__0 ) ) )
            // InternalOptimind.g:417:2: ( ( rule__Setter__Group__0 ) )
            {
            // InternalOptimind.g:417:2: ( ( rule__Setter__Group__0 ) )
            // InternalOptimind.g:418:3: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // InternalOptimind.g:419:3: ( rule__Setter__Group__0 )
            // InternalOptimind.g:419:4: rule__Setter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Setter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetter"


    // $ANTLR start "entryRuleConnection"
    // InternalOptimind.g:428:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalOptimind.g:429:1: ( ruleConnection EOF )
            // InternalOptimind.g:430:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalOptimind.g:437:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:441:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalOptimind.g:442:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalOptimind.g:442:2: ( ( rule__Connection__Group__0 ) )
            // InternalOptimind.g:443:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalOptimind.g:444:3: ( rule__Connection__Group__0 )
            // InternalOptimind.g:444:4: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleLibraryFunction"
    // InternalOptimind.g:453:1: entryRuleLibraryFunction : ruleLibraryFunction EOF ;
    public final void entryRuleLibraryFunction() throws RecognitionException {
        try {
            // InternalOptimind.g:454:1: ( ruleLibraryFunction EOF )
            // InternalOptimind.g:455:1: ruleLibraryFunction EOF
            {
             before(grammarAccess.getLibraryFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleLibraryFunction();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLibraryFunction"


    // $ANTLR start "ruleLibraryFunction"
    // InternalOptimind.g:462:1: ruleLibraryFunction : ( ( rule__LibraryFunction__Group__0 ) ) ;
    public final void ruleLibraryFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:466:2: ( ( ( rule__LibraryFunction__Group__0 ) ) )
            // InternalOptimind.g:467:2: ( ( rule__LibraryFunction__Group__0 ) )
            {
            // InternalOptimind.g:467:2: ( ( rule__LibraryFunction__Group__0 ) )
            // InternalOptimind.g:468:3: ( rule__LibraryFunction__Group__0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup()); 
            // InternalOptimind.g:469:3: ( rule__LibraryFunction__Group__0 )
            // InternalOptimind.g:469:4: rule__LibraryFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibraryFunction"


    // $ANTLR start "entryRuleInput"
    // InternalOptimind.g:478:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalOptimind.g:479:1: ( ruleInput EOF )
            // InternalOptimind.g:480:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalOptimind.g:487:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:491:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalOptimind.g:492:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalOptimind.g:492:2: ( ( rule__Input__Group__0 ) )
            // InternalOptimind.g:493:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalOptimind.g:494:3: ( rule__Input__Group__0 )
            // InternalOptimind.g:494:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalOptimind.g:503:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalOptimind.g:504:1: ( ruleOutput EOF )
            // InternalOptimind.g:505:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalOptimind.g:512:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:516:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalOptimind.g:517:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalOptimind.g:517:2: ( ( rule__Output__Group__0 ) )
            // InternalOptimind.g:518:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalOptimind.g:519:3: ( rule__Output__Group__0 )
            // InternalOptimind.g:519:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "ruleProgLanguage"
    // InternalOptimind.g:528:1: ruleProgLanguage : ( ( rule__ProgLanguage__Alternatives ) ) ;
    public final void ruleProgLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:532:1: ( ( ( rule__ProgLanguage__Alternatives ) ) )
            // InternalOptimind.g:533:2: ( ( rule__ProgLanguage__Alternatives ) )
            {
            // InternalOptimind.g:533:2: ( ( rule__ProgLanguage__Alternatives ) )
            // InternalOptimind.g:534:3: ( rule__ProgLanguage__Alternatives )
            {
             before(grammarAccess.getProgLanguageAccess().getAlternatives()); 
            // InternalOptimind.g:535:3: ( rule__ProgLanguage__Alternatives )
            // InternalOptimind.g:535:4: rule__ProgLanguage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProgLanguage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgLanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgLanguage"


    // $ANTLR start "ruleTaskStatus"
    // InternalOptimind.g:544:1: ruleTaskStatus : ( ( rule__TaskStatus__Alternatives ) ) ;
    public final void ruleTaskStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:548:1: ( ( ( rule__TaskStatus__Alternatives ) ) )
            // InternalOptimind.g:549:2: ( ( rule__TaskStatus__Alternatives ) )
            {
            // InternalOptimind.g:549:2: ( ( rule__TaskStatus__Alternatives ) )
            // InternalOptimind.g:550:3: ( rule__TaskStatus__Alternatives )
            {
             before(grammarAccess.getTaskStatusAccess().getAlternatives()); 
            // InternalOptimind.g:551:3: ( rule__TaskStatus__Alternatives )
            // InternalOptimind.g:551:4: rule__TaskStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskStatus"


    // $ANTLR start "rule__AbstractTask__Alternatives"
    // InternalOptimind.g:559:1: rule__AbstractTask__Alternatives : ( ( ruleBaseTask ) | ( ruleLibraryTask ) | ( ruleCustomTask ) );
    public final void rule__AbstractTask__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:563:1: ( ( ruleBaseTask ) | ( ruleLibraryTask ) | ( ruleCustomTask ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalOptimind.g:564:2: ( ruleBaseTask )
                    {
                    // InternalOptimind.g:564:2: ( ruleBaseTask )
                    // InternalOptimind.g:565:3: ruleBaseTask
                    {
                     before(grammarAccess.getAbstractTaskAccess().getBaseTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseTask();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getBaseTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:570:2: ( ruleLibraryTask )
                    {
                    // InternalOptimind.g:570:2: ( ruleLibraryTask )
                    // InternalOptimind.g:571:3: ruleLibraryTask
                    {
                     before(grammarAccess.getAbstractTaskAccess().getLibraryTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLibraryTask();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getLibraryTaskParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:576:2: ( ruleCustomTask )
                    {
                    // InternalOptimind.g:576:2: ( ruleCustomTask )
                    // InternalOptimind.g:577:3: ruleCustomTask
                    {
                     before(grammarAccess.getAbstractTaskAccess().getCustomTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomTask();

                    state._fsp--;

                     after(grammarAccess.getAbstractTaskAccess().getCustomTaskParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractTask__Alternatives"


    // $ANTLR start "rule__TaskInput__Alternatives"
    // InternalOptimind.g:586:1: rule__TaskInput__Alternatives : ( ( ruleSetter ) | ( ruleConnection ) );
    public final void rule__TaskInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:590:1: ( ( ruleSetter ) | ( ruleConnection ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43) ) {
                alt2=1;
            }
            else if ( (LA2_0==44) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimind.g:591:2: ( ruleSetter )
                    {
                    // InternalOptimind.g:591:2: ( ruleSetter )
                    // InternalOptimind.g:592:3: ruleSetter
                    {
                     before(grammarAccess.getTaskInputAccess().getSetterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSetter();

                    state._fsp--;

                     after(grammarAccess.getTaskInputAccess().getSetterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:597:2: ( ruleConnection )
                    {
                    // InternalOptimind.g:597:2: ( ruleConnection )
                    // InternalOptimind.g:598:3: ruleConnection
                    {
                     before(grammarAccess.getTaskInputAccess().getConnectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleConnection();

                    state._fsp--;

                     after(grammarAccess.getTaskInputAccess().getConnectionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskInput__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOptimind.g:607:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:611:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptimind.g:612:2: ( RULE_STRING )
                    {
                    // InternalOptimind.g:612:2: ( RULE_STRING )
                    // InternalOptimind.g:613:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:618:2: ( RULE_ID )
                    {
                    // InternalOptimind.g:618:2: ( RULE_ID )
                    // InternalOptimind.g:619:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalOptimind.g:628:1: rule__Type__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:632:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOptimind.g:633:2: ( RULE_STRING )
                    {
                    // InternalOptimind.g:633:2: ( RULE_STRING )
                    // InternalOptimind.g:634:3: RULE_STRING
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:639:2: ( RULE_ID )
                    {
                    // InternalOptimind.g:639:2: ( RULE_ID )
                    // InternalOptimind.g:640:3: RULE_ID
                    {
                     before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AbstractStatement__Alternatives"
    // InternalOptimind.g:649:1: rule__AbstractStatement__Alternatives : ( ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) );
    public final void rule__AbstractStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:653:1: ( ( ruleFor ) | ( ruleWhile ) | ( ruleIf ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalOptimind.g:654:2: ( ruleFor )
                    {
                    // InternalOptimind.g:654:2: ( ruleFor )
                    // InternalOptimind.g:655:3: ruleFor
                    {
                     before(grammarAccess.getAbstractStatementAccess().getForParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFor();

                    state._fsp--;

                     after(grammarAccess.getAbstractStatementAccess().getForParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:660:2: ( ruleWhile )
                    {
                    // InternalOptimind.g:660:2: ( ruleWhile )
                    // InternalOptimind.g:661:3: ruleWhile
                    {
                     before(grammarAccess.getAbstractStatementAccess().getWhileParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getAbstractStatementAccess().getWhileParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:666:2: ( ruleIf )
                    {
                    // InternalOptimind.g:666:2: ( ruleIf )
                    // InternalOptimind.g:667:3: ruleIf
                    {
                     before(grammarAccess.getAbstractStatementAccess().getIfParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getAbstractStatementAccess().getIfParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractStatement__Alternatives"


    // $ANTLR start "rule__ProgLanguage__Alternatives"
    // InternalOptimind.g:676:1: rule__ProgLanguage__Alternatives : ( ( ( 'Python' ) ) | ( ( 'Java' ) ) );
    public final void rule__ProgLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:680:1: ( ( ( 'Python' ) ) | ( ( 'Java' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptimind.g:681:2: ( ( 'Python' ) )
                    {
                    // InternalOptimind.g:681:2: ( ( 'Python' ) )
                    // InternalOptimind.g:682:3: ( 'Python' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:683:3: ( 'Python' )
                    // InternalOptimind.g:683:4: 'Python'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:687:2: ( ( 'Java' ) )
                    {
                    // InternalOptimind.g:687:2: ( ( 'Java' ) )
                    // InternalOptimind.g:688:3: ( 'Java' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:689:3: ( 'Java' )
                    // InternalOptimind.g:689:4: 'Java'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgLanguage__Alternatives"


    // $ANTLR start "rule__TaskStatus__Alternatives"
    // InternalOptimind.g:697:1: rule__TaskStatus__Alternatives : ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) );
    public final void rule__TaskStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:701:1: ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOptimind.g:702:2: ( ( 'FINISHED' ) )
                    {
                    // InternalOptimind.g:702:2: ( ( 'FINISHED' ) )
                    // InternalOptimind.g:703:3: ( 'FINISHED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:704:3: ( 'FINISHED' )
                    // InternalOptimind.g:704:4: 'FINISHED'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:708:2: ( ( 'PREPARED' ) )
                    {
                    // InternalOptimind.g:708:2: ( ( 'PREPARED' ) )
                    // InternalOptimind.g:709:3: ( 'PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:710:3: ( 'PREPARED' )
                    // InternalOptimind.g:710:4: 'PREPARED'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:714:2: ( ( 'NOT_PREPARED' ) )
                    {
                    // InternalOptimind.g:714:2: ( ( 'NOT_PREPARED' ) )
                    // InternalOptimind.g:715:3: ( 'NOT_PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 
                    // InternalOptimind.g:716:3: ( 'NOT_PREPARED' )
                    // InternalOptimind.g:716:4: 'NOT_PREPARED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:720:2: ( ( 'PROCESSING' ) )
                    {
                    // InternalOptimind.g:720:2: ( ( 'PROCESSING' ) )
                    // InternalOptimind.g:721:3: ( 'PROCESSING' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3()); 
                    // InternalOptimind.g:722:3: ( 'PROCESSING' )
                    // InternalOptimind.g:722:4: 'PROCESSING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskStatus__Alternatives"


    // $ANTLR start "rule__Workflow__Group__0"
    // InternalOptimind.g:730:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:734:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalOptimind.g:735:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Workflow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0"


    // $ANTLR start "rule__Workflow__Group__0__Impl"
    // InternalOptimind.g:742:1: rule__Workflow__Group__0__Impl : ( () ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:746:1: ( ( () ) )
            // InternalOptimind.g:747:1: ( () )
            {
            // InternalOptimind.g:747:1: ( () )
            // InternalOptimind.g:748:2: ()
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowAction_0()); 
            // InternalOptimind.g:749:2: ()
            // InternalOptimind.g:749:3: 
            {
            }

             after(grammarAccess.getWorkflowAccess().getWorkflowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__0__Impl"


    // $ANTLR start "rule__Workflow__Group__1"
    // InternalOptimind.g:757:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:761:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalOptimind.g:762:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Workflow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1"


    // $ANTLR start "rule__Workflow__Group__1__Impl"
    // InternalOptimind.g:769:1: rule__Workflow__Group__1__Impl : ( 'Workflow' ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:773:1: ( ( 'Workflow' ) )
            // InternalOptimind.g:774:1: ( 'Workflow' )
            {
            // InternalOptimind.g:774:1: ( 'Workflow' )
            // InternalOptimind.g:775:2: 'Workflow'
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getWorkflowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__1__Impl"


    // $ANTLR start "rule__Workflow__Group__2"
    // InternalOptimind.g:784:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:788:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalOptimind.g:789:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Workflow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2"


    // $ANTLR start "rule__Workflow__Group__2__Impl"
    // InternalOptimind.g:796:1: rule__Workflow__Group__2__Impl : ( ( rule__Workflow__NameAssignment_2 ) ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:800:1: ( ( ( rule__Workflow__NameAssignment_2 ) ) )
            // InternalOptimind.g:801:1: ( ( rule__Workflow__NameAssignment_2 ) )
            {
            // InternalOptimind.g:801:1: ( ( rule__Workflow__NameAssignment_2 ) )
            // InternalOptimind.g:802:2: ( rule__Workflow__NameAssignment_2 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_2()); 
            // InternalOptimind.g:803:2: ( rule__Workflow__NameAssignment_2 )
            // InternalOptimind.g:803:3: rule__Workflow__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__2__Impl"


    // $ANTLR start "rule__Workflow__Group__3"
    // InternalOptimind.g:811:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:815:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalOptimind.g:816:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3"


    // $ANTLR start "rule__Workflow__Group__3__Impl"
    // InternalOptimind.g:823:1: rule__Workflow__Group__3__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:827:1: ( ( '{' ) )
            // InternalOptimind.g:828:1: ( '{' )
            {
            // InternalOptimind.g:828:1: ( '{' )
            // InternalOptimind.g:829:2: '{'
            {
             before(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__3__Impl"


    // $ANTLR start "rule__Workflow__Group__4"
    // InternalOptimind.g:838:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl rule__Workflow__Group__5 ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:842:1: ( rule__Workflow__Group__4__Impl rule__Workflow__Group__5 )
            // InternalOptimind.g:843:2: rule__Workflow__Group__4__Impl rule__Workflow__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4"


    // $ANTLR start "rule__Workflow__Group__4__Impl"
    // InternalOptimind.g:850:1: rule__Workflow__Group__4__Impl : ( ( rule__Workflow__Group_4__0 )? ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:854:1: ( ( ( rule__Workflow__Group_4__0 )? ) )
            // InternalOptimind.g:855:1: ( ( rule__Workflow__Group_4__0 )? )
            {
            // InternalOptimind.g:855:1: ( ( rule__Workflow__Group_4__0 )? )
            // InternalOptimind.g:856:2: ( rule__Workflow__Group_4__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4()); 
            // InternalOptimind.g:857:2: ( rule__Workflow__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptimind.g:857:3: rule__Workflow__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__4__Impl"


    // $ANTLR start "rule__Workflow__Group__5"
    // InternalOptimind.g:865:1: rule__Workflow__Group__5 : rule__Workflow__Group__5__Impl rule__Workflow__Group__6 ;
    public final void rule__Workflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:869:1: ( rule__Workflow__Group__5__Impl rule__Workflow__Group__6 )
            // InternalOptimind.g:870:2: rule__Workflow__Group__5__Impl rule__Workflow__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__5"


    // $ANTLR start "rule__Workflow__Group__5__Impl"
    // InternalOptimind.g:877:1: rule__Workflow__Group__5__Impl : ( ( rule__Workflow__BaseTaskAssignment_5 )? ) ;
    public final void rule__Workflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:881:1: ( ( ( rule__Workflow__BaseTaskAssignment_5 )? ) )
            // InternalOptimind.g:882:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            {
            // InternalOptimind.g:882:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            // InternalOptimind.g:883:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            {
             before(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5()); 
            // InternalOptimind.g:884:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:884:3: rule__Workflow__BaseTaskAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__BaseTaskAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__5__Impl"


    // $ANTLR start "rule__Workflow__Group__6"
    // InternalOptimind.g:892:1: rule__Workflow__Group__6 : rule__Workflow__Group__6__Impl rule__Workflow__Group__7 ;
    public final void rule__Workflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:896:1: ( rule__Workflow__Group__6__Impl rule__Workflow__Group__7 )
            // InternalOptimind.g:897:2: rule__Workflow__Group__6__Impl rule__Workflow__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Workflow__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__6"


    // $ANTLR start "rule__Workflow__Group__6__Impl"
    // InternalOptimind.g:904:1: rule__Workflow__Group__6__Impl : ( ( rule__Workflow__Group_6__0 )? ) ;
    public final void rule__Workflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:908:1: ( ( ( rule__Workflow__Group_6__0 )? ) )
            // InternalOptimind.g:909:1: ( ( rule__Workflow__Group_6__0 )? )
            {
            // InternalOptimind.g:909:1: ( ( rule__Workflow__Group_6__0 )? )
            // InternalOptimind.g:910:2: ( rule__Workflow__Group_6__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_6()); 
            // InternalOptimind.g:911:2: ( rule__Workflow__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimind.g:911:3: rule__Workflow__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workflow__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkflowAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__6__Impl"


    // $ANTLR start "rule__Workflow__Group__7"
    // InternalOptimind.g:919:1: rule__Workflow__Group__7 : rule__Workflow__Group__7__Impl ;
    public final void rule__Workflow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:923:1: ( rule__Workflow__Group__7__Impl )
            // InternalOptimind.g:924:2: rule__Workflow__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__7"


    // $ANTLR start "rule__Workflow__Group__7__Impl"
    // InternalOptimind.g:930:1: rule__Workflow__Group__7__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:934:1: ( ( '}' ) )
            // InternalOptimind.g:935:1: ( '}' )
            {
            // InternalOptimind.g:935:1: ( '}' )
            // InternalOptimind.g:936:2: '}'
            {
             before(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group__7__Impl"


    // $ANTLR start "rule__Workflow__Group_4__0"
    // InternalOptimind.g:946:1: rule__Workflow__Group_4__0 : rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 ;
    public final void rule__Workflow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:950:1: ( rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 )
            // InternalOptimind.g:951:2: rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Workflow__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__0"


    // $ANTLR start "rule__Workflow__Group_4__0__Impl"
    // InternalOptimind.g:958:1: rule__Workflow__Group_4__0__Impl : ( 'Language' ) ;
    public final void rule__Workflow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:962:1: ( ( 'Language' ) )
            // InternalOptimind.g:963:1: ( 'Language' )
            {
            // InternalOptimind.g:963:1: ( 'Language' )
            // InternalOptimind.g:964:2: 'Language'
            {
             before(grammarAccess.getWorkflowAccess().getLanguageKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkflowAccess().getLanguageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__0__Impl"


    // $ANTLR start "rule__Workflow__Group_4__1"
    // InternalOptimind.g:973:1: rule__Workflow__Group_4__1 : rule__Workflow__Group_4__1__Impl ;
    public final void rule__Workflow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:977:1: ( rule__Workflow__Group_4__1__Impl )
            // InternalOptimind.g:978:2: rule__Workflow__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__1"


    // $ANTLR start "rule__Workflow__Group_4__1__Impl"
    // InternalOptimind.g:984:1: rule__Workflow__Group_4__1__Impl : ( ( rule__Workflow__LanguageAssignment_4_1 ) ) ;
    public final void rule__Workflow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:988:1: ( ( ( rule__Workflow__LanguageAssignment_4_1 ) ) )
            // InternalOptimind.g:989:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            {
            // InternalOptimind.g:989:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            // InternalOptimind.g:990:2: ( rule__Workflow__LanguageAssignment_4_1 )
            {
             before(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1()); 
            // InternalOptimind.g:991:2: ( rule__Workflow__LanguageAssignment_4_1 )
            // InternalOptimind.g:991:3: rule__Workflow__LanguageAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__LanguageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_4__1__Impl"


    // $ANTLR start "rule__Workflow__Group_6__0"
    // InternalOptimind.g:1000:1: rule__Workflow__Group_6__0 : rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 ;
    public final void rule__Workflow__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1004:1: ( rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 )
            // InternalOptimind.g:1005:2: rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Workflow__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workflow__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_6__0"


    // $ANTLR start "rule__Workflow__Group_6__0__Impl"
    // InternalOptimind.g:1012:1: rule__Workflow__Group_6__0__Impl : ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) ;
    public final void rule__Workflow__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1016:1: ( ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) )
            // InternalOptimind.g:1017:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            {
            // InternalOptimind.g:1017:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            // InternalOptimind.g:1018:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0()); 
            // InternalOptimind.g:1019:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            // InternalOptimind.g:1019:3: rule__Workflow__FunctionsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__FunctionsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_6__0__Impl"


    // $ANTLR start "rule__Workflow__Group_6__1"
    // InternalOptimind.g:1027:1: rule__Workflow__Group_6__1 : rule__Workflow__Group_6__1__Impl ;
    public final void rule__Workflow__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1031:1: ( rule__Workflow__Group_6__1__Impl )
            // InternalOptimind.g:1032:2: rule__Workflow__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workflow__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_6__1"


    // $ANTLR start "rule__Workflow__Group_6__1__Impl"
    // InternalOptimind.g:1038:1: rule__Workflow__Group_6__1__Impl : ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) ;
    public final void rule__Workflow__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1042:1: ( ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) )
            // InternalOptimind.g:1043:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            {
            // InternalOptimind.g:1043:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            // InternalOptimind.g:1044:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1()); 
            // InternalOptimind.g:1045:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOptimind.g:1045:3: rule__Workflow__FunctionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workflow__FunctionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__Group_6__1__Impl"


    // $ANTLR start "rule__TaskOutput__Group__0"
    // InternalOptimind.g:1054:1: rule__TaskOutput__Group__0 : rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 ;
    public final void rule__TaskOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1058:1: ( rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 )
            // InternalOptimind.g:1059:2: rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TaskOutput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__0"


    // $ANTLR start "rule__TaskOutput__Group__0__Impl"
    // InternalOptimind.g:1066:1: rule__TaskOutput__Group__0__Impl : ( () ) ;
    public final void rule__TaskOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1070:1: ( ( () ) )
            // InternalOptimind.g:1071:1: ( () )
            {
            // InternalOptimind.g:1071:1: ( () )
            // InternalOptimind.g:1072:2: ()
            {
             before(grammarAccess.getTaskOutputAccess().getTaskOutputAction_0()); 
            // InternalOptimind.g:1073:2: ()
            // InternalOptimind.g:1073:3: 
            {
            }

             after(grammarAccess.getTaskOutputAccess().getTaskOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__0__Impl"


    // $ANTLR start "rule__TaskOutput__Group__1"
    // InternalOptimind.g:1081:1: rule__TaskOutput__Group__1 : rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 ;
    public final void rule__TaskOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1085:1: ( rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 )
            // InternalOptimind.g:1086:2: rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TaskOutput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__1"


    // $ANTLR start "rule__TaskOutput__Group__1__Impl"
    // InternalOptimind.g:1093:1: rule__TaskOutput__Group__1__Impl : ( 'Output' ) ;
    public final void rule__TaskOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1097:1: ( ( 'Output' ) )
            // InternalOptimind.g:1098:1: ( 'Output' )
            {
            // InternalOptimind.g:1098:1: ( 'Output' )
            // InternalOptimind.g:1099:2: 'Output'
            {
             before(grammarAccess.getTaskOutputAccess().getOutputKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskOutputAccess().getOutputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__1__Impl"


    // $ANTLR start "rule__TaskOutput__Group__2"
    // InternalOptimind.g:1108:1: rule__TaskOutput__Group__2 : rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 ;
    public final void rule__TaskOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1112:1: ( rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 )
            // InternalOptimind.g:1113:2: rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__TaskOutput__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__2"


    // $ANTLR start "rule__TaskOutput__Group__2__Impl"
    // InternalOptimind.g:1120:1: rule__TaskOutput__Group__2__Impl : ( ( rule__TaskOutput__NameAssignment_2 ) ) ;
    public final void rule__TaskOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1124:1: ( ( ( rule__TaskOutput__NameAssignment_2 ) ) )
            // InternalOptimind.g:1125:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1125:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            // InternalOptimind.g:1126:2: ( rule__TaskOutput__NameAssignment_2 )
            {
             before(grammarAccess.getTaskOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1127:2: ( rule__TaskOutput__NameAssignment_2 )
            // InternalOptimind.g:1127:3: rule__TaskOutput__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__2__Impl"


    // $ANTLR start "rule__TaskOutput__Group__3"
    // InternalOptimind.g:1135:1: rule__TaskOutput__Group__3 : rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 ;
    public final void rule__TaskOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1139:1: ( rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 )
            // InternalOptimind.g:1140:2: rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__TaskOutput__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__3"


    // $ANTLR start "rule__TaskOutput__Group__3__Impl"
    // InternalOptimind.g:1147:1: rule__TaskOutput__Group__3__Impl : ( ( rule__TaskOutput__Group_3__0 )? ) ;
    public final void rule__TaskOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1151:1: ( ( ( rule__TaskOutput__Group_3__0 )? ) )
            // InternalOptimind.g:1152:1: ( ( rule__TaskOutput__Group_3__0 )? )
            {
            // InternalOptimind.g:1152:1: ( ( rule__TaskOutput__Group_3__0 )? )
            // InternalOptimind.g:1153:2: ( rule__TaskOutput__Group_3__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_3()); 
            // InternalOptimind.g:1154:2: ( rule__TaskOutput__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimind.g:1154:3: rule__TaskOutput__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskOutput__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__3__Impl"


    // $ANTLR start "rule__TaskOutput__Group__4"
    // InternalOptimind.g:1162:1: rule__TaskOutput__Group__4 : rule__TaskOutput__Group__4__Impl ;
    public final void rule__TaskOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1166:1: ( rule__TaskOutput__Group__4__Impl )
            // InternalOptimind.g:1167:2: rule__TaskOutput__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__4"


    // $ANTLR start "rule__TaskOutput__Group__4__Impl"
    // InternalOptimind.g:1173:1: rule__TaskOutput__Group__4__Impl : ( ( rule__TaskOutput__Group_4__0 )? ) ;
    public final void rule__TaskOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1177:1: ( ( ( rule__TaskOutput__Group_4__0 )? ) )
            // InternalOptimind.g:1178:1: ( ( rule__TaskOutput__Group_4__0 )? )
            {
            // InternalOptimind.g:1178:1: ( ( rule__TaskOutput__Group_4__0 )? )
            // InternalOptimind.g:1179:2: ( rule__TaskOutput__Group_4__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_4()); 
            // InternalOptimind.g:1180:2: ( rule__TaskOutput__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptimind.g:1180:3: rule__TaskOutput__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskOutput__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskOutputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group__4__Impl"


    // $ANTLR start "rule__TaskOutput__Group_3__0"
    // InternalOptimind.g:1189:1: rule__TaskOutput__Group_3__0 : rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 ;
    public final void rule__TaskOutput__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1193:1: ( rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 )
            // InternalOptimind.g:1194:2: rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskOutput__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_3__0"


    // $ANTLR start "rule__TaskOutput__Group_3__0__Impl"
    // InternalOptimind.g:1201:1: rule__TaskOutput__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TaskOutput__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1205:1: ( ( 'type' ) )
            // InternalOptimind.g:1206:1: ( 'type' )
            {
            // InternalOptimind.g:1206:1: ( 'type' )
            // InternalOptimind.g:1207:2: 'type'
            {
             before(grammarAccess.getTaskOutputAccess().getTypeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskOutputAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_3__0__Impl"


    // $ANTLR start "rule__TaskOutput__Group_3__1"
    // InternalOptimind.g:1216:1: rule__TaskOutput__Group_3__1 : rule__TaskOutput__Group_3__1__Impl ;
    public final void rule__TaskOutput__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1220:1: ( rule__TaskOutput__Group_3__1__Impl )
            // InternalOptimind.g:1221:2: rule__TaskOutput__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_3__1"


    // $ANTLR start "rule__TaskOutput__Group_3__1__Impl"
    // InternalOptimind.g:1227:1: rule__TaskOutput__Group_3__1__Impl : ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__TaskOutput__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1231:1: ( ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:1232:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:1232:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:1233:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:1234:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:1234:3: rule__TaskOutput__TypeAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__TypeAsStringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_3__1__Impl"


    // $ANTLR start "rule__TaskOutput__Group_4__0"
    // InternalOptimind.g:1243:1: rule__TaskOutput__Group_4__0 : rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 ;
    public final void rule__TaskOutput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1247:1: ( rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 )
            // InternalOptimind.g:1248:2: rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskOutput__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_4__0"


    // $ANTLR start "rule__TaskOutput__Group_4__0__Impl"
    // InternalOptimind.g:1255:1: rule__TaskOutput__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__TaskOutput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1259:1: ( ( 'value' ) )
            // InternalOptimind.g:1260:1: ( 'value' )
            {
            // InternalOptimind.g:1260:1: ( 'value' )
            // InternalOptimind.g:1261:2: 'value'
            {
             before(grammarAccess.getTaskOutputAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskOutputAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_4__0__Impl"


    // $ANTLR start "rule__TaskOutput__Group_4__1"
    // InternalOptimind.g:1270:1: rule__TaskOutput__Group_4__1 : rule__TaskOutput__Group_4__1__Impl ;
    public final void rule__TaskOutput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1274:1: ( rule__TaskOutput__Group_4__1__Impl )
            // InternalOptimind.g:1275:2: rule__TaskOutput__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_4__1"


    // $ANTLR start "rule__TaskOutput__Group_4__1__Impl"
    // InternalOptimind.g:1281:1: rule__TaskOutput__Group_4__1__Impl : ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__TaskOutput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1285:1: ( ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:1286:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:1286:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:1287:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:1288:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:1288:3: rule__TaskOutput__ValueAsStringAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskOutput__ValueAsStringAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__Group_4__1__Impl"


    // $ANTLR start "rule__For__Group__0"
    // InternalOptimind.g:1297:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1301:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // InternalOptimind.g:1302:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__For__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // InternalOptimind.g:1309:1: rule__For__Group__0__Impl : ( () ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1313:1: ( ( () ) )
            // InternalOptimind.g:1314:1: ( () )
            {
            // InternalOptimind.g:1314:1: ( () )
            // InternalOptimind.g:1315:2: ()
            {
             before(grammarAccess.getForAccess().getForAction_0()); 
            // InternalOptimind.g:1316:2: ()
            // InternalOptimind.g:1316:3: 
            {
            }

             after(grammarAccess.getForAccess().getForAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // InternalOptimind.g:1324:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1328:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // InternalOptimind.g:1329:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__For__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // InternalOptimind.g:1336:1: rule__For__Group__1__Impl : ( 'For{' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1340:1: ( ( 'For{' ) )
            // InternalOptimind.g:1341:1: ( 'For{' )
            {
            // InternalOptimind.g:1341:1: ( 'For{' )
            // InternalOptimind.g:1342:2: 'For{'
            {
             before(grammarAccess.getForAccess().getForKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForAccess().getForKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // InternalOptimind.g:1351:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1355:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // InternalOptimind.g:1356:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__For__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // InternalOptimind.g:1363:1: rule__For__Group__2__Impl : ( 'from' ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1367:1: ( ( 'from' ) )
            // InternalOptimind.g:1368:1: ( 'from' )
            {
            // InternalOptimind.g:1368:1: ( 'from' )
            // InternalOptimind.g:1369:2: 'from'
            {
             before(grammarAccess.getForAccess().getFromKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // InternalOptimind.g:1378:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1382:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // InternalOptimind.g:1383:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__For__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // InternalOptimind.g:1390:1: rule__For__Group__3__Impl : ( ( rule__For__FromAssignment_3 ) ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1394:1: ( ( ( rule__For__FromAssignment_3 ) ) )
            // InternalOptimind.g:1395:1: ( ( rule__For__FromAssignment_3 ) )
            {
            // InternalOptimind.g:1395:1: ( ( rule__For__FromAssignment_3 ) )
            // InternalOptimind.g:1396:2: ( rule__For__FromAssignment_3 )
            {
             before(grammarAccess.getForAccess().getFromAssignment_3()); 
            // InternalOptimind.g:1397:2: ( rule__For__FromAssignment_3 )
            // InternalOptimind.g:1397:3: rule__For__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__For__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // InternalOptimind.g:1405:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1409:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // InternalOptimind.g:1410:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__For__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // InternalOptimind.g:1417:1: rule__For__Group__4__Impl : ( 'to' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1421:1: ( ( 'to' ) )
            // InternalOptimind.g:1422:1: ( 'to' )
            {
            // InternalOptimind.g:1422:1: ( 'to' )
            // InternalOptimind.g:1423:2: 'to'
            {
             before(grammarAccess.getForAccess().getToKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__For__Group__5"
    // InternalOptimind.g:1432:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1436:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // InternalOptimind.g:1437:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__For__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // InternalOptimind.g:1444:1: rule__For__Group__5__Impl : ( ( rule__For__ToAssignment_5 ) ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1448:1: ( ( ( rule__For__ToAssignment_5 ) ) )
            // InternalOptimind.g:1449:1: ( ( rule__For__ToAssignment_5 ) )
            {
            // InternalOptimind.g:1449:1: ( ( rule__For__ToAssignment_5 ) )
            // InternalOptimind.g:1450:2: ( rule__For__ToAssignment_5 )
            {
             before(grammarAccess.getForAccess().getToAssignment_5()); 
            // InternalOptimind.g:1451:2: ( rule__For__ToAssignment_5 )
            // InternalOptimind.g:1451:3: rule__For__ToAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__For__ToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5__Impl"


    // $ANTLR start "rule__For__Group__6"
    // InternalOptimind.g:1459:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1463:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // InternalOptimind.g:1464:2: rule__For__Group__6__Impl rule__For__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__For__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6"


    // $ANTLR start "rule__For__Group__6__Impl"
    // InternalOptimind.g:1471:1: rule__For__Group__6__Impl : ( 'increment' ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1475:1: ( ( 'increment' ) )
            // InternalOptimind.g:1476:1: ( 'increment' )
            {
            // InternalOptimind.g:1476:1: ( 'increment' )
            // InternalOptimind.g:1477:2: 'increment'
            {
             before(grammarAccess.getForAccess().getIncrementKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForAccess().getIncrementKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__6__Impl"


    // $ANTLR start "rule__For__Group__7"
    // InternalOptimind.g:1486:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1490:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // InternalOptimind.g:1491:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__For__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7"


    // $ANTLR start "rule__For__Group__7__Impl"
    // InternalOptimind.g:1498:1: rule__For__Group__7__Impl : ( ( rule__For__IncrementAssignment_7 ) ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1502:1: ( ( ( rule__For__IncrementAssignment_7 ) ) )
            // InternalOptimind.g:1503:1: ( ( rule__For__IncrementAssignment_7 ) )
            {
            // InternalOptimind.g:1503:1: ( ( rule__For__IncrementAssignment_7 ) )
            // InternalOptimind.g:1504:2: ( rule__For__IncrementAssignment_7 )
            {
             before(grammarAccess.getForAccess().getIncrementAssignment_7()); 
            // InternalOptimind.g:1505:2: ( rule__For__IncrementAssignment_7 )
            // InternalOptimind.g:1505:3: rule__For__IncrementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__For__IncrementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getIncrementAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__7__Impl"


    // $ANTLR start "rule__For__Group__8"
    // InternalOptimind.g:1513:1: rule__For__Group__8 : rule__For__Group__8__Impl rule__For__Group__9 ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1517:1: ( rule__For__Group__8__Impl rule__For__Group__9 )
            // InternalOptimind.g:1518:2: rule__For__Group__8__Impl rule__For__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__For__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8"


    // $ANTLR start "rule__For__Group__8__Impl"
    // InternalOptimind.g:1525:1: rule__For__Group__8__Impl : ( 'do' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1529:1: ( ( 'do' ) )
            // InternalOptimind.g:1530:1: ( 'do' )
            {
            // InternalOptimind.g:1530:1: ( 'do' )
            // InternalOptimind.g:1531:2: 'do'
            {
             before(grammarAccess.getForAccess().getDoKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getForAccess().getDoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__8__Impl"


    // $ANTLR start "rule__For__Group__9"
    // InternalOptimind.g:1540:1: rule__For__Group__9 : rule__For__Group__9__Impl rule__For__Group__10 ;
    public final void rule__For__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1544:1: ( rule__For__Group__9__Impl rule__For__Group__10 )
            // InternalOptimind.g:1545:2: rule__For__Group__9__Impl rule__For__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__For__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__9"


    // $ANTLR start "rule__For__Group__9__Impl"
    // InternalOptimind.g:1552:1: rule__For__Group__9__Impl : ( ( rule__For__AbstracttaskAssignment_9 ) ) ;
    public final void rule__For__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1556:1: ( ( ( rule__For__AbstracttaskAssignment_9 ) ) )
            // InternalOptimind.g:1557:1: ( ( rule__For__AbstracttaskAssignment_9 ) )
            {
            // InternalOptimind.g:1557:1: ( ( rule__For__AbstracttaskAssignment_9 ) )
            // InternalOptimind.g:1558:2: ( rule__For__AbstracttaskAssignment_9 )
            {
             before(grammarAccess.getForAccess().getAbstracttaskAssignment_9()); 
            // InternalOptimind.g:1559:2: ( rule__For__AbstracttaskAssignment_9 )
            // InternalOptimind.g:1559:3: rule__For__AbstracttaskAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__For__AbstracttaskAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getAbstracttaskAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__9__Impl"


    // $ANTLR start "rule__For__Group__10"
    // InternalOptimind.g:1567:1: rule__For__Group__10 : rule__For__Group__10__Impl ;
    public final void rule__For__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1571:1: ( rule__For__Group__10__Impl )
            // InternalOptimind.g:1572:2: rule__For__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__For__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__10"


    // $ANTLR start "rule__For__Group__10__Impl"
    // InternalOptimind.g:1578:1: rule__For__Group__10__Impl : ( '}' ) ;
    public final void rule__For__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1582:1: ( ( '}' ) )
            // InternalOptimind.g:1583:1: ( '}' )
            {
            // InternalOptimind.g:1583:1: ( '}' )
            // InternalOptimind.g:1584:2: '}'
            {
             before(grammarAccess.getForAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getForAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__10__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalOptimind.g:1594:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1598:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalOptimind.g:1599:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalOptimind.g:1606:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1610:1: ( ( () ) )
            // InternalOptimind.g:1611:1: ( () )
            {
            // InternalOptimind.g:1611:1: ( () )
            // InternalOptimind.g:1612:2: ()
            {
             before(grammarAccess.getWhileAccess().getWhileAction_0()); 
            // InternalOptimind.g:1613:2: ()
            // InternalOptimind.g:1613:3: 
            {
            }

             after(grammarAccess.getWhileAccess().getWhileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalOptimind.g:1621:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1625:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalOptimind.g:1626:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalOptimind.g:1633:1: rule__While__Group__1__Impl : ( 'While{' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1637:1: ( ( 'While{' ) )
            // InternalOptimind.g:1638:1: ( 'While{' )
            {
            // InternalOptimind.g:1638:1: ( 'While{' )
            // InternalOptimind.g:1639:2: 'While{'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalOptimind.g:1648:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1652:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalOptimind.g:1653:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__While__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalOptimind.g:1660:1: rule__While__Group__2__Impl : ( 'condition' ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1664:1: ( ( 'condition' ) )
            // InternalOptimind.g:1665:1: ( 'condition' )
            {
            // InternalOptimind.g:1665:1: ( 'condition' )
            // InternalOptimind.g:1666:2: 'condition'
            {
             before(grammarAccess.getWhileAccess().getConditionKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getConditionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__While__Group__3"
    // InternalOptimind.g:1675:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1679:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalOptimind.g:1680:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__While__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3"


    // $ANTLR start "rule__While__Group__3__Impl"
    // InternalOptimind.g:1687:1: rule__While__Group__3__Impl : ( ( rule__While__ConditionAssignment_3 ) ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1691:1: ( ( ( rule__While__ConditionAssignment_3 ) ) )
            // InternalOptimind.g:1692:1: ( ( rule__While__ConditionAssignment_3 ) )
            {
            // InternalOptimind.g:1692:1: ( ( rule__While__ConditionAssignment_3 ) )
            // InternalOptimind.g:1693:2: ( rule__While__ConditionAssignment_3 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_3()); 
            // InternalOptimind.g:1694:2: ( rule__While__ConditionAssignment_3 )
            // InternalOptimind.g:1694:3: rule__While__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__3__Impl"


    // $ANTLR start "rule__While__Group__4"
    // InternalOptimind.g:1702:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1706:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalOptimind.g:1707:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__While__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4"


    // $ANTLR start "rule__While__Group__4__Impl"
    // InternalOptimind.g:1714:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1718:1: ( ( 'do' ) )
            // InternalOptimind.g:1719:1: ( 'do' )
            {
            // InternalOptimind.g:1719:1: ( 'do' )
            // InternalOptimind.g:1720:2: 'do'
            {
             before(grammarAccess.getWhileAccess().getDoKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__4__Impl"


    // $ANTLR start "rule__While__Group__5"
    // InternalOptimind.g:1729:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1733:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalOptimind.g:1734:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__While__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5"


    // $ANTLR start "rule__While__Group__5__Impl"
    // InternalOptimind.g:1741:1: rule__While__Group__5__Impl : ( ( rule__While__AbstracttaskAssignment_5 ) ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1745:1: ( ( ( rule__While__AbstracttaskAssignment_5 ) ) )
            // InternalOptimind.g:1746:1: ( ( rule__While__AbstracttaskAssignment_5 ) )
            {
            // InternalOptimind.g:1746:1: ( ( rule__While__AbstracttaskAssignment_5 ) )
            // InternalOptimind.g:1747:2: ( rule__While__AbstracttaskAssignment_5 )
            {
             before(grammarAccess.getWhileAccess().getAbstracttaskAssignment_5()); 
            // InternalOptimind.g:1748:2: ( rule__While__AbstracttaskAssignment_5 )
            // InternalOptimind.g:1748:3: rule__While__AbstracttaskAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__While__AbstracttaskAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getAbstracttaskAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__5__Impl"


    // $ANTLR start "rule__While__Group__6"
    // InternalOptimind.g:1756:1: rule__While__Group__6 : rule__While__Group__6__Impl ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1760:1: ( rule__While__Group__6__Impl )
            // InternalOptimind.g:1761:2: rule__While__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6"


    // $ANTLR start "rule__While__Group__6__Impl"
    // InternalOptimind.g:1767:1: rule__While__Group__6__Impl : ( '}' ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1771:1: ( ( '}' ) )
            // InternalOptimind.g:1772:1: ( '}' )
            {
            // InternalOptimind.g:1772:1: ( '}' )
            // InternalOptimind.g:1773:2: '}'
            {
             before(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__6__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalOptimind.g:1783:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1787:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalOptimind.g:1788:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalOptimind.g:1795:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1799:1: ( ( () ) )
            // InternalOptimind.g:1800:1: ( () )
            {
            // InternalOptimind.g:1800:1: ( () )
            // InternalOptimind.g:1801:2: ()
            {
             before(grammarAccess.getIfAccess().getIfAction_0()); 
            // InternalOptimind.g:1802:2: ()
            // InternalOptimind.g:1802:3: 
            {
            }

             after(grammarAccess.getIfAccess().getIfAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalOptimind.g:1810:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1814:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalOptimind.g:1815:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalOptimind.g:1822:1: rule__If__Group__1__Impl : ( 'If{' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1826:1: ( ( 'If{' ) )
            // InternalOptimind.g:1827:1: ( 'If{' )
            {
            // InternalOptimind.g:1827:1: ( 'If{' )
            // InternalOptimind.g:1828:2: 'If{'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalOptimind.g:1837:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1841:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalOptimind.g:1842:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalOptimind.g:1849:1: rule__If__Group__2__Impl : ( 'condition' ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1853:1: ( ( 'condition' ) )
            // InternalOptimind.g:1854:1: ( 'condition' )
            {
            // InternalOptimind.g:1854:1: ( 'condition' )
            // InternalOptimind.g:1855:2: 'condition'
            {
             before(grammarAccess.getIfAccess().getConditionKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getConditionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalOptimind.g:1864:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1868:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalOptimind.g:1869:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalOptimind.g:1876:1: rule__If__Group__3__Impl : ( ( rule__If__ConditionAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1880:1: ( ( ( rule__If__ConditionAssignment_3 ) ) )
            // InternalOptimind.g:1881:1: ( ( rule__If__ConditionAssignment_3 ) )
            {
            // InternalOptimind.g:1881:1: ( ( rule__If__ConditionAssignment_3 ) )
            // InternalOptimind.g:1882:2: ( rule__If__ConditionAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_3()); 
            // InternalOptimind.g:1883:2: ( rule__If__ConditionAssignment_3 )
            // InternalOptimind.g:1883:3: rule__If__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalOptimind.g:1891:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1895:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalOptimind.g:1896:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalOptimind.g:1903:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1907:1: ( ( 'then' ) )
            // InternalOptimind.g:1908:1: ( 'then' )
            {
            // InternalOptimind.g:1908:1: ( 'then' )
            // InternalOptimind.g:1909:2: 'then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getThenKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalOptimind.g:1918:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1922:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalOptimind.g:1923:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalOptimind.g:1930:1: rule__If__Group__5__Impl : ( ( rule__If__ThenAssignment_5 ) ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1934:1: ( ( ( rule__If__ThenAssignment_5 ) ) )
            // InternalOptimind.g:1935:1: ( ( rule__If__ThenAssignment_5 ) )
            {
            // InternalOptimind.g:1935:1: ( ( rule__If__ThenAssignment_5 ) )
            // InternalOptimind.g:1936:2: ( rule__If__ThenAssignment_5 )
            {
             before(grammarAccess.getIfAccess().getThenAssignment_5()); 
            // InternalOptimind.g:1937:2: ( rule__If__ThenAssignment_5 )
            // InternalOptimind.g:1937:3: rule__If__ThenAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__If__ThenAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getThenAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalOptimind.g:1945:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1949:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalOptimind.g:1950:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalOptimind.g:1957:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1961:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalOptimind.g:1962:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalOptimind.g:1962:1: ( ( rule__If__Group_6__0 )? )
            // InternalOptimind.g:1963:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalOptimind.g:1964:2: ( rule__If__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptimind.g:1964:3: rule__If__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalOptimind.g:1972:1: rule__If__Group__7 : rule__If__Group__7__Impl ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1976:1: ( rule__If__Group__7__Impl )
            // InternalOptimind.g:1977:2: rule__If__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // InternalOptimind.g:1983:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1987:1: ( ( '}' ) )
            // InternalOptimind.g:1988:1: ( '}' )
            {
            // InternalOptimind.g:1988:1: ( '}' )
            // InternalOptimind.g:1989:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group_6__0"
    // InternalOptimind.g:1999:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2003:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalOptimind.g:2004:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__If__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__0"


    // $ANTLR start "rule__If__Group_6__0__Impl"
    // InternalOptimind.g:2011:1: rule__If__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2015:1: ( ( 'else' ) )
            // InternalOptimind.g:2016:1: ( 'else' )
            {
            // InternalOptimind.g:2016:1: ( 'else' )
            // InternalOptimind.g:2017:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__0__Impl"


    // $ANTLR start "rule__If__Group_6__1"
    // InternalOptimind.g:2026:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2030:1: ( rule__If__Group_6__1__Impl )
            // InternalOptimind.g:2031:2: rule__If__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__1"


    // $ANTLR start "rule__If__Group_6__1__Impl"
    // InternalOptimind.g:2037:1: rule__If__Group_6__1__Impl : ( ( rule__If__ElseAssignment_6_1 ) ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2041:1: ( ( ( rule__If__ElseAssignment_6_1 ) ) )
            // InternalOptimind.g:2042:1: ( ( rule__If__ElseAssignment_6_1 ) )
            {
            // InternalOptimind.g:2042:1: ( ( rule__If__ElseAssignment_6_1 ) )
            // InternalOptimind.g:2043:2: ( rule__If__ElseAssignment_6_1 )
            {
             before(grammarAccess.getIfAccess().getElseAssignment_6_1()); 
            // InternalOptimind.g:2044:2: ( rule__If__ElseAssignment_6_1 )
            // InternalOptimind.g:2044:3: rule__If__ElseAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElseAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_6__1__Impl"


    // $ANTLR start "rule__BaseTask__Group__0"
    // InternalOptimind.g:2053:1: rule__BaseTask__Group__0 : rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 ;
    public final void rule__BaseTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2057:1: ( rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 )
            // InternalOptimind.g:2058:2: rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__BaseTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__0"


    // $ANTLR start "rule__BaseTask__Group__0__Impl"
    // InternalOptimind.g:2065:1: rule__BaseTask__Group__0__Impl : ( () ) ;
    public final void rule__BaseTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2069:1: ( ( () ) )
            // InternalOptimind.g:2070:1: ( () )
            {
            // InternalOptimind.g:2070:1: ( () )
            // InternalOptimind.g:2071:2: ()
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskAction_0()); 
            // InternalOptimind.g:2072:2: ()
            // InternalOptimind.g:2072:3: 
            {
            }

             after(grammarAccess.getBaseTaskAccess().getBaseTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__0__Impl"


    // $ANTLR start "rule__BaseTask__Group__1"
    // InternalOptimind.g:2080:1: rule__BaseTask__Group__1 : rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 ;
    public final void rule__BaseTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2084:1: ( rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 )
            // InternalOptimind.g:2085:2: rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BaseTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__1"


    // $ANTLR start "rule__BaseTask__Group__1__Impl"
    // InternalOptimind.g:2092:1: rule__BaseTask__Group__1__Impl : ( 'BaseTask' ) ;
    public final void rule__BaseTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2096:1: ( ( 'BaseTask' ) )
            // InternalOptimind.g:2097:1: ( 'BaseTask' )
            {
            // InternalOptimind.g:2097:1: ( 'BaseTask' )
            // InternalOptimind.g:2098:2: 'BaseTask'
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__1__Impl"


    // $ANTLR start "rule__BaseTask__Group__2"
    // InternalOptimind.g:2107:1: rule__BaseTask__Group__2 : rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 ;
    public final void rule__BaseTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2111:1: ( rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 )
            // InternalOptimind.g:2112:2: rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BaseTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__2"


    // $ANTLR start "rule__BaseTask__Group__2__Impl"
    // InternalOptimind.g:2119:1: rule__BaseTask__Group__2__Impl : ( ( rule__BaseTask__NameAssignment_2 ) ) ;
    public final void rule__BaseTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2123:1: ( ( ( rule__BaseTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2124:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2124:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            // InternalOptimind.g:2125:2: ( rule__BaseTask__NameAssignment_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2126:2: ( rule__BaseTask__NameAssignment_2 )
            // InternalOptimind.g:2126:3: rule__BaseTask__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__2__Impl"


    // $ANTLR start "rule__BaseTask__Group__3"
    // InternalOptimind.g:2134:1: rule__BaseTask__Group__3 : rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 ;
    public final void rule__BaseTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2138:1: ( rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 )
            // InternalOptimind.g:2139:2: rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__3"


    // $ANTLR start "rule__BaseTask__Group__3__Impl"
    // InternalOptimind.g:2146:1: rule__BaseTask__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2150:1: ( ( '{' ) )
            // InternalOptimind.g:2151:1: ( '{' )
            {
            // InternalOptimind.g:2151:1: ( '{' )
            // InternalOptimind.g:2152:2: '{'
            {
             before(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__3__Impl"


    // $ANTLR start "rule__BaseTask__Group__4"
    // InternalOptimind.g:2161:1: rule__BaseTask__Group__4 : rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 ;
    public final void rule__BaseTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2165:1: ( rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 )
            // InternalOptimind.g:2166:2: rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__4"


    // $ANTLR start "rule__BaseTask__Group__4__Impl"
    // InternalOptimind.g:2173:1: rule__BaseTask__Group__4__Impl : ( ( rule__BaseTask__Group_4__0 )? ) ;
    public final void rule__BaseTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2177:1: ( ( ( rule__BaseTask__Group_4__0 )? ) )
            // InternalOptimind.g:2178:1: ( ( rule__BaseTask__Group_4__0 )? )
            {
            // InternalOptimind.g:2178:1: ( ( rule__BaseTask__Group_4__0 )? )
            // InternalOptimind.g:2179:2: ( rule__BaseTask__Group_4__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2180:2: ( rule__BaseTask__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:2180:3: rule__BaseTask__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__4__Impl"


    // $ANTLR start "rule__BaseTask__Group__5"
    // InternalOptimind.g:2188:1: rule__BaseTask__Group__5 : rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 ;
    public final void rule__BaseTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2192:1: ( rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 )
            // InternalOptimind.g:2193:2: rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__5"


    // $ANTLR start "rule__BaseTask__Group__5__Impl"
    // InternalOptimind.g:2200:1: rule__BaseTask__Group__5__Impl : ( ( rule__BaseTask__Group_5__0 )? ) ;
    public final void rule__BaseTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2204:1: ( ( ( rule__BaseTask__Group_5__0 )? ) )
            // InternalOptimind.g:2205:1: ( ( rule__BaseTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2205:1: ( ( rule__BaseTask__Group_5__0 )? )
            // InternalOptimind.g:2206:2: ( rule__BaseTask__Group_5__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2207:2: ( rule__BaseTask__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptimind.g:2207:3: rule__BaseTask__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__5__Impl"


    // $ANTLR start "rule__BaseTask__Group__6"
    // InternalOptimind.g:2215:1: rule__BaseTask__Group__6 : rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 ;
    public final void rule__BaseTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2219:1: ( rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 )
            // InternalOptimind.g:2220:2: rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__6"


    // $ANTLR start "rule__BaseTask__Group__6__Impl"
    // InternalOptimind.g:2227:1: rule__BaseTask__Group__6__Impl : ( ( rule__BaseTask__Group_6__0 )? ) ;
    public final void rule__BaseTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2231:1: ( ( ( rule__BaseTask__Group_6__0 )? ) )
            // InternalOptimind.g:2232:1: ( ( rule__BaseTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2232:1: ( ( rule__BaseTask__Group_6__0 )? )
            // InternalOptimind.g:2233:2: ( rule__BaseTask__Group_6__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2234:2: ( rule__BaseTask__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptimind.g:2234:3: rule__BaseTask__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__6__Impl"


    // $ANTLR start "rule__BaseTask__Group__7"
    // InternalOptimind.g:2242:1: rule__BaseTask__Group__7 : rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 ;
    public final void rule__BaseTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2246:1: ( rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 )
            // InternalOptimind.g:2247:2: rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__7"


    // $ANTLR start "rule__BaseTask__Group__7__Impl"
    // InternalOptimind.g:2254:1: rule__BaseTask__Group__7__Impl : ( ( rule__BaseTask__Group_7__0 )? ) ;
    public final void rule__BaseTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2258:1: ( ( ( rule__BaseTask__Group_7__0 )? ) )
            // InternalOptimind.g:2259:1: ( ( rule__BaseTask__Group_7__0 )? )
            {
            // InternalOptimind.g:2259:1: ( ( rule__BaseTask__Group_7__0 )? )
            // InternalOptimind.g:2260:2: ( rule__BaseTask__Group_7__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_7()); 
            // InternalOptimind.g:2261:2: ( rule__BaseTask__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34||LA18_0==39||LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptimind.g:2261:3: rule__BaseTask__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__7__Impl"


    // $ANTLR start "rule__BaseTask__Group__8"
    // InternalOptimind.g:2269:1: rule__BaseTask__Group__8 : rule__BaseTask__Group__8__Impl rule__BaseTask__Group__9 ;
    public final void rule__BaseTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2273:1: ( rule__BaseTask__Group__8__Impl rule__BaseTask__Group__9 )
            // InternalOptimind.g:2274:2: rule__BaseTask__Group__8__Impl rule__BaseTask__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__BaseTask__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__8"


    // $ANTLR start "rule__BaseTask__Group__8__Impl"
    // InternalOptimind.g:2281:1: rule__BaseTask__Group__8__Impl : ( ( rule__BaseTask__AbstractstatementAssignment_8 )? ) ;
    public final void rule__BaseTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2285:1: ( ( ( rule__BaseTask__AbstractstatementAssignment_8 )? ) )
            // InternalOptimind.g:2286:1: ( ( rule__BaseTask__AbstractstatementAssignment_8 )? )
            {
            // InternalOptimind.g:2286:1: ( ( rule__BaseTask__AbstractstatementAssignment_8 )? )
            // InternalOptimind.g:2287:2: ( rule__BaseTask__AbstractstatementAssignment_8 )?
            {
             before(grammarAccess.getBaseTaskAccess().getAbstractstatementAssignment_8()); 
            // InternalOptimind.g:2288:2: ( rule__BaseTask__AbstractstatementAssignment_8 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24||LA19_0==29||LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOptimind.g:2288:3: rule__BaseTask__AbstractstatementAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__AbstractstatementAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBaseTaskAccess().getAbstractstatementAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__8__Impl"


    // $ANTLR start "rule__BaseTask__Group__9"
    // InternalOptimind.g:2296:1: rule__BaseTask__Group__9 : rule__BaseTask__Group__9__Impl ;
    public final void rule__BaseTask__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2300:1: ( rule__BaseTask__Group__9__Impl )
            // InternalOptimind.g:2301:2: rule__BaseTask__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__9"


    // $ANTLR start "rule__BaseTask__Group__9__Impl"
    // InternalOptimind.g:2307:1: rule__BaseTask__Group__9__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2311:1: ( ( '}' ) )
            // InternalOptimind.g:2312:1: ( '}' )
            {
            // InternalOptimind.g:2312:1: ( '}' )
            // InternalOptimind.g:2313:2: '}'
            {
             before(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group__9__Impl"


    // $ANTLR start "rule__BaseTask__Group_4__0"
    // InternalOptimind.g:2323:1: rule__BaseTask__Group_4__0 : rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 ;
    public final void rule__BaseTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2327:1: ( rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 )
            // InternalOptimind.g:2328:2: rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__BaseTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_4__0"


    // $ANTLR start "rule__BaseTask__Group_4__0__Impl"
    // InternalOptimind.g:2335:1: rule__BaseTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__BaseTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2339:1: ( ( 'status' ) )
            // InternalOptimind.g:2340:1: ( 'status' )
            {
            // InternalOptimind.g:2340:1: ( 'status' )
            // InternalOptimind.g:2341:2: 'status'
            {
             before(grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_4__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_4__1"
    // InternalOptimind.g:2350:1: rule__BaseTask__Group_4__1 : rule__BaseTask__Group_4__1__Impl ;
    public final void rule__BaseTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2354:1: ( rule__BaseTask__Group_4__1__Impl )
            // InternalOptimind.g:2355:2: rule__BaseTask__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_4__1"


    // $ANTLR start "rule__BaseTask__Group_4__1__Impl"
    // InternalOptimind.g:2361:1: rule__BaseTask__Group_4__1__Impl : ( ( rule__BaseTask__StatusAssignment_4_1 ) ) ;
    public final void rule__BaseTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2365:1: ( ( ( rule__BaseTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:2366:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:2366:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:2367:2: ( rule__BaseTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:2368:2: ( rule__BaseTask__StatusAssignment_4_1 )
            // InternalOptimind.g:2368:3: rule__BaseTask__StatusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__StatusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_4__1__Impl"


    // $ANTLR start "rule__BaseTask__Group_5__0"
    // InternalOptimind.g:2377:1: rule__BaseTask__Group_5__0 : rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 ;
    public final void rule__BaseTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2381:1: ( rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 )
            // InternalOptimind.g:2382:2: rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__0"


    // $ANTLR start "rule__BaseTask__Group_5__0__Impl"
    // InternalOptimind.g:2389:1: rule__BaseTask__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__BaseTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2393:1: ( ( 'inputs' ) )
            // InternalOptimind.g:2394:1: ( 'inputs' )
            {
            // InternalOptimind.g:2394:1: ( 'inputs' )
            // InternalOptimind.g:2395:2: 'inputs'
            {
             before(grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_5__1"
    // InternalOptimind.g:2404:1: rule__BaseTask__Group_5__1 : rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 ;
    public final void rule__BaseTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2408:1: ( rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 )
            // InternalOptimind.g:2409:2: rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__BaseTask__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__1"


    // $ANTLR start "rule__BaseTask__Group_5__1__Impl"
    // InternalOptimind.g:2416:1: rule__BaseTask__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2420:1: ( ( '{' ) )
            // InternalOptimind.g:2421:1: ( '{' )
            {
            // InternalOptimind.g:2421:1: ( '{' )
            // InternalOptimind.g:2422:2: '{'
            {
             before(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__1__Impl"


    // $ANTLR start "rule__BaseTask__Group_5__2"
    // InternalOptimind.g:2431:1: rule__BaseTask__Group_5__2 : rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 ;
    public final void rule__BaseTask__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2435:1: ( rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 )
            // InternalOptimind.g:2436:2: rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3
            {
            pushFollow(FOLLOW_29);
            rule__BaseTask__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__2"


    // $ANTLR start "rule__BaseTask__Group_5__2__Impl"
    // InternalOptimind.g:2443:1: rule__BaseTask__Group_5__2__Impl : ( ( rule__BaseTask__InputsAssignment_5_2 ) ) ;
    public final void rule__BaseTask__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2447:1: ( ( ( rule__BaseTask__InputsAssignment_5_2 ) ) )
            // InternalOptimind.g:2448:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            {
            // InternalOptimind.g:2448:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            // InternalOptimind.g:2449:2: ( rule__BaseTask__InputsAssignment_5_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2()); 
            // InternalOptimind.g:2450:2: ( rule__BaseTask__InputsAssignment_5_2 )
            // InternalOptimind.g:2450:3: rule__BaseTask__InputsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__InputsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__2__Impl"


    // $ANTLR start "rule__BaseTask__Group_5__3"
    // InternalOptimind.g:2458:1: rule__BaseTask__Group_5__3 : rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 ;
    public final void rule__BaseTask__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2462:1: ( rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 )
            // InternalOptimind.g:2463:2: rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4
            {
            pushFollow(FOLLOW_29);
            rule__BaseTask__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__3"


    // $ANTLR start "rule__BaseTask__Group_5__3__Impl"
    // InternalOptimind.g:2470:1: rule__BaseTask__Group_5__3__Impl : ( ( rule__BaseTask__Group_5_3__0 )* ) ;
    public final void rule__BaseTask__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2474:1: ( ( ( rule__BaseTask__Group_5_3__0 )* ) )
            // InternalOptimind.g:2475:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            {
            // InternalOptimind.g:2475:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            // InternalOptimind.g:2476:2: ( rule__BaseTask__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5_3()); 
            // InternalOptimind.g:2477:2: ( rule__BaseTask__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOptimind.g:2477:3: rule__BaseTask__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__BaseTask__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getBaseTaskAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__3__Impl"


    // $ANTLR start "rule__BaseTask__Group_5__4"
    // InternalOptimind.g:2485:1: rule__BaseTask__Group_5__4 : rule__BaseTask__Group_5__4__Impl ;
    public final void rule__BaseTask__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2489:1: ( rule__BaseTask__Group_5__4__Impl )
            // InternalOptimind.g:2490:2: rule__BaseTask__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__4"


    // $ANTLR start "rule__BaseTask__Group_5__4__Impl"
    // InternalOptimind.g:2496:1: rule__BaseTask__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2500:1: ( ( '}' ) )
            // InternalOptimind.g:2501:1: ( '}' )
            {
            // InternalOptimind.g:2501:1: ( '}' )
            // InternalOptimind.g:2502:2: '}'
            {
             before(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5__4__Impl"


    // $ANTLR start "rule__BaseTask__Group_5_3__0"
    // InternalOptimind.g:2512:1: rule__BaseTask__Group_5_3__0 : rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 ;
    public final void rule__BaseTask__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2516:1: ( rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 )
            // InternalOptimind.g:2517:2: rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1
            {
            pushFollow(FOLLOW_28);
            rule__BaseTask__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5_3__0"


    // $ANTLR start "rule__BaseTask__Group_5_3__0__Impl"
    // InternalOptimind.g:2524:1: rule__BaseTask__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2528:1: ( ( ',' ) )
            // InternalOptimind.g:2529:1: ( ',' )
            {
            // InternalOptimind.g:2529:1: ( ',' )
            // InternalOptimind.g:2530:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5_3__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_5_3__1"
    // InternalOptimind.g:2539:1: rule__BaseTask__Group_5_3__1 : rule__BaseTask__Group_5_3__1__Impl ;
    public final void rule__BaseTask__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2543:1: ( rule__BaseTask__Group_5_3__1__Impl )
            // InternalOptimind.g:2544:2: rule__BaseTask__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5_3__1"


    // $ANTLR start "rule__BaseTask__Group_5_3__1__Impl"
    // InternalOptimind.g:2550:1: rule__BaseTask__Group_5_3__1__Impl : ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) ;
    public final void rule__BaseTask__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2554:1: ( ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) )
            // InternalOptimind.g:2555:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            {
            // InternalOptimind.g:2555:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            // InternalOptimind.g:2556:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1()); 
            // InternalOptimind.g:2557:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            // InternalOptimind.g:2557:3: rule__BaseTask__InputsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__InputsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_5_3__1__Impl"


    // $ANTLR start "rule__BaseTask__Group_6__0"
    // InternalOptimind.g:2566:1: rule__BaseTask__Group_6__0 : rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 ;
    public final void rule__BaseTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2570:1: ( rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 )
            // InternalOptimind.g:2571:2: rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__BaseTask__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__0"


    // $ANTLR start "rule__BaseTask__Group_6__0__Impl"
    // InternalOptimind.g:2578:1: rule__BaseTask__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__BaseTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2582:1: ( ( 'outputs' ) )
            // InternalOptimind.g:2583:1: ( 'outputs' )
            {
            // InternalOptimind.g:2583:1: ( 'outputs' )
            // InternalOptimind.g:2584:2: 'outputs'
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_6__1"
    // InternalOptimind.g:2593:1: rule__BaseTask__Group_6__1 : rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 ;
    public final void rule__BaseTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2597:1: ( rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 )
            // InternalOptimind.g:2598:2: rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__BaseTask__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__1"


    // $ANTLR start "rule__BaseTask__Group_6__1__Impl"
    // InternalOptimind.g:2605:1: rule__BaseTask__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2609:1: ( ( '{' ) )
            // InternalOptimind.g:2610:1: ( '{' )
            {
            // InternalOptimind.g:2610:1: ( '{' )
            // InternalOptimind.g:2611:2: '{'
            {
             before(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__1__Impl"


    // $ANTLR start "rule__BaseTask__Group_6__2"
    // InternalOptimind.g:2620:1: rule__BaseTask__Group_6__2 : rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 ;
    public final void rule__BaseTask__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2624:1: ( rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 )
            // InternalOptimind.g:2625:2: rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3
            {
            pushFollow(FOLLOW_29);
            rule__BaseTask__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__2"


    // $ANTLR start "rule__BaseTask__Group_6__2__Impl"
    // InternalOptimind.g:2632:1: rule__BaseTask__Group_6__2__Impl : ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) ;
    public final void rule__BaseTask__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2636:1: ( ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) )
            // InternalOptimind.g:2637:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            {
            // InternalOptimind.g:2637:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            // InternalOptimind.g:2638:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2()); 
            // InternalOptimind.g:2639:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            // InternalOptimind.g:2639:3: rule__BaseTask__OutputsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__OutputsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__2__Impl"


    // $ANTLR start "rule__BaseTask__Group_6__3"
    // InternalOptimind.g:2647:1: rule__BaseTask__Group_6__3 : rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 ;
    public final void rule__BaseTask__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2651:1: ( rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 )
            // InternalOptimind.g:2652:2: rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4
            {
            pushFollow(FOLLOW_29);
            rule__BaseTask__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__3"


    // $ANTLR start "rule__BaseTask__Group_6__3__Impl"
    // InternalOptimind.g:2659:1: rule__BaseTask__Group_6__3__Impl : ( ( rule__BaseTask__Group_6_3__0 )* ) ;
    public final void rule__BaseTask__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2663:1: ( ( ( rule__BaseTask__Group_6_3__0 )* ) )
            // InternalOptimind.g:2664:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            {
            // InternalOptimind.g:2664:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            // InternalOptimind.g:2665:2: ( rule__BaseTask__Group_6_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6_3()); 
            // InternalOptimind.g:2666:2: ( rule__BaseTask__Group_6_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOptimind.g:2666:3: rule__BaseTask__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__BaseTask__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBaseTaskAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__3__Impl"


    // $ANTLR start "rule__BaseTask__Group_6__4"
    // InternalOptimind.g:2674:1: rule__BaseTask__Group_6__4 : rule__BaseTask__Group_6__4__Impl ;
    public final void rule__BaseTask__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2678:1: ( rule__BaseTask__Group_6__4__Impl )
            // InternalOptimind.g:2679:2: rule__BaseTask__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__4"


    // $ANTLR start "rule__BaseTask__Group_6__4__Impl"
    // InternalOptimind.g:2685:1: rule__BaseTask__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2689:1: ( ( '}' ) )
            // InternalOptimind.g:2690:1: ( '}' )
            {
            // InternalOptimind.g:2690:1: ( '}' )
            // InternalOptimind.g:2691:2: '}'
            {
             before(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6__4__Impl"


    // $ANTLR start "rule__BaseTask__Group_6_3__0"
    // InternalOptimind.g:2701:1: rule__BaseTask__Group_6_3__0 : rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 ;
    public final void rule__BaseTask__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2705:1: ( rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 )
            // InternalOptimind.g:2706:2: rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__BaseTask__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6_3__0"


    // $ANTLR start "rule__BaseTask__Group_6_3__0__Impl"
    // InternalOptimind.g:2713:1: rule__BaseTask__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2717:1: ( ( ',' ) )
            // InternalOptimind.g:2718:1: ( ',' )
            {
            // InternalOptimind.g:2718:1: ( ',' )
            // InternalOptimind.g:2719:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6_3__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_6_3__1"
    // InternalOptimind.g:2728:1: rule__BaseTask__Group_6_3__1 : rule__BaseTask__Group_6_3__1__Impl ;
    public final void rule__BaseTask__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2732:1: ( rule__BaseTask__Group_6_3__1__Impl )
            // InternalOptimind.g:2733:2: rule__BaseTask__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6_3__1"


    // $ANTLR start "rule__BaseTask__Group_6_3__1__Impl"
    // InternalOptimind.g:2739:1: rule__BaseTask__Group_6_3__1__Impl : ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) ;
    public final void rule__BaseTask__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2743:1: ( ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) )
            // InternalOptimind.g:2744:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            {
            // InternalOptimind.g:2744:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            // InternalOptimind.g:2745:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1()); 
            // InternalOptimind.g:2746:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            // InternalOptimind.g:2746:3: rule__BaseTask__OutputsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__OutputsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_6_3__1__Impl"


    // $ANTLR start "rule__BaseTask__Group_7__0"
    // InternalOptimind.g:2755:1: rule__BaseTask__Group_7__0 : rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 ;
    public final void rule__BaseTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2759:1: ( rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 )
            // InternalOptimind.g:2760:2: rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__BaseTask__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_7__0"


    // $ANTLR start "rule__BaseTask__Group_7__0__Impl"
    // InternalOptimind.g:2767:1: rule__BaseTask__Group_7__0__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) ;
    public final void rule__BaseTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2771:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) )
            // InternalOptimind.g:2772:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            {
            // InternalOptimind.g:2772:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            // InternalOptimind.g:2773:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 
            // InternalOptimind.g:2774:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            // InternalOptimind.g:2774:3: rule__BaseTask__ChildrenAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__ChildrenAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_7__0__Impl"


    // $ANTLR start "rule__BaseTask__Group_7__1"
    // InternalOptimind.g:2782:1: rule__BaseTask__Group_7__1 : rule__BaseTask__Group_7__1__Impl ;
    public final void rule__BaseTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2786:1: ( rule__BaseTask__Group_7__1__Impl )
            // InternalOptimind.g:2787:2: rule__BaseTask__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_7__1"


    // $ANTLR start "rule__BaseTask__Group_7__1__Impl"
    // InternalOptimind.g:2793:1: rule__BaseTask__Group_7__1__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) ;
    public final void rule__BaseTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2797:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) )
            // InternalOptimind.g:2798:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            {
            // InternalOptimind.g:2798:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            // InternalOptimind.g:2799:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_1()); 
            // InternalOptimind.g:2800:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34||LA22_0==39||LA22_0==41) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOptimind.g:2800:3: rule__BaseTask__ChildrenAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__BaseTask__ChildrenAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__Group_7__1__Impl"


    // $ANTLR start "rule__LibraryTask__Group__0"
    // InternalOptimind.g:2809:1: rule__LibraryTask__Group__0 : rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 ;
    public final void rule__LibraryTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2813:1: ( rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 )
            // InternalOptimind.g:2814:2: rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__LibraryTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__0"


    // $ANTLR start "rule__LibraryTask__Group__0__Impl"
    // InternalOptimind.g:2821:1: rule__LibraryTask__Group__0__Impl : ( () ) ;
    public final void rule__LibraryTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2825:1: ( ( () ) )
            // InternalOptimind.g:2826:1: ( () )
            {
            // InternalOptimind.g:2826:1: ( () )
            // InternalOptimind.g:2827:2: ()
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0()); 
            // InternalOptimind.g:2828:2: ()
            // InternalOptimind.g:2828:3: 
            {
            }

             after(grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__0__Impl"


    // $ANTLR start "rule__LibraryTask__Group__1"
    // InternalOptimind.g:2836:1: rule__LibraryTask__Group__1 : rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 ;
    public final void rule__LibraryTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2840:1: ( rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 )
            // InternalOptimind.g:2841:2: rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LibraryTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__1"


    // $ANTLR start "rule__LibraryTask__Group__1__Impl"
    // InternalOptimind.g:2848:1: rule__LibraryTask__Group__1__Impl : ( 'LibraryTask' ) ;
    public final void rule__LibraryTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2852:1: ( ( 'LibraryTask' ) )
            // InternalOptimind.g:2853:1: ( 'LibraryTask' )
            {
            // InternalOptimind.g:2853:1: ( 'LibraryTask' )
            // InternalOptimind.g:2854:2: 'LibraryTask'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__1__Impl"


    // $ANTLR start "rule__LibraryTask__Group__2"
    // InternalOptimind.g:2863:1: rule__LibraryTask__Group__2 : rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 ;
    public final void rule__LibraryTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2867:1: ( rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 )
            // InternalOptimind.g:2868:2: rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LibraryTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__2"


    // $ANTLR start "rule__LibraryTask__Group__2__Impl"
    // InternalOptimind.g:2875:1: rule__LibraryTask__Group__2__Impl : ( ( rule__LibraryTask__NameAssignment_2 ) ) ;
    public final void rule__LibraryTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2879:1: ( ( ( rule__LibraryTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2880:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2880:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            // InternalOptimind.g:2881:2: ( rule__LibraryTask__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2882:2: ( rule__LibraryTask__NameAssignment_2 )
            // InternalOptimind.g:2882:3: rule__LibraryTask__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__2__Impl"


    // $ANTLR start "rule__LibraryTask__Group__3"
    // InternalOptimind.g:2890:1: rule__LibraryTask__Group__3 : rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 ;
    public final void rule__LibraryTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2894:1: ( rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 )
            // InternalOptimind.g:2895:2: rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__LibraryTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__3"


    // $ANTLR start "rule__LibraryTask__Group__3__Impl"
    // InternalOptimind.g:2902:1: rule__LibraryTask__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2906:1: ( ( '{' ) )
            // InternalOptimind.g:2907:1: ( '{' )
            {
            // InternalOptimind.g:2907:1: ( '{' )
            // InternalOptimind.g:2908:2: '{'
            {
             before(grammarAccess.getLibraryTaskAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryTaskAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__3__Impl"


    // $ANTLR start "rule__LibraryTask__Group__4"
    // InternalOptimind.g:2917:1: rule__LibraryTask__Group__4 : rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 ;
    public final void rule__LibraryTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2921:1: ( rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 )
            // InternalOptimind.g:2922:2: rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__LibraryTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__4"


    // $ANTLR start "rule__LibraryTask__Group__4__Impl"
    // InternalOptimind.g:2929:1: rule__LibraryTask__Group__4__Impl : ( ( rule__LibraryTask__Group_4__0 )? ) ;
    public final void rule__LibraryTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2933:1: ( ( ( rule__LibraryTask__Group_4__0 )? ) )
            // InternalOptimind.g:2934:1: ( ( rule__LibraryTask__Group_4__0 )? )
            {
            // InternalOptimind.g:2934:1: ( ( rule__LibraryTask__Group_4__0 )? )
            // InternalOptimind.g:2935:2: ( rule__LibraryTask__Group_4__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2936:2: ( rule__LibraryTask__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptimind.g:2936:3: rule__LibraryTask__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__4__Impl"


    // $ANTLR start "rule__LibraryTask__Group__5"
    // InternalOptimind.g:2944:1: rule__LibraryTask__Group__5 : rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 ;
    public final void rule__LibraryTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2948:1: ( rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 )
            // InternalOptimind.g:2949:2: rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__LibraryTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__5"


    // $ANTLR start "rule__LibraryTask__Group__5__Impl"
    // InternalOptimind.g:2956:1: rule__LibraryTask__Group__5__Impl : ( ( rule__LibraryTask__Group_5__0 )? ) ;
    public final void rule__LibraryTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2960:1: ( ( ( rule__LibraryTask__Group_5__0 )? ) )
            // InternalOptimind.g:2961:1: ( ( rule__LibraryTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2961:1: ( ( rule__LibraryTask__Group_5__0 )? )
            // InternalOptimind.g:2962:2: ( rule__LibraryTask__Group_5__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2963:2: ( rule__LibraryTask__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptimind.g:2963:3: rule__LibraryTask__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryTask__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__5__Impl"


    // $ANTLR start "rule__LibraryTask__Group__6"
    // InternalOptimind.g:2971:1: rule__LibraryTask__Group__6 : rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 ;
    public final void rule__LibraryTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2975:1: ( rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 )
            // InternalOptimind.g:2976:2: rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__LibraryTask__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__6"


    // $ANTLR start "rule__LibraryTask__Group__6__Impl"
    // InternalOptimind.g:2983:1: rule__LibraryTask__Group__6__Impl : ( ( rule__LibraryTask__Group_6__0 )? ) ;
    public final void rule__LibraryTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2987:1: ( ( ( rule__LibraryTask__Group_6__0 )? ) )
            // InternalOptimind.g:2988:1: ( ( rule__LibraryTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2988:1: ( ( rule__LibraryTask__Group_6__0 )? )
            // InternalOptimind.g:2989:2: ( rule__LibraryTask__Group_6__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2990:2: ( rule__LibraryTask__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptimind.g:2990:3: rule__LibraryTask__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryTask__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__6__Impl"


    // $ANTLR start "rule__LibraryTask__Group__7"
    // InternalOptimind.g:2998:1: rule__LibraryTask__Group__7 : rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 ;
    public final void rule__LibraryTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3002:1: ( rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 )
            // InternalOptimind.g:3003:2: rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__LibraryTask__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__7"


    // $ANTLR start "rule__LibraryTask__Group__7__Impl"
    // InternalOptimind.g:3010:1: rule__LibraryTask__Group__7__Impl : ( ( rule__LibraryTask__Group_7__0 )? ) ;
    public final void rule__LibraryTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3014:1: ( ( ( rule__LibraryTask__Group_7__0 )? ) )
            // InternalOptimind.g:3015:1: ( ( rule__LibraryTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3015:1: ( ( rule__LibraryTask__Group_7__0 )? )
            // InternalOptimind.g:3016:2: ( rule__LibraryTask__Group_7__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3017:2: ( rule__LibraryTask__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptimind.g:3017:3: rule__LibraryTask__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryTask__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__7__Impl"


    // $ANTLR start "rule__LibraryTask__Group__8"
    // InternalOptimind.g:3025:1: rule__LibraryTask__Group__8 : rule__LibraryTask__Group__8__Impl ;
    public final void rule__LibraryTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3029:1: ( rule__LibraryTask__Group__8__Impl )
            // InternalOptimind.g:3030:2: rule__LibraryTask__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__8"


    // $ANTLR start "rule__LibraryTask__Group__8__Impl"
    // InternalOptimind.g:3036:1: rule__LibraryTask__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3040:1: ( ( '}' ) )
            // InternalOptimind.g:3041:1: ( '}' )
            {
            // InternalOptimind.g:3041:1: ( '}' )
            // InternalOptimind.g:3042:2: '}'
            {
             before(grammarAccess.getLibraryTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLibraryTaskAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group__8__Impl"


    // $ANTLR start "rule__LibraryTask__Group_4__0"
    // InternalOptimind.g:3052:1: rule__LibraryTask__Group_4__0 : rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 ;
    public final void rule__LibraryTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3056:1: ( rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 )
            // InternalOptimind.g:3057:2: rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__LibraryTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_4__0"


    // $ANTLR start "rule__LibraryTask__Group_4__0__Impl"
    // InternalOptimind.g:3064:1: rule__LibraryTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__LibraryTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3068:1: ( ( 'status' ) )
            // InternalOptimind.g:3069:1: ( 'status' )
            {
            // InternalOptimind.g:3069:1: ( 'status' )
            // InternalOptimind.g:3070:2: 'status'
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_4__0__Impl"


    // $ANTLR start "rule__LibraryTask__Group_4__1"
    // InternalOptimind.g:3079:1: rule__LibraryTask__Group_4__1 : rule__LibraryTask__Group_4__1__Impl ;
    public final void rule__LibraryTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3083:1: ( rule__LibraryTask__Group_4__1__Impl )
            // InternalOptimind.g:3084:2: rule__LibraryTask__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_4__1"


    // $ANTLR start "rule__LibraryTask__Group_4__1__Impl"
    // InternalOptimind.g:3090:1: rule__LibraryTask__Group_4__1__Impl : ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) ;
    public final void rule__LibraryTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3094:1: ( ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3095:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3095:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3096:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3097:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3097:3: rule__LibraryTask__StatusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__StatusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_4__1__Impl"


    // $ANTLR start "rule__LibraryTask__Group_5__0"
    // InternalOptimind.g:3106:1: rule__LibraryTask__Group_5__0 : rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 ;
    public final void rule__LibraryTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3110:1: ( rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 )
            // InternalOptimind.g:3111:2: rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__LibraryTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_5__0"


    // $ANTLR start "rule__LibraryTask__Group_5__0__Impl"
    // InternalOptimind.g:3118:1: rule__LibraryTask__Group_5__0__Impl : ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) ;
    public final void rule__LibraryTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3122:1: ( ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3123:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3123:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3124:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3125:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3125:3: rule__LibraryTask__InputsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__InputsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_5__0__Impl"


    // $ANTLR start "rule__LibraryTask__Group_5__1"
    // InternalOptimind.g:3133:1: rule__LibraryTask__Group_5__1 : rule__LibraryTask__Group_5__1__Impl ;
    public final void rule__LibraryTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3137:1: ( rule__LibraryTask__Group_5__1__Impl )
            // InternalOptimind.g:3138:2: rule__LibraryTask__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_5__1"


    // $ANTLR start "rule__LibraryTask__Group_5__1__Impl"
    // InternalOptimind.g:3144:1: rule__LibraryTask__Group_5__1__Impl : ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) ;
    public final void rule__LibraryTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3148:1: ( ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3149:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3149:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3150:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3151:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=43 && LA27_0<=44)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOptimind.g:3151:3: rule__LibraryTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__LibraryTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_5__1__Impl"


    // $ANTLR start "rule__LibraryTask__Group_6__0"
    // InternalOptimind.g:3160:1: rule__LibraryTask__Group_6__0 : rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 ;
    public final void rule__LibraryTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3164:1: ( rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 )
            // InternalOptimind.g:3165:2: rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__LibraryTask__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_6__0"


    // $ANTLR start "rule__LibraryTask__Group_6__0__Impl"
    // InternalOptimind.g:3172:1: rule__LibraryTask__Group_6__0__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__LibraryTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3176:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3177:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3177:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3178:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3179:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3179:3: rule__LibraryTask__OutputsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__OutputsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_6__0__Impl"


    // $ANTLR start "rule__LibraryTask__Group_6__1"
    // InternalOptimind.g:3187:1: rule__LibraryTask__Group_6__1 : rule__LibraryTask__Group_6__1__Impl ;
    public final void rule__LibraryTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3191:1: ( rule__LibraryTask__Group_6__1__Impl )
            // InternalOptimind.g:3192:2: rule__LibraryTask__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_6__1"


    // $ANTLR start "rule__LibraryTask__Group_6__1__Impl"
    // InternalOptimind.g:3198:1: rule__LibraryTask__Group_6__1__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__LibraryTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3202:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3203:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3203:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3204:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3205:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOptimind.g:3205:3: rule__LibraryTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_6__1__Impl"


    // $ANTLR start "rule__LibraryTask__Group_7__0"
    // InternalOptimind.g:3214:1: rule__LibraryTask__Group_7__0 : rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 ;
    public final void rule__LibraryTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3218:1: ( rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 )
            // InternalOptimind.g:3219:2: rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__LibraryTask__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_7__0"


    // $ANTLR start "rule__LibraryTask__Group_7__0__Impl"
    // InternalOptimind.g:3226:1: rule__LibraryTask__Group_7__0__Impl : ( 'Libraryfunction' ) ;
    public final void rule__LibraryTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3230:1: ( ( 'Libraryfunction' ) )
            // InternalOptimind.g:3231:1: ( 'Libraryfunction' )
            {
            // InternalOptimind.g:3231:1: ( 'Libraryfunction' )
            // InternalOptimind.g:3232:2: 'Libraryfunction'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_7__0__Impl"


    // $ANTLR start "rule__LibraryTask__Group_7__1"
    // InternalOptimind.g:3241:1: rule__LibraryTask__Group_7__1 : rule__LibraryTask__Group_7__1__Impl ;
    public final void rule__LibraryTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3245:1: ( rule__LibraryTask__Group_7__1__Impl )
            // InternalOptimind.g:3246:2: rule__LibraryTask__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_7__1"


    // $ANTLR start "rule__LibraryTask__Group_7__1__Impl"
    // InternalOptimind.g:3252:1: rule__LibraryTask__Group_7__1__Impl : ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) ;
    public final void rule__LibraryTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3256:1: ( ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) )
            // InternalOptimind.g:3257:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            {
            // InternalOptimind.g:3257:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            // InternalOptimind.g:3258:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1()); 
            // InternalOptimind.g:3259:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            // InternalOptimind.g:3259:3: rule__LibraryTask__LibraryfunctionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LibraryTask__LibraryfunctionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__Group_7__1__Impl"


    // $ANTLR start "rule__CustomTask__Group__0"
    // InternalOptimind.g:3268:1: rule__CustomTask__Group__0 : rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 ;
    public final void rule__CustomTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3272:1: ( rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 )
            // InternalOptimind.g:3273:2: rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__CustomTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__0"


    // $ANTLR start "rule__CustomTask__Group__0__Impl"
    // InternalOptimind.g:3280:1: rule__CustomTask__Group__0__Impl : ( () ) ;
    public final void rule__CustomTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3284:1: ( ( () ) )
            // InternalOptimind.g:3285:1: ( () )
            {
            // InternalOptimind.g:3285:1: ( () )
            // InternalOptimind.g:3286:2: ()
            {
             before(grammarAccess.getCustomTaskAccess().getCustomTaskAction_0()); 
            // InternalOptimind.g:3287:2: ()
            // InternalOptimind.g:3287:3: 
            {
            }

             after(grammarAccess.getCustomTaskAccess().getCustomTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__0__Impl"


    // $ANTLR start "rule__CustomTask__Group__1"
    // InternalOptimind.g:3295:1: rule__CustomTask__Group__1 : rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 ;
    public final void rule__CustomTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3299:1: ( rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 )
            // InternalOptimind.g:3300:2: rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CustomTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__1"


    // $ANTLR start "rule__CustomTask__Group__1__Impl"
    // InternalOptimind.g:3307:1: rule__CustomTask__Group__1__Impl : ( 'Task' ) ;
    public final void rule__CustomTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3311:1: ( ( 'Task' ) )
            // InternalOptimind.g:3312:1: ( 'Task' )
            {
            // InternalOptimind.g:3312:1: ( 'Task' )
            // InternalOptimind.g:3313:2: 'Task'
            {
             before(grammarAccess.getCustomTaskAccess().getTaskKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCustomTaskAccess().getTaskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__1__Impl"


    // $ANTLR start "rule__CustomTask__Group__2"
    // InternalOptimind.g:3322:1: rule__CustomTask__Group__2 : rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 ;
    public final void rule__CustomTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3326:1: ( rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 )
            // InternalOptimind.g:3327:2: rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CustomTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__2"


    // $ANTLR start "rule__CustomTask__Group__2__Impl"
    // InternalOptimind.g:3334:1: rule__CustomTask__Group__2__Impl : ( ( rule__CustomTask__NameAssignment_2 ) ) ;
    public final void rule__CustomTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3338:1: ( ( ( rule__CustomTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:3339:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3339:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            // InternalOptimind.g:3340:2: ( rule__CustomTask__NameAssignment_2 )
            {
             before(grammarAccess.getCustomTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3341:2: ( rule__CustomTask__NameAssignment_2 )
            // InternalOptimind.g:3341:3: rule__CustomTask__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__2__Impl"


    // $ANTLR start "rule__CustomTask__Group__3"
    // InternalOptimind.g:3349:1: rule__CustomTask__Group__3 : rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 ;
    public final void rule__CustomTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3353:1: ( rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 )
            // InternalOptimind.g:3354:2: rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__CustomTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__3"


    // $ANTLR start "rule__CustomTask__Group__3__Impl"
    // InternalOptimind.g:3361:1: rule__CustomTask__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3365:1: ( ( '{' ) )
            // InternalOptimind.g:3366:1: ( '{' )
            {
            // InternalOptimind.g:3366:1: ( '{' )
            // InternalOptimind.g:3367:2: '{'
            {
             before(grammarAccess.getCustomTaskAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCustomTaskAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__3__Impl"


    // $ANTLR start "rule__CustomTask__Group__4"
    // InternalOptimind.g:3376:1: rule__CustomTask__Group__4 : rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 ;
    public final void rule__CustomTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3380:1: ( rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 )
            // InternalOptimind.g:3381:2: rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__CustomTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__4"


    // $ANTLR start "rule__CustomTask__Group__4__Impl"
    // InternalOptimind.g:3388:1: rule__CustomTask__Group__4__Impl : ( ( rule__CustomTask__Group_4__0 )? ) ;
    public final void rule__CustomTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3392:1: ( ( ( rule__CustomTask__Group_4__0 )? ) )
            // InternalOptimind.g:3393:1: ( ( rule__CustomTask__Group_4__0 )? )
            {
            // InternalOptimind.g:3393:1: ( ( rule__CustomTask__Group_4__0 )? )
            // InternalOptimind.g:3394:2: ( rule__CustomTask__Group_4__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_4()); 
            // InternalOptimind.g:3395:2: ( rule__CustomTask__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimind.g:3395:3: rule__CustomTask__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__4__Impl"


    // $ANTLR start "rule__CustomTask__Group__5"
    // InternalOptimind.g:3403:1: rule__CustomTask__Group__5 : rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 ;
    public final void rule__CustomTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3407:1: ( rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 )
            // InternalOptimind.g:3408:2: rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__CustomTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__5"


    // $ANTLR start "rule__CustomTask__Group__5__Impl"
    // InternalOptimind.g:3415:1: rule__CustomTask__Group__5__Impl : ( ( rule__CustomTask__Group_5__0 )? ) ;
    public final void rule__CustomTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3419:1: ( ( ( rule__CustomTask__Group_5__0 )? ) )
            // InternalOptimind.g:3420:1: ( ( rule__CustomTask__Group_5__0 )? )
            {
            // InternalOptimind.g:3420:1: ( ( rule__CustomTask__Group_5__0 )? )
            // InternalOptimind.g:3421:2: ( rule__CustomTask__Group_5__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_5()); 
            // InternalOptimind.g:3422:2: ( rule__CustomTask__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=43 && LA30_0<=44)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimind.g:3422:3: rule__CustomTask__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTask__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__5__Impl"


    // $ANTLR start "rule__CustomTask__Group__6"
    // InternalOptimind.g:3430:1: rule__CustomTask__Group__6 : rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 ;
    public final void rule__CustomTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3434:1: ( rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 )
            // InternalOptimind.g:3435:2: rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__CustomTask__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__6"


    // $ANTLR start "rule__CustomTask__Group__6__Impl"
    // InternalOptimind.g:3442:1: rule__CustomTask__Group__6__Impl : ( ( rule__CustomTask__Group_6__0 )? ) ;
    public final void rule__CustomTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3446:1: ( ( ( rule__CustomTask__Group_6__0 )? ) )
            // InternalOptimind.g:3447:1: ( ( rule__CustomTask__Group_6__0 )? )
            {
            // InternalOptimind.g:3447:1: ( ( rule__CustomTask__Group_6__0 )? )
            // InternalOptimind.g:3448:2: ( rule__CustomTask__Group_6__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_6()); 
            // InternalOptimind.g:3449:2: ( rule__CustomTask__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOptimind.g:3449:3: rule__CustomTask__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTask__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__6__Impl"


    // $ANTLR start "rule__CustomTask__Group__7"
    // InternalOptimind.g:3457:1: rule__CustomTask__Group__7 : rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 ;
    public final void rule__CustomTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3461:1: ( rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 )
            // InternalOptimind.g:3462:2: rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__CustomTask__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__7"


    // $ANTLR start "rule__CustomTask__Group__7__Impl"
    // InternalOptimind.g:3469:1: rule__CustomTask__Group__7__Impl : ( ( rule__CustomTask__Group_7__0 )? ) ;
    public final void rule__CustomTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3473:1: ( ( ( rule__CustomTask__Group_7__0 )? ) )
            // InternalOptimind.g:3474:1: ( ( rule__CustomTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3474:1: ( ( rule__CustomTask__Group_7__0 )? )
            // InternalOptimind.g:3475:2: ( rule__CustomTask__Group_7__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3476:2: ( rule__CustomTask__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimind.g:3476:3: rule__CustomTask__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTask__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTaskAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__7__Impl"


    // $ANTLR start "rule__CustomTask__Group__8"
    // InternalOptimind.g:3484:1: rule__CustomTask__Group__8 : rule__CustomTask__Group__8__Impl ;
    public final void rule__CustomTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3488:1: ( rule__CustomTask__Group__8__Impl )
            // InternalOptimind.g:3489:2: rule__CustomTask__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__8"


    // $ANTLR start "rule__CustomTask__Group__8__Impl"
    // InternalOptimind.g:3495:1: rule__CustomTask__Group__8__Impl : ( '}' ) ;
    public final void rule__CustomTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3499:1: ( ( '}' ) )
            // InternalOptimind.g:3500:1: ( '}' )
            {
            // InternalOptimind.g:3500:1: ( '}' )
            // InternalOptimind.g:3501:2: '}'
            {
             before(grammarAccess.getCustomTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCustomTaskAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group__8__Impl"


    // $ANTLR start "rule__CustomTask__Group_4__0"
    // InternalOptimind.g:3511:1: rule__CustomTask__Group_4__0 : rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 ;
    public final void rule__CustomTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3515:1: ( rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 )
            // InternalOptimind.g:3516:2: rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__CustomTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_4__0"


    // $ANTLR start "rule__CustomTask__Group_4__0__Impl"
    // InternalOptimind.g:3523:1: rule__CustomTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__CustomTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3527:1: ( ( 'status' ) )
            // InternalOptimind.g:3528:1: ( 'status' )
            {
            // InternalOptimind.g:3528:1: ( 'status' )
            // InternalOptimind.g:3529:2: 'status'
            {
             before(grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_4__0__Impl"


    // $ANTLR start "rule__CustomTask__Group_4__1"
    // InternalOptimind.g:3538:1: rule__CustomTask__Group_4__1 : rule__CustomTask__Group_4__1__Impl ;
    public final void rule__CustomTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3542:1: ( rule__CustomTask__Group_4__1__Impl )
            // InternalOptimind.g:3543:2: rule__CustomTask__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_4__1"


    // $ANTLR start "rule__CustomTask__Group_4__1__Impl"
    // InternalOptimind.g:3549:1: rule__CustomTask__Group_4__1__Impl : ( ( rule__CustomTask__StatusAssignment_4_1 ) ) ;
    public final void rule__CustomTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3553:1: ( ( ( rule__CustomTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3554:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3554:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3555:2: ( rule__CustomTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3556:2: ( rule__CustomTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3556:3: rule__CustomTask__StatusAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__StatusAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_4__1__Impl"


    // $ANTLR start "rule__CustomTask__Group_5__0"
    // InternalOptimind.g:3565:1: rule__CustomTask__Group_5__0 : rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 ;
    public final void rule__CustomTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3569:1: ( rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 )
            // InternalOptimind.g:3570:2: rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__CustomTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_5__0"


    // $ANTLR start "rule__CustomTask__Group_5__0__Impl"
    // InternalOptimind.g:3577:1: rule__CustomTask__Group_5__0__Impl : ( ( rule__CustomTask__InputsAssignment_5_0 ) ) ;
    public final void rule__CustomTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3581:1: ( ( ( rule__CustomTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3582:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3582:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3583:2: ( rule__CustomTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3584:2: ( rule__CustomTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3584:3: rule__CustomTask__InputsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__InputsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_5__0__Impl"


    // $ANTLR start "rule__CustomTask__Group_5__1"
    // InternalOptimind.g:3592:1: rule__CustomTask__Group_5__1 : rule__CustomTask__Group_5__1__Impl ;
    public final void rule__CustomTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3596:1: ( rule__CustomTask__Group_5__1__Impl )
            // InternalOptimind.g:3597:2: rule__CustomTask__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_5__1"


    // $ANTLR start "rule__CustomTask__Group_5__1__Impl"
    // InternalOptimind.g:3603:1: rule__CustomTask__Group_5__1__Impl : ( ( rule__CustomTask__InputsAssignment_5_1 )* ) ;
    public final void rule__CustomTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3607:1: ( ( ( rule__CustomTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3608:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3608:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3609:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3610:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=43 && LA33_0<=44)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOptimind.g:3610:3: rule__CustomTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CustomTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_5__1__Impl"


    // $ANTLR start "rule__CustomTask__Group_6__0"
    // InternalOptimind.g:3619:1: rule__CustomTask__Group_6__0 : rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 ;
    public final void rule__CustomTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3623:1: ( rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 )
            // InternalOptimind.g:3624:2: rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__CustomTask__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_6__0"


    // $ANTLR start "rule__CustomTask__Group_6__0__Impl"
    // InternalOptimind.g:3631:1: rule__CustomTask__Group_6__0__Impl : ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__CustomTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3635:1: ( ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3636:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3636:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3637:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3638:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3638:3: rule__CustomTask__OutputsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__OutputsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_6__0__Impl"


    // $ANTLR start "rule__CustomTask__Group_6__1"
    // InternalOptimind.g:3646:1: rule__CustomTask__Group_6__1 : rule__CustomTask__Group_6__1__Impl ;
    public final void rule__CustomTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3650:1: ( rule__CustomTask__Group_6__1__Impl )
            // InternalOptimind.g:3651:2: rule__CustomTask__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_6__1"


    // $ANTLR start "rule__CustomTask__Group_6__1__Impl"
    // InternalOptimind.g:3657:1: rule__CustomTask__Group_6__1__Impl : ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__CustomTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3661:1: ( ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3662:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3662:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3663:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3664:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOptimind.g:3664:3: rule__CustomTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__CustomTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_6__1__Impl"


    // $ANTLR start "rule__CustomTask__Group_7__0"
    // InternalOptimind.g:3673:1: rule__CustomTask__Group_7__0 : rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 ;
    public final void rule__CustomTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3677:1: ( rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 )
            // InternalOptimind.g:3678:2: rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__CustomTask__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_7__0"


    // $ANTLR start "rule__CustomTask__Group_7__0__Impl"
    // InternalOptimind.g:3685:1: rule__CustomTask__Group_7__0__Impl : ( 'runner' ) ;
    public final void rule__CustomTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3689:1: ( ( 'runner' ) )
            // InternalOptimind.g:3690:1: ( 'runner' )
            {
            // InternalOptimind.g:3690:1: ( 'runner' )
            // InternalOptimind.g:3691:2: 'runner'
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_7__0__Impl"


    // $ANTLR start "rule__CustomTask__Group_7__1"
    // InternalOptimind.g:3700:1: rule__CustomTask__Group_7__1 : rule__CustomTask__Group_7__1__Impl ;
    public final void rule__CustomTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3704:1: ( rule__CustomTask__Group_7__1__Impl )
            // InternalOptimind.g:3705:2: rule__CustomTask__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_7__1"


    // $ANTLR start "rule__CustomTask__Group_7__1__Impl"
    // InternalOptimind.g:3711:1: rule__CustomTask__Group_7__1__Impl : ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) ;
    public final void rule__CustomTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3715:1: ( ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) )
            // InternalOptimind.g:3716:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            {
            // InternalOptimind.g:3716:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            // InternalOptimind.g:3717:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1()); 
            // InternalOptimind.g:3718:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            // InternalOptimind.g:3718:3: rule__CustomTask__RunnerAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTask__RunnerAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__Group_7__1__Impl"


    // $ANTLR start "rule__Setter__Group__0"
    // InternalOptimind.g:3727:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3731:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // InternalOptimind.g:3732:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Setter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__0"


    // $ANTLR start "rule__Setter__Group__0__Impl"
    // InternalOptimind.g:3739:1: rule__Setter__Group__0__Impl : ( () ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3743:1: ( ( () ) )
            // InternalOptimind.g:3744:1: ( () )
            {
            // InternalOptimind.g:3744:1: ( () )
            // InternalOptimind.g:3745:2: ()
            {
             before(grammarAccess.getSetterAccess().getSetterAction_0()); 
            // InternalOptimind.g:3746:2: ()
            // InternalOptimind.g:3746:3: 
            {
            }

             after(grammarAccess.getSetterAccess().getSetterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__0__Impl"


    // $ANTLR start "rule__Setter__Group__1"
    // InternalOptimind.g:3754:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3758:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // InternalOptimind.g:3759:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Setter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__1"


    // $ANTLR start "rule__Setter__Group__1__Impl"
    // InternalOptimind.g:3766:1: rule__Setter__Group__1__Impl : ( 'Setter' ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3770:1: ( ( 'Setter' ) )
            // InternalOptimind.g:3771:1: ( 'Setter' )
            {
            // InternalOptimind.g:3771:1: ( 'Setter' )
            // InternalOptimind.g:3772:2: 'Setter'
            {
             before(grammarAccess.getSetterAccess().getSetterKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSetterAccess().getSetterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__1__Impl"


    // $ANTLR start "rule__Setter__Group__2"
    // InternalOptimind.g:3781:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3785:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // InternalOptimind.g:3786:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Setter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__2"


    // $ANTLR start "rule__Setter__Group__2__Impl"
    // InternalOptimind.g:3793:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__NameAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3797:1: ( ( ( rule__Setter__NameAssignment_2 ) ) )
            // InternalOptimind.g:3798:1: ( ( rule__Setter__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3798:1: ( ( rule__Setter__NameAssignment_2 ) )
            // InternalOptimind.g:3799:2: ( rule__Setter__NameAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3800:2: ( rule__Setter__NameAssignment_2 )
            // InternalOptimind.g:3800:3: rule__Setter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Setter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__2__Impl"


    // $ANTLR start "rule__Setter__Group__3"
    // InternalOptimind.g:3808:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl rule__Setter__Group__4 ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3812:1: ( rule__Setter__Group__3__Impl rule__Setter__Group__4 )
            // InternalOptimind.g:3813:2: rule__Setter__Group__3__Impl rule__Setter__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Setter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__3"


    // $ANTLR start "rule__Setter__Group__3__Impl"
    // InternalOptimind.g:3820:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__Group_3__0 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3824:1: ( ( ( rule__Setter__Group_3__0 )? ) )
            // InternalOptimind.g:3825:1: ( ( rule__Setter__Group_3__0 )? )
            {
            // InternalOptimind.g:3825:1: ( ( rule__Setter__Group_3__0 )? )
            // InternalOptimind.g:3826:2: ( rule__Setter__Group_3__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_3()); 
            // InternalOptimind.g:3827:2: ( rule__Setter__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==22) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimind.g:3827:3: rule__Setter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Setter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__3__Impl"


    // $ANTLR start "rule__Setter__Group__4"
    // InternalOptimind.g:3835:1: rule__Setter__Group__4 : rule__Setter__Group__4__Impl ;
    public final void rule__Setter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3839:1: ( rule__Setter__Group__4__Impl )
            // InternalOptimind.g:3840:2: rule__Setter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setter__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__4"


    // $ANTLR start "rule__Setter__Group__4__Impl"
    // InternalOptimind.g:3846:1: rule__Setter__Group__4__Impl : ( ( rule__Setter__Group_4__0 )? ) ;
    public final void rule__Setter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3850:1: ( ( ( rule__Setter__Group_4__0 )? ) )
            // InternalOptimind.g:3851:1: ( ( rule__Setter__Group_4__0 )? )
            {
            // InternalOptimind.g:3851:1: ( ( rule__Setter__Group_4__0 )? )
            // InternalOptimind.g:3852:2: ( rule__Setter__Group_4__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_4()); 
            // InternalOptimind.g:3853:2: ( rule__Setter__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:3853:3: rule__Setter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Setter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group__4__Impl"


    // $ANTLR start "rule__Setter__Group_3__0"
    // InternalOptimind.g:3862:1: rule__Setter__Group_3__0 : rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 ;
    public final void rule__Setter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3866:1: ( rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 )
            // InternalOptimind.g:3867:2: rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Setter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_3__0"


    // $ANTLR start "rule__Setter__Group_3__0__Impl"
    // InternalOptimind.g:3874:1: rule__Setter__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Setter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3878:1: ( ( 'type' ) )
            // InternalOptimind.g:3879:1: ( 'type' )
            {
            // InternalOptimind.g:3879:1: ( 'type' )
            // InternalOptimind.g:3880:2: 'type'
            {
             before(grammarAccess.getSetterAccess().getTypeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSetterAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_3__0__Impl"


    // $ANTLR start "rule__Setter__Group_3__1"
    // InternalOptimind.g:3889:1: rule__Setter__Group_3__1 : rule__Setter__Group_3__1__Impl ;
    public final void rule__Setter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3893:1: ( rule__Setter__Group_3__1__Impl )
            // InternalOptimind.g:3894:2: rule__Setter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_3__1"


    // $ANTLR start "rule__Setter__Group_3__1__Impl"
    // InternalOptimind.g:3900:1: rule__Setter__Group_3__1__Impl : ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Setter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3904:1: ( ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:3905:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:3905:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:3906:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:3907:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:3907:3: rule__Setter__TypeAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Setter__TypeAsStringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_3__1__Impl"


    // $ANTLR start "rule__Setter__Group_4__0"
    // InternalOptimind.g:3916:1: rule__Setter__Group_4__0 : rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 ;
    public final void rule__Setter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3920:1: ( rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 )
            // InternalOptimind.g:3921:2: rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Setter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_4__0"


    // $ANTLR start "rule__Setter__Group_4__0__Impl"
    // InternalOptimind.g:3928:1: rule__Setter__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Setter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3932:1: ( ( 'value' ) )
            // InternalOptimind.g:3933:1: ( 'value' )
            {
            // InternalOptimind.g:3933:1: ( 'value' )
            // InternalOptimind.g:3934:2: 'value'
            {
             before(grammarAccess.getSetterAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSetterAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_4__0__Impl"


    // $ANTLR start "rule__Setter__Group_4__1"
    // InternalOptimind.g:3943:1: rule__Setter__Group_4__1 : rule__Setter__Group_4__1__Impl ;
    public final void rule__Setter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3947:1: ( rule__Setter__Group_4__1__Impl )
            // InternalOptimind.g:3948:2: rule__Setter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_4__1"


    // $ANTLR start "rule__Setter__Group_4__1__Impl"
    // InternalOptimind.g:3954:1: rule__Setter__Group_4__1__Impl : ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Setter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3958:1: ( ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:3959:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:3959:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:3960:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:3961:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:3961:3: rule__Setter__ValueAsStringAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Setter__ValueAsStringAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__Group_4__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // InternalOptimind.g:3970:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3974:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalOptimind.g:3975:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // InternalOptimind.g:3982:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3986:1: ( ( () ) )
            // InternalOptimind.g:3987:1: ( () )
            {
            // InternalOptimind.g:3987:1: ( () )
            // InternalOptimind.g:3988:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalOptimind.g:3989:2: ()
            // InternalOptimind.g:3989:3: 
            {
            }

             after(grammarAccess.getConnectionAccess().getConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // InternalOptimind.g:3997:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4001:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalOptimind.g:4002:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // InternalOptimind.g:4009:1: rule__Connection__Group__1__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4013:1: ( ( 'Connection' ) )
            // InternalOptimind.g:4014:1: ( 'Connection' )
            {
            // InternalOptimind.g:4014:1: ( 'Connection' )
            // InternalOptimind.g:4015:2: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // InternalOptimind.g:4024:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4028:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalOptimind.g:4029:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // InternalOptimind.g:4036:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__NameAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4040:1: ( ( ( rule__Connection__NameAssignment_2 ) ) )
            // InternalOptimind.g:4041:1: ( ( rule__Connection__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4041:1: ( ( rule__Connection__NameAssignment_2 ) )
            // InternalOptimind.g:4042:2: ( rule__Connection__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4043:2: ( rule__Connection__NameAssignment_2 )
            // InternalOptimind.g:4043:3: rule__Connection__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // InternalOptimind.g:4051:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4055:1: ( rule__Connection__Group__3__Impl )
            // InternalOptimind.g:4056:2: rule__Connection__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // InternalOptimind.g:4062:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4066:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // InternalOptimind.g:4067:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // InternalOptimind.g:4067:1: ( ( rule__Connection__Group_3__0 )? )
            // InternalOptimind.g:4068:2: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // InternalOptimind.g:4069:2: ( rule__Connection__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimind.g:4069:3: rule__Connection__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group_3__0"
    // InternalOptimind.g:4078:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4082:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // InternalOptimind.g:4083:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Connection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__0"


    // $ANTLR start "rule__Connection__Group_3__0__Impl"
    // InternalOptimind.g:4090:1: rule__Connection__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4094:1: ( ( 'to' ) )
            // InternalOptimind.g:4095:1: ( 'to' )
            {
            // InternalOptimind.g:4095:1: ( 'to' )
            // InternalOptimind.g:4096:2: 'to'
            {
             before(grammarAccess.getConnectionAccess().getToKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getToKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__0__Impl"


    // $ANTLR start "rule__Connection__Group_3__1"
    // InternalOptimind.g:4105:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4109:1: ( rule__Connection__Group_3__1__Impl )
            // InternalOptimind.g:4110:2: rule__Connection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__1"


    // $ANTLR start "rule__Connection__Group_3__1__Impl"
    // InternalOptimind.g:4116:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4120:1: ( ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) )
            // InternalOptimind.g:4121:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            {
            // InternalOptimind.g:4121:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            // InternalOptimind.g:4122:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1()); 
            // InternalOptimind.g:4123:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            // InternalOptimind.g:4123:3: rule__Connection__TaskoutputAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Connection__TaskoutputAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__1__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__0"
    // InternalOptimind.g:4132:1: rule__LibraryFunction__Group__0 : rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 ;
    public final void rule__LibraryFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4136:1: ( rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 )
            // InternalOptimind.g:4137:2: rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__LibraryFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__0"


    // $ANTLR start "rule__LibraryFunction__Group__0__Impl"
    // InternalOptimind.g:4144:1: rule__LibraryFunction__Group__0__Impl : ( () ) ;
    public final void rule__LibraryFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4148:1: ( ( () ) )
            // InternalOptimind.g:4149:1: ( () )
            {
            // InternalOptimind.g:4149:1: ( () )
            // InternalOptimind.g:4150:2: ()
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0()); 
            // InternalOptimind.g:4151:2: ()
            // InternalOptimind.g:4151:3: 
            {
            }

             after(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__0__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__1"
    // InternalOptimind.g:4159:1: rule__LibraryFunction__Group__1 : rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 ;
    public final void rule__LibraryFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4163:1: ( rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 )
            // InternalOptimind.g:4164:2: rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LibraryFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__1"


    // $ANTLR start "rule__LibraryFunction__Group__1__Impl"
    // InternalOptimind.g:4171:1: rule__LibraryFunction__Group__1__Impl : ( 'LibraryFunction' ) ;
    public final void rule__LibraryFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4175:1: ( ( 'LibraryFunction' ) )
            // InternalOptimind.g:4176:1: ( 'LibraryFunction' )
            {
            // InternalOptimind.g:4176:1: ( 'LibraryFunction' )
            // InternalOptimind.g:4177:2: 'LibraryFunction'
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__1__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__2"
    // InternalOptimind.g:4186:1: rule__LibraryFunction__Group__2 : rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 ;
    public final void rule__LibraryFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4190:1: ( rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 )
            // InternalOptimind.g:4191:2: rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__LibraryFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__2"


    // $ANTLR start "rule__LibraryFunction__Group__2__Impl"
    // InternalOptimind.g:4198:1: rule__LibraryFunction__Group__2__Impl : ( ( rule__LibraryFunction__NameAssignment_2 ) ) ;
    public final void rule__LibraryFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4202:1: ( ( ( rule__LibraryFunction__NameAssignment_2 ) ) )
            // InternalOptimind.g:4203:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4203:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            // InternalOptimind.g:4204:2: ( rule__LibraryFunction__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4205:2: ( rule__LibraryFunction__NameAssignment_2 )
            // InternalOptimind.g:4205:3: rule__LibraryFunction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__2__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__3"
    // InternalOptimind.g:4213:1: rule__LibraryFunction__Group__3 : rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 ;
    public final void rule__LibraryFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4217:1: ( rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 )
            // InternalOptimind.g:4218:2: rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__LibraryFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__3"


    // $ANTLR start "rule__LibraryFunction__Group__3__Impl"
    // InternalOptimind.g:4225:1: rule__LibraryFunction__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4229:1: ( ( '{' ) )
            // InternalOptimind.g:4230:1: ( '{' )
            {
            // InternalOptimind.g:4230:1: ( '{' )
            // InternalOptimind.g:4231:2: '{'
            {
             before(grammarAccess.getLibraryFunctionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryFunctionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__3__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__4"
    // InternalOptimind.g:4240:1: rule__LibraryFunction__Group__4 : rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 ;
    public final void rule__LibraryFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4244:1: ( rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 )
            // InternalOptimind.g:4245:2: rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__LibraryFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__4"


    // $ANTLR start "rule__LibraryFunction__Group__4__Impl"
    // InternalOptimind.g:4252:1: rule__LibraryFunction__Group__4__Impl : ( 'function' ) ;
    public final void rule__LibraryFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4256:1: ( ( 'function' ) )
            // InternalOptimind.g:4257:1: ( 'function' )
            {
            // InternalOptimind.g:4257:1: ( 'function' )
            // InternalOptimind.g:4258:2: 'function'
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__4__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__5"
    // InternalOptimind.g:4267:1: rule__LibraryFunction__Group__5 : rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 ;
    public final void rule__LibraryFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4271:1: ( rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 )
            // InternalOptimind.g:4272:2: rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__LibraryFunction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__5"


    // $ANTLR start "rule__LibraryFunction__Group__5__Impl"
    // InternalOptimind.g:4279:1: rule__LibraryFunction__Group__5__Impl : ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) ;
    public final void rule__LibraryFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4283:1: ( ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) )
            // InternalOptimind.g:4284:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            {
            // InternalOptimind.g:4284:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            // InternalOptimind.g:4285:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5()); 
            // InternalOptimind.g:4286:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            // InternalOptimind.g:4286:3: rule__LibraryFunction__FunctionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__FunctionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__5__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__6"
    // InternalOptimind.g:4294:1: rule__LibraryFunction__Group__6 : rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 ;
    public final void rule__LibraryFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4298:1: ( rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 )
            // InternalOptimind.g:4299:2: rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__LibraryFunction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__6"


    // $ANTLR start "rule__LibraryFunction__Group__6__Impl"
    // InternalOptimind.g:4306:1: rule__LibraryFunction__Group__6__Impl : ( ( rule__LibraryFunction__Group_6__0 )? ) ;
    public final void rule__LibraryFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4310:1: ( ( ( rule__LibraryFunction__Group_6__0 )? ) )
            // InternalOptimind.g:4311:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            {
            // InternalOptimind.g:4311:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            // InternalOptimind.g:4312:2: ( rule__LibraryFunction__Group_6__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_6()); 
            // InternalOptimind.g:4313:2: ( rule__LibraryFunction__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOptimind.g:4313:3: rule__LibraryFunction__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryFunction__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryFunctionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__6__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__7"
    // InternalOptimind.g:4321:1: rule__LibraryFunction__Group__7 : rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 ;
    public final void rule__LibraryFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4325:1: ( rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 )
            // InternalOptimind.g:4326:2: rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__LibraryFunction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__7"


    // $ANTLR start "rule__LibraryFunction__Group__7__Impl"
    // InternalOptimind.g:4333:1: rule__LibraryFunction__Group__7__Impl : ( ( rule__LibraryFunction__Group_7__0 )? ) ;
    public final void rule__LibraryFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4337:1: ( ( ( rule__LibraryFunction__Group_7__0 )? ) )
            // InternalOptimind.g:4338:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            {
            // InternalOptimind.g:4338:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            // InternalOptimind.g:4339:2: ( rule__LibraryFunction__Group_7__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_7()); 
            // InternalOptimind.g:4340:2: ( rule__LibraryFunction__Group_7__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOptimind.g:4340:3: rule__LibraryFunction__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LibraryFunction__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryFunctionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__7__Impl"


    // $ANTLR start "rule__LibraryFunction__Group__8"
    // InternalOptimind.g:4348:1: rule__LibraryFunction__Group__8 : rule__LibraryFunction__Group__8__Impl ;
    public final void rule__LibraryFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4352:1: ( rule__LibraryFunction__Group__8__Impl )
            // InternalOptimind.g:4353:2: rule__LibraryFunction__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__8"


    // $ANTLR start "rule__LibraryFunction__Group__8__Impl"
    // InternalOptimind.g:4359:1: rule__LibraryFunction__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4363:1: ( ( '}' ) )
            // InternalOptimind.g:4364:1: ( '}' )
            {
            // InternalOptimind.g:4364:1: ( '}' )
            // InternalOptimind.g:4365:2: '}'
            {
             before(grammarAccess.getLibraryFunctionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLibraryFunctionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group__8__Impl"


    // $ANTLR start "rule__LibraryFunction__Group_6__0"
    // InternalOptimind.g:4375:1: rule__LibraryFunction__Group_6__0 : rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 ;
    public final void rule__LibraryFunction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4379:1: ( rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 )
            // InternalOptimind.g:4380:2: rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1
            {
            pushFollow(FOLLOW_40);
            rule__LibraryFunction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_6__0"


    // $ANTLR start "rule__LibraryFunction__Group_6__0__Impl"
    // InternalOptimind.g:4387:1: rule__LibraryFunction__Group_6__0__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) ;
    public final void rule__LibraryFunction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4391:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) )
            // InternalOptimind.g:4392:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:4392:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            // InternalOptimind.g:4393:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0()); 
            // InternalOptimind.g:4394:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            // InternalOptimind.g:4394:3: rule__LibraryFunction__InputsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__InputsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_6__0__Impl"


    // $ANTLR start "rule__LibraryFunction__Group_6__1"
    // InternalOptimind.g:4402:1: rule__LibraryFunction__Group_6__1 : rule__LibraryFunction__Group_6__1__Impl ;
    public final void rule__LibraryFunction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4406:1: ( rule__LibraryFunction__Group_6__1__Impl )
            // InternalOptimind.g:4407:2: rule__LibraryFunction__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_6__1"


    // $ANTLR start "rule__LibraryFunction__Group_6__1__Impl"
    // InternalOptimind.g:4413:1: rule__LibraryFunction__Group_6__1__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) ;
    public final void rule__LibraryFunction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4417:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) )
            // InternalOptimind.g:4418:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:4418:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            // InternalOptimind.g:4419:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1()); 
            // InternalOptimind.g:4420:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==47) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOptimind.g:4420:3: rule__LibraryFunction__InputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__LibraryFunction__InputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_6__1__Impl"


    // $ANTLR start "rule__LibraryFunction__Group_7__0"
    // InternalOptimind.g:4429:1: rule__LibraryFunction__Group_7__0 : rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 ;
    public final void rule__LibraryFunction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4433:1: ( rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 )
            // InternalOptimind.g:4434:2: rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__LibraryFunction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_7__0"


    // $ANTLR start "rule__LibraryFunction__Group_7__0__Impl"
    // InternalOptimind.g:4441:1: rule__LibraryFunction__Group_7__0__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) ;
    public final void rule__LibraryFunction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4445:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) )
            // InternalOptimind.g:4446:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            {
            // InternalOptimind.g:4446:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            // InternalOptimind.g:4447:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0()); 
            // InternalOptimind.g:4448:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            // InternalOptimind.g:4448:3: rule__LibraryFunction__OutputsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__OutputsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_7__0__Impl"


    // $ANTLR start "rule__LibraryFunction__Group_7__1"
    // InternalOptimind.g:4456:1: rule__LibraryFunction__Group_7__1 : rule__LibraryFunction__Group_7__1__Impl ;
    public final void rule__LibraryFunction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4460:1: ( rule__LibraryFunction__Group_7__1__Impl )
            // InternalOptimind.g:4461:2: rule__LibraryFunction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LibraryFunction__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_7__1"


    // $ANTLR start "rule__LibraryFunction__Group_7__1__Impl"
    // InternalOptimind.g:4467:1: rule__LibraryFunction__Group_7__1__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) ;
    public final void rule__LibraryFunction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4471:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) )
            // InternalOptimind.g:4472:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            {
            // InternalOptimind.g:4472:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            // InternalOptimind.g:4473:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1()); 
            // InternalOptimind.g:4474:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOptimind.g:4474:3: rule__LibraryFunction__OutputsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryFunction__OutputsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__Group_7__1__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalOptimind.g:4483:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4487:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalOptimind.g:4488:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalOptimind.g:4495:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4499:1: ( ( () ) )
            // InternalOptimind.g:4500:1: ( () )
            {
            // InternalOptimind.g:4500:1: ( () )
            // InternalOptimind.g:4501:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalOptimind.g:4502:2: ()
            // InternalOptimind.g:4502:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalOptimind.g:4510:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4514:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalOptimind.g:4515:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalOptimind.g:4522:1: rule__Input__Group__1__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4526:1: ( ( 'Input' ) )
            // InternalOptimind.g:4527:1: ( 'Input' )
            {
            // InternalOptimind.g:4527:1: ( 'Input' )
            // InternalOptimind.g:4528:2: 'Input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalOptimind.g:4537:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4541:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalOptimind.g:4542:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalOptimind.g:4549:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4553:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalOptimind.g:4554:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4554:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalOptimind.g:4555:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4556:2: ( rule__Input__NameAssignment_2 )
            // InternalOptimind.g:4556:3: rule__Input__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalOptimind.g:4564:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4568:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalOptimind.g:4569:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalOptimind.g:4576:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4580:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalOptimind.g:4581:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalOptimind.g:4581:1: ( ( rule__Input__Group_3__0 )? )
            // InternalOptimind.g:4582:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalOptimind.g:4583:2: ( rule__Input__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOptimind.g:4583:3: rule__Input__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalOptimind.g:4591:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4595:1: ( rule__Input__Group__4__Impl )
            // InternalOptimind.g:4596:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalOptimind.g:4602:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4606:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalOptimind.g:4607:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalOptimind.g:4607:1: ( ( rule__Input__Group_4__0 )? )
            // InternalOptimind.g:4608:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalOptimind.g:4609:2: ( rule__Input__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOptimind.g:4609:3: rule__Input__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Input__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group_3__0"
    // InternalOptimind.g:4618:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4622:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalOptimind.g:4623:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__0"


    // $ANTLR start "rule__Input__Group_3__0__Impl"
    // InternalOptimind.g:4630:1: rule__Input__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4634:1: ( ( 'type' ) )
            // InternalOptimind.g:4635:1: ( 'type' )
            {
            // InternalOptimind.g:4635:1: ( 'type' )
            // InternalOptimind.g:4636:2: 'type'
            {
             before(grammarAccess.getInputAccess().getTypeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__0__Impl"


    // $ANTLR start "rule__Input__Group_3__1"
    // InternalOptimind.g:4645:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4649:1: ( rule__Input__Group_3__1__Impl )
            // InternalOptimind.g:4650:2: rule__Input__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__1"


    // $ANTLR start "rule__Input__Group_3__1__Impl"
    // InternalOptimind.g:4656:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4660:1: ( ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4661:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4661:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4662:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4663:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4663:3: rule__Input__TypeAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAsStringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_3__1__Impl"


    // $ANTLR start "rule__Input__Group_4__0"
    // InternalOptimind.g:4672:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4676:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalOptimind.g:4677:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0"


    // $ANTLR start "rule__Input__Group_4__0__Impl"
    // InternalOptimind.g:4684:1: rule__Input__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4688:1: ( ( 'value' ) )
            // InternalOptimind.g:4689:1: ( 'value' )
            {
            // InternalOptimind.g:4689:1: ( 'value' )
            // InternalOptimind.g:4690:2: 'value'
            {
             before(grammarAccess.getInputAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__0__Impl"


    // $ANTLR start "rule__Input__Group_4__1"
    // InternalOptimind.g:4699:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4703:1: ( rule__Input__Group_4__1__Impl )
            // InternalOptimind.g:4704:2: rule__Input__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1"


    // $ANTLR start "rule__Input__Group_4__1__Impl"
    // InternalOptimind.g:4710:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4714:1: ( ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4715:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4715:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4716:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4717:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4717:3: rule__Input__ValueAsStringAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__ValueAsStringAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_4__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalOptimind.g:4726:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4730:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalOptimind.g:4731:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalOptimind.g:4738:1: rule__Output__Group__0__Impl : ( () ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4742:1: ( ( () ) )
            // InternalOptimind.g:4743:1: ( () )
            {
            // InternalOptimind.g:4743:1: ( () )
            // InternalOptimind.g:4744:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_0()); 
            // InternalOptimind.g:4745:2: ()
            // InternalOptimind.g:4745:3: 
            {
            }

             after(grammarAccess.getOutputAccess().getOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalOptimind.g:4753:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4757:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalOptimind.g:4758:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalOptimind.g:4765:1: rule__Output__Group__1__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4769:1: ( ( 'Output' ) )
            // InternalOptimind.g:4770:1: ( 'Output' )
            {
            // InternalOptimind.g:4770:1: ( 'Output' )
            // InternalOptimind.g:4771:2: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalOptimind.g:4780:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4784:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalOptimind.g:4785:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalOptimind.g:4792:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4796:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalOptimind.g:4797:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4797:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalOptimind.g:4798:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4799:2: ( rule__Output__NameAssignment_2 )
            // InternalOptimind.g:4799:3: rule__Output__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalOptimind.g:4807:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4811:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalOptimind.g:4812:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalOptimind.g:4819:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4823:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalOptimind.g:4824:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalOptimind.g:4824:1: ( ( rule__Output__Group_3__0 )? )
            // InternalOptimind.g:4825:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalOptimind.g:4826:2: ( rule__Output__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==22) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOptimind.g:4826:3: rule__Output__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalOptimind.g:4834:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4838:1: ( rule__Output__Group__4__Impl )
            // InternalOptimind.g:4839:2: rule__Output__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalOptimind.g:4845:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4849:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalOptimind.g:4850:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalOptimind.g:4850:1: ( ( rule__Output__Group_4__0 )? )
            // InternalOptimind.g:4851:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalOptimind.g:4852:2: ( rule__Output__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==23) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOptimind.g:4852:3: rule__Output__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalOptimind.g:4861:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4865:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalOptimind.g:4866:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalOptimind.g:4873:1: rule__Output__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4877:1: ( ( 'type' ) )
            // InternalOptimind.g:4878:1: ( 'type' )
            {
            // InternalOptimind.g:4878:1: ( 'type' )
            // InternalOptimind.g:4879:2: 'type'
            {
             before(grammarAccess.getOutputAccess().getTypeKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalOptimind.g:4888:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4892:1: ( rule__Output__Group_3__1__Impl )
            // InternalOptimind.g:4893:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalOptimind.g:4899:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4903:1: ( ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4904:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4904:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4905:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4906:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4906:3: rule__Output__TypeAsStringAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__TypeAsStringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__Output__Group_4__0"
    // InternalOptimind.g:4915:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4919:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalOptimind.g:4920:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0"


    // $ANTLR start "rule__Output__Group_4__0__Impl"
    // InternalOptimind.g:4927:1: rule__Output__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4931:1: ( ( 'value' ) )
            // InternalOptimind.g:4932:1: ( 'value' )
            {
            // InternalOptimind.g:4932:1: ( 'value' )
            // InternalOptimind.g:4933:2: 'value'
            {
             before(grammarAccess.getOutputAccess().getValueKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0__Impl"


    // $ANTLR start "rule__Output__Group_4__1"
    // InternalOptimind.g:4942:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4946:1: ( rule__Output__Group_4__1__Impl )
            // InternalOptimind.g:4947:2: rule__Output__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1"


    // $ANTLR start "rule__Output__Group_4__1__Impl"
    // InternalOptimind.g:4953:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4957:1: ( ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4958:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4958:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4959:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4960:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4960:3: rule__Output__ValueAsStringAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__ValueAsStringAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1__Impl"


    // $ANTLR start "rule__Workflow__NameAssignment_2"
    // InternalOptimind.g:4969:1: rule__Workflow__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Workflow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4973:1: ( ( ruleEString ) )
            // InternalOptimind.g:4974:2: ( ruleEString )
            {
            // InternalOptimind.g:4974:2: ( ruleEString )
            // InternalOptimind.g:4975:3: ruleEString
            {
             before(grammarAccess.getWorkflowAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__NameAssignment_2"


    // $ANTLR start "rule__Workflow__LanguageAssignment_4_1"
    // InternalOptimind.g:4984:1: rule__Workflow__LanguageAssignment_4_1 : ( ruleProgLanguage ) ;
    public final void rule__Workflow__LanguageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4988:1: ( ( ruleProgLanguage ) )
            // InternalOptimind.g:4989:2: ( ruleProgLanguage )
            {
            // InternalOptimind.g:4989:2: ( ruleProgLanguage )
            // InternalOptimind.g:4990:3: ruleProgLanguage
            {
             before(grammarAccess.getWorkflowAccess().getLanguageProgLanguageEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgLanguage();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getLanguageProgLanguageEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__LanguageAssignment_4_1"


    // $ANTLR start "rule__Workflow__BaseTaskAssignment_5"
    // InternalOptimind.g:4999:1: rule__Workflow__BaseTaskAssignment_5 : ( ruleBaseTask ) ;
    public final void rule__Workflow__BaseTaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5003:1: ( ( ruleBaseTask ) )
            // InternalOptimind.g:5004:2: ( ruleBaseTask )
            {
            // InternalOptimind.g:5004:2: ( ruleBaseTask )
            // InternalOptimind.g:5005:3: ruleBaseTask
            {
             before(grammarAccess.getWorkflowAccess().getBaseTaskBaseTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseTask();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getBaseTaskBaseTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__BaseTaskAssignment_5"


    // $ANTLR start "rule__Workflow__FunctionsAssignment_6_0"
    // InternalOptimind.g:5014:1: rule__Workflow__FunctionsAssignment_6_0 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5018:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5019:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5019:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5020:3: ruleLibraryFunction
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLibraryFunction();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__FunctionsAssignment_6_0"


    // $ANTLR start "rule__Workflow__FunctionsAssignment_6_1"
    // InternalOptimind.g:5029:1: rule__Workflow__FunctionsAssignment_6_1 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5033:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5034:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5034:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5035:3: ruleLibraryFunction
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLibraryFunction();

            state._fsp--;

             after(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workflow__FunctionsAssignment_6_1"


    // $ANTLR start "rule__TaskOutput__NameAssignment_2"
    // InternalOptimind.g:5044:1: rule__TaskOutput__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TaskOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5048:1: ( ( ruleEString ) )
            // InternalOptimind.g:5049:2: ( ruleEString )
            {
            // InternalOptimind.g:5049:2: ( ruleEString )
            // InternalOptimind.g:5050:3: ruleEString
            {
             before(grammarAccess.getTaskOutputAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskOutputAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__NameAssignment_2"


    // $ANTLR start "rule__TaskOutput__TypeAsStringAssignment_3_1"
    // InternalOptimind.g:5059:1: rule__TaskOutput__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__TaskOutput__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5063:1: ( ( ruleType ) )
            // InternalOptimind.g:5064:2: ( ruleType )
            {
            // InternalOptimind.g:5064:2: ( ruleType )
            // InternalOptimind.g:5065:3: ruleType
            {
             before(grammarAccess.getTaskOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTaskOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__TypeAsStringAssignment_3_1"


    // $ANTLR start "rule__TaskOutput__ValueAsStringAssignment_4_1"
    // InternalOptimind.g:5074:1: rule__TaskOutput__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TaskOutput__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5078:1: ( ( ruleEString ) )
            // InternalOptimind.g:5079:2: ( ruleEString )
            {
            // InternalOptimind.g:5079:2: ( ruleEString )
            // InternalOptimind.g:5080:3: ruleEString
            {
             before(grammarAccess.getTaskOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskOutput__ValueAsStringAssignment_4_1"


    // $ANTLR start "rule__For__FromAssignment_3"
    // InternalOptimind.g:5089:1: rule__For__FromAssignment_3 : ( ruleEInt ) ;
    public final void rule__For__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5093:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5094:2: ( ruleEInt )
            {
            // InternalOptimind.g:5094:2: ( ruleEInt )
            // InternalOptimind.g:5095:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getFromEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getFromEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__FromAssignment_3"


    // $ANTLR start "rule__For__ToAssignment_5"
    // InternalOptimind.g:5104:1: rule__For__ToAssignment_5 : ( ruleEInt ) ;
    public final void rule__For__ToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5108:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5109:2: ( ruleEInt )
            {
            // InternalOptimind.g:5109:2: ( ruleEInt )
            // InternalOptimind.g:5110:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getToEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getToEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__ToAssignment_5"


    // $ANTLR start "rule__For__IncrementAssignment_7"
    // InternalOptimind.g:5119:1: rule__For__IncrementAssignment_7 : ( ruleEInt ) ;
    public final void rule__For__IncrementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5123:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5124:2: ( ruleEInt )
            {
            // InternalOptimind.g:5124:2: ( ruleEInt )
            // InternalOptimind.g:5125:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__IncrementAssignment_7"


    // $ANTLR start "rule__For__AbstracttaskAssignment_9"
    // InternalOptimind.g:5134:1: rule__For__AbstracttaskAssignment_9 : ( ruleAbstractTask ) ;
    public final void rule__For__AbstracttaskAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5138:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5139:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5139:2: ( ruleAbstractTask )
            // InternalOptimind.g:5140:3: ruleAbstractTask
            {
             before(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__AbstracttaskAssignment_9"


    // $ANTLR start "rule__While__ConditionAssignment_3"
    // InternalOptimind.g:5149:1: rule__While__ConditionAssignment_3 : ( ruleEString ) ;
    public final void rule__While__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5153:1: ( ( ruleEString ) )
            // InternalOptimind.g:5154:2: ( ruleEString )
            {
            // InternalOptimind.g:5154:2: ( ruleEString )
            // InternalOptimind.g:5155:3: ruleEString
            {
             before(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__ConditionAssignment_3"


    // $ANTLR start "rule__While__AbstracttaskAssignment_5"
    // InternalOptimind.g:5164:1: rule__While__AbstracttaskAssignment_5 : ( ruleAbstractTask ) ;
    public final void rule__While__AbstracttaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5168:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5169:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5169:2: ( ruleAbstractTask )
            // InternalOptimind.g:5170:3: ruleAbstractTask
            {
             before(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__AbstracttaskAssignment_5"


    // $ANTLR start "rule__If__ConditionAssignment_3"
    // InternalOptimind.g:5179:1: rule__If__ConditionAssignment_3 : ( ruleEString ) ;
    public final void rule__If__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5183:1: ( ( ruleEString ) )
            // InternalOptimind.g:5184:2: ( ruleEString )
            {
            // InternalOptimind.g:5184:2: ( ruleEString )
            // InternalOptimind.g:5185:3: ruleEString
            {
             before(grammarAccess.getIfAccess().getConditionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ConditionAssignment_3"


    // $ANTLR start "rule__If__ThenAssignment_5"
    // InternalOptimind.g:5194:1: rule__If__ThenAssignment_5 : ( ruleAbstractTask ) ;
    public final void rule__If__ThenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5198:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5199:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5199:2: ( ruleAbstractTask )
            // InternalOptimind.g:5200:3: ruleAbstractTask
            {
             before(grammarAccess.getIfAccess().getThenAbstractTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getIfAccess().getThenAbstractTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ThenAssignment_5"


    // $ANTLR start "rule__If__ElseAssignment_6_1"
    // InternalOptimind.g:5209:1: rule__If__ElseAssignment_6_1 : ( ruleAbstractTask ) ;
    public final void rule__If__ElseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5213:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5214:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5214:2: ( ruleAbstractTask )
            // InternalOptimind.g:5215:3: ruleAbstractTask
            {
             before(grammarAccess.getIfAccess().getElseAbstractTaskParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseAbstractTaskParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__ElseAssignment_6_1"


    // $ANTLR start "rule__BaseTask__NameAssignment_2"
    // InternalOptimind.g:5224:1: rule__BaseTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5228:1: ( ( ruleEString ) )
            // InternalOptimind.g:5229:2: ( ruleEString )
            {
            // InternalOptimind.g:5229:2: ( ruleEString )
            // InternalOptimind.g:5230:3: ruleEString
            {
             before(grammarAccess.getBaseTaskAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__NameAssignment_2"


    // $ANTLR start "rule__BaseTask__StatusAssignment_4_1"
    // InternalOptimind.g:5239:1: rule__BaseTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__BaseTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5243:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5244:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5244:2: ( ruleTaskStatus )
            // InternalOptimind.g:5245:3: ruleTaskStatus
            {
             before(grammarAccess.getBaseTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskStatus();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__StatusAssignment_4_1"


    // $ANTLR start "rule__BaseTask__InputsAssignment_5_2"
    // InternalOptimind.g:5254:1: rule__BaseTask__InputsAssignment_5_2 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5258:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5259:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5259:2: ( ruleTaskInput )
            // InternalOptimind.g:5260:3: ruleTaskInput
            {
             before(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__InputsAssignment_5_2"


    // $ANTLR start "rule__BaseTask__InputsAssignment_5_3_1"
    // InternalOptimind.g:5269:1: rule__BaseTask__InputsAssignment_5_3_1 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5273:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5274:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5274:2: ( ruleTaskInput )
            // InternalOptimind.g:5275:3: ruleTaskInput
            {
             before(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__InputsAssignment_5_3_1"


    // $ANTLR start "rule__BaseTask__OutputsAssignment_6_2"
    // InternalOptimind.g:5284:1: rule__BaseTask__OutputsAssignment_6_2 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5288:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5289:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5289:2: ( ruleTaskOutput )
            // InternalOptimind.g:5290:3: ruleTaskOutput
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__OutputsAssignment_6_2"


    // $ANTLR start "rule__BaseTask__OutputsAssignment_6_3_1"
    // InternalOptimind.g:5299:1: rule__BaseTask__OutputsAssignment_6_3_1 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5303:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5304:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5304:2: ( ruleTaskOutput )
            // InternalOptimind.g:5305:3: ruleTaskOutput
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__OutputsAssignment_6_3_1"


    // $ANTLR start "rule__BaseTask__ChildrenAssignment_7_0"
    // InternalOptimind.g:5314:1: rule__BaseTask__ChildrenAssignment_7_0 : ( ruleAbstractTask ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5318:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5319:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5319:2: ( ruleAbstractTask )
            // InternalOptimind.g:5320:3: ruleAbstractTask
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__ChildrenAssignment_7_0"


    // $ANTLR start "rule__BaseTask__ChildrenAssignment_7_1"
    // InternalOptimind.g:5329:1: rule__BaseTask__ChildrenAssignment_7_1 : ( ruleAbstractTask ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5333:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5334:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5334:2: ( ruleAbstractTask )
            // InternalOptimind.g:5335:3: ruleAbstractTask
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__ChildrenAssignment_7_1"


    // $ANTLR start "rule__BaseTask__AbstractstatementAssignment_8"
    // InternalOptimind.g:5344:1: rule__BaseTask__AbstractstatementAssignment_8 : ( ruleAbstractStatement ) ;
    public final void rule__BaseTask__AbstractstatementAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5348:1: ( ( ruleAbstractStatement ) )
            // InternalOptimind.g:5349:2: ( ruleAbstractStatement )
            {
            // InternalOptimind.g:5349:2: ( ruleAbstractStatement )
            // InternalOptimind.g:5350:3: ruleAbstractStatement
            {
             before(grammarAccess.getBaseTaskAccess().getAbstractstatementAbstractStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractStatement();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getAbstractstatementAbstractStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTask__AbstractstatementAssignment_8"


    // $ANTLR start "rule__LibraryTask__NameAssignment_2"
    // InternalOptimind.g:5359:1: rule__LibraryTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5363:1: ( ( ruleEString ) )
            // InternalOptimind.g:5364:2: ( ruleEString )
            {
            // InternalOptimind.g:5364:2: ( ruleEString )
            // InternalOptimind.g:5365:3: ruleEString
            {
             before(grammarAccess.getLibraryTaskAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__NameAssignment_2"


    // $ANTLR start "rule__LibraryTask__StatusAssignment_4_1"
    // InternalOptimind.g:5374:1: rule__LibraryTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__LibraryTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5378:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5379:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5379:2: ( ruleTaskStatus )
            // InternalOptimind.g:5380:3: ruleTaskStatus
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskStatus();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__StatusAssignment_4_1"


    // $ANTLR start "rule__LibraryTask__InputsAssignment_5_0"
    // InternalOptimind.g:5389:1: rule__LibraryTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5393:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5394:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5394:2: ( ruleTaskInput )
            // InternalOptimind.g:5395:3: ruleTaskInput
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__InputsAssignment_5_0"


    // $ANTLR start "rule__LibraryTask__InputsAssignment_5_1"
    // InternalOptimind.g:5404:1: rule__LibraryTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5408:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5409:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5409:2: ( ruleTaskInput )
            // InternalOptimind.g:5410:3: ruleTaskInput
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__InputsAssignment_5_1"


    // $ANTLR start "rule__LibraryTask__OutputsAssignment_6_0"
    // InternalOptimind.g:5419:1: rule__LibraryTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5423:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5424:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5424:2: ( ruleTaskOutput )
            // InternalOptimind.g:5425:3: ruleTaskOutput
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__OutputsAssignment_6_0"


    // $ANTLR start "rule__LibraryTask__OutputsAssignment_6_1"
    // InternalOptimind.g:5434:1: rule__LibraryTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5438:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5439:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5439:2: ( ruleTaskOutput )
            // InternalOptimind.g:5440:3: ruleTaskOutput
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__OutputsAssignment_6_1"


    // $ANTLR start "rule__LibraryTask__LibraryfunctionAssignment_7_1"
    // InternalOptimind.g:5449:1: rule__LibraryTask__LibraryfunctionAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__LibraryTask__LibraryfunctionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5453:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5454:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5454:2: ( ( ruleEString ) )
            // InternalOptimind.g:5455:3: ( ruleEString )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0()); 
            // InternalOptimind.g:5456:3: ( ruleEString )
            // InternalOptimind.g:5457:4: ruleEString
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryTask__LibraryfunctionAssignment_7_1"


    // $ANTLR start "rule__CustomTask__NameAssignment_2"
    // InternalOptimind.g:5468:1: rule__CustomTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5472:1: ( ( ruleEString ) )
            // InternalOptimind.g:5473:2: ( ruleEString )
            {
            // InternalOptimind.g:5473:2: ( ruleEString )
            // InternalOptimind.g:5474:3: ruleEString
            {
             before(grammarAccess.getCustomTaskAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__NameAssignment_2"


    // $ANTLR start "rule__CustomTask__StatusAssignment_4_1"
    // InternalOptimind.g:5483:1: rule__CustomTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__CustomTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5487:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5488:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5488:2: ( ruleTaskStatus )
            // InternalOptimind.g:5489:3: ruleTaskStatus
            {
             before(grammarAccess.getCustomTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskStatus();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__StatusAssignment_4_1"


    // $ANTLR start "rule__CustomTask__InputsAssignment_5_0"
    // InternalOptimind.g:5498:1: rule__CustomTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5502:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5503:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5503:2: ( ruleTaskInput )
            // InternalOptimind.g:5504:3: ruleTaskInput
            {
             before(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__InputsAssignment_5_0"


    // $ANTLR start "rule__CustomTask__InputsAssignment_5_1"
    // InternalOptimind.g:5513:1: rule__CustomTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5517:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5518:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5518:2: ( ruleTaskInput )
            // InternalOptimind.g:5519:3: ruleTaskInput
            {
             before(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskInput();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__InputsAssignment_5_1"


    // $ANTLR start "rule__CustomTask__OutputsAssignment_6_0"
    // InternalOptimind.g:5528:1: rule__CustomTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5532:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5533:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5533:2: ( ruleTaskOutput )
            // InternalOptimind.g:5534:3: ruleTaskOutput
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__OutputsAssignment_6_0"


    // $ANTLR start "rule__CustomTask__OutputsAssignment_6_1"
    // InternalOptimind.g:5543:1: rule__CustomTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5547:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5548:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5548:2: ( ruleTaskOutput )
            // InternalOptimind.g:5549:3: ruleTaskOutput
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskOutput();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__OutputsAssignment_6_1"


    // $ANTLR start "rule__CustomTask__RunnerAssignment_7_1"
    // InternalOptimind.g:5558:1: rule__CustomTask__RunnerAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CustomTask__RunnerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5562:1: ( ( ruleEString ) )
            // InternalOptimind.g:5563:2: ( ruleEString )
            {
            // InternalOptimind.g:5563:2: ( ruleEString )
            // InternalOptimind.g:5564:3: ruleEString
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomTaskAccess().getRunnerEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTask__RunnerAssignment_7_1"


    // $ANTLR start "rule__Setter__NameAssignment_2"
    // InternalOptimind.g:5573:1: rule__Setter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Setter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5577:1: ( ( ruleEString ) )
            // InternalOptimind.g:5578:2: ( ruleEString )
            {
            // InternalOptimind.g:5578:2: ( ruleEString )
            // InternalOptimind.g:5579:3: ruleEString
            {
             before(grammarAccess.getSetterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__NameAssignment_2"


    // $ANTLR start "rule__Setter__TypeAsStringAssignment_3_1"
    // InternalOptimind.g:5588:1: rule__Setter__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Setter__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5592:1: ( ( ruleType ) )
            // InternalOptimind.g:5593:2: ( ruleType )
            {
            // InternalOptimind.g:5593:2: ( ruleType )
            // InternalOptimind.g:5594:3: ruleType
            {
             before(grammarAccess.getSetterAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSetterAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__TypeAsStringAssignment_3_1"


    // $ANTLR start "rule__Setter__ValueAsStringAssignment_4_1"
    // InternalOptimind.g:5603:1: rule__Setter__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Setter__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5607:1: ( ( ruleEString ) )
            // InternalOptimind.g:5608:2: ( ruleEString )
            {
            // InternalOptimind.g:5608:2: ( ruleEString )
            // InternalOptimind.g:5609:3: ruleEString
            {
             before(grammarAccess.getSetterAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSetterAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setter__ValueAsStringAssignment_4_1"


    // $ANTLR start "rule__Connection__NameAssignment_2"
    // InternalOptimind.g:5618:1: rule__Connection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Connection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5622:1: ( ( ruleEString ) )
            // InternalOptimind.g:5623:2: ( ruleEString )
            {
            // InternalOptimind.g:5623:2: ( ruleEString )
            // InternalOptimind.g:5624:3: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__NameAssignment_2"


    // $ANTLR start "rule__Connection__TaskoutputAssignment_3_1"
    // InternalOptimind.g:5633:1: rule__Connection__TaskoutputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Connection__TaskoutputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5637:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5638:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5638:2: ( ( ruleEString ) )
            // InternalOptimind.g:5639:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0()); 
            // InternalOptimind.g:5640:3: ( ruleEString )
            // InternalOptimind.g:5641:4: ruleEString
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__TaskoutputAssignment_3_1"


    // $ANTLR start "rule__LibraryFunction__NameAssignment_2"
    // InternalOptimind.g:5652:1: rule__LibraryFunction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5656:1: ( ( ruleEString ) )
            // InternalOptimind.g:5657:2: ( ruleEString )
            {
            // InternalOptimind.g:5657:2: ( ruleEString )
            // InternalOptimind.g:5658:3: ruleEString
            {
             before(grammarAccess.getLibraryFunctionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__NameAssignment_2"


    // $ANTLR start "rule__LibraryFunction__FunctionAssignment_5"
    // InternalOptimind.g:5667:1: rule__LibraryFunction__FunctionAssignment_5 : ( ruleEString ) ;
    public final void rule__LibraryFunction__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5671:1: ( ( ruleEString ) )
            // InternalOptimind.g:5672:2: ( ruleEString )
            {
            // InternalOptimind.g:5672:2: ( ruleEString )
            // InternalOptimind.g:5673:3: ruleEString
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getFunctionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__FunctionAssignment_5"


    // $ANTLR start "rule__LibraryFunction__InputsAssignment_6_0"
    // InternalOptimind.g:5682:1: rule__LibraryFunction__InputsAssignment_6_0 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5686:1: ( ( ruleInput ) )
            // InternalOptimind.g:5687:2: ( ruleInput )
            {
            // InternalOptimind.g:5687:2: ( ruleInput )
            // InternalOptimind.g:5688:3: ruleInput
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__InputsAssignment_6_0"


    // $ANTLR start "rule__LibraryFunction__InputsAssignment_6_1"
    // InternalOptimind.g:5697:1: rule__LibraryFunction__InputsAssignment_6_1 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5701:1: ( ( ruleInput ) )
            // InternalOptimind.g:5702:2: ( ruleInput )
            {
            // InternalOptimind.g:5702:2: ( ruleInput )
            // InternalOptimind.g:5703:3: ruleInput
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__InputsAssignment_6_1"


    // $ANTLR start "rule__LibraryFunction__OutputsAssignment_7_0"
    // InternalOptimind.g:5712:1: rule__LibraryFunction__OutputsAssignment_7_0 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5716:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5717:2: ( ruleOutput )
            {
            // InternalOptimind.g:5717:2: ( ruleOutput )
            // InternalOptimind.g:5718:3: ruleOutput
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__OutputsAssignment_7_0"


    // $ANTLR start "rule__LibraryFunction__OutputsAssignment_7_1"
    // InternalOptimind.g:5727:1: rule__LibraryFunction__OutputsAssignment_7_1 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5731:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5732:2: ( ruleOutput )
            {
            // InternalOptimind.g:5732:2: ( ruleOutput )
            // InternalOptimind.g:5733:3: ruleOutput
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LibraryFunction__OutputsAssignment_7_1"


    // $ANTLR start "rule__Input__NameAssignment_2"
    // InternalOptimind.g:5742:1: rule__Input__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5746:1: ( ( ruleEString ) )
            // InternalOptimind.g:5747:2: ( ruleEString )
            {
            // InternalOptimind.g:5747:2: ( ruleEString )
            // InternalOptimind.g:5748:3: ruleEString
            {
             before(grammarAccess.getInputAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_2"


    // $ANTLR start "rule__Input__TypeAsStringAssignment_3_1"
    // InternalOptimind.g:5757:1: rule__Input__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Input__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5761:1: ( ( ruleType ) )
            // InternalOptimind.g:5762:2: ( ruleType )
            {
            // InternalOptimind.g:5762:2: ( ruleType )
            // InternalOptimind.g:5763:3: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__TypeAsStringAssignment_3_1"


    // $ANTLR start "rule__Input__ValueAsStringAssignment_4_1"
    // InternalOptimind.g:5772:1: rule__Input__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Input__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5776:1: ( ( ruleEString ) )
            // InternalOptimind.g:5777:2: ( ruleEString )
            {
            // InternalOptimind.g:5777:2: ( ruleEString )
            // InternalOptimind.g:5778:3: ruleEString
            {
             before(grammarAccess.getInputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ValueAsStringAssignment_4_1"


    // $ANTLR start "rule__Output__NameAssignment_2"
    // InternalOptimind.g:5787:1: rule__Output__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5791:1: ( ( ruleEString ) )
            // InternalOptimind.g:5792:2: ( ruleEString )
            {
            // InternalOptimind.g:5792:2: ( ruleEString )
            // InternalOptimind.g:5793:3: ruleEString
            {
             before(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NameAssignment_2"


    // $ANTLR start "rule__Output__TypeAsStringAssignment_3_1"
    // InternalOptimind.g:5802:1: rule__Output__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Output__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5806:1: ( ( ruleType ) )
            // InternalOptimind.g:5807:2: ( ruleType )
            {
            // InternalOptimind.g:5807:2: ( ruleType )
            // InternalOptimind.g:5808:3: ruleType
            {
             before(grammarAccess.getOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__TypeAsStringAssignment_3_1"


    // $ANTLR start "rule__Output__ValueAsStringAssignment_4_1"
    // InternalOptimind.g:5817:1: rule__Output__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Output__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5821:1: ( ( ruleEString ) )
            // InternalOptimind.g:5822:2: ( ruleEString )
            {
            // InternalOptimind.g:5822:2: ( ruleEString )
            // InternalOptimind.g:5823:3: ruleEString
            {
             before(grammarAccess.getOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ValueAsStringAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200400180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000028400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000002DCA1080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000028400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000190800280000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001C0800280000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000280000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});

}