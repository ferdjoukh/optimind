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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Workflow'", "'{'", "'Language'", "'}'", "'Output'", "'type'", "'value'", "'BaseTask'", "'status'", "'inputs'", "','", "'outputs'", "'LibraryTask'", "'Libraryfunction'", "'Task'", "'runner'", "'Setter'", "'Connection'", "'to'", "'LibraryFunction'", "'function'", "'Input'", "'Python'", "'Java'", "'FINISHED'", "'PREPARED'", "'NOT_PREPARED'", "'PROCESSING'"
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

            if ( (LA2_0==18) ) {
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

            if ( (LA4_0==30) ) {
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

                        if ( (LA3_0==30) ) {
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
            case 18:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 25:
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

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
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


    // $ANTLR start "entryRuleType"
    // InternalOptimind.g:321:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalOptimind.g:321:44: (iv_ruleType= ruleType EOF )
            // InternalOptimind.g:322:2: iv_ruleType= ruleType EOF
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
    // InternalOptimind.g:328:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOptimind.g:334:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOptimind.g:335:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOptimind.g:335:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalOptimind.g:336:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getTypeAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimind.g:344:3: this_ID_1= RULE_ID
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
    // InternalOptimind.g:355:1: entryRuleTaskOutput returns [EObject current=null] : iv_ruleTaskOutput= ruleTaskOutput EOF ;
    public final EObject entryRuleTaskOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskOutput = null;


        try {
            // InternalOptimind.g:355:51: (iv_ruleTaskOutput= ruleTaskOutput EOF )
            // InternalOptimind.g:356:2: iv_ruleTaskOutput= ruleTaskOutput EOF
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
    // InternalOptimind.g:362:1: ruleTaskOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
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
            // InternalOptimind.g:368:2: ( ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:369:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:369:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:370:3: () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:370:3: ()
            // InternalOptimind.g:371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskOutputAccess().getTaskOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskOutputAccess().getOutputKeyword_1());
            		
            // InternalOptimind.g:381:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:382:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:382:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:383:5: lv_name_2_0= ruleEString
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

            // InternalOptimind.g:400:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimind.g:401:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskOutputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:405:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:406:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:406:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:407:6: lv_typeAsString_4_0= ruleType
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

            // InternalOptimind.g:425:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimind.g:426:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskOutputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:430:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:431:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:431:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:432:6: lv_valueAsString_6_0= ruleEString
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


    // $ANTLR start "entryRuleBaseTask"
    // InternalOptimind.g:454:1: entryRuleBaseTask returns [EObject current=null] : iv_ruleBaseTask= ruleBaseTask EOF ;
    public final EObject entryRuleBaseTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseTask = null;


        try {
            // InternalOptimind.g:454:49: (iv_ruleBaseTask= ruleBaseTask EOF )
            // InternalOptimind.g:455:2: iv_ruleBaseTask= ruleBaseTask EOF
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
    // InternalOptimind.g:461:1: ruleBaseTask returns [EObject current=null] : ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )? otherlv_20= '}' ) ;
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

        EObject lv_children_18_0 = null;

        EObject lv_children_19_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:467:2: ( ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )? otherlv_20= '}' ) )
            // InternalOptimind.g:468:2: ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )? otherlv_20= '}' )
            {
            // InternalOptimind.g:468:2: ( () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )? otherlv_20= '}' )
            // InternalOptimind.g:469:3: () otherlv_1= 'BaseTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )? (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )? ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )? otherlv_20= '}'
            {
            // InternalOptimind.g:469:3: ()
            // InternalOptimind.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBaseTaskAccess().getBaseTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBaseTaskAccess().getBaseTaskKeyword_1());
            		
            // InternalOptimind.g:480:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:481:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:481:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:482:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:503:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimind.g:504:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getBaseTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:508:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:509:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:509:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:510:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            // InternalOptimind.g:528:3: (otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOptimind.g:529:4: otherlv_6= 'inputs' otherlv_7= '{' ( (lv_inputs_8_0= ruleTaskInput ) ) (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getBaseTaskAccess().getInputsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalOptimind.g:537:4: ( (lv_inputs_8_0= ruleTaskInput ) )
                    // InternalOptimind.g:538:5: (lv_inputs_8_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:538:5: (lv_inputs_8_0= ruleTaskInput )
                    // InternalOptimind.g:539:6: lv_inputs_8_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalOptimind.g:556:4: (otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==21) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOptimind.g:557:5: otherlv_9= ',' ( (lv_inputs_10_0= ruleTaskInput ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_14); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getBaseTaskAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalOptimind.g:561:5: ( (lv_inputs_10_0= ruleTaskInput ) )
                    	    // InternalOptimind.g:562:6: (lv_inputs_10_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:562:6: (lv_inputs_10_0= ruleTaskInput )
                    	    // InternalOptimind.g:563:7: lv_inputs_10_0= ruleTaskInput
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseTaskAccess().getInputsTaskInputParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalOptimind.g:586:3: (otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOptimind.g:587:4: otherlv_12= 'outputs' otherlv_13= '{' ( (lv_outputs_14_0= ruleTaskOutput ) ) (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getBaseTaskAccess().getOutputsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getBaseTaskAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalOptimind.g:595:4: ( (lv_outputs_14_0= ruleTaskOutput ) )
                    // InternalOptimind.g:596:5: (lv_outputs_14_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:596:5: (lv_outputs_14_0= ruleTaskOutput )
                    // InternalOptimind.g:597:6: lv_outputs_14_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalOptimind.g:614:4: (otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalOptimind.g:615:5: otherlv_15= ',' ( (lv_outputs_16_0= ruleTaskOutput ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_17); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getBaseTaskAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalOptimind.g:619:5: ( (lv_outputs_16_0= ruleTaskOutput ) )
                    	    // InternalOptimind.g:620:6: (lv_outputs_16_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:620:6: (lv_outputs_16_0= ruleTaskOutput )
                    	    // InternalOptimind.g:621:7: lv_outputs_16_0= ruleTaskOutput
                    	    {

                    	    							newCompositeNode(grammarAccess.getBaseTaskAccess().getOutputsTaskOutputParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_17, grammarAccess.getBaseTaskAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalOptimind.g:644:3: ( ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18||LA17_0==23||LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOptimind.g:645:4: ( (lv_children_18_0= ruleAbstractTask ) ) ( (lv_children_19_0= ruleAbstractTask ) )*
                    {
                    // InternalOptimind.g:645:4: ( (lv_children_18_0= ruleAbstractTask ) )
                    // InternalOptimind.g:646:5: (lv_children_18_0= ruleAbstractTask )
                    {
                    // InternalOptimind.g:646:5: (lv_children_18_0= ruleAbstractTask )
                    // InternalOptimind.g:647:6: lv_children_18_0= ruleAbstractTask
                    {

                    						newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_children_18_0=ruleAbstractTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_18_0,
                    							"com.altran.Optimind.AbstractTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOptimind.g:664:4: ( (lv_children_19_0= ruleAbstractTask ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18||LA16_0==23||LA16_0==25) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalOptimind.g:665:5: (lv_children_19_0= ruleAbstractTask )
                    	    {
                    	    // InternalOptimind.g:665:5: (lv_children_19_0= ruleAbstractTask )
                    	    // InternalOptimind.g:666:6: lv_children_19_0= ruleAbstractTask
                    	    {

                    	    						newCompositeNode(grammarAccess.getBaseTaskAccess().getChildrenAbstractTaskParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_19_0=ruleAbstractTask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBaseTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"children",
                    	    							lv_children_19_0,
                    	    							"com.altran.Optimind.AbstractTask");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // InternalOptimind.g:692:1: entryRuleLibraryTask returns [EObject current=null] : iv_ruleLibraryTask= ruleLibraryTask EOF ;
    public final EObject entryRuleLibraryTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryTask = null;


        try {
            // InternalOptimind.g:692:52: (iv_ruleLibraryTask= ruleLibraryTask EOF )
            // InternalOptimind.g:693:2: iv_ruleLibraryTask= ruleLibraryTask EOF
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
    // InternalOptimind.g:699:1: ruleLibraryTask returns [EObject current=null] : ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
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
            // InternalOptimind.g:705:2: ( ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalOptimind.g:706:2: ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalOptimind.g:706:2: ( () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalOptimind.g:707:3: () otherlv_1= 'LibraryTask' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalOptimind.g:707:3: ()
            // InternalOptimind.g:708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryTaskAccess().getLibraryTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryTaskAccess().getLibraryTaskKeyword_1());
            		
            // InternalOptimind.g:718:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:719:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:719:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:720:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:741:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOptimind.g:742:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibraryTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:746:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:747:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:747:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:748:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalOptimind.g:766:3: ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=27 && LA20_0<=28)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOptimind.g:767:4: ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )*
                    {
                    // InternalOptimind.g:767:4: ( (lv_inputs_6_0= ruleTaskInput ) )
                    // InternalOptimind.g:768:5: (lv_inputs_6_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:768:5: (lv_inputs_6_0= ruleTaskInput )
                    // InternalOptimind.g:769:6: lv_inputs_6_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    // InternalOptimind.g:786:4: ( (lv_inputs_7_0= ruleTaskInput ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=27 && LA19_0<=28)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalOptimind.g:787:5: (lv_inputs_7_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:787:5: (lv_inputs_7_0= ruleTaskInput )
                    	    // InternalOptimind.g:788:6: lv_inputs_7_0= ruleTaskInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getInputsTaskInputParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:806:3: ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalOptimind.g:807:4: ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    {
                    // InternalOptimind.g:807:4: ( (lv_outputs_8_0= ruleTaskOutput ) )
                    // InternalOptimind.g:808:5: (lv_outputs_8_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:808:5: (lv_outputs_8_0= ruleTaskOutput )
                    // InternalOptimind.g:809:6: lv_outputs_8_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalOptimind.g:826:4: ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOptimind.g:827:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:827:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    // InternalOptimind.g:828:6: lv_outputs_9_0= ruleTaskOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:846:3: (otherlv_10= 'Libraryfunction' ( ( ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOptimind.g:847:4: otherlv_10= 'Libraryfunction' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getLibraryTaskAccess().getLibraryfunctionKeyword_7_0());
                    			
                    // InternalOptimind.g:851:4: ( ( ruleEString ) )
                    // InternalOptimind.g:852:5: ( ruleEString )
                    {
                    // InternalOptimind.g:852:5: ( ruleEString )
                    // InternalOptimind.g:853:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLibraryTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLibraryTaskAccess().getLibraryfunctionLibraryFunctionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalOptimind.g:876:1: entryRuleCustomTask returns [EObject current=null] : iv_ruleCustomTask= ruleCustomTask EOF ;
    public final EObject entryRuleCustomTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTask = null;


        try {
            // InternalOptimind.g:876:51: (iv_ruleCustomTask= ruleCustomTask EOF )
            // InternalOptimind.g:877:2: iv_ruleCustomTask= ruleCustomTask EOF
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
    // InternalOptimind.g:883:1: ruleCustomTask returns [EObject current=null] : ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' ) ;
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
            // InternalOptimind.g:889:2: ( ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalOptimind.g:890:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalOptimind.g:890:2: ( () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}' )
            // InternalOptimind.g:891:3: () otherlv_1= 'Task' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )? ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )? ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )? (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalOptimind.g:891:3: ()
            // InternalOptimind.g:892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCustomTaskAccess().getCustomTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomTaskAccess().getTaskKeyword_1());
            		
            // InternalOptimind.g:902:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:903:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:903:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:904:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomTaskAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOptimind.g:925:3: (otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOptimind.g:926:4: otherlv_4= 'status' ( (lv_status_5_0= ruleTaskStatus ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCustomTaskAccess().getStatusKeyword_4_0());
                    			
                    // InternalOptimind.g:930:4: ( (lv_status_5_0= ruleTaskStatus ) )
                    // InternalOptimind.g:931:5: (lv_status_5_0= ruleTaskStatus )
                    {
                    // InternalOptimind.g:931:5: (lv_status_5_0= ruleTaskStatus )
                    // InternalOptimind.g:932:6: lv_status_5_0= ruleTaskStatus
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getStatusTaskStatusEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalOptimind.g:950:3: ( ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=27 && LA26_0<=28)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOptimind.g:951:4: ( (lv_inputs_6_0= ruleTaskInput ) ) ( (lv_inputs_7_0= ruleTaskInput ) )*
                    {
                    // InternalOptimind.g:951:4: ( (lv_inputs_6_0= ruleTaskInput ) )
                    // InternalOptimind.g:952:5: (lv_inputs_6_0= ruleTaskInput )
                    {
                    // InternalOptimind.g:952:5: (lv_inputs_6_0= ruleTaskInput )
                    // InternalOptimind.g:953:6: lv_inputs_6_0= ruleTaskInput
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalOptimind.g:970:4: ( (lv_inputs_7_0= ruleTaskInput ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=27 && LA25_0<=28)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalOptimind.g:971:5: (lv_inputs_7_0= ruleTaskInput )
                    	    {
                    	    // InternalOptimind.g:971:5: (lv_inputs_7_0= ruleTaskInput )
                    	    // InternalOptimind.g:972:6: lv_inputs_7_0= ruleTaskInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustomTaskAccess().getInputsTaskInputParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:990:3: ( ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptimind.g:991:4: ( (lv_outputs_8_0= ruleTaskOutput ) ) ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    {
                    // InternalOptimind.g:991:4: ( (lv_outputs_8_0= ruleTaskOutput ) )
                    // InternalOptimind.g:992:5: (lv_outputs_8_0= ruleTaskOutput )
                    {
                    // InternalOptimind.g:992:5: (lv_outputs_8_0= ruleTaskOutput )
                    // InternalOptimind.g:993:6: lv_outputs_8_0= ruleTaskOutput
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalOptimind.g:1010:4: ( (lv_outputs_9_0= ruleTaskOutput ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==15) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalOptimind.g:1011:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    {
                    	    // InternalOptimind.g:1011:5: (lv_outputs_9_0= ruleTaskOutput )
                    	    // InternalOptimind.g:1012:6: lv_outputs_9_0= ruleTaskOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getCustomTaskAccess().getOutputsTaskOutputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1030:3: (otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimind.g:1031:4: otherlv_10= 'runner' ( (lv_runner_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCustomTaskAccess().getRunnerKeyword_7_0());
                    			
                    // InternalOptimind.g:1035:4: ( (lv_runner_11_0= ruleEString ) )
                    // InternalOptimind.g:1036:5: (lv_runner_11_0= ruleEString )
                    {
                    // InternalOptimind.g:1036:5: (lv_runner_11_0= ruleEString )
                    // InternalOptimind.g:1037:6: lv_runner_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomTaskAccess().getRunnerEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
    // InternalOptimind.g:1063:1: entryRuleSetter returns [EObject current=null] : iv_ruleSetter= ruleSetter EOF ;
    public final EObject entryRuleSetter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetter = null;


        try {
            // InternalOptimind.g:1063:47: (iv_ruleSetter= ruleSetter EOF )
            // InternalOptimind.g:1064:2: iv_ruleSetter= ruleSetter EOF
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
    // InternalOptimind.g:1070:1: ruleSetter returns [EObject current=null] : ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
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
            // InternalOptimind.g:1076:2: ( ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1077:2: ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1077:2: ( () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1078:3: () otherlv_1= 'Setter' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1078:3: ()
            // InternalOptimind.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetterAccess().getSetterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSetterAccess().getSetterKeyword_1());
            		
            // InternalOptimind.g:1089:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1090:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1090:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1091:5: lv_name_2_0= ruleEString
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

            // InternalOptimind.g:1108:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimind.g:1109:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSetterAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:1113:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:1114:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:1114:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:1115:6: lv_typeAsString_4_0= ruleType
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

            // InternalOptimind.g:1133:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOptimind.g:1134:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSetterAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:1138:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:1139:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:1139:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:1140:6: lv_valueAsString_6_0= ruleEString
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
    // InternalOptimind.g:1162:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalOptimind.g:1162:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalOptimind.g:1163:2: iv_ruleConnection= ruleConnection EOF
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
    // InternalOptimind.g:1169:1: ruleConnection returns [EObject current=null] : ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOptimind.g:1175:2: ( ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? ) )
            // InternalOptimind.g:1176:2: ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? )
            {
            // InternalOptimind.g:1176:2: ( () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )? )
            // InternalOptimind.g:1177:3: () otherlv_1= 'Connection' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'to' ( ( ruleEString ) ) )?
            {
            // InternalOptimind.g:1177:3: ()
            // InternalOptimind.g:1178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConnectionAccess().getConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
            		
            // InternalOptimind.g:1188:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1189:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1189:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1190:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOptimind.g:1207:3: (otherlv_3= 'to' ( ( ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimind.g:1208:4: otherlv_3= 'to' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getToKeyword_3_0());
                    			
                    // InternalOptimind.g:1212:4: ( ( ruleEString ) )
                    // InternalOptimind.g:1213:5: ( ruleEString )
                    {
                    // InternalOptimind.g:1213:5: ( ruleEString )
                    // InternalOptimind.g:1214:6: ruleEString
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
    // InternalOptimind.g:1233:1: entryRuleLibraryFunction returns [EObject current=null] : iv_ruleLibraryFunction= ruleLibraryFunction EOF ;
    public final EObject entryRuleLibraryFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibraryFunction = null;


        try {
            // InternalOptimind.g:1233:56: (iv_ruleLibraryFunction= ruleLibraryFunction EOF )
            // InternalOptimind.g:1234:2: iv_ruleLibraryFunction= ruleLibraryFunction EOF
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
    // InternalOptimind.g:1240:1: ruleLibraryFunction returns [EObject current=null] : ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' ) ;
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
            // InternalOptimind.g:1246:2: ( ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' ) )
            // InternalOptimind.g:1247:2: ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' )
            {
            // InternalOptimind.g:1247:2: ( () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}' )
            // InternalOptimind.g:1248:3: () otherlv_1= 'LibraryFunction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'function' ( (lv_function_5_0= ruleEString ) ) ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )? ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )? otherlv_10= '}'
            {
            // InternalOptimind.g:1248:3: ()
            // InternalOptimind.g:1249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryFunctionAccess().getLibraryFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryFunctionAccess().getLibraryFunctionKeyword_1());
            		
            // InternalOptimind.g:1259:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1260:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1260:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1261:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryFunctionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLibraryFunctionAccess().getFunctionKeyword_4());
            		
            // InternalOptimind.g:1286:3: ( (lv_function_5_0= ruleEString ) )
            // InternalOptimind.g:1287:4: (lv_function_5_0= ruleEString )
            {
            // InternalOptimind.g:1287:4: (lv_function_5_0= ruleEString )
            // InternalOptimind.g:1288:5: lv_function_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryFunctionAccess().getFunctionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalOptimind.g:1305:3: ( ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptimind.g:1306:4: ( (lv_inputs_6_0= ruleInput ) ) ( (lv_inputs_7_0= ruleInput ) )*
                    {
                    // InternalOptimind.g:1306:4: ( (lv_inputs_6_0= ruleInput ) )
                    // InternalOptimind.g:1307:5: (lv_inputs_6_0= ruleInput )
                    {
                    // InternalOptimind.g:1307:5: (lv_inputs_6_0= ruleInput )
                    // InternalOptimind.g:1308:6: lv_inputs_6_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    // InternalOptimind.g:1325:4: ( (lv_inputs_7_0= ruleInput ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==32) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalOptimind.g:1326:5: (lv_inputs_7_0= ruleInput )
                    	    {
                    	    // InternalOptimind.g:1326:5: (lv_inputs_7_0= ruleInput )
                    	    // InternalOptimind.g:1327:6: lv_inputs_7_0= ruleInput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getInputsInputParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalOptimind.g:1345:3: ( ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimind.g:1346:4: ( (lv_outputs_8_0= ruleOutput ) ) ( (lv_outputs_9_0= ruleOutput ) )*
                    {
                    // InternalOptimind.g:1346:4: ( (lv_outputs_8_0= ruleOutput ) )
                    // InternalOptimind.g:1347:5: (lv_outputs_8_0= ruleOutput )
                    {
                    // InternalOptimind.g:1347:5: (lv_outputs_8_0= ruleOutput )
                    // InternalOptimind.g:1348:6: lv_outputs_8_0= ruleOutput
                    {

                    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalOptimind.g:1365:4: ( (lv_outputs_9_0= ruleOutput ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalOptimind.g:1366:5: (lv_outputs_9_0= ruleOutput )
                    	    {
                    	    // InternalOptimind.g:1366:5: (lv_outputs_9_0= ruleOutput )
                    	    // InternalOptimind.g:1367:6: lv_outputs_9_0= ruleOutput
                    	    {

                    	    						newCompositeNode(grammarAccess.getLibraryFunctionAccess().getOutputsOutputParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop35;
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
    // InternalOptimind.g:1393:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalOptimind.g:1393:46: (iv_ruleInput= ruleInput EOF )
            // InternalOptimind.g:1394:2: iv_ruleInput= ruleInput EOF
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
    // InternalOptimind.g:1400:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
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
            // InternalOptimind.g:1406:2: ( ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1407:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1407:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1408:3: () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1408:3: ()
            // InternalOptimind.g:1409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalOptimind.g:1419:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1420:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1420:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1421:5: lv_name_2_0= ruleEString
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

            // InternalOptimind.g:1438:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimind.g:1439:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:1443:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:1444:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:1444:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:1445:6: lv_typeAsString_4_0= ruleType
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

            // InternalOptimind.g:1463:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOptimind.g:1464:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:1468:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:1469:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:1469:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:1470:6: lv_valueAsString_6_0= ruleEString
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
    // InternalOptimind.g:1492:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalOptimind.g:1492:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalOptimind.g:1493:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalOptimind.g:1499:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) ;
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
            // InternalOptimind.g:1505:2: ( ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? ) )
            // InternalOptimind.g:1506:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            {
            // InternalOptimind.g:1506:2: ( () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )? )
            // InternalOptimind.g:1507:3: () otherlv_1= 'Output' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )? (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            {
            // InternalOptimind.g:1507:3: ()
            // InternalOptimind.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            // InternalOptimind.g:1518:3: ( (lv_name_2_0= ruleEString ) )
            // InternalOptimind.g:1519:4: (lv_name_2_0= ruleEString )
            {
            // InternalOptimind.g:1519:4: (lv_name_2_0= ruleEString )
            // InternalOptimind.g:1520:5: lv_name_2_0= ruleEString
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

            // InternalOptimind.g:1537:3: (otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOptimind.g:1538:4: otherlv_3= 'type' ( (lv_typeAsString_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getTypeKeyword_3_0());
                    			
                    // InternalOptimind.g:1542:4: ( (lv_typeAsString_4_0= ruleType ) )
                    // InternalOptimind.g:1543:5: (lv_typeAsString_4_0= ruleType )
                    {
                    // InternalOptimind.g:1543:5: (lv_typeAsString_4_0= ruleType )
                    // InternalOptimind.g:1544:6: lv_typeAsString_4_0= ruleType
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

            // InternalOptimind.g:1562:3: (otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==17) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptimind.g:1563:4: otherlv_5= 'value' ( (lv_valueAsString_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getValueKeyword_4_0());
                    			
                    // InternalOptimind.g:1567:4: ( (lv_valueAsString_6_0= ruleEString ) )
                    // InternalOptimind.g:1568:5: (lv_valueAsString_6_0= ruleEString )
                    {
                    // InternalOptimind.g:1568:5: (lv_valueAsString_6_0= ruleEString )
                    // InternalOptimind.g:1569:6: lv_valueAsString_6_0= ruleEString
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
    // InternalOptimind.g:1591:1: ruleProgLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) ) ;
    public final Enumerator ruleProgLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOptimind.g:1597:2: ( ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) ) )
            // InternalOptimind.g:1598:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) )
            {
            // InternalOptimind.g:1598:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Java' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            else if ( (LA41_0==34) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalOptimind.g:1599:3: (enumLiteral_0= 'Python' )
                    {
                    // InternalOptimind.g:1599:3: (enumLiteral_0= 'Python' )
                    // InternalOptimind.g:1600:4: enumLiteral_0= 'Python'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProgLanguageAccess().getPythonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:1607:3: (enumLiteral_1= 'Java' )
                    {
                    // InternalOptimind.g:1607:3: (enumLiteral_1= 'Java' )
                    // InternalOptimind.g:1608:4: enumLiteral_1= 'Java'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalOptimind.g:1618:1: ruleTaskStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) ) ;
    public final Enumerator ruleTaskStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOptimind.g:1624:2: ( ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) ) )
            // InternalOptimind.g:1625:2: ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) )
            {
            // InternalOptimind.g:1625:2: ( (enumLiteral_0= 'FINISHED' ) | (enumLiteral_1= 'PREPARED' ) | (enumLiteral_2= 'NOT_PREPARED' ) | (enumLiteral_3= 'PROCESSING' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt42=1;
                }
                break;
            case 36:
                {
                alt42=2;
                }
                break;
            case 37:
                {
                alt42=3;
                }
                break;
            case 38:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalOptimind.g:1626:3: (enumLiteral_0= 'FINISHED' )
                    {
                    // InternalOptimind.g:1626:3: (enumLiteral_0= 'FINISHED' )
                    // InternalOptimind.g:1627:4: enumLiteral_0= 'FINISHED'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskStatusAccess().getFINISHEDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOptimind.g:1634:3: (enumLiteral_1= 'PREPARED' )
                    {
                    // InternalOptimind.g:1634:3: (enumLiteral_1= 'PREPARED' )
                    // InternalOptimind.g:1635:4: enumLiteral_1= 'PREPARED'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskStatusAccess().getPREPAREDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOptimind.g:1642:3: (enumLiteral_2= 'NOT_PREPARED' )
                    {
                    // InternalOptimind.g:1642:3: (enumLiteral_2= 'NOT_PREPARED' )
                    // InternalOptimind.g:1643:4: enumLiteral_2= 'NOT_PREPARED'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskStatusAccess().getNOT_PREPAREDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOptimind.g:1650:3: (enumLiteral_3= 'PROCESSING' )
                    {
                    // InternalOptimind.g:1650:3: (enumLiteral_3= 'PROCESSING' )
                    // InternalOptimind.g:1651:4: enumLiteral_3= 'PROCESSING'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040046000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040044000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002DC4000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002D44000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002C44000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002844000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001908C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001900C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000100C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000001C08C000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001C00C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000400C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000010000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000C000L});

}