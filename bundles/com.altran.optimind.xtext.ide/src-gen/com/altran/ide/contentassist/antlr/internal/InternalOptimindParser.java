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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'", "'Workflow'", "'{'", "'}'", "'Language'", "'Output'", "'type'", "'value'", "'For'", "'from'", "'to'", "'increment'", "'do'", "'While'", "'If'", "'then'", "'else'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'LibraryFunction'", "'function'", "'Input'"
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
            case 33:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            case 40:
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

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
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
            case 30:
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


    // $ANTLR start "rule__BaseTask__ChildrenAlternatives_7_0_0"
    // InternalOptimind.g:676:1: rule__BaseTask__ChildrenAlternatives_7_0_0 : ( ( ruleAbstractTask ) | ( ruleAbstractStatement ) );
    public final void rule__BaseTask__ChildrenAlternatives_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:680:1: ( ( ruleAbstractTask ) | ( ruleAbstractStatement ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33||LA6_0==38||LA6_0==40) ) {
                alt6=1;
            }
            else if ( (LA6_0==24||(LA6_0>=29 && LA6_0<=30)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptimind.g:681:2: ( ruleAbstractTask )
                    {
                    // InternalOptimind.g:681:2: ( ruleAbstractTask )
                    // InternalOptimind.g:682:3: ruleAbstractTask
                    {
                     before(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractTask();

                    state._fsp--;

                     after(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:687:2: ( ruleAbstractStatement )
                    {
                    // InternalOptimind.g:687:2: ( ruleAbstractStatement )
                    // InternalOptimind.g:688:3: ruleAbstractStatement
                    {
                     before(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractStatement();

                    state._fsp--;

                     after(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_0_0_1()); 

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
    // $ANTLR end "rule__BaseTask__ChildrenAlternatives_7_0_0"


    // $ANTLR start "rule__BaseTask__ChildrenAlternatives_7_1_0"
    // InternalOptimind.g:697:1: rule__BaseTask__ChildrenAlternatives_7_1_0 : ( ( ruleAbstractTask ) | ( ruleAbstractStatement ) );
    public final void rule__BaseTask__ChildrenAlternatives_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:701:1: ( ( ruleAbstractTask ) | ( ruleAbstractStatement ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33||LA7_0==38||LA7_0==40) ) {
                alt7=1;
            }
            else if ( (LA7_0==24||(LA7_0>=29 && LA7_0<=30)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptimind.g:702:2: ( ruleAbstractTask )
                    {
                    // InternalOptimind.g:702:2: ( ruleAbstractTask )
                    // InternalOptimind.g:703:3: ruleAbstractTask
                    {
                     before(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractTask();

                    state._fsp--;

                     after(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:708:2: ( ruleAbstractStatement )
                    {
                    // InternalOptimind.g:708:2: ( ruleAbstractStatement )
                    // InternalOptimind.g:709:3: ruleAbstractStatement
                    {
                     before(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractStatement();

                    state._fsp--;

                     after(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_1_0_1()); 

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
    // $ANTLR end "rule__BaseTask__ChildrenAlternatives_7_1_0"


    // $ANTLR start "rule__ProgLanguage__Alternatives"
    // InternalOptimind.g:718:1: rule__ProgLanguage__Alternatives : ( ( ( 'Python' ) ) | ( ( 'Java' ) ) );
    public final void rule__ProgLanguage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:722:1: ( ( ( 'Python' ) ) | ( ( 'Java' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptimind.g:723:2: ( ( 'Python' ) )
                    {
                    // InternalOptimind.g:723:2: ( ( 'Python' ) )
                    // InternalOptimind.g:724:3: ( 'Python' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:725:3: ( 'Python' )
                    // InternalOptimind.g:725:4: 'Python'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:729:2: ( ( 'Java' ) )
                    {
                    // InternalOptimind.g:729:2: ( ( 'Java' ) )
                    // InternalOptimind.g:730:3: ( 'Java' )
                    {
                     before(grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:731:3: ( 'Java' )
                    // InternalOptimind.g:731:4: 'Java'
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
    // InternalOptimind.g:739:1: rule__TaskStatus__Alternatives : ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) );
    public final void rule__TaskStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:743:1: ( ( ( 'FINISHED' ) ) | ( ( 'PREPARED' ) ) | ( ( 'NOT_PREPARED' ) ) | ( ( 'PROCESSING' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:744:2: ( ( 'FINISHED' ) )
                    {
                    // InternalOptimind.g:744:2: ( ( 'FINISHED' ) )
                    // InternalOptimind.g:745:3: ( 'FINISHED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 
                    // InternalOptimind.g:746:3: ( 'FINISHED' )
                    // InternalOptimind.g:746:4: 'FINISHED'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:750:2: ( ( 'PREPARED' ) )
                    {
                    // InternalOptimind.g:750:2: ( ( 'PREPARED' ) )
                    // InternalOptimind.g:751:3: ( 'PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 
                    // InternalOptimind.g:752:3: ( 'PREPARED' )
                    // InternalOptimind.g:752:4: 'PREPARED'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:756:2: ( ( 'NOT_PREPARED' ) )
                    {
                    // InternalOptimind.g:756:2: ( ( 'NOT_PREPARED' ) )
                    // InternalOptimind.g:757:3: ( 'NOT_PREPARED' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 
                    // InternalOptimind.g:758:3: ( 'NOT_PREPARED' )
                    // InternalOptimind.g:758:4: 'NOT_PREPARED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:762:2: ( ( 'PROCESSING' ) )
                    {
                    // InternalOptimind.g:762:2: ( ( 'PROCESSING' ) )
                    // InternalOptimind.g:763:3: ( 'PROCESSING' )
                    {
                     before(grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3()); 
                    // InternalOptimind.g:764:3: ( 'PROCESSING' )
                    // InternalOptimind.g:764:4: 'PROCESSING'
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
    // InternalOptimind.g:772:1: rule__Workflow__Group__0 : rule__Workflow__Group__0__Impl rule__Workflow__Group__1 ;
    public final void rule__Workflow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:776:1: ( rule__Workflow__Group__0__Impl rule__Workflow__Group__1 )
            // InternalOptimind.g:777:2: rule__Workflow__Group__0__Impl rule__Workflow__Group__1
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
    // InternalOptimind.g:784:1: rule__Workflow__Group__0__Impl : ( () ) ;
    public final void rule__Workflow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:788:1: ( ( () ) )
            // InternalOptimind.g:789:1: ( () )
            {
            // InternalOptimind.g:789:1: ( () )
            // InternalOptimind.g:790:2: ()
            {
             before(grammarAccess.getWorkflowAccess().getWorkflowAction_0()); 
            // InternalOptimind.g:791:2: ()
            // InternalOptimind.g:791:3: 
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
    // InternalOptimind.g:799:1: rule__Workflow__Group__1 : rule__Workflow__Group__1__Impl rule__Workflow__Group__2 ;
    public final void rule__Workflow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:803:1: ( rule__Workflow__Group__1__Impl rule__Workflow__Group__2 )
            // InternalOptimind.g:804:2: rule__Workflow__Group__1__Impl rule__Workflow__Group__2
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
    // InternalOptimind.g:811:1: rule__Workflow__Group__1__Impl : ( 'Workflow' ) ;
    public final void rule__Workflow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:815:1: ( ( 'Workflow' ) )
            // InternalOptimind.g:816:1: ( 'Workflow' )
            {
            // InternalOptimind.g:816:1: ( 'Workflow' )
            // InternalOptimind.g:817:2: 'Workflow'
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
    // InternalOptimind.g:826:1: rule__Workflow__Group__2 : rule__Workflow__Group__2__Impl rule__Workflow__Group__3 ;
    public final void rule__Workflow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:830:1: ( rule__Workflow__Group__2__Impl rule__Workflow__Group__3 )
            // InternalOptimind.g:831:2: rule__Workflow__Group__2__Impl rule__Workflow__Group__3
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
    // InternalOptimind.g:838:1: rule__Workflow__Group__2__Impl : ( ( rule__Workflow__NameAssignment_2 ) ) ;
    public final void rule__Workflow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:842:1: ( ( ( rule__Workflow__NameAssignment_2 ) ) )
            // InternalOptimind.g:843:1: ( ( rule__Workflow__NameAssignment_2 ) )
            {
            // InternalOptimind.g:843:1: ( ( rule__Workflow__NameAssignment_2 ) )
            // InternalOptimind.g:844:2: ( rule__Workflow__NameAssignment_2 )
            {
             before(grammarAccess.getWorkflowAccess().getNameAssignment_2()); 
            // InternalOptimind.g:845:2: ( rule__Workflow__NameAssignment_2 )
            // InternalOptimind.g:845:3: rule__Workflow__NameAssignment_2
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
    // InternalOptimind.g:853:1: rule__Workflow__Group__3 : rule__Workflow__Group__3__Impl rule__Workflow__Group__4 ;
    public final void rule__Workflow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:857:1: ( rule__Workflow__Group__3__Impl rule__Workflow__Group__4 )
            // InternalOptimind.g:858:2: rule__Workflow__Group__3__Impl rule__Workflow__Group__4
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
    // InternalOptimind.g:865:1: rule__Workflow__Group__3__Impl : ( '{' ) ;
    public final void rule__Workflow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:869:1: ( ( '{' ) )
            // InternalOptimind.g:870:1: ( '{' )
            {
            // InternalOptimind.g:870:1: ( '{' )
            // InternalOptimind.g:871:2: '{'
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
    // InternalOptimind.g:880:1: rule__Workflow__Group__4 : rule__Workflow__Group__4__Impl rule__Workflow__Group__5 ;
    public final void rule__Workflow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:884:1: ( rule__Workflow__Group__4__Impl rule__Workflow__Group__5 )
            // InternalOptimind.g:885:2: rule__Workflow__Group__4__Impl rule__Workflow__Group__5
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
    // InternalOptimind.g:892:1: rule__Workflow__Group__4__Impl : ( ( rule__Workflow__Group_4__0 )? ) ;
    public final void rule__Workflow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:896:1: ( ( ( rule__Workflow__Group_4__0 )? ) )
            // InternalOptimind.g:897:1: ( ( rule__Workflow__Group_4__0 )? )
            {
            // InternalOptimind.g:897:1: ( ( rule__Workflow__Group_4__0 )? )
            // InternalOptimind.g:898:2: ( rule__Workflow__Group_4__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_4()); 
            // InternalOptimind.g:899:2: ( rule__Workflow__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimind.g:899:3: rule__Workflow__Group_4__0
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
    // InternalOptimind.g:907:1: rule__Workflow__Group__5 : rule__Workflow__Group__5__Impl rule__Workflow__Group__6 ;
    public final void rule__Workflow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:911:1: ( rule__Workflow__Group__5__Impl rule__Workflow__Group__6 )
            // InternalOptimind.g:912:2: rule__Workflow__Group__5__Impl rule__Workflow__Group__6
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
    // InternalOptimind.g:919:1: rule__Workflow__Group__5__Impl : ( ( rule__Workflow__BaseTaskAssignment_5 )? ) ;
    public final void rule__Workflow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:923:1: ( ( ( rule__Workflow__BaseTaskAssignment_5 )? ) )
            // InternalOptimind.g:924:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            {
            // InternalOptimind.g:924:1: ( ( rule__Workflow__BaseTaskAssignment_5 )? )
            // InternalOptimind.g:925:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            {
             before(grammarAccess.getWorkflowAccess().getBaseTaskAssignment_5()); 
            // InternalOptimind.g:926:2: ( rule__Workflow__BaseTaskAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimind.g:926:3: rule__Workflow__BaseTaskAssignment_5
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
    // InternalOptimind.g:934:1: rule__Workflow__Group__6 : rule__Workflow__Group__6__Impl rule__Workflow__Group__7 ;
    public final void rule__Workflow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:938:1: ( rule__Workflow__Group__6__Impl rule__Workflow__Group__7 )
            // InternalOptimind.g:939:2: rule__Workflow__Group__6__Impl rule__Workflow__Group__7
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
    // InternalOptimind.g:946:1: rule__Workflow__Group__6__Impl : ( ( rule__Workflow__Group_6__0 )? ) ;
    public final void rule__Workflow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:950:1: ( ( ( rule__Workflow__Group_6__0 )? ) )
            // InternalOptimind.g:951:1: ( ( rule__Workflow__Group_6__0 )? )
            {
            // InternalOptimind.g:951:1: ( ( rule__Workflow__Group_6__0 )? )
            // InternalOptimind.g:952:2: ( rule__Workflow__Group_6__0 )?
            {
             before(grammarAccess.getWorkflowAccess().getGroup_6()); 
            // InternalOptimind.g:953:2: ( rule__Workflow__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimind.g:953:3: rule__Workflow__Group_6__0
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
    // InternalOptimind.g:961:1: rule__Workflow__Group__7 : rule__Workflow__Group__7__Impl ;
    public final void rule__Workflow__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:965:1: ( rule__Workflow__Group__7__Impl )
            // InternalOptimind.g:966:2: rule__Workflow__Group__7__Impl
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
    // InternalOptimind.g:972:1: rule__Workflow__Group__7__Impl : ( '}' ) ;
    public final void rule__Workflow__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:976:1: ( ( '}' ) )
            // InternalOptimind.g:977:1: ( '}' )
            {
            // InternalOptimind.g:977:1: ( '}' )
            // InternalOptimind.g:978:2: '}'
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
    // InternalOptimind.g:988:1: rule__Workflow__Group_4__0 : rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 ;
    public final void rule__Workflow__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:992:1: ( rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1 )
            // InternalOptimind.g:993:2: rule__Workflow__Group_4__0__Impl rule__Workflow__Group_4__1
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
    // InternalOptimind.g:1000:1: rule__Workflow__Group_4__0__Impl : ( 'Language' ) ;
    public final void rule__Workflow__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1004:1: ( ( 'Language' ) )
            // InternalOptimind.g:1005:1: ( 'Language' )
            {
            // InternalOptimind.g:1005:1: ( 'Language' )
            // InternalOptimind.g:1006:2: 'Language'
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
    // InternalOptimind.g:1015:1: rule__Workflow__Group_4__1 : rule__Workflow__Group_4__1__Impl ;
    public final void rule__Workflow__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1019:1: ( rule__Workflow__Group_4__1__Impl )
            // InternalOptimind.g:1020:2: rule__Workflow__Group_4__1__Impl
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
    // InternalOptimind.g:1026:1: rule__Workflow__Group_4__1__Impl : ( ( rule__Workflow__LanguageAssignment_4_1 ) ) ;
    public final void rule__Workflow__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1030:1: ( ( ( rule__Workflow__LanguageAssignment_4_1 ) ) )
            // InternalOptimind.g:1031:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            {
            // InternalOptimind.g:1031:1: ( ( rule__Workflow__LanguageAssignment_4_1 ) )
            // InternalOptimind.g:1032:2: ( rule__Workflow__LanguageAssignment_4_1 )
            {
             before(grammarAccess.getWorkflowAccess().getLanguageAssignment_4_1()); 
            // InternalOptimind.g:1033:2: ( rule__Workflow__LanguageAssignment_4_1 )
            // InternalOptimind.g:1033:3: rule__Workflow__LanguageAssignment_4_1
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
    // InternalOptimind.g:1042:1: rule__Workflow__Group_6__0 : rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 ;
    public final void rule__Workflow__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1046:1: ( rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1 )
            // InternalOptimind.g:1047:2: rule__Workflow__Group_6__0__Impl rule__Workflow__Group_6__1
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
    // InternalOptimind.g:1054:1: rule__Workflow__Group_6__0__Impl : ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) ;
    public final void rule__Workflow__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1058:1: ( ( ( rule__Workflow__FunctionsAssignment_6_0 ) ) )
            // InternalOptimind.g:1059:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            {
            // InternalOptimind.g:1059:1: ( ( rule__Workflow__FunctionsAssignment_6_0 ) )
            // InternalOptimind.g:1060:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_0()); 
            // InternalOptimind.g:1061:2: ( rule__Workflow__FunctionsAssignment_6_0 )
            // InternalOptimind.g:1061:3: rule__Workflow__FunctionsAssignment_6_0
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
    // InternalOptimind.g:1069:1: rule__Workflow__Group_6__1 : rule__Workflow__Group_6__1__Impl ;
    public final void rule__Workflow__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1073:1: ( rule__Workflow__Group_6__1__Impl )
            // InternalOptimind.g:1074:2: rule__Workflow__Group_6__1__Impl
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
    // InternalOptimind.g:1080:1: rule__Workflow__Group_6__1__Impl : ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) ;
    public final void rule__Workflow__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1084:1: ( ( ( rule__Workflow__FunctionsAssignment_6_1 )* ) )
            // InternalOptimind.g:1085:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            {
            // InternalOptimind.g:1085:1: ( ( rule__Workflow__FunctionsAssignment_6_1 )* )
            // InternalOptimind.g:1086:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            {
             before(grammarAccess.getWorkflowAccess().getFunctionsAssignment_6_1()); 
            // InternalOptimind.g:1087:2: ( rule__Workflow__FunctionsAssignment_6_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOptimind.g:1087:3: rule__Workflow__FunctionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workflow__FunctionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalOptimind.g:1096:1: rule__TaskOutput__Group__0 : rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 ;
    public final void rule__TaskOutput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1100:1: ( rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1 )
            // InternalOptimind.g:1101:2: rule__TaskOutput__Group__0__Impl rule__TaskOutput__Group__1
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
    // InternalOptimind.g:1108:1: rule__TaskOutput__Group__0__Impl : ( () ) ;
    public final void rule__TaskOutput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1112:1: ( ( () ) )
            // InternalOptimind.g:1113:1: ( () )
            {
            // InternalOptimind.g:1113:1: ( () )
            // InternalOptimind.g:1114:2: ()
            {
             before(grammarAccess.getTaskOutputAccess().getTaskOutputAction_0()); 
            // InternalOptimind.g:1115:2: ()
            // InternalOptimind.g:1115:3: 
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
    // InternalOptimind.g:1123:1: rule__TaskOutput__Group__1 : rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 ;
    public final void rule__TaskOutput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1127:1: ( rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2 )
            // InternalOptimind.g:1128:2: rule__TaskOutput__Group__1__Impl rule__TaskOutput__Group__2
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
    // InternalOptimind.g:1135:1: rule__TaskOutput__Group__1__Impl : ( 'Output' ) ;
    public final void rule__TaskOutput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1139:1: ( ( 'Output' ) )
            // InternalOptimind.g:1140:1: ( 'Output' )
            {
            // InternalOptimind.g:1140:1: ( 'Output' )
            // InternalOptimind.g:1141:2: 'Output'
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
    // InternalOptimind.g:1150:1: rule__TaskOutput__Group__2 : rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 ;
    public final void rule__TaskOutput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1154:1: ( rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3 )
            // InternalOptimind.g:1155:2: rule__TaskOutput__Group__2__Impl rule__TaskOutput__Group__3
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
    // InternalOptimind.g:1162:1: rule__TaskOutput__Group__2__Impl : ( ( rule__TaskOutput__NameAssignment_2 ) ) ;
    public final void rule__TaskOutput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1166:1: ( ( ( rule__TaskOutput__NameAssignment_2 ) ) )
            // InternalOptimind.g:1167:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1167:1: ( ( rule__TaskOutput__NameAssignment_2 ) )
            // InternalOptimind.g:1168:2: ( rule__TaskOutput__NameAssignment_2 )
            {
             before(grammarAccess.getTaskOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1169:2: ( rule__TaskOutput__NameAssignment_2 )
            // InternalOptimind.g:1169:3: rule__TaskOutput__NameAssignment_2
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
    // InternalOptimind.g:1177:1: rule__TaskOutput__Group__3 : rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 ;
    public final void rule__TaskOutput__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1181:1: ( rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4 )
            // InternalOptimind.g:1182:2: rule__TaskOutput__Group__3__Impl rule__TaskOutput__Group__4
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
    // InternalOptimind.g:1189:1: rule__TaskOutput__Group__3__Impl : ( ( rule__TaskOutput__Group_3__0 )? ) ;
    public final void rule__TaskOutput__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1193:1: ( ( ( rule__TaskOutput__Group_3__0 )? ) )
            // InternalOptimind.g:1194:1: ( ( rule__TaskOutput__Group_3__0 )? )
            {
            // InternalOptimind.g:1194:1: ( ( rule__TaskOutput__Group_3__0 )? )
            // InternalOptimind.g:1195:2: ( rule__TaskOutput__Group_3__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_3()); 
            // InternalOptimind.g:1196:2: ( rule__TaskOutput__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOptimind.g:1196:3: rule__TaskOutput__Group_3__0
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
    // InternalOptimind.g:1204:1: rule__TaskOutput__Group__4 : rule__TaskOutput__Group__4__Impl ;
    public final void rule__TaskOutput__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1208:1: ( rule__TaskOutput__Group__4__Impl )
            // InternalOptimind.g:1209:2: rule__TaskOutput__Group__4__Impl
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
    // InternalOptimind.g:1215:1: rule__TaskOutput__Group__4__Impl : ( ( rule__TaskOutput__Group_4__0 )? ) ;
    public final void rule__TaskOutput__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1219:1: ( ( ( rule__TaskOutput__Group_4__0 )? ) )
            // InternalOptimind.g:1220:1: ( ( rule__TaskOutput__Group_4__0 )? )
            {
            // InternalOptimind.g:1220:1: ( ( rule__TaskOutput__Group_4__0 )? )
            // InternalOptimind.g:1221:2: ( rule__TaskOutput__Group_4__0 )?
            {
             before(grammarAccess.getTaskOutputAccess().getGroup_4()); 
            // InternalOptimind.g:1222:2: ( rule__TaskOutput__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:1222:3: rule__TaskOutput__Group_4__0
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
    // InternalOptimind.g:1231:1: rule__TaskOutput__Group_3__0 : rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 ;
    public final void rule__TaskOutput__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1235:1: ( rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1 )
            // InternalOptimind.g:1236:2: rule__TaskOutput__Group_3__0__Impl rule__TaskOutput__Group_3__1
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
    // InternalOptimind.g:1243:1: rule__TaskOutput__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TaskOutput__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1247:1: ( ( 'type' ) )
            // InternalOptimind.g:1248:1: ( 'type' )
            {
            // InternalOptimind.g:1248:1: ( 'type' )
            // InternalOptimind.g:1249:2: 'type'
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
    // InternalOptimind.g:1258:1: rule__TaskOutput__Group_3__1 : rule__TaskOutput__Group_3__1__Impl ;
    public final void rule__TaskOutput__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1262:1: ( rule__TaskOutput__Group_3__1__Impl )
            // InternalOptimind.g:1263:2: rule__TaskOutput__Group_3__1__Impl
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
    // InternalOptimind.g:1269:1: rule__TaskOutput__Group_3__1__Impl : ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__TaskOutput__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1273:1: ( ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:1274:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:1274:1: ( ( rule__TaskOutput__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:1275:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:1276:2: ( rule__TaskOutput__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:1276:3: rule__TaskOutput__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:1285:1: rule__TaskOutput__Group_4__0 : rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 ;
    public final void rule__TaskOutput__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1289:1: ( rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1 )
            // InternalOptimind.g:1290:2: rule__TaskOutput__Group_4__0__Impl rule__TaskOutput__Group_4__1
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
    // InternalOptimind.g:1297:1: rule__TaskOutput__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__TaskOutput__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1301:1: ( ( 'value' ) )
            // InternalOptimind.g:1302:1: ( 'value' )
            {
            // InternalOptimind.g:1302:1: ( 'value' )
            // InternalOptimind.g:1303:2: 'value'
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
    // InternalOptimind.g:1312:1: rule__TaskOutput__Group_4__1 : rule__TaskOutput__Group_4__1__Impl ;
    public final void rule__TaskOutput__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1316:1: ( rule__TaskOutput__Group_4__1__Impl )
            // InternalOptimind.g:1317:2: rule__TaskOutput__Group_4__1__Impl
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
    // InternalOptimind.g:1323:1: rule__TaskOutput__Group_4__1__Impl : ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__TaskOutput__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1327:1: ( ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:1328:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:1328:1: ( ( rule__TaskOutput__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:1329:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getTaskOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:1330:2: ( rule__TaskOutput__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:1330:3: rule__TaskOutput__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:1339:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1343:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // InternalOptimind.g:1344:2: rule__For__Group__0__Impl rule__For__Group__1
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
    // InternalOptimind.g:1351:1: rule__For__Group__0__Impl : ( () ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1355:1: ( ( () ) )
            // InternalOptimind.g:1356:1: ( () )
            {
            // InternalOptimind.g:1356:1: ( () )
            // InternalOptimind.g:1357:2: ()
            {
             before(grammarAccess.getForAccess().getForStatementAction_0()); 
            // InternalOptimind.g:1358:2: ()
            // InternalOptimind.g:1358:3: 
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
    // InternalOptimind.g:1366:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1370:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // InternalOptimind.g:1371:2: rule__For__Group__1__Impl rule__For__Group__2
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
    // InternalOptimind.g:1378:1: rule__For__Group__1__Impl : ( 'For' ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1382:1: ( ( 'For' ) )
            // InternalOptimind.g:1383:1: ( 'For' )
            {
            // InternalOptimind.g:1383:1: ( 'For' )
            // InternalOptimind.g:1384:2: 'For'
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
    // InternalOptimind.g:1393:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1397:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // InternalOptimind.g:1398:2: rule__For__Group__2__Impl rule__For__Group__3
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
    // InternalOptimind.g:1405:1: rule__For__Group__2__Impl : ( ( rule__For__NameAssignment_2 ) ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1409:1: ( ( ( rule__For__NameAssignment_2 ) ) )
            // InternalOptimind.g:1410:1: ( ( rule__For__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1410:1: ( ( rule__For__NameAssignment_2 ) )
            // InternalOptimind.g:1411:2: ( rule__For__NameAssignment_2 )
            {
             before(grammarAccess.getForAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1412:2: ( rule__For__NameAssignment_2 )
            // InternalOptimind.g:1412:3: rule__For__NameAssignment_2
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
    // InternalOptimind.g:1420:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1424:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // InternalOptimind.g:1425:2: rule__For__Group__3__Impl rule__For__Group__4
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
    // InternalOptimind.g:1432:1: rule__For__Group__3__Impl : ( '{' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1436:1: ( ( '{' ) )
            // InternalOptimind.g:1437:1: ( '{' )
            {
            // InternalOptimind.g:1437:1: ( '{' )
            // InternalOptimind.g:1438:2: '{'
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
    // InternalOptimind.g:1447:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1451:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // InternalOptimind.g:1452:2: rule__For__Group__4__Impl rule__For__Group__5
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
    // InternalOptimind.g:1459:1: rule__For__Group__4__Impl : ( 'from' ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1463:1: ( ( 'from' ) )
            // InternalOptimind.g:1464:1: ( 'from' )
            {
            // InternalOptimind.g:1464:1: ( 'from' )
            // InternalOptimind.g:1465:2: 'from'
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
    // InternalOptimind.g:1474:1: rule__For__Group__5 : rule__For__Group__5__Impl rule__For__Group__6 ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1478:1: ( rule__For__Group__5__Impl rule__For__Group__6 )
            // InternalOptimind.g:1479:2: rule__For__Group__5__Impl rule__For__Group__6
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
    // InternalOptimind.g:1486:1: rule__For__Group__5__Impl : ( ( rule__For__FromAssignment_5 ) ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1490:1: ( ( ( rule__For__FromAssignment_5 ) ) )
            // InternalOptimind.g:1491:1: ( ( rule__For__FromAssignment_5 ) )
            {
            // InternalOptimind.g:1491:1: ( ( rule__For__FromAssignment_5 ) )
            // InternalOptimind.g:1492:2: ( rule__For__FromAssignment_5 )
            {
             before(grammarAccess.getForAccess().getFromAssignment_5()); 
            // InternalOptimind.g:1493:2: ( rule__For__FromAssignment_5 )
            // InternalOptimind.g:1493:3: rule__For__FromAssignment_5
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
    // InternalOptimind.g:1501:1: rule__For__Group__6 : rule__For__Group__6__Impl rule__For__Group__7 ;
    public final void rule__For__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1505:1: ( rule__For__Group__6__Impl rule__For__Group__7 )
            // InternalOptimind.g:1506:2: rule__For__Group__6__Impl rule__For__Group__7
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
    // InternalOptimind.g:1513:1: rule__For__Group__6__Impl : ( 'to' ) ;
    public final void rule__For__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1517:1: ( ( 'to' ) )
            // InternalOptimind.g:1518:1: ( 'to' )
            {
            // InternalOptimind.g:1518:1: ( 'to' )
            // InternalOptimind.g:1519:2: 'to'
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
    // InternalOptimind.g:1528:1: rule__For__Group__7 : rule__For__Group__7__Impl rule__For__Group__8 ;
    public final void rule__For__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1532:1: ( rule__For__Group__7__Impl rule__For__Group__8 )
            // InternalOptimind.g:1533:2: rule__For__Group__7__Impl rule__For__Group__8
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
    // InternalOptimind.g:1540:1: rule__For__Group__7__Impl : ( ( rule__For__ToAssignment_7 ) ) ;
    public final void rule__For__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1544:1: ( ( ( rule__For__ToAssignment_7 ) ) )
            // InternalOptimind.g:1545:1: ( ( rule__For__ToAssignment_7 ) )
            {
            // InternalOptimind.g:1545:1: ( ( rule__For__ToAssignment_7 ) )
            // InternalOptimind.g:1546:2: ( rule__For__ToAssignment_7 )
            {
             before(grammarAccess.getForAccess().getToAssignment_7()); 
            // InternalOptimind.g:1547:2: ( rule__For__ToAssignment_7 )
            // InternalOptimind.g:1547:3: rule__For__ToAssignment_7
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
    // InternalOptimind.g:1555:1: rule__For__Group__8 : rule__For__Group__8__Impl rule__For__Group__9 ;
    public final void rule__For__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1559:1: ( rule__For__Group__8__Impl rule__For__Group__9 )
            // InternalOptimind.g:1560:2: rule__For__Group__8__Impl rule__For__Group__9
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
    // InternalOptimind.g:1567:1: rule__For__Group__8__Impl : ( 'increment' ) ;
    public final void rule__For__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1571:1: ( ( 'increment' ) )
            // InternalOptimind.g:1572:1: ( 'increment' )
            {
            // InternalOptimind.g:1572:1: ( 'increment' )
            // InternalOptimind.g:1573:2: 'increment'
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
    // InternalOptimind.g:1582:1: rule__For__Group__9 : rule__For__Group__9__Impl rule__For__Group__10 ;
    public final void rule__For__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1586:1: ( rule__For__Group__9__Impl rule__For__Group__10 )
            // InternalOptimind.g:1587:2: rule__For__Group__9__Impl rule__For__Group__10
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
    // InternalOptimind.g:1594:1: rule__For__Group__9__Impl : ( ( rule__For__IncrementAssignment_9 ) ) ;
    public final void rule__For__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1598:1: ( ( ( rule__For__IncrementAssignment_9 ) ) )
            // InternalOptimind.g:1599:1: ( ( rule__For__IncrementAssignment_9 ) )
            {
            // InternalOptimind.g:1599:1: ( ( rule__For__IncrementAssignment_9 ) )
            // InternalOptimind.g:1600:2: ( rule__For__IncrementAssignment_9 )
            {
             before(grammarAccess.getForAccess().getIncrementAssignment_9()); 
            // InternalOptimind.g:1601:2: ( rule__For__IncrementAssignment_9 )
            // InternalOptimind.g:1601:3: rule__For__IncrementAssignment_9
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
    // InternalOptimind.g:1609:1: rule__For__Group__10 : rule__For__Group__10__Impl rule__For__Group__11 ;
    public final void rule__For__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1613:1: ( rule__For__Group__10__Impl rule__For__Group__11 )
            // InternalOptimind.g:1614:2: rule__For__Group__10__Impl rule__For__Group__11
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
    // InternalOptimind.g:1621:1: rule__For__Group__10__Impl : ( 'do' ) ;
    public final void rule__For__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1625:1: ( ( 'do' ) )
            // InternalOptimind.g:1626:1: ( 'do' )
            {
            // InternalOptimind.g:1626:1: ( 'do' )
            // InternalOptimind.g:1627:2: 'do'
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
    // InternalOptimind.g:1636:1: rule__For__Group__11 : rule__For__Group__11__Impl rule__For__Group__12 ;
    public final void rule__For__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1640:1: ( rule__For__Group__11__Impl rule__For__Group__12 )
            // InternalOptimind.g:1641:2: rule__For__Group__11__Impl rule__For__Group__12
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
    // InternalOptimind.g:1648:1: rule__For__Group__11__Impl : ( ( rule__For__AbstracttaskAssignment_11 ) ) ;
    public final void rule__For__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1652:1: ( ( ( rule__For__AbstracttaskAssignment_11 ) ) )
            // InternalOptimind.g:1653:1: ( ( rule__For__AbstracttaskAssignment_11 ) )
            {
            // InternalOptimind.g:1653:1: ( ( rule__For__AbstracttaskAssignment_11 ) )
            // InternalOptimind.g:1654:2: ( rule__For__AbstracttaskAssignment_11 )
            {
             before(grammarAccess.getForAccess().getAbstracttaskAssignment_11()); 
            // InternalOptimind.g:1655:2: ( rule__For__AbstracttaskAssignment_11 )
            // InternalOptimind.g:1655:3: rule__For__AbstracttaskAssignment_11
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
    // InternalOptimind.g:1663:1: rule__For__Group__12 : rule__For__Group__12__Impl ;
    public final void rule__For__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1667:1: ( rule__For__Group__12__Impl )
            // InternalOptimind.g:1668:2: rule__For__Group__12__Impl
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
    // InternalOptimind.g:1674:1: rule__For__Group__12__Impl : ( '}' ) ;
    public final void rule__For__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1678:1: ( ( '}' ) )
            // InternalOptimind.g:1679:1: ( '}' )
            {
            // InternalOptimind.g:1679:1: ( '}' )
            // InternalOptimind.g:1680:2: '}'
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
    // InternalOptimind.g:1690:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1694:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalOptimind.g:1695:2: rule__While__Group__0__Impl rule__While__Group__1
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
    // InternalOptimind.g:1702:1: rule__While__Group__0__Impl : ( () ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1706:1: ( ( () ) )
            // InternalOptimind.g:1707:1: ( () )
            {
            // InternalOptimind.g:1707:1: ( () )
            // InternalOptimind.g:1708:2: ()
            {
             before(grammarAccess.getWhileAccess().getWhileStatementAction_0()); 
            // InternalOptimind.g:1709:2: ()
            // InternalOptimind.g:1709:3: 
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
    // InternalOptimind.g:1717:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1721:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalOptimind.g:1722:2: rule__While__Group__1__Impl rule__While__Group__2
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
    // InternalOptimind.g:1729:1: rule__While__Group__1__Impl : ( 'While' ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1733:1: ( ( 'While' ) )
            // InternalOptimind.g:1734:1: ( 'While' )
            {
            // InternalOptimind.g:1734:1: ( 'While' )
            // InternalOptimind.g:1735:2: 'While'
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
    // InternalOptimind.g:1744:1: rule__While__Group__2 : rule__While__Group__2__Impl rule__While__Group__3 ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1748:1: ( rule__While__Group__2__Impl rule__While__Group__3 )
            // InternalOptimind.g:1749:2: rule__While__Group__2__Impl rule__While__Group__3
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
    // InternalOptimind.g:1756:1: rule__While__Group__2__Impl : ( ( rule__While__NameAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1760:1: ( ( ( rule__While__NameAssignment_2 ) ) )
            // InternalOptimind.g:1761:1: ( ( rule__While__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1761:1: ( ( rule__While__NameAssignment_2 ) )
            // InternalOptimind.g:1762:2: ( rule__While__NameAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1763:2: ( rule__While__NameAssignment_2 )
            // InternalOptimind.g:1763:3: rule__While__NameAssignment_2
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
    // InternalOptimind.g:1771:1: rule__While__Group__3 : rule__While__Group__3__Impl rule__While__Group__4 ;
    public final void rule__While__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1775:1: ( rule__While__Group__3__Impl rule__While__Group__4 )
            // InternalOptimind.g:1776:2: rule__While__Group__3__Impl rule__While__Group__4
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
    // InternalOptimind.g:1783:1: rule__While__Group__3__Impl : ( '{' ) ;
    public final void rule__While__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1787:1: ( ( '{' ) )
            // InternalOptimind.g:1788:1: ( '{' )
            {
            // InternalOptimind.g:1788:1: ( '{' )
            // InternalOptimind.g:1789:2: '{'
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
    // InternalOptimind.g:1798:1: rule__While__Group__4 : rule__While__Group__4__Impl rule__While__Group__5 ;
    public final void rule__While__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1802:1: ( rule__While__Group__4__Impl rule__While__Group__5 )
            // InternalOptimind.g:1803:2: rule__While__Group__4__Impl rule__While__Group__5
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
    // InternalOptimind.g:1810:1: rule__While__Group__4__Impl : ( 'do' ) ;
    public final void rule__While__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1814:1: ( ( 'do' ) )
            // InternalOptimind.g:1815:1: ( 'do' )
            {
            // InternalOptimind.g:1815:1: ( 'do' )
            // InternalOptimind.g:1816:2: 'do'
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
    // InternalOptimind.g:1825:1: rule__While__Group__5 : rule__While__Group__5__Impl rule__While__Group__6 ;
    public final void rule__While__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1829:1: ( rule__While__Group__5__Impl rule__While__Group__6 )
            // InternalOptimind.g:1830:2: rule__While__Group__5__Impl rule__While__Group__6
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
    // InternalOptimind.g:1837:1: rule__While__Group__5__Impl : ( ( rule__While__AbstracttaskAssignment_5 ) ) ;
    public final void rule__While__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1841:1: ( ( ( rule__While__AbstracttaskAssignment_5 ) ) )
            // InternalOptimind.g:1842:1: ( ( rule__While__AbstracttaskAssignment_5 ) )
            {
            // InternalOptimind.g:1842:1: ( ( rule__While__AbstracttaskAssignment_5 ) )
            // InternalOptimind.g:1843:2: ( rule__While__AbstracttaskAssignment_5 )
            {
             before(grammarAccess.getWhileAccess().getAbstracttaskAssignment_5()); 
            // InternalOptimind.g:1844:2: ( rule__While__AbstracttaskAssignment_5 )
            // InternalOptimind.g:1844:3: rule__While__AbstracttaskAssignment_5
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
    // InternalOptimind.g:1852:1: rule__While__Group__6 : rule__While__Group__6__Impl ;
    public final void rule__While__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1856:1: ( rule__While__Group__6__Impl )
            // InternalOptimind.g:1857:2: rule__While__Group__6__Impl
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
    // InternalOptimind.g:1863:1: rule__While__Group__6__Impl : ( '}' ) ;
    public final void rule__While__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1867:1: ( ( '}' ) )
            // InternalOptimind.g:1868:1: ( '}' )
            {
            // InternalOptimind.g:1868:1: ( '}' )
            // InternalOptimind.g:1869:2: '}'
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
    // InternalOptimind.g:1879:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1883:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalOptimind.g:1884:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalOptimind.g:1891:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1895:1: ( ( () ) )
            // InternalOptimind.g:1896:1: ( () )
            {
            // InternalOptimind.g:1896:1: ( () )
            // InternalOptimind.g:1897:2: ()
            {
             before(grammarAccess.getIfAccess().getIfStatementAction_0()); 
            // InternalOptimind.g:1898:2: ()
            // InternalOptimind.g:1898:3: 
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
    // InternalOptimind.g:1906:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1910:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalOptimind.g:1911:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalOptimind.g:1918:1: rule__If__Group__1__Impl : ( 'If' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1922:1: ( ( 'If' ) )
            // InternalOptimind.g:1923:1: ( 'If' )
            {
            // InternalOptimind.g:1923:1: ( 'If' )
            // InternalOptimind.g:1924:2: 'If'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalOptimind.g:1933:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1937:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalOptimind.g:1938:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalOptimind.g:1945:1: rule__If__Group__2__Impl : ( ( rule__If__NameAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1949:1: ( ( ( rule__If__NameAssignment_2 ) ) )
            // InternalOptimind.g:1950:1: ( ( rule__If__NameAssignment_2 ) )
            {
            // InternalOptimind.g:1950:1: ( ( rule__If__NameAssignment_2 ) )
            // InternalOptimind.g:1951:2: ( rule__If__NameAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getNameAssignment_2()); 
            // InternalOptimind.g:1952:2: ( rule__If__NameAssignment_2 )
            // InternalOptimind.g:1952:3: rule__If__NameAssignment_2
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
    // InternalOptimind.g:1960:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1964:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalOptimind.g:1965:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalOptimind.g:1972:1: rule__If__Group__3__Impl : ( '{' ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1976:1: ( ( '{' ) )
            // InternalOptimind.g:1977:1: ( '{' )
            {
            // InternalOptimind.g:1977:1: ( '{' )
            // InternalOptimind.g:1978:2: '{'
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
    // InternalOptimind.g:1987:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:1991:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalOptimind.g:1992:2: rule__If__Group__4__Impl rule__If__Group__5
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
    // InternalOptimind.g:1999:1: rule__If__Group__4__Impl : ( 'then' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2003:1: ( ( 'then' ) )
            // InternalOptimind.g:2004:1: ( 'then' )
            {
            // InternalOptimind.g:2004:1: ( 'then' )
            // InternalOptimind.g:2005:2: 'then'
            {
             before(grammarAccess.getIfAccess().getThenKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalOptimind.g:2014:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2018:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalOptimind.g:2019:2: rule__If__Group__5__Impl rule__If__Group__6
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
    // InternalOptimind.g:2026:1: rule__If__Group__5__Impl : ( ( rule__If__ThenAssignment_5 ) ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2030:1: ( ( ( rule__If__ThenAssignment_5 ) ) )
            // InternalOptimind.g:2031:1: ( ( rule__If__ThenAssignment_5 ) )
            {
            // InternalOptimind.g:2031:1: ( ( rule__If__ThenAssignment_5 ) )
            // InternalOptimind.g:2032:2: ( rule__If__ThenAssignment_5 )
            {
             before(grammarAccess.getIfAccess().getThenAssignment_5()); 
            // InternalOptimind.g:2033:2: ( rule__If__ThenAssignment_5 )
            // InternalOptimind.g:2033:3: rule__If__ThenAssignment_5
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
    // InternalOptimind.g:2041:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2045:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalOptimind.g:2046:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalOptimind.g:2053:1: rule__If__Group__6__Impl : ( ( rule__If__Group_6__0 )? ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2057:1: ( ( ( rule__If__Group_6__0 )? ) )
            // InternalOptimind.g:2058:1: ( ( rule__If__Group_6__0 )? )
            {
            // InternalOptimind.g:2058:1: ( ( rule__If__Group_6__0 )? )
            // InternalOptimind.g:2059:2: ( rule__If__Group_6__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_6()); 
            // InternalOptimind.g:2060:2: ( rule__If__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOptimind.g:2060:3: rule__If__Group_6__0
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
    // InternalOptimind.g:2068:1: rule__If__Group__7 : rule__If__Group__7__Impl ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2072:1: ( rule__If__Group__7__Impl )
            // InternalOptimind.g:2073:2: rule__If__Group__7__Impl
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
    // InternalOptimind.g:2079:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2083:1: ( ( '}' ) )
            // InternalOptimind.g:2084:1: ( '}' )
            {
            // InternalOptimind.g:2084:1: ( '}' )
            // InternalOptimind.g:2085:2: '}'
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
    // InternalOptimind.g:2095:1: rule__If__Group_6__0 : rule__If__Group_6__0__Impl rule__If__Group_6__1 ;
    public final void rule__If__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2099:1: ( rule__If__Group_6__0__Impl rule__If__Group_6__1 )
            // InternalOptimind.g:2100:2: rule__If__Group_6__0__Impl rule__If__Group_6__1
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
    // InternalOptimind.g:2107:1: rule__If__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2111:1: ( ( 'else' ) )
            // InternalOptimind.g:2112:1: ( 'else' )
            {
            // InternalOptimind.g:2112:1: ( 'else' )
            // InternalOptimind.g:2113:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalOptimind.g:2122:1: rule__If__Group_6__1 : rule__If__Group_6__1__Impl ;
    public final void rule__If__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2126:1: ( rule__If__Group_6__1__Impl )
            // InternalOptimind.g:2127:2: rule__If__Group_6__1__Impl
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
    // InternalOptimind.g:2133:1: rule__If__Group_6__1__Impl : ( ( rule__If__ElseAssignment_6_1 ) ) ;
    public final void rule__If__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2137:1: ( ( ( rule__If__ElseAssignment_6_1 ) ) )
            // InternalOptimind.g:2138:1: ( ( rule__If__ElseAssignment_6_1 ) )
            {
            // InternalOptimind.g:2138:1: ( ( rule__If__ElseAssignment_6_1 ) )
            // InternalOptimind.g:2139:2: ( rule__If__ElseAssignment_6_1 )
            {
             before(grammarAccess.getIfAccess().getElseAssignment_6_1()); 
            // InternalOptimind.g:2140:2: ( rule__If__ElseAssignment_6_1 )
            // InternalOptimind.g:2140:3: rule__If__ElseAssignment_6_1
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
    // InternalOptimind.g:2149:1: rule__BaseTask__Group__0 : rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 ;
    public final void rule__BaseTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2153:1: ( rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1 )
            // InternalOptimind.g:2154:2: rule__BaseTask__Group__0__Impl rule__BaseTask__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalOptimind.g:2161:1: rule__BaseTask__Group__0__Impl : ( () ) ;
    public final void rule__BaseTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2165:1: ( ( () ) )
            // InternalOptimind.g:2166:1: ( () )
            {
            // InternalOptimind.g:2166:1: ( () )
            // InternalOptimind.g:2167:2: ()
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskAction_0()); 
            // InternalOptimind.g:2168:2: ()
            // InternalOptimind.g:2168:3: 
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
    // InternalOptimind.g:2176:1: rule__BaseTask__Group__1 : rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 ;
    public final void rule__BaseTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2180:1: ( rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2 )
            // InternalOptimind.g:2181:2: rule__BaseTask__Group__1__Impl rule__BaseTask__Group__2
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
    // InternalOptimind.g:2188:1: rule__BaseTask__Group__1__Impl : ( 'BaseTask' ) ;
    public final void rule__BaseTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2192:1: ( ( 'BaseTask' ) )
            // InternalOptimind.g:2193:1: ( 'BaseTask' )
            {
            // InternalOptimind.g:2193:1: ( 'BaseTask' )
            // InternalOptimind.g:2194:2: 'BaseTask'
            {
             before(grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalOptimind.g:2203:1: rule__BaseTask__Group__2 : rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 ;
    public final void rule__BaseTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2207:1: ( rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3 )
            // InternalOptimind.g:2208:2: rule__BaseTask__Group__2__Impl rule__BaseTask__Group__3
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
    // InternalOptimind.g:2215:1: rule__BaseTask__Group__2__Impl : ( ( rule__BaseTask__NameAssignment_2 ) ) ;
    public final void rule__BaseTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2219:1: ( ( ( rule__BaseTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2220:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2220:1: ( ( rule__BaseTask__NameAssignment_2 ) )
            // InternalOptimind.g:2221:2: ( rule__BaseTask__NameAssignment_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2222:2: ( rule__BaseTask__NameAssignment_2 )
            // InternalOptimind.g:2222:3: rule__BaseTask__NameAssignment_2
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
    // InternalOptimind.g:2230:1: rule__BaseTask__Group__3 : rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 ;
    public final void rule__BaseTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2234:1: ( rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4 )
            // InternalOptimind.g:2235:2: rule__BaseTask__Group__3__Impl rule__BaseTask__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2242:1: rule__BaseTask__Group__3__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2246:1: ( ( '{' ) )
            // InternalOptimind.g:2247:1: ( '{' )
            {
            // InternalOptimind.g:2247:1: ( '{' )
            // InternalOptimind.g:2248:2: '{'
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
    // InternalOptimind.g:2257:1: rule__BaseTask__Group__4 : rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 ;
    public final void rule__BaseTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2261:1: ( rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5 )
            // InternalOptimind.g:2262:2: rule__BaseTask__Group__4__Impl rule__BaseTask__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2269:1: rule__BaseTask__Group__4__Impl : ( ( rule__BaseTask__Group_4__0 )? ) ;
    public final void rule__BaseTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2273:1: ( ( ( rule__BaseTask__Group_4__0 )? ) )
            // InternalOptimind.g:2274:1: ( ( rule__BaseTask__Group_4__0 )? )
            {
            // InternalOptimind.g:2274:1: ( ( rule__BaseTask__Group_4__0 )? )
            // InternalOptimind.g:2275:2: ( rule__BaseTask__Group_4__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_4()); 
            // InternalOptimind.g:2276:2: ( rule__BaseTask__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptimind.g:2276:3: rule__BaseTask__Group_4__0
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
    // InternalOptimind.g:2284:1: rule__BaseTask__Group__5 : rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 ;
    public final void rule__BaseTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2288:1: ( rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6 )
            // InternalOptimind.g:2289:2: rule__BaseTask__Group__5__Impl rule__BaseTask__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2296:1: rule__BaseTask__Group__5__Impl : ( ( rule__BaseTask__Group_5__0 )? ) ;
    public final void rule__BaseTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2300:1: ( ( ( rule__BaseTask__Group_5__0 )? ) )
            // InternalOptimind.g:2301:1: ( ( rule__BaseTask__Group_5__0 )? )
            {
            // InternalOptimind.g:2301:1: ( ( rule__BaseTask__Group_5__0 )? )
            // InternalOptimind.g:2302:2: ( rule__BaseTask__Group_5__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5()); 
            // InternalOptimind.g:2303:2: ( rule__BaseTask__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptimind.g:2303:3: rule__BaseTask__Group_5__0
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
    // InternalOptimind.g:2311:1: rule__BaseTask__Group__6 : rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 ;
    public final void rule__BaseTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2315:1: ( rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7 )
            // InternalOptimind.g:2316:2: rule__BaseTask__Group__6__Impl rule__BaseTask__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2323:1: rule__BaseTask__Group__6__Impl : ( ( rule__BaseTask__Group_6__0 )? ) ;
    public final void rule__BaseTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2327:1: ( ( ( rule__BaseTask__Group_6__0 )? ) )
            // InternalOptimind.g:2328:1: ( ( rule__BaseTask__Group_6__0 )? )
            {
            // InternalOptimind.g:2328:1: ( ( rule__BaseTask__Group_6__0 )? )
            // InternalOptimind.g:2329:2: ( rule__BaseTask__Group_6__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6()); 
            // InternalOptimind.g:2330:2: ( rule__BaseTask__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOptimind.g:2330:3: rule__BaseTask__Group_6__0
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
    // InternalOptimind.g:2338:1: rule__BaseTask__Group__7 : rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 ;
    public final void rule__BaseTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2342:1: ( rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8 )
            // InternalOptimind.g:2343:2: rule__BaseTask__Group__7__Impl rule__BaseTask__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalOptimind.g:2350:1: rule__BaseTask__Group__7__Impl : ( ( rule__BaseTask__Group_7__0 )? ) ;
    public final void rule__BaseTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2354:1: ( ( ( rule__BaseTask__Group_7__0 )? ) )
            // InternalOptimind.g:2355:1: ( ( rule__BaseTask__Group_7__0 )? )
            {
            // InternalOptimind.g:2355:1: ( ( rule__BaseTask__Group_7__0 )? )
            // InternalOptimind.g:2356:2: ( rule__BaseTask__Group_7__0 )?
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_7()); 
            // InternalOptimind.g:2357:2: ( rule__BaseTask__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24||(LA20_0>=29 && LA20_0<=30)||LA20_0==33||LA20_0==38||LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptimind.g:2357:3: rule__BaseTask__Group_7__0
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
    // InternalOptimind.g:2365:1: rule__BaseTask__Group__8 : rule__BaseTask__Group__8__Impl ;
    public final void rule__BaseTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2369:1: ( rule__BaseTask__Group__8__Impl )
            // InternalOptimind.g:2370:2: rule__BaseTask__Group__8__Impl
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
    // InternalOptimind.g:2376:1: rule__BaseTask__Group__8__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2380:1: ( ( '}' ) )
            // InternalOptimind.g:2381:1: ( '}' )
            {
            // InternalOptimind.g:2381:1: ( '}' )
            // InternalOptimind.g:2382:2: '}'
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
    // InternalOptimind.g:2392:1: rule__BaseTask__Group_4__0 : rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 ;
    public final void rule__BaseTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2396:1: ( rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1 )
            // InternalOptimind.g:2397:2: rule__BaseTask__Group_4__0__Impl rule__BaseTask__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalOptimind.g:2404:1: rule__BaseTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__BaseTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2408:1: ( ( 'status' ) )
            // InternalOptimind.g:2409:1: ( 'status' )
            {
            // InternalOptimind.g:2409:1: ( 'status' )
            // InternalOptimind.g:2410:2: 'status'
            {
             before(grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOptimind.g:2419:1: rule__BaseTask__Group_4__1 : rule__BaseTask__Group_4__1__Impl ;
    public final void rule__BaseTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2423:1: ( rule__BaseTask__Group_4__1__Impl )
            // InternalOptimind.g:2424:2: rule__BaseTask__Group_4__1__Impl
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
    // InternalOptimind.g:2430:1: rule__BaseTask__Group_4__1__Impl : ( ( rule__BaseTask__StatusAssignment_4_1 ) ) ;
    public final void rule__BaseTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2434:1: ( ( ( rule__BaseTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:2435:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:2435:1: ( ( rule__BaseTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:2436:2: ( rule__BaseTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:2437:2: ( rule__BaseTask__StatusAssignment_4_1 )
            // InternalOptimind.g:2437:3: rule__BaseTask__StatusAssignment_4_1
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
    // InternalOptimind.g:2446:1: rule__BaseTask__Group_5__0 : rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 ;
    public final void rule__BaseTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2450:1: ( rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1 )
            // InternalOptimind.g:2451:2: rule__BaseTask__Group_5__0__Impl rule__BaseTask__Group_5__1
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
    // InternalOptimind.g:2458:1: rule__BaseTask__Group_5__0__Impl : ( 'inputs' ) ;
    public final void rule__BaseTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2462:1: ( ( 'inputs' ) )
            // InternalOptimind.g:2463:1: ( 'inputs' )
            {
            // InternalOptimind.g:2463:1: ( 'inputs' )
            // InternalOptimind.g:2464:2: 'inputs'
            {
             before(grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalOptimind.g:2473:1: rule__BaseTask__Group_5__1 : rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 ;
    public final void rule__BaseTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2477:1: ( rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2 )
            // InternalOptimind.g:2478:2: rule__BaseTask__Group_5__1__Impl rule__BaseTask__Group_5__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:2485:1: rule__BaseTask__Group_5__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2489:1: ( ( '{' ) )
            // InternalOptimind.g:2490:1: ( '{' )
            {
            // InternalOptimind.g:2490:1: ( '{' )
            // InternalOptimind.g:2491:2: '{'
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
    // InternalOptimind.g:2500:1: rule__BaseTask__Group_5__2 : rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 ;
    public final void rule__BaseTask__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2504:1: ( rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3 )
            // InternalOptimind.g:2505:2: rule__BaseTask__Group_5__2__Impl rule__BaseTask__Group_5__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:2512:1: rule__BaseTask__Group_5__2__Impl : ( ( rule__BaseTask__InputsAssignment_5_2 ) ) ;
    public final void rule__BaseTask__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2516:1: ( ( ( rule__BaseTask__InputsAssignment_5_2 ) ) )
            // InternalOptimind.g:2517:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            {
            // InternalOptimind.g:2517:1: ( ( rule__BaseTask__InputsAssignment_5_2 ) )
            // InternalOptimind.g:2518:2: ( rule__BaseTask__InputsAssignment_5_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_2()); 
            // InternalOptimind.g:2519:2: ( rule__BaseTask__InputsAssignment_5_2 )
            // InternalOptimind.g:2519:3: rule__BaseTask__InputsAssignment_5_2
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
    // InternalOptimind.g:2527:1: rule__BaseTask__Group_5__3 : rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 ;
    public final void rule__BaseTask__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2531:1: ( rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4 )
            // InternalOptimind.g:2532:2: rule__BaseTask__Group_5__3__Impl rule__BaseTask__Group_5__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:2539:1: rule__BaseTask__Group_5__3__Impl : ( ( rule__BaseTask__Group_5_3__0 )* ) ;
    public final void rule__BaseTask__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2543:1: ( ( ( rule__BaseTask__Group_5_3__0 )* ) )
            // InternalOptimind.g:2544:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            {
            // InternalOptimind.g:2544:1: ( ( rule__BaseTask__Group_5_3__0 )* )
            // InternalOptimind.g:2545:2: ( rule__BaseTask__Group_5_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_5_3()); 
            // InternalOptimind.g:2546:2: ( rule__BaseTask__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalOptimind.g:2546:3: rule__BaseTask__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BaseTask__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalOptimind.g:2554:1: rule__BaseTask__Group_5__4 : rule__BaseTask__Group_5__4__Impl ;
    public final void rule__BaseTask__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2558:1: ( rule__BaseTask__Group_5__4__Impl )
            // InternalOptimind.g:2559:2: rule__BaseTask__Group_5__4__Impl
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
    // InternalOptimind.g:2565:1: rule__BaseTask__Group_5__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2569:1: ( ( '}' ) )
            // InternalOptimind.g:2570:1: ( '}' )
            {
            // InternalOptimind.g:2570:1: ( '}' )
            // InternalOptimind.g:2571:2: '}'
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
    // InternalOptimind.g:2581:1: rule__BaseTask__Group_5_3__0 : rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 ;
    public final void rule__BaseTask__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2585:1: ( rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1 )
            // InternalOptimind.g:2586:2: rule__BaseTask__Group_5_3__0__Impl rule__BaseTask__Group_5_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:2593:1: rule__BaseTask__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2597:1: ( ( ',' ) )
            // InternalOptimind.g:2598:1: ( ',' )
            {
            // InternalOptimind.g:2598:1: ( ',' )
            // InternalOptimind.g:2599:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOptimind.g:2608:1: rule__BaseTask__Group_5_3__1 : rule__BaseTask__Group_5_3__1__Impl ;
    public final void rule__BaseTask__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2612:1: ( rule__BaseTask__Group_5_3__1__Impl )
            // InternalOptimind.g:2613:2: rule__BaseTask__Group_5_3__1__Impl
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
    // InternalOptimind.g:2619:1: rule__BaseTask__Group_5_3__1__Impl : ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) ;
    public final void rule__BaseTask__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2623:1: ( ( ( rule__BaseTask__InputsAssignment_5_3_1 ) ) )
            // InternalOptimind.g:2624:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            {
            // InternalOptimind.g:2624:1: ( ( rule__BaseTask__InputsAssignment_5_3_1 ) )
            // InternalOptimind.g:2625:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getInputsAssignment_5_3_1()); 
            // InternalOptimind.g:2626:2: ( rule__BaseTask__InputsAssignment_5_3_1 )
            // InternalOptimind.g:2626:3: rule__BaseTask__InputsAssignment_5_3_1
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
    // InternalOptimind.g:2635:1: rule__BaseTask__Group_6__0 : rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 ;
    public final void rule__BaseTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2639:1: ( rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1 )
            // InternalOptimind.g:2640:2: rule__BaseTask__Group_6__0__Impl rule__BaseTask__Group_6__1
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
    // InternalOptimind.g:2647:1: rule__BaseTask__Group_6__0__Impl : ( 'outputs' ) ;
    public final void rule__BaseTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2651:1: ( ( 'outputs' ) )
            // InternalOptimind.g:2652:1: ( 'outputs' )
            {
            // InternalOptimind.g:2652:1: ( 'outputs' )
            // InternalOptimind.g:2653:2: 'outputs'
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalOptimind.g:2662:1: rule__BaseTask__Group_6__1 : rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 ;
    public final void rule__BaseTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2666:1: ( rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2 )
            // InternalOptimind.g:2667:2: rule__BaseTask__Group_6__1__Impl rule__BaseTask__Group_6__2
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
    // InternalOptimind.g:2674:1: rule__BaseTask__Group_6__1__Impl : ( '{' ) ;
    public final void rule__BaseTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2678:1: ( ( '{' ) )
            // InternalOptimind.g:2679:1: ( '{' )
            {
            // InternalOptimind.g:2679:1: ( '{' )
            // InternalOptimind.g:2680:2: '{'
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
    // InternalOptimind.g:2689:1: rule__BaseTask__Group_6__2 : rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 ;
    public final void rule__BaseTask__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2693:1: ( rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3 )
            // InternalOptimind.g:2694:2: rule__BaseTask__Group_6__2__Impl rule__BaseTask__Group_6__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:2701:1: rule__BaseTask__Group_6__2__Impl : ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) ;
    public final void rule__BaseTask__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2705:1: ( ( ( rule__BaseTask__OutputsAssignment_6_2 ) ) )
            // InternalOptimind.g:2706:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            {
            // InternalOptimind.g:2706:1: ( ( rule__BaseTask__OutputsAssignment_6_2 ) )
            // InternalOptimind.g:2707:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_2()); 
            // InternalOptimind.g:2708:2: ( rule__BaseTask__OutputsAssignment_6_2 )
            // InternalOptimind.g:2708:3: rule__BaseTask__OutputsAssignment_6_2
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
    // InternalOptimind.g:2716:1: rule__BaseTask__Group_6__3 : rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 ;
    public final void rule__BaseTask__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2720:1: ( rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4 )
            // InternalOptimind.g:2721:2: rule__BaseTask__Group_6__3__Impl rule__BaseTask__Group_6__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalOptimind.g:2728:1: rule__BaseTask__Group_6__3__Impl : ( ( rule__BaseTask__Group_6_3__0 )* ) ;
    public final void rule__BaseTask__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2732:1: ( ( ( rule__BaseTask__Group_6_3__0 )* ) )
            // InternalOptimind.g:2733:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            {
            // InternalOptimind.g:2733:1: ( ( rule__BaseTask__Group_6_3__0 )* )
            // InternalOptimind.g:2734:2: ( rule__BaseTask__Group_6_3__0 )*
            {
             before(grammarAccess.getBaseTaskAccess().getGroup_6_3()); 
            // InternalOptimind.g:2735:2: ( rule__BaseTask__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOptimind.g:2735:3: rule__BaseTask__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__BaseTask__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalOptimind.g:2743:1: rule__BaseTask__Group_6__4 : rule__BaseTask__Group_6__4__Impl ;
    public final void rule__BaseTask__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2747:1: ( rule__BaseTask__Group_6__4__Impl )
            // InternalOptimind.g:2748:2: rule__BaseTask__Group_6__4__Impl
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
    // InternalOptimind.g:2754:1: rule__BaseTask__Group_6__4__Impl : ( '}' ) ;
    public final void rule__BaseTask__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2758:1: ( ( '}' ) )
            // InternalOptimind.g:2759:1: ( '}' )
            {
            // InternalOptimind.g:2759:1: ( '}' )
            // InternalOptimind.g:2760:2: '}'
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
    // InternalOptimind.g:2770:1: rule__BaseTask__Group_6_3__0 : rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 ;
    public final void rule__BaseTask__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2774:1: ( rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1 )
            // InternalOptimind.g:2775:2: rule__BaseTask__Group_6_3__0__Impl rule__BaseTask__Group_6_3__1
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
    // InternalOptimind.g:2782:1: rule__BaseTask__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__BaseTask__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2786:1: ( ( ',' ) )
            // InternalOptimind.g:2787:1: ( ',' )
            {
            // InternalOptimind.g:2787:1: ( ',' )
            // InternalOptimind.g:2788:2: ','
            {
             before(grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalOptimind.g:2797:1: rule__BaseTask__Group_6_3__1 : rule__BaseTask__Group_6_3__1__Impl ;
    public final void rule__BaseTask__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2801:1: ( rule__BaseTask__Group_6_3__1__Impl )
            // InternalOptimind.g:2802:2: rule__BaseTask__Group_6_3__1__Impl
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
    // InternalOptimind.g:2808:1: rule__BaseTask__Group_6_3__1__Impl : ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) ;
    public final void rule__BaseTask__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2812:1: ( ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) ) )
            // InternalOptimind.g:2813:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            {
            // InternalOptimind.g:2813:1: ( ( rule__BaseTask__OutputsAssignment_6_3_1 ) )
            // InternalOptimind.g:2814:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            {
             before(grammarAccess.getBaseTaskAccess().getOutputsAssignment_6_3_1()); 
            // InternalOptimind.g:2815:2: ( rule__BaseTask__OutputsAssignment_6_3_1 )
            // InternalOptimind.g:2815:3: rule__BaseTask__OutputsAssignment_6_3_1
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
    // InternalOptimind.g:2824:1: rule__BaseTask__Group_7__0 : rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 ;
    public final void rule__BaseTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2828:1: ( rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1 )
            // InternalOptimind.g:2829:2: rule__BaseTask__Group_7__0__Impl rule__BaseTask__Group_7__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalOptimind.g:2836:1: rule__BaseTask__Group_7__0__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) ;
    public final void rule__BaseTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2840:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_0 ) ) )
            // InternalOptimind.g:2841:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            {
            // InternalOptimind.g:2841:1: ( ( rule__BaseTask__ChildrenAssignment_7_0 ) )
            // InternalOptimind.g:2842:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_0()); 
            // InternalOptimind.g:2843:2: ( rule__BaseTask__ChildrenAssignment_7_0 )
            // InternalOptimind.g:2843:3: rule__BaseTask__ChildrenAssignment_7_0
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
    // InternalOptimind.g:2851:1: rule__BaseTask__Group_7__1 : rule__BaseTask__Group_7__1__Impl ;
    public final void rule__BaseTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2855:1: ( rule__BaseTask__Group_7__1__Impl )
            // InternalOptimind.g:2856:2: rule__BaseTask__Group_7__1__Impl
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
    // InternalOptimind.g:2862:1: rule__BaseTask__Group_7__1__Impl : ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) ;
    public final void rule__BaseTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2866:1: ( ( ( rule__BaseTask__ChildrenAssignment_7_1 )* ) )
            // InternalOptimind.g:2867:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            {
            // InternalOptimind.g:2867:1: ( ( rule__BaseTask__ChildrenAssignment_7_1 )* )
            // InternalOptimind.g:2868:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAssignment_7_1()); 
            // InternalOptimind.g:2869:2: ( rule__BaseTask__ChildrenAssignment_7_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24||(LA23_0>=29 && LA23_0<=30)||LA23_0==33||LA23_0==38||LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOptimind.g:2869:3: rule__BaseTask__ChildrenAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__BaseTask__ChildrenAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalOptimind.g:2878:1: rule__LibraryTask__Group__0 : rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 ;
    public final void rule__LibraryTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2882:1: ( rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1 )
            // InternalOptimind.g:2883:2: rule__LibraryTask__Group__0__Impl rule__LibraryTask__Group__1
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
    // InternalOptimind.g:2890:1: rule__LibraryTask__Group__0__Impl : ( () ) ;
    public final void rule__LibraryTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2894:1: ( ( () ) )
            // InternalOptimind.g:2895:1: ( () )
            {
            // InternalOptimind.g:2895:1: ( () )
            // InternalOptimind.g:2896:2: ()
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0()); 
            // InternalOptimind.g:2897:2: ()
            // InternalOptimind.g:2897:3: 
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
    // InternalOptimind.g:2905:1: rule__LibraryTask__Group__1 : rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 ;
    public final void rule__LibraryTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2909:1: ( rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2 )
            // InternalOptimind.g:2910:2: rule__LibraryTask__Group__1__Impl rule__LibraryTask__Group__2
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
    // InternalOptimind.g:2917:1: rule__LibraryTask__Group__1__Impl : ( 'LibraryTask' ) ;
    public final void rule__LibraryTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2921:1: ( ( 'LibraryTask' ) )
            // InternalOptimind.g:2922:1: ( 'LibraryTask' )
            {
            // InternalOptimind.g:2922:1: ( 'LibraryTask' )
            // InternalOptimind.g:2923:2: 'LibraryTask'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalOptimind.g:2932:1: rule__LibraryTask__Group__2 : rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 ;
    public final void rule__LibraryTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2936:1: ( rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3 )
            // InternalOptimind.g:2937:2: rule__LibraryTask__Group__2__Impl rule__LibraryTask__Group__3
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
    // InternalOptimind.g:2944:1: rule__LibraryTask__Group__2__Impl : ( ( rule__LibraryTask__NameAssignment_2 ) ) ;
    public final void rule__LibraryTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2948:1: ( ( ( rule__LibraryTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:2949:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:2949:1: ( ( rule__LibraryTask__NameAssignment_2 ) )
            // InternalOptimind.g:2950:2: ( rule__LibraryTask__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:2951:2: ( rule__LibraryTask__NameAssignment_2 )
            // InternalOptimind.g:2951:3: rule__LibraryTask__NameAssignment_2
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
    // InternalOptimind.g:2959:1: rule__LibraryTask__Group__3 : rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 ;
    public final void rule__LibraryTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2963:1: ( rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4 )
            // InternalOptimind.g:2964:2: rule__LibraryTask__Group__3__Impl rule__LibraryTask__Group__4
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
    // InternalOptimind.g:2971:1: rule__LibraryTask__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2975:1: ( ( '{' ) )
            // InternalOptimind.g:2976:1: ( '{' )
            {
            // InternalOptimind.g:2976:1: ( '{' )
            // InternalOptimind.g:2977:2: '{'
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
    // InternalOptimind.g:2986:1: rule__LibraryTask__Group__4 : rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 ;
    public final void rule__LibraryTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:2990:1: ( rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5 )
            // InternalOptimind.g:2991:2: rule__LibraryTask__Group__4__Impl rule__LibraryTask__Group__5
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
    // InternalOptimind.g:2998:1: rule__LibraryTask__Group__4__Impl : ( ( rule__LibraryTask__Group_4__0 )? ) ;
    public final void rule__LibraryTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3002:1: ( ( ( rule__LibraryTask__Group_4__0 )? ) )
            // InternalOptimind.g:3003:1: ( ( rule__LibraryTask__Group_4__0 )? )
            {
            // InternalOptimind.g:3003:1: ( ( rule__LibraryTask__Group_4__0 )? )
            // InternalOptimind.g:3004:2: ( rule__LibraryTask__Group_4__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_4()); 
            // InternalOptimind.g:3005:2: ( rule__LibraryTask__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptimind.g:3005:3: rule__LibraryTask__Group_4__0
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
    // InternalOptimind.g:3013:1: rule__LibraryTask__Group__5 : rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 ;
    public final void rule__LibraryTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3017:1: ( rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6 )
            // InternalOptimind.g:3018:2: rule__LibraryTask__Group__5__Impl rule__LibraryTask__Group__6
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
    // InternalOptimind.g:3025:1: rule__LibraryTask__Group__5__Impl : ( ( rule__LibraryTask__Group_5__0 )? ) ;
    public final void rule__LibraryTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3029:1: ( ( ( rule__LibraryTask__Group_5__0 )? ) )
            // InternalOptimind.g:3030:1: ( ( rule__LibraryTask__Group_5__0 )? )
            {
            // InternalOptimind.g:3030:1: ( ( rule__LibraryTask__Group_5__0 )? )
            // InternalOptimind.g:3031:2: ( rule__LibraryTask__Group_5__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_5()); 
            // InternalOptimind.g:3032:2: ( rule__LibraryTask__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=42 && LA25_0<=43)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptimind.g:3032:3: rule__LibraryTask__Group_5__0
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
    // InternalOptimind.g:3040:1: rule__LibraryTask__Group__6 : rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 ;
    public final void rule__LibraryTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3044:1: ( rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7 )
            // InternalOptimind.g:3045:2: rule__LibraryTask__Group__6__Impl rule__LibraryTask__Group__7
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
    // InternalOptimind.g:3052:1: rule__LibraryTask__Group__6__Impl : ( ( rule__LibraryTask__Group_6__0 )? ) ;
    public final void rule__LibraryTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3056:1: ( ( ( rule__LibraryTask__Group_6__0 )? ) )
            // InternalOptimind.g:3057:1: ( ( rule__LibraryTask__Group_6__0 )? )
            {
            // InternalOptimind.g:3057:1: ( ( rule__LibraryTask__Group_6__0 )? )
            // InternalOptimind.g:3058:2: ( rule__LibraryTask__Group_6__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_6()); 
            // InternalOptimind.g:3059:2: ( rule__LibraryTask__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptimind.g:3059:3: rule__LibraryTask__Group_6__0
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
    // InternalOptimind.g:3067:1: rule__LibraryTask__Group__7 : rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 ;
    public final void rule__LibraryTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3071:1: ( rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8 )
            // InternalOptimind.g:3072:2: rule__LibraryTask__Group__7__Impl rule__LibraryTask__Group__8
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
    // InternalOptimind.g:3079:1: rule__LibraryTask__Group__7__Impl : ( ( rule__LibraryTask__Group_7__0 )? ) ;
    public final void rule__LibraryTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3083:1: ( ( ( rule__LibraryTask__Group_7__0 )? ) )
            // InternalOptimind.g:3084:1: ( ( rule__LibraryTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3084:1: ( ( rule__LibraryTask__Group_7__0 )? )
            // InternalOptimind.g:3085:2: ( rule__LibraryTask__Group_7__0 )?
            {
             before(grammarAccess.getLibraryTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3086:2: ( rule__LibraryTask__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptimind.g:3086:3: rule__LibraryTask__Group_7__0
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
    // InternalOptimind.g:3094:1: rule__LibraryTask__Group__8 : rule__LibraryTask__Group__8__Impl ;
    public final void rule__LibraryTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3098:1: ( rule__LibraryTask__Group__8__Impl )
            // InternalOptimind.g:3099:2: rule__LibraryTask__Group__8__Impl
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
    // InternalOptimind.g:3105:1: rule__LibraryTask__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3109:1: ( ( '}' ) )
            // InternalOptimind.g:3110:1: ( '}' )
            {
            // InternalOptimind.g:3110:1: ( '}' )
            // InternalOptimind.g:3111:2: '}'
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
    // InternalOptimind.g:3121:1: rule__LibraryTask__Group_4__0 : rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 ;
    public final void rule__LibraryTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3125:1: ( rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1 )
            // InternalOptimind.g:3126:2: rule__LibraryTask__Group_4__0__Impl rule__LibraryTask__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalOptimind.g:3133:1: rule__LibraryTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__LibraryTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3137:1: ( ( 'status' ) )
            // InternalOptimind.g:3138:1: ( 'status' )
            {
            // InternalOptimind.g:3138:1: ( 'status' )
            // InternalOptimind.g:3139:2: 'status'
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOptimind.g:3148:1: rule__LibraryTask__Group_4__1 : rule__LibraryTask__Group_4__1__Impl ;
    public final void rule__LibraryTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3152:1: ( rule__LibraryTask__Group_4__1__Impl )
            // InternalOptimind.g:3153:2: rule__LibraryTask__Group_4__1__Impl
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
    // InternalOptimind.g:3159:1: rule__LibraryTask__Group_4__1__Impl : ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) ;
    public final void rule__LibraryTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3163:1: ( ( ( rule__LibraryTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3164:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3164:1: ( ( rule__LibraryTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3165:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3166:2: ( rule__LibraryTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3166:3: rule__LibraryTask__StatusAssignment_4_1
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
    // InternalOptimind.g:3175:1: rule__LibraryTask__Group_5__0 : rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 ;
    public final void rule__LibraryTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3179:1: ( rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1 )
            // InternalOptimind.g:3180:2: rule__LibraryTask__Group_5__0__Impl rule__LibraryTask__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:3187:1: rule__LibraryTask__Group_5__0__Impl : ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) ;
    public final void rule__LibraryTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3191:1: ( ( ( rule__LibraryTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3192:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3192:1: ( ( rule__LibraryTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3193:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3194:2: ( rule__LibraryTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3194:3: rule__LibraryTask__InputsAssignment_5_0
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
    // InternalOptimind.g:3202:1: rule__LibraryTask__Group_5__1 : rule__LibraryTask__Group_5__1__Impl ;
    public final void rule__LibraryTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3206:1: ( rule__LibraryTask__Group_5__1__Impl )
            // InternalOptimind.g:3207:2: rule__LibraryTask__Group_5__1__Impl
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
    // InternalOptimind.g:3213:1: rule__LibraryTask__Group_5__1__Impl : ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) ;
    public final void rule__LibraryTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3217:1: ( ( ( rule__LibraryTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3218:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3218:1: ( ( rule__LibraryTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3219:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3220:2: ( rule__LibraryTask__InputsAssignment_5_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=42 && LA28_0<=43)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOptimind.g:3220:3: rule__LibraryTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__LibraryTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalOptimind.g:3229:1: rule__LibraryTask__Group_6__0 : rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 ;
    public final void rule__LibraryTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3233:1: ( rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1 )
            // InternalOptimind.g:3234:2: rule__LibraryTask__Group_6__0__Impl rule__LibraryTask__Group_6__1
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
    // InternalOptimind.g:3241:1: rule__LibraryTask__Group_6__0__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__LibraryTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3245:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3246:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3246:1: ( ( rule__LibraryTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3247:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3248:2: ( rule__LibraryTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3248:3: rule__LibraryTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:3256:1: rule__LibraryTask__Group_6__1 : rule__LibraryTask__Group_6__1__Impl ;
    public final void rule__LibraryTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3260:1: ( rule__LibraryTask__Group_6__1__Impl )
            // InternalOptimind.g:3261:2: rule__LibraryTask__Group_6__1__Impl
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
    // InternalOptimind.g:3267:1: rule__LibraryTask__Group_6__1__Impl : ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__LibraryTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3271:1: ( ( ( rule__LibraryTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3272:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3272:1: ( ( rule__LibraryTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3273:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3274:2: ( rule__LibraryTask__OutputsAssignment_6_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOptimind.g:3274:3: rule__LibraryTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalOptimind.g:3283:1: rule__LibraryTask__Group_7__0 : rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 ;
    public final void rule__LibraryTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3287:1: ( rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1 )
            // InternalOptimind.g:3288:2: rule__LibraryTask__Group_7__0__Impl rule__LibraryTask__Group_7__1
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
    // InternalOptimind.g:3295:1: rule__LibraryTask__Group_7__0__Impl : ( 'Libraryfunction' ) ;
    public final void rule__LibraryTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3299:1: ( ( 'Libraryfunction' ) )
            // InternalOptimind.g:3300:1: ( 'Libraryfunction' )
            {
            // InternalOptimind.g:3300:1: ( 'Libraryfunction' )
            // InternalOptimind.g:3301:2: 'Libraryfunction'
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalOptimind.g:3310:1: rule__LibraryTask__Group_7__1 : rule__LibraryTask__Group_7__1__Impl ;
    public final void rule__LibraryTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3314:1: ( rule__LibraryTask__Group_7__1__Impl )
            // InternalOptimind.g:3315:2: rule__LibraryTask__Group_7__1__Impl
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
    // InternalOptimind.g:3321:1: rule__LibraryTask__Group_7__1__Impl : ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) ;
    public final void rule__LibraryTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3325:1: ( ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) ) )
            // InternalOptimind.g:3326:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            {
            // InternalOptimind.g:3326:1: ( ( rule__LibraryTask__LibraryfunctionAssignment_7_1 ) )
            // InternalOptimind.g:3327:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionAssignment_7_1()); 
            // InternalOptimind.g:3328:2: ( rule__LibraryTask__LibraryfunctionAssignment_7_1 )
            // InternalOptimind.g:3328:3: rule__LibraryTask__LibraryfunctionAssignment_7_1
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
    // InternalOptimind.g:3337:1: rule__CustomTask__Group__0 : rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 ;
    public final void rule__CustomTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3341:1: ( rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1 )
            // InternalOptimind.g:3342:2: rule__CustomTask__Group__0__Impl rule__CustomTask__Group__1
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
    // InternalOptimind.g:3349:1: rule__CustomTask__Group__0__Impl : ( () ) ;
    public final void rule__CustomTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3353:1: ( ( () ) )
            // InternalOptimind.g:3354:1: ( () )
            {
            // InternalOptimind.g:3354:1: ( () )
            // InternalOptimind.g:3355:2: ()
            {
             before(grammarAccess.getCustomTaskAccess().getCustomTaskAction_0()); 
            // InternalOptimind.g:3356:2: ()
            // InternalOptimind.g:3356:3: 
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
    // InternalOptimind.g:3364:1: rule__CustomTask__Group__1 : rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 ;
    public final void rule__CustomTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3368:1: ( rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2 )
            // InternalOptimind.g:3369:2: rule__CustomTask__Group__1__Impl rule__CustomTask__Group__2
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
    // InternalOptimind.g:3376:1: rule__CustomTask__Group__1__Impl : ( 'Task' ) ;
    public final void rule__CustomTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3380:1: ( ( 'Task' ) )
            // InternalOptimind.g:3381:1: ( 'Task' )
            {
            // InternalOptimind.g:3381:1: ( 'Task' )
            // InternalOptimind.g:3382:2: 'Task'
            {
             before(grammarAccess.getCustomTaskAccess().getTaskKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalOptimind.g:3391:1: rule__CustomTask__Group__2 : rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 ;
    public final void rule__CustomTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3395:1: ( rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3 )
            // InternalOptimind.g:3396:2: rule__CustomTask__Group__2__Impl rule__CustomTask__Group__3
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
    // InternalOptimind.g:3403:1: rule__CustomTask__Group__2__Impl : ( ( rule__CustomTask__NameAssignment_2 ) ) ;
    public final void rule__CustomTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3407:1: ( ( ( rule__CustomTask__NameAssignment_2 ) ) )
            // InternalOptimind.g:3408:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3408:1: ( ( rule__CustomTask__NameAssignment_2 ) )
            // InternalOptimind.g:3409:2: ( rule__CustomTask__NameAssignment_2 )
            {
             before(grammarAccess.getCustomTaskAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3410:2: ( rule__CustomTask__NameAssignment_2 )
            // InternalOptimind.g:3410:3: rule__CustomTask__NameAssignment_2
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
    // InternalOptimind.g:3418:1: rule__CustomTask__Group__3 : rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 ;
    public final void rule__CustomTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3422:1: ( rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4 )
            // InternalOptimind.g:3423:2: rule__CustomTask__Group__3__Impl rule__CustomTask__Group__4
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
    // InternalOptimind.g:3430:1: rule__CustomTask__Group__3__Impl : ( '{' ) ;
    public final void rule__CustomTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3434:1: ( ( '{' ) )
            // InternalOptimind.g:3435:1: ( '{' )
            {
            // InternalOptimind.g:3435:1: ( '{' )
            // InternalOptimind.g:3436:2: '{'
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
    // InternalOptimind.g:3445:1: rule__CustomTask__Group__4 : rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 ;
    public final void rule__CustomTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3449:1: ( rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5 )
            // InternalOptimind.g:3450:2: rule__CustomTask__Group__4__Impl rule__CustomTask__Group__5
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
    // InternalOptimind.g:3457:1: rule__CustomTask__Group__4__Impl : ( ( rule__CustomTask__Group_4__0 )? ) ;
    public final void rule__CustomTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3461:1: ( ( ( rule__CustomTask__Group_4__0 )? ) )
            // InternalOptimind.g:3462:1: ( ( rule__CustomTask__Group_4__0 )? )
            {
            // InternalOptimind.g:3462:1: ( ( rule__CustomTask__Group_4__0 )? )
            // InternalOptimind.g:3463:2: ( rule__CustomTask__Group_4__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_4()); 
            // InternalOptimind.g:3464:2: ( rule__CustomTask__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimind.g:3464:3: rule__CustomTask__Group_4__0
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
    // InternalOptimind.g:3472:1: rule__CustomTask__Group__5 : rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 ;
    public final void rule__CustomTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3476:1: ( rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6 )
            // InternalOptimind.g:3477:2: rule__CustomTask__Group__5__Impl rule__CustomTask__Group__6
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
    // InternalOptimind.g:3484:1: rule__CustomTask__Group__5__Impl : ( ( rule__CustomTask__Group_5__0 )? ) ;
    public final void rule__CustomTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3488:1: ( ( ( rule__CustomTask__Group_5__0 )? ) )
            // InternalOptimind.g:3489:1: ( ( rule__CustomTask__Group_5__0 )? )
            {
            // InternalOptimind.g:3489:1: ( ( rule__CustomTask__Group_5__0 )? )
            // InternalOptimind.g:3490:2: ( rule__CustomTask__Group_5__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_5()); 
            // InternalOptimind.g:3491:2: ( rule__CustomTask__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=42 && LA31_0<=43)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOptimind.g:3491:3: rule__CustomTask__Group_5__0
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
    // InternalOptimind.g:3499:1: rule__CustomTask__Group__6 : rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 ;
    public final void rule__CustomTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3503:1: ( rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7 )
            // InternalOptimind.g:3504:2: rule__CustomTask__Group__6__Impl rule__CustomTask__Group__7
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
    // InternalOptimind.g:3511:1: rule__CustomTask__Group__6__Impl : ( ( rule__CustomTask__Group_6__0 )? ) ;
    public final void rule__CustomTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3515:1: ( ( ( rule__CustomTask__Group_6__0 )? ) )
            // InternalOptimind.g:3516:1: ( ( rule__CustomTask__Group_6__0 )? )
            {
            // InternalOptimind.g:3516:1: ( ( rule__CustomTask__Group_6__0 )? )
            // InternalOptimind.g:3517:2: ( rule__CustomTask__Group_6__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_6()); 
            // InternalOptimind.g:3518:2: ( rule__CustomTask__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimind.g:3518:3: rule__CustomTask__Group_6__0
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
    // InternalOptimind.g:3526:1: rule__CustomTask__Group__7 : rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 ;
    public final void rule__CustomTask__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3530:1: ( rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8 )
            // InternalOptimind.g:3531:2: rule__CustomTask__Group__7__Impl rule__CustomTask__Group__8
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
    // InternalOptimind.g:3538:1: rule__CustomTask__Group__7__Impl : ( ( rule__CustomTask__Group_7__0 )? ) ;
    public final void rule__CustomTask__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3542:1: ( ( ( rule__CustomTask__Group_7__0 )? ) )
            // InternalOptimind.g:3543:1: ( ( rule__CustomTask__Group_7__0 )? )
            {
            // InternalOptimind.g:3543:1: ( ( rule__CustomTask__Group_7__0 )? )
            // InternalOptimind.g:3544:2: ( rule__CustomTask__Group_7__0 )?
            {
             before(grammarAccess.getCustomTaskAccess().getGroup_7()); 
            // InternalOptimind.g:3545:2: ( rule__CustomTask__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==41) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOptimind.g:3545:3: rule__CustomTask__Group_7__0
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
    // InternalOptimind.g:3553:1: rule__CustomTask__Group__8 : rule__CustomTask__Group__8__Impl ;
    public final void rule__CustomTask__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3557:1: ( rule__CustomTask__Group__8__Impl )
            // InternalOptimind.g:3558:2: rule__CustomTask__Group__8__Impl
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
    // InternalOptimind.g:3564:1: rule__CustomTask__Group__8__Impl : ( '}' ) ;
    public final void rule__CustomTask__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3568:1: ( ( '}' ) )
            // InternalOptimind.g:3569:1: ( '}' )
            {
            // InternalOptimind.g:3569:1: ( '}' )
            // InternalOptimind.g:3570:2: '}'
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
    // InternalOptimind.g:3580:1: rule__CustomTask__Group_4__0 : rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 ;
    public final void rule__CustomTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3584:1: ( rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1 )
            // InternalOptimind.g:3585:2: rule__CustomTask__Group_4__0__Impl rule__CustomTask__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalOptimind.g:3592:1: rule__CustomTask__Group_4__0__Impl : ( 'status' ) ;
    public final void rule__CustomTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3596:1: ( ( 'status' ) )
            // InternalOptimind.g:3597:1: ( 'status' )
            {
            // InternalOptimind.g:3597:1: ( 'status' )
            // InternalOptimind.g:3598:2: 'status'
            {
             before(grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalOptimind.g:3607:1: rule__CustomTask__Group_4__1 : rule__CustomTask__Group_4__1__Impl ;
    public final void rule__CustomTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3611:1: ( rule__CustomTask__Group_4__1__Impl )
            // InternalOptimind.g:3612:2: rule__CustomTask__Group_4__1__Impl
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
    // InternalOptimind.g:3618:1: rule__CustomTask__Group_4__1__Impl : ( ( rule__CustomTask__StatusAssignment_4_1 ) ) ;
    public final void rule__CustomTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3622:1: ( ( ( rule__CustomTask__StatusAssignment_4_1 ) ) )
            // InternalOptimind.g:3623:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            {
            // InternalOptimind.g:3623:1: ( ( rule__CustomTask__StatusAssignment_4_1 ) )
            // InternalOptimind.g:3624:2: ( rule__CustomTask__StatusAssignment_4_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getStatusAssignment_4_1()); 
            // InternalOptimind.g:3625:2: ( rule__CustomTask__StatusAssignment_4_1 )
            // InternalOptimind.g:3625:3: rule__CustomTask__StatusAssignment_4_1
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
    // InternalOptimind.g:3634:1: rule__CustomTask__Group_5__0 : rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 ;
    public final void rule__CustomTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3638:1: ( rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1 )
            // InternalOptimind.g:3639:2: rule__CustomTask__Group_5__0__Impl rule__CustomTask__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:3646:1: rule__CustomTask__Group_5__0__Impl : ( ( rule__CustomTask__InputsAssignment_5_0 ) ) ;
    public final void rule__CustomTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3650:1: ( ( ( rule__CustomTask__InputsAssignment_5_0 ) ) )
            // InternalOptimind.g:3651:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            {
            // InternalOptimind.g:3651:1: ( ( rule__CustomTask__InputsAssignment_5_0 ) )
            // InternalOptimind.g:3652:2: ( rule__CustomTask__InputsAssignment_5_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_0()); 
            // InternalOptimind.g:3653:2: ( rule__CustomTask__InputsAssignment_5_0 )
            // InternalOptimind.g:3653:3: rule__CustomTask__InputsAssignment_5_0
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
    // InternalOptimind.g:3661:1: rule__CustomTask__Group_5__1 : rule__CustomTask__Group_5__1__Impl ;
    public final void rule__CustomTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3665:1: ( rule__CustomTask__Group_5__1__Impl )
            // InternalOptimind.g:3666:2: rule__CustomTask__Group_5__1__Impl
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
    // InternalOptimind.g:3672:1: rule__CustomTask__Group_5__1__Impl : ( ( rule__CustomTask__InputsAssignment_5_1 )* ) ;
    public final void rule__CustomTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3676:1: ( ( ( rule__CustomTask__InputsAssignment_5_1 )* ) )
            // InternalOptimind.g:3677:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            {
            // InternalOptimind.g:3677:1: ( ( rule__CustomTask__InputsAssignment_5_1 )* )
            // InternalOptimind.g:3678:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getInputsAssignment_5_1()); 
            // InternalOptimind.g:3679:2: ( rule__CustomTask__InputsAssignment_5_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=42 && LA34_0<=43)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOptimind.g:3679:3: rule__CustomTask__InputsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CustomTask__InputsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalOptimind.g:3688:1: rule__CustomTask__Group_6__0 : rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 ;
    public final void rule__CustomTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3692:1: ( rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1 )
            // InternalOptimind.g:3693:2: rule__CustomTask__Group_6__0__Impl rule__CustomTask__Group_6__1
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
    // InternalOptimind.g:3700:1: rule__CustomTask__Group_6__0__Impl : ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) ;
    public final void rule__CustomTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3704:1: ( ( ( rule__CustomTask__OutputsAssignment_6_0 ) ) )
            // InternalOptimind.g:3705:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:3705:1: ( ( rule__CustomTask__OutputsAssignment_6_0 ) )
            // InternalOptimind.g:3706:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_0()); 
            // InternalOptimind.g:3707:2: ( rule__CustomTask__OutputsAssignment_6_0 )
            // InternalOptimind.g:3707:3: rule__CustomTask__OutputsAssignment_6_0
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
    // InternalOptimind.g:3715:1: rule__CustomTask__Group_6__1 : rule__CustomTask__Group_6__1__Impl ;
    public final void rule__CustomTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3719:1: ( rule__CustomTask__Group_6__1__Impl )
            // InternalOptimind.g:3720:2: rule__CustomTask__Group_6__1__Impl
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
    // InternalOptimind.g:3726:1: rule__CustomTask__Group_6__1__Impl : ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) ;
    public final void rule__CustomTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3730:1: ( ( ( rule__CustomTask__OutputsAssignment_6_1 )* ) )
            // InternalOptimind.g:3731:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:3731:1: ( ( rule__CustomTask__OutputsAssignment_6_1 )* )
            // InternalOptimind.g:3732:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            {
             before(grammarAccess.getCustomTaskAccess().getOutputsAssignment_6_1()); 
            // InternalOptimind.g:3733:2: ( rule__CustomTask__OutputsAssignment_6_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalOptimind.g:3733:3: rule__CustomTask__OutputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__CustomTask__OutputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalOptimind.g:3742:1: rule__CustomTask__Group_7__0 : rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 ;
    public final void rule__CustomTask__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3746:1: ( rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1 )
            // InternalOptimind.g:3747:2: rule__CustomTask__Group_7__0__Impl rule__CustomTask__Group_7__1
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
    // InternalOptimind.g:3754:1: rule__CustomTask__Group_7__0__Impl : ( 'runner' ) ;
    public final void rule__CustomTask__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3758:1: ( ( 'runner' ) )
            // InternalOptimind.g:3759:1: ( 'runner' )
            {
            // InternalOptimind.g:3759:1: ( 'runner' )
            // InternalOptimind.g:3760:2: 'runner'
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalOptimind.g:3769:1: rule__CustomTask__Group_7__1 : rule__CustomTask__Group_7__1__Impl ;
    public final void rule__CustomTask__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3773:1: ( rule__CustomTask__Group_7__1__Impl )
            // InternalOptimind.g:3774:2: rule__CustomTask__Group_7__1__Impl
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
    // InternalOptimind.g:3780:1: rule__CustomTask__Group_7__1__Impl : ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) ;
    public final void rule__CustomTask__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3784:1: ( ( ( rule__CustomTask__RunnerAssignment_7_1 ) ) )
            // InternalOptimind.g:3785:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            {
            // InternalOptimind.g:3785:1: ( ( rule__CustomTask__RunnerAssignment_7_1 ) )
            // InternalOptimind.g:3786:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            {
             before(grammarAccess.getCustomTaskAccess().getRunnerAssignment_7_1()); 
            // InternalOptimind.g:3787:2: ( rule__CustomTask__RunnerAssignment_7_1 )
            // InternalOptimind.g:3787:3: rule__CustomTask__RunnerAssignment_7_1
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
    // InternalOptimind.g:3796:1: rule__Setter__Group__0 : rule__Setter__Group__0__Impl rule__Setter__Group__1 ;
    public final void rule__Setter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3800:1: ( rule__Setter__Group__0__Impl rule__Setter__Group__1 )
            // InternalOptimind.g:3801:2: rule__Setter__Group__0__Impl rule__Setter__Group__1
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
    // InternalOptimind.g:3808:1: rule__Setter__Group__0__Impl : ( () ) ;
    public final void rule__Setter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3812:1: ( ( () ) )
            // InternalOptimind.g:3813:1: ( () )
            {
            // InternalOptimind.g:3813:1: ( () )
            // InternalOptimind.g:3814:2: ()
            {
             before(grammarAccess.getSetterAccess().getSetterAction_0()); 
            // InternalOptimind.g:3815:2: ()
            // InternalOptimind.g:3815:3: 
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
    // InternalOptimind.g:3823:1: rule__Setter__Group__1 : rule__Setter__Group__1__Impl rule__Setter__Group__2 ;
    public final void rule__Setter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3827:1: ( rule__Setter__Group__1__Impl rule__Setter__Group__2 )
            // InternalOptimind.g:3828:2: rule__Setter__Group__1__Impl rule__Setter__Group__2
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
    // InternalOptimind.g:3835:1: rule__Setter__Group__1__Impl : ( 'Setter' ) ;
    public final void rule__Setter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3839:1: ( ( 'Setter' ) )
            // InternalOptimind.g:3840:1: ( 'Setter' )
            {
            // InternalOptimind.g:3840:1: ( 'Setter' )
            // InternalOptimind.g:3841:2: 'Setter'
            {
             before(grammarAccess.getSetterAccess().getSetterKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalOptimind.g:3850:1: rule__Setter__Group__2 : rule__Setter__Group__2__Impl rule__Setter__Group__3 ;
    public final void rule__Setter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3854:1: ( rule__Setter__Group__2__Impl rule__Setter__Group__3 )
            // InternalOptimind.g:3855:2: rule__Setter__Group__2__Impl rule__Setter__Group__3
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
    // InternalOptimind.g:3862:1: rule__Setter__Group__2__Impl : ( ( rule__Setter__NameAssignment_2 ) ) ;
    public final void rule__Setter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3866:1: ( ( ( rule__Setter__NameAssignment_2 ) ) )
            // InternalOptimind.g:3867:1: ( ( rule__Setter__NameAssignment_2 ) )
            {
            // InternalOptimind.g:3867:1: ( ( rule__Setter__NameAssignment_2 ) )
            // InternalOptimind.g:3868:2: ( rule__Setter__NameAssignment_2 )
            {
             before(grammarAccess.getSetterAccess().getNameAssignment_2()); 
            // InternalOptimind.g:3869:2: ( rule__Setter__NameAssignment_2 )
            // InternalOptimind.g:3869:3: rule__Setter__NameAssignment_2
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
    // InternalOptimind.g:3877:1: rule__Setter__Group__3 : rule__Setter__Group__3__Impl rule__Setter__Group__4 ;
    public final void rule__Setter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3881:1: ( rule__Setter__Group__3__Impl rule__Setter__Group__4 )
            // InternalOptimind.g:3882:2: rule__Setter__Group__3__Impl rule__Setter__Group__4
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
    // InternalOptimind.g:3889:1: rule__Setter__Group__3__Impl : ( ( rule__Setter__Group_3__0 )? ) ;
    public final void rule__Setter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3893:1: ( ( ( rule__Setter__Group_3__0 )? ) )
            // InternalOptimind.g:3894:1: ( ( rule__Setter__Group_3__0 )? )
            {
            // InternalOptimind.g:3894:1: ( ( rule__Setter__Group_3__0 )? )
            // InternalOptimind.g:3895:2: ( rule__Setter__Group_3__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_3()); 
            // InternalOptimind.g:3896:2: ( rule__Setter__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:3896:3: rule__Setter__Group_3__0
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
    // InternalOptimind.g:3904:1: rule__Setter__Group__4 : rule__Setter__Group__4__Impl ;
    public final void rule__Setter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3908:1: ( rule__Setter__Group__4__Impl )
            // InternalOptimind.g:3909:2: rule__Setter__Group__4__Impl
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
    // InternalOptimind.g:3915:1: rule__Setter__Group__4__Impl : ( ( rule__Setter__Group_4__0 )? ) ;
    public final void rule__Setter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3919:1: ( ( ( rule__Setter__Group_4__0 )? ) )
            // InternalOptimind.g:3920:1: ( ( rule__Setter__Group_4__0 )? )
            {
            // InternalOptimind.g:3920:1: ( ( rule__Setter__Group_4__0 )? )
            // InternalOptimind.g:3921:2: ( rule__Setter__Group_4__0 )?
            {
             before(grammarAccess.getSetterAccess().getGroup_4()); 
            // InternalOptimind.g:3922:2: ( rule__Setter__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimind.g:3922:3: rule__Setter__Group_4__0
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
    // InternalOptimind.g:3931:1: rule__Setter__Group_3__0 : rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 ;
    public final void rule__Setter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3935:1: ( rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1 )
            // InternalOptimind.g:3936:2: rule__Setter__Group_3__0__Impl rule__Setter__Group_3__1
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
    // InternalOptimind.g:3943:1: rule__Setter__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Setter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3947:1: ( ( 'type' ) )
            // InternalOptimind.g:3948:1: ( 'type' )
            {
            // InternalOptimind.g:3948:1: ( 'type' )
            // InternalOptimind.g:3949:2: 'type'
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
    // InternalOptimind.g:3958:1: rule__Setter__Group_3__1 : rule__Setter__Group_3__1__Impl ;
    public final void rule__Setter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3962:1: ( rule__Setter__Group_3__1__Impl )
            // InternalOptimind.g:3963:2: rule__Setter__Group_3__1__Impl
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
    // InternalOptimind.g:3969:1: rule__Setter__Group_3__1__Impl : ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Setter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3973:1: ( ( ( rule__Setter__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:3974:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:3974:1: ( ( rule__Setter__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:3975:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getSetterAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:3976:2: ( rule__Setter__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:3976:3: rule__Setter__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:3985:1: rule__Setter__Group_4__0 : rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 ;
    public final void rule__Setter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:3989:1: ( rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1 )
            // InternalOptimind.g:3990:2: rule__Setter__Group_4__0__Impl rule__Setter__Group_4__1
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
    // InternalOptimind.g:3997:1: rule__Setter__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Setter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4001:1: ( ( 'value' ) )
            // InternalOptimind.g:4002:1: ( 'value' )
            {
            // InternalOptimind.g:4002:1: ( 'value' )
            // InternalOptimind.g:4003:2: 'value'
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
    // InternalOptimind.g:4012:1: rule__Setter__Group_4__1 : rule__Setter__Group_4__1__Impl ;
    public final void rule__Setter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4016:1: ( rule__Setter__Group_4__1__Impl )
            // InternalOptimind.g:4017:2: rule__Setter__Group_4__1__Impl
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
    // InternalOptimind.g:4023:1: rule__Setter__Group_4__1__Impl : ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Setter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4027:1: ( ( ( rule__Setter__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4028:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4028:1: ( ( rule__Setter__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4029:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getSetterAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4030:2: ( rule__Setter__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4030:3: rule__Setter__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:4039:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4043:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalOptimind.g:4044:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalOptimind.g:4051:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4055:1: ( ( () ) )
            // InternalOptimind.g:4056:1: ( () )
            {
            // InternalOptimind.g:4056:1: ( () )
            // InternalOptimind.g:4057:2: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // InternalOptimind.g:4058:2: ()
            // InternalOptimind.g:4058:3: 
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
    // InternalOptimind.g:4066:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4070:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalOptimind.g:4071:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
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
    // InternalOptimind.g:4078:1: rule__Connection__Group__1__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4082:1: ( ( 'Connection' ) )
            // InternalOptimind.g:4083:1: ( 'Connection' )
            {
            // InternalOptimind.g:4083:1: ( 'Connection' )
            // InternalOptimind.g:4084:2: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalOptimind.g:4093:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4097:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalOptimind.g:4098:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
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
    // InternalOptimind.g:4105:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__NameAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4109:1: ( ( ( rule__Connection__NameAssignment_2 ) ) )
            // InternalOptimind.g:4110:1: ( ( rule__Connection__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4110:1: ( ( rule__Connection__NameAssignment_2 ) )
            // InternalOptimind.g:4111:2: ( rule__Connection__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4112:2: ( rule__Connection__NameAssignment_2 )
            // InternalOptimind.g:4112:3: rule__Connection__NameAssignment_2
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
    // InternalOptimind.g:4120:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4124:1: ( rule__Connection__Group__3__Impl )
            // InternalOptimind.g:4125:2: rule__Connection__Group__3__Impl
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
    // InternalOptimind.g:4131:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4135:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // InternalOptimind.g:4136:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // InternalOptimind.g:4136:1: ( ( rule__Connection__Group_3__0 )? )
            // InternalOptimind.g:4137:2: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // InternalOptimind.g:4138:2: ( rule__Connection__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOptimind.g:4138:3: rule__Connection__Group_3__0
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
    // InternalOptimind.g:4147:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4151:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // InternalOptimind.g:4152:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
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
    // InternalOptimind.g:4159:1: rule__Connection__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4163:1: ( ( 'to' ) )
            // InternalOptimind.g:4164:1: ( 'to' )
            {
            // InternalOptimind.g:4164:1: ( 'to' )
            // InternalOptimind.g:4165:2: 'to'
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
    // InternalOptimind.g:4174:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4178:1: ( rule__Connection__Group_3__1__Impl )
            // InternalOptimind.g:4179:2: rule__Connection__Group_3__1__Impl
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
    // InternalOptimind.g:4185:1: rule__Connection__Group_3__1__Impl : ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4189:1: ( ( ( rule__Connection__TaskoutputAssignment_3_1 ) ) )
            // InternalOptimind.g:4190:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            {
            // InternalOptimind.g:4190:1: ( ( rule__Connection__TaskoutputAssignment_3_1 ) )
            // InternalOptimind.g:4191:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputAssignment_3_1()); 
            // InternalOptimind.g:4192:2: ( rule__Connection__TaskoutputAssignment_3_1 )
            // InternalOptimind.g:4192:3: rule__Connection__TaskoutputAssignment_3_1
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
    // InternalOptimind.g:4201:1: rule__LibraryFunction__Group__0 : rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 ;
    public final void rule__LibraryFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4205:1: ( rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1 )
            // InternalOptimind.g:4206:2: rule__LibraryFunction__Group__0__Impl rule__LibraryFunction__Group__1
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
    // InternalOptimind.g:4213:1: rule__LibraryFunction__Group__0__Impl : ( () ) ;
    public final void rule__LibraryFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4217:1: ( ( () ) )
            // InternalOptimind.g:4218:1: ( () )
            {
            // InternalOptimind.g:4218:1: ( () )
            // InternalOptimind.g:4219:2: ()
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0()); 
            // InternalOptimind.g:4220:2: ()
            // InternalOptimind.g:4220:3: 
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
    // InternalOptimind.g:4228:1: rule__LibraryFunction__Group__1 : rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 ;
    public final void rule__LibraryFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4232:1: ( rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2 )
            // InternalOptimind.g:4233:2: rule__LibraryFunction__Group__1__Impl rule__LibraryFunction__Group__2
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
    // InternalOptimind.g:4240:1: rule__LibraryFunction__Group__1__Impl : ( 'LibraryFunction' ) ;
    public final void rule__LibraryFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4244:1: ( ( 'LibraryFunction' ) )
            // InternalOptimind.g:4245:1: ( 'LibraryFunction' )
            {
            // InternalOptimind.g:4245:1: ( 'LibraryFunction' )
            // InternalOptimind.g:4246:2: 'LibraryFunction'
            {
             before(grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalOptimind.g:4255:1: rule__LibraryFunction__Group__2 : rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 ;
    public final void rule__LibraryFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4259:1: ( rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3 )
            // InternalOptimind.g:4260:2: rule__LibraryFunction__Group__2__Impl rule__LibraryFunction__Group__3
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
    // InternalOptimind.g:4267:1: rule__LibraryFunction__Group__2__Impl : ( ( rule__LibraryFunction__NameAssignment_2 ) ) ;
    public final void rule__LibraryFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4271:1: ( ( ( rule__LibraryFunction__NameAssignment_2 ) ) )
            // InternalOptimind.g:4272:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4272:1: ( ( rule__LibraryFunction__NameAssignment_2 ) )
            // InternalOptimind.g:4273:2: ( rule__LibraryFunction__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4274:2: ( rule__LibraryFunction__NameAssignment_2 )
            // InternalOptimind.g:4274:3: rule__LibraryFunction__NameAssignment_2
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
    // InternalOptimind.g:4282:1: rule__LibraryFunction__Group__3 : rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 ;
    public final void rule__LibraryFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4286:1: ( rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4 )
            // InternalOptimind.g:4287:2: rule__LibraryFunction__Group__3__Impl rule__LibraryFunction__Group__4
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
    // InternalOptimind.g:4294:1: rule__LibraryFunction__Group__3__Impl : ( '{' ) ;
    public final void rule__LibraryFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4298:1: ( ( '{' ) )
            // InternalOptimind.g:4299:1: ( '{' )
            {
            // InternalOptimind.g:4299:1: ( '{' )
            // InternalOptimind.g:4300:2: '{'
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
    // InternalOptimind.g:4309:1: rule__LibraryFunction__Group__4 : rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 ;
    public final void rule__LibraryFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4313:1: ( rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5 )
            // InternalOptimind.g:4314:2: rule__LibraryFunction__Group__4__Impl rule__LibraryFunction__Group__5
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
    // InternalOptimind.g:4321:1: rule__LibraryFunction__Group__4__Impl : ( 'function' ) ;
    public final void rule__LibraryFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4325:1: ( ( 'function' ) )
            // InternalOptimind.g:4326:1: ( 'function' )
            {
            // InternalOptimind.g:4326:1: ( 'function' )
            // InternalOptimind.g:4327:2: 'function'
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalOptimind.g:4336:1: rule__LibraryFunction__Group__5 : rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 ;
    public final void rule__LibraryFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4340:1: ( rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6 )
            // InternalOptimind.g:4341:2: rule__LibraryFunction__Group__5__Impl rule__LibraryFunction__Group__6
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
    // InternalOptimind.g:4348:1: rule__LibraryFunction__Group__5__Impl : ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) ;
    public final void rule__LibraryFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4352:1: ( ( ( rule__LibraryFunction__FunctionAssignment_5 ) ) )
            // InternalOptimind.g:4353:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            {
            // InternalOptimind.g:4353:1: ( ( rule__LibraryFunction__FunctionAssignment_5 ) )
            // InternalOptimind.g:4354:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getFunctionAssignment_5()); 
            // InternalOptimind.g:4355:2: ( rule__LibraryFunction__FunctionAssignment_5 )
            // InternalOptimind.g:4355:3: rule__LibraryFunction__FunctionAssignment_5
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
    // InternalOptimind.g:4363:1: rule__LibraryFunction__Group__6 : rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 ;
    public final void rule__LibraryFunction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4367:1: ( rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7 )
            // InternalOptimind.g:4368:2: rule__LibraryFunction__Group__6__Impl rule__LibraryFunction__Group__7
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
    // InternalOptimind.g:4375:1: rule__LibraryFunction__Group__6__Impl : ( ( rule__LibraryFunction__Group_6__0 )? ) ;
    public final void rule__LibraryFunction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4379:1: ( ( ( rule__LibraryFunction__Group_6__0 )? ) )
            // InternalOptimind.g:4380:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            {
            // InternalOptimind.g:4380:1: ( ( rule__LibraryFunction__Group_6__0 )? )
            // InternalOptimind.g:4381:2: ( rule__LibraryFunction__Group_6__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_6()); 
            // InternalOptimind.g:4382:2: ( rule__LibraryFunction__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOptimind.g:4382:3: rule__LibraryFunction__Group_6__0
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
    // InternalOptimind.g:4390:1: rule__LibraryFunction__Group__7 : rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 ;
    public final void rule__LibraryFunction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4394:1: ( rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8 )
            // InternalOptimind.g:4395:2: rule__LibraryFunction__Group__7__Impl rule__LibraryFunction__Group__8
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
    // InternalOptimind.g:4402:1: rule__LibraryFunction__Group__7__Impl : ( ( rule__LibraryFunction__Group_7__0 )? ) ;
    public final void rule__LibraryFunction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4406:1: ( ( ( rule__LibraryFunction__Group_7__0 )? ) )
            // InternalOptimind.g:4407:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            {
            // InternalOptimind.g:4407:1: ( ( rule__LibraryFunction__Group_7__0 )? )
            // InternalOptimind.g:4408:2: ( rule__LibraryFunction__Group_7__0 )?
            {
             before(grammarAccess.getLibraryFunctionAccess().getGroup_7()); 
            // InternalOptimind.g:4409:2: ( rule__LibraryFunction__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptimind.g:4409:3: rule__LibraryFunction__Group_7__0
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
    // InternalOptimind.g:4417:1: rule__LibraryFunction__Group__8 : rule__LibraryFunction__Group__8__Impl ;
    public final void rule__LibraryFunction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4421:1: ( rule__LibraryFunction__Group__8__Impl )
            // InternalOptimind.g:4422:2: rule__LibraryFunction__Group__8__Impl
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
    // InternalOptimind.g:4428:1: rule__LibraryFunction__Group__8__Impl : ( '}' ) ;
    public final void rule__LibraryFunction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4432:1: ( ( '}' ) )
            // InternalOptimind.g:4433:1: ( '}' )
            {
            // InternalOptimind.g:4433:1: ( '}' )
            // InternalOptimind.g:4434:2: '}'
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
    // InternalOptimind.g:4444:1: rule__LibraryFunction__Group_6__0 : rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 ;
    public final void rule__LibraryFunction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4448:1: ( rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1 )
            // InternalOptimind.g:4449:2: rule__LibraryFunction__Group_6__0__Impl rule__LibraryFunction__Group_6__1
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
    // InternalOptimind.g:4456:1: rule__LibraryFunction__Group_6__0__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) ;
    public final void rule__LibraryFunction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4460:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_0 ) ) )
            // InternalOptimind.g:4461:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            {
            // InternalOptimind.g:4461:1: ( ( rule__LibraryFunction__InputsAssignment_6_0 ) )
            // InternalOptimind.g:4462:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_0()); 
            // InternalOptimind.g:4463:2: ( rule__LibraryFunction__InputsAssignment_6_0 )
            // InternalOptimind.g:4463:3: rule__LibraryFunction__InputsAssignment_6_0
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
    // InternalOptimind.g:4471:1: rule__LibraryFunction__Group_6__1 : rule__LibraryFunction__Group_6__1__Impl ;
    public final void rule__LibraryFunction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4475:1: ( rule__LibraryFunction__Group_6__1__Impl )
            // InternalOptimind.g:4476:2: rule__LibraryFunction__Group_6__1__Impl
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
    // InternalOptimind.g:4482:1: rule__LibraryFunction__Group_6__1__Impl : ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) ;
    public final void rule__LibraryFunction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4486:1: ( ( ( rule__LibraryFunction__InputsAssignment_6_1 )* ) )
            // InternalOptimind.g:4487:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            {
            // InternalOptimind.g:4487:1: ( ( rule__LibraryFunction__InputsAssignment_6_1 )* )
            // InternalOptimind.g:4488:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getInputsAssignment_6_1()); 
            // InternalOptimind.g:4489:2: ( rule__LibraryFunction__InputsAssignment_6_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==46) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOptimind.g:4489:3: rule__LibraryFunction__InputsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__LibraryFunction__InputsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalOptimind.g:4498:1: rule__LibraryFunction__Group_7__0 : rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 ;
    public final void rule__LibraryFunction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4502:1: ( rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1 )
            // InternalOptimind.g:4503:2: rule__LibraryFunction__Group_7__0__Impl rule__LibraryFunction__Group_7__1
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
    // InternalOptimind.g:4510:1: rule__LibraryFunction__Group_7__0__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) ;
    public final void rule__LibraryFunction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4514:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) ) )
            // InternalOptimind.g:4515:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            {
            // InternalOptimind.g:4515:1: ( ( rule__LibraryFunction__OutputsAssignment_7_0 ) )
            // InternalOptimind.g:4516:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_0()); 
            // InternalOptimind.g:4517:2: ( rule__LibraryFunction__OutputsAssignment_7_0 )
            // InternalOptimind.g:4517:3: rule__LibraryFunction__OutputsAssignment_7_0
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
    // InternalOptimind.g:4525:1: rule__LibraryFunction__Group_7__1 : rule__LibraryFunction__Group_7__1__Impl ;
    public final void rule__LibraryFunction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4529:1: ( rule__LibraryFunction__Group_7__1__Impl )
            // InternalOptimind.g:4530:2: rule__LibraryFunction__Group_7__1__Impl
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
    // InternalOptimind.g:4536:1: rule__LibraryFunction__Group_7__1__Impl : ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) ;
    public final void rule__LibraryFunction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4540:1: ( ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* ) )
            // InternalOptimind.g:4541:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            {
            // InternalOptimind.g:4541:1: ( ( rule__LibraryFunction__OutputsAssignment_7_1 )* )
            // InternalOptimind.g:4542:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            {
             before(grammarAccess.getLibraryFunctionAccess().getOutputsAssignment_7_1()); 
            // InternalOptimind.g:4543:2: ( rule__LibraryFunction__OutputsAssignment_7_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==21) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOptimind.g:4543:3: rule__LibraryFunction__OutputsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__LibraryFunction__OutputsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalOptimind.g:4552:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4556:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalOptimind.g:4557:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalOptimind.g:4564:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4568:1: ( ( () ) )
            // InternalOptimind.g:4569:1: ( () )
            {
            // InternalOptimind.g:4569:1: ( () )
            // InternalOptimind.g:4570:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalOptimind.g:4571:2: ()
            // InternalOptimind.g:4571:3: 
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
    // InternalOptimind.g:4579:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4583:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalOptimind.g:4584:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalOptimind.g:4591:1: rule__Input__Group__1__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4595:1: ( ( 'Input' ) )
            // InternalOptimind.g:4596:1: ( 'Input' )
            {
            // InternalOptimind.g:4596:1: ( 'Input' )
            // InternalOptimind.g:4597:2: 'Input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalOptimind.g:4606:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4610:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalOptimind.g:4611:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalOptimind.g:4618:1: rule__Input__Group__2__Impl : ( ( rule__Input__NameAssignment_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4622:1: ( ( ( rule__Input__NameAssignment_2 ) ) )
            // InternalOptimind.g:4623:1: ( ( rule__Input__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4623:1: ( ( rule__Input__NameAssignment_2 ) )
            // InternalOptimind.g:4624:2: ( rule__Input__NameAssignment_2 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4625:2: ( rule__Input__NameAssignment_2 )
            // InternalOptimind.g:4625:3: rule__Input__NameAssignment_2
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
    // InternalOptimind.g:4633:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4637:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalOptimind.g:4638:2: rule__Input__Group__3__Impl rule__Input__Group__4
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
    // InternalOptimind.g:4645:1: rule__Input__Group__3__Impl : ( ( rule__Input__Group_3__0 )? ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4649:1: ( ( ( rule__Input__Group_3__0 )? ) )
            // InternalOptimind.g:4650:1: ( ( rule__Input__Group_3__0 )? )
            {
            // InternalOptimind.g:4650:1: ( ( rule__Input__Group_3__0 )? )
            // InternalOptimind.g:4651:2: ( rule__Input__Group_3__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_3()); 
            // InternalOptimind.g:4652:2: ( rule__Input__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOptimind.g:4652:3: rule__Input__Group_3__0
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
    // InternalOptimind.g:4660:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4664:1: ( rule__Input__Group__4__Impl )
            // InternalOptimind.g:4665:2: rule__Input__Group__4__Impl
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
    // InternalOptimind.g:4671:1: rule__Input__Group__4__Impl : ( ( rule__Input__Group_4__0 )? ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4675:1: ( ( ( rule__Input__Group_4__0 )? ) )
            // InternalOptimind.g:4676:1: ( ( rule__Input__Group_4__0 )? )
            {
            // InternalOptimind.g:4676:1: ( ( rule__Input__Group_4__0 )? )
            // InternalOptimind.g:4677:2: ( rule__Input__Group_4__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_4()); 
            // InternalOptimind.g:4678:2: ( rule__Input__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOptimind.g:4678:3: rule__Input__Group_4__0
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
    // InternalOptimind.g:4687:1: rule__Input__Group_3__0 : rule__Input__Group_3__0__Impl rule__Input__Group_3__1 ;
    public final void rule__Input__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4691:1: ( rule__Input__Group_3__0__Impl rule__Input__Group_3__1 )
            // InternalOptimind.g:4692:2: rule__Input__Group_3__0__Impl rule__Input__Group_3__1
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
    // InternalOptimind.g:4699:1: rule__Input__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Input__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4703:1: ( ( 'type' ) )
            // InternalOptimind.g:4704:1: ( 'type' )
            {
            // InternalOptimind.g:4704:1: ( 'type' )
            // InternalOptimind.g:4705:2: 'type'
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
    // InternalOptimind.g:4714:1: rule__Input__Group_3__1 : rule__Input__Group_3__1__Impl ;
    public final void rule__Input__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4718:1: ( rule__Input__Group_3__1__Impl )
            // InternalOptimind.g:4719:2: rule__Input__Group_3__1__Impl
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
    // InternalOptimind.g:4725:1: rule__Input__Group_3__1__Impl : ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Input__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4729:1: ( ( ( rule__Input__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4730:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4730:1: ( ( rule__Input__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4731:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getInputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4732:2: ( rule__Input__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4732:3: rule__Input__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:4741:1: rule__Input__Group_4__0 : rule__Input__Group_4__0__Impl rule__Input__Group_4__1 ;
    public final void rule__Input__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4745:1: ( rule__Input__Group_4__0__Impl rule__Input__Group_4__1 )
            // InternalOptimind.g:4746:2: rule__Input__Group_4__0__Impl rule__Input__Group_4__1
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
    // InternalOptimind.g:4753:1: rule__Input__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Input__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4757:1: ( ( 'value' ) )
            // InternalOptimind.g:4758:1: ( 'value' )
            {
            // InternalOptimind.g:4758:1: ( 'value' )
            // InternalOptimind.g:4759:2: 'value'
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
    // InternalOptimind.g:4768:1: rule__Input__Group_4__1 : rule__Input__Group_4__1__Impl ;
    public final void rule__Input__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4772:1: ( rule__Input__Group_4__1__Impl )
            // InternalOptimind.g:4773:2: rule__Input__Group_4__1__Impl
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
    // InternalOptimind.g:4779:1: rule__Input__Group_4__1__Impl : ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Input__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4783:1: ( ( ( rule__Input__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:4784:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:4784:1: ( ( rule__Input__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:4785:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getInputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:4786:2: ( rule__Input__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:4786:3: rule__Input__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:4795:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4799:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalOptimind.g:4800:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalOptimind.g:4807:1: rule__Output__Group__0__Impl : ( () ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4811:1: ( ( () ) )
            // InternalOptimind.g:4812:1: ( () )
            {
            // InternalOptimind.g:4812:1: ( () )
            // InternalOptimind.g:4813:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_0()); 
            // InternalOptimind.g:4814:2: ()
            // InternalOptimind.g:4814:3: 
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
    // InternalOptimind.g:4822:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4826:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalOptimind.g:4827:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalOptimind.g:4834:1: rule__Output__Group__1__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4838:1: ( ( 'Output' ) )
            // InternalOptimind.g:4839:1: ( 'Output' )
            {
            // InternalOptimind.g:4839:1: ( 'Output' )
            // InternalOptimind.g:4840:2: 'Output'
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
    // InternalOptimind.g:4849:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4853:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalOptimind.g:4854:2: rule__Output__Group__2__Impl rule__Output__Group__3
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
    // InternalOptimind.g:4861:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4865:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalOptimind.g:4866:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalOptimind.g:4866:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalOptimind.g:4867:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalOptimind.g:4868:2: ( rule__Output__NameAssignment_2 )
            // InternalOptimind.g:4868:3: rule__Output__NameAssignment_2
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
    // InternalOptimind.g:4876:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4880:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalOptimind.g:4881:2: rule__Output__Group__3__Impl rule__Output__Group__4
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
    // InternalOptimind.g:4888:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4892:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalOptimind.g:4893:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalOptimind.g:4893:1: ( ( rule__Output__Group_3__0 )? )
            // InternalOptimind.g:4894:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalOptimind.g:4895:2: ( rule__Output__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOptimind.g:4895:3: rule__Output__Group_3__0
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
    // InternalOptimind.g:4903:1: rule__Output__Group__4 : rule__Output__Group__4__Impl ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4907:1: ( rule__Output__Group__4__Impl )
            // InternalOptimind.g:4908:2: rule__Output__Group__4__Impl
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
    // InternalOptimind.g:4914:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4918:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalOptimind.g:4919:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalOptimind.g:4919:1: ( ( rule__Output__Group_4__0 )? )
            // InternalOptimind.g:4920:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalOptimind.g:4921:2: ( rule__Output__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOptimind.g:4921:3: rule__Output__Group_4__0
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
    // InternalOptimind.g:4930:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4934:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalOptimind.g:4935:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
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
    // InternalOptimind.g:4942:1: rule__Output__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4946:1: ( ( 'type' ) )
            // InternalOptimind.g:4947:1: ( 'type' )
            {
            // InternalOptimind.g:4947:1: ( 'type' )
            // InternalOptimind.g:4948:2: 'type'
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
    // InternalOptimind.g:4957:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4961:1: ( rule__Output__Group_3__1__Impl )
            // InternalOptimind.g:4962:2: rule__Output__Group_3__1__Impl
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
    // InternalOptimind.g:4968:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4972:1: ( ( ( rule__Output__TypeAsStringAssignment_3_1 ) ) )
            // InternalOptimind.g:4973:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            {
            // InternalOptimind.g:4973:1: ( ( rule__Output__TypeAsStringAssignment_3_1 ) )
            // InternalOptimind.g:4974:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getTypeAsStringAssignment_3_1()); 
            // InternalOptimind.g:4975:2: ( rule__Output__TypeAsStringAssignment_3_1 )
            // InternalOptimind.g:4975:3: rule__Output__TypeAsStringAssignment_3_1
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
    // InternalOptimind.g:4984:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:4988:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalOptimind.g:4989:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
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
    // InternalOptimind.g:4996:1: rule__Output__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5000:1: ( ( 'value' ) )
            // InternalOptimind.g:5001:1: ( 'value' )
            {
            // InternalOptimind.g:5001:1: ( 'value' )
            // InternalOptimind.g:5002:2: 'value'
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
    // InternalOptimind.g:5011:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5015:1: ( rule__Output__Group_4__1__Impl )
            // InternalOptimind.g:5016:2: rule__Output__Group_4__1__Impl
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
    // InternalOptimind.g:5022:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5026:1: ( ( ( rule__Output__ValueAsStringAssignment_4_1 ) ) )
            // InternalOptimind.g:5027:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            {
            // InternalOptimind.g:5027:1: ( ( rule__Output__ValueAsStringAssignment_4_1 ) )
            // InternalOptimind.g:5028:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            {
             before(grammarAccess.getOutputAccess().getValueAsStringAssignment_4_1()); 
            // InternalOptimind.g:5029:2: ( rule__Output__ValueAsStringAssignment_4_1 )
            // InternalOptimind.g:5029:3: rule__Output__ValueAsStringAssignment_4_1
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
    // InternalOptimind.g:5038:1: rule__Workflow__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Workflow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5042:1: ( ( ruleEString ) )
            // InternalOptimind.g:5043:2: ( ruleEString )
            {
            // InternalOptimind.g:5043:2: ( ruleEString )
            // InternalOptimind.g:5044:3: ruleEString
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
    // InternalOptimind.g:5053:1: rule__Workflow__LanguageAssignment_4_1 : ( ruleProgLanguage ) ;
    public final void rule__Workflow__LanguageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5057:1: ( ( ruleProgLanguage ) )
            // InternalOptimind.g:5058:2: ( ruleProgLanguage )
            {
            // InternalOptimind.g:5058:2: ( ruleProgLanguage )
            // InternalOptimind.g:5059:3: ruleProgLanguage
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
    // InternalOptimind.g:5068:1: rule__Workflow__BaseTaskAssignment_5 : ( ruleBaseTask ) ;
    public final void rule__Workflow__BaseTaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5072:1: ( ( ruleBaseTask ) )
            // InternalOptimind.g:5073:2: ( ruleBaseTask )
            {
            // InternalOptimind.g:5073:2: ( ruleBaseTask )
            // InternalOptimind.g:5074:3: ruleBaseTask
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
    // InternalOptimind.g:5083:1: rule__Workflow__FunctionsAssignment_6_0 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5087:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5088:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5088:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5089:3: ruleLibraryFunction
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
    // InternalOptimind.g:5098:1: rule__Workflow__FunctionsAssignment_6_1 : ( ruleLibraryFunction ) ;
    public final void rule__Workflow__FunctionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5102:1: ( ( ruleLibraryFunction ) )
            // InternalOptimind.g:5103:2: ( ruleLibraryFunction )
            {
            // InternalOptimind.g:5103:2: ( ruleLibraryFunction )
            // InternalOptimind.g:5104:3: ruleLibraryFunction
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
    // InternalOptimind.g:5113:1: rule__TaskOutput__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TaskOutput__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5117:1: ( ( ruleEString ) )
            // InternalOptimind.g:5118:2: ( ruleEString )
            {
            // InternalOptimind.g:5118:2: ( ruleEString )
            // InternalOptimind.g:5119:3: ruleEString
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
    // InternalOptimind.g:5128:1: rule__TaskOutput__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__TaskOutput__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5132:1: ( ( ruleType ) )
            // InternalOptimind.g:5133:2: ( ruleType )
            {
            // InternalOptimind.g:5133:2: ( ruleType )
            // InternalOptimind.g:5134:3: ruleType
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
    // InternalOptimind.g:5143:1: rule__TaskOutput__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TaskOutput__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5147:1: ( ( ruleEString ) )
            // InternalOptimind.g:5148:2: ( ruleEString )
            {
            // InternalOptimind.g:5148:2: ( ruleEString )
            // InternalOptimind.g:5149:3: ruleEString
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
    // InternalOptimind.g:5158:1: rule__For__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__For__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5162:1: ( ( ruleEString ) )
            // InternalOptimind.g:5163:2: ( ruleEString )
            {
            // InternalOptimind.g:5163:2: ( ruleEString )
            // InternalOptimind.g:5164:3: ruleEString
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
    // InternalOptimind.g:5173:1: rule__For__FromAssignment_5 : ( ruleEInt ) ;
    public final void rule__For__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5177:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5178:2: ( ruleEInt )
            {
            // InternalOptimind.g:5178:2: ( ruleEInt )
            // InternalOptimind.g:5179:3: ruleEInt
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
    // InternalOptimind.g:5188:1: rule__For__ToAssignment_7 : ( ruleEInt ) ;
    public final void rule__For__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5192:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5193:2: ( ruleEInt )
            {
            // InternalOptimind.g:5193:2: ( ruleEInt )
            // InternalOptimind.g:5194:3: ruleEInt
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
    // InternalOptimind.g:5203:1: rule__For__IncrementAssignment_9 : ( ruleEInt ) ;
    public final void rule__For__IncrementAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5207:1: ( ( ruleEInt ) )
            // InternalOptimind.g:5208:2: ( ruleEInt )
            {
            // InternalOptimind.g:5208:2: ( ruleEInt )
            // InternalOptimind.g:5209:3: ruleEInt
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
    // InternalOptimind.g:5218:1: rule__For__AbstracttaskAssignment_11 : ( ruleAbstractTask ) ;
    public final void rule__For__AbstracttaskAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5222:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5223:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5223:2: ( ruleAbstractTask )
            // InternalOptimind.g:5224:3: ruleAbstractTask
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
    // InternalOptimind.g:5233:1: rule__While__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__While__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5237:1: ( ( ruleEString ) )
            // InternalOptimind.g:5238:2: ( ruleEString )
            {
            // InternalOptimind.g:5238:2: ( ruleEString )
            // InternalOptimind.g:5239:3: ruleEString
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


    // $ANTLR start "rule__While__AbstracttaskAssignment_5"
    // InternalOptimind.g:5248:1: rule__While__AbstracttaskAssignment_5 : ( ruleAbstractTask ) ;
    public final void rule__While__AbstracttaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5252:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5253:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5253:2: ( ruleAbstractTask )
            // InternalOptimind.g:5254:3: ruleAbstractTask
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


    // $ANTLR start "rule__If__NameAssignment_2"
    // InternalOptimind.g:5263:1: rule__If__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__If__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5267:1: ( ( ruleEString ) )
            // InternalOptimind.g:5268:2: ( ruleEString )
            {
            // InternalOptimind.g:5268:2: ( ruleEString )
            // InternalOptimind.g:5269:3: ruleEString
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


    // $ANTLR start "rule__If__ThenAssignment_5"
    // InternalOptimind.g:5278:1: rule__If__ThenAssignment_5 : ( ruleAbstractTask ) ;
    public final void rule__If__ThenAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5282:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5283:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5283:2: ( ruleAbstractTask )
            // InternalOptimind.g:5284:3: ruleAbstractTask
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
    // InternalOptimind.g:5293:1: rule__If__ElseAssignment_6_1 : ( ruleAbstractTask ) ;
    public final void rule__If__ElseAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5297:1: ( ( ruleAbstractTask ) )
            // InternalOptimind.g:5298:2: ( ruleAbstractTask )
            {
            // InternalOptimind.g:5298:2: ( ruleAbstractTask )
            // InternalOptimind.g:5299:3: ruleAbstractTask
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
    // InternalOptimind.g:5308:1: rule__BaseTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BaseTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5312:1: ( ( ruleEString ) )
            // InternalOptimind.g:5313:2: ( ruleEString )
            {
            // InternalOptimind.g:5313:2: ( ruleEString )
            // InternalOptimind.g:5314:3: ruleEString
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
    // InternalOptimind.g:5323:1: rule__BaseTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__BaseTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5327:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5328:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5328:2: ( ruleTaskStatus )
            // InternalOptimind.g:5329:3: ruleTaskStatus
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
    // InternalOptimind.g:5338:1: rule__BaseTask__InputsAssignment_5_2 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5342:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5343:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5343:2: ( ruleTaskInput )
            // InternalOptimind.g:5344:3: ruleTaskInput
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
    // InternalOptimind.g:5353:1: rule__BaseTask__InputsAssignment_5_3_1 : ( ruleTaskInput ) ;
    public final void rule__BaseTask__InputsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5357:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5358:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5358:2: ( ruleTaskInput )
            // InternalOptimind.g:5359:3: ruleTaskInput
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
    // InternalOptimind.g:5368:1: rule__BaseTask__OutputsAssignment_6_2 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5372:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5373:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5373:2: ( ruleTaskOutput )
            // InternalOptimind.g:5374:3: ruleTaskOutput
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
    // InternalOptimind.g:5383:1: rule__BaseTask__OutputsAssignment_6_3_1 : ( ruleTaskOutput ) ;
    public final void rule__BaseTask__OutputsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5387:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5388:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5388:2: ( ruleTaskOutput )
            // InternalOptimind.g:5389:3: ruleTaskOutput
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
    // InternalOptimind.g:5398:1: rule__BaseTask__ChildrenAssignment_7_0 : ( ( rule__BaseTask__ChildrenAlternatives_7_0_0 ) ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5402:1: ( ( ( rule__BaseTask__ChildrenAlternatives_7_0_0 ) ) )
            // InternalOptimind.g:5403:2: ( ( rule__BaseTask__ChildrenAlternatives_7_0_0 ) )
            {
            // InternalOptimind.g:5403:2: ( ( rule__BaseTask__ChildrenAlternatives_7_0_0 ) )
            // InternalOptimind.g:5404:3: ( rule__BaseTask__ChildrenAlternatives_7_0_0 )
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_0_0()); 
            // InternalOptimind.g:5405:3: ( rule__BaseTask__ChildrenAlternatives_7_0_0 )
            // InternalOptimind.g:5405:4: rule__BaseTask__ChildrenAlternatives_7_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__ChildrenAlternatives_7_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_0_0()); 

            }


            }

        }
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
    // InternalOptimind.g:5413:1: rule__BaseTask__ChildrenAssignment_7_1 : ( ( rule__BaseTask__ChildrenAlternatives_7_1_0 ) ) ;
    public final void rule__BaseTask__ChildrenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5417:1: ( ( ( rule__BaseTask__ChildrenAlternatives_7_1_0 ) ) )
            // InternalOptimind.g:5418:2: ( ( rule__BaseTask__ChildrenAlternatives_7_1_0 ) )
            {
            // InternalOptimind.g:5418:2: ( ( rule__BaseTask__ChildrenAlternatives_7_1_0 ) )
            // InternalOptimind.g:5419:3: ( rule__BaseTask__ChildrenAlternatives_7_1_0 )
            {
             before(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_1_0()); 
            // InternalOptimind.g:5420:3: ( rule__BaseTask__ChildrenAlternatives_7_1_0 )
            // InternalOptimind.g:5420:4: rule__BaseTask__ChildrenAlternatives_7_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BaseTask__ChildrenAlternatives_7_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBaseTaskAccess().getChildrenAlternatives_7_1_0()); 

            }


            }

        }
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
    // InternalOptimind.g:5428:1: rule__LibraryTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5432:1: ( ( ruleEString ) )
            // InternalOptimind.g:5433:2: ( ruleEString )
            {
            // InternalOptimind.g:5433:2: ( ruleEString )
            // InternalOptimind.g:5434:3: ruleEString
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
    // InternalOptimind.g:5443:1: rule__LibraryTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__LibraryTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5447:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5448:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5448:2: ( ruleTaskStatus )
            // InternalOptimind.g:5449:3: ruleTaskStatus
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
    // InternalOptimind.g:5458:1: rule__LibraryTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5462:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5463:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5463:2: ( ruleTaskInput )
            // InternalOptimind.g:5464:3: ruleTaskInput
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
    // InternalOptimind.g:5473:1: rule__LibraryTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__LibraryTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5477:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5478:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5478:2: ( ruleTaskInput )
            // InternalOptimind.g:5479:3: ruleTaskInput
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
    // InternalOptimind.g:5488:1: rule__LibraryTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5492:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5493:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5493:2: ( ruleTaskOutput )
            // InternalOptimind.g:5494:3: ruleTaskOutput
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
    // InternalOptimind.g:5503:1: rule__LibraryTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__LibraryTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5507:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5508:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5508:2: ( ruleTaskOutput )
            // InternalOptimind.g:5509:3: ruleTaskOutput
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
    // InternalOptimind.g:5518:1: rule__LibraryTask__LibraryfunctionAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__LibraryTask__LibraryfunctionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5522:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5523:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5523:2: ( ( ruleEString ) )
            // InternalOptimind.g:5524:3: ( ruleEString )
            {
             before(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0()); 
            // InternalOptimind.g:5525:3: ( ruleEString )
            // InternalOptimind.g:5526:4: ruleEString
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
    // InternalOptimind.g:5537:1: rule__CustomTask__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CustomTask__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5541:1: ( ( ruleEString ) )
            // InternalOptimind.g:5542:2: ( ruleEString )
            {
            // InternalOptimind.g:5542:2: ( ruleEString )
            // InternalOptimind.g:5543:3: ruleEString
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
    // InternalOptimind.g:5552:1: rule__CustomTask__StatusAssignment_4_1 : ( ruleTaskStatus ) ;
    public final void rule__CustomTask__StatusAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5556:1: ( ( ruleTaskStatus ) )
            // InternalOptimind.g:5557:2: ( ruleTaskStatus )
            {
            // InternalOptimind.g:5557:2: ( ruleTaskStatus )
            // InternalOptimind.g:5558:3: ruleTaskStatus
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
    // InternalOptimind.g:5567:1: rule__CustomTask__InputsAssignment_5_0 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5571:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5572:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5572:2: ( ruleTaskInput )
            // InternalOptimind.g:5573:3: ruleTaskInput
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
    // InternalOptimind.g:5582:1: rule__CustomTask__InputsAssignment_5_1 : ( ruleTaskInput ) ;
    public final void rule__CustomTask__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5586:1: ( ( ruleTaskInput ) )
            // InternalOptimind.g:5587:2: ( ruleTaskInput )
            {
            // InternalOptimind.g:5587:2: ( ruleTaskInput )
            // InternalOptimind.g:5588:3: ruleTaskInput
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
    // InternalOptimind.g:5597:1: rule__CustomTask__OutputsAssignment_6_0 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5601:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5602:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5602:2: ( ruleTaskOutput )
            // InternalOptimind.g:5603:3: ruleTaskOutput
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
    // InternalOptimind.g:5612:1: rule__CustomTask__OutputsAssignment_6_1 : ( ruleTaskOutput ) ;
    public final void rule__CustomTask__OutputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5616:1: ( ( ruleTaskOutput ) )
            // InternalOptimind.g:5617:2: ( ruleTaskOutput )
            {
            // InternalOptimind.g:5617:2: ( ruleTaskOutput )
            // InternalOptimind.g:5618:3: ruleTaskOutput
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
    // InternalOptimind.g:5627:1: rule__CustomTask__RunnerAssignment_7_1 : ( ruleEString ) ;
    public final void rule__CustomTask__RunnerAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5631:1: ( ( ruleEString ) )
            // InternalOptimind.g:5632:2: ( ruleEString )
            {
            // InternalOptimind.g:5632:2: ( ruleEString )
            // InternalOptimind.g:5633:3: ruleEString
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
    // InternalOptimind.g:5642:1: rule__Setter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Setter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5646:1: ( ( ruleEString ) )
            // InternalOptimind.g:5647:2: ( ruleEString )
            {
            // InternalOptimind.g:5647:2: ( ruleEString )
            // InternalOptimind.g:5648:3: ruleEString
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
    // InternalOptimind.g:5657:1: rule__Setter__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Setter__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5661:1: ( ( ruleType ) )
            // InternalOptimind.g:5662:2: ( ruleType )
            {
            // InternalOptimind.g:5662:2: ( ruleType )
            // InternalOptimind.g:5663:3: ruleType
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
    // InternalOptimind.g:5672:1: rule__Setter__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Setter__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5676:1: ( ( ruleEString ) )
            // InternalOptimind.g:5677:2: ( ruleEString )
            {
            // InternalOptimind.g:5677:2: ( ruleEString )
            // InternalOptimind.g:5678:3: ruleEString
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
    // InternalOptimind.g:5687:1: rule__Connection__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Connection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5691:1: ( ( ruleEString ) )
            // InternalOptimind.g:5692:2: ( ruleEString )
            {
            // InternalOptimind.g:5692:2: ( ruleEString )
            // InternalOptimind.g:5693:3: ruleEString
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
    // InternalOptimind.g:5702:1: rule__Connection__TaskoutputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Connection__TaskoutputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5706:1: ( ( ( ruleEString ) ) )
            // InternalOptimind.g:5707:2: ( ( ruleEString ) )
            {
            // InternalOptimind.g:5707:2: ( ( ruleEString ) )
            // InternalOptimind.g:5708:3: ( ruleEString )
            {
             before(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0()); 
            // InternalOptimind.g:5709:3: ( ruleEString )
            // InternalOptimind.g:5710:4: ruleEString
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
    // InternalOptimind.g:5721:1: rule__LibraryFunction__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LibraryFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5725:1: ( ( ruleEString ) )
            // InternalOptimind.g:5726:2: ( ruleEString )
            {
            // InternalOptimind.g:5726:2: ( ruleEString )
            // InternalOptimind.g:5727:3: ruleEString
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
    // InternalOptimind.g:5736:1: rule__LibraryFunction__FunctionAssignment_5 : ( ruleEString ) ;
    public final void rule__LibraryFunction__FunctionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5740:1: ( ( ruleEString ) )
            // InternalOptimind.g:5741:2: ( ruleEString )
            {
            // InternalOptimind.g:5741:2: ( ruleEString )
            // InternalOptimind.g:5742:3: ruleEString
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
    // InternalOptimind.g:5751:1: rule__LibraryFunction__InputsAssignment_6_0 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5755:1: ( ( ruleInput ) )
            // InternalOptimind.g:5756:2: ( ruleInput )
            {
            // InternalOptimind.g:5756:2: ( ruleInput )
            // InternalOptimind.g:5757:3: ruleInput
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
    // InternalOptimind.g:5766:1: rule__LibraryFunction__InputsAssignment_6_1 : ( ruleInput ) ;
    public final void rule__LibraryFunction__InputsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5770:1: ( ( ruleInput ) )
            // InternalOptimind.g:5771:2: ( ruleInput )
            {
            // InternalOptimind.g:5771:2: ( ruleInput )
            // InternalOptimind.g:5772:3: ruleInput
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
    // InternalOptimind.g:5781:1: rule__LibraryFunction__OutputsAssignment_7_0 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5785:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5786:2: ( ruleOutput )
            {
            // InternalOptimind.g:5786:2: ( ruleOutput )
            // InternalOptimind.g:5787:3: ruleOutput
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
    // InternalOptimind.g:5796:1: rule__LibraryFunction__OutputsAssignment_7_1 : ( ruleOutput ) ;
    public final void rule__LibraryFunction__OutputsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5800:1: ( ( ruleOutput ) )
            // InternalOptimind.g:5801:2: ( ruleOutput )
            {
            // InternalOptimind.g:5801:2: ( ruleOutput )
            // InternalOptimind.g:5802:3: ruleOutput
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
    // InternalOptimind.g:5811:1: rule__Input__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Input__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5815:1: ( ( ruleEString ) )
            // InternalOptimind.g:5816:2: ( ruleEString )
            {
            // InternalOptimind.g:5816:2: ( ruleEString )
            // InternalOptimind.g:5817:3: ruleEString
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
    // InternalOptimind.g:5826:1: rule__Input__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Input__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5830:1: ( ( ruleType ) )
            // InternalOptimind.g:5831:2: ( ruleType )
            {
            // InternalOptimind.g:5831:2: ( ruleType )
            // InternalOptimind.g:5832:3: ruleType
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
    // InternalOptimind.g:5841:1: rule__Input__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Input__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5845:1: ( ( ruleEString ) )
            // InternalOptimind.g:5846:2: ( ruleEString )
            {
            // InternalOptimind.g:5846:2: ( ruleEString )
            // InternalOptimind.g:5847:3: ruleEString
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
    // InternalOptimind.g:5856:1: rule__Output__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5860:1: ( ( ruleEString ) )
            // InternalOptimind.g:5861:2: ( ruleEString )
            {
            // InternalOptimind.g:5861:2: ( ruleEString )
            // InternalOptimind.g:5862:3: ruleEString
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
    // InternalOptimind.g:5871:1: rule__Output__TypeAsStringAssignment_3_1 : ( ruleType ) ;
    public final void rule__Output__TypeAsStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5875:1: ( ( ruleType ) )
            // InternalOptimind.g:5876:2: ( ruleType )
            {
            // InternalOptimind.g:5876:2: ( ruleType )
            // InternalOptimind.g:5877:3: ruleType
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
    // InternalOptimind.g:5886:1: rule__Output__ValueAsStringAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Output__ValueAsStringAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOptimind.g:5890:1: ( ( ruleEString ) )
            // InternalOptimind.g:5891:2: ( ruleEString )
            {
            // InternalOptimind.g:5891:2: ( ruleEString )
            // InternalOptimind.g:5892:3: ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100200180000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000014200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000016E61080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000014261000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000014261000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C8400280000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000E0400280000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000280000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000002L});

}