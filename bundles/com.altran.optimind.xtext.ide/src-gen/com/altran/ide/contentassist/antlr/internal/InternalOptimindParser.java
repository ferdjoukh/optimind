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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'", "'Workflow'", "'{'", "'}'", "'Language'", "'Output'", "'type'", "'value'", "'For'", "'from'", "'to'", "'increment'", "'do'", "'While'", "'condition'", "'If'", "'then'", "'else'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'LibraryFunction'", "'function'", "'Input'"
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


    // $ANTLR start "rule__BaseTask__Alternatives_7"
    // InternalOptimind.g:676:1: rule__BaseTask__Alternatives_7 : ( ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) | ( ( rule__BaseTask__AbstractstatementAssignment_7_1 ) ) );
    public final void rule__BaseTask__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:680:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) | ( ( rule__BaseTask__AbstractstatementAssignment_7_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34||LA6_0==39||LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==24||LA6_0==29||LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptimind.g:681:2: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
                    {
                    // InternalOptimind.g:681:2: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
                    // InternalOptimind.g:682:3: ( rule__BaseTask__ChildrenAssignment_7_0 )
                    {
                     before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 
                    // InternalOptimind.g:683:3: ( rule__BaseTask__ChildrenAssignment_7_0 )
                    // InternalOptimind.g:683:4: rule__BaseTask__ChildrenAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__ChildrenAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:687:2: ( ( rule__BaseTask__AbstractstatementAssignment_7_1 ) )
                    {
                    // InternalOptimind.g:687:2: ( ( rule__BaseTask__AbstractstatementAssignment_7_1 ) )
                    // InternalOptimind.g:688:3: ( rule__BaseTask__AbstractstatementAssignment_7_1 )
                    {
                     before(grammarAccess.getBaseTaskAccess().getAbstractstatementAssignment_7_1()); 
                    // InternalOptimind.g:689:3: ( rule__BaseTask__AbstractstatementAssignment_7_1 )
                    // InternalOptimind.g:689:4: rule__BaseTask__AbstractstatementAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BaseTask__AbstractstatementAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseTaskAccess().getAbstractstatementAssignment_7_1()); 

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
    // $ANTLR end "rule__BaseTask__Alternatives_7"


    // $ANTLR start "rule__ProgLanguage__Alternatives"
    // InternalOptimind.g:697:1: rule__ProgLanguage__Alternatives : ( ( ( 'Python' ) ) | ( ( 'Java' ) ) );
    public final void rule__ProgLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:701:1: ( ( ( 'Python' ) ) | ( ( 'Java' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptimind.g:702:2: ( ( 'Python' ) )
                    {
                    // InternalOptimind.g:702:2: ( ( 'Python' ) )
                    // InternalOptimind.g:703:3: ( 'Python' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:704:3: ( 'Python' )
                    // InternalOptimind.g:704:4: 'Python'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:708:2: ( ( 'Java' ) )
                    {
                    // InternalOptimind.g:708:2: ( ( 'Java' ) )
                    // InternalOptimind.g:709:3: ( 'Java' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:710:3: ( 'Java' )
                    // InternalOptimind.g:710:4: 'Java'
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
    // InternalOptimind.g:718:1: rule__TaskStatus__Alternatives : ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) );
    public final void rule__TaskStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:722:1: ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOptimind.g:723:2: ( ( 'FINISHED' ) )
                    {
                    // InternalOptimind.g:723:2: ( ( 'FINISHED' ) )
                    // InternalOptimind.g:724:3: ( 'FINISHED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:725:3: ( 'FINISHED' )
                    // InternalOptimind.g:725:4: 'FINISHED'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:729:2: ( ( 'PREPARED' ) )
                    {
                    // InternalOptimind.g:729:2: ( ( 'PREPARED' ) )
                    // InternalOptimind.g:730:3: ( 'PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:731:3: ( 'PREPARED' )
                    // InternalOptimind.g:731:4: 'PREPARED'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:735:2: ( ( 'NOT_PREPARED' ) )
                    {
                    // InternalOptimind.g:735:2: ( ( 'NOT_PREPARED' ) )
                    // InternalOptimind.g:736:3: ( 'NOT_PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 
                    // InternalOptimind.g:737:3: ( 'NOT_PREPARED' )
                    // InternalOptimind.g:737:4: 'NOT_PREPARED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:741:2: ( ( 'PROCESSING' ) )
                    {
                    // InternalOptimind.g:741:2: ( ( 'PROCESSING' ) )
                    // InternalOptimind.g:742:3: ( 'PROCESSING' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3()); 
                    // InternalOptimind.g:743:3: ( 'PROCESSING' )
                    // InternalOptimind.g:743:4: 'PROCESSING'
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
    // InternalOptimind.g:751:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:755:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalOptimind.g:756:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
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
    // InternalOptimind.g:763:1: rule__Workflow__Group__0__Impl : ( () ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:767:1: ( ( () ) )
            // InternalOptimind.g:768:1: ( () )
            {
            // InternalOptimind.g:768:1: ( () )
            // InternalOptimind.g:769:2: ()
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowAction_0()); 
            // InternalOptimind.g:770:2: ()
            // InternalOptimind.g:770:3: 
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
    // InternalOptimind.g:778:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:782:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalOptimind.g:783:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
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
    // InternalOptimind.g:790:1: rule__Workflow__Group__1__Impl : ( 'Workflow' ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:794:1: ( ( 'Workflow' ) )
            // InternalOptimind.g:795:1: ( 'Workflow' )
            {
            // InternalOptimind.g:795:1: ( 'Workflow' )
            // InternalOptimind.g:796:2: 'Workflow'
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
    // InternalOptimind.g:805:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:809:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalOptimind.g:810:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
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
    // InternalOptimind.g:817:1: rule__Workflow__Group__2__Impl : ( ( rule__Workflow__NameAssignment_2 ) ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:821:1: ( ( ( rule__Workflow__NameAssignment_2 ) ) )
            // InternalOptimind.g:822:1: ( ( rule__Workflow__NameAssignment_2 ) )
            {
            // InternalOptimind.g:822:1: ( ( rule__Workflow__NameAssignment_2 ) )
            // InternalOptimind.g:823:2: ( rule__Workflow__NameAssignment_2 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_2()); 
            // InternalOptimind.g:824:2: ( rule__Workflow__NameAssignment_2 )
            // InternalOptimind.g:824:3: rule__Workflow__NameAssignment_2
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
    // InternalOptimind.g:832:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:836:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalOptimind.g:837:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
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
    // InternalOptimind.g:844:1: rule__Workflow__Group__3__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:848:1: ( ( '{' ) )
            // InternalOptimind.g:849:1: ( '{' )
            {
            // InternalOptimind.g:849:1: ( '{' )
            // InternalOptimind.g:850:2: '{'
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
    // InternalOptimind.g:859:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl rule__Workflow__Group__5 ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:863:1: ( rule__Workflow__Group__4__Impl rule__Workflow__Group__5 )
            // InternalOptimind.g:864:2: rule__Workflow__Group__4__Impl rule__Workflow__Group__5
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
    // InternalOptimind.g:871:1: rule__Workflow__Group__4__Impl : ( ( rule__Workflow__Group_4__0 )? ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:875:1: ( ( ( rule__Workflow__Group_4__0 )? ) )
            // InternalOptimind.g:876:1: ( ( rule__Workflow__Group_4__0 )? )
            {
            // InternalOptimind.g:876:1: ( ( rule__Workflow__Group_4__0 )? )
            // InternalOptimind.g:877:2: ( rule__Workflow__Group_4__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4()); 
            // InternalOptimind.g:878:2: ( rule__Workflow__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:878:3: rule__Workflow__Group_4__0
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
    // InternalOptimind.g:886:1: rule__Workflow__Group__5 : rule__Workflow__Group__5__Impl rule__Workflow__Group__6 ;
    public final void rule__Workflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:890:1: ( rule__Workflow__Group__5__Impl rule__Workflow__Group__6 )
            // InternalOptimind.g:891:2: rule__Workflow__Group__5__Impl rule__Workflow__Group__6
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
    // InternalOptimind.g:898:1: rule__Workflow__Group__5__Impl : ( ( rule__Workflow__BaseTaskAssignment_5 )? ) ;
    public final void rule__Workflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:902:1: ( ( ( rule__Workflow__BaseTaskAssignment_5 )? ) )
            // InternalOptimind.g:903:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            {
            // InternalOptimind.g:903:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            // InternalOptimind.g:904:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            {
             before(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5()); 
            // InternalOptimind.g:905:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimind.g:905:3: rule__Workflow__BaseTaskAssignment_5
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
    // InternalOptimind.g:913:1: rule__Workflow__Group__6 : rule__Workflow__Group__6__Impl rule__Workflow__Group__7 ;
    public final void rule__Workflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:917:1: ( rule__Workflow__Group__6__Impl rule__Workflow__Group__7 )
            // InternalOptimind.g:918:2: rule__Workflow__Group__6__Impl rule__Workflow__Group__7
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
    // InternalOptimind.g:925:1: rule__Workflow__Group__6__Impl : ( ( rule__Workflow__Group_6__0 )? ) ;
    public final void rule__Workflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:929:1: ( ( ( rule__Workflow__Group_6__0 )? ) )
            // InternalOptimind.g:930:1: ( ( rule__Workflow__Group_6__0 )? )
            {
            // InternalOptimind.g:930:1: ( ( rule__Workflow__Group_6__0 )? )
            // InternalOptimind.g:931:2: ( rule__Workflow__Group_6__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_6()); 
            // InternalOptimind.g:932:2: ( rule__Workflow__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==45) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimind.g:932:3: rule__Workflow__Group_6__0
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
    // InternalOptimind.g:940:1: rule__Workflow__Group__7 : rule__Workflow__Group__7__Impl ;
    public final void rule__Workflow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:944:1: ( rule__Workflow__Group__7__Impl )
            // InternalOptimind.g:945:2: rule__Workflow__Group__7__Impl
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
    // InternalOptimind.g:951:1: rule__Workflow__Group__7__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:955:1: ( ( '}' ) )
            // InternalOptimind.g:956:1: ( '}' )
            {
            // InternalOptimind.g:956:1: ( '}' )
            // InternalOptimind.g:957:2: '}'
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
    // InternalOptimind.g:967:1: rule__Workflow__Group_4__0 : rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 ;
    public final void rule__Workflow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:971:1: ( rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 )
            // InternalOptimind.g:972:2: rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1
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
    // InternalOptimind.g:979:1: rule__Workflow__Group_4__0__Impl : ( 'Language' ) ;
    public final void rule__Workflow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:983:1: ( ( 'Language' ) )
            // InternalOptimind.g:984:1: ( 'Language' )
            {
            // InternalOptimind.g:984:1: ( 'Language' )
            // InternalOptimind.g:985:2: 'Language'
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
    // InternalOptimind.g:994:1: rule__Workflow__Group_4__1 : rule__Workflow__Group_4__1__Impl ;
    public final void rule__Workflow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:998:1: ( rule__Workflow__Group_4__1__Impl )
            // InternalOptimind.g:999:2: rule__Workflow__Group_4__1__Impl
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
    // InternalOptimind.g:1005:1: rule__Workflow__Group_4__1__Impl : ( ( rule__Workflow__LanguageAssignment_4_1 ) ) ;
    public final void rule__Workflow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1009:1: ( ( ( rule__Workflow__LanguageAssignment_4_1 ) ) )
            // InternalOptimind.g:1010:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            {
            // InternalOptimind.g:1010:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            // InternalOptimind.g:1011:2: ( rule__Workflow__LanguageAssignment_4_1 )
            {
             before(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1()); 
            // InternalOptimind.g:1012:2: ( rule__Workflow__LanguageAssignment_4_1 )
            // InternalOptimind.g:1012:3: rule__Workflow__LanguageAssignment_4_1
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
    // InternalOptimind.g:1021:1: rule__Workflow__Group_6__0 : rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 ;
    public final void rule__Workflow__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1025:1: ( rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 )
            // InternalOptimind.g:1026:2: rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1
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
    // InternalOptimind.g:1033:1: rule__Workflow__Group_6__0__Impl : ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) ;
    public final void rule__Workflow__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1037:1: ( ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) )
            // InternalOptimind.g:1038:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            {
            // InternalOptimind.g:1038:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            // InternalOptimind.g:1039:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0()); 
            // InternalOptimind.g:1040:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            // InternalOptimind.g:1040:3: rule__Workflow__FunctionsAssignment_6_0
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
    // InternalOptimind.g:1048:1: rule__Workflow__Group_6__1 : rule__Workflow__Group_6__1__Impl ;
    public final void rule__Workflow__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1052:1: ( rule__Workflow__Group_6__1__Impl )
            // InternalOptimind.g:1053:2: rule__Workflow__Group_6__1__Impl
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
    // InternalOptimind.g:1059:1: rule__Workflow__Group_6__1__Impl : ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) ;
    public final void rule__Workflow__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1063:1: ( ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) )
            // InternalOptimind.g:1064:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            {
            // InternalOptimind.g:1064:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            // InternalOptimind.g:1065:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1()); 
            // InternalOptimind.g:1066:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==45) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOptimind.g:1066:3: rule__Workflow__FunctionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workflow__FunctionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOptimind.g:1075:1: rule__TaskOutput__Group__0 : rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 ;
    public final void rule__TaskOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1079:1: ( rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 )
            // InternalOptimind.g:1080:2: rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1
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
    // InternalOptimind.g:1087:1: rule__TaskOutput__Group__0__Impl : ( () ) ;
    public final void rule__TaskOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1091:1: ( ( () ) )
            // InternalOptimind.g:1092:1: ( () )
            {
            // InternalOptimind.g:1092:1: ( () )
            // InternalOptimind.g:1093:2: ()
            {
             before(grammarAccess.getTaskOutputAccess().getTaskOutputAction_0()); 
            // InternalOptimind.g:1094:2: ()
            // InternalOptimind.g:1094:3: 
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
    // InternalOptimind.g:1102:1: rule__TaskOutput__Group__1 : rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 ;
    public final void rule__TaskOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1106:1: ( rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 )
            // InternalOptimind.g:1107:2: rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2
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
    // InternalOptimind.g:1114:1: rule__TaskOutput__Group__1__Impl : ( 'Output' ) ;
    public final void rule__TaskOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1118:1: ( ( 'Output' ) )
            // InternalOptimind.g:1119:1: ( 'Output' )
            {
            // InternalOptimind.g:1119:1: ( 'Output' )
            // InternalOptimind.g:1120:2: 'Output'
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
    // InternalOptimind.g:1129:1: rule__TaskOutput__Group__2 : rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 ;
    public final void rule__TaskOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1133:1: ( rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 )
            // InternalOptimind.g:1134:2: rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3
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
    // InternalOptimind.g:1141:1: rule__TaskOutput__Group__2__Impl : ( ( rule__TaskOutput__NameAssignment_2 ) ) ;
    public final void rule__TaskOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1145:1: ( ( ( rule__TaskOutput__NameAssignment_2 ) ) )
            // InternalOptimind.g:1146:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1146:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            // InternalOptimind.g:1147:2: ( rule__TaskOutput__NameAssignment_2 )
            {
             before(grammarAccess.getTaskOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1148:2: ( rule__TaskOutput__NameAssignment_2 )
            // InternalOptimind.g:1148:3: rule__TaskOutput__NameAssignment_2
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
    // InternalOptimind.g:1156:1: rule__TaskOutput__Group__3 : rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 ;
    public final void rule__TaskOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1160:1: ( rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 )
            // InternalOptimind.g:1161:2: rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4
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
    // InternalOptimind.g:1168:1: rule__TaskOutput__Group__3__Impl : ( ( rule__TaskOutput__Group_3__0 )? ) ;
    public final void rule__TaskOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1172:1: ( ( ( rule__TaskOutput__Group_3__0 )? ) )
            // InternalOptimind.g:1173:1: ( ( rule__TaskOutput__Group_3__0 )? )
            {
            // InternalOptimind.g:1173:1: ( ( rule__TaskOutput__Group_3__0 )? )
            // InternalOptimind.g:1174:2: ( rule__TaskOutput__Group_3__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_3()); 
            // InternalOptimind.g:1175:2: ( rule__TaskOutput__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptimind.g:1175:3: rule__TaskOutput__Group_3__0
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
    // InternalOptimind.g:1183:1: rule__TaskOutput__Group__4 : rule__TaskOutput__Group__4__Impl ;
    public final void rule__TaskOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1187:1: ( rule__TaskOutput__Group__4__Impl )
            // InternalOptimind.g:1188:2: rule__TaskOutput__Group__4__Impl
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
    // InternalOptimind.g:1194:1: rule__TaskOutput__Group__4__Impl : ( ( rule__TaskOutput__Group_4__0 )? ) ;
    public final void rule__TaskOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1198:1: ( ( ( rule__TaskOutput__Group_4__0 )? ) )
            // InternalOptimind.g:1199:1: ( ( rule__TaskOutput__Group_4__0 )? )
            {
            // InternalOptimind.g:1199:1: ( ( rule__TaskOutput__Group_4__0 )? )
            // InternalOptimind.g:1200:2: ( rule__TaskOutput__Group_4__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_4()); 
            // InternalOptimind.g:1201:2: ( rule__TaskOutput__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptimind.g:1201:3: rule__TaskOutput__Group_4__0
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
    // InternalOptimind.g:1210:1: rule__TaskOutput__Group_3__0 : rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 ;
    public final void rule__TaskOutput__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1214:1: ( rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 )
            // InternalOptimind.g:1215:2: rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1
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
    // InternalOptimind.g:1222:1: rule__TaskOutput__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TaskOutput__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1226:1: ( ( 'type' ) )
            // InternalOptimind.g:1227:1: ( 'type' )
            {
            // InternalOptimind.g:1227:1: ( 'type' )
            // InternalOptimind.g:1228:2: 'type'
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
    // InternalOptimind.g:1237:1: rule__TaskOutput__Group_3__1 : rule__TaskOutput__Group_3__1__Impl ;
    public final void rule__TaskOutput__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1241:1: ( rule__TaskOutput__Group_3__1__Impl )
            // InternalOptimind.g:1242:2: rule__TaskOutput__Group_3__1__Impl
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
    // InternalOptimind.g:1248:1: rule__TaskOutput__Group_3__1__Impl : ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__TaskOutput__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1252:1: ( ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:1253:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:1253:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:1254:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:1255:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:1255:3: rule__TaskOutput__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:1264:1: rule__TaskOutput__Group_4__0 : rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 ;
    public final void rule__TaskOutput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1268:1: ( rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 )
            // InternalOptimind.g:1269:2: rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1
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
    // InternalOptimind.g:1276:1: rule__TaskOutput__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__TaskOutput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1280:1: ( ( 'value' ) )
            // InternalOptimind.g:1281:1: ( 'value' )
            {
            // InternalOptimind.g:1281:1: ( 'value' )
            // InternalOptimind.g:1282:2: 'value'
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
    // InternalOptimind.g:1291:1: rule__TaskOutput__Group_4__1 : rule__TaskOutput__Group_4__1__Impl ;
    public final void rule__TaskOutput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1295:1: ( rule__TaskOutput__Group_4__1__Impl )
            // InternalOptimind.g:1296:2: rule__TaskOutput__Group_4__1__Impl
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
    // InternalOptimind.g:1302:1: rule__TaskOutput__Group_4__1__Impl : ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__TaskOutput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1306:1: ( ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:1307:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:1307:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:1308:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:1309:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:1309:3: rule__TaskOutput__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:1318:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1322:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // InternalOptimind.g:1323:2: rule__For__Group__0__Impl rule__For__Group__1
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
    // InternalOptimind.g:1330:1: rule__For__Group__0__Impl : ( () ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1334:1: ( ( () ) )
            // InternalOptimind.g:1335:1: ( () )
            {
            // InternalOptimind.g:1335:1: ( () )
            // InternalOptimind.g:1336:2: ()
            {
             before(grammarAccess.getForAccess().getForStatementAction_0()); 
            // InternalOptimind.g:1337:2: ()
            // InternalOptimind.g:1337:3: 
            {
            }

             after(grammarAccess.getForAccess().getForStatementAction_0()); 

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
    // InternalOptimind.g:1345:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1349:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // InternalOptimind.g:1350:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalOptimind.g:1357:1: rule__For__Group__1__Impl : ( 'For' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1361:1: ( ( 'For' ) )
            // InternalOptimind.g:1362:1: ( 'For' )
            {
            // InternalOptimind.g:1362:1: ( 'For' )
            // InternalOptimind.g:1363:2: 'For'
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
    // InternalOptimind.g:1372:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1376:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // InternalOptimind.g:1377:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalOptimind.g:1384:1: rule__For__Group__2__Impl : ( ( rule__For__NameAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1388:1: ( ( ( rule__For__NameAssignment_2 ) ) )
            // InternalOptimind.g:1389:1: ( ( rule__For__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1389:1: ( ( rule__For__NameAssignment_2 ) )
            // InternalOptimind.g:1390:2: ( rule__For__NameAssignment_2 )
            {
             before(grammarAccess.getForAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1391:2: ( rule__For__NameAssignment_2 )
            // InternalOptimind.g:1391:3: rule__For__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__For__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getNameAssignment_2()); 

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
    // InternalOptimind.g:1399:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1403:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // InternalOptimind.g:1404:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1411:1: rule__For__Group__3__Impl : ( '{' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1415:1: ( ( '{' ) )
            // InternalOptimind.g:1416:1: ( '{' )
            {
            // InternalOptimind.g:1416:1: ( '{' )
            // InternalOptimind.g:1417:2: '{'
            {
             before(grammarAccess.getForAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalOptimind.g:1426:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1430:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // InternalOptimind.g:1431:2: rule__For__Group__4__Impl rule__For__Group__5
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
    // InternalOptimind.g:1438:1: rule__For__Group__4__Impl : ( 'from' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1442:1: ( ( 'from' ) )
            // InternalOptimind.g:1443:1: ( 'from' )
            {
            // InternalOptimind.g:1443:1: ( 'from' )
            // InternalOptimind.g:1444:2: 'from'
            {
             before(grammarAccess.getForAccess().getFromKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForAccess().getFromKeyword_4()); 

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
    // InternalOptimind.g:1453:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1457:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // InternalOptimind.g:1458:2: rule__For__Group__5__Impl rule__For__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:1465:1: rule__For__Group__5__Impl : ( ( rule__For__FromAssignment_5 ) ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1469:1: ( ( ( rule__For__FromAssignment_5 ) ) )
            // InternalOptimind.g:1470:1: ( ( rule__For__FromAssignment_5 ) )
            {
            // InternalOptimind.g:1470:1: ( ( rule__For__FromAssignment_5 ) )
            // InternalOptimind.g:1471:2: ( rule__For__FromAssignment_5 )
            {
             before(grammarAccess.getForAccess().getFromAssignment_5()); 
            // InternalOptimind.g:1472:2: ( rule__For__FromAssignment_5 )
            // InternalOptimind.g:1472:3: rule__For__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__For__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getFromAssignment_5()); 

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
    // InternalOptimind.g:1480:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1484:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // InternalOptimind.g:1485:2: rule__For__Group__6__Impl rule__For__Group__7
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
    // InternalOptimind.g:1492:1: rule__For__Group__6__Impl : ( 'to' ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1496:1: ( ( 'to' ) )
            // InternalOptimind.g:1497:1: ( 'to' )
            {
            // InternalOptimind.g:1497:1: ( 'to' )
            // InternalOptimind.g:1498:2: 'to'
            {
             before(grammarAccess.getForAccess().getToKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForAccess().getToKeyword_6()); 

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
    // InternalOptimind.g:1507:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1511:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // InternalOptimind.g:1512:2: rule__For__Group__7__Impl rule__For__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalOptimind.g:1519:1: rule__For__Group__7__Impl : ( ( rule__For__ToAssignment_7 ) ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1523:1: ( ( ( rule__For__ToAssignment_7 ) ) )
            // InternalOptimind.g:1524:1: ( ( rule__For__ToAssignment_7 ) )
            {
            // InternalOptimind.g:1524:1: ( ( rule__For__ToAssignment_7 ) )
            // InternalOptimind.g:1525:2: ( rule__For__ToAssignment_7 )
            {
             before(grammarAccess.getForAccess().getToAssignment_7()); 
            // InternalOptimind.g:1526:2: ( rule__For__ToAssignment_7 )
            // InternalOptimind.g:1526:3: rule__For__ToAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__For__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getToAssignment_7()); 

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
    // InternalOptimind.g:1534:1: rule__For__Group__8 : rule__For__Group__8__Impl rule__For__Group__9 ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1538:1: ( rule__For__Group__8__Impl rule__For__Group__9 )
            // InternalOptimind.g:1539:2: rule__For__Group__8__Impl rule__For__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalOptimind.g:1546:1: rule__For__Group__8__Impl : ( 'increment' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1550:1: ( ( 'increment' ) )
            // InternalOptimind.g:1551:1: ( 'increment' )
            {
            // InternalOptimind.g:1551:1: ( 'increment' )
            // InternalOptimind.g:1552:2: 'increment'
            {
             before(grammarAccess.getForAccess().getIncrementKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForAccess().getIncrementKeyword_8()); 

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
    // InternalOptimind.g:1561:1: rule__For__Group__9 : rule__For__Group__9__Impl rule__For__Group__10 ;
    public final void rule__For__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1565:1: ( rule__For__Group__9__Impl rule__For__Group__10 )
            // InternalOptimind.g:1566:2: rule__For__Group__9__Impl rule__For__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalOptimind.g:1573:1: rule__For__Group__9__Impl : ( ( rule__For__IncrementAssignment_9 ) ) ;
    public final void rule__For__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1577:1: ( ( ( rule__For__IncrementAssignment_9 ) ) )
            // InternalOptimind.g:1578:1: ( ( rule__For__IncrementAssignment_9 ) )
            {
            // InternalOptimind.g:1578:1: ( ( rule__For__IncrementAssignment_9 ) )
            // InternalOptimind.g:1579:2: ( rule__For__IncrementAssignment_9 )
            {
             before(grammarAccess.getForAccess().getIncrementAssignment_9()); 
            // InternalOptimind.g:1580:2: ( rule__For__IncrementAssignment_9 )
            // InternalOptimind.g:1580:3: rule__For__IncrementAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__For__IncrementAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getIncrementAssignment_9()); 

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
    // InternalOptimind.g:1588:1: rule__For__Group__10 : rule__For__Group__10__Impl rule__For__Group__11 ;
    public final void rule__For__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1592:1: ( rule__For__Group__10__Impl rule__For__Group__11 )
            // InternalOptimind.g:1593:2: rule__For__Group__10__Impl rule__For__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__For__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__11();

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
    // InternalOptimind.g:1600:1: rule__For__Group__10__Impl : ( 'do' ) ;
    public final void rule__For__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1604:1: ( ( 'do' ) )
            // InternalOptimind.g:1605:1: ( 'do' )
            {
            // InternalOptimind.g:1605:1: ( 'do' )
            // InternalOptimind.g:1606:2: 'do'
            {
             before(grammarAccess.getForAccess().getDoKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getForAccess().getDoKeyword_10()); 

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


    // $ANTLR start "rule__For__Group__11"
    // InternalOptimind.g:1615:1: rule__For__Group__11 : rule__For__Group__11__Impl rule__For__Group__12 ;
    public final void rule__For__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1619:1: ( rule__For__Group__11__Impl rule__For__Group__12 )
            // InternalOptimind.g:1620:2: rule__For__Group__11__Impl rule__For__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__For__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__12();

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
    // $ANTLR end "rule__For__Group__11"


    // $ANTLR start "rule__For__Group__11__Impl"
    // InternalOptimind.g:1627:1: rule__For__Group__11__Impl : ( ( rule__For__AbstracttaskAssignment_11 ) ) ;
    public final void rule__For__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1631:1: ( ( ( rule__For__AbstracttaskAssignment_11 ) ) )
            // InternalOptimind.g:1632:1: ( ( rule__For__AbstracttaskAssignment_11 ) )
            {
            // InternalOptimind.g:1632:1: ( ( rule__For__AbstracttaskAssignment_11 ) )
            // InternalOptimind.g:1633:2: ( rule__For__AbstracttaskAssignment_11 )
            {
             before(grammarAccess.getForAccess().getAbstracttaskAssignment_11()); 
            // InternalOptimind.g:1634:2: ( rule__For__AbstracttaskAssignment_11 )
            // InternalOptimind.g:1634:3: rule__For__AbstracttaskAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__For__AbstracttaskAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getAbstracttaskAssignment_11()); 

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
    // $ANTLR end "rule__For__Group__11__Impl"


    // $ANTLR start "rule__For__Group__12"
    // InternalOptimind.g:1642:1: rule__For__Group__12 : rule__For__Group__12__Impl ;
    public final void rule__For__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1646:1: ( rule__For__Group__12__Impl )
            // InternalOptimind.g:1647:2: rule__For__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__For__Group__12__Impl();

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
    // $ANTLR end "rule__For__Group__12"


    // $ANTLR start "rule__For__Group__12__Impl"
    // InternalOptimind.g:1653:1: rule__For__Group__12__Impl : ( '}' ) ;
    public final void rule__For__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1657:1: ( ( '}' ) )
            // InternalOptimind.g:1658:1: ( '}' )
            {
            // InternalOptimind.g:1658:1: ( '}' )
            // InternalOptimind.g:1659:2: '}'
            {
             before(grammarAccess.getForAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getForAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__For__Group__12__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalOptimind.g:1669:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1673:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalOptimind.g:1674:2: rule__While__Group__0__Impl rule__While__Group__1
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
    // InternalOptimind.g:1681:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1685:1: ( ( () ) )
            // InternalOptimind.g:1686:1: ( () )
            {
            // InternalOptimind.g:1686:1: ( () )
            // InternalOptimind.g:1687:2: ()
            {
             before(grammarAccess.getWhileAccess().getWhileStatementAction_0()); 
            // InternalOptimind.g:1688:2: ()
            // InternalOptimind.g:1688:3: 
            {
            }

             after(grammarAccess.getWhileAccess().getWhileStatementAction_0()); 

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
    // InternalOptimind.g:1696:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1700:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalOptimind.g:1701:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalOptimind.g:1708:1: rule__While__Group__1__Impl : ( 'While' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1712:1: ( ( 'While' ) )
            // InternalOptimind.g:1713:1: ( 'While' )
            {
            // InternalOptimind.g:1713:1: ( 'While' )
            // InternalOptimind.g:1714:2: 'While'
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
    // InternalOptimind.g:1723:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1727:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalOptimind.g:1728:2: rule__While__Group__2__Impl rule__While__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalOptimind.g:1735:1: rule__While__Group__2__Impl : ( ( rule__While__NameAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1739:1: ( ( ( rule__While__NameAssignment_2 ) ) )
            // InternalOptimind.g:1740:1: ( ( rule__While__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1740:1: ( ( rule__While__NameAssignment_2 ) )
            // InternalOptimind.g:1741:2: ( rule__While__NameAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1742:2: ( rule__While__NameAssignment_2 )
            // InternalOptimind.g:1742:3: rule__While__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__While__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getNameAssignment_2()); 

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
    // InternalOptimind.g:1750:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1754:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalOptimind.g:1755:2: rule__While__Group__3__Impl rule__While__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:1762:1: rule__While__Group__3__Impl : ( '{' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1766:1: ( ( '{' ) )
            // InternalOptimind.g:1767:1: ( '{' )
            {
            // InternalOptimind.g:1767:1: ( '{' )
            // InternalOptimind.g:1768:2: '{'
            {
             before(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalOptimind.g:1777:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1781:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalOptimind.g:1782:2: rule__While__Group__4__Impl rule__While__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalOptimind.g:1789:1: rule__While__Group__4__Impl : ( 'condition' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1793:1: ( ( 'condition' ) )
            // InternalOptimind.g:1794:1: ( 'condition' )
            {
            // InternalOptimind.g:1794:1: ( 'condition' )
            // InternalOptimind.g:1795:2: 'condition'
            {
             before(grammarAccess.getWhileAccess().getConditionKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getConditionKeyword_4()); 

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
    // InternalOptimind.g:1804:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1808:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalOptimind.g:1809:2: rule__While__Group__5__Impl rule__While__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalOptimind.g:1816:1: rule__While__Group__5__Impl : ( ( rule__While__ConditionAssignment_5 ) ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1820:1: ( ( ( rule__While__ConditionAssignment_5 ) ) )
            // InternalOptimind.g:1821:1: ( ( rule__While__ConditionAssignment_5 ) )
            {
            // InternalOptimind.g:1821:1: ( ( rule__While__ConditionAssignment_5 ) )
            // InternalOptimind.g:1822:2: ( rule__While__ConditionAssignment_5 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_5()); 
            // InternalOptimind.g:1823:2: ( rule__While__ConditionAssignment_5 )
            // InternalOptimind.g:1823:3: rule__While__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionAssignment_5()); 

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
    // InternalOptimind.g:1831:1: rule__While__Group__6 : rule__While__Group__6__Impl rule__While__Group__7 ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1835:1: ( rule__While__Group__6__Impl rule__While__Group__7 )
            // InternalOptimind.g:1836:2: rule__While__Group__6__Impl rule__While__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__While__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__7();

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
    // InternalOptimind.g:1843:1: rule__While__Group__6__Impl : ( 'do' ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1847:1: ( ( 'do' ) )
            // InternalOptimind.g:1848:1: ( 'do' )
            {
            // InternalOptimind.g:1848:1: ( 'do' )
            // InternalOptimind.g:1849:2: 'do'
            {
             before(grammarAccess.getWhileAccess().getDoKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getDoKeyword_6()); 

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


    // $ANTLR start "rule__While__Group__7"
    // InternalOptimind.g:1858:1: rule__While__Group__7 : rule__While__Group__7__Impl rule__While__Group__8 ;
    public final void rule__While__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1862:1: ( rule__While__Group__7__Impl rule__While__Group__8 )
            // InternalOptimind.g:1863:2: rule__While__Group__7__Impl rule__While__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__While__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__8();

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
    // $ANTLR end "rule__While__Group__7"


    // $ANTLR start "rule__While__Group__7__Impl"
    // InternalOptimind.g:1870:1: rule__While__Group__7__Impl : ( ( rule__While__AbstracttaskAssignment_7 ) ) ;
    public final void rule__While__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1874:1: ( ( ( rule__While__AbstracttaskAssignment_7 ) ) )
            // InternalOptimind.g:1875:1: ( ( rule__While__AbstracttaskAssignment_7 ) )
            {
            // InternalOptimind.g:1875:1: ( ( rule__While__AbstracttaskAssignment_7 ) )
            // InternalOptimind.g:1876:2: ( rule__While__AbstracttaskAssignment_7 )
            {
             before(grammarAccess.getWhileAccess().getAbstracttaskAssignment_7()); 
            // InternalOptimind.g:1877:2: ( rule__While__AbstracttaskAssignment_7 )
            // InternalOptimind.g:1877:3: rule__While__AbstracttaskAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__While__AbstracttaskAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getAbstracttaskAssignment_7()); 

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
    // $ANTLR end "rule__While__Group__7__Impl"


    // $ANTLR start "rule__While__Group__8"
    // InternalOptimind.g:1885:1: rule__While__Group__8 : rule__While__Group__8__Impl ;
    public final void rule__While__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1889:1: ( rule__While__Group__8__Impl )
            // InternalOptimind.g:1890:2: rule__While__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__8__Impl();

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
    // $ANTLR end "rule__While__Group__8"


    // $ANTLR start "rule__While__Group__8__Impl"
    // InternalOptimind.g:1896:1: rule__While__Group__8__Impl : ( '}' ) ;
    public final void rule__While__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1900:1: ( ( '}' ) )
            // InternalOptimind.g:1901:1: ( '}' )
            {
            // InternalOptimind.g:1901:1: ( '}' )
            // InternalOptimind.g:1902:2: '}'
            {
             before(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__While__Group__8__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalOptimind.g:1912:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1916:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalOptimind.g:1917:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalOptimind.g:1924:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1928:1: ( ( () ) )
            // InternalOptimind.g:1929:1: ( () )
            {
            // InternalOptimind.g:1929:1: ( () )
            // InternalOptimind.g:1930:2: ()
            {
             before(grammarAccess.getIfAccess().getIfStatementAction_0()); 
            // InternalOptimind.g:1931:2: ()
            // InternalOptimind.g:1931:3: 
            {
            }

             after(grammarAccess.getIfAccess().getIfStatementAction_0()); 

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
    // InternalOptimind.g:1939:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1943:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalOptimind.g:1944:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalOptimind.g:1951:1: rule__If__Group__1__Impl : ( 'If' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1955:1: ( ( 'If' ) )
            // InternalOptimind.g:1956:1: ( 'If' )
            {
            // InternalOptimind.g:1956:1: ( 'If' )
            // InternalOptimind.g:1957:2: 'If'
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
    // InternalOptimind.g:1966:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1970:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalOptimind.g:1971:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalOptimind.g:1978:1: rule__If__Group__2__Impl : ( ( rule__If__NameAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1982:1: ( ( ( rule__If__NameAssignment_2 ) ) )
            // InternalOptimind.g:1983:1: ( ( rule__If__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1983:1: ( ( rule__If__NameAssignment_2 ) )
            // InternalOptimind.g:1984:2: ( rule__If__NameAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1985:2: ( rule__If__NameAssignment_2 )
            // InternalOptimind.g:1985:3: rule__If__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getNameAssignment_2()); 

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
    // InternalOptimind.g:1993:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1997:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalOptimind.g:1998:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:2005:1: rule__If__Group__3__Impl : ( '{' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2009:1: ( ( '{' ) )
            // InternalOptimind.g:2010:1: ( '{' )
            {
            // InternalOptimind.g:2010:1: ( '{' )
            // InternalOptimind.g:2011:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalOptimind.g:2020:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2024:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalOptimind.g:2025:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalOptimind.g:2032:1: rule__If__Group__4__Impl : ( 'condition' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2036:1: ( ( 'condition' ) )
            // InternalOptimind.g:2037:1: ( 'condition' )
            {
            // InternalOptimind.g:2037:1: ( 'condition' )
            // InternalOptimind.g:2038:2: 'condition'
            {
             before(grammarAccess.getIfAccess().getConditionKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getConditionKeyword_4()); 

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
    // InternalOptimind.g:2047:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2051:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalOptimind.g:2052:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalOptimind.g:2059:1: rule__If__Group__5__Impl : ( ( rule__If__ConditionAssignment_5 ) ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2063:1: ( ( ( rule__If__ConditionAssignment_5 ) ) )
            // InternalOptimind.g:2064:1: ( ( rule__If__ConditionAssignment_5 ) )
            {
            // InternalOptimind.g:2064:1: ( ( rule__If__ConditionAssignment_5 ) )
            // InternalOptimind.g:2065:2: ( rule__If__ConditionAssignment_5 )
            {
             before(grammarAccess.getIfAccess().getConditionAssignment_5()); 
            // InternalOptimind.g:2066:2: ( rule__If__ConditionAssignment_5 )
            // InternalOptimind.g:2066:3: rule__If__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionAssignment_5()); 

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
    // InternalOptimind.g:2074:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2078:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalOptimind.g:2079:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalOptimind.g:2086:1: rule__If__Group__6__Impl : ( 'then' ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2090:1: ( ( 'then' ) )
            // InternalOptimind.g:2091:1: ( 'then' )
            {
            // InternalOptimind.g:2091:1: ( 'then' )
            // InternalOptimind.g:2092:2: 'then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getThenKeyword_6()); 

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
    // InternalOptimind.g:2101:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2105:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalOptimind.g:2106:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__8();

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
    // InternalOptimind.g:2113:1: rule__If__Group__7__Impl : ( ( rule__If__ThenAssignment_7 ) ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2117:1: ( ( ( rule__If__ThenAssignment_7 ) ) )
            // InternalOptimind.g:2118:1: ( ( rule__If__ThenAssignment_7 ) )
            {
            // InternalOptimind.g:2118:1: ( ( rule__If__ThenAssignment_7 ) )
            // InternalOptimind.g:2119:2: ( rule__If__ThenAssignment_7 )
            {
             before(grammarAccess.getIfAccess().getThenAssignment_7()); 
            // InternalOptimind.g:2120:2: ( rule__If__ThenAssignment_7 )
            // InternalOptimind.g:2120:3: rule__If__ThenAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__If__ThenAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getThenAssignment_7()); 

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


    // $ANTLR start "rule__If__Group__8"
    // InternalOptimind.g:2128:1: rule__If__Group__8 : rule__If__Group__8__Impl rule__If__Group__9 ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2132:1: ( rule__If__Group__8__Impl rule__If__Group__9 )
            // InternalOptimind.g:2133:2: rule__If__Group__8__Impl rule__If__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__If__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__9();

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
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // InternalOptimind.g:2140:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2144:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalOptimind.g:2145:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalOptimind.g:2145:1: ( ( rule__If__Group_8__0 )? )
            // InternalOptimind.g:2146:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalOptimind.g:2147:2: ( rule__If__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:2147:3: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_8()); 

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
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group__9"
    // InternalOptimind.g:2155:1: rule__If__Group__9 : rule__If__Group__9__Impl ;
    public final void rule__If__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2159:1: ( rule__If__Group__9__Impl )
            // InternalOptimind.g:2160:2: rule__If__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__9__Impl();

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
    // $ANTLR end "rule__If__Group__9"


    // $ANTLR start "rule__If__Group__9__Impl"
    // InternalOptimind.g:2166:1: rule__If__Group__9__Impl : ( '}' ) ;
    public final void rule__If__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2170:1: ( ( '}' ) )
            // InternalOptimind.g:2171:1: ( '}' )
            {
            // InternalOptimind.g:2171:1: ( '}' )
            // InternalOptimind.g:2172:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__If__Group__9__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // InternalOptimind.g:2182:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2186:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalOptimind.g:2187:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__1();

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
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // InternalOptimind.g:2194:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2198:1: ( ( 'else' ) )
            // InternalOptimind.g:2199:1: ( 'else' )
            {
            // InternalOptimind.g:2199:1: ( 'else' )
            // InternalOptimind.g:2200:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 

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
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // InternalOptimind.g:2209:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2213:1: ( rule__If__Group_8__1__Impl )
            // InternalOptimind.g:2214:2: rule__If__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8__1__Impl();

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
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // InternalOptimind.g:2220:1: rule__If__Group_8__1__Impl : ( ( rule__If__ElseAssignment_8_1 ) ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2224:1: ( ( ( rule__If__ElseAssignment_8_1 ) ) )
            // InternalOptimind.g:2225:1: ( ( rule__If__ElseAssignment_8_1 ) )
            {
            // InternalOptimind.g:2225:1: ( ( rule__If__ElseAssignment_8_1 ) )
            // InternalOptimind.g:2226:2: ( rule__If__ElseAssignment_8_1 )
            {
             before(grammarAccess.getIfAccess().getElseAssignment_8_1()); 
            // InternalOptimind.g:2227:2: ( rule__If__ElseAssignment_8_1 )
            // InternalOptimind.g:2227:3: rule__If__ElseAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElseAssignment_8_1()); 

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
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__BaseTask__Group__0"
    // InternalOptimind.g:2236:1: rule__BaseTask__Group__0 : rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 ;
    public final void rule__BaseTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2240:1: ( rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 )
            // InternalOptimind.g:2241:2: rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1
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
    // InternalOptimind.g:2248:1: rule__BaseTask__Group__0__Impl : ( () ) ;
    public final void rule__BaseTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2252:1: ( ( () ) )
            // InternalOptimind.g:2253:1: ( () )
            {
            // InternalOptimind.g:2253:1: ( () )
            // InternalOptimind.g:2254:2: ()
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskAction_0()); 
            // InternalOptimind.g:2255:2: ()
            // InternalOptimind.g:2255:3: 
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
    // InternalOptimind.g:2263:1: rule__BaseTask__Group__1 : rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 ;
    public final void rule__BaseTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2267:1: ( rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 )
            // InternalOptimind.g:2268:2: rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2
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
    // InternalOptimind.g:2275:1: rule__BaseTask__Group__1__Impl : ( 'BaseTask' ) ;
    public final void rule__BaseTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2279:1: ( ( 'BaseTask' ) )
            // InternalOptimind.g:2280:1: ( 'BaseTask' )
            {
            // InternalOptimind.g:2280:1: ( 'BaseTask' )
            // InternalOptimind.g:2281:2: 'BaseTask'
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
    // InternalOptimind.g:2290:1: rule__BaseTask__Group__2 : rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 ;
    public final void rule__BaseTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2294:1: ( rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 )
            // InternalOptimind.g:2295:2: rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3
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
    // InternalOptimind.g:2302:1: rule__BaseTask__Group__2__Impl : ( ( rule__BaseTask__NameAssignment_2 ) ) ;
    public final void rule__BaseTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2306:1: ( ( ( rule__BaseTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2307:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2307:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            // InternalOptimind.g:2308:2: ( rule__BaseTask__NameAssignment_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2309:2: ( rule__BaseTask__NameAssignment_2 )
            // InternalOptimind.g:2309:3: rule__BaseTask__NameAssignment_2
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
    // InternalOptimind.g:2317:1: rule__BaseTask__Group__3 : rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 ;
    public final void rule__BaseTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2321:1: ( rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 )
            // InternalOptimind.g:2322:2: rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4
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
    // InternalOptimind.g:2329:1: rule__BaseTask__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2333:1: ( ( '{' ) )
            // InternalOptimind.g:2334:1: ( '{' )
            {
            // InternalOptimind.g:2334:1: ( '{' )
            // InternalOptimind.g:2335:2: '{'
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
    // InternalOptimind.g:2344:1: rule__BaseTask__Group__4 : rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 ;
    public final void rule__BaseTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2348:1: ( rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 )
            // InternalOptimind.g:2349:2: rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5
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
    // InternalOptimind.g:2356:1: rule__BaseTask__Group__4__Impl : ( ( rule__BaseTask__Group_4__0 )? ) ;
    public final void rule__BaseTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2360:1: ( ( ( rule__BaseTask__Group_4__0 )? ) )
            // InternalOptimind.g:2361:1: ( ( rule__BaseTask__Group_4__0 )? )
            {
            // InternalOptimind.g:2361:1: ( ( rule__BaseTask__Group_4__0 )? )
            // InternalOptimind.g:2362:2: ( rule__BaseTask__Group_4__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2363:2: ( rule__BaseTask__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptimind.g:2363:3: rule__BaseTask__Group_4__0
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
    // InternalOptimind.g:2371:1: rule__BaseTask__Group__5 : rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 ;
    public final void rule__BaseTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2375:1: ( rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 )
            // InternalOptimind.g:2376:2: rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6
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
    // InternalOptimind.g:2383:1: rule__BaseTask__Group__5__Impl : ( ( rule__BaseTask__Group_5__0 )? ) ;
    public final void rule__BaseTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2387:1: ( ( ( rule__BaseTask__Group_5__0 )? ) )
            // InternalOptimind.g:2388:1: ( ( rule__BaseTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2388:1: ( ( rule__BaseTask__Group_5__0 )? )
            // InternalOptimind.g:2389:2: ( rule__BaseTask__Group_5__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2390:2: ( rule__BaseTask__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptimind.g:2390:3: rule__BaseTask__Group_5__0
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
    // InternalOptimind.g:2398:1: rule__BaseTask__Group__6 : rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 ;
    public final void rule__BaseTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2402:1: ( rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 )
            // InternalOptimind.g:2403:2: rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7
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
    // InternalOptimind.g:2410:1: rule__BaseTask__Group__6__Impl : ( ( rule__BaseTask__Group_6__0 )? ) ;
    public final void rule__BaseTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2414:1: ( ( ( rule__BaseTask__Group_6__0 )? ) )
            // InternalOptimind.g:2415:1: ( ( rule__BaseTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2415:1: ( ( rule__BaseTask__Group_6__0 )? )
            // InternalOptimind.g:2416:2: ( rule__BaseTask__Group_6__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2417:2: ( rule__BaseTask__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptimind.g:2417:3: rule__BaseTask__Group_6__0
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
    // InternalOptimind.g:2425:1: rule__BaseTask__Group__7 : rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 ;
    public final void rule__BaseTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2429:1: ( rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 )
            // InternalOptimind.g:2430:2: rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8
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
    // InternalOptimind.g:2437:1: rule__BaseTask__Group__7__Impl : ( ( rule__BaseTask__Alternatives_7 )* ) ;
    public final void rule__BaseTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2441:1: ( ( ( rule__BaseTask__Alternatives_7 )* ) )
            // InternalOptimind.g:2442:1: ( ( rule__BaseTask__Alternatives_7 )* )
            {
            // InternalOptimind.g:2442:1: ( ( rule__BaseTask__Alternatives_7 )* )
            // InternalOptimind.g:2443:2: ( rule__BaseTask__Alternatives_7 )*
            {
             before(grammarAccess.getBaseTaskAccess().getAlternatives_7()); 
            // InternalOptimind.g:2444:2: ( rule__BaseTask__Alternatives_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24||LA19_0==29||LA19_0==31||LA19_0==34||LA19_0==39||LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptimind.g:2444:3: rule__BaseTask__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__BaseTask__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getBaseTaskAccess().getAlternatives_7()); 

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
    // InternalOptimind.g:2452:1: rule__BaseTask__Group__8 : rule__BaseTask__Group__8__Impl ;
    public final void rule__BaseTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2456:1: ( rule__BaseTask__Group__8__Impl )
            // InternalOptimind.g:2457:2: rule__BaseTask__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__Group__8__Impl();

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
    // InternalOptimind.g:2463:1: rule__BaseTask__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2467:1: ( ( '}' ) )
            // InternalOptimind.g:2468:1: ( '}' )
            {
            // InternalOptimind.g:2468:1: ( '}' )
            // InternalOptimind.g:2469:2: '}'
            {
             before(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__BaseTask__Group_4__0"
    // InternalOptimind.g:2479:1: rule__BaseTask__Group_4__0 : rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 ;
    public final void rule__BaseTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2483:1: ( rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 )
            // InternalOptimind.g:2484:2: rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:2491:1: rule__BaseTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__BaseTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2495:1: ( ( 'status' ) )
            // InternalOptimind.g:2496:1: ( 'status' )
            {
            // InternalOptimind.g:2496:1: ( 'status' )
            // InternalOptimind.g:2497:2: 'status'
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
    // InternalOptimind.g:2506:1: rule__BaseTask__Group_4__1 : rule__BaseTask__Group_4__1__Impl ;
    public final void rule__BaseTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2510:1: ( rule__BaseTask__Group_4__1__Impl )
            // InternalOptimind.g:2511:2: rule__BaseTask__Group_4__1__Impl
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
    // InternalOptimind.g:2517:1: rule__BaseTask__Group_4__1__Impl : ( ( rule__BaseTask__StatusAssignment_4_1 ) ) ;
    public final void rule__BaseTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2521:1: ( ( ( rule__BaseTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:2522:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:2522:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:2523:2: ( rule__BaseTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:2524:2: ( rule__BaseTask__StatusAssignment_4_1 )
            // InternalOptimind.g:2524:3: rule__BaseTask__StatusAssignment_4_1
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
    // InternalOptimind.g:2533:1: rule__BaseTask__Group_5__0 : rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 ;
    public final void rule__BaseTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2537:1: ( rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 )
            // InternalOptimind.g:2538:2: rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1
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
    // InternalOptimind.g:2545:1: rule__BaseTask__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__BaseTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2549:1: ( ( 'inputs' ) )
            // InternalOptimind.g:2550:1: ( 'inputs' )
            {
            // InternalOptimind.g:2550:1: ( 'inputs' )
            // InternalOptimind.g:2551:2: 'inputs'
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
    // InternalOptimind.g:2560:1: rule__BaseTask__Group_5__1 : rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 ;
    public final void rule__BaseTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2564:1: ( rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 )
            // InternalOptimind.g:2565:2: rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:2572:1: rule__BaseTask__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2576:1: ( ( '{' ) )
            // InternalOptimind.g:2577:1: ( '{' )
            {
            // InternalOptimind.g:2577:1: ( '{' )
            // InternalOptimind.g:2578:2: '{'
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
    // InternalOptimind.g:2587:1: rule__BaseTask__Group_5__2 : rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 ;
    public final void rule__BaseTask__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2591:1: ( rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 )
            // InternalOptimind.g:2592:2: rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalOptimind.g:2599:1: rule__BaseTask__Group_5__2__Impl : ( ( rule__BaseTask__InputsAssignment_5_2 ) ) ;
    public final void rule__BaseTask__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2603:1: ( ( ( rule__BaseTask__InputsAssignment_5_2 ) ) )
            // InternalOptimind.g:2604:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            {
            // InternalOptimind.g:2604:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            // InternalOptimind.g:2605:2: ( rule__BaseTask__InputsAssignment_5_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2()); 
            // InternalOptimind.g:2606:2: ( rule__BaseTask__InputsAssignment_5_2 )
            // InternalOptimind.g:2606:3: rule__BaseTask__InputsAssignment_5_2
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
    // InternalOptimind.g:2614:1: rule__BaseTask__Group_5__3 : rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 ;
    public final void rule__BaseTask__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2618:1: ( rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 )
            // InternalOptimind.g:2619:2: rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalOptimind.g:2626:1: rule__BaseTask__Group_5__3__Impl : ( ( rule__BaseTask__Group_5_3__0 )* ) ;
    public final void rule__BaseTask__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2630:1: ( ( ( rule__BaseTask__Group_5_3__0 )* ) )
            // InternalOptimind.g:2631:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            {
            // InternalOptimind.g:2631:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            // InternalOptimind.g:2632:2: ( rule__BaseTask__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5_3()); 
            // InternalOptimind.g:2633:2: ( rule__BaseTask__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOptimind.g:2633:3: rule__BaseTask__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalOptimind.g:2641:1: rule__BaseTask__Group_5__4 : rule__BaseTask__Group_5__4__Impl ;
    public final void rule__BaseTask__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2645:1: ( rule__BaseTask__Group_5__4__Impl )
            // InternalOptimind.g:2646:2: rule__BaseTask__Group_5__4__Impl
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
    // InternalOptimind.g:2652:1: rule__BaseTask__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2656:1: ( ( '}' ) )
            // InternalOptimind.g:2657:1: ( '}' )
            {
            // InternalOptimind.g:2657:1: ( '}' )
            // InternalOptimind.g:2658:2: '}'
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
    // InternalOptimind.g:2668:1: rule__BaseTask__Group_5_3__0 : rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 ;
    public final void rule__BaseTask__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2672:1: ( rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 )
            // InternalOptimind.g:2673:2: rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:2680:1: rule__BaseTask__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2684:1: ( ( ',' ) )
            // InternalOptimind.g:2685:1: ( ',' )
            {
            // InternalOptimind.g:2685:1: ( ',' )
            // InternalOptimind.g:2686:2: ','
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
    // InternalOptimind.g:2695:1: rule__BaseTask__Group_5_3__1 : rule__BaseTask__Group_5_3__1__Impl ;
    public final void rule__BaseTask__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2699:1: ( rule__BaseTask__Group_5_3__1__Impl )
            // InternalOptimind.g:2700:2: rule__BaseTask__Group_5_3__1__Impl
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
    // InternalOptimind.g:2706:1: rule__BaseTask__Group_5_3__1__Impl : ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) ;
    public final void rule__BaseTask__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2710:1: ( ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) )
            // InternalOptimind.g:2711:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            {
            // InternalOptimind.g:2711:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            // InternalOptimind.g:2712:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1()); 
            // InternalOptimind.g:2713:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            // InternalOptimind.g:2713:3: rule__BaseTask__InputsAssignment_5_3_1
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
    // InternalOptimind.g:2722:1: rule__BaseTask__Group_6__0 : rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 ;
    public final void rule__BaseTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2726:1: ( rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 )
            // InternalOptimind.g:2727:2: rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1
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
    // InternalOptimind.g:2734:1: rule__BaseTask__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__BaseTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2738:1: ( ( 'outputs' ) )
            // InternalOptimind.g:2739:1: ( 'outputs' )
            {
            // InternalOptimind.g:2739:1: ( 'outputs' )
            // InternalOptimind.g:2740:2: 'outputs'
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
    // InternalOptimind.g:2749:1: rule__BaseTask__Group_6__1 : rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 ;
    public final void rule__BaseTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2753:1: ( rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 )
            // InternalOptimind.g:2754:2: rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2
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
    // InternalOptimind.g:2761:1: rule__BaseTask__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2765:1: ( ( '{' ) )
            // InternalOptimind.g:2766:1: ( '{' )
            {
            // InternalOptimind.g:2766:1: ( '{' )
            // InternalOptimind.g:2767:2: '{'
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
    // InternalOptimind.g:2776:1: rule__BaseTask__Group_6__2 : rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 ;
    public final void rule__BaseTask__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2780:1: ( rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 )
            // InternalOptimind.g:2781:2: rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalOptimind.g:2788:1: rule__BaseTask__Group_6__2__Impl : ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) ;
    public final void rule__BaseTask__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2792:1: ( ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) )
            // InternalOptimind.g:2793:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            {
            // InternalOptimind.g:2793:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            // InternalOptimind.g:2794:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2()); 
            // InternalOptimind.g:2795:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            // InternalOptimind.g:2795:3: rule__BaseTask__OutputsAssignment_6_2
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
    // InternalOptimind.g:2803:1: rule__BaseTask__Group_6__3 : rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 ;
    public final void rule__BaseTask__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2807:1: ( rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 )
            // InternalOptimind.g:2808:2: rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalOptimind.g:2815:1: rule__BaseTask__Group_6__3__Impl : ( ( rule__BaseTask__Group_6_3__0 )* ) ;
    public final void rule__BaseTask__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2819:1: ( ( ( rule__BaseTask__Group_6_3__0 )* ) )
            // InternalOptimind.g:2820:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            {
            // InternalOptimind.g:2820:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            // InternalOptimind.g:2821:2: ( rule__BaseTask__Group_6_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6_3()); 
            // InternalOptimind.g:2822:2: ( rule__BaseTask__Group_6_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOptimind.g:2822:3: rule__BaseTask__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_31);
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
    // InternalOptimind.g:2830:1: rule__BaseTask__Group_6__4 : rule__BaseTask__Group_6__4__Impl ;
    public final void rule__BaseTask__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2834:1: ( rule__BaseTask__Group_6__4__Impl )
            // InternalOptimind.g:2835:2: rule__BaseTask__Group_6__4__Impl
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
    // InternalOptimind.g:2841:1: rule__BaseTask__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2845:1: ( ( '}' ) )
            // InternalOptimind.g:2846:1: ( '}' )
            {
            // InternalOptimind.g:2846:1: ( '}' )
            // InternalOptimind.g:2847:2: '}'
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
    // InternalOptimind.g:2857:1: rule__BaseTask__Group_6_3__0 : rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 ;
    public final void rule__BaseTask__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2861:1: ( rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 )
            // InternalOptimind.g:2862:2: rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1
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
    // InternalOptimind.g:2869:1: rule__BaseTask__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2873:1: ( ( ',' ) )
            // InternalOptimind.g:2874:1: ( ',' )
            {
            // InternalOptimind.g:2874:1: ( ',' )
            // InternalOptimind.g:2875:2: ','
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
    // InternalOptimind.g:2884:1: rule__BaseTask__Group_6_3__1 : rule__BaseTask__Group_6_3__1__Impl ;
    public final void rule__BaseTask__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2888:1: ( rule__BaseTask__Group_6_3__1__Impl )
            // InternalOptimind.g:2889:2: rule__BaseTask__Group_6_3__1__Impl
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
    // InternalOptimind.g:2895:1: rule__BaseTask__Group_6_3__1__Impl : ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) ;
    public final void rule__BaseTask__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2899:1: ( ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) )
            // InternalOptimind.g:2900:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            {
            // InternalOptimind.g:2900:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            // InternalOptimind.g:2901:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1()); 
            // InternalOptimind.g:2902:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            // InternalOptimind.g:2902:3: rule__BaseTask__OutputsAssignment_6_3_1
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


    // $ANTLR start "rule__LibraryTask__Group__0"
    // InternalOptimind.g:2911:1: rule__LibraryTask__Group__0 : rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 ;
    public final void rule__LibraryTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2915:1: ( rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 )
            // InternalOptimind.g:2916:2: rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1
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
    // InternalOptimind.g:2923:1: rule__LibraryTask__Group__0__Impl : ( () ) ;
    public final void rule__LibraryTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2927:1: ( ( () ) )
            // InternalOptimind.g:2928:1: ( () )
            {
            // InternalOptimind.g:2928:1: ( () )
            // InternalOptimind.g:2929:2: ()
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0()); 
            // InternalOptimind.g:2930:2: ()
            // InternalOptimind.g:2930:3: 
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
    // InternalOptimind.g:2938:1: rule__LibraryTask__Group__1 : rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 ;
    public final void rule__LibraryTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2942:1: ( rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 )
            // InternalOptimind.g:2943:2: rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2
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
    // InternalOptimind.g:2950:1: rule__LibraryTask__Group__1__Impl : ( 'LibraryTask' ) ;
    public final void rule__LibraryTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2954:1: ( ( 'LibraryTask' ) )
            // InternalOptimind.g:2955:1: ( 'LibraryTask' )
            {
            // InternalOptimind.g:2955:1: ( 'LibraryTask' )
            // InternalOptimind.g:2956:2: 'LibraryTask'
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
    // InternalOptimind.g:2965:1: rule__LibraryTask__Group__2 : rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 ;
    public final void rule__LibraryTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2969:1: ( rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 )
            // InternalOptimind.g:2970:2: rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3
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
    // InternalOptimind.g:2977:1: rule__LibraryTask__Group__2__Impl : ( ( rule__LibraryTask__NameAssignment_2 ) ) ;
    public final void rule__LibraryTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2981:1: ( ( ( rule__LibraryTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2982:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2982:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            // InternalOptimind.g:2983:2: ( rule__LibraryTask__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2984:2: ( rule__LibraryTask__NameAssignment_2 )
            // InternalOptimind.g:2984:3: rule__LibraryTask__NameAssignment_2
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
    // InternalOptimind.g:2992:1: rule__LibraryTask__Group__3 : rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 ;
    public final void rule__LibraryTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2996:1: ( rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 )
            // InternalOptimind.g:2997:2: rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4
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
    // InternalOptimind.g:3004:1: rule__LibraryTask__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3008:1: ( ( '{' ) )
            // InternalOptimind.g:3009:1: ( '{' )
            {
            // InternalOptimind.g:3009:1: ( '{' )
            // InternalOptimind.g:3010:2: '{'
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
    // InternalOptimind.g:3019:1: rule__LibraryTask__Group__4 : rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 ;
    public final void rule__LibraryTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3023:1: ( rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 )
            // InternalOptimind.g:3024:2: rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5
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
    // InternalOptimind.g:3031:1: rule__LibraryTask__Group__4__Impl : ( ( rule__LibraryTask__Group_4__0 )? ) ;
    public final void rule__LibraryTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3035:1: ( ( ( rule__LibraryTask__Group_4__0 )? ) )
            // InternalOptimind.g:3036:1: ( ( rule__LibraryTask__Group_4__0 )? )
            {
            // InternalOptimind.g:3036:1: ( ( rule__LibraryTask__Group_4__0 )? )
            // InternalOptimind.g:3037:2: ( rule__LibraryTask__Group_4__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_4()); 
            // InternalOptimind.g:3038:2: ( rule__LibraryTask__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptimind.g:3038:3: rule__LibraryTask__Group_4__0
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
    // InternalOptimind.g:3046:1: rule__LibraryTask__Group__5 : rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 ;
    public final void rule__LibraryTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3050:1: ( rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 )
            // InternalOptimind.g:3051:2: rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6
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
    // InternalOptimind.g:3058:1: rule__LibraryTask__Group__5__Impl : ( ( rule__LibraryTask__Group_5__0 )? ) ;
    public final void rule__LibraryTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3062:1: ( ( ( rule__LibraryTask__Group_5__0 )? ) )
            // InternalOptimind.g:3063:1: ( ( rule__LibraryTask__Group_5__0 )? )
            {
            // InternalOptimind.g:3063:1: ( ( rule__LibraryTask__Group_5__0 )? )
            // InternalOptimind.g:3064:2: ( rule__LibraryTask__Group_5__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_5()); 
            // InternalOptimind.g:3065:2: ( rule__LibraryTask__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=43 && LA23_0<=44)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptimind.g:3065:3: rule__LibraryTask__Group_5__0
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
    // InternalOptimind.g:3073:1: rule__LibraryTask__Group__6 : rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 ;
    public final void rule__LibraryTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3077:1: ( rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 )
            // InternalOptimind.g:3078:2: rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7
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
    // InternalOptimind.g:3085:1: rule__LibraryTask__Group__6__Impl : ( ( rule__LibraryTask__Group_6__0 )? ) ;
    public final void rule__LibraryTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3089:1: ( ( ( rule__LibraryTask__Group_6__0 )? ) )
            // InternalOptimind.g:3090:1: ( ( rule__LibraryTask__Group_6__0 )? )
            {
            // InternalOptimind.g:3090:1: ( ( rule__LibraryTask__Group_6__0 )? )
            // InternalOptimind.g:3091:2: ( rule__LibraryTask__Group_6__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_6()); 
            // InternalOptimind.g:3092:2: ( rule__LibraryTask__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptimind.g:3092:3: rule__LibraryTask__Group_6__0
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
    // InternalOptimind.g:3100:1: rule__LibraryTask__Group__7 : rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 ;
    public final void rule__LibraryTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3104:1: ( rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 )
            // InternalOptimind.g:3105:2: rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8
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
    // InternalOptimind.g:3112:1: rule__LibraryTask__Group__7__Impl : ( ( rule__LibraryTask__Group_7__0 )? ) ;
    public final void rule__LibraryTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3116:1: ( ( ( rule__LibraryTask__Group_7__0 )? ) )
            // InternalOptimind.g:3117:1: ( ( rule__LibraryTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3117:1: ( ( rule__LibraryTask__Group_7__0 )? )
            // InternalOptimind.g:3118:2: ( rule__LibraryTask__Group_7__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3119:2: ( rule__LibraryTask__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptimind.g:3119:3: rule__LibraryTask__Group_7__0
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
    // InternalOptimind.g:3127:1: rule__LibraryTask__Group__8 : rule__LibraryTask__Group__8__Impl ;
    public final void rule__LibraryTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3131:1: ( rule__LibraryTask__Group__8__Impl )
            // InternalOptimind.g:3132:2: rule__LibraryTask__Group__8__Impl
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
    // InternalOptimind.g:3138:1: rule__LibraryTask__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3142:1: ( ( '}' ) )
            // InternalOptimind.g:3143:1: ( '}' )
            {
            // InternalOptimind.g:3143:1: ( '}' )
            // InternalOptimind.g:3144:2: '}'
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
    // InternalOptimind.g:3154:1: rule__LibraryTask__Group_4__0 : rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 ;
    public final void rule__LibraryTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3158:1: ( rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 )
            // InternalOptimind.g:3159:2: rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:3166:1: rule__LibraryTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__LibraryTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3170:1: ( ( 'status' ) )
            // InternalOptimind.g:3171:1: ( 'status' )
            {
            // InternalOptimind.g:3171:1: ( 'status' )
            // InternalOptimind.g:3172:2: 'status'
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
    // InternalOptimind.g:3181:1: rule__LibraryTask__Group_4__1 : rule__LibraryTask__Group_4__1__Impl ;
    public final void rule__LibraryTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3185:1: ( rule__LibraryTask__Group_4__1__Impl )
            // InternalOptimind.g:3186:2: rule__LibraryTask__Group_4__1__Impl
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
    // InternalOptimind.g:3192:1: rule__LibraryTask__Group_4__1__Impl : ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) ;
    public final void rule__LibraryTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3196:1: ( ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3197:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3197:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3198:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3199:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3199:3: rule__LibraryTask__StatusAssignment_4_1
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
    // InternalOptimind.g:3208:1: rule__LibraryTask__Group_5__0 : rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 ;
    public final void rule__LibraryTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3212:1: ( rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 )
            // InternalOptimind.g:3213:2: rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:3220:1: rule__LibraryTask__Group_5__0__Impl : ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) ;
    public final void rule__LibraryTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3224:1: ( ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3225:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3225:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3226:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3227:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3227:3: rule__LibraryTask__InputsAssignment_5_0
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
    // InternalOptimind.g:3235:1: rule__LibraryTask__Group_5__1 : rule__LibraryTask__Group_5__1__Impl ;
    public final void rule__LibraryTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3239:1: ( rule__LibraryTask__Group_5__1__Impl )
            // InternalOptimind.g:3240:2: rule__LibraryTask__Group_5__1__Impl
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
    // InternalOptimind.g:3246:1: rule__LibraryTask__Group_5__1__Impl : ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) ;
    public final void rule__LibraryTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3250:1: ( ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3251:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3251:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3252:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3253:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=43 && LA26_0<=44)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOptimind.g:3253:3: rule__LibraryTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__LibraryTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalOptimind.g:3262:1: rule__LibraryTask__Group_6__0 : rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 ;
    public final void rule__LibraryTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3266:1: ( rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 )
            // InternalOptimind.g:3267:2: rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1
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
    // InternalOptimind.g:3274:1: rule__LibraryTask__Group_6__0__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__LibraryTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3278:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3279:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3279:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3280:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3281:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3281:3: rule__LibraryTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:3289:1: rule__LibraryTask__Group_6__1 : rule__LibraryTask__Group_6__1__Impl ;
    public final void rule__LibraryTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3293:1: ( rule__LibraryTask__Group_6__1__Impl )
            // InternalOptimind.g:3294:2: rule__LibraryTask__Group_6__1__Impl
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
    // InternalOptimind.g:3300:1: rule__LibraryTask__Group_6__1__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__LibraryTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3304:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3305:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3305:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3306:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3307:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOptimind.g:3307:3: rule__LibraryTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalOptimind.g:3316:1: rule__LibraryTask__Group_7__0 : rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 ;
    public final void rule__LibraryTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3320:1: ( rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 )
            // InternalOptimind.g:3321:2: rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1
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
    // InternalOptimind.g:3328:1: rule__LibraryTask__Group_7__0__Impl : ( 'Libraryfunction' ) ;
    public final void rule__LibraryTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3332:1: ( ( 'Libraryfunction' ) )
            // InternalOptimind.g:3333:1: ( 'Libraryfunction' )
            {
            // InternalOptimind.g:3333:1: ( 'Libraryfunction' )
            // InternalOptimind.g:3334:2: 'Libraryfunction'
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
    // InternalOptimind.g:3343:1: rule__LibraryTask__Group_7__1 : rule__LibraryTask__Group_7__1__Impl ;
    public final void rule__LibraryTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3347:1: ( rule__LibraryTask__Group_7__1__Impl )
            // InternalOptimind.g:3348:2: rule__LibraryTask__Group_7__1__Impl
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
    // InternalOptimind.g:3354:1: rule__LibraryTask__Group_7__1__Impl : ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) ;
    public final void rule__LibraryTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3358:1: ( ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) )
            // InternalOptimind.g:3359:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            {
            // InternalOptimind.g:3359:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            // InternalOptimind.g:3360:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1()); 
            // InternalOptimind.g:3361:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            // InternalOptimind.g:3361:3: rule__LibraryTask__LibraryfunctionAssignment_7_1
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
    // InternalOptimind.g:3370:1: rule__CustomTask__Group__0 : rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 ;
    public final void rule__CustomTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3374:1: ( rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 )
            // InternalOptimind.g:3375:2: rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1
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
    // InternalOptimind.g:3382:1: rule__CustomTask__Group__0__Impl : ( () ) ;
    public final void rule__CustomTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3386:1: ( ( () ) )
            // InternalOptimind.g:3387:1: ( () )
            {
            // InternalOptimind.g:3387:1: ( () )
            // InternalOptimind.g:3388:2: ()
            {
             before(grammarAccess.getCustomTaskAccess().getCustomTaskAction_0()); 
            // InternalOptimind.g:3389:2: ()
            // InternalOptimind.g:3389:3: 
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
    // InternalOptimind.g:3397:1: rule__CustomTask__Group__1 : rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 ;
    public final void rule__CustomTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3401:1: ( rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 )
            // InternalOptimind.g:3402:2: rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2
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
    // InternalOptimind.g:3409:1: rule__CustomTask__Group__1__Impl : ( 'Task' ) ;
    public final void rule__CustomTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3413:1: ( ( 'Task' ) )
            // InternalOptimind.g:3414:1: ( 'Task' )
            {
            // InternalOptimind.g:3414:1: ( 'Task' )
            // InternalOptimind.g:3415:2: 'Task'
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
    // InternalOptimind.g:3424:1: rule__CustomTask__Group__2 : rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 ;
    public final void rule__CustomTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3428:1: ( rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 )
            // InternalOptimind.g:3429:2: rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3
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
    // InternalOptimind.g:3436:1: rule__CustomTask__Group__2__Impl : ( ( rule__CustomTask__NameAssignment_2 ) ) ;
    public final void rule__CustomTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3440:1: ( ( ( rule__CustomTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:3441:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3441:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            // InternalOptimind.g:3442:2: ( rule__CustomTask__NameAssignment_2 )
            {
             before(grammarAccess.getCustomTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3443:2: ( rule__CustomTask__NameAssignment_2 )
            // InternalOptimind.g:3443:3: rule__CustomTask__NameAssignment_2
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
    // InternalOptimind.g:3451:1: rule__CustomTask__Group__3 : rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 ;
    public final void rule__CustomTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3455:1: ( rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 )
            // InternalOptimind.g:3456:2: rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4
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
    // InternalOptimind.g:3463:1: rule__CustomTask__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3467:1: ( ( '{' ) )
            // InternalOptimind.g:3468:1: ( '{' )
            {
            // InternalOptimind.g:3468:1: ( '{' )
            // InternalOptimind.g:3469:2: '{'
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
    // InternalOptimind.g:3478:1: rule__CustomTask__Group__4 : rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 ;
    public final void rule__CustomTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3482:1: ( rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 )
            // InternalOptimind.g:3483:2: rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5
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
    // InternalOptimind.g:3490:1: rule__CustomTask__Group__4__Impl : ( ( rule__CustomTask__Group_4__0 )? ) ;
    public final void rule__CustomTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3494:1: ( ( ( rule__CustomTask__Group_4__0 )? ) )
            // InternalOptimind.g:3495:1: ( ( rule__CustomTask__Group_4__0 )? )
            {
            // InternalOptimind.g:3495:1: ( ( rule__CustomTask__Group_4__0 )? )
            // InternalOptimind.g:3496:2: ( rule__CustomTask__Group_4__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_4()); 
            // InternalOptimind.g:3497:2: ( rule__CustomTask__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptimind.g:3497:3: rule__CustomTask__Group_4__0
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
    // InternalOptimind.g:3505:1: rule__CustomTask__Group__5 : rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 ;
    public final void rule__CustomTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3509:1: ( rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 )
            // InternalOptimind.g:3510:2: rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6
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
    // InternalOptimind.g:3517:1: rule__CustomTask__Group__5__Impl : ( ( rule__CustomTask__Group_5__0 )? ) ;
    public final void rule__CustomTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3521:1: ( ( ( rule__CustomTask__Group_5__0 )? ) )
            // InternalOptimind.g:3522:1: ( ( rule__CustomTask__Group_5__0 )? )
            {
            // InternalOptimind.g:3522:1: ( ( rule__CustomTask__Group_5__0 )? )
            // InternalOptimind.g:3523:2: ( rule__CustomTask__Group_5__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_5()); 
            // InternalOptimind.g:3524:2: ( rule__CustomTask__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=43 && LA29_0<=44)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimind.g:3524:3: rule__CustomTask__Group_5__0
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
    // InternalOptimind.g:3532:1: rule__CustomTask__Group__6 : rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 ;
    public final void rule__CustomTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3536:1: ( rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 )
            // InternalOptimind.g:3537:2: rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7
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
    // InternalOptimind.g:3544:1: rule__CustomTask__Group__6__Impl : ( ( rule__CustomTask__Group_6__0 )? ) ;
    public final void rule__CustomTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3548:1: ( ( ( rule__CustomTask__Group_6__0 )? ) )
            // InternalOptimind.g:3549:1: ( ( rule__CustomTask__Group_6__0 )? )
            {
            // InternalOptimind.g:3549:1: ( ( rule__CustomTask__Group_6__0 )? )
            // InternalOptimind.g:3550:2: ( rule__CustomTask__Group_6__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_6()); 
            // InternalOptimind.g:3551:2: ( rule__CustomTask__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimind.g:3551:3: rule__CustomTask__Group_6__0
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
    // InternalOptimind.g:3559:1: rule__CustomTask__Group__7 : rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 ;
    public final void rule__CustomTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3563:1: ( rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 )
            // InternalOptimind.g:3564:2: rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8
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
    // InternalOptimind.g:3571:1: rule__CustomTask__Group__7__Impl : ( ( rule__CustomTask__Group_7__0 )? ) ;
    public final void rule__CustomTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3575:1: ( ( ( rule__CustomTask__Group_7__0 )? ) )
            // InternalOptimind.g:3576:1: ( ( rule__CustomTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3576:1: ( ( rule__CustomTask__Group_7__0 )? )
            // InternalOptimind.g:3577:2: ( rule__CustomTask__Group_7__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3578:2: ( rule__CustomTask__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOptimind.g:3578:3: rule__CustomTask__Group_7__0
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
    // InternalOptimind.g:3586:1: rule__CustomTask__Group__8 : rule__CustomTask__Group__8__Impl ;
    public final void rule__CustomTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3590:1: ( rule__CustomTask__Group__8__Impl )
            // InternalOptimind.g:3591:2: rule__CustomTask__Group__8__Impl
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
    // InternalOptimind.g:3597:1: rule__CustomTask__Group__8__Impl : ( '}' ) ;
    public final void rule__CustomTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3601:1: ( ( '}' ) )
            // InternalOptimind.g:3602:1: ( '}' )
            {
            // InternalOptimind.g:3602:1: ( '}' )
            // InternalOptimind.g:3603:2: '}'
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
    // InternalOptimind.g:3613:1: rule__CustomTask__Group_4__0 : rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 ;
    public final void rule__CustomTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3617:1: ( rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 )
            // InternalOptimind.g:3618:2: rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:3625:1: rule__CustomTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__CustomTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3629:1: ( ( 'status' ) )
            // InternalOptimind.g:3630:1: ( 'status' )
            {
            // InternalOptimind.g:3630:1: ( 'status' )
            // InternalOptimind.g:3631:2: 'status'
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
    // InternalOptimind.g:3640:1: rule__CustomTask__Group_4__1 : rule__CustomTask__Group_4__1__Impl ;
    public final void rule__CustomTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3644:1: ( rule__CustomTask__Group_4__1__Impl )
            // InternalOptimind.g:3645:2: rule__CustomTask__Group_4__1__Impl
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
    // InternalOptimind.g:3651:1: rule__CustomTask__Group_4__1__Impl : ( ( rule__CustomTask__StatusAssignment_4_1 ) ) ;
    public final void rule__CustomTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3655:1: ( ( ( rule__CustomTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3656:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3656:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3657:2: ( rule__CustomTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3658:2: ( rule__CustomTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3658:3: rule__CustomTask__StatusAssignment_4_1
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
    // InternalOptimind.g:3667:1: rule__CustomTask__Group_5__0 : rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 ;
    public final void rule__CustomTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3671:1: ( rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 )
            // InternalOptimind.g:3672:2: rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:3679:1: rule__CustomTask__Group_5__0__Impl : ( ( rule__CustomTask__InputsAssignment_5_0 ) ) ;
    public final void rule__CustomTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3683:1: ( ( ( rule__CustomTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3684:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3684:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3685:2: ( rule__CustomTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3686:2: ( rule__CustomTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3686:3: rule__CustomTask__InputsAssignment_5_0
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
    // InternalOptimind.g:3694:1: rule__CustomTask__Group_5__1 : rule__CustomTask__Group_5__1__Impl ;
    public final void rule__CustomTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3698:1: ( rule__CustomTask__Group_5__1__Impl )
            // InternalOptimind.g:3699:2: rule__CustomTask__Group_5__1__Impl
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
    // InternalOptimind.g:3705:1: rule__CustomTask__Group_5__1__Impl : ( ( rule__CustomTask__InputsAssignment_5_1 )* ) ;
    public final void rule__CustomTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3709:1: ( ( ( rule__CustomTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3710:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3710:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3711:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3712:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=43 && LA32_0<=44)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOptimind.g:3712:3: rule__CustomTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CustomTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalOptimind.g:3721:1: rule__CustomTask__Group_6__0 : rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 ;
    public final void rule__CustomTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3725:1: ( rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 )
            // InternalOptimind.g:3726:2: rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1
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
    // InternalOptimind.g:3733:1: rule__CustomTask__Group_6__0__Impl : ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__CustomTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3737:1: ( ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3738:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3738:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3739:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3740:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3740:3: rule__CustomTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:3748:1: rule__CustomTask__Group_6__1 : rule__CustomTask__Group_6__1__Impl ;
    public final void rule__CustomTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3752:1: ( rule__CustomTask__Group_6__1__Impl )
            // InternalOptimind.g:3753:2: rule__CustomTask__Group_6__1__Impl
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
    // InternalOptimind.g:3759:1: rule__CustomTask__Group_6__1__Impl : ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__CustomTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3763:1: ( ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3764:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3764:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3765:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3766:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOptimind.g:3766:3: rule__CustomTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__CustomTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalOptimind.g:3775:1: rule__CustomTask__Group_7__0 : rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 ;
    public final void rule__CustomTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3779:1: ( rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 )
            // InternalOptimind.g:3780:2: rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1
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
    // InternalOptimind.g:3787:1: rule__CustomTask__Group_7__0__Impl : ( 'runner' ) ;
    public final void rule__CustomTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3791:1: ( ( 'runner' ) )
            // InternalOptimind.g:3792:1: ( 'runner' )
            {
            // InternalOptimind.g:3792:1: ( 'runner' )
            // InternalOptimind.g:3793:2: 'runner'
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
    // InternalOptimind.g:3802:1: rule__CustomTask__Group_7__1 : rule__CustomTask__Group_7__1__Impl ;
    public final void rule__CustomTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3806:1: ( rule__CustomTask__Group_7__1__Impl )
            // InternalOptimind.g:3807:2: rule__CustomTask__Group_7__1__Impl
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
    // InternalOptimind.g:3813:1: rule__CustomTask__Group_7__1__Impl : ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) ;
    public final void rule__CustomTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3817:1: ( ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) )
            // InternalOptimind.g:3818:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            {
            // InternalOptimind.g:3818:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            // InternalOptimind.g:3819:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1()); 
            // InternalOptimind.g:3820:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            // InternalOptimind.g:3820:3: rule__CustomTask__RunnerAssignment_7_1
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
    // InternalOptimind.g:3829:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3833:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // InternalOptimind.g:3834:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
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
    // InternalOptimind.g:3841:1: rule__Setter__Group__0__Impl : ( () ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3845:1: ( ( () ) )
            // InternalOptimind.g:3846:1: ( () )
            {
            // InternalOptimind.g:3846:1: ( () )
            // InternalOptimind.g:3847:2: ()
            {
             before(grammarAccess.getSetterAccess().getSetterAction_0()); 
            // InternalOptimind.g:3848:2: ()
            // InternalOptimind.g:3848:3: 
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
    // InternalOptimind.g:3856:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3860:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // InternalOptimind.g:3861:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
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
    // InternalOptimind.g:3868:1: rule__Setter__Group__1__Impl : ( 'Setter' ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3872:1: ( ( 'Setter' ) )
            // InternalOptimind.g:3873:1: ( 'Setter' )
            {
            // InternalOptimind.g:3873:1: ( 'Setter' )
            // InternalOptimind.g:3874:2: 'Setter'
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
    // InternalOptimind.g:3883:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3887:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // InternalOptimind.g:3888:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
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
    // InternalOptimind.g:3895:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__NameAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3899:1: ( ( ( rule__Setter__NameAssignment_2 ) ) )
            // InternalOptimind.g:3900:1: ( ( rule__Setter__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3900:1: ( ( rule__Setter__NameAssignment_2 ) )
            // InternalOptimind.g:3901:2: ( rule__Setter__NameAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3902:2: ( rule__Setter__NameAssignment_2 )
            // InternalOptimind.g:3902:3: rule__Setter__NameAssignment_2
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
    // InternalOptimind.g:3910:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl rule__Setter__Group__4 ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3914:1: ( rule__Setter__Group__3__Impl rule__Setter__Group__4 )
            // InternalOptimind.g:3915:2: rule__Setter__Group__3__Impl rule__Setter__Group__4
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
    // InternalOptimind.g:3922:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__Group_3__0 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3926:1: ( ( ( rule__Setter__Group_3__0 )? ) )
            // InternalOptimind.g:3927:1: ( ( rule__Setter__Group_3__0 )? )
            {
            // InternalOptimind.g:3927:1: ( ( rule__Setter__Group_3__0 )? )
            // InternalOptimind.g:3928:2: ( rule__Setter__Group_3__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_3()); 
            // InternalOptimind.g:3929:2: ( rule__Setter__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptimind.g:3929:3: rule__Setter__Group_3__0
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
    // InternalOptimind.g:3937:1: rule__Setter__Group__4 : rule__Setter__Group__4__Impl ;
    public final void rule__Setter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3941:1: ( rule__Setter__Group__4__Impl )
            // InternalOptimind.g:3942:2: rule__Setter__Group__4__Impl
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
    // InternalOptimind.g:3948:1: rule__Setter__Group__4__Impl : ( ( rule__Setter__Group_4__0 )? ) ;
    public final void rule__Setter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3952:1: ( ( ( rule__Setter__Group_4__0 )? ) )
            // InternalOptimind.g:3953:1: ( ( rule__Setter__Group_4__0 )? )
            {
            // InternalOptimind.g:3953:1: ( ( rule__Setter__Group_4__0 )? )
            // InternalOptimind.g:3954:2: ( rule__Setter__Group_4__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_4()); 
            // InternalOptimind.g:3955:2: ( rule__Setter__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimind.g:3955:3: rule__Setter__Group_4__0
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
    // InternalOptimind.g:3964:1: rule__Setter__Group_3__0 : rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 ;
    public final void rule__Setter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3968:1: ( rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 )
            // InternalOptimind.g:3969:2: rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1
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
    // InternalOptimind.g:3976:1: rule__Setter__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Setter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3980:1: ( ( 'type' ) )
            // InternalOptimind.g:3981:1: ( 'type' )
            {
            // InternalOptimind.g:3981:1: ( 'type' )
            // InternalOptimind.g:3982:2: 'type'
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
    // InternalOptimind.g:3991:1: rule__Setter__Group_3__1 : rule__Setter__Group_3__1__Impl ;
    public final void rule__Setter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3995:1: ( rule__Setter__Group_3__1__Impl )
            // InternalOptimind.g:3996:2: rule__Setter__Group_3__1__Impl
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
    // InternalOptimind.g:4002:1: rule__Setter__Group_3__1__Impl : ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Setter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4006:1: ( ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4007:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4007:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4008:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4009:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4009:3: rule__Setter__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:4018:1: rule__Setter__Group_4__0 : rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 ;
    public final void rule__Setter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4022:1: ( rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 )
            // InternalOptimind.g:4023:2: rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1
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
    // InternalOptimind.g:4030:1: rule__Setter__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Setter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4034:1: ( ( 'value' ) )
            // InternalOptimind.g:4035:1: ( 'value' )
            {
            // InternalOptimind.g:4035:1: ( 'value' )
            // InternalOptimind.g:4036:2: 'value'
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
    // InternalOptimind.g:4045:1: rule__Setter__Group_4__1 : rule__Setter__Group_4__1__Impl ;
    public final void rule__Setter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4049:1: ( rule__Setter__Group_4__1__Impl )
            // InternalOptimind.g:4050:2: rule__Setter__Group_4__1__Impl
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
    // InternalOptimind.g:4056:1: rule__Setter__Group_4__1__Impl : ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Setter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4060:1: ( ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4061:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4061:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4062:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4063:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4063:3: rule__Setter__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:4072:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4076:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalOptimind.g:4077:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:4084:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4088:1: ( ( () ) )
            // InternalOptimind.g:4089:1: ( () )
            {
            // InternalOptimind.g:4089:1: ( () )
            // InternalOptimind.g:4090:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalOptimind.g:4091:2: ()
            // InternalOptimind.g:4091:3: 
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
    // InternalOptimind.g:4099:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4103:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalOptimind.g:4104:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
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
    // InternalOptimind.g:4111:1: rule__Connection__Group__1__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4115:1: ( ( 'Connection' ) )
            // InternalOptimind.g:4116:1: ( 'Connection' )
            {
            // InternalOptimind.g:4116:1: ( 'Connection' )
            // InternalOptimind.g:4117:2: 'Connection'
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
    // InternalOptimind.g:4126:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4130:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalOptimind.g:4131:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
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
    // InternalOptimind.g:4138:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__NameAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4142:1: ( ( ( rule__Connection__NameAssignment_2 ) ) )
            // InternalOptimind.g:4143:1: ( ( rule__Connection__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4143:1: ( ( rule__Connection__NameAssignment_2 ) )
            // InternalOptimind.g:4144:2: ( rule__Connection__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4145:2: ( rule__Connection__NameAssignment_2 )
            // InternalOptimind.g:4145:3: rule__Connection__NameAssignment_2
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
    // InternalOptimind.g:4153:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4157:1: ( rule__Connection__Group__3__Impl )
            // InternalOptimind.g:4158:2: rule__Connection__Group__3__Impl
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
    // InternalOptimind.g:4164:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4168:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // InternalOptimind.g:4169:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // InternalOptimind.g:4169:1: ( ( rule__Connection__Group_3__0 )? )
            // InternalOptimind.g:4170:2: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // InternalOptimind.g:4171:2: ( rule__Connection__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:4171:3: rule__Connection__Group_3__0
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
    // InternalOptimind.g:4180:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4184:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // InternalOptimind.g:4185:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
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
    // InternalOptimind.g:4192:1: rule__Connection__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4196:1: ( ( 'to' ) )
            // InternalOptimind.g:4197:1: ( 'to' )
            {
            // InternalOptimind.g:4197:1: ( 'to' )
            // InternalOptimind.g:4198:2: 'to'
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
    // InternalOptimind.g:4207:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4211:1: ( rule__Connection__Group_3__1__Impl )
            // InternalOptimind.g:4212:2: rule__Connection__Group_3__1__Impl
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
    // InternalOptimind.g:4218:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4222:1: ( ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) )
            // InternalOptimind.g:4223:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            {
            // InternalOptimind.g:4223:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            // InternalOptimind.g:4224:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1()); 
            // InternalOptimind.g:4225:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            // InternalOptimind.g:4225:3: rule__Connection__TaskoutputAssignment_3_1
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
    // InternalOptimind.g:4234:1: rule__LibraryFunction__Group__0 : rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 ;
    public final void rule__LibraryFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4238:1: ( rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 )
            // InternalOptimind.g:4239:2: rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1
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
    // InternalOptimind.g:4246:1: rule__LibraryFunction__Group__0__Impl : ( () ) ;
    public final void rule__LibraryFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4250:1: ( ( () ) )
            // InternalOptimind.g:4251:1: ( () )
            {
            // InternalOptimind.g:4251:1: ( () )
            // InternalOptimind.g:4252:2: ()
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0()); 
            // InternalOptimind.g:4253:2: ()
            // InternalOptimind.g:4253:3: 
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
    // InternalOptimind.g:4261:1: rule__LibraryFunction__Group__1 : rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 ;
    public final void rule__LibraryFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4265:1: ( rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 )
            // InternalOptimind.g:4266:2: rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2
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
    // InternalOptimind.g:4273:1: rule__LibraryFunction__Group__1__Impl : ( 'LibraryFunction' ) ;
    public final void rule__LibraryFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4277:1: ( ( 'LibraryFunction' ) )
            // InternalOptimind.g:4278:1: ( 'LibraryFunction' )
            {
            // InternalOptimind.g:4278:1: ( 'LibraryFunction' )
            // InternalOptimind.g:4279:2: 'LibraryFunction'
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
    // InternalOptimind.g:4288:1: rule__LibraryFunction__Group__2 : rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 ;
    public final void rule__LibraryFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4292:1: ( rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 )
            // InternalOptimind.g:4293:2: rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3
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
    // InternalOptimind.g:4300:1: rule__LibraryFunction__Group__2__Impl : ( ( rule__LibraryFunction__NameAssignment_2 ) ) ;
    public final void rule__LibraryFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4304:1: ( ( ( rule__LibraryFunction__NameAssignment_2 ) ) )
            // InternalOptimind.g:4305:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4305:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            // InternalOptimind.g:4306:2: ( rule__LibraryFunction__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4307:2: ( rule__LibraryFunction__NameAssignment_2 )
            // InternalOptimind.g:4307:3: rule__LibraryFunction__NameAssignment_2
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
    // InternalOptimind.g:4315:1: rule__LibraryFunction__Group__3 : rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 ;
    public final void rule__LibraryFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4319:1: ( rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 )
            // InternalOptimind.g:4320:2: rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4
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
    // InternalOptimind.g:4327:1: rule__LibraryFunction__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4331:1: ( ( '{' ) )
            // InternalOptimind.g:4332:1: ( '{' )
            {
            // InternalOptimind.g:4332:1: ( '{' )
            // InternalOptimind.g:4333:2: '{'
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
    // InternalOptimind.g:4342:1: rule__LibraryFunction__Group__4 : rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 ;
    public final void rule__LibraryFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4346:1: ( rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 )
            // InternalOptimind.g:4347:2: rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5
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
    // InternalOptimind.g:4354:1: rule__LibraryFunction__Group__4__Impl : ( 'function' ) ;
    public final void rule__LibraryFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4358:1: ( ( 'function' ) )
            // InternalOptimind.g:4359:1: ( 'function' )
            {
            // InternalOptimind.g:4359:1: ( 'function' )
            // InternalOptimind.g:4360:2: 'function'
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
    // InternalOptimind.g:4369:1: rule__LibraryFunction__Group__5 : rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 ;
    public final void rule__LibraryFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4373:1: ( rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 )
            // InternalOptimind.g:4374:2: rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6
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
    // InternalOptimind.g:4381:1: rule__LibraryFunction__Group__5__Impl : ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) ;
    public final void rule__LibraryFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4385:1: ( ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) )
            // InternalOptimind.g:4386:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            {
            // InternalOptimind.g:4386:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            // InternalOptimind.g:4387:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5()); 
            // InternalOptimind.g:4388:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            // InternalOptimind.g:4388:3: rule__LibraryFunction__FunctionAssignment_5
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
    // InternalOptimind.g:4396:1: rule__LibraryFunction__Group__6 : rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 ;
    public final void rule__LibraryFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4400:1: ( rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 )
            // InternalOptimind.g:4401:2: rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7
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
    // InternalOptimind.g:4408:1: rule__LibraryFunction__Group__6__Impl : ( ( rule__LibraryFunction__Group_6__0 )? ) ;
    public final void rule__LibraryFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4412:1: ( ( ( rule__LibraryFunction__Group_6__0 )? ) )
            // InternalOptimind.g:4413:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            {
            // InternalOptimind.g:4413:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            // InternalOptimind.g:4414:2: ( rule__LibraryFunction__Group_6__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_6()); 
            // InternalOptimind.g:4415:2: ( rule__LibraryFunction__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimind.g:4415:3: rule__LibraryFunction__Group_6__0
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
    // InternalOptimind.g:4423:1: rule__LibraryFunction__Group__7 : rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 ;
    public final void rule__LibraryFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4427:1: ( rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 )
            // InternalOptimind.g:4428:2: rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8
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
    // InternalOptimind.g:4435:1: rule__LibraryFunction__Group__7__Impl : ( ( rule__LibraryFunction__Group_7__0 )? ) ;
    public final void rule__LibraryFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4439:1: ( ( ( rule__LibraryFunction__Group_7__0 )? ) )
            // InternalOptimind.g:4440:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            {
            // InternalOptimind.g:4440:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            // InternalOptimind.g:4441:2: ( rule__LibraryFunction__Group_7__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_7()); 
            // InternalOptimind.g:4442:2: ( rule__LibraryFunction__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOptimind.g:4442:3: rule__LibraryFunction__Group_7__0
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
    // InternalOptimind.g:4450:1: rule__LibraryFunction__Group__8 : rule__LibraryFunction__Group__8__Impl ;
    public final void rule__LibraryFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4454:1: ( rule__LibraryFunction__Group__8__Impl )
            // InternalOptimind.g:4455:2: rule__LibraryFunction__Group__8__Impl
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
    // InternalOptimind.g:4461:1: rule__LibraryFunction__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4465:1: ( ( '}' ) )
            // InternalOptimind.g:4466:1: ( '}' )
            {
            // InternalOptimind.g:4466:1: ( '}' )
            // InternalOptimind.g:4467:2: '}'
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
    // InternalOptimind.g:4477:1: rule__LibraryFunction__Group_6__0 : rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 ;
    public final void rule__LibraryFunction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4481:1: ( rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 )
            // InternalOptimind.g:4482:2: rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1
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
    // InternalOptimind.g:4489:1: rule__LibraryFunction__Group_6__0__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) ;
    public final void rule__LibraryFunction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4493:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) )
            // InternalOptimind.g:4494:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:4494:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            // InternalOptimind.g:4495:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0()); 
            // InternalOptimind.g:4496:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            // InternalOptimind.g:4496:3: rule__LibraryFunction__InputsAssignment_6_0
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
    // InternalOptimind.g:4504:1: rule__LibraryFunction__Group_6__1 : rule__LibraryFunction__Group_6__1__Impl ;
    public final void rule__LibraryFunction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4508:1: ( rule__LibraryFunction__Group_6__1__Impl )
            // InternalOptimind.g:4509:2: rule__LibraryFunction__Group_6__1__Impl
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
    // InternalOptimind.g:4515:1: rule__LibraryFunction__Group_6__1__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) ;
    public final void rule__LibraryFunction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4519:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) )
            // InternalOptimind.g:4520:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:4520:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            // InternalOptimind.g:4521:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1()); 
            // InternalOptimind.g:4522:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==47) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOptimind.g:4522:3: rule__LibraryFunction__InputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__LibraryFunction__InputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalOptimind.g:4531:1: rule__LibraryFunction__Group_7__0 : rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 ;
    public final void rule__LibraryFunction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4535:1: ( rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 )
            // InternalOptimind.g:4536:2: rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1
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
    // InternalOptimind.g:4543:1: rule__LibraryFunction__Group_7__0__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) ;
    public final void rule__LibraryFunction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4547:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) )
            // InternalOptimind.g:4548:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            {
            // InternalOptimind.g:4548:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            // InternalOptimind.g:4549:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0()); 
            // InternalOptimind.g:4550:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            // InternalOptimind.g:4550:3: rule__LibraryFunction__OutputsAssignment_7_0
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
    // InternalOptimind.g:4558:1: rule__LibraryFunction__Group_7__1 : rule__LibraryFunction__Group_7__1__Impl ;
    public final void rule__LibraryFunction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4562:1: ( rule__LibraryFunction__Group_7__1__Impl )
            // InternalOptimind.g:4563:2: rule__LibraryFunction__Group_7__1__Impl
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
    // InternalOptimind.g:4569:1: rule__LibraryFunction__Group_7__1__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) ;
    public final void rule__LibraryFunction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4573:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) )
            // InternalOptimind.g:4574:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            {
            // InternalOptimind.g:4574:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            // InternalOptimind.g:4575:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1()); 
            // InternalOptimind.g:4576:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==21) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalOptimind.g:4576:3: rule__LibraryFunction__OutputsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryFunction__OutputsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalOptimind.g:4585:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4589:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalOptimind.g:4590:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalOptimind.g:4597:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4601:1: ( ( () ) )
            // InternalOptimind.g:4602:1: ( () )
            {
            // InternalOptimind.g:4602:1: ( () )
            // InternalOptimind.g:4603:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalOptimind.g:4604:2: ()
            // InternalOptimind.g:4604:3: 
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
    // InternalOptimind.g:4612:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4616:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalOptimind.g:4617:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalOptimind.g:4624:1: rule__Input__Group__1__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4628:1: ( ( 'Input' ) )
            // InternalOptimind.g:4629:1: ( 'Input' )
            {
            // InternalOptimind.g:4629:1: ( 'Input' )
            // InternalOptimind.g:4630:2: 'Input'
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
    // InternalOptimind.g:4639:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4643:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalOptimind.g:4644:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalOptimind.g:4651:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4655:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalOptimind.g:4656:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4656:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalOptimind.g:4657:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4658:2: ( rule__Input__NameAssignment_2 )
            // InternalOptimind.g:4658:3: rule__Input__NameAssignment_2
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
    // InternalOptimind.g:4666:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4670:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalOptimind.g:4671:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalOptimind.g:4678:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4682:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalOptimind.g:4683:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalOptimind.g:4683:1: ( ( rule__Input__Group_3__0 )? )
            // InternalOptimind.g:4684:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalOptimind.g:4685:2: ( rule__Input__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOptimind.g:4685:3: rule__Input__Group_3__0
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
    // InternalOptimind.g:4693:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4697:1: ( rule__Input__Group__4__Impl )
            // InternalOptimind.g:4698:2: rule__Input__Group__4__Impl
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
    // InternalOptimind.g:4704:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4708:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalOptimind.g:4709:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalOptimind.g:4709:1: ( ( rule__Input__Group_4__0 )? )
            // InternalOptimind.g:4710:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalOptimind.g:4711:2: ( rule__Input__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOptimind.g:4711:3: rule__Input__Group_4__0
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
    // InternalOptimind.g:4720:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4724:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalOptimind.g:4725:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
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
    // InternalOptimind.g:4732:1: rule__Input__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4736:1: ( ( 'type' ) )
            // InternalOptimind.g:4737:1: ( 'type' )
            {
            // InternalOptimind.g:4737:1: ( 'type' )
            // InternalOptimind.g:4738:2: 'type'
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
    // InternalOptimind.g:4747:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4751:1: ( rule__Input__Group_3__1__Impl )
            // InternalOptimind.g:4752:2: rule__Input__Group_3__1__Impl
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
    // InternalOptimind.g:4758:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4762:1: ( ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4763:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4763:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4764:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4765:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4765:3: rule__Input__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:4774:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4778:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalOptimind.g:4779:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalOptimind.g:4786:1: rule__Input__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4790:1: ( ( 'value' ) )
            // InternalOptimind.g:4791:1: ( 'value' )
            {
            // InternalOptimind.g:4791:1: ( 'value' )
            // InternalOptimind.g:4792:2: 'value'
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
    // InternalOptimind.g:4801:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4805:1: ( rule__Input__Group_4__1__Impl )
            // InternalOptimind.g:4806:2: rule__Input__Group_4__1__Impl
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
    // InternalOptimind.g:4812:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4816:1: ( ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4817:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4817:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4818:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4819:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4819:3: rule__Input__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:4828:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4832:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalOptimind.g:4833:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalOptimind.g:4840:1: rule__Output__Group__0__Impl : ( () ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4844:1: ( ( () ) )
            // InternalOptimind.g:4845:1: ( () )
            {
            // InternalOptimind.g:4845:1: ( () )
            // InternalOptimind.g:4846:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_0()); 
            // InternalOptimind.g:4847:2: ()
            // InternalOptimind.g:4847:3: 
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
    // InternalOptimind.g:4855:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4859:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalOptimind.g:4860:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalOptimind.g:4867:1: rule__Output__Group__1__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4871:1: ( ( 'Output' ) )
            // InternalOptimind.g:4872:1: ( 'Output' )
            {
            // InternalOptimind.g:4872:1: ( 'Output' )
            // InternalOptimind.g:4873:2: 'Output'
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
    // InternalOptimind.g:4882:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4886:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalOptimind.g:4887:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalOptimind.g:4894:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4898:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalOptimind.g:4899:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4899:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalOptimind.g:4900:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4901:2: ( rule__Output__NameAssignment_2 )
            // InternalOptimind.g:4901:3: rule__Output__NameAssignment_2
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
    // InternalOptimind.g:4909:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4913:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalOptimind.g:4914:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalOptimind.g:4921:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4925:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalOptimind.g:4926:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalOptimind.g:4926:1: ( ( rule__Output__Group_3__0 )? )
            // InternalOptimind.g:4927:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalOptimind.g:4928:2: ( rule__Output__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOptimind.g:4928:3: rule__Output__Group_3__0
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
    // InternalOptimind.g:4936:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4940:1: ( rule__Output__Group__4__Impl )
            // InternalOptimind.g:4941:2: rule__Output__Group__4__Impl
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
    // InternalOptimind.g:4947:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4951:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalOptimind.g:4952:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalOptimind.g:4952:1: ( ( rule__Output__Group_4__0 )? )
            // InternalOptimind.g:4953:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalOptimind.g:4954:2: ( rule__Output__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOptimind.g:4954:3: rule__Output__Group_4__0
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
    // InternalOptimind.g:4963:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4967:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalOptimind.g:4968:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalOptimind.g:4975:1: rule__Output__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4979:1: ( ( 'type' ) )
            // InternalOptimind.g:4980:1: ( 'type' )
            {
            // InternalOptimind.g:4980:1: ( 'type' )
            // InternalOptimind.g:4981:2: 'type'
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
    // InternalOptimind.g:4990:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4994:1: ( rule__Output__Group_3__1__Impl )
            // InternalOptimind.g:4995:2: rule__Output__Group_3__1__Impl
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
    // InternalOptimind.g:5001:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5005:1: ( ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:5006:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:5006:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:5007:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:5008:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:5008:3: rule__Output__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:5017:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5021:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalOptimind.g:5022:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalOptimind.g:5029:1: rule__Output__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5033:1: ( ( 'value' ) )
            // InternalOptimind.g:5034:1: ( 'value' )
            {
            // InternalOptimind.g:5034:1: ( 'value' )
            // InternalOptimind.g:5035:2: 'value'
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
    // InternalOptimind.g:5044:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5048:1: ( rule__Output__Group_4__1__Impl )
            // InternalOptimind.g:5049:2: rule__Output__Group_4__1__Impl
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
    // InternalOptimind.g:5055:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5059:1: ( ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:5060:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:5060:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:5061:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:5062:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:5062:3: rule__Output__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:5071:1: rule__Workflow__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Workflow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5075:1: ( ( ruleEString ) )
            // InternalOptimind.g:5076:2: ( ruleEString )
            {
            // InternalOptimind.g:5076:2: ( ruleEString )
            // InternalOptimind.g:5077:3: ruleEString
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
    // InternalOptimind.g:5086:1: rule__Workflow__LanguageAssignment_4_1 : ( ruleProgLanguage ) ;
    public final void rule__Workflow__LanguageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5090:1: ( ( ruleProgLanguage ) )
            // InternalOptimind.g:5091:2: ( ruleProgLanguage )
            {
            // InternalOptimind.g:5091:2: ( ruleProgLanguage )
            // InternalOptimind.g:5092:3: ruleProgLanguage
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
    // InternalOptimind.g:5101:1: rule__Workflow__BaseTaskAssignment_5 : ( ruleBaseTask ) ;
    public final void rule__Workflow__BaseTaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5105:1: ( ( ruleBaseTask ) )
            // InternalOptimind.g:5106:2: ( ruleBaseTask )
            {
            // InternalOptimind.g:5106:2: ( ruleBaseTask )
            // InternalOptimind.g:5107:3: ruleBaseTask
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
    // InternalOptimind.g:5116:1: rule__Workflow__FunctionsAssignment_6_0 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5120:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5121:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5121:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5122:3: ruleLibraryFunction
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
    // InternalOptimind.g:5131:1: rule__Workflow__FunctionsAssignment_6_1 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5135:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5136:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5136:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5137:3: ruleLibraryFunction
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
    // InternalOptimind.g:5146:1: rule__TaskOutput__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TaskOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5150:1: ( ( ruleEString ) )
            // InternalOptimind.g:5151:2: ( ruleEString )
            {
            // InternalOptimind.g:5151:2: ( ruleEString )
            // InternalOptimind.g:5152:3: ruleEString
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
    // InternalOptimind.g:5161:1: rule__TaskOutput__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__TaskOutput__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5165:1: ( ( ruleType ) )
            // InternalOptimind.g:5166:2: ( ruleType )
            {
            // InternalOptimind.g:5166:2: ( ruleType )
            // InternalOptimind.g:5167:3: ruleType
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
    // InternalOptimind.g:5176:1: rule__TaskOutput__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TaskOutput__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5180:1: ( ( ruleEString ) )
            // InternalOptimind.g:5181:2: ( ruleEString )
            {
            // InternalOptimind.g:5181:2: ( ruleEString )
            // InternalOptimind.g:5182:3: ruleEString
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


    // $ANTLR start "rule__For__NameAssignment_2"
    // InternalOptimind.g:5191:1: rule__For__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__For__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5195:1: ( ( ruleEString ) )
            // InternalOptimind.g:5196:2: ( ruleEString )
            {
            // InternalOptimind.g:5196:2: ( ruleEString )
            // InternalOptimind.g:5197:3: ruleEString
            {
             before(grammarAccess.getForAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__For__NameAssignment_2"


    // $ANTLR start "rule__For__FromAssignment_5"
    // InternalOptimind.g:5206:1: rule__For__FromAssignment_5 : ( ruleEInt ) ;
    public final void rule__For__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5210:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5211:2: ( ruleEInt )
            {
            // InternalOptimind.g:5211:2: ( ruleEInt )
            // InternalOptimind.g:5212:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getFromEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getFromEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__For__FromAssignment_5"


    // $ANTLR start "rule__For__ToAssignment_7"
    // InternalOptimind.g:5221:1: rule__For__ToAssignment_7 : ( ruleEInt ) ;
    public final void rule__For__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5225:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5226:2: ( ruleEInt )
            {
            // InternalOptimind.g:5226:2: ( ruleEInt )
            // InternalOptimind.g:5227:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getToEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getToEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__For__ToAssignment_7"


    // $ANTLR start "rule__For__IncrementAssignment_9"
    // InternalOptimind.g:5236:1: rule__For__IncrementAssignment_9 : ( ruleEInt ) ;
    public final void rule__For__IncrementAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5240:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5241:2: ( ruleEInt )
            {
            // InternalOptimind.g:5241:2: ( ruleEInt )
            // InternalOptimind.g:5242:3: ruleEInt
            {
             before(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__For__IncrementAssignment_9"


    // $ANTLR start "rule__For__AbstracttaskAssignment_11"
    // InternalOptimind.g:5251:1: rule__For__AbstracttaskAssignment_11 : ( ruleAbstractTask ) ;
    public final void rule__For__AbstracttaskAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5255:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5256:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5256:2: ( ruleAbstractTask )
            // InternalOptimind.g:5257:3: ruleAbstractTask
            {
             before(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__For__AbstracttaskAssignment_11"


    // $ANTLR start "rule__While__NameAssignment_2"
    // InternalOptimind.g:5266:1: rule__While__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__While__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5270:1: ( ( ruleEString ) )
            // InternalOptimind.g:5271:2: ( ruleEString )
            {
            // InternalOptimind.g:5271:2: ( ruleEString )
            // InternalOptimind.g:5272:3: ruleEString
            {
             before(grammarAccess.getWhileAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__While__NameAssignment_2"


    // $ANTLR start "rule__While__ConditionAssignment_5"
    // InternalOptimind.g:5281:1: rule__While__ConditionAssignment_5 : ( ruleEString ) ;
    public final void rule__While__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5285:1: ( ( ruleEString ) )
            // InternalOptimind.g:5286:2: ( ruleEString )
            {
            // InternalOptimind.g:5286:2: ( ruleEString )
            // InternalOptimind.g:5287:3: ruleEString
            {
             before(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__While__ConditionAssignment_5"


    // $ANTLR start "rule__While__AbstracttaskAssignment_7"
    // InternalOptimind.g:5296:1: rule__While__AbstracttaskAssignment_7 : ( ruleAbstractTask ) ;
    public final void rule__While__AbstracttaskAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5300:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5301:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5301:2: ( ruleAbstractTask )
            // InternalOptimind.g:5302:3: ruleAbstractTask
            {
             before(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__While__AbstracttaskAssignment_7"


    // $ANTLR start "rule__If__NameAssignment_2"
    // InternalOptimind.g:5311:1: rule__If__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__If__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5315:1: ( ( ruleEString ) )
            // InternalOptimind.g:5316:2: ( ruleEString )
            {
            // InternalOptimind.g:5316:2: ( ruleEString )
            // InternalOptimind.g:5317:3: ruleEString
            {
             before(grammarAccess.getIfAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIfAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__If__NameAssignment_2"


    // $ANTLR start "rule__If__ConditionAssignment_5"
    // InternalOptimind.g:5326:1: rule__If__ConditionAssignment_5 : ( ruleEString ) ;
    public final void rule__If__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5330:1: ( ( ruleEString ) )
            // InternalOptimind.g:5331:2: ( ruleEString )
            {
            // InternalOptimind.g:5331:2: ( ruleEString )
            // InternalOptimind.g:5332:3: ruleEString
            {
             before(grammarAccess.getIfAccess().getConditionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__If__ConditionAssignment_5"


    // $ANTLR start "rule__If__ThenAssignment_7"
    // InternalOptimind.g:5341:1: rule__If__ThenAssignment_7 : ( ruleAbstractTask ) ;
    public final void rule__If__ThenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5345:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5346:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5346:2: ( ruleAbstractTask )
            // InternalOptimind.g:5347:3: ruleAbstractTask
            {
             before(grammarAccess.getIfAccess().getThenAbstractTaskParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getIfAccess().getThenAbstractTaskParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__If__ThenAssignment_7"


    // $ANTLR start "rule__If__ElseAssignment_8_1"
    // InternalOptimind.g:5356:1: rule__If__ElseAssignment_8_1 : ( ruleAbstractTask ) ;
    public final void rule__If__ElseAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5360:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5361:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5361:2: ( ruleAbstractTask )
            // InternalOptimind.g:5362:3: ruleAbstractTask
            {
             before(grammarAccess.getIfAccess().getElseAbstractTaskParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTask();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseAbstractTaskParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__If__ElseAssignment_8_1"


    // $ANTLR start "rule__BaseTask__NameAssignment_2"
    // InternalOptimind.g:5371:1: rule__BaseTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5375:1: ( ( ruleEString ) )
            // InternalOptimind.g:5376:2: ( ruleEString )
            {
            // InternalOptimind.g:5376:2: ( ruleEString )
            // InternalOptimind.g:5377:3: ruleEString
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
    // InternalOptimind.g:5386:1: rule__BaseTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__BaseTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5390:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5391:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5391:2: ( ruleTaskStatus )
            // InternalOptimind.g:5392:3: ruleTaskStatus
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
    // InternalOptimind.g:5401:1: rule__BaseTask__InputsAssignment_5_2 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5405:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5406:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5406:2: ( ruleTaskInput )
            // InternalOptimind.g:5407:3: ruleTaskInput
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
    // InternalOptimind.g:5416:1: rule__BaseTask__InputsAssignment_5_3_1 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5420:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5421:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5421:2: ( ruleTaskInput )
            // InternalOptimind.g:5422:3: ruleTaskInput
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
    // InternalOptimind.g:5431:1: rule__BaseTask__OutputsAssignment_6_2 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5435:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5436:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5436:2: ( ruleTaskOutput )
            // InternalOptimind.g:5437:3: ruleTaskOutput
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
    // InternalOptimind.g:5446:1: rule__BaseTask__OutputsAssignment_6_3_1 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5450:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5451:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5451:2: ( ruleTaskOutput )
            // InternalOptimind.g:5452:3: ruleTaskOutput
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
    // InternalOptimind.g:5461:1: rule__BaseTask__ChildrenAssignment_7_0 : ( ruleAbstractTask ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5465:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5466:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5466:2: ( ruleAbstractTask )
            // InternalOptimind.g:5467:3: ruleAbstractTask
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


    // $ANTLR start "rule__BaseTask__AbstractstatementAssignment_7_1"
    // InternalOptimind.g:5476:1: rule__BaseTask__AbstractstatementAssignment_7_1 : ( ruleAbstractStatement ) ;
    public final void rule__BaseTask__AbstractstatementAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5480:1: ( ( ruleAbstractStatement ) )
            // InternalOptimind.g:5481:2: ( ruleAbstractStatement )
            {
            // InternalOptimind.g:5481:2: ( ruleAbstractStatement )
            // InternalOptimind.g:5482:3: ruleAbstractStatement
            {
             before(grammarAccess.getBaseTaskAccess().getAbstractstatementAbstractStatementParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractStatement();

            state._fsp--;

             after(grammarAccess.getBaseTaskAccess().getAbstractstatementAbstractStatementParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__BaseTask__AbstractstatementAssignment_7_1"


    // $ANTLR start "rule__LibraryTask__NameAssignment_2"
    // InternalOptimind.g:5491:1: rule__LibraryTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5495:1: ( ( ruleEString ) )
            // InternalOptimind.g:5496:2: ( ruleEString )
            {
            // InternalOptimind.g:5496:2: ( ruleEString )
            // InternalOptimind.g:5497:3: ruleEString
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
    // InternalOptimind.g:5506:1: rule__LibraryTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__LibraryTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5510:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5511:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5511:2: ( ruleTaskStatus )
            // InternalOptimind.g:5512:3: ruleTaskStatus
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
    // InternalOptimind.g:5521:1: rule__LibraryTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5525:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5526:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5526:2: ( ruleTaskInput )
            // InternalOptimind.g:5527:3: ruleTaskInput
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
    // InternalOptimind.g:5536:1: rule__LibraryTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5540:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5541:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5541:2: ( ruleTaskInput )
            // InternalOptimind.g:5542:3: ruleTaskInput
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
    // InternalOptimind.g:5551:1: rule__LibraryTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5555:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5556:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5556:2: ( ruleTaskOutput )
            // InternalOptimind.g:5557:3: ruleTaskOutput
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
    // InternalOptimind.g:5566:1: rule__LibraryTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5570:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5571:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5571:2: ( ruleTaskOutput )
            // InternalOptimind.g:5572:3: ruleTaskOutput
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
    // InternalOptimind.g:5581:1: rule__LibraryTask__LibraryfunctionAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__LibraryTask__LibraryfunctionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5585:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5586:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5586:2: ( ( ruleEString ) )
            // InternalOptimind.g:5587:3: ( ruleEString )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0()); 
            // InternalOptimind.g:5588:3: ( ruleEString )
            // InternalOptimind.g:5589:4: ruleEString
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
    // InternalOptimind.g:5600:1: rule__CustomTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5604:1: ( ( ruleEString ) )
            // InternalOptimind.g:5605:2: ( ruleEString )
            {
            // InternalOptimind.g:5605:2: ( ruleEString )
            // InternalOptimind.g:5606:3: ruleEString
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
    // InternalOptimind.g:5615:1: rule__CustomTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__CustomTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5619:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5620:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5620:2: ( ruleTaskStatus )
            // InternalOptimind.g:5621:3: ruleTaskStatus
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
    // InternalOptimind.g:5630:1: rule__CustomTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5634:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5635:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5635:2: ( ruleTaskInput )
            // InternalOptimind.g:5636:3: ruleTaskInput
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
    // InternalOptimind.g:5645:1: rule__CustomTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5649:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5650:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5650:2: ( ruleTaskInput )
            // InternalOptimind.g:5651:3: ruleTaskInput
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
    // InternalOptimind.g:5660:1: rule__CustomTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5664:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5665:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5665:2: ( ruleTaskOutput )
            // InternalOptimind.g:5666:3: ruleTaskOutput
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
    // InternalOptimind.g:5675:1: rule__CustomTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5679:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5680:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5680:2: ( ruleTaskOutput )
            // InternalOptimind.g:5681:3: ruleTaskOutput
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
    // InternalOptimind.g:5690:1: rule__CustomTask__RunnerAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CustomTask__RunnerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5694:1: ( ( ruleEString ) )
            // InternalOptimind.g:5695:2: ( ruleEString )
            {
            // InternalOptimind.g:5695:2: ( ruleEString )
            // InternalOptimind.g:5696:3: ruleEString
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
    // InternalOptimind.g:5705:1: rule__Setter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Setter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5709:1: ( ( ruleEString ) )
            // InternalOptimind.g:5710:2: ( ruleEString )
            {
            // InternalOptimind.g:5710:2: ( ruleEString )
            // InternalOptimind.g:5711:3: ruleEString
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
    // InternalOptimind.g:5720:1: rule__Setter__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Setter__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5724:1: ( ( ruleType ) )
            // InternalOptimind.g:5725:2: ( ruleType )
            {
            // InternalOptimind.g:5725:2: ( ruleType )
            // InternalOptimind.g:5726:3: ruleType
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
    // InternalOptimind.g:5735:1: rule__Setter__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Setter__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5739:1: ( ( ruleEString ) )
            // InternalOptimind.g:5740:2: ( ruleEString )
            {
            // InternalOptimind.g:5740:2: ( ruleEString )
            // InternalOptimind.g:5741:3: ruleEString
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
    // InternalOptimind.g:5750:1: rule__Connection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Connection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5754:1: ( ( ruleEString ) )
            // InternalOptimind.g:5755:2: ( ruleEString )
            {
            // InternalOptimind.g:5755:2: ( ruleEString )
            // InternalOptimind.g:5756:3: ruleEString
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
    // InternalOptimind.g:5765:1: rule__Connection__TaskoutputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Connection__TaskoutputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5769:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5770:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5770:2: ( ( ruleEString ) )
            // InternalOptimind.g:5771:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0()); 
            // InternalOptimind.g:5772:3: ( ruleEString )
            // InternalOptimind.g:5773:4: ruleEString
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
    // InternalOptimind.g:5784:1: rule__LibraryFunction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5788:1: ( ( ruleEString ) )
            // InternalOptimind.g:5789:2: ( ruleEString )
            {
            // InternalOptimind.g:5789:2: ( ruleEString )
            // InternalOptimind.g:5790:3: ruleEString
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
    // InternalOptimind.g:5799:1: rule__LibraryFunction__FunctionAssignment_5 : ( ruleEString ) ;
    public final void rule__LibraryFunction__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5803:1: ( ( ruleEString ) )
            // InternalOptimind.g:5804:2: ( ruleEString )
            {
            // InternalOptimind.g:5804:2: ( ruleEString )
            // InternalOptimind.g:5805:3: ruleEString
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
    // InternalOptimind.g:5814:1: rule__LibraryFunction__InputsAssignment_6_0 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5818:1: ( ( ruleInput ) )
            // InternalOptimind.g:5819:2: ( ruleInput )
            {
            // InternalOptimind.g:5819:2: ( ruleInput )
            // InternalOptimind.g:5820:3: ruleInput
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
    // InternalOptimind.g:5829:1: rule__LibraryFunction__InputsAssignment_6_1 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5833:1: ( ( ruleInput ) )
            // InternalOptimind.g:5834:2: ( ruleInput )
            {
            // InternalOptimind.g:5834:2: ( ruleInput )
            // InternalOptimind.g:5835:3: ruleInput
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
    // InternalOptimind.g:5844:1: rule__LibraryFunction__OutputsAssignment_7_0 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5848:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5849:2: ( ruleOutput )
            {
            // InternalOptimind.g:5849:2: ( ruleOutput )
            // InternalOptimind.g:5850:3: ruleOutput
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
    // InternalOptimind.g:5859:1: rule__LibraryFunction__OutputsAssignment_7_1 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5863:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5864:2: ( ruleOutput )
            {
            // InternalOptimind.g:5864:2: ( ruleOutput )
            // InternalOptimind.g:5865:3: ruleOutput
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
    // InternalOptimind.g:5874:1: rule__Input__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5878:1: ( ( ruleEString ) )
            // InternalOptimind.g:5879:2: ( ruleEString )
            {
            // InternalOptimind.g:5879:2: ( ruleEString )
            // InternalOptimind.g:5880:3: ruleEString
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
    // InternalOptimind.g:5889:1: rule__Input__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Input__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5893:1: ( ( ruleType ) )
            // InternalOptimind.g:5894:2: ( ruleType )
            {
            // InternalOptimind.g:5894:2: ( ruleType )
            // InternalOptimind.g:5895:3: ruleType
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
    // InternalOptimind.g:5904:1: rule__Input__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Input__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5908:1: ( ( ruleEString ) )
            // InternalOptimind.g:5909:2: ( ruleEString )
            {
            // InternalOptimind.g:5909:2: ( ruleEString )
            // InternalOptimind.g:5910:3: ruleEString
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
    // InternalOptimind.g:5919:1: rule__Output__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5923:1: ( ( ruleEString ) )
            // InternalOptimind.g:5924:2: ( ruleEString )
            {
            // InternalOptimind.g:5924:2: ( ruleEString )
            // InternalOptimind.g:5925:3: ruleEString
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
    // InternalOptimind.g:5934:1: rule__Output__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Output__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5938:1: ( ( ruleType ) )
            // InternalOptimind.g:5939:2: ( ruleType )
            {
            // InternalOptimind.g:5939:2: ( ruleType )
            // InternalOptimind.g:5940:3: ruleType
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
    // InternalOptimind.g:5949:1: rule__Output__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Output__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5953:1: ( ( ruleEString ) )
            // InternalOptimind.g:5954:2: ( ruleEString )
            {
            // InternalOptimind.g:5954:2: ( ruleEString )
            // InternalOptimind.g:5955:3: ruleEString
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000284A1000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});
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