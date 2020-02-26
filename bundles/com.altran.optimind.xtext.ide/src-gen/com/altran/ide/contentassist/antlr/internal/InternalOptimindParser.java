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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'", "'Workflow'", "'{'", "'}'", "'Language'", "'Output'", "'type'", "'value'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'to'", "'LibraryFunction'", "'function'", "'Input'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleType"
    // InternalOptimind.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalOptimind.g:154:1: ( ruleType EOF )
            // InternalOptimind.g:155:1: ruleType EOF
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
    // InternalOptimind.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalOptimind.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalOptimind.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalOptimind.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalOptimind.g:169:3: ( rule__Type__Alternatives )
            // InternalOptimind.g:169:4: rule__Type__Alternatives
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
    // InternalOptimind.g:178:1: entryRuleTaskOutput : ruleTaskOutput EOF ;
    public final void entryRuleTaskOutput() throws RecognitionException {
        try {
            // InternalOptimind.g:179:1: ( ruleTaskOutput EOF )
            // InternalOptimind.g:180:1: ruleTaskOutput EOF
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
    // InternalOptimind.g:187:1: ruleTaskOutput : ( ( rule__TaskOutput__Group__0 ) ) ;
    public final void ruleTaskOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:191:2: ( ( ( rule__TaskOutput__Group__0 ) ) )
            // InternalOptimind.g:192:2: ( ( rule__TaskOutput__Group__0 ) )
            {
            // InternalOptimind.g:192:2: ( ( rule__TaskOutput__Group__0 ) )
            // InternalOptimind.g:193:3: ( rule__TaskOutput__Group__0 )
            {
             before(grammarAccess.getTaskOutputAccess().getGroup()); 
            // InternalOptimind.g:194:3: ( rule__TaskOutput__Group__0 )
            // InternalOptimind.g:194:4: rule__TaskOutput__Group__0
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


    // $ANTLR start "entryRuleBaseTask"
    // InternalOptimind.g:203:1: entryRuleBaseTask : ruleBaseTask EOF ;
    public final void entryRuleBaseTask() throws RecognitionException {
        try {
            // InternalOptimind.g:204:1: ( ruleBaseTask EOF )
            // InternalOptimind.g:205:1: ruleBaseTask EOF
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
    // InternalOptimind.g:212:1: ruleBaseTask : ( ( rule__BaseTask__Group__0 ) ) ;
    public final void ruleBaseTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:216:2: ( ( ( rule__BaseTask__Group__0 ) ) )
            // InternalOptimind.g:217:2: ( ( rule__BaseTask__Group__0 ) )
            {
            // InternalOptimind.g:217:2: ( ( rule__BaseTask__Group__0 ) )
            // InternalOptimind.g:218:3: ( rule__BaseTask__Group__0 )
            {
             before(grammarAccess.getBaseTaskAccess().getGroup()); 
            // InternalOptimind.g:219:3: ( rule__BaseTask__Group__0 )
            // InternalOptimind.g:219:4: rule__BaseTask__Group__0
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
    // InternalOptimind.g:228:1: entryRuleLibraryTask : ruleLibraryTask EOF ;
    public final void entryRuleLibraryTask() throws RecognitionException {
        try {
            // InternalOptimind.g:229:1: ( ruleLibraryTask EOF )
            // InternalOptimind.g:230:1: ruleLibraryTask EOF
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
    // InternalOptimind.g:237:1: ruleLibraryTask : ( ( rule__LibraryTask__Group__0 ) ) ;
    public final void ruleLibraryTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:241:2: ( ( ( rule__LibraryTask__Group__0 ) ) )
            // InternalOptimind.g:242:2: ( ( rule__LibraryTask__Group__0 ) )
            {
            // InternalOptimind.g:242:2: ( ( rule__LibraryTask__Group__0 ) )
            // InternalOptimind.g:243:3: ( rule__LibraryTask__Group__0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup()); 
            // InternalOptimind.g:244:3: ( rule__LibraryTask__Group__0 )
            // InternalOptimind.g:244:4: rule__LibraryTask__Group__0
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
    // InternalOptimind.g:253:1: entryRuleCustomTask : ruleCustomTask EOF ;
    public final void entryRuleCustomTask() throws RecognitionException {
        try {
            // InternalOptimind.g:254:1: ( ruleCustomTask EOF )
            // InternalOptimind.g:255:1: ruleCustomTask EOF
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
    // InternalOptimind.g:262:1: ruleCustomTask : ( ( rule__CustomTask__Group__0 ) ) ;
    public final void ruleCustomTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:266:2: ( ( ( rule__CustomTask__Group__0 ) ) )
            // InternalOptimind.g:267:2: ( ( rule__CustomTask__Group__0 ) )
            {
            // InternalOptimind.g:267:2: ( ( rule__CustomTask__Group__0 ) )
            // InternalOptimind.g:268:3: ( rule__CustomTask__Group__0 )
            {
             before(grammarAccess.getCustomTaskAccess().getGroup()); 
            // InternalOptimind.g:269:3: ( rule__CustomTask__Group__0 )
            // InternalOptimind.g:269:4: rule__CustomTask__Group__0
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
    // InternalOptimind.g:278:1: entryRuleSetter : ruleSetter EOF ;
    public final void entryRuleSetter() throws RecognitionException {
        try {
            // InternalOptimind.g:279:1: ( ruleSetter EOF )
            // InternalOptimind.g:280:1: ruleSetter EOF
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
    // InternalOptimind.g:287:1: ruleSetter : ( ( rule__Setter__Group__0 ) ) ;
    public final void ruleSetter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:291:2: ( ( ( rule__Setter__Group__0 ) ) )
            // InternalOptimind.g:292:2: ( ( rule__Setter__Group__0 ) )
            {
            // InternalOptimind.g:292:2: ( ( rule__Setter__Group__0 ) )
            // InternalOptimind.g:293:3: ( rule__Setter__Group__0 )
            {
             before(grammarAccess.getSetterAccess().getGroup()); 
            // InternalOptimind.g:294:3: ( rule__Setter__Group__0 )
            // InternalOptimind.g:294:4: rule__Setter__Group__0
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
    // InternalOptimind.g:303:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalOptimind.g:304:1: ( ruleConnection EOF )
            // InternalOptimind.g:305:1: ruleConnection EOF
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
    // InternalOptimind.g:312:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:316:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalOptimind.g:317:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalOptimind.g:317:2: ( ( rule__Connection__Group__0 ) )
            // InternalOptimind.g:318:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalOptimind.g:319:3: ( rule__Connection__Group__0 )
            // InternalOptimind.g:319:4: rule__Connection__Group__0
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
    // InternalOptimind.g:328:1: entryRuleLibraryFunction : ruleLibraryFunction EOF ;
    public final void entryRuleLibraryFunction() throws RecognitionException {
        try {
            // InternalOptimind.g:329:1: ( ruleLibraryFunction EOF )
            // InternalOptimind.g:330:1: ruleLibraryFunction EOF
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
    // InternalOptimind.g:337:1: ruleLibraryFunction : ( ( rule__LibraryFunction__Group__0 ) ) ;
    public final void ruleLibraryFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:341:2: ( ( ( rule__LibraryFunction__Group__0 ) ) )
            // InternalOptimind.g:342:2: ( ( rule__LibraryFunction__Group__0 ) )
            {
            // InternalOptimind.g:342:2: ( ( rule__LibraryFunction__Group__0 ) )
            // InternalOptimind.g:343:3: ( rule__LibraryFunction__Group__0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup()); 
            // InternalOptimind.g:344:3: ( rule__LibraryFunction__Group__0 )
            // InternalOptimind.g:344:4: rule__LibraryFunction__Group__0
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
    // InternalOptimind.g:353:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalOptimind.g:354:1: ( ruleInput EOF )
            // InternalOptimind.g:355:1: ruleInput EOF
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
    // InternalOptimind.g:362:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:366:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalOptimind.g:367:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalOptimind.g:367:2: ( ( rule__Input__Group__0 ) )
            // InternalOptimind.g:368:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalOptimind.g:369:3: ( rule__Input__Group__0 )
            // InternalOptimind.g:369:4: rule__Input__Group__0
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
    // InternalOptimind.g:378:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalOptimind.g:379:1: ( ruleOutput EOF )
            // InternalOptimind.g:380:1: ruleOutput EOF
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
    // InternalOptimind.g:387:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:391:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalOptimind.g:392:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalOptimind.g:392:2: ( ( rule__Output__Group__0 ) )
            // InternalOptimind.g:393:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalOptimind.g:394:3: ( rule__Output__Group__0 )
            // InternalOptimind.g:394:4: rule__Output__Group__0
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
    // InternalOptimind.g:403:1: ruleProgLanguage : ( ( rule__ProgLanguage__Alternatives ) ) ;
    public final void ruleProgLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:407:1: ( ( ( rule__ProgLanguage__Alternatives ) ) )
            // InternalOptimind.g:408:2: ( ( rule__ProgLanguage__Alternatives ) )
            {
            // InternalOptimind.g:408:2: ( ( rule__ProgLanguage__Alternatives ) )
            // InternalOptimind.g:409:3: ( rule__ProgLanguage__Alternatives )
            {
             before(grammarAccess.getProgLanguageAccess().getAlternatives()); 
            // InternalOptimind.g:410:3: ( rule__ProgLanguage__Alternatives )
            // InternalOptimind.g:410:4: rule__ProgLanguage__Alternatives
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
    // InternalOptimind.g:419:1: ruleTaskStatus : ( ( rule__TaskStatus__Alternatives ) ) ;
    public final void ruleTaskStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:423:1: ( ( ( rule__TaskStatus__Alternatives ) ) )
            // InternalOptimind.g:424:2: ( ( rule__TaskStatus__Alternatives ) )
            {
            // InternalOptimind.g:424:2: ( ( rule__TaskStatus__Alternatives ) )
            // InternalOptimind.g:425:3: ( rule__TaskStatus__Alternatives )
            {
             before(grammarAccess.getTaskStatusAccess().getAlternatives()); 
            // InternalOptimind.g:426:3: ( rule__TaskStatus__Alternatives )
            // InternalOptimind.g:426:4: rule__TaskStatus__Alternatives
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
    // InternalOptimind.g:434:1: rule__AbstractTask__Alternatives : ( ( ruleBaseTask ) | ( ruleLibraryTask ) | ( ruleCustomTask ) );
    public final void rule__AbstractTask__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:438:1: ( ( ruleBaseTask ) | ( ruleLibraryTask ) | ( ruleCustomTask ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 31:
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
                    // InternalOptimind.g:439:2: ( ruleBaseTask )
                    {
                    // InternalOptimind.g:439:2: ( ruleBaseTask )
                    // InternalOptimind.g:440:3: ruleBaseTask
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
                    // InternalOptimind.g:445:2: ( ruleLibraryTask )
                    {
                    // InternalOptimind.g:445:2: ( ruleLibraryTask )
                    // InternalOptimind.g:446:3: ruleLibraryTask
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
                    // InternalOptimind.g:451:2: ( ruleCustomTask )
                    {
                    // InternalOptimind.g:451:2: ( ruleCustomTask )
                    // InternalOptimind.g:452:3: ruleCustomTask
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
    // InternalOptimind.g:461:1: rule__TaskInput__Alternatives : ( ( ruleSetter ) | ( ruleConnection ) );
    public final void rule__TaskInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:465:1: ( ( ruleSetter ) | ( ruleConnection ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimind.g:466:2: ( ruleSetter )
                    {
                    // InternalOptimind.g:466:2: ( ruleSetter )
                    // InternalOptimind.g:467:3: ruleSetter
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
                    // InternalOptimind.g:472:2: ( ruleConnection )
                    {
                    // InternalOptimind.g:472:2: ( ruleConnection )
                    // InternalOptimind.g:473:3: ruleConnection
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
    // InternalOptimind.g:482:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:486:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOptimind.g:487:2: ( RULE_STRING )
                    {
                    // InternalOptimind.g:487:2: ( RULE_STRING )
                    // InternalOptimind.g:488:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:493:2: ( RULE_ID )
                    {
                    // InternalOptimind.g:493:2: ( RULE_ID )
                    // InternalOptimind.g:494:3: RULE_ID
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
    // InternalOptimind.g:503:1: rule__Type__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:507:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOptimind.g:508:2: ( RULE_STRING )
                    {
                    // InternalOptimind.g:508:2: ( RULE_STRING )
                    // InternalOptimind.g:509:3: RULE_STRING
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:514:2: ( RULE_ID )
                    {
                    // InternalOptimind.g:514:2: ( RULE_ID )
                    // InternalOptimind.g:515:3: RULE_ID
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


    // $ANTLR start "rule__ProgLanguage__Alternatives"
    // InternalOptimind.g:524:1: rule__ProgLanguage__Alternatives : ( ( ( 'Python' ) ) | ( ( 'Java' ) ) );
    public final void rule__ProgLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:528:1: ( ( ( 'Python' ) ) | ( ( 'Java' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalOptimind.g:529:2: ( ( 'Python' ) )
                    {
                    // InternalOptimind.g:529:2: ( ( 'Python' ) )
                    // InternalOptimind.g:530:3: ( 'Python' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:531:3: ( 'Python' )
                    // InternalOptimind.g:531:4: 'Python'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:535:2: ( ( 'Java' ) )
                    {
                    // InternalOptimind.g:535:2: ( ( 'Java' ) )
                    // InternalOptimind.g:536:3: ( 'Java' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:537:3: ( 'Java' )
                    // InternalOptimind.g:537:4: 'Java'
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
    // InternalOptimind.g:545:1: rule__TaskStatus__Alternatives : ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) );
    public final void rule__TaskStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:549:1: ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOptimind.g:550:2: ( ( 'FINISHED' ) )
                    {
                    // InternalOptimind.g:550:2: ( ( 'FINISHED' ) )
                    // InternalOptimind.g:551:3: ( 'FINISHED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:552:3: ( 'FINISHED' )
                    // InternalOptimind.g:552:4: 'FINISHED'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:556:2: ( ( 'PREPARED' ) )
                    {
                    // InternalOptimind.g:556:2: ( ( 'PREPARED' ) )
                    // InternalOptimind.g:557:3: ( 'PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:558:3: ( 'PREPARED' )
                    // InternalOptimind.g:558:4: 'PREPARED'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:562:2: ( ( 'NOT_PREPARED' ) )
                    {
                    // InternalOptimind.g:562:2: ( ( 'NOT_PREPARED' ) )
                    // InternalOptimind.g:563:3: ( 'NOT_PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 
                    // InternalOptimind.g:564:3: ( 'NOT_PREPARED' )
                    // InternalOptimind.g:564:4: 'NOT_PREPARED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:568:2: ( ( 'PROCESSING' ) )
                    {
                    // InternalOptimind.g:568:2: ( ( 'PROCESSING' ) )
                    // InternalOptimind.g:569:3: ( 'PROCESSING' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3()); 
                    // InternalOptimind.g:570:3: ( 'PROCESSING' )
                    // InternalOptimind.g:570:4: 'PROCESSING'
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
    // InternalOptimind.g:578:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:582:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalOptimind.g:583:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
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
    // InternalOptimind.g:590:1: rule__Workflow__Group__0__Impl : ( () ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:594:1: ( ( () ) )
            // InternalOptimind.g:595:1: ( () )
            {
            // InternalOptimind.g:595:1: ( () )
            // InternalOptimind.g:596:2: ()
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowAction_0()); 
            // InternalOptimind.g:597:2: ()
            // InternalOptimind.g:597:3: 
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
    // InternalOptimind.g:605:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:609:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalOptimind.g:610:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
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
    // InternalOptimind.g:617:1: rule__Workflow__Group__1__Impl : ( 'Workflow' ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:621:1: ( ( 'Workflow' ) )
            // InternalOptimind.g:622:1: ( 'Workflow' )
            {
            // InternalOptimind.g:622:1: ( 'Workflow' )
            // InternalOptimind.g:623:2: 'Workflow'
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
    // InternalOptimind.g:632:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:636:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalOptimind.g:637:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
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
    // InternalOptimind.g:644:1: rule__Workflow__Group__2__Impl : ( ( rule__Workflow__NameAssignment_2 ) ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:648:1: ( ( ( rule__Workflow__NameAssignment_2 ) ) )
            // InternalOptimind.g:649:1: ( ( rule__Workflow__NameAssignment_2 ) )
            {
            // InternalOptimind.g:649:1: ( ( rule__Workflow__NameAssignment_2 ) )
            // InternalOptimind.g:650:2: ( rule__Workflow__NameAssignment_2 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_2()); 
            // InternalOptimind.g:651:2: ( rule__Workflow__NameAssignment_2 )
            // InternalOptimind.g:651:3: rule__Workflow__NameAssignment_2
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
    // InternalOptimind.g:659:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:663:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalOptimind.g:664:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
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
    // InternalOptimind.g:671:1: rule__Workflow__Group__3__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:675:1: ( ( '{' ) )
            // InternalOptimind.g:676:1: ( '{' )
            {
            // InternalOptimind.g:676:1: ( '{' )
            // InternalOptimind.g:677:2: '{'
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
    // InternalOptimind.g:686:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl rule__Workflow__Group__5 ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:690:1: ( rule__Workflow__Group__4__Impl rule__Workflow__Group__5 )
            // InternalOptimind.g:691:2: rule__Workflow__Group__4__Impl rule__Workflow__Group__5
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
    // InternalOptimind.g:698:1: rule__Workflow__Group__4__Impl : ( ( rule__Workflow__Group_4__0 )? ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:702:1: ( ( ( rule__Workflow__Group_4__0 )? ) )
            // InternalOptimind.g:703:1: ( ( rule__Workflow__Group_4__0 )? )
            {
            // InternalOptimind.g:703:1: ( ( rule__Workflow__Group_4__0 )? )
            // InternalOptimind.g:704:2: ( rule__Workflow__Group_4__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4()); 
            // InternalOptimind.g:705:2: ( rule__Workflow__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptimind.g:705:3: rule__Workflow__Group_4__0
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
    // InternalOptimind.g:713:1: rule__Workflow__Group__5 : rule__Workflow__Group__5__Impl rule__Workflow__Group__6 ;
    public final void rule__Workflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:717:1: ( rule__Workflow__Group__5__Impl rule__Workflow__Group__6 )
            // InternalOptimind.g:718:2: rule__Workflow__Group__5__Impl rule__Workflow__Group__6
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
    // InternalOptimind.g:725:1: rule__Workflow__Group__5__Impl : ( ( rule__Workflow__BaseTaskAssignment_5 )? ) ;
    public final void rule__Workflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:729:1: ( ( ( rule__Workflow__BaseTaskAssignment_5 )? ) )
            // InternalOptimind.g:730:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            {
            // InternalOptimind.g:730:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            // InternalOptimind.g:731:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            {
             before(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5()); 
            // InternalOptimind.g:732:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptimind.g:732:3: rule__Workflow__BaseTaskAssignment_5
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
    // InternalOptimind.g:740:1: rule__Workflow__Group__6 : rule__Workflow__Group__6__Impl rule__Workflow__Group__7 ;
    public final void rule__Workflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:744:1: ( rule__Workflow__Group__6__Impl rule__Workflow__Group__7 )
            // InternalOptimind.g:745:2: rule__Workflow__Group__6__Impl rule__Workflow__Group__7
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
    // InternalOptimind.g:752:1: rule__Workflow__Group__6__Impl : ( ( rule__Workflow__Group_6__0 )? ) ;
    public final void rule__Workflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:756:1: ( ( ( rule__Workflow__Group_6__0 )? ) )
            // InternalOptimind.g:757:1: ( ( rule__Workflow__Group_6__0 )? )
            {
            // InternalOptimind.g:757:1: ( ( rule__Workflow__Group_6__0 )? )
            // InternalOptimind.g:758:2: ( rule__Workflow__Group_6__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_6()); 
            // InternalOptimind.g:759:2: ( rule__Workflow__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:759:3: rule__Workflow__Group_6__0
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
    // InternalOptimind.g:767:1: rule__Workflow__Group__7 : rule__Workflow__Group__7__Impl ;
    public final void rule__Workflow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:771:1: ( rule__Workflow__Group__7__Impl )
            // InternalOptimind.g:772:2: rule__Workflow__Group__7__Impl
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
    // InternalOptimind.g:778:1: rule__Workflow__Group__7__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:782:1: ( ( '}' ) )
            // InternalOptimind.g:783:1: ( '}' )
            {
            // InternalOptimind.g:783:1: ( '}' )
            // InternalOptimind.g:784:2: '}'
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
    // InternalOptimind.g:794:1: rule__Workflow__Group_4__0 : rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 ;
    public final void rule__Workflow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:798:1: ( rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 )
            // InternalOptimind.g:799:2: rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1
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
    // InternalOptimind.g:806:1: rule__Workflow__Group_4__0__Impl : ( 'Language' ) ;
    public final void rule__Workflow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:810:1: ( ( 'Language' ) )
            // InternalOptimind.g:811:1: ( 'Language' )
            {
            // InternalOptimind.g:811:1: ( 'Language' )
            // InternalOptimind.g:812:2: 'Language'
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
    // InternalOptimind.g:821:1: rule__Workflow__Group_4__1 : rule__Workflow__Group_4__1__Impl ;
    public final void rule__Workflow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:825:1: ( rule__Workflow__Group_4__1__Impl )
            // InternalOptimind.g:826:2: rule__Workflow__Group_4__1__Impl
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
    // InternalOptimind.g:832:1: rule__Workflow__Group_4__1__Impl : ( ( rule__Workflow__LanguageAssignment_4_1 ) ) ;
    public final void rule__Workflow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:836:1: ( ( ( rule__Workflow__LanguageAssignment_4_1 ) ) )
            // InternalOptimind.g:837:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            {
            // InternalOptimind.g:837:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            // InternalOptimind.g:838:2: ( rule__Workflow__LanguageAssignment_4_1 )
            {
             before(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1()); 
            // InternalOptimind.g:839:2: ( rule__Workflow__LanguageAssignment_4_1 )
            // InternalOptimind.g:839:3: rule__Workflow__LanguageAssignment_4_1
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
    // InternalOptimind.g:848:1: rule__Workflow__Group_6__0 : rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 ;
    public final void rule__Workflow__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:852:1: ( rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 )
            // InternalOptimind.g:853:2: rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1
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
    // InternalOptimind.g:860:1: rule__Workflow__Group_6__0__Impl : ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) ;
    public final void rule__Workflow__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:864:1: ( ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) )
            // InternalOptimind.g:865:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            {
            // InternalOptimind.g:865:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            // InternalOptimind.g:866:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0()); 
            // InternalOptimind.g:867:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            // InternalOptimind.g:867:3: rule__Workflow__FunctionsAssignment_6_0
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
    // InternalOptimind.g:875:1: rule__Workflow__Group_6__1 : rule__Workflow__Group_6__1__Impl ;
    public final void rule__Workflow__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:879:1: ( rule__Workflow__Group_6__1__Impl )
            // InternalOptimind.g:880:2: rule__Workflow__Group_6__1__Impl
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
    // InternalOptimind.g:886:1: rule__Workflow__Group_6__1__Impl : ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) ;
    public final void rule__Workflow__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:890:1: ( ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) )
            // InternalOptimind.g:891:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            {
            // InternalOptimind.g:891:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            // InternalOptimind.g:892:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1()); 
            // InternalOptimind.g:893:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOptimind.g:893:3: rule__Workflow__FunctionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workflow__FunctionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalOptimind.g:902:1: rule__TaskOutput__Group__0 : rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 ;
    public final void rule__TaskOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:906:1: ( rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 )
            // InternalOptimind.g:907:2: rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1
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
    // InternalOptimind.g:914:1: rule__TaskOutput__Group__0__Impl : ( () ) ;
    public final void rule__TaskOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:918:1: ( ( () ) )
            // InternalOptimind.g:919:1: ( () )
            {
            // InternalOptimind.g:919:1: ( () )
            // InternalOptimind.g:920:2: ()
            {
             before(grammarAccess.getTaskOutputAccess().getTaskOutputAction_0()); 
            // InternalOptimind.g:921:2: ()
            // InternalOptimind.g:921:3: 
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
    // InternalOptimind.g:929:1: rule__TaskOutput__Group__1 : rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 ;
    public final void rule__TaskOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:933:1: ( rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 )
            // InternalOptimind.g:934:2: rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2
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
    // InternalOptimind.g:941:1: rule__TaskOutput__Group__1__Impl : ( 'Output' ) ;
    public final void rule__TaskOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:945:1: ( ( 'Output' ) )
            // InternalOptimind.g:946:1: ( 'Output' )
            {
            // InternalOptimind.g:946:1: ( 'Output' )
            // InternalOptimind.g:947:2: 'Output'
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
    // InternalOptimind.g:956:1: rule__TaskOutput__Group__2 : rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 ;
    public final void rule__TaskOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:960:1: ( rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 )
            // InternalOptimind.g:961:2: rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3
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
    // InternalOptimind.g:968:1: rule__TaskOutput__Group__2__Impl : ( ( rule__TaskOutput__NameAssignment_2 ) ) ;
    public final void rule__TaskOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:972:1: ( ( ( rule__TaskOutput__NameAssignment_2 ) ) )
            // InternalOptimind.g:973:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            {
            // InternalOptimind.g:973:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            // InternalOptimind.g:974:2: ( rule__TaskOutput__NameAssignment_2 )
            {
             before(grammarAccess.getTaskOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:975:2: ( rule__TaskOutput__NameAssignment_2 )
            // InternalOptimind.g:975:3: rule__TaskOutput__NameAssignment_2
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
    // InternalOptimind.g:983:1: rule__TaskOutput__Group__3 : rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 ;
    public final void rule__TaskOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:987:1: ( rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 )
            // InternalOptimind.g:988:2: rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4
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
    // InternalOptimind.g:995:1: rule__TaskOutput__Group__3__Impl : ( ( rule__TaskOutput__Group_3__0 )? ) ;
    public final void rule__TaskOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:999:1: ( ( ( rule__TaskOutput__Group_3__0 )? ) )
            // InternalOptimind.g:1000:1: ( ( rule__TaskOutput__Group_3__0 )? )
            {
            // InternalOptimind.g:1000:1: ( ( rule__TaskOutput__Group_3__0 )? )
            // InternalOptimind.g:1001:2: ( rule__TaskOutput__Group_3__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_3()); 
            // InternalOptimind.g:1002:2: ( rule__TaskOutput__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimind.g:1002:3: rule__TaskOutput__Group_3__0
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
    // InternalOptimind.g:1010:1: rule__TaskOutput__Group__4 : rule__TaskOutput__Group__4__Impl ;
    public final void rule__TaskOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1014:1: ( rule__TaskOutput__Group__4__Impl )
            // InternalOptimind.g:1015:2: rule__TaskOutput__Group__4__Impl
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
    // InternalOptimind.g:1021:1: rule__TaskOutput__Group__4__Impl : ( ( rule__TaskOutput__Group_4__0 )? ) ;
    public final void rule__TaskOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1025:1: ( ( ( rule__TaskOutput__Group_4__0 )? ) )
            // InternalOptimind.g:1026:1: ( ( rule__TaskOutput__Group_4__0 )? )
            {
            // InternalOptimind.g:1026:1: ( ( rule__TaskOutput__Group_4__0 )? )
            // InternalOptimind.g:1027:2: ( rule__TaskOutput__Group_4__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_4()); 
            // InternalOptimind.g:1028:2: ( rule__TaskOutput__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimind.g:1028:3: rule__TaskOutput__Group_4__0
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
    // InternalOptimind.g:1037:1: rule__TaskOutput__Group_3__0 : rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 ;
    public final void rule__TaskOutput__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1041:1: ( rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 )
            // InternalOptimind.g:1042:2: rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1
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
    // InternalOptimind.g:1049:1: rule__TaskOutput__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TaskOutput__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1053:1: ( ( 'type' ) )
            // InternalOptimind.g:1054:1: ( 'type' )
            {
            // InternalOptimind.g:1054:1: ( 'type' )
            // InternalOptimind.g:1055:2: 'type'
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
    // InternalOptimind.g:1064:1: rule__TaskOutput__Group_3__1 : rule__TaskOutput__Group_3__1__Impl ;
    public final void rule__TaskOutput__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1068:1: ( rule__TaskOutput__Group_3__1__Impl )
            // InternalOptimind.g:1069:2: rule__TaskOutput__Group_3__1__Impl
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
    // InternalOptimind.g:1075:1: rule__TaskOutput__Group_3__1__Impl : ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__TaskOutput__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1079:1: ( ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:1080:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:1080:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:1081:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:1082:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:1082:3: rule__TaskOutput__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:1091:1: rule__TaskOutput__Group_4__0 : rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 ;
    public final void rule__TaskOutput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1095:1: ( rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 )
            // InternalOptimind.g:1096:2: rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1
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
    // InternalOptimind.g:1103:1: rule__TaskOutput__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__TaskOutput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1107:1: ( ( 'value' ) )
            // InternalOptimind.g:1108:1: ( 'value' )
            {
            // InternalOptimind.g:1108:1: ( 'value' )
            // InternalOptimind.g:1109:2: 'value'
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
    // InternalOptimind.g:1118:1: rule__TaskOutput__Group_4__1 : rule__TaskOutput__Group_4__1__Impl ;
    public final void rule__TaskOutput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1122:1: ( rule__TaskOutput__Group_4__1__Impl )
            // InternalOptimind.g:1123:2: rule__TaskOutput__Group_4__1__Impl
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
    // InternalOptimind.g:1129:1: rule__TaskOutput__Group_4__1__Impl : ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__TaskOutput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1133:1: ( ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:1134:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:1134:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:1135:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:1136:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:1136:3: rule__TaskOutput__ValueAsStringAssignment_4_1
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


    // $ANTLR start "rule__BaseTask__Group__0"
    // InternalOptimind.g:1145:1: rule__BaseTask__Group__0 : rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 ;
    public final void rule__BaseTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1149:1: ( rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 )
            // InternalOptimind.g:1150:2: rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalOptimind.g:1157:1: rule__BaseTask__Group__0__Impl : ( () ) ;
    public final void rule__BaseTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1161:1: ( ( () ) )
            // InternalOptimind.g:1162:1: ( () )
            {
            // InternalOptimind.g:1162:1: ( () )
            // InternalOptimind.g:1163:2: ()
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskAction_0()); 
            // InternalOptimind.g:1164:2: ()
            // InternalOptimind.g:1164:3: 
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
    // InternalOptimind.g:1172:1: rule__BaseTask__Group__1 : rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 ;
    public final void rule__BaseTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1176:1: ( rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 )
            // InternalOptimind.g:1177:2: rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2
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
    // InternalOptimind.g:1184:1: rule__BaseTask__Group__1__Impl : ( 'BaseTask' ) ;
    public final void rule__BaseTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1188:1: ( ( 'BaseTask' ) )
            // InternalOptimind.g:1189:1: ( 'BaseTask' )
            {
            // InternalOptimind.g:1189:1: ( 'BaseTask' )
            // InternalOptimind.g:1190:2: 'BaseTask'
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalOptimind.g:1199:1: rule__BaseTask__Group__2 : rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 ;
    public final void rule__BaseTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1203:1: ( rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 )
            // InternalOptimind.g:1204:2: rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3
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
    // InternalOptimind.g:1211:1: rule__BaseTask__Group__2__Impl : ( ( rule__BaseTask__NameAssignment_2 ) ) ;
    public final void rule__BaseTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1215:1: ( ( ( rule__BaseTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:1216:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1216:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            // InternalOptimind.g:1217:2: ( rule__BaseTask__NameAssignment_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1218:2: ( rule__BaseTask__NameAssignment_2 )
            // InternalOptimind.g:1218:3: rule__BaseTask__NameAssignment_2
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
    // InternalOptimind.g:1226:1: rule__BaseTask__Group__3 : rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 ;
    public final void rule__BaseTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1230:1: ( rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 )
            // InternalOptimind.g:1231:2: rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1238:1: rule__BaseTask__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1242:1: ( ( '{' ) )
            // InternalOptimind.g:1243:1: ( '{' )
            {
            // InternalOptimind.g:1243:1: ( '{' )
            // InternalOptimind.g:1244:2: '{'
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
    // InternalOptimind.g:1253:1: rule__BaseTask__Group__4 : rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 ;
    public final void rule__BaseTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1257:1: ( rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 )
            // InternalOptimind.g:1258:2: rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1265:1: rule__BaseTask__Group__4__Impl : ( ( rule__BaseTask__Group_4__0 )? ) ;
    public final void rule__BaseTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1269:1: ( ( ( rule__BaseTask__Group_4__0 )? ) )
            // InternalOptimind.g:1270:1: ( ( rule__BaseTask__Group_4__0 )? )
            {
            // InternalOptimind.g:1270:1: ( ( rule__BaseTask__Group_4__0 )? )
            // InternalOptimind.g:1271:2: ( rule__BaseTask__Group_4__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_4()); 
            // InternalOptimind.g:1272:2: ( rule__BaseTask__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptimind.g:1272:3: rule__BaseTask__Group_4__0
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
    // InternalOptimind.g:1280:1: rule__BaseTask__Group__5 : rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 ;
    public final void rule__BaseTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1284:1: ( rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 )
            // InternalOptimind.g:1285:2: rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1292:1: rule__BaseTask__Group__5__Impl : ( ( rule__BaseTask__Group_5__0 )? ) ;
    public final void rule__BaseTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1296:1: ( ( ( rule__BaseTask__Group_5__0 )? ) )
            // InternalOptimind.g:1297:1: ( ( rule__BaseTask__Group_5__0 )? )
            {
            // InternalOptimind.g:1297:1: ( ( rule__BaseTask__Group_5__0 )? )
            // InternalOptimind.g:1298:2: ( rule__BaseTask__Group_5__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5()); 
            // InternalOptimind.g:1299:2: ( rule__BaseTask__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptimind.g:1299:3: rule__BaseTask__Group_5__0
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
    // InternalOptimind.g:1307:1: rule__BaseTask__Group__6 : rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 ;
    public final void rule__BaseTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1311:1: ( rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 )
            // InternalOptimind.g:1312:2: rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1319:1: rule__BaseTask__Group__6__Impl : ( ( rule__BaseTask__Group_6__0 )? ) ;
    public final void rule__BaseTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1323:1: ( ( ( rule__BaseTask__Group_6__0 )? ) )
            // InternalOptimind.g:1324:1: ( ( rule__BaseTask__Group_6__0 )? )
            {
            // InternalOptimind.g:1324:1: ( ( rule__BaseTask__Group_6__0 )? )
            // InternalOptimind.g:1325:2: ( rule__BaseTask__Group_6__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6()); 
            // InternalOptimind.g:1326:2: ( rule__BaseTask__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:1326:3: rule__BaseTask__Group_6__0
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
    // InternalOptimind.g:1334:1: rule__BaseTask__Group__7 : rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 ;
    public final void rule__BaseTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1338:1: ( rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 )
            // InternalOptimind.g:1339:2: rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalOptimind.g:1346:1: rule__BaseTask__Group__7__Impl : ( ( rule__BaseTask__Group_7__0 )? ) ;
    public final void rule__BaseTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1350:1: ( ( ( rule__BaseTask__Group_7__0 )? ) )
            // InternalOptimind.g:1351:1: ( ( rule__BaseTask__Group_7__0 )? )
            {
            // InternalOptimind.g:1351:1: ( ( rule__BaseTask__Group_7__0 )? )
            // InternalOptimind.g:1352:2: ( rule__BaseTask__Group_7__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_7()); 
            // InternalOptimind.g:1353:2: ( rule__BaseTask__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24||LA16_0==29||LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptimind.g:1353:3: rule__BaseTask__Group_7__0
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
    // InternalOptimind.g:1361:1: rule__BaseTask__Group__8 : rule__BaseTask__Group__8__Impl ;
    public final void rule__BaseTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1365:1: ( rule__BaseTask__Group__8__Impl )
            // InternalOptimind.g:1366:2: rule__BaseTask__Group__8__Impl
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
    // InternalOptimind.g:1372:1: rule__BaseTask__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1376:1: ( ( '}' ) )
            // InternalOptimind.g:1377:1: ( '}' )
            {
            // InternalOptimind.g:1377:1: ( '}' )
            // InternalOptimind.g:1378:2: '}'
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
    // InternalOptimind.g:1388:1: rule__BaseTask__Group_4__0 : rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 ;
    public final void rule__BaseTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1392:1: ( rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 )
            // InternalOptimind.g:1393:2: rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOptimind.g:1400:1: rule__BaseTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__BaseTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1404:1: ( ( 'status' ) )
            // InternalOptimind.g:1405:1: ( 'status' )
            {
            // InternalOptimind.g:1405:1: ( 'status' )
            // InternalOptimind.g:1406:2: 'status'
            {
             before(grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOptimind.g:1415:1: rule__BaseTask__Group_4__1 : rule__BaseTask__Group_4__1__Impl ;
    public final void rule__BaseTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1419:1: ( rule__BaseTask__Group_4__1__Impl )
            // InternalOptimind.g:1420:2: rule__BaseTask__Group_4__1__Impl
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
    // InternalOptimind.g:1426:1: rule__BaseTask__Group_4__1__Impl : ( ( rule__BaseTask__StatusAssignment_4_1 ) ) ;
    public final void rule__BaseTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1430:1: ( ( ( rule__BaseTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:1431:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:1431:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:1432:2: ( rule__BaseTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:1433:2: ( rule__BaseTask__StatusAssignment_4_1 )
            // InternalOptimind.g:1433:3: rule__BaseTask__StatusAssignment_4_1
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
    // InternalOptimind.g:1442:1: rule__BaseTask__Group_5__0 : rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 ;
    public final void rule__BaseTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1446:1: ( rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 )
            // InternalOptimind.g:1447:2: rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1
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
    // InternalOptimind.g:1454:1: rule__BaseTask__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__BaseTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1458:1: ( ( 'inputs' ) )
            // InternalOptimind.g:1459:1: ( 'inputs' )
            {
            // InternalOptimind.g:1459:1: ( 'inputs' )
            // InternalOptimind.g:1460:2: 'inputs'
            {
             before(grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalOptimind.g:1469:1: rule__BaseTask__Group_5__1 : rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 ;
    public final void rule__BaseTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1473:1: ( rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 )
            // InternalOptimind.g:1474:2: rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:1481:1: rule__BaseTask__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1485:1: ( ( '{' ) )
            // InternalOptimind.g:1486:1: ( '{' )
            {
            // InternalOptimind.g:1486:1: ( '{' )
            // InternalOptimind.g:1487:2: '{'
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
    // InternalOptimind.g:1496:1: rule__BaseTask__Group_5__2 : rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 ;
    public final void rule__BaseTask__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1500:1: ( rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 )
            // InternalOptimind.g:1501:2: rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalOptimind.g:1508:1: rule__BaseTask__Group_5__2__Impl : ( ( rule__BaseTask__InputsAssignment_5_2 ) ) ;
    public final void rule__BaseTask__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1512:1: ( ( ( rule__BaseTask__InputsAssignment_5_2 ) ) )
            // InternalOptimind.g:1513:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            {
            // InternalOptimind.g:1513:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            // InternalOptimind.g:1514:2: ( rule__BaseTask__InputsAssignment_5_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2()); 
            // InternalOptimind.g:1515:2: ( rule__BaseTask__InputsAssignment_5_2 )
            // InternalOptimind.g:1515:3: rule__BaseTask__InputsAssignment_5_2
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
    // InternalOptimind.g:1523:1: rule__BaseTask__Group_5__3 : rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 ;
    public final void rule__BaseTask__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1527:1: ( rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 )
            // InternalOptimind.g:1528:2: rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalOptimind.g:1535:1: rule__BaseTask__Group_5__3__Impl : ( ( rule__BaseTask__Group_5_3__0 )* ) ;
    public final void rule__BaseTask__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1539:1: ( ( ( rule__BaseTask__Group_5_3__0 )* ) )
            // InternalOptimind.g:1540:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            {
            // InternalOptimind.g:1540:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            // InternalOptimind.g:1541:2: ( rule__BaseTask__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5_3()); 
            // InternalOptimind.g:1542:2: ( rule__BaseTask__Group_5_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOptimind.g:1542:3: rule__BaseTask__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__BaseTask__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalOptimind.g:1550:1: rule__BaseTask__Group_5__4 : rule__BaseTask__Group_5__4__Impl ;
    public final void rule__BaseTask__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1554:1: ( rule__BaseTask__Group_5__4__Impl )
            // InternalOptimind.g:1555:2: rule__BaseTask__Group_5__4__Impl
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
    // InternalOptimind.g:1561:1: rule__BaseTask__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1565:1: ( ( '}' ) )
            // InternalOptimind.g:1566:1: ( '}' )
            {
            // InternalOptimind.g:1566:1: ( '}' )
            // InternalOptimind.g:1567:2: '}'
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
    // InternalOptimind.g:1577:1: rule__BaseTask__Group_5_3__0 : rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 ;
    public final void rule__BaseTask__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1581:1: ( rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 )
            // InternalOptimind.g:1582:2: rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:1589:1: rule__BaseTask__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1593:1: ( ( ',' ) )
            // InternalOptimind.g:1594:1: ( ',' )
            {
            // InternalOptimind.g:1594:1: ( ',' )
            // InternalOptimind.g:1595:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOptimind.g:1604:1: rule__BaseTask__Group_5_3__1 : rule__BaseTask__Group_5_3__1__Impl ;
    public final void rule__BaseTask__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1608:1: ( rule__BaseTask__Group_5_3__1__Impl )
            // InternalOptimind.g:1609:2: rule__BaseTask__Group_5_3__1__Impl
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
    // InternalOptimind.g:1615:1: rule__BaseTask__Group_5_3__1__Impl : ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) ;
    public final void rule__BaseTask__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1619:1: ( ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) )
            // InternalOptimind.g:1620:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            {
            // InternalOptimind.g:1620:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            // InternalOptimind.g:1621:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1()); 
            // InternalOptimind.g:1622:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            // InternalOptimind.g:1622:3: rule__BaseTask__InputsAssignment_5_3_1
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
    // InternalOptimind.g:1631:1: rule__BaseTask__Group_6__0 : rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 ;
    public final void rule__BaseTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1635:1: ( rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 )
            // InternalOptimind.g:1636:2: rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1
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
    // InternalOptimind.g:1643:1: rule__BaseTask__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__BaseTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1647:1: ( ( 'outputs' ) )
            // InternalOptimind.g:1648:1: ( 'outputs' )
            {
            // InternalOptimind.g:1648:1: ( 'outputs' )
            // InternalOptimind.g:1649:2: 'outputs'
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalOptimind.g:1658:1: rule__BaseTask__Group_6__1 : rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 ;
    public final void rule__BaseTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1662:1: ( rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 )
            // InternalOptimind.g:1663:2: rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2
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
    // InternalOptimind.g:1670:1: rule__BaseTask__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1674:1: ( ( '{' ) )
            // InternalOptimind.g:1675:1: ( '{' )
            {
            // InternalOptimind.g:1675:1: ( '{' )
            // InternalOptimind.g:1676:2: '{'
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
    // InternalOptimind.g:1685:1: rule__BaseTask__Group_6__2 : rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 ;
    public final void rule__BaseTask__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1689:1: ( rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 )
            // InternalOptimind.g:1690:2: rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalOptimind.g:1697:1: rule__BaseTask__Group_6__2__Impl : ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) ;
    public final void rule__BaseTask__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1701:1: ( ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) )
            // InternalOptimind.g:1702:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            {
            // InternalOptimind.g:1702:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            // InternalOptimind.g:1703:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2()); 
            // InternalOptimind.g:1704:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            // InternalOptimind.g:1704:3: rule__BaseTask__OutputsAssignment_6_2
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
    // InternalOptimind.g:1712:1: rule__BaseTask__Group_6__3 : rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 ;
    public final void rule__BaseTask__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1716:1: ( rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 )
            // InternalOptimind.g:1717:2: rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalOptimind.g:1724:1: rule__BaseTask__Group_6__3__Impl : ( ( rule__BaseTask__Group_6_3__0 )* ) ;
    public final void rule__BaseTask__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1728:1: ( ( ( rule__BaseTask__Group_6_3__0 )* ) )
            // InternalOptimind.g:1729:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            {
            // InternalOptimind.g:1729:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            // InternalOptimind.g:1730:2: ( rule__BaseTask__Group_6_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6_3()); 
            // InternalOptimind.g:1731:2: ( rule__BaseTask__Group_6_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalOptimind.g:1731:3: rule__BaseTask__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__BaseTask__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalOptimind.g:1739:1: rule__BaseTask__Group_6__4 : rule__BaseTask__Group_6__4__Impl ;
    public final void rule__BaseTask__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1743:1: ( rule__BaseTask__Group_6__4__Impl )
            // InternalOptimind.g:1744:2: rule__BaseTask__Group_6__4__Impl
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
    // InternalOptimind.g:1750:1: rule__BaseTask__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1754:1: ( ( '}' ) )
            // InternalOptimind.g:1755:1: ( '}' )
            {
            // InternalOptimind.g:1755:1: ( '}' )
            // InternalOptimind.g:1756:2: '}'
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
    // InternalOptimind.g:1766:1: rule__BaseTask__Group_6_3__0 : rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 ;
    public final void rule__BaseTask__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1770:1: ( rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 )
            // InternalOptimind.g:1771:2: rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1
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
    // InternalOptimind.g:1778:1: rule__BaseTask__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1782:1: ( ( ',' ) )
            // InternalOptimind.g:1783:1: ( ',' )
            {
            // InternalOptimind.g:1783:1: ( ',' )
            // InternalOptimind.g:1784:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalOptimind.g:1793:1: rule__BaseTask__Group_6_3__1 : rule__BaseTask__Group_6_3__1__Impl ;
    public final void rule__BaseTask__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1797:1: ( rule__BaseTask__Group_6_3__1__Impl )
            // InternalOptimind.g:1798:2: rule__BaseTask__Group_6_3__1__Impl
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
    // InternalOptimind.g:1804:1: rule__BaseTask__Group_6_3__1__Impl : ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) ;
    public final void rule__BaseTask__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1808:1: ( ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) )
            // InternalOptimind.g:1809:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            {
            // InternalOptimind.g:1809:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            // InternalOptimind.g:1810:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1()); 
            // InternalOptimind.g:1811:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            // InternalOptimind.g:1811:3: rule__BaseTask__OutputsAssignment_6_3_1
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
    // InternalOptimind.g:1820:1: rule__BaseTask__Group_7__0 : rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 ;
    public final void rule__BaseTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1824:1: ( rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 )
            // InternalOptimind.g:1825:2: rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1
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
    // InternalOptimind.g:1832:1: rule__BaseTask__Group_7__0__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) ;
    public final void rule__BaseTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1836:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) )
            // InternalOptimind.g:1837:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            {
            // InternalOptimind.g:1837:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            // InternalOptimind.g:1838:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 
            // InternalOptimind.g:1839:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            // InternalOptimind.g:1839:3: rule__BaseTask__ChildrenAssignment_7_0
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
    // InternalOptimind.g:1847:1: rule__BaseTask__Group_7__1 : rule__BaseTask__Group_7__1__Impl ;
    public final void rule__BaseTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1851:1: ( rule__BaseTask__Group_7__1__Impl )
            // InternalOptimind.g:1852:2: rule__BaseTask__Group_7__1__Impl
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
    // InternalOptimind.g:1858:1: rule__BaseTask__Group_7__1__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) ;
    public final void rule__BaseTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1862:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) )
            // InternalOptimind.g:1863:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            {
            // InternalOptimind.g:1863:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            // InternalOptimind.g:1864:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_1()); 
            // InternalOptimind.g:1865:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24||LA19_0==29||LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptimind.g:1865:3: rule__BaseTask__ChildrenAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__BaseTask__ChildrenAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalOptimind.g:1874:1: rule__LibraryTask__Group__0 : rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 ;
    public final void rule__LibraryTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1878:1: ( rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 )
            // InternalOptimind.g:1879:2: rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalOptimind.g:1886:1: rule__LibraryTask__Group__0__Impl : ( () ) ;
    public final void rule__LibraryTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1890:1: ( ( () ) )
            // InternalOptimind.g:1891:1: ( () )
            {
            // InternalOptimind.g:1891:1: ( () )
            // InternalOptimind.g:1892:2: ()
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0()); 
            // InternalOptimind.g:1893:2: ()
            // InternalOptimind.g:1893:3: 
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
    // InternalOptimind.g:1901:1: rule__LibraryTask__Group__1 : rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 ;
    public final void rule__LibraryTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1905:1: ( rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 )
            // InternalOptimind.g:1906:2: rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2
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
    // InternalOptimind.g:1913:1: rule__LibraryTask__Group__1__Impl : ( 'LibraryTask' ) ;
    public final void rule__LibraryTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1917:1: ( ( 'LibraryTask' ) )
            // InternalOptimind.g:1918:1: ( 'LibraryTask' )
            {
            // InternalOptimind.g:1918:1: ( 'LibraryTask' )
            // InternalOptimind.g:1919:2: 'LibraryTask'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalOptimind.g:1928:1: rule__LibraryTask__Group__2 : rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 ;
    public final void rule__LibraryTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1932:1: ( rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 )
            // InternalOptimind.g:1933:2: rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3
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
    // InternalOptimind.g:1940:1: rule__LibraryTask__Group__2__Impl : ( ( rule__LibraryTask__NameAssignment_2 ) ) ;
    public final void rule__LibraryTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1944:1: ( ( ( rule__LibraryTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:1945:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1945:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            // InternalOptimind.g:1946:2: ( rule__LibraryTask__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1947:2: ( rule__LibraryTask__NameAssignment_2 )
            // InternalOptimind.g:1947:3: rule__LibraryTask__NameAssignment_2
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
    // InternalOptimind.g:1955:1: rule__LibraryTask__Group__3 : rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 ;
    public final void rule__LibraryTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1959:1: ( rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 )
            // InternalOptimind.g:1960:2: rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:1967:1: rule__LibraryTask__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1971:1: ( ( '{' ) )
            // InternalOptimind.g:1972:1: ( '{' )
            {
            // InternalOptimind.g:1972:1: ( '{' )
            // InternalOptimind.g:1973:2: '{'
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
    // InternalOptimind.g:1982:1: rule__LibraryTask__Group__4 : rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 ;
    public final void rule__LibraryTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1986:1: ( rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 )
            // InternalOptimind.g:1987:2: rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:1994:1: rule__LibraryTask__Group__4__Impl : ( ( rule__LibraryTask__Group_4__0 )? ) ;
    public final void rule__LibraryTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1998:1: ( ( ( rule__LibraryTask__Group_4__0 )? ) )
            // InternalOptimind.g:1999:1: ( ( rule__LibraryTask__Group_4__0 )? )
            {
            // InternalOptimind.g:1999:1: ( ( rule__LibraryTask__Group_4__0 )? )
            // InternalOptimind.g:2000:2: ( rule__LibraryTask__Group_4__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2001:2: ( rule__LibraryTask__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptimind.g:2001:3: rule__LibraryTask__Group_4__0
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
    // InternalOptimind.g:2009:1: rule__LibraryTask__Group__5 : rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 ;
    public final void rule__LibraryTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2013:1: ( rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 )
            // InternalOptimind.g:2014:2: rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:2021:1: rule__LibraryTask__Group__5__Impl : ( ( rule__LibraryTask__Group_5__0 )? ) ;
    public final void rule__LibraryTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2025:1: ( ( ( rule__LibraryTask__Group_5__0 )? ) )
            // InternalOptimind.g:2026:1: ( ( rule__LibraryTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2026:1: ( ( rule__LibraryTask__Group_5__0 )? )
            // InternalOptimind.g:2027:2: ( rule__LibraryTask__Group_5__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2028:2: ( rule__LibraryTask__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOptimind.g:2028:3: rule__LibraryTask__Group_5__0
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
    // InternalOptimind.g:2036:1: rule__LibraryTask__Group__6 : rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 ;
    public final void rule__LibraryTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2040:1: ( rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 )
            // InternalOptimind.g:2041:2: rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:2048:1: rule__LibraryTask__Group__6__Impl : ( ( rule__LibraryTask__Group_6__0 )? ) ;
    public final void rule__LibraryTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2052:1: ( ( ( rule__LibraryTask__Group_6__0 )? ) )
            // InternalOptimind.g:2053:1: ( ( rule__LibraryTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2053:1: ( ( rule__LibraryTask__Group_6__0 )? )
            // InternalOptimind.g:2054:2: ( rule__LibraryTask__Group_6__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2055:2: ( rule__LibraryTask__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptimind.g:2055:3: rule__LibraryTask__Group_6__0
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
    // InternalOptimind.g:2063:1: rule__LibraryTask__Group__7 : rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 ;
    public final void rule__LibraryTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2067:1: ( rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 )
            // InternalOptimind.g:2068:2: rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:2075:1: rule__LibraryTask__Group__7__Impl : ( ( rule__LibraryTask__Group_7__0 )? ) ;
    public final void rule__LibraryTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2079:1: ( ( ( rule__LibraryTask__Group_7__0 )? ) )
            // InternalOptimind.g:2080:1: ( ( rule__LibraryTask__Group_7__0 )? )
            {
            // InternalOptimind.g:2080:1: ( ( rule__LibraryTask__Group_7__0 )? )
            // InternalOptimind.g:2081:2: ( rule__LibraryTask__Group_7__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_7()); 
            // InternalOptimind.g:2082:2: ( rule__LibraryTask__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptimind.g:2082:3: rule__LibraryTask__Group_7__0
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
    // InternalOptimind.g:2090:1: rule__LibraryTask__Group__8 : rule__LibraryTask__Group__8__Impl ;
    public final void rule__LibraryTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2094:1: ( rule__LibraryTask__Group__8__Impl )
            // InternalOptimind.g:2095:2: rule__LibraryTask__Group__8__Impl
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
    // InternalOptimind.g:2101:1: rule__LibraryTask__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2105:1: ( ( '}' ) )
            // InternalOptimind.g:2106:1: ( '}' )
            {
            // InternalOptimind.g:2106:1: ( '}' )
            // InternalOptimind.g:2107:2: '}'
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
    // InternalOptimind.g:2117:1: rule__LibraryTask__Group_4__0 : rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 ;
    public final void rule__LibraryTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2121:1: ( rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 )
            // InternalOptimind.g:2122:2: rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOptimind.g:2129:1: rule__LibraryTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__LibraryTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2133:1: ( ( 'status' ) )
            // InternalOptimind.g:2134:1: ( 'status' )
            {
            // InternalOptimind.g:2134:1: ( 'status' )
            // InternalOptimind.g:2135:2: 'status'
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOptimind.g:2144:1: rule__LibraryTask__Group_4__1 : rule__LibraryTask__Group_4__1__Impl ;
    public final void rule__LibraryTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2148:1: ( rule__LibraryTask__Group_4__1__Impl )
            // InternalOptimind.g:2149:2: rule__LibraryTask__Group_4__1__Impl
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
    // InternalOptimind.g:2155:1: rule__LibraryTask__Group_4__1__Impl : ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) ;
    public final void rule__LibraryTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2159:1: ( ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:2160:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:2160:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:2161:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:2162:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            // InternalOptimind.g:2162:3: rule__LibraryTask__StatusAssignment_4_1
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
    // InternalOptimind.g:2171:1: rule__LibraryTask__Group_5__0 : rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 ;
    public final void rule__LibraryTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2175:1: ( rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 )
            // InternalOptimind.g:2176:2: rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:2183:1: rule__LibraryTask__Group_5__0__Impl : ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) ;
    public final void rule__LibraryTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2187:1: ( ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:2188:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:2188:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:2189:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:2190:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            // InternalOptimind.g:2190:3: rule__LibraryTask__InputsAssignment_5_0
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
    // InternalOptimind.g:2198:1: rule__LibraryTask__Group_5__1 : rule__LibraryTask__Group_5__1__Impl ;
    public final void rule__LibraryTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2202:1: ( rule__LibraryTask__Group_5__1__Impl )
            // InternalOptimind.g:2203:2: rule__LibraryTask__Group_5__1__Impl
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
    // InternalOptimind.g:2209:1: rule__LibraryTask__Group_5__1__Impl : ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) ;
    public final void rule__LibraryTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2213:1: ( ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:2214:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:2214:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:2215:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:2216:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=33 && LA24_0<=34)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOptimind.g:2216:3: rule__LibraryTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__LibraryTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalOptimind.g:2225:1: rule__LibraryTask__Group_6__0 : rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 ;
    public final void rule__LibraryTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2229:1: ( rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 )
            // InternalOptimind.g:2230:2: rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1
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
    // InternalOptimind.g:2237:1: rule__LibraryTask__Group_6__0__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__LibraryTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2241:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:2242:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:2242:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:2243:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:2244:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:2244:3: rule__LibraryTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:2252:1: rule__LibraryTask__Group_6__1 : rule__LibraryTask__Group_6__1__Impl ;
    public final void rule__LibraryTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2256:1: ( rule__LibraryTask__Group_6__1__Impl )
            // InternalOptimind.g:2257:2: rule__LibraryTask__Group_6__1__Impl
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
    // InternalOptimind.g:2263:1: rule__LibraryTask__Group_6__1__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__LibraryTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2267:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:2268:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:2268:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:2269:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:2270:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOptimind.g:2270:3: rule__LibraryTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__LibraryTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalOptimind.g:2279:1: rule__LibraryTask__Group_7__0 : rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 ;
    public final void rule__LibraryTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2283:1: ( rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 )
            // InternalOptimind.g:2284:2: rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1
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
    // InternalOptimind.g:2291:1: rule__LibraryTask__Group_7__0__Impl : ( 'Libraryfunction' ) ;
    public final void rule__LibraryTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2295:1: ( ( 'Libraryfunction' ) )
            // InternalOptimind.g:2296:1: ( 'Libraryfunction' )
            {
            // InternalOptimind.g:2296:1: ( 'Libraryfunction' )
            // InternalOptimind.g:2297:2: 'Libraryfunction'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOptimind.g:2306:1: rule__LibraryTask__Group_7__1 : rule__LibraryTask__Group_7__1__Impl ;
    public final void rule__LibraryTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2310:1: ( rule__LibraryTask__Group_7__1__Impl )
            // InternalOptimind.g:2311:2: rule__LibraryTask__Group_7__1__Impl
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
    // InternalOptimind.g:2317:1: rule__LibraryTask__Group_7__1__Impl : ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) ;
    public final void rule__LibraryTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2321:1: ( ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) )
            // InternalOptimind.g:2322:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            {
            // InternalOptimind.g:2322:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            // InternalOptimind.g:2323:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1()); 
            // InternalOptimind.g:2324:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            // InternalOptimind.g:2324:3: rule__LibraryTask__LibraryfunctionAssignment_7_1
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
    // InternalOptimind.g:2333:1: rule__CustomTask__Group__0 : rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 ;
    public final void rule__CustomTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2337:1: ( rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 )
            // InternalOptimind.g:2338:2: rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1
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
    // InternalOptimind.g:2345:1: rule__CustomTask__Group__0__Impl : ( () ) ;
    public final void rule__CustomTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2349:1: ( ( () ) )
            // InternalOptimind.g:2350:1: ( () )
            {
            // InternalOptimind.g:2350:1: ( () )
            // InternalOptimind.g:2351:2: ()
            {
             before(grammarAccess.getCustomTaskAccess().getCustomTaskAction_0()); 
            // InternalOptimind.g:2352:2: ()
            // InternalOptimind.g:2352:3: 
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
    // InternalOptimind.g:2360:1: rule__CustomTask__Group__1 : rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 ;
    public final void rule__CustomTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2364:1: ( rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 )
            // InternalOptimind.g:2365:2: rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2
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
    // InternalOptimind.g:2372:1: rule__CustomTask__Group__1__Impl : ( 'Task' ) ;
    public final void rule__CustomTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2376:1: ( ( 'Task' ) )
            // InternalOptimind.g:2377:1: ( 'Task' )
            {
            // InternalOptimind.g:2377:1: ( 'Task' )
            // InternalOptimind.g:2378:2: 'Task'
            {
             before(grammarAccess.getCustomTaskAccess().getTaskKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOptimind.g:2387:1: rule__CustomTask__Group__2 : rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 ;
    public final void rule__CustomTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2391:1: ( rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 )
            // InternalOptimind.g:2392:2: rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3
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
    // InternalOptimind.g:2399:1: rule__CustomTask__Group__2__Impl : ( ( rule__CustomTask__NameAssignment_2 ) ) ;
    public final void rule__CustomTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2403:1: ( ( ( rule__CustomTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2404:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2404:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            // InternalOptimind.g:2405:2: ( rule__CustomTask__NameAssignment_2 )
            {
             before(grammarAccess.getCustomTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2406:2: ( rule__CustomTask__NameAssignment_2 )
            // InternalOptimind.g:2406:3: rule__CustomTask__NameAssignment_2
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
    // InternalOptimind.g:2414:1: rule__CustomTask__Group__3 : rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 ;
    public final void rule__CustomTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2418:1: ( rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 )
            // InternalOptimind.g:2419:2: rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2426:1: rule__CustomTask__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2430:1: ( ( '{' ) )
            // InternalOptimind.g:2431:1: ( '{' )
            {
            // InternalOptimind.g:2431:1: ( '{' )
            // InternalOptimind.g:2432:2: '{'
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
    // InternalOptimind.g:2441:1: rule__CustomTask__Group__4 : rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 ;
    public final void rule__CustomTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2445:1: ( rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 )
            // InternalOptimind.g:2446:2: rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2453:1: rule__CustomTask__Group__4__Impl : ( ( rule__CustomTask__Group_4__0 )? ) ;
    public final void rule__CustomTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2457:1: ( ( ( rule__CustomTask__Group_4__0 )? ) )
            // InternalOptimind.g:2458:1: ( ( rule__CustomTask__Group_4__0 )? )
            {
            // InternalOptimind.g:2458:1: ( ( rule__CustomTask__Group_4__0 )? )
            // InternalOptimind.g:2459:2: ( rule__CustomTask__Group_4__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2460:2: ( rule__CustomTask__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptimind.g:2460:3: rule__CustomTask__Group_4__0
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
    // InternalOptimind.g:2468:1: rule__CustomTask__Group__5 : rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 ;
    public final void rule__CustomTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2472:1: ( rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 )
            // InternalOptimind.g:2473:2: rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2480:1: rule__CustomTask__Group__5__Impl : ( ( rule__CustomTask__Group_5__0 )? ) ;
    public final void rule__CustomTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2484:1: ( ( ( rule__CustomTask__Group_5__0 )? ) )
            // InternalOptimind.g:2485:1: ( ( rule__CustomTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2485:1: ( ( rule__CustomTask__Group_5__0 )? )
            // InternalOptimind.g:2486:2: ( rule__CustomTask__Group_5__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2487:2: ( rule__CustomTask__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=33 && LA27_0<=34)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptimind.g:2487:3: rule__CustomTask__Group_5__0
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
    // InternalOptimind.g:2495:1: rule__CustomTask__Group__6 : rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 ;
    public final void rule__CustomTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2499:1: ( rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 )
            // InternalOptimind.g:2500:2: rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2507:1: rule__CustomTask__Group__6__Impl : ( ( rule__CustomTask__Group_6__0 )? ) ;
    public final void rule__CustomTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2511:1: ( ( ( rule__CustomTask__Group_6__0 )? ) )
            // InternalOptimind.g:2512:1: ( ( rule__CustomTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2512:1: ( ( rule__CustomTask__Group_6__0 )? )
            // InternalOptimind.g:2513:2: ( rule__CustomTask__Group_6__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2514:2: ( rule__CustomTask__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptimind.g:2514:3: rule__CustomTask__Group_6__0
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
    // InternalOptimind.g:2522:1: rule__CustomTask__Group__7 : rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 ;
    public final void rule__CustomTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2526:1: ( rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 )
            // InternalOptimind.g:2527:2: rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2534:1: rule__CustomTask__Group__7__Impl : ( ( rule__CustomTask__Group_7__0 )? ) ;
    public final void rule__CustomTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2538:1: ( ( ( rule__CustomTask__Group_7__0 )? ) )
            // InternalOptimind.g:2539:1: ( ( rule__CustomTask__Group_7__0 )? )
            {
            // InternalOptimind.g:2539:1: ( ( rule__CustomTask__Group_7__0 )? )
            // InternalOptimind.g:2540:2: ( rule__CustomTask__Group_7__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_7()); 
            // InternalOptimind.g:2541:2: ( rule__CustomTask__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimind.g:2541:3: rule__CustomTask__Group_7__0
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
    // InternalOptimind.g:2549:1: rule__CustomTask__Group__8 : rule__CustomTask__Group__8__Impl ;
    public final void rule__CustomTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2553:1: ( rule__CustomTask__Group__8__Impl )
            // InternalOptimind.g:2554:2: rule__CustomTask__Group__8__Impl
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
    // InternalOptimind.g:2560:1: rule__CustomTask__Group__8__Impl : ( '}' ) ;
    public final void rule__CustomTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2564:1: ( ( '}' ) )
            // InternalOptimind.g:2565:1: ( '}' )
            {
            // InternalOptimind.g:2565:1: ( '}' )
            // InternalOptimind.g:2566:2: '}'
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
    // InternalOptimind.g:2576:1: rule__CustomTask__Group_4__0 : rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 ;
    public final void rule__CustomTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2580:1: ( rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 )
            // InternalOptimind.g:2581:2: rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalOptimind.g:2588:1: rule__CustomTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__CustomTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2592:1: ( ( 'status' ) )
            // InternalOptimind.g:2593:1: ( 'status' )
            {
            // InternalOptimind.g:2593:1: ( 'status' )
            // InternalOptimind.g:2594:2: 'status'
            {
             before(grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalOptimind.g:2603:1: rule__CustomTask__Group_4__1 : rule__CustomTask__Group_4__1__Impl ;
    public final void rule__CustomTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2607:1: ( rule__CustomTask__Group_4__1__Impl )
            // InternalOptimind.g:2608:2: rule__CustomTask__Group_4__1__Impl
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
    // InternalOptimind.g:2614:1: rule__CustomTask__Group_4__1__Impl : ( ( rule__CustomTask__StatusAssignment_4_1 ) ) ;
    public final void rule__CustomTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2618:1: ( ( ( rule__CustomTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:2619:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:2619:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:2620:2: ( rule__CustomTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:2621:2: ( rule__CustomTask__StatusAssignment_4_1 )
            // InternalOptimind.g:2621:3: rule__CustomTask__StatusAssignment_4_1
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
    // InternalOptimind.g:2630:1: rule__CustomTask__Group_5__0 : rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 ;
    public final void rule__CustomTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2634:1: ( rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 )
            // InternalOptimind.g:2635:2: rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:2642:1: rule__CustomTask__Group_5__0__Impl : ( ( rule__CustomTask__InputsAssignment_5_0 ) ) ;
    public final void rule__CustomTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2646:1: ( ( ( rule__CustomTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:2647:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:2647:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:2648:2: ( rule__CustomTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:2649:2: ( rule__CustomTask__InputsAssignment_5_0 )
            // InternalOptimind.g:2649:3: rule__CustomTask__InputsAssignment_5_0
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
    // InternalOptimind.g:2657:1: rule__CustomTask__Group_5__1 : rule__CustomTask__Group_5__1__Impl ;
    public final void rule__CustomTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2661:1: ( rule__CustomTask__Group_5__1__Impl )
            // InternalOptimind.g:2662:2: rule__CustomTask__Group_5__1__Impl
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
    // InternalOptimind.g:2668:1: rule__CustomTask__Group_5__1__Impl : ( ( rule__CustomTask__InputsAssignment_5_1 )* ) ;
    public final void rule__CustomTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2672:1: ( ( ( rule__CustomTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:2673:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:2673:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:2674:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:2675:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=33 && LA30_0<=34)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOptimind.g:2675:3: rule__CustomTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__CustomTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalOptimind.g:2684:1: rule__CustomTask__Group_6__0 : rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 ;
    public final void rule__CustomTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2688:1: ( rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 )
            // InternalOptimind.g:2689:2: rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1
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
    // InternalOptimind.g:2696:1: rule__CustomTask__Group_6__0__Impl : ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__CustomTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2700:1: ( ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:2701:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:2701:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:2702:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:2703:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:2703:3: rule__CustomTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:2711:1: rule__CustomTask__Group_6__1 : rule__CustomTask__Group_6__1__Impl ;
    public final void rule__CustomTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2715:1: ( rule__CustomTask__Group_6__1__Impl )
            // InternalOptimind.g:2716:2: rule__CustomTask__Group_6__1__Impl
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
    // InternalOptimind.g:2722:1: rule__CustomTask__Group_6__1__Impl : ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__CustomTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2726:1: ( ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:2727:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:2727:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:2728:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:2729:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOptimind.g:2729:3: rule__CustomTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__CustomTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalOptimind.g:2738:1: rule__CustomTask__Group_7__0 : rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 ;
    public final void rule__CustomTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2742:1: ( rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 )
            // InternalOptimind.g:2743:2: rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1
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
    // InternalOptimind.g:2750:1: rule__CustomTask__Group_7__0__Impl : ( 'runner' ) ;
    public final void rule__CustomTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2754:1: ( ( 'runner' ) )
            // InternalOptimind.g:2755:1: ( 'runner' )
            {
            // InternalOptimind.g:2755:1: ( 'runner' )
            // InternalOptimind.g:2756:2: 'runner'
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOptimind.g:2765:1: rule__CustomTask__Group_7__1 : rule__CustomTask__Group_7__1__Impl ;
    public final void rule__CustomTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2769:1: ( rule__CustomTask__Group_7__1__Impl )
            // InternalOptimind.g:2770:2: rule__CustomTask__Group_7__1__Impl
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
    // InternalOptimind.g:2776:1: rule__CustomTask__Group_7__1__Impl : ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) ;
    public final void rule__CustomTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2780:1: ( ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) )
            // InternalOptimind.g:2781:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            {
            // InternalOptimind.g:2781:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            // InternalOptimind.g:2782:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1()); 
            // InternalOptimind.g:2783:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            // InternalOptimind.g:2783:3: rule__CustomTask__RunnerAssignment_7_1
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
    // InternalOptimind.g:2792:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2796:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // InternalOptimind.g:2797:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2804:1: rule__Setter__Group__0__Impl : ( () ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2808:1: ( ( () ) )
            // InternalOptimind.g:2809:1: ( () )
            {
            // InternalOptimind.g:2809:1: ( () )
            // InternalOptimind.g:2810:2: ()
            {
             before(grammarAccess.getSetterAccess().getSetterAction_0()); 
            // InternalOptimind.g:2811:2: ()
            // InternalOptimind.g:2811:3: 
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
    // InternalOptimind.g:2819:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2823:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // InternalOptimind.g:2824:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
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
    // InternalOptimind.g:2831:1: rule__Setter__Group__1__Impl : ( 'Setter' ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2835:1: ( ( 'Setter' ) )
            // InternalOptimind.g:2836:1: ( 'Setter' )
            {
            // InternalOptimind.g:2836:1: ( 'Setter' )
            // InternalOptimind.g:2837:2: 'Setter'
            {
             before(grammarAccess.getSetterAccess().getSetterKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOptimind.g:2846:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2850:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // InternalOptimind.g:2851:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
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
    // InternalOptimind.g:2858:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__NameAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2862:1: ( ( ( rule__Setter__NameAssignment_2 ) ) )
            // InternalOptimind.g:2863:1: ( ( rule__Setter__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2863:1: ( ( rule__Setter__NameAssignment_2 ) )
            // InternalOptimind.g:2864:2: ( rule__Setter__NameAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2865:2: ( rule__Setter__NameAssignment_2 )
            // InternalOptimind.g:2865:3: rule__Setter__NameAssignment_2
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
    // InternalOptimind.g:2873:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl rule__Setter__Group__4 ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2877:1: ( rule__Setter__Group__3__Impl rule__Setter__Group__4 )
            // InternalOptimind.g:2878:2: rule__Setter__Group__3__Impl rule__Setter__Group__4
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
    // InternalOptimind.g:2885:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__Group_3__0 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2889:1: ( ( ( rule__Setter__Group_3__0 )? ) )
            // InternalOptimind.g:2890:1: ( ( rule__Setter__Group_3__0 )? )
            {
            // InternalOptimind.g:2890:1: ( ( rule__Setter__Group_3__0 )? )
            // InternalOptimind.g:2891:2: ( rule__Setter__Group_3__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_3()); 
            // InternalOptimind.g:2892:2: ( rule__Setter__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==22) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimind.g:2892:3: rule__Setter__Group_3__0
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
    // InternalOptimind.g:2900:1: rule__Setter__Group__4 : rule__Setter__Group__4__Impl ;
    public final void rule__Setter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2904:1: ( rule__Setter__Group__4__Impl )
            // InternalOptimind.g:2905:2: rule__Setter__Group__4__Impl
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
    // InternalOptimind.g:2911:1: rule__Setter__Group__4__Impl : ( ( rule__Setter__Group_4__0 )? ) ;
    public final void rule__Setter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2915:1: ( ( ( rule__Setter__Group_4__0 )? ) )
            // InternalOptimind.g:2916:1: ( ( rule__Setter__Group_4__0 )? )
            {
            // InternalOptimind.g:2916:1: ( ( rule__Setter__Group_4__0 )? )
            // InternalOptimind.g:2917:2: ( rule__Setter__Group_4__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_4()); 
            // InternalOptimind.g:2918:2: ( rule__Setter__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOptimind.g:2918:3: rule__Setter__Group_4__0
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
    // InternalOptimind.g:2927:1: rule__Setter__Group_3__0 : rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 ;
    public final void rule__Setter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2931:1: ( rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 )
            // InternalOptimind.g:2932:2: rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1
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
    // InternalOptimind.g:2939:1: rule__Setter__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Setter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2943:1: ( ( 'type' ) )
            // InternalOptimind.g:2944:1: ( 'type' )
            {
            // InternalOptimind.g:2944:1: ( 'type' )
            // InternalOptimind.g:2945:2: 'type'
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
    // InternalOptimind.g:2954:1: rule__Setter__Group_3__1 : rule__Setter__Group_3__1__Impl ;
    public final void rule__Setter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2958:1: ( rule__Setter__Group_3__1__Impl )
            // InternalOptimind.g:2959:2: rule__Setter__Group_3__1__Impl
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
    // InternalOptimind.g:2965:1: rule__Setter__Group_3__1__Impl : ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Setter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2969:1: ( ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:2970:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:2970:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:2971:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:2972:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:2972:3: rule__Setter__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:2981:1: rule__Setter__Group_4__0 : rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 ;
    public final void rule__Setter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2985:1: ( rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 )
            // InternalOptimind.g:2986:2: rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1
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
    // InternalOptimind.g:2993:1: rule__Setter__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Setter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2997:1: ( ( 'value' ) )
            // InternalOptimind.g:2998:1: ( 'value' )
            {
            // InternalOptimind.g:2998:1: ( 'value' )
            // InternalOptimind.g:2999:2: 'value'
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
    // InternalOptimind.g:3008:1: rule__Setter__Group_4__1 : rule__Setter__Group_4__1__Impl ;
    public final void rule__Setter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3012:1: ( rule__Setter__Group_4__1__Impl )
            // InternalOptimind.g:3013:2: rule__Setter__Group_4__1__Impl
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
    // InternalOptimind.g:3019:1: rule__Setter__Group_4__1__Impl : ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Setter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3023:1: ( ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:3024:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:3024:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:3025:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:3026:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:3026:3: rule__Setter__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:3035:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3039:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalOptimind.g:3040:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalOptimind.g:3047:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3051:1: ( ( () ) )
            // InternalOptimind.g:3052:1: ( () )
            {
            // InternalOptimind.g:3052:1: ( () )
            // InternalOptimind.g:3053:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalOptimind.g:3054:2: ()
            // InternalOptimind.g:3054:3: 
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
    // InternalOptimind.g:3062:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3066:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalOptimind.g:3067:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
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
    // InternalOptimind.g:3074:1: rule__Connection__Group__1__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3078:1: ( ( 'Connection' ) )
            // InternalOptimind.g:3079:1: ( 'Connection' )
            {
            // InternalOptimind.g:3079:1: ( 'Connection' )
            // InternalOptimind.g:3080:2: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOptimind.g:3089:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3093:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalOptimind.g:3094:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalOptimind.g:3101:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__NameAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3105:1: ( ( ( rule__Connection__NameAssignment_2 ) ) )
            // InternalOptimind.g:3106:1: ( ( rule__Connection__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3106:1: ( ( rule__Connection__NameAssignment_2 ) )
            // InternalOptimind.g:3107:2: ( rule__Connection__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3108:2: ( rule__Connection__NameAssignment_2 )
            // InternalOptimind.g:3108:3: rule__Connection__NameAssignment_2
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
    // InternalOptimind.g:3116:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3120:1: ( rule__Connection__Group__3__Impl )
            // InternalOptimind.g:3121:2: rule__Connection__Group__3__Impl
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
    // InternalOptimind.g:3127:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3131:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // InternalOptimind.g:3132:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // InternalOptimind.g:3132:1: ( ( rule__Connection__Group_3__0 )? )
            // InternalOptimind.g:3133:2: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // InternalOptimind.g:3134:2: ( rule__Connection__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptimind.g:3134:3: rule__Connection__Group_3__0
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
    // InternalOptimind.g:3143:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3147:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // InternalOptimind.g:3148:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
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
    // InternalOptimind.g:3155:1: rule__Connection__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3159:1: ( ( 'to' ) )
            // InternalOptimind.g:3160:1: ( 'to' )
            {
            // InternalOptimind.g:3160:1: ( 'to' )
            // InternalOptimind.g:3161:2: 'to'
            {
             before(grammarAccess.getConnectionAccess().getToKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOptimind.g:3170:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3174:1: ( rule__Connection__Group_3__1__Impl )
            // InternalOptimind.g:3175:2: rule__Connection__Group_3__1__Impl
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
    // InternalOptimind.g:3181:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3185:1: ( ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) )
            // InternalOptimind.g:3186:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            {
            // InternalOptimind.g:3186:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            // InternalOptimind.g:3187:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1()); 
            // InternalOptimind.g:3188:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            // InternalOptimind.g:3188:3: rule__Connection__TaskoutputAssignment_3_1
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
    // InternalOptimind.g:3197:1: rule__LibraryFunction__Group__0 : rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 ;
    public final void rule__LibraryFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3201:1: ( rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 )
            // InternalOptimind.g:3202:2: rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1
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
    // InternalOptimind.g:3209:1: rule__LibraryFunction__Group__0__Impl : ( () ) ;
    public final void rule__LibraryFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3213:1: ( ( () ) )
            // InternalOptimind.g:3214:1: ( () )
            {
            // InternalOptimind.g:3214:1: ( () )
            // InternalOptimind.g:3215:2: ()
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0()); 
            // InternalOptimind.g:3216:2: ()
            // InternalOptimind.g:3216:3: 
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
    // InternalOptimind.g:3224:1: rule__LibraryFunction__Group__1 : rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 ;
    public final void rule__LibraryFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3228:1: ( rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 )
            // InternalOptimind.g:3229:2: rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2
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
    // InternalOptimind.g:3236:1: rule__LibraryFunction__Group__1__Impl : ( 'LibraryFunction' ) ;
    public final void rule__LibraryFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3240:1: ( ( 'LibraryFunction' ) )
            // InternalOptimind.g:3241:1: ( 'LibraryFunction' )
            {
            // InternalOptimind.g:3241:1: ( 'LibraryFunction' )
            // InternalOptimind.g:3242:2: 'LibraryFunction'
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOptimind.g:3251:1: rule__LibraryFunction__Group__2 : rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 ;
    public final void rule__LibraryFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3255:1: ( rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 )
            // InternalOptimind.g:3256:2: rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3
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
    // InternalOptimind.g:3263:1: rule__LibraryFunction__Group__2__Impl : ( ( rule__LibraryFunction__NameAssignment_2 ) ) ;
    public final void rule__LibraryFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3267:1: ( ( ( rule__LibraryFunction__NameAssignment_2 ) ) )
            // InternalOptimind.g:3268:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3268:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            // InternalOptimind.g:3269:2: ( rule__LibraryFunction__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3270:2: ( rule__LibraryFunction__NameAssignment_2 )
            // InternalOptimind.g:3270:3: rule__LibraryFunction__NameAssignment_2
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
    // InternalOptimind.g:3278:1: rule__LibraryFunction__Group__3 : rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 ;
    public final void rule__LibraryFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3282:1: ( rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 )
            // InternalOptimind.g:3283:2: rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:3290:1: rule__LibraryFunction__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3294:1: ( ( '{' ) )
            // InternalOptimind.g:3295:1: ( '{' )
            {
            // InternalOptimind.g:3295:1: ( '{' )
            // InternalOptimind.g:3296:2: '{'
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
    // InternalOptimind.g:3305:1: rule__LibraryFunction__Group__4 : rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 ;
    public final void rule__LibraryFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3309:1: ( rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 )
            // InternalOptimind.g:3310:2: rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5
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
    // InternalOptimind.g:3317:1: rule__LibraryFunction__Group__4__Impl : ( 'function' ) ;
    public final void rule__LibraryFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3321:1: ( ( 'function' ) )
            // InternalOptimind.g:3322:1: ( 'function' )
            {
            // InternalOptimind.g:3322:1: ( 'function' )
            // InternalOptimind.g:3323:2: 'function'
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOptimind.g:3332:1: rule__LibraryFunction__Group__5 : rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 ;
    public final void rule__LibraryFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3336:1: ( rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 )
            // InternalOptimind.g:3337:2: rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:3344:1: rule__LibraryFunction__Group__5__Impl : ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) ;
    public final void rule__LibraryFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3348:1: ( ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) )
            // InternalOptimind.g:3349:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            {
            // InternalOptimind.g:3349:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            // InternalOptimind.g:3350:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5()); 
            // InternalOptimind.g:3351:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            // InternalOptimind.g:3351:3: rule__LibraryFunction__FunctionAssignment_5
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
    // InternalOptimind.g:3359:1: rule__LibraryFunction__Group__6 : rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 ;
    public final void rule__LibraryFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3363:1: ( rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 )
            // InternalOptimind.g:3364:2: rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:3371:1: rule__LibraryFunction__Group__6__Impl : ( ( rule__LibraryFunction__Group_6__0 )? ) ;
    public final void rule__LibraryFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3375:1: ( ( ( rule__LibraryFunction__Group_6__0 )? ) )
            // InternalOptimind.g:3376:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            {
            // InternalOptimind.g:3376:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            // InternalOptimind.g:3377:2: ( rule__LibraryFunction__Group_6__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_6()); 
            // InternalOptimind.g:3378:2: ( rule__LibraryFunction__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimind.g:3378:3: rule__LibraryFunction__Group_6__0
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
    // InternalOptimind.g:3386:1: rule__LibraryFunction__Group__7 : rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 ;
    public final void rule__LibraryFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3390:1: ( rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 )
            // InternalOptimind.g:3391:2: rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:3398:1: rule__LibraryFunction__Group__7__Impl : ( ( rule__LibraryFunction__Group_7__0 )? ) ;
    public final void rule__LibraryFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3402:1: ( ( ( rule__LibraryFunction__Group_7__0 )? ) )
            // InternalOptimind.g:3403:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            {
            // InternalOptimind.g:3403:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            // InternalOptimind.g:3404:2: ( rule__LibraryFunction__Group_7__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_7()); 
            // InternalOptimind.g:3405:2: ( rule__LibraryFunction__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:3405:3: rule__LibraryFunction__Group_7__0
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
    // InternalOptimind.g:3413:1: rule__LibraryFunction__Group__8 : rule__LibraryFunction__Group__8__Impl ;
    public final void rule__LibraryFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3417:1: ( rule__LibraryFunction__Group__8__Impl )
            // InternalOptimind.g:3418:2: rule__LibraryFunction__Group__8__Impl
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
    // InternalOptimind.g:3424:1: rule__LibraryFunction__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3428:1: ( ( '}' ) )
            // InternalOptimind.g:3429:1: ( '}' )
            {
            // InternalOptimind.g:3429:1: ( '}' )
            // InternalOptimind.g:3430:2: '}'
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
    // InternalOptimind.g:3440:1: rule__LibraryFunction__Group_6__0 : rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 ;
    public final void rule__LibraryFunction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3444:1: ( rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 )
            // InternalOptimind.g:3445:2: rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:3452:1: rule__LibraryFunction__Group_6__0__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) ;
    public final void rule__LibraryFunction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3456:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3457:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3457:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            // InternalOptimind.g:3458:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0()); 
            // InternalOptimind.g:3459:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            // InternalOptimind.g:3459:3: rule__LibraryFunction__InputsAssignment_6_0
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
    // InternalOptimind.g:3467:1: rule__LibraryFunction__Group_6__1 : rule__LibraryFunction__Group_6__1__Impl ;
    public final void rule__LibraryFunction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3471:1: ( rule__LibraryFunction__Group_6__1__Impl )
            // InternalOptimind.g:3472:2: rule__LibraryFunction__Group_6__1__Impl
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
    // InternalOptimind.g:3478:1: rule__LibraryFunction__Group_6__1__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) ;
    public final void rule__LibraryFunction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3482:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3483:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3483:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            // InternalOptimind.g:3484:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1()); 
            // InternalOptimind.g:3485:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==38) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalOptimind.g:3485:3: rule__LibraryFunction__InputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__LibraryFunction__InputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalOptimind.g:3494:1: rule__LibraryFunction__Group_7__0 : rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 ;
    public final void rule__LibraryFunction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3498:1: ( rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 )
            // InternalOptimind.g:3499:2: rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1
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
    // InternalOptimind.g:3506:1: rule__LibraryFunction__Group_7__0__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) ;
    public final void rule__LibraryFunction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3510:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) )
            // InternalOptimind.g:3511:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            {
            // InternalOptimind.g:3511:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            // InternalOptimind.g:3512:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0()); 
            // InternalOptimind.g:3513:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            // InternalOptimind.g:3513:3: rule__LibraryFunction__OutputsAssignment_7_0
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
    // InternalOptimind.g:3521:1: rule__LibraryFunction__Group_7__1 : rule__LibraryFunction__Group_7__1__Impl ;
    public final void rule__LibraryFunction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3525:1: ( rule__LibraryFunction__Group_7__1__Impl )
            // InternalOptimind.g:3526:2: rule__LibraryFunction__Group_7__1__Impl
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
    // InternalOptimind.g:3532:1: rule__LibraryFunction__Group_7__1__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) ;
    public final void rule__LibraryFunction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3536:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) )
            // InternalOptimind.g:3537:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            {
            // InternalOptimind.g:3537:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            // InternalOptimind.g:3538:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1()); 
            // InternalOptimind.g:3539:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalOptimind.g:3539:3: rule__LibraryFunction__OutputsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__LibraryFunction__OutputsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalOptimind.g:3548:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3552:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalOptimind.g:3553:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalOptimind.g:3560:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3564:1: ( ( () ) )
            // InternalOptimind.g:3565:1: ( () )
            {
            // InternalOptimind.g:3565:1: ( () )
            // InternalOptimind.g:3566:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalOptimind.g:3567:2: ()
            // InternalOptimind.g:3567:3: 
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
    // InternalOptimind.g:3575:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3579:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalOptimind.g:3580:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalOptimind.g:3587:1: rule__Input__Group__1__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3591:1: ( ( 'Input' ) )
            // InternalOptimind.g:3592:1: ( 'Input' )
            {
            // InternalOptimind.g:3592:1: ( 'Input' )
            // InternalOptimind.g:3593:2: 'Input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOptimind.g:3602:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3606:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalOptimind.g:3607:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalOptimind.g:3614:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3618:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalOptimind.g:3619:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3619:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalOptimind.g:3620:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3621:2: ( rule__Input__NameAssignment_2 )
            // InternalOptimind.g:3621:3: rule__Input__NameAssignment_2
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
    // InternalOptimind.g:3629:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3633:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalOptimind.g:3634:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalOptimind.g:3641:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3645:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalOptimind.g:3646:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalOptimind.g:3646:1: ( ( rule__Input__Group_3__0 )? )
            // InternalOptimind.g:3647:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalOptimind.g:3648:2: ( rule__Input__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==22) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOptimind.g:3648:3: rule__Input__Group_3__0
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
    // InternalOptimind.g:3656:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3660:1: ( rule__Input__Group__4__Impl )
            // InternalOptimind.g:3661:2: rule__Input__Group__4__Impl
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
    // InternalOptimind.g:3667:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3671:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalOptimind.g:3672:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalOptimind.g:3672:1: ( ( rule__Input__Group_4__0 )? )
            // InternalOptimind.g:3673:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalOptimind.g:3674:2: ( rule__Input__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==23) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptimind.g:3674:3: rule__Input__Group_4__0
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
    // InternalOptimind.g:3683:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3687:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalOptimind.g:3688:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
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
    // InternalOptimind.g:3695:1: rule__Input__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3699:1: ( ( 'type' ) )
            // InternalOptimind.g:3700:1: ( 'type' )
            {
            // InternalOptimind.g:3700:1: ( 'type' )
            // InternalOptimind.g:3701:2: 'type'
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
    // InternalOptimind.g:3710:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3714:1: ( rule__Input__Group_3__1__Impl )
            // InternalOptimind.g:3715:2: rule__Input__Group_3__1__Impl
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
    // InternalOptimind.g:3721:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3725:1: ( ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:3726:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:3726:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:3727:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:3728:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:3728:3: rule__Input__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:3737:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3741:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalOptimind.g:3742:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalOptimind.g:3749:1: rule__Input__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3753:1: ( ( 'value' ) )
            // InternalOptimind.g:3754:1: ( 'value' )
            {
            // InternalOptimind.g:3754:1: ( 'value' )
            // InternalOptimind.g:3755:2: 'value'
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
    // InternalOptimind.g:3764:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3768:1: ( rule__Input__Group_4__1__Impl )
            // InternalOptimind.g:3769:2: rule__Input__Group_4__1__Impl
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
    // InternalOptimind.g:3775:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3779:1: ( ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:3780:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:3780:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:3781:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:3782:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:3782:3: rule__Input__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:3791:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3795:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalOptimind.g:3796:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalOptimind.g:3803:1: rule__Output__Group__0__Impl : ( () ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3807:1: ( ( () ) )
            // InternalOptimind.g:3808:1: ( () )
            {
            // InternalOptimind.g:3808:1: ( () )
            // InternalOptimind.g:3809:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_0()); 
            // InternalOptimind.g:3810:2: ()
            // InternalOptimind.g:3810:3: 
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
    // InternalOptimind.g:3818:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3822:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalOptimind.g:3823:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalOptimind.g:3830:1: rule__Output__Group__1__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3834:1: ( ( 'Output' ) )
            // InternalOptimind.g:3835:1: ( 'Output' )
            {
            // InternalOptimind.g:3835:1: ( 'Output' )
            // InternalOptimind.g:3836:2: 'Output'
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
    // InternalOptimind.g:3845:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3849:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalOptimind.g:3850:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalOptimind.g:3857:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3861:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalOptimind.g:3862:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3862:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalOptimind.g:3863:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3864:2: ( rule__Output__NameAssignment_2 )
            // InternalOptimind.g:3864:3: rule__Output__NameAssignment_2
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
    // InternalOptimind.g:3872:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3876:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalOptimind.g:3877:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalOptimind.g:3884:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3888:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalOptimind.g:3889:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalOptimind.g:3889:1: ( ( rule__Output__Group_3__0 )? )
            // InternalOptimind.g:3890:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalOptimind.g:3891:2: ( rule__Output__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOptimind.g:3891:3: rule__Output__Group_3__0
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
    // InternalOptimind.g:3899:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3903:1: ( rule__Output__Group__4__Impl )
            // InternalOptimind.g:3904:2: rule__Output__Group__4__Impl
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
    // InternalOptimind.g:3910:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3914:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalOptimind.g:3915:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalOptimind.g:3915:1: ( ( rule__Output__Group_4__0 )? )
            // InternalOptimind.g:3916:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalOptimind.g:3917:2: ( rule__Output__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOptimind.g:3917:3: rule__Output__Group_4__0
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
    // InternalOptimind.g:3926:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3930:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalOptimind.g:3931:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalOptimind.g:3938:1: rule__Output__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3942:1: ( ( 'type' ) )
            // InternalOptimind.g:3943:1: ( 'type' )
            {
            // InternalOptimind.g:3943:1: ( 'type' )
            // InternalOptimind.g:3944:2: 'type'
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
    // InternalOptimind.g:3953:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3957:1: ( rule__Output__Group_3__1__Impl )
            // InternalOptimind.g:3958:2: rule__Output__Group_3__1__Impl
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
    // InternalOptimind.g:3964:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3968:1: ( ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:3969:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:3969:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:3970:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:3971:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:3971:3: rule__Output__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:3980:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3984:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalOptimind.g:3985:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalOptimind.g:3992:1: rule__Output__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3996:1: ( ( 'value' ) )
            // InternalOptimind.g:3997:1: ( 'value' )
            {
            // InternalOptimind.g:3997:1: ( 'value' )
            // InternalOptimind.g:3998:2: 'value'
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
    // InternalOptimind.g:4007:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4011:1: ( rule__Output__Group_4__1__Impl )
            // InternalOptimind.g:4012:2: rule__Output__Group_4__1__Impl
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
    // InternalOptimind.g:4018:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4022:1: ( ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4023:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4023:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4024:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4025:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4025:3: rule__Output__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:4034:1: rule__Workflow__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Workflow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4038:1: ( ( ruleEString ) )
            // InternalOptimind.g:4039:2: ( ruleEString )
            {
            // InternalOptimind.g:4039:2: ( ruleEString )
            // InternalOptimind.g:4040:3: ruleEString
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
    // InternalOptimind.g:4049:1: rule__Workflow__LanguageAssignment_4_1 : ( ruleProgLanguage ) ;
    public final void rule__Workflow__LanguageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4053:1: ( ( ruleProgLanguage ) )
            // InternalOptimind.g:4054:2: ( ruleProgLanguage )
            {
            // InternalOptimind.g:4054:2: ( ruleProgLanguage )
            // InternalOptimind.g:4055:3: ruleProgLanguage
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
    // InternalOptimind.g:4064:1: rule__Workflow__BaseTaskAssignment_5 : ( ruleBaseTask ) ;
    public final void rule__Workflow__BaseTaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4068:1: ( ( ruleBaseTask ) )
            // InternalOptimind.g:4069:2: ( ruleBaseTask )
            {
            // InternalOptimind.g:4069:2: ( ruleBaseTask )
            // InternalOptimind.g:4070:3: ruleBaseTask
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
    // InternalOptimind.g:4079:1: rule__Workflow__FunctionsAssignment_6_0 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4083:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:4084:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:4084:2: ( ruleLibraryFunction )
            // InternalOptimind.g:4085:3: ruleLibraryFunction
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
    // InternalOptimind.g:4094:1: rule__Workflow__FunctionsAssignment_6_1 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4098:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:4099:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:4099:2: ( ruleLibraryFunction )
            // InternalOptimind.g:4100:3: ruleLibraryFunction
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
    // InternalOptimind.g:4109:1: rule__TaskOutput__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TaskOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4113:1: ( ( ruleEString ) )
            // InternalOptimind.g:4114:2: ( ruleEString )
            {
            // InternalOptimind.g:4114:2: ( ruleEString )
            // InternalOptimind.g:4115:3: ruleEString
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
    // InternalOptimind.g:4124:1: rule__TaskOutput__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__TaskOutput__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4128:1: ( ( ruleType ) )
            // InternalOptimind.g:4129:2: ( ruleType )
            {
            // InternalOptimind.g:4129:2: ( ruleType )
            // InternalOptimind.g:4130:3: ruleType
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
    // InternalOptimind.g:4139:1: rule__TaskOutput__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TaskOutput__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4143:1: ( ( ruleEString ) )
            // InternalOptimind.g:4144:2: ( ruleEString )
            {
            // InternalOptimind.g:4144:2: ( ruleEString )
            // InternalOptimind.g:4145:3: ruleEString
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


    // $ANTLR start "rule__BaseTask__NameAssignment_2"
    // InternalOptimind.g:4154:1: rule__BaseTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4158:1: ( ( ruleEString ) )
            // InternalOptimind.g:4159:2: ( ruleEString )
            {
            // InternalOptimind.g:4159:2: ( ruleEString )
            // InternalOptimind.g:4160:3: ruleEString
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
    // InternalOptimind.g:4169:1: rule__BaseTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__BaseTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4173:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:4174:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:4174:2: ( ruleTaskStatus )
            // InternalOptimind.g:4175:3: ruleTaskStatus
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
    // InternalOptimind.g:4184:1: rule__BaseTask__InputsAssignment_5_2 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4188:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4189:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4189:2: ( ruleTaskInput )
            // InternalOptimind.g:4190:3: ruleTaskInput
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
    // InternalOptimind.g:4199:1: rule__BaseTask__InputsAssignment_5_3_1 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4203:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4204:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4204:2: ( ruleTaskInput )
            // InternalOptimind.g:4205:3: ruleTaskInput
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
    // InternalOptimind.g:4214:1: rule__BaseTask__OutputsAssignment_6_2 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4218:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4219:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4219:2: ( ruleTaskOutput )
            // InternalOptimind.g:4220:3: ruleTaskOutput
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
    // InternalOptimind.g:4229:1: rule__BaseTask__OutputsAssignment_6_3_1 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4233:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4234:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4234:2: ( ruleTaskOutput )
            // InternalOptimind.g:4235:3: ruleTaskOutput
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
    // InternalOptimind.g:4244:1: rule__BaseTask__ChildrenAssignment_7_0 : ( ruleAbstractTask ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4248:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:4249:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:4249:2: ( ruleAbstractTask )
            // InternalOptimind.g:4250:3: ruleAbstractTask
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
    // InternalOptimind.g:4259:1: rule__BaseTask__ChildrenAssignment_7_1 : ( ruleAbstractTask ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4263:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:4264:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:4264:2: ( ruleAbstractTask )
            // InternalOptimind.g:4265:3: ruleAbstractTask
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


    // $ANTLR start "rule__LibraryTask__NameAssignment_2"
    // InternalOptimind.g:4274:1: rule__LibraryTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4278:1: ( ( ruleEString ) )
            // InternalOptimind.g:4279:2: ( ruleEString )
            {
            // InternalOptimind.g:4279:2: ( ruleEString )
            // InternalOptimind.g:4280:3: ruleEString
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
    // InternalOptimind.g:4289:1: rule__LibraryTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__LibraryTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4293:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:4294:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:4294:2: ( ruleTaskStatus )
            // InternalOptimind.g:4295:3: ruleTaskStatus
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
    // InternalOptimind.g:4304:1: rule__LibraryTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4308:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4309:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4309:2: ( ruleTaskInput )
            // InternalOptimind.g:4310:3: ruleTaskInput
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
    // InternalOptimind.g:4319:1: rule__LibraryTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4323:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4324:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4324:2: ( ruleTaskInput )
            // InternalOptimind.g:4325:3: ruleTaskInput
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
    // InternalOptimind.g:4334:1: rule__LibraryTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4338:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4339:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4339:2: ( ruleTaskOutput )
            // InternalOptimind.g:4340:3: ruleTaskOutput
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
    // InternalOptimind.g:4349:1: rule__LibraryTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4353:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4354:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4354:2: ( ruleTaskOutput )
            // InternalOptimind.g:4355:3: ruleTaskOutput
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
    // InternalOptimind.g:4364:1: rule__LibraryTask__LibraryfunctionAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__LibraryTask__LibraryfunctionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4368:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:4369:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:4369:2: ( ( ruleEString ) )
            // InternalOptimind.g:4370:3: ( ruleEString )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0()); 
            // InternalOptimind.g:4371:3: ( ruleEString )
            // InternalOptimind.g:4372:4: ruleEString
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
    // InternalOptimind.g:4383:1: rule__CustomTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4387:1: ( ( ruleEString ) )
            // InternalOptimind.g:4388:2: ( ruleEString )
            {
            // InternalOptimind.g:4388:2: ( ruleEString )
            // InternalOptimind.g:4389:3: ruleEString
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
    // InternalOptimind.g:4398:1: rule__CustomTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__CustomTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4402:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:4403:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:4403:2: ( ruleTaskStatus )
            // InternalOptimind.g:4404:3: ruleTaskStatus
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
    // InternalOptimind.g:4413:1: rule__CustomTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4417:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4418:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4418:2: ( ruleTaskInput )
            // InternalOptimind.g:4419:3: ruleTaskInput
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
    // InternalOptimind.g:4428:1: rule__CustomTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4432:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:4433:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:4433:2: ( ruleTaskInput )
            // InternalOptimind.g:4434:3: ruleTaskInput
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
    // InternalOptimind.g:4443:1: rule__CustomTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4447:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4448:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4448:2: ( ruleTaskOutput )
            // InternalOptimind.g:4449:3: ruleTaskOutput
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
    // InternalOptimind.g:4458:1: rule__CustomTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4462:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:4463:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:4463:2: ( ruleTaskOutput )
            // InternalOptimind.g:4464:3: ruleTaskOutput
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
    // InternalOptimind.g:4473:1: rule__CustomTask__RunnerAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CustomTask__RunnerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4477:1: ( ( ruleEString ) )
            // InternalOptimind.g:4478:2: ( ruleEString )
            {
            // InternalOptimind.g:4478:2: ( ruleEString )
            // InternalOptimind.g:4479:3: ruleEString
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
    // InternalOptimind.g:4488:1: rule__Setter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Setter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4492:1: ( ( ruleEString ) )
            // InternalOptimind.g:4493:2: ( ruleEString )
            {
            // InternalOptimind.g:4493:2: ( ruleEString )
            // InternalOptimind.g:4494:3: ruleEString
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
    // InternalOptimind.g:4503:1: rule__Setter__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Setter__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4507:1: ( ( ruleType ) )
            // InternalOptimind.g:4508:2: ( ruleType )
            {
            // InternalOptimind.g:4508:2: ( ruleType )
            // InternalOptimind.g:4509:3: ruleType
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
    // InternalOptimind.g:4518:1: rule__Setter__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Setter__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4522:1: ( ( ruleEString ) )
            // InternalOptimind.g:4523:2: ( ruleEString )
            {
            // InternalOptimind.g:4523:2: ( ruleEString )
            // InternalOptimind.g:4524:3: ruleEString
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
    // InternalOptimind.g:4533:1: rule__Connection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Connection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4537:1: ( ( ruleEString ) )
            // InternalOptimind.g:4538:2: ( ruleEString )
            {
            // InternalOptimind.g:4538:2: ( ruleEString )
            // InternalOptimind.g:4539:3: ruleEString
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
    // InternalOptimind.g:4548:1: rule__Connection__TaskoutputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Connection__TaskoutputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4552:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:4553:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:4553:2: ( ( ruleEString ) )
            // InternalOptimind.g:4554:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0()); 
            // InternalOptimind.g:4555:3: ( ruleEString )
            // InternalOptimind.g:4556:4: ruleEString
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
    // InternalOptimind.g:4567:1: rule__LibraryFunction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4571:1: ( ( ruleEString ) )
            // InternalOptimind.g:4572:2: ( ruleEString )
            {
            // InternalOptimind.g:4572:2: ( ruleEString )
            // InternalOptimind.g:4573:3: ruleEString
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
    // InternalOptimind.g:4582:1: rule__LibraryFunction__FunctionAssignment_5 : ( ruleEString ) ;
    public final void rule__LibraryFunction__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4586:1: ( ( ruleEString ) )
            // InternalOptimind.g:4587:2: ( ruleEString )
            {
            // InternalOptimind.g:4587:2: ( ruleEString )
            // InternalOptimind.g:4588:3: ruleEString
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
    // InternalOptimind.g:4597:1: rule__LibraryFunction__InputsAssignment_6_0 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4601:1: ( ( ruleInput ) )
            // InternalOptimind.g:4602:2: ( ruleInput )
            {
            // InternalOptimind.g:4602:2: ( ruleInput )
            // InternalOptimind.g:4603:3: ruleInput
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
    // InternalOptimind.g:4612:1: rule__LibraryFunction__InputsAssignment_6_1 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4616:1: ( ( ruleInput ) )
            // InternalOptimind.g:4617:2: ( ruleInput )
            {
            // InternalOptimind.g:4617:2: ( ruleInput )
            // InternalOptimind.g:4618:3: ruleInput
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
    // InternalOptimind.g:4627:1: rule__LibraryFunction__OutputsAssignment_7_0 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4631:1: ( ( ruleOutput ) )
            // InternalOptimind.g:4632:2: ( ruleOutput )
            {
            // InternalOptimind.g:4632:2: ( ruleOutput )
            // InternalOptimind.g:4633:3: ruleOutput
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
    // InternalOptimind.g:4642:1: rule__LibraryFunction__OutputsAssignment_7_1 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4646:1: ( ( ruleOutput ) )
            // InternalOptimind.g:4647:2: ( ruleOutput )
            {
            // InternalOptimind.g:4647:2: ( ruleOutput )
            // InternalOptimind.g:4648:3: ruleOutput
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
    // InternalOptimind.g:4657:1: rule__Input__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4661:1: ( ( ruleEString ) )
            // InternalOptimind.g:4662:2: ( ruleEString )
            {
            // InternalOptimind.g:4662:2: ( ruleEString )
            // InternalOptimind.g:4663:3: ruleEString
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
    // InternalOptimind.g:4672:1: rule__Input__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Input__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4676:1: ( ( ruleType ) )
            // InternalOptimind.g:4677:2: ( ruleType )
            {
            // InternalOptimind.g:4677:2: ( ruleType )
            // InternalOptimind.g:4678:3: ruleType
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
    // InternalOptimind.g:4687:1: rule__Input__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Input__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4691:1: ( ( ruleEString ) )
            // InternalOptimind.g:4692:2: ( ruleEString )
            {
            // InternalOptimind.g:4692:2: ( ruleEString )
            // InternalOptimind.g:4693:3: ruleEString
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
    // InternalOptimind.g:4702:1: rule__Output__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4706:1: ( ( ruleEString ) )
            // InternalOptimind.g:4707:2: ( ruleEString )
            {
            // InternalOptimind.g:4707:2: ( ruleEString )
            // InternalOptimind.g:4708:3: ruleEString
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
    // InternalOptimind.g:4717:1: rule__Output__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Output__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4721:1: ( ( ruleType ) )
            // InternalOptimind.g:4722:2: ( ruleType )
            {
            // InternalOptimind.g:4722:2: ( ruleType )
            // InternalOptimind.g:4723:3: ruleType
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
    // InternalOptimind.g:4732:1: rule__Output__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Output__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4736:1: ( ( ruleEString ) )
            // InternalOptimind.g:4737:2: ( ruleEString )
            {
            // InternalOptimind.g:4737:2: ( ruleEString )
            // InternalOptimind.g:4738:3: ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001001180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000B7080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A1000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000A1000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000642280000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000702280000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000280000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000002L});

}