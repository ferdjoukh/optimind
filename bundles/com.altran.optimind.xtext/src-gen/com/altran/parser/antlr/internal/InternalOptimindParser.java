package com.altran.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.services.OptimindGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptimindParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Workflow'", "'{'", "'Language'", "'}'", "'Output'", "'type'", "'value'", "'For'", "'from'", "'to'", "'increment'", "'do'", "'While'", "'condition'", "'If'", "'then'", "'else'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'LibraryFunction'", "'function'", "'Input'", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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

        public InternalOptimindParser(TokenStream input, OptimindGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Workflow";
       	}

       	@Override
       	protected OptimindGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorkflow"
    // InternalOptimind.g:65:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalOptimind.g:65:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalOptimind.g:66:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalOptimind.g:72:1: ruleWorkflow returns [EObject current=null] : ( () otherlv_1= 'Workflow' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )? ( (lv_baseTask_6_0= ruleBaseTask ) )? ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_language_5_0 = null;

        EObject lv_baseTask_6_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_functions_8_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:78:2: ( ( () otherlv_1= 'Workflow' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )? ( (lv_baseTask_6_0= ruleBaseTask ) )? ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )? otherlv_9= '}' ) )
            // InternalOptimind.g:79:2: ( () otherlv_1= 'Workflow' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )? ( (lv_baseTask_6_0= ruleBaseTask ) )? ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )? otherlv_9= '}' )
            {
            // InternalOptimind.g:79:2: ( () otherlv_1= 'Workflow' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )? ( (lv_baseTask_6_0= ruleBaseTask ) )? ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )? otherlv_9= '}' )
            // InternalOptimind.g:80:3: () otherlv_1= 'Workflow' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )? ( (lv_baseTask_6_0= ruleBaseTask ) )? ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )? otherlv_9= '}'
            {
            // InternalOptimind.g:80:3: ()
            // InternalOptimind.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflowAccess().getWorkflowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowAccess().getWorkflowKeyword_1());
            		
            // InternalOptimind.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:92:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkflowAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkflowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:114:3: (otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOptimind.g:115:4: otherlv_4= 'Language' ( (lv_language_5_0= ruleProgLanguage ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getLanguageKeyword_4_0());
                    			
                    // InternalOptimind.g:119:4: ( (lv_language_5_0= ruleProgLanguage ) )
                    // InternalOptimind.g:120:5: (lv_language_5_0= ruleProgLanguage )
                    {
                    // InternalOptimind.g:120:5: (lv_language_5_0= ruleProgLanguage )
                    // InternalOptimind.g:121:6: lv_language_5_0= ruleProgLanguage
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getLanguageProgLanguageEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_language_5_0=ruleProgLanguage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						set(
                    							current,
                    							"language",
                    							lv_language_5_0,
                    							"com.altran.Optimind.ProgLanguage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:139:3: ( (lv_baseTask_6_0= ruleBaseTask ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimind.g:140:4: (lv_baseTask_6_0= ruleBaseTask )
                    {
                    // InternalOptimind.g:140:4: (lv_baseTask_6_0= ruleBaseTask )
                    // InternalOptimind.g:141:5: lv_baseTask_6_0= ruleBaseTask
                    {

                    					newCompositeNode(grammarAccess.getWorkflowAccess().getBaseTaskBaseTaskParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_baseTask_6_0=ruleBaseTask();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    					}
                    					set(
                    						current,
                    						"baseTask",
                    						lv_baseTask_6_0,
                    						"com.altran.Optimind.BaseTask");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOptimind.g:158:3: ( ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalOptimind.g:159:4: ( (lv_functions_7_0= ruleLibraryFunction ) ) ( (lv_functions_8_0= ruleLibraryFunction ) )*
                    {
                    // InternalOptimind.g:159:4: ( (lv_functions_7_0= ruleLibraryFunction ) )
                    // InternalOptimind.g:160:5: (lv_functions_7_0= ruleLibraryFunction )
                    {
                    // InternalOptimind.g:160:5: (lv_functions_7_0= ruleLibraryFunction )
                    // InternalOptimind.g:161:6: lv_functions_7_0= ruleLibraryFunction
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_functions_7_0=ruleLibraryFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						add(
                    							current,
                    							"functions",
                    							lv_functions_7_0,
                    							"com.altran.Optimind.LibraryFunction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:178:4: ( (lv_functions_8_0= ruleLibraryFunction ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==39) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalOptimind.g:179:5: (lv_functions_8_0= ruleLibraryFunction )
                    	    {
                    	    // InternalOptimind.g:179:5: (lv_functions_8_0= ruleLibraryFunction )
                    	    // InternalOptimind.g:180:6: lv_functions_8_0= ruleLibraryFunction
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkflowAccess().getFunctionsLibraryFunctionParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_functions_8_0=ruleLibraryFunction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"functions",
                    	    							lv_functions_8_0,
                    	    							"com.altran.Optimind.LibraryFunction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleAbstractTask"
    // InternalOptimind.g:206:1: entryRuleAbstractTask returns [EObject current=null] : iv_ruleAbstractTask= ruleAbstractTask EOF ;
    public final EObject entryRuleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTask = null;


        try {
            // InternalOptimind.g:206:53: (iv_ruleAbstractTask= ruleAbstractTask EOF )
            // InternalOptimind.g:207:2: iv_ruleAbstractTask= ruleAbstractTask EOF
            {
             newCompositeNode(grammarAccess.getAbstractTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTask=ruleAbstractTask();

            state._fsp--;

             current =iv_ruleAbstractTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractTask"


    // $ANTLR start "ruleAbstractTask"
    // InternalOptimind.g:213:1: ruleAbstractTask returns [EObject current=null] : (this_BaseTask_0= ruleBaseTask | this_LibraryTask_1= ruleLibraryTask | this_CustomTask_2= ruleCustomTask ) ;
    public final EObject ruleAbstractTask() throws RecognitionException {
        EObject current = null;

        EObject this_BaseTask_0 = null;

        EObject this_LibraryTask_1 = null;

        EObject this_CustomTask_2 = null;



        	enterRule();

        try {
            // InternalOptimind.g:219:2: ( (this_BaseTask_0= ruleBaseTask | this_LibraryTask_1= ruleLibraryTask | this_CustomTask_2= ruleCustomTask ) )
            // InternalOptimind.g:220:2: (this_BaseTask_0= ruleBaseTask | this_LibraryTask_1= ruleLibraryTask | this_CustomTask_2= ruleCustomTask )
            {
            // InternalOptimind.g:220:2: (this_BaseTask_0= ruleBaseTask | this_LibraryTask_1= ruleLibraryTask | this_CustomTask_2= ruleCustomTask )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 35:
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
                    // InternalOptimind.g:221:3: this_BaseTask_0= ruleBaseTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getBaseTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseTask_0=ruleBaseTask();

                    state._fsp--;


                    			current = this_BaseTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:230:3: this_LibraryTask_1= ruleLibraryTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getLibraryTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LibraryTask_1=ruleLibraryTask();

                    state._fsp--;


                    			current = this_LibraryTask_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimind.g:239:3: this_CustomTask_2= ruleCustomTask
                    {

                    			newCompositeNode(grammarAccess.getAbstractTaskAccess().getCustomTaskParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomTask_2=ruleCustomTask();

                    state._fsp--;


                    			current = this_CustomTask_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTask"


    // $ANTLR start "entryRuleTaskInput"
    // InternalOptimind.g:251:1: entryRuleTaskInput returns [EObject current=null] : iv_ruleTaskInput= ruleTaskInput EOF ;
    public final EObject entryRuleTaskInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskInput = null;


        try {
            // InternalOptimind.g:251:50: (iv_ruleTaskInput= ruleTaskInput EOF )
            // InternalOptimind.g:252:2: iv_ruleTaskInput= ruleTaskInput EOF
            {
             newCompositeNode(grammarAccess.getTaskInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskInput=ruleTaskInput();

            state._fsp--;

             current =iv_ruleTaskInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskInput"


    // $ANTLR start "ruleTaskInput"
    // InternalOptimind.g:258:1: ruleTaskInput returns [EObject current=null] : (this_Setter_0= ruleSetter | this_Connection_1= ruleConnection ) ;
    public final EObject ruleTaskInput() throws RecognitionException {
        EObject current = null;

        EObject this_Setter_0 = null;

        EObject this_Connection_1 = null;



        	enterRule();

        try {
            // InternalOptimind.g:264:2: ( (this_Setter_0= ruleSetter | this_Connection_1= ruleConnection ) )
            // InternalOptimind.g:265:2: (this_Setter_0= ruleSetter | this_Connection_1= ruleConnection )
            {
            // InternalOptimind.g:265:2: (this_Setter_0= ruleSetter | this_Connection_1= ruleConnection )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalOptimind.g:266:3: this_Setter_0= ruleSetter
                    {

                    			newCompositeNode(grammarAccess.getTaskInputAccess().getSetterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Setter_0=ruleSetter();

                    state._fsp--;


                    			current = this_Setter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:275:3: this_Connection_1= ruleConnection
                    {

                    			newCompositeNode(grammarAccess.getTaskInputAccess().getConnectionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connection_1=ruleConnection();

                    state._fsp--;


                    			current = this_Connection_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskInput"


    // $ANTLR start "entryRuleEString"
    // InternalOptimind.g:287:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOptimind.g:287:47: (iv_ruleEString= ruleEString EOF )
            // InternalOptimind.g:288:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOptimind.g:294:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOptimind.g:300:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOptimind.g:301:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOptimind.g:301:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptimind.g:302:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:310:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalOptimind.g:321:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalOptimind.g:321:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalOptimind.g:322:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalOptimind.g:328:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalOptimind.g:334:2: (this_INT_0= RULE_INT )
            // InternalOptimind.g:335:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleType"
    // InternalOptimind.g:345:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalOptimind.g:345:44: (iv_ruleType= ruleType EOF )
            // InternalOptimind.g:346:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalOptimind.g:352:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOptimind.g:358:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOptimind.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOptimind.g:359:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptimind.g:360:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:368:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getTypeAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTaskOutput"
    // InternalOptimind.g:379:1: entryRuleTaskOutput returns [EObject current=null] : iv_ruleTaskOutput= ruleTaskOutput EOF ;
    public final EObject entryRuleTaskOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskOutput = null;


        try {
            // InternalOptimind.g:379:51: (iv_ruleTaskOutput= ruleTaskOutput EOF )
            // InternalOptimind.g:380:2: iv_ruleTaskOutput= ruleTaskOutput EOF
            {
             newCompositeNode(grammarAccess.getTaskOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskOutput=ruleTaskOutput();

            state._fsp--;

             current =iv_ruleTaskOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskOutput"


    // $ANTLR start "ruleTaskOutput"
    // InternalOptimind.g:386:1: ruleTaskOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleTaskOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_typeAsString_4_0 = null;

        AntlrDatatypeRuleToken lv_valueAsString_6_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:392:2: ( ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:393:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:393:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:394:3: () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:394:3: ()
            // InternalOptimind.g:395:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskOutputAccess().getTaskOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskOutputAccess().getOutputKeyword_1());
            		
            // InternalOptimind.g:405:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:406:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:406:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:407:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTaskOutputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskOutputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:424:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:425:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskOutputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:429:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:430:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:430:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:431:6: lv_typeAsString_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getTaskOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_typeAsString_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskOutputRule());
                    						}
                    						set(
                    							current,
                    							"typeAsString",
                    							lv_typeAsString_4_0,
                    							"com.altran.Optimind.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:449:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimind.g:450:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskOutputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:454:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:455:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:455:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:456:6: lv_valueAsString_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTaskOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valueAsString_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskOutputRule());
                    						}
                    						set(
                    							current,
                    							"valueAsString",
                    							lv_valueAsString_6_0,
                    							"com.altran.Optimind.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskOutput"


    // $ANTLR start "entryRuleAbstractStatement"
    // InternalOptimind.g:478:1: entryRuleAbstractStatement returns [EObject current=null] : iv_ruleAbstractStatement= ruleAbstractStatement EOF ;
    public final EObject entryRuleAbstractStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractStatement = null;


        try {
            // InternalOptimind.g:478:58: (iv_ruleAbstractStatement= ruleAbstractStatement EOF )
            // InternalOptimind.g:479:2: iv_ruleAbstractStatement= ruleAbstractStatement EOF
            {
             newCompositeNode(grammarAccess.getAbstractStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractStatement=ruleAbstractStatement();

            state._fsp--;

             current =iv_ruleAbstractStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractStatement"


    // $ANTLR start "ruleAbstractStatement"
    // InternalOptimind.g:485:1: ruleAbstractStatement returns [EObject current=null] : (this_For_0= ruleFor | this_While_1= ruleWhile | this_If_2= ruleIf ) ;
    public final EObject ruleAbstractStatement() throws RecognitionException {
        EObject current = null;

        EObject this_For_0 = null;

        EObject this_While_1 = null;

        EObject this_If_2 = null;



        	enterRule();

        try {
            // InternalOptimind.g:491:2: ( (this_For_0= ruleFor | this_While_1= ruleWhile | this_If_2= ruleIf ) )
            // InternalOptimind.g:492:2: (this_For_0= ruleFor | this_While_1= ruleWhile | this_If_2= ruleIf )
            {
            // InternalOptimind.g:492:2: (this_For_0= ruleFor | this_While_1= ruleWhile | this_If_2= ruleIf )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOptimind.g:493:3: this_For_0= ruleFor
                    {

                    			newCompositeNode(grammarAccess.getAbstractStatementAccess().getForParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_For_0=ruleFor();

                    state._fsp--;


                    			current = this_For_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:502:3: this_While_1= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getAbstractStatementAccess().getWhileParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_1=ruleWhile();

                    state._fsp--;


                    			current = this_While_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimind.g:511:3: this_If_2= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getAbstractStatementAccess().getIfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;


                    			current = this_If_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractStatement"


    // $ANTLR start "entryRuleFor"
    // InternalOptimind.g:523:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalOptimind.g:523:44: (iv_ruleFor= ruleFor EOF )
            // InternalOptimind.g:524:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalOptimind.g:530:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'For' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_from_5_0= ruleEInt ) ) otherlv_6= 'to' ( (lv_to_7_0= ruleEInt ) ) otherlv_8= 'increment' ( (lv_increment_9_0= ruleEInt ) ) otherlv_10= 'do' ( (lv_abstracttask_11_0= ruleAbstractTask ) ) otherlv_12= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_from_5_0 = null;

        AntlrDatatypeRuleToken lv_to_7_0 = null;

        AntlrDatatypeRuleToken lv_increment_9_0 = null;

        EObject lv_abstracttask_11_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:536:2: ( ( () otherlv_1= 'For' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_from_5_0= ruleEInt ) ) otherlv_6= 'to' ( (lv_to_7_0= ruleEInt ) ) otherlv_8= 'increment' ( (lv_increment_9_0= ruleEInt ) ) otherlv_10= 'do' ( (lv_abstracttask_11_0= ruleAbstractTask ) ) otherlv_12= '}' ) )
            // InternalOptimind.g:537:2: ( () otherlv_1= 'For' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_from_5_0= ruleEInt ) ) otherlv_6= 'to' ( (lv_to_7_0= ruleEInt ) ) otherlv_8= 'increment' ( (lv_increment_9_0= ruleEInt ) ) otherlv_10= 'do' ( (lv_abstracttask_11_0= ruleAbstractTask ) ) otherlv_12= '}' )
            {
            // InternalOptimind.g:537:2: ( () otherlv_1= 'For' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_from_5_0= ruleEInt ) ) otherlv_6= 'to' ( (lv_to_7_0= ruleEInt ) ) otherlv_8= 'increment' ( (lv_increment_9_0= ruleEInt ) ) otherlv_10= 'do' ( (lv_abstracttask_11_0= ruleAbstractTask ) ) otherlv_12= '}' )
            // InternalOptimind.g:538:3: () otherlv_1= 'For' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_from_5_0= ruleEInt ) ) otherlv_6= 'to' ( (lv_to_7_0= ruleEInt ) ) otherlv_8= 'increment' ( (lv_increment_9_0= ruleEInt ) ) otherlv_10= 'do' ( (lv_abstracttask_11_0= ruleAbstractTask ) ) otherlv_12= '}'
            {
            // InternalOptimind.g:538:3: ()
            // InternalOptimind.g:539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForAccess().getForStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
            		
            // InternalOptimind.g:549:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:550:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:550:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:551:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getForAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getForAccess().getFromKeyword_4());
            		
            // InternalOptimind.g:576:3: ( (lv_from_5_0= ruleEInt ) )
            // InternalOptimind.g:577:4: (lv_from_5_0= ruleEInt )
            {
            // InternalOptimind.g:577:4: (lv_from_5_0= ruleEInt )
            // InternalOptimind.g:578:5: lv_from_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForAccess().getFromEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_from_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_5_0,
            						"com.altran.Optimind.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getForAccess().getToKeyword_6());
            		
            // InternalOptimind.g:599:3: ( (lv_to_7_0= ruleEInt ) )
            // InternalOptimind.g:600:4: (lv_to_7_0= ruleEInt )
            {
            // InternalOptimind.g:600:4: (lv_to_7_0= ruleEInt )
            // InternalOptimind.g:601:5: lv_to_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForAccess().getToEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_to_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_7_0,
            						"com.altran.Optimind.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getForAccess().getIncrementKeyword_8());
            		
            // InternalOptimind.g:622:3: ( (lv_increment_9_0= ruleEInt ) )
            // InternalOptimind.g:623:4: (lv_increment_9_0= ruleEInt )
            {
            // InternalOptimind.g:623:4: (lv_increment_9_0= ruleEInt )
            // InternalOptimind.g:624:5: lv_increment_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForAccess().getIncrementEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_15);
            lv_increment_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"increment",
            						lv_increment_9_0,
            						"com.altran.Optimind.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getForAccess().getDoKeyword_10());
            		
            // InternalOptimind.g:645:3: ( (lv_abstracttask_11_0= ruleAbstractTask ) )
            // InternalOptimind.g:646:4: (lv_abstracttask_11_0= ruleAbstractTask )
            {
            // InternalOptimind.g:646:4: (lv_abstracttask_11_0= ruleAbstractTask )
            // InternalOptimind.g:647:5: lv_abstracttask_11_0= ruleAbstractTask
            {

            					newCompositeNode(grammarAccess.getForAccess().getAbstracttaskAbstractTaskParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_abstracttask_11_0=ruleAbstractTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForRule());
            					}
            					set(
            						current,
            						"abstracttask",
            						lv_abstracttask_11_0,
            						"com.altran.Optimind.AbstractTask");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getForAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalOptimind.g:672:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalOptimind.g:672:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalOptimind.g:673:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalOptimind.g:679:1: ruleWhile returns [EObject current=null] : ( () otherlv_1= 'While' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'do' ( (lv_abstracttask_7_0= ruleAbstractTask ) ) otherlv_8= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_abstracttask_7_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:685:2: ( ( () otherlv_1= 'While' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'do' ( (lv_abstracttask_7_0= ruleAbstractTask ) ) otherlv_8= '}' ) )
            // InternalOptimind.g:686:2: ( () otherlv_1= 'While' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'do' ( (lv_abstracttask_7_0= ruleAbstractTask ) ) otherlv_8= '}' )
            {
            // InternalOptimind.g:686:2: ( () otherlv_1= 'While' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'do' ( (lv_abstracttask_7_0= ruleAbstractTask ) ) otherlv_8= '}' )
            // InternalOptimind.g:687:3: () otherlv_1= 'While' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'do' ( (lv_abstracttask_7_0= ruleAbstractTask ) ) otherlv_8= '}'
            {
            // InternalOptimind.g:687:3: ()
            // InternalOptimind.g:688:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhileAccess().getWhileStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getWhileKeyword_1());
            		
            // InternalOptimind.g:698:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:699:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:699:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:700:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getConditionKeyword_4());
            		
            // InternalOptimind.g:725:3: ( (lv_condition_5_0= ruleEString ) )
            // InternalOptimind.g:726:4: (lv_condition_5_0= ruleEString )
            {
            // InternalOptimind.g:726:4: (lv_condition_5_0= ruleEString )
            // InternalOptimind.g:727:5: lv_condition_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getConditionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_condition_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getDoKeyword_6());
            		
            // InternalOptimind.g:748:3: ( (lv_abstracttask_7_0= ruleAbstractTask ) )
            // InternalOptimind.g:749:4: (lv_abstracttask_7_0= ruleAbstractTask )
            {
            // InternalOptimind.g:749:4: (lv_abstracttask_7_0= ruleAbstractTask )
            // InternalOptimind.g:750:5: lv_abstracttask_7_0= ruleAbstractTask
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getAbstracttaskAbstractTaskParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_abstracttask_7_0=ruleAbstractTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"abstracttask",
            						lv_abstracttask_7_0,
            						"com.altran.Optimind.AbstractTask");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleIf"
    // InternalOptimind.g:775:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalOptimind.g:775:43: (iv_ruleIf= ruleIf EOF )
            // InternalOptimind.g:776:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalOptimind.g:782:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'If' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'then' ( (lv_then_7_0= ruleAbstractTask ) ) (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_then_7_0 = null;

        EObject lv_else_9_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:788:2: ( ( () otherlv_1= 'If' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'then' ( (lv_then_7_0= ruleAbstractTask ) ) (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )? otherlv_10= '}' ) )
            // InternalOptimind.g:789:2: ( () otherlv_1= 'If' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'then' ( (lv_then_7_0= ruleAbstractTask ) ) (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )? otherlv_10= '}' )
            {
            // InternalOptimind.g:789:2: ( () otherlv_1= 'If' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'then' ( (lv_then_7_0= ruleAbstractTask ) ) (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )? otherlv_10= '}' )
            // InternalOptimind.g:790:3: () otherlv_1= 'If' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= ruleEString ) ) otherlv_6= 'then' ( (lv_then_7_0= ruleAbstractTask ) ) (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )? otherlv_10= '}'
            {
            // InternalOptimind.g:790:3: ()
            // InternalOptimind.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getIfStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
            		
            // InternalOptimind.g:801:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:802:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:802:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:803:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIfAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getConditionKeyword_4());
            		
            // InternalOptimind.g:828:3: ( (lv_condition_5_0= ruleEString ) )
            // InternalOptimind.g:829:4: (lv_condition_5_0= ruleEString )
            {
            // InternalOptimind.g:829:4: (lv_condition_5_0= ruleEString )
            // InternalOptimind.g:830:5: lv_condition_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIfAccess().getConditionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
            lv_condition_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getThenKeyword_6());
            		
            // InternalOptimind.g:851:3: ( (lv_then_7_0= ruleAbstractTask ) )
            // InternalOptimind.g:852:4: (lv_then_7_0= ruleAbstractTask )
            {
            // InternalOptimind.g:852:4: (lv_then_7_0= ruleAbstractTask )
            // InternalOptimind.g:853:5: lv_then_7_0= ruleAbstractTask
            {

            					newCompositeNode(grammarAccess.getIfAccess().getThenAbstractTaskParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_then_7_0=ruleAbstractTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"then",
            						lv_then_7_0,
            						"com.altran.Optimind.AbstractTask");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:870:3: (otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimind.g:871:4: otherlv_8= 'else' ( (lv_else_9_0= ruleAbstractTask ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    // InternalOptimind.g:875:4: ( (lv_else_9_0= ruleAbstractTask ) )
                    // InternalOptimind.g:876:5: (lv_else_9_0= ruleAbstractTask )
                    {
                    // InternalOptimind.g:876:5: (lv_else_9_0= ruleAbstractTask )
                    // InternalOptimind.g:877:6: lv_else_9_0= ruleAbstractTask
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getElseAbstractTaskParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_else_9_0=ruleAbstractTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
                    						}
                    						set(
                    							current,
                    							"else",
                    							lv_else_9_0,
                    							"com.altran.Optimind.AbstractTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleBaseTask"
    // InternalOptimind.g:903:1: entryRuleBaseTask returns [EObject current=null] : iv_ruleBaseTask= ruleBaseTask EOF ;
    public final EObject entryRuleBaseTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseTask = null;


        try {
            // InternalOptimind.g:903:49: (iv_ruleBaseTask= ruleBaseTask EOF )
            // InternalOptimind.g:904:2: iv_ruleBaseTask= ruleBaseTask EOF
            {
             newCompositeNode(grammarAccess.getBaseTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseTask=ruleBaseTask();

            state._fsp--;

             current =iv_ruleBaseTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseTask"


    // $ANTLR start "ruleBaseTask"
    // InternalOptimind.g:910:1: ruleBaseTask returns [EObject current=null] : ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )? otherlv_20= '}' ) ;
    public final EObject ruleBaseTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_status_5_0 = null;

        EObject lv_inputs_8_0 = null;

        EObject lv_inputs_10_0 = null;

        EObject lv_outputs_14_0 = null;

        EObject lv_outputs_16_0 = null;

        EObject lv_children_18_1 = null;

        EObject lv_children_18_2 = null;

        EObject lv_children_19_1 = null;

        EObject lv_children_19_2 = null;



        	enterRule();

        try {
            // InternalOptimind.g:916:2: ( ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )? otherlv_20= '}' ) )
            // InternalOptimind.g:917:2: ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )? otherlv_20= '}' )
            {
            // InternalOptimind.g:917:2: ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )? otherlv_20= '}' )
            // InternalOptimind.g:918:3: () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )? otherlv_20= '}'
            {
            // InternalOptimind.g:918:3: ()
            // InternalOptimind.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseTaskAccess().getBaseTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1());
            		
            // InternalOptimind.g:929:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:930:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:930:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:931:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBaseTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:952:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptimind.g:953:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:957:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:958:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:958:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:959:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_status_5_0=ruleTaskStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_5_0,
                    							"com.altran.Optimind.TaskStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:977:3: (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:978:4: otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalOptimind.g:986:4: ( (lv_inputs_8_0= ruleTaskInput ) )
                    // InternalOptimind.g:987:5: (lv_inputs_8_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:987:5: (lv_inputs_8_0= ruleTaskInput )
                    // InternalOptimind.g:988:6: lv_inputs_8_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_inputs_8_0=ruleTaskInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_8_0,
                    							"com.altran.Optimind.TaskInput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1005:4: (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalOptimind.g:1006:5: otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) )
                    	    {
                    	    otherlv_9=(Token)match(input,31,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOptimind.g:1010:5: ( (lv_inputs_10_0= ruleTaskInput ) )
                    	    // InternalOptimind.g:1011:6: (lv_inputs_10_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:1011:6: (lv_inputs_10_0= ruleTaskInput )
                    	    // InternalOptimind.g:1012:7: lv_inputs_10_0= ruleTaskInput
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_inputs_10_0=ruleTaskInput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_10_0,
                    	    								"com.altran.Optimind.TaskInput");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalOptimind.g:1035:3: (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptimind.g:1036:4: otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOptimind.g:1044:4: ( (lv_outputs_14_0= ruleTaskOutput ) )
                    // InternalOptimind.g:1045:5: (lv_outputs_14_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:1045:5: (lv_outputs_14_0= ruleTaskOutput )
                    // InternalOptimind.g:1046:6: lv_outputs_14_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_outputs_14_0=ruleTaskOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_14_0,
                    							"com.altran.Optimind.TaskOutput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1063:4: (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==31) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalOptimind.g:1064:5: otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) )
                    	    {
                    	    otherlv_15=(Token)match(input,31,FOLLOW_27); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOptimind.g:1068:5: ( (lv_outputs_16_0= ruleTaskOutput ) )
                    	    // InternalOptimind.g:1069:6: (lv_outputs_16_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:1069:6: (lv_outputs_16_0= ruleTaskOutput )
                    	    // InternalOptimind.g:1070:7: lv_outputs_16_0= ruleTaskOutput
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_outputs_16_0=ruleTaskOutput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_16_0,
                    	    								"com.altran.Optimind.TaskOutput");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_17, grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalOptimind.g:1093:3: ( ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18||LA21_0==23||LA21_0==25||LA21_0==28||LA21_0==33||LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOptimind.g:1094:4: ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) ) ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )*
                    {
                    // InternalOptimind.g:1094:4: ( ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) ) )
                    // InternalOptimind.g:1095:5: ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) )
                    {
                    // InternalOptimind.g:1095:5: ( (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement ) )
                    // InternalOptimind.g:1096:6: (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement )
                    {
                    // InternalOptimind.g:1096:6: (lv_children_18_1= ruleAbstractTask | lv_children_18_2= ruleAbstractStatement )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28||LA18_0==33||LA18_0==35) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==18||LA18_0==23||LA18_0==25) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalOptimind.g:1097:7: lv_children_18_1= ruleAbstractTask
                            {

                            							newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0_0());
                            						
                            pushFollow(FOLLOW_28);
                            lv_children_18_1=ruleAbstractTask();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                            							}
                            							add(
                            								current,
                            								"children",
                            								lv_children_18_1,
                            								"com.altran.Optimind.AbstractTask");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalOptimind.g:1113:7: lv_children_18_2= ruleAbstractStatement
                            {

                            							newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_0_0_1());
                            						
                            pushFollow(FOLLOW_28);
                            lv_children_18_2=ruleAbstractStatement();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                            							}
                            							add(
                            								current,
                            								"children",
                            								lv_children_18_2,
                            								"com.altran.Optimind.AbstractStatement");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalOptimind.g:1131:4: ( ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18||LA20_0==23||LA20_0==25||LA20_0==28||LA20_0==33||LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalOptimind.g:1132:5: ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) )
                    	    {
                    	    // InternalOptimind.g:1132:5: ( (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement ) )
                    	    // InternalOptimind.g:1133:6: (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement )
                    	    {
                    	    // InternalOptimind.g:1133:6: (lv_children_19_1= ruleAbstractTask | lv_children_19_2= ruleAbstractStatement )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==28||LA19_0==33||LA19_0==35) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==18||LA19_0==23||LA19_0==25) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // InternalOptimind.g:1134:7: lv_children_19_1= ruleAbstractTask
                    	            {

                    	            							newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_28);
                    	            lv_children_19_1=ruleAbstractTask();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"children",
                    	            								lv_children_19_1,
                    	            								"com.altran.Optimind.AbstractTask");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalOptimind.g:1150:7: lv_children_19_2= ruleAbstractStatement
                    	            {

                    	            							newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractStatementParserRuleCall_7_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_28);
                    	            lv_children_19_2=ruleAbstractStatement();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"children",
                    	            								lv_children_19_2,
                    	            								"com.altran.Optimind.AbstractStatement");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_20=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseTask"


    // $ANTLR start "entryRuleLibraryTask"
    // InternalOptimind.g:1177:1: entryRuleLibraryTask returns [EObject current=null] : iv_ruleLibraryTask= ruleLibraryTask EOF ;
    public final EObject entryRuleLibraryTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryTask = null;


        try {
            // InternalOptimind.g:1177:52: (iv_ruleLibraryTask= ruleLibraryTask EOF )
            // InternalOptimind.g:1178:2: iv_ruleLibraryTask= ruleLibraryTask EOF
            {
             newCompositeNode(grammarAccess.getLibraryTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryTask=ruleLibraryTask();

            state._fsp--;

             current =iv_ruleLibraryTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibraryTask"


    // $ANTLR start "ruleLibraryTask"
    // InternalOptimind.g:1184:1: ruleLibraryTask returns [EObject current=null] : ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleLibraryTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_status_5_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_outputs_9_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1190:2: ( ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalOptimind.g:1191:2: ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalOptimind.g:1191:2: ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalOptimind.g:1192:3: () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalOptimind.g:1192:3: ()
            // InternalOptimind.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1());
            		
            // InternalOptimind.g:1203:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1204:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1204:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1205:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:1226:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptimind.g:1227:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:1231:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:1232:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:1232:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:1233:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_status_5_0=ruleTaskStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_5_0,
                    							"com.altran.Optimind.TaskStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:1251:3: ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptimind.g:1252:4: ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )*
                    {
                    // InternalOptimind.g:1252:4: ( (lv_inputs_6_0= ruleTaskInput ) )
                    // InternalOptimind.g:1253:5: (lv_inputs_6_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:1253:5: (lv_inputs_6_0= ruleTaskInput )
                    // InternalOptimind.g:1254:6: lv_inputs_6_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_inputs_6_0=ruleTaskInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_6_0,
                    							"com.altran.Optimind.TaskInput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1271:4: ( (lv_inputs_7_0= ruleTaskInput ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOptimind.g:1272:5: (lv_inputs_7_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:1272:5: (lv_inputs_7_0= ruleTaskInput )
                    	    // InternalOptimind.g:1273:6: lv_inputs_7_0= ruleTaskInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_inputs_7_0=ruleTaskInput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_7_0,
                    	    							"com.altran.Optimind.TaskInput");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1291:3: ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptimind.g:1292:4: ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    {
                    // InternalOptimind.g:1292:4: ( (lv_outputs_8_0= ruleTaskOutput ) )
                    // InternalOptimind.g:1293:5: (lv_outputs_8_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:1293:5: (lv_outputs_8_0= ruleTaskOutput )
                    // InternalOptimind.g:1294:6: lv_outputs_8_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_outputs_8_0=ruleTaskOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_8_0,
                    							"com.altran.Optimind.TaskOutput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1311:4: ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOptimind.g:1312:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:1312:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    // InternalOptimind.g:1313:6: lv_outputs_9_0= ruleTaskOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_outputs_9_0=ruleTaskOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_9_0,
                    	    							"com.altran.Optimind.TaskOutput");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1331:3: (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptimind.g:1332:4: otherlv_10= 'Libraryfunction' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0());
                    			
                    // InternalOptimind.g:1336:4: ( ( ruleEString ) )
                    // InternalOptimind.g:1337:5: ( ruleEString )
                    {
                    // InternalOptimind.g:1337:5: ( ruleEString )
                    // InternalOptimind.g:1338:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLibraryTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLibraryTaskAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibraryTask"


    // $ANTLR start "entryRuleCustomTask"
    // InternalOptimind.g:1361:1: entryRuleCustomTask returns [EObject current=null] : iv_ruleCustomTask= ruleCustomTask EOF ;
    public final EObject entryRuleCustomTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTask = null;


        try {
            // InternalOptimind.g:1361:51: (iv_ruleCustomTask= ruleCustomTask EOF )
            // InternalOptimind.g:1362:2: iv_ruleCustomTask= ruleCustomTask EOF
            {
             newCompositeNode(grammarAccess.getCustomTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomTask=ruleCustomTask();

            state._fsp--;

             current =iv_ruleCustomTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomTask"


    // $ANTLR start "ruleCustomTask"
    // InternalOptimind.g:1368:1: ruleCustomTask returns [EObject current=null] : ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCustomTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_status_5_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_outputs_9_0 = null;

        AntlrDatatypeRuleToken lv_runner_11_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1374:2: ( ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalOptimind.g:1375:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalOptimind.g:1375:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // InternalOptimind.g:1376:3: () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalOptimind.g:1376:3: ()
            // InternalOptimind.g:1377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomTaskAccess().getCustomTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomTaskAccess().getTaskKeyword_1());
            		
            // InternalOptimind.g:1387:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1388:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1388:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1389:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomTaskAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:1410:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptimind.g:1411:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:1415:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:1416:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:1416:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:1417:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_status_5_0=ruleTaskStatus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    						}
                    						set(
                    							current,
                    							"status",
                    							lv_status_5_0,
                    							"com.altran.Optimind.TaskStatus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:1435:3: ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=37 && LA30_0<=38)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimind.g:1436:4: ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )*
                    {
                    // InternalOptimind.g:1436:4: ( (lv_inputs_6_0= ruleTaskInput ) )
                    // InternalOptimind.g:1437:5: (lv_inputs_6_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:1437:5: (lv_inputs_6_0= ruleTaskInput )
                    // InternalOptimind.g:1438:6: lv_inputs_6_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_inputs_6_0=ruleTaskInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_6_0,
                    							"com.altran.Optimind.TaskInput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1455:4: ( (lv_inputs_7_0= ruleTaskInput ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=37 && LA29_0<=38)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalOptimind.g:1456:5: (lv_inputs_7_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:1456:5: (lv_inputs_7_0= ruleTaskInput )
                    	    // InternalOptimind.g:1457:6: lv_inputs_7_0= ruleTaskInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_inputs_7_0=ruleTaskInput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_7_0,
                    	    							"com.altran.Optimind.TaskInput");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1475:3: ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimind.g:1476:4: ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    {
                    // InternalOptimind.g:1476:4: ( (lv_outputs_8_0= ruleTaskOutput ) )
                    // InternalOptimind.g:1477:5: (lv_outputs_8_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:1477:5: (lv_outputs_8_0= ruleTaskOutput )
                    // InternalOptimind.g:1478:6: lv_outputs_8_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_outputs_8_0=ruleTaskOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_8_0,
                    							"com.altran.Optimind.TaskOutput");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1495:4: ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalOptimind.g:1496:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:1496:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    // InternalOptimind.g:1497:6: lv_outputs_9_0= ruleTaskOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    lv_outputs_9_0=ruleTaskOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_9_0,
                    	    							"com.altran.Optimind.TaskOutput");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1515:3: (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOptimind.g:1516:4: otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0());
                    			
                    // InternalOptimind.g:1520:4: ( (lv_runner_11_0= ruleEString ) )
                    // InternalOptimind.g:1521:5: (lv_runner_11_0= ruleEString )
                    {
                    // InternalOptimind.g:1521:5: (lv_runner_11_0= ruleEString )
                    // InternalOptimind.g:1522:6: lv_runner_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getRunnerEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_runner_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomTaskRule());
                    						}
                    						set(
                    							current,
                    							"runner",
                    							lv_runner_11_0,
                    							"com.altran.Optimind.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCustomTaskAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomTask"


    // $ANTLR start "entryRuleSetter"
    // InternalOptimind.g:1548:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // InternalOptimind.g:1548:47: (iv_ruleSetter= ruleSetter EOF )
            // InternalOptimind.g:1549:2: iv_ruleSetter= ruleSetter EOF
            {
             newCompositeNode(grammarAccess.getSetterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetter=ruleSetter();

            state._fsp--;

             current =iv_ruleSetter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetter"


    // $ANTLR start "ruleSetter"
    // InternalOptimind.g:1555:1: ruleSetter returns [EObject current=null] : ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleSetter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_typeAsString_4_0 = null;

        AntlrDatatypeRuleToken lv_valueAsString_6_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1561:2: ( ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1562:2: ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1562:2: ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1563:3: () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1563:3: ()
            // InternalOptimind.g:1564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetterAccess().getSetterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetterAccess().getSetterKeyword_1());
            		
            // InternalOptimind.g:1574:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1575:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1575:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1576:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSetterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:1593:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptimind.g:1594:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetterAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:1598:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:1599:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:1599:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:1600:6: lv_typeAsString_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getSetterAccess().getTypeAsStringTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_typeAsString_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetterRule());
                    						}
                    						set(
                    							current,
                    							"typeAsString",
                    							lv_typeAsString_4_0,
                    							"com.altran.Optimind.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:1618:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==17) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimind.g:1619:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetterAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:1623:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:1624:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:1624:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:1625:6: lv_valueAsString_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSetterAccess().getValueAsStringEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valueAsString_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetterRule());
                    						}
                    						set(
                    							current,
                    							"valueAsString",
                    							lv_valueAsString_6_0,
                    							"com.altran.Optimind.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetter"


    // $ANTLR start "entryRuleConnection"
    // InternalOptimind.g:1647:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalOptimind.g:1647:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalOptimind.g:1648:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalOptimind.g:1654:1: ruleConnection returns [EObject current=null] : ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1660:2: ( ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? ) )
            // InternalOptimind.g:1661:2: ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? )
            {
            // InternalOptimind.g:1661:2: ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? )
            // InternalOptimind.g:1662:3: () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )?
            {
            // InternalOptimind.g:1662:3: ()
            // InternalOptimind.g:1663:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
            		
            // InternalOptimind.g:1673:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1674:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1674:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1675:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:1692:3: (otherlv_3= 'to' ( ( ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==20) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:1693:4: otherlv_3= 'to' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getToKeyword_3_0());
                    			
                    // InternalOptimind.g:1697:4: ( ( ruleEString ) )
                    // InternalOptimind.g:1698:5: ( ruleEString )
                    {
                    // InternalOptimind.g:1698:5: ( ruleEString )
                    // InternalOptimind.g:1699:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getConnectionAccess().getTaskoutputTaskOutputCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleLibraryFunction"
    // InternalOptimind.g:1718:1: entryRuleLibraryFunction returns [EObject current=null] : iv_ruleLibraryFunction= ruleLibraryFunction EOF ;
    public final EObject entryRuleLibraryFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryFunction = null;


        try {
            // InternalOptimind.g:1718:56: (iv_ruleLibraryFunction= ruleLibraryFunction EOF )
            // InternalOptimind.g:1719:2: iv_ruleLibraryFunction= ruleLibraryFunction EOF
            {
             newCompositeNode(grammarAccess.getLibraryFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibraryFunction=ruleLibraryFunction();

            state._fsp--;

             current =iv_ruleLibraryFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibraryFunction"


    // $ANTLR start "ruleLibraryFunction"
    // InternalOptimind.g:1725:1: ruleLibraryFunction returns [EObject current=null] : ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleLibraryFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_function_5_0 = null;

        EObject lv_inputs_6_0 = null;

        EObject lv_inputs_7_0 = null;

        EObject lv_outputs_8_0 = null;

        EObject lv_outputs_9_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1731:2: ( ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' ) )
            // InternalOptimind.g:1732:2: ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' )
            {
            // InternalOptimind.g:1732:2: ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' )
            // InternalOptimind.g:1733:3: () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}'
            {
            // InternalOptimind.g:1733:3: ()
            // InternalOptimind.g:1734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1());
            		
            // InternalOptimind.g:1744:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1745:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1745:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1746:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryFunctionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4());
            		
            // InternalOptimind.g:1771:3: ( (lv_function_5_0= ruleEString ) )
            // InternalOptimind.g:1772:4: (lv_function_5_0= ruleEString )
            {
            // InternalOptimind.g:1772:4: (lv_function_5_0= ruleEString )
            // InternalOptimind.g:1773:5: lv_function_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryFunctionAccess().getFunctionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_function_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
            					}
            					set(
            						current,
            						"function",
            						lv_function_5_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:1790:3: ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOptimind.g:1791:4: ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )*
                    {
                    // InternalOptimind.g:1791:4: ( (lv_inputs_6_0= ruleInput ) )
                    // InternalOptimind.g:1792:5: (lv_inputs_6_0= ruleInput )
                    {
                    // InternalOptimind.g:1792:5: (lv_inputs_6_0= ruleInput )
                    // InternalOptimind.g:1793:6: lv_inputs_6_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_inputs_6_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_6_0,
                    							"com.altran.Optimind.Input");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1810:4: ( (lv_inputs_7_0= ruleInput ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==41) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalOptimind.g:1811:5: (lv_inputs_7_0= ruleInput )
                    	    {
                    	    // InternalOptimind.g:1811:5: (lv_inputs_7_0= ruleInput )
                    	    // InternalOptimind.g:1812:6: lv_inputs_7_0= ruleInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_inputs_7_0=ruleInput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inputs",
                    	    							lv_inputs_7_0,
                    	    							"com.altran.Optimind.Input");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1830:3: ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptimind.g:1831:4: ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )*
                    {
                    // InternalOptimind.g:1831:4: ( (lv_outputs_8_0= ruleOutput ) )
                    // InternalOptimind.g:1832:5: (lv_outputs_8_0= ruleOutput )
                    {
                    // InternalOptimind.g:1832:5: (lv_outputs_8_0= ruleOutput )
                    // InternalOptimind.g:1833:6: lv_outputs_8_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_outputs_8_0=ruleOutput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_8_0,
                    							"com.altran.Optimind.Output");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:1850:4: ( (lv_outputs_9_0= ruleOutput ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalOptimind.g:1851:5: (lv_outputs_9_0= ruleOutput )
                    	    {
                    	    // InternalOptimind.g:1851:5: (lv_outputs_9_0= ruleOutput )
                    	    // InternalOptimind.g:1852:6: lv_outputs_9_0= ruleOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    lv_outputs_9_0=ruleOutput();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLibraryFunctionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outputs",
                    	    							lv_outputs_9_0,
                    	    							"com.altran.Optimind.Output");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLibraryFunctionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibraryFunction"


    // $ANTLR start "entryRuleInput"
    // InternalOptimind.g:1878:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalOptimind.g:1878:46: (iv_ruleInput= ruleInput EOF )
            // InternalOptimind.g:1879:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalOptimind.g:1885:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_typeAsString_4_0 = null;

        AntlrDatatypeRuleToken lv_valueAsString_6_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1891:2: ( ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1892:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1892:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1893:3: () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1893:3: ()
            // InternalOptimind.g:1894:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalOptimind.g:1904:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1905:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1905:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1906:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:1923:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOptimind.g:1924:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:1928:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:1929:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:1929:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:1930:6: lv_typeAsString_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getTypeAsStringTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_typeAsString_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"typeAsString",
                    							lv_typeAsString_4_0,
                    							"com.altran.Optimind.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:1948:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOptimind.g:1949:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:1953:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:1954:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:1954:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:1955:6: lv_valueAsString_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getValueAsStringEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valueAsString_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"valueAsString",
                    							lv_valueAsString_6_0,
                    							"com.altran.Optimind.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalOptimind.g:1977:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalOptimind.g:1977:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalOptimind.g:1978:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalOptimind.g:1984:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_typeAsString_4_0 = null;

        AntlrDatatypeRuleToken lv_valueAsString_6_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1990:2: ( ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1991:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1991:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1992:3: () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1992:3: ()
            // InternalOptimind.g:1993:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            // InternalOptimind.g:2003:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:2004:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:2004:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:2005:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.altran.Optimind.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimind.g:2022:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==16) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOptimind.g:2023:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:2027:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:2028:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:2028:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:2029:6: lv_typeAsString_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getTypeAsStringTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_typeAsString_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"typeAsString",
                    							lv_typeAsString_4_0,
                    							"com.altran.Optimind.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOptimind.g:2047:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==17) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOptimind.g:2048:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:2052:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:2053:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:2053:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:2054:6: lv_valueAsString_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getValueAsStringEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_valueAsString_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"valueAsString",
                    							lv_valueAsString_6_0,
                    							"com.altran.Optimind.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "ruleProgLanguage"
    // InternalOptimind.g:2076:1: ruleProgLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) ) ;
    public final Enumerator ruleProgLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptimind.g:2082:2: ( ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) ) )
            // InternalOptimind.g:2083:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) )
            {
            // InternalOptimind.g:2083:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            else if ( (LA45_0==43) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalOptimind.g:2084:3: (enumLiteral_0= 'Python' )
                    {
                    // InternalOptimind.g:2084:3: (enumLiteral_0= 'Python' )
                    // InternalOptimind.g:2085:4: enumLiteral_0= 'Python'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:2092:3: (enumLiteral_1= 'Java' )
                    {
                    // InternalOptimind.g:2092:3: (enumLiteral_1= 'Java' )
                    // InternalOptimind.g:2093:4: enumLiteral_1= 'Java'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProgLanguageAccess().getJavaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgLanguage"


    // $ANTLR start "ruleTaskStatus"
    // InternalOptimind.g:2103:1: ruleTaskStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) ) ;
    public final Enumerator ruleTaskStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptimind.g:2109:2: ( ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) ) )
            // InternalOptimind.g:2110:2: ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) )
            {
            // InternalOptimind.g:2110:2: ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt46=1;
                }
                break;
            case 45:
                {
                alt46=2;
                }
                break;
            case 46:
                {
                alt46=3;
                }
                break;
            case 47:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalOptimind.g:2111:3: (enumLiteral_0= 'FINISHED' )
                    {
                    // InternalOptimind.g:2111:3: (enumLiteral_0= 'FINISHED' )
                    // InternalOptimind.g:2112:4: enumLiteral_0= 'FINISHED'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:2119:3: (enumLiteral_1= 'PREPARED' )
                    {
                    // InternalOptimind.g:2119:3: (enumLiteral_1= 'PREPARED' )
                    // InternalOptimind.g:2120:4: enumLiteral_1= 'PREPARED'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:2127:3: (enumLiteral_2= 'NOT_PREPARED' )
                    {
                    // InternalOptimind.g:2127:3: (enumLiteral_2= 'NOT_PREPARED' )
                    // InternalOptimind.g:2128:4: enumLiteral_2= 'NOT_PREPARED'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:2135:3: (enumLiteral_3= 'PROCESSING' )
                    {
                    // InternalOptimind.g:2135:3: (enumLiteral_3= 'PROCESSING' )
                    // InternalOptimind.g:2136:4: enumLiteral_3= 'PROCESSING'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskStatusAccess().getPROCESSINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008010006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008010004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000A10000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000B72844000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000B52844000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000B12844000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000A12844000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000642000C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000640000C000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000040000C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000702000C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000700000C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000100000C000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000002000000C000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000000C000L});

}