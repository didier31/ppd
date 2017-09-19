package org.xtext.ppd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ppd.services.PpdGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPpdParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PAGE", "RULE_ENDPAGE", "RULE_INT", "RULE_STRICT", "RULE_TEXT", "RULE_VST", "RULE_HST", "RULE_LA", "RULE_ENDLA", "RULE_GRID", "RULE_ENDGRID", "RULE_RJ", "RULE_ENDRJ", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'>'", "'+'"
    };
    public static final int RULE_RJ=15;
    public static final int RULE_LA=11;
    public static final int RULE_ENDRJ=16;
    public static final int RULE_GRID=13;
    public static final int RULE_STRING=19;
    public static final int RULE_VST=9;
    public static final int RULE_SL_COMMENT=21;
    public static final int RULE_STRICT=7;
    public static final int RULE_ENDGRID=14;
    public static final int RULE_PAGE=4;
    public static final int RULE_HST=10;
    public static final int EOF=-1;
    public static final int RULE_ENDLA=12;
    public static final int RULE_ID=18;
    public static final int RULE_WS=17;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_ENDPAGE=5;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=20;
    public static final int T__23=23;
    public static final int RULE_TEXT=8;
    public static final int T__24=24;

    // delegates
    // delegators


        public InternalPpdParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPpdParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPpdParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPpd.g"; }



     	private PpdGrammarAccess grammarAccess;

        public InternalPpdParser(TokenStream input, PpdGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected PpdGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalPpd.g:64:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalPpd.g:64:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalPpd.g:65:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalPpd.g:71:1: ruleDocument returns [EObject current=null] : ( () this_PAGE_1= RULE_PAGE ( (lv_paper_2_0= rulePaper ) )? otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* (this_ENDPAGE_5= RULE_ENDPAGE )? ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token this_PAGE_1=null;
        Token otherlv_3=null;
        Token this_ENDPAGE_5=null;
        EObject lv_paper_2_0 = null;

        EObject lv_contents_4_0 = null;



        	enterRule();

        try {
            // InternalPpd.g:77:2: ( ( () this_PAGE_1= RULE_PAGE ( (lv_paper_2_0= rulePaper ) )? otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* (this_ENDPAGE_5= RULE_ENDPAGE )? ) )
            // InternalPpd.g:78:2: ( () this_PAGE_1= RULE_PAGE ( (lv_paper_2_0= rulePaper ) )? otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* (this_ENDPAGE_5= RULE_ENDPAGE )? )
            {
            // InternalPpd.g:78:2: ( () this_PAGE_1= RULE_PAGE ( (lv_paper_2_0= rulePaper ) )? otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* (this_ENDPAGE_5= RULE_ENDPAGE )? )
            // InternalPpd.g:79:3: () this_PAGE_1= RULE_PAGE ( (lv_paper_2_0= rulePaper ) )? otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* (this_ENDPAGE_5= RULE_ENDPAGE )?
            {
            // InternalPpd.g:79:3: ()
            // InternalPpd.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDocumentAccess().getDocumentAction_0(),
            					current);
            			

            }

            this_PAGE_1=(Token)match(input,RULE_PAGE,FOLLOW_3); 

            			newLeafNode(this_PAGE_1, grammarAccess.getDocumentAccess().getPAGETerminalRuleCall_1());
            		
            // InternalPpd.g:90:3: ( (lv_paper_2_0= rulePaper ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPpd.g:91:4: (lv_paper_2_0= rulePaper )
                    {
                    // InternalPpd.g:91:4: (lv_paper_2_0= rulePaper )
                    // InternalPpd.g:92:5: lv_paper_2_0= rulePaper
                    {

                    					newCompositeNode(grammarAccess.getDocumentAccess().getPaperPaperParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_paper_2_0=rulePaper();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDocumentRule());
                    					}
                    					set(
                    						current,
                    						"paper",
                    						lv_paper_2_0,
                    						"org.xtext.ppd.Ppd.Paper");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDocumentAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPpd.g:113:3: ( (lv_contents_4_0= ruleContent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_TEXT && LA2_0<=RULE_LA)||LA2_0==RULE_GRID||LA2_0==RULE_RJ) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPpd.g:114:4: (lv_contents_4_0= ruleContent )
            	    {
            	    // InternalPpd.g:114:4: (lv_contents_4_0= ruleContent )
            	    // InternalPpd.g:115:5: lv_contents_4_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentAccess().getContentsContentParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contents_4_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contents",
            	    						lv_contents_4_0,
            	    						"org.xtext.ppd.Ppd.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPpd.g:132:3: (this_ENDPAGE_5= RULE_ENDPAGE )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ENDPAGE) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPpd.g:133:4: this_ENDPAGE_5= RULE_ENDPAGE
                    {
                    this_ENDPAGE_5=(Token)match(input,RULE_ENDPAGE,FOLLOW_2); 

                    				newLeafNode(this_ENDPAGE_5, grammarAccess.getDocumentAccess().getENDPAGETerminalRuleCall_5());
                    			

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRulePaper"
    // InternalPpd.g:142:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalPpd.g:142:46: (iv_rulePaper= rulePaper EOF )
            // InternalPpd.g:143:2: iv_rulePaper= rulePaper EOF
            {
             newCompositeNode(grammarAccess.getPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaper=rulePaper();

            state._fsp--;

             current =iv_rulePaper; 
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
    // $ANTLR end "entryRulePaper"


    // $ANTLR start "rulePaper"
    // InternalPpd.g:149:1: rulePaper returns [EObject current=null] : ( ( (lv_width_0_0= RULE_INT ) ) ( (lv_folding_1_0= RULE_STRICT ) )? ) ;
    public final EObject rulePaper() throws RecognitionException {
        EObject current = null;

        Token lv_width_0_0=null;
        Token lv_folding_1_0=null;


        	enterRule();

        try {
            // InternalPpd.g:155:2: ( ( ( (lv_width_0_0= RULE_INT ) ) ( (lv_folding_1_0= RULE_STRICT ) )? ) )
            // InternalPpd.g:156:2: ( ( (lv_width_0_0= RULE_INT ) ) ( (lv_folding_1_0= RULE_STRICT ) )? )
            {
            // InternalPpd.g:156:2: ( ( (lv_width_0_0= RULE_INT ) ) ( (lv_folding_1_0= RULE_STRICT ) )? )
            // InternalPpd.g:157:3: ( (lv_width_0_0= RULE_INT ) ) ( (lv_folding_1_0= RULE_STRICT ) )?
            {
            // InternalPpd.g:157:3: ( (lv_width_0_0= RULE_INT ) )
            // InternalPpd.g:158:4: (lv_width_0_0= RULE_INT )
            {
            // InternalPpd.g:158:4: (lv_width_0_0= RULE_INT )
            // InternalPpd.g:159:5: lv_width_0_0= RULE_INT
            {
            lv_width_0_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_width_0_0, grammarAccess.getPaperAccess().getWidthINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaperRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPpd.g:175:3: ( (lv_folding_1_0= RULE_STRICT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRICT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPpd.g:176:4: (lv_folding_1_0= RULE_STRICT )
                    {
                    // InternalPpd.g:176:4: (lv_folding_1_0= RULE_STRICT )
                    // InternalPpd.g:177:5: lv_folding_1_0= RULE_STRICT
                    {
                    lv_folding_1_0=(Token)match(input,RULE_STRICT,FOLLOW_2); 

                    					newLeafNode(lv_folding_1_0, grammarAccess.getPaperAccess().getFoldingSTRICTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPaperRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"folding",
                    						true,
                    						"org.xtext.ppd.Ppd.STRICT");
                    				

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
    // $ANTLR end "rulePaper"


    // $ANTLR start "entryRuleContent"
    // InternalPpd.g:197:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalPpd.g:197:48: (iv_ruleContent= ruleContent EOF )
            // InternalPpd.g:198:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalPpd.g:204:1: ruleContent returns [EObject current=null] : ( ( (lv_vs_0_0= ruleVS ) )? ( (lv_hs_1_0= ruleHS ) )? ( (lv_simpleContent_2_0= ruleSimpleContent ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject lv_vs_0_0 = null;

        EObject lv_hs_1_0 = null;

        EObject lv_simpleContent_2_0 = null;



        	enterRule();

        try {
            // InternalPpd.g:210:2: ( ( ( (lv_vs_0_0= ruleVS ) )? ( (lv_hs_1_0= ruleHS ) )? ( (lv_simpleContent_2_0= ruleSimpleContent ) ) ) )
            // InternalPpd.g:211:2: ( ( (lv_vs_0_0= ruleVS ) )? ( (lv_hs_1_0= ruleHS ) )? ( (lv_simpleContent_2_0= ruleSimpleContent ) ) )
            {
            // InternalPpd.g:211:2: ( ( (lv_vs_0_0= ruleVS ) )? ( (lv_hs_1_0= ruleHS ) )? ( (lv_simpleContent_2_0= ruleSimpleContent ) ) )
            // InternalPpd.g:212:3: ( (lv_vs_0_0= ruleVS ) )? ( (lv_hs_1_0= ruleHS ) )? ( (lv_simpleContent_2_0= ruleSimpleContent ) )
            {
            // InternalPpd.g:212:3: ( (lv_vs_0_0= ruleVS ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VST) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPpd.g:213:4: (lv_vs_0_0= ruleVS )
                    {
                    // InternalPpd.g:213:4: (lv_vs_0_0= ruleVS )
                    // InternalPpd.g:214:5: lv_vs_0_0= ruleVS
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getVsVSParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_vs_0_0=ruleVS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"vs",
                    						lv_vs_0_0,
                    						"org.xtext.ppd.Ppd.VS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPpd.g:231:3: ( (lv_hs_1_0= ruleHS ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_HST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPpd.g:232:4: (lv_hs_1_0= ruleHS )
                    {
                    // InternalPpd.g:232:4: (lv_hs_1_0= ruleHS )
                    // InternalPpd.g:233:5: lv_hs_1_0= ruleHS
                    {

                    					newCompositeNode(grammarAccess.getContentAccess().getHsHSParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_hs_1_0=ruleHS();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentRule());
                    					}
                    					set(
                    						current,
                    						"hs",
                    						lv_hs_1_0,
                    						"org.xtext.ppd.Ppd.HS");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPpd.g:250:3: ( (lv_simpleContent_2_0= ruleSimpleContent ) )
            // InternalPpd.g:251:4: (lv_simpleContent_2_0= ruleSimpleContent )
            {
            // InternalPpd.g:251:4: (lv_simpleContent_2_0= ruleSimpleContent )
            // InternalPpd.g:252:5: lv_simpleContent_2_0= ruleSimpleContent
            {

            					newCompositeNode(grammarAccess.getContentAccess().getSimpleContentSimpleContentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_simpleContent_2_0=ruleSimpleContent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentRule());
            					}
            					set(
            						current,
            						"simpleContent",
            						lv_simpleContent_2_0,
            						"org.xtext.ppd.Ppd.SimpleContent");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleSimpleContent"
    // InternalPpd.g:273:1: entryRuleSimpleContent returns [EObject current=null] : iv_ruleSimpleContent= ruleSimpleContent EOF ;
    public final EObject entryRuleSimpleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleContent = null;


        try {
            // InternalPpd.g:273:54: (iv_ruleSimpleContent= ruleSimpleContent EOF )
            // InternalPpd.g:274:2: iv_ruleSimpleContent= ruleSimpleContent EOF
            {
             newCompositeNode(grammarAccess.getSimpleContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleContent=ruleSimpleContent();

            state._fsp--;

             current =iv_ruleSimpleContent; 
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
    // $ANTLR end "entryRuleSimpleContent"


    // $ANTLR start "ruleSimpleContent"
    // InternalPpd.g:280:1: ruleSimpleContent returns [EObject current=null] : (this_Frame_0= ruleFrame | this_Textual_1= ruleTextual ) ;
    public final EObject ruleSimpleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Frame_0 = null;

        EObject this_Textual_1 = null;



        	enterRule();

        try {
            // InternalPpd.g:286:2: ( (this_Frame_0= ruleFrame | this_Textual_1= ruleTextual ) )
            // InternalPpd.g:287:2: (this_Frame_0= ruleFrame | this_Textual_1= ruleTextual )
            {
            // InternalPpd.g:287:2: (this_Frame_0= ruleFrame | this_Textual_1= ruleTextual )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_LA||LA7_0==RULE_GRID||LA7_0==RULE_RJ) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_TEXT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPpd.g:288:3: this_Frame_0= ruleFrame
                    {

                    			newCompositeNode(grammarAccess.getSimpleContentAccess().getFrameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Frame_0=ruleFrame();

                    state._fsp--;


                    			current = this_Frame_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPpd.g:297:3: this_Textual_1= ruleTextual
                    {

                    			newCompositeNode(grammarAccess.getSimpleContentAccess().getTextualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Textual_1=ruleTextual();

                    state._fsp--;


                    			current = this_Textual_1;
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
    // $ANTLR end "ruleSimpleContent"


    // $ANTLR start "entryRuleTextual"
    // InternalPpd.g:309:1: entryRuleTextual returns [EObject current=null] : iv_ruleTextual= ruleTextual EOF ;
    public final EObject entryRuleTextual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextual = null;


        try {
            // InternalPpd.g:309:48: (iv_ruleTextual= ruleTextual EOF )
            // InternalPpd.g:310:2: iv_ruleTextual= ruleTextual EOF
            {
             newCompositeNode(grammarAccess.getTextualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextual=ruleTextual();

            state._fsp--;

             current =iv_ruleTextual; 
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
    // $ANTLR end "entryRuleTextual"


    // $ANTLR start "ruleTextual"
    // InternalPpd.g:316:1: ruleTextual returns [EObject current=null] : ( (lv_text_0_0= RULE_TEXT ) ) ;
    public final EObject ruleTextual() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalPpd.g:322:2: ( ( (lv_text_0_0= RULE_TEXT ) ) )
            // InternalPpd.g:323:2: ( (lv_text_0_0= RULE_TEXT ) )
            {
            // InternalPpd.g:323:2: ( (lv_text_0_0= RULE_TEXT ) )
            // InternalPpd.g:324:3: (lv_text_0_0= RULE_TEXT )
            {
            // InternalPpd.g:324:3: (lv_text_0_0= RULE_TEXT )
            // InternalPpd.g:325:4: lv_text_0_0= RULE_TEXT
            {
            lv_text_0_0=(Token)match(input,RULE_TEXT,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextualAccess().getTextTEXTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextualRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.xtext.ppd.Ppd.TEXT");
            			

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
    // $ANTLR end "ruleTextual"


    // $ANTLR start "entryRuleFrame"
    // InternalPpd.g:344:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalPpd.g:344:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalPpd.g:345:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalPpd.g:351:1: ruleFrame returns [EObject current=null] : (this_GB_0= ruleGB | this_LAB_1= ruleLAB | this_RJB_2= ruleRJB ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        EObject this_GB_0 = null;

        EObject this_LAB_1 = null;

        EObject this_RJB_2 = null;



        	enterRule();

        try {
            // InternalPpd.g:357:2: ( (this_GB_0= ruleGB | this_LAB_1= ruleLAB | this_RJB_2= ruleRJB ) )
            // InternalPpd.g:358:2: (this_GB_0= ruleGB | this_LAB_1= ruleLAB | this_RJB_2= ruleRJB )
            {
            // InternalPpd.g:358:2: (this_GB_0= ruleGB | this_LAB_1= ruleLAB | this_RJB_2= ruleRJB )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_GRID:
                {
                alt8=1;
                }
                break;
            case RULE_LA:
                {
                alt8=2;
                }
                break;
            case RULE_RJ:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPpd.g:359:3: this_GB_0= ruleGB
                    {

                    			newCompositeNode(grammarAccess.getFrameAccess().getGBParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GB_0=ruleGB();

                    state._fsp--;


                    			current = this_GB_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPpd.g:368:3: this_LAB_1= ruleLAB
                    {

                    			newCompositeNode(grammarAccess.getFrameAccess().getLABParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LAB_1=ruleLAB();

                    state._fsp--;


                    			current = this_LAB_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPpd.g:377:3: this_RJB_2= ruleRJB
                    {

                    			newCompositeNode(grammarAccess.getFrameAccess().getRJBParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RJB_2=ruleRJB();

                    state._fsp--;


                    			current = this_RJB_2;
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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleVS"
    // InternalPpd.g:389:1: entryRuleVS returns [EObject current=null] : iv_ruleVS= ruleVS EOF ;
    public final EObject entryRuleVS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVS = null;


        try {
            // InternalPpd.g:389:43: (iv_ruleVS= ruleVS EOF )
            // InternalPpd.g:390:2: iv_ruleVS= ruleVS EOF
            {
             newCompositeNode(grammarAccess.getVSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVS=ruleVS();

            state._fsp--;

             current =iv_ruleVS; 
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
    // $ANTLR end "entryRuleVS"


    // $ANTLR start "ruleVS"
    // InternalPpd.g:396:1: ruleVS returns [EObject current=null] : (this_VST_0= RULE_VST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' ) ;
    public final EObject ruleVS() throws RecognitionException {
        EObject current = null;

        Token this_VST_0=null;
        Token lv_spc_1_0=null;
        Token lv_more_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPpd.g:402:2: ( (this_VST_0= RULE_VST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' ) )
            // InternalPpd.g:403:2: (this_VST_0= RULE_VST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' )
            {
            // InternalPpd.g:403:2: (this_VST_0= RULE_VST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' )
            // InternalPpd.g:404:3: this_VST_0= RULE_VST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>'
            {
            this_VST_0=(Token)match(input,RULE_VST,FOLLOW_8); 

            			newLeafNode(this_VST_0, grammarAccess.getVSAccess().getVSTTerminalRuleCall_0());
            		
            // InternalPpd.g:408:3: ( (lv_spc_1_0= RULE_INT ) )
            // InternalPpd.g:409:4: (lv_spc_1_0= RULE_INT )
            {
            // InternalPpd.g:409:4: (lv_spc_1_0= RULE_INT )
            // InternalPpd.g:410:5: lv_spc_1_0= RULE_INT
            {
            lv_spc_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_spc_1_0, grammarAccess.getVSAccess().getSpcINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"spc",
            						lv_spc_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPpd.g:426:3: ( (lv_more_2_0= '+' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPpd.g:427:4: (lv_more_2_0= '+' )
                    {
                    // InternalPpd.g:427:4: (lv_more_2_0= '+' )
                    // InternalPpd.g:428:5: lv_more_2_0= '+'
                    {
                    lv_more_2_0=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(lv_more_2_0, grammarAccess.getVSAccess().getMorePlusSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVSRule());
                    					}
                    					setWithLastConsumed(current, "more", true, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getVSAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleVS"


    // $ANTLR start "entryRuleHS"
    // InternalPpd.g:448:1: entryRuleHS returns [EObject current=null] : iv_ruleHS= ruleHS EOF ;
    public final EObject entryRuleHS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHS = null;


        try {
            // InternalPpd.g:448:43: (iv_ruleHS= ruleHS EOF )
            // InternalPpd.g:449:2: iv_ruleHS= ruleHS EOF
            {
             newCompositeNode(grammarAccess.getHSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHS=ruleHS();

            state._fsp--;

             current =iv_ruleHS; 
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
    // $ANTLR end "entryRuleHS"


    // $ANTLR start "ruleHS"
    // InternalPpd.g:455:1: ruleHS returns [EObject current=null] : (this_HST_0= RULE_HST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' ) ;
    public final EObject ruleHS() throws RecognitionException {
        EObject current = null;

        Token this_HST_0=null;
        Token lv_spc_1_0=null;
        Token lv_more_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPpd.g:461:2: ( (this_HST_0= RULE_HST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' ) )
            // InternalPpd.g:462:2: (this_HST_0= RULE_HST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' )
            {
            // InternalPpd.g:462:2: (this_HST_0= RULE_HST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>' )
            // InternalPpd.g:463:3: this_HST_0= RULE_HST ( (lv_spc_1_0= RULE_INT ) ) ( (lv_more_2_0= '+' ) )? otherlv_3= '>'
            {
            this_HST_0=(Token)match(input,RULE_HST,FOLLOW_8); 

            			newLeafNode(this_HST_0, grammarAccess.getHSAccess().getHSTTerminalRuleCall_0());
            		
            // InternalPpd.g:467:3: ( (lv_spc_1_0= RULE_INT ) )
            // InternalPpd.g:468:4: (lv_spc_1_0= RULE_INT )
            {
            // InternalPpd.g:468:4: (lv_spc_1_0= RULE_INT )
            // InternalPpd.g:469:5: lv_spc_1_0= RULE_INT
            {
            lv_spc_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_spc_1_0, grammarAccess.getHSAccess().getSpcINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"spc",
            						lv_spc_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPpd.g:485:3: ( (lv_more_2_0= '+' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPpd.g:486:4: (lv_more_2_0= '+' )
                    {
                    // InternalPpd.g:486:4: (lv_more_2_0= '+' )
                    // InternalPpd.g:487:5: lv_more_2_0= '+'
                    {
                    lv_more_2_0=(Token)match(input,24,FOLLOW_4); 

                    					newLeafNode(lv_more_2_0, grammarAccess.getHSAccess().getMorePlusSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHSRule());
                    					}
                    					setWithLastConsumed(current, "more", true, "+");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getHSAccess().getGreaterThanSignKeyword_3());
            		

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
    // $ANTLR end "ruleHS"


    // $ANTLR start "entryRuleLAB"
    // InternalPpd.g:507:1: entryRuleLAB returns [EObject current=null] : iv_ruleLAB= ruleLAB EOF ;
    public final EObject entryRuleLAB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLAB = null;


        try {
            // InternalPpd.g:507:44: (iv_ruleLAB= ruleLAB EOF )
            // InternalPpd.g:508:2: iv_ruleLAB= ruleLAB EOF
            {
             newCompositeNode(grammarAccess.getLABRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLAB=ruleLAB();

            state._fsp--;

             current =iv_ruleLAB; 
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
    // $ANTLR end "entryRuleLAB"


    // $ANTLR start "ruleLAB"
    // InternalPpd.g:514:1: ruleLAB returns [EObject current=null] : ( () (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA ) ) ;
    public final EObject ruleLAB() throws RecognitionException {
        EObject current = null;

        Token this_LA_1=null;
        Token this_ENDLA_3=null;
        EObject lv_contents_2_0 = null;



        	enterRule();

        try {
            // InternalPpd.g:520:2: ( ( () (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA ) ) )
            // InternalPpd.g:521:2: ( () (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA ) )
            {
            // InternalPpd.g:521:2: ( () (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA ) )
            // InternalPpd.g:522:3: () (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA )
            {
            // InternalPpd.g:522:3: ()
            // InternalPpd.g:523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLABAccess().getLABAction_0(),
            					current);
            			

            }

            // InternalPpd.g:529:3: (this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA )
            // InternalPpd.g:530:4: this_LA_1= RULE_LA ( (lv_contents_2_0= ruleContent ) )* this_ENDLA_3= RULE_ENDLA
            {
            this_LA_1=(Token)match(input,RULE_LA,FOLLOW_10); 

            				newLeafNode(this_LA_1, grammarAccess.getLABAccess().getLATerminalRuleCall_1_0());
            			
            // InternalPpd.g:534:4: ( (lv_contents_2_0= ruleContent ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_TEXT && LA11_0<=RULE_LA)||LA11_0==RULE_GRID||LA11_0==RULE_RJ) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPpd.g:535:5: (lv_contents_2_0= ruleContent )
            	    {
            	    // InternalPpd.g:535:5: (lv_contents_2_0= ruleContent )
            	    // InternalPpd.g:536:6: lv_contents_2_0= ruleContent
            	    {

            	    						newCompositeNode(grammarAccess.getLABAccess().getContentsContentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_contents_2_0=ruleContent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLABRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contents",
            	    							lv_contents_2_0,
            	    							"org.xtext.ppd.Ppd.Content");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            this_ENDLA_3=(Token)match(input,RULE_ENDLA,FOLLOW_2); 

            				newLeafNode(this_ENDLA_3, grammarAccess.getLABAccess().getENDLATerminalRuleCall_1_2());
            			

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
    // $ANTLR end "ruleLAB"


    // $ANTLR start "entryRuleGB"
    // InternalPpd.g:562:1: entryRuleGB returns [EObject current=null] : iv_ruleGB= ruleGB EOF ;
    public final EObject entryRuleGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGB = null;


        try {
            // InternalPpd.g:562:43: (iv_ruleGB= ruleGB EOF )
            // InternalPpd.g:563:2: iv_ruleGB= ruleGB EOF
            {
             newCompositeNode(grammarAccess.getGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGB=ruleGB();

            state._fsp--;

             current =iv_ruleGB; 
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
    // $ANTLR end "entryRuleGB"


    // $ANTLR start "ruleGB"
    // InternalPpd.g:569:1: ruleGB returns [EObject current=null] : ( () (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID ) ) ;
    public final EObject ruleGB() throws RecognitionException {
        EObject current = null;

        Token this_GRID_1=null;
        Token lv_columns_2_0=null;
        Token otherlv_3=null;
        Token this_ENDGRID_5=null;
        EObject lv_contents_4_0 = null;



        	enterRule();

        try {
            // InternalPpd.g:575:2: ( ( () (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID ) ) )
            // InternalPpd.g:576:2: ( () (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID ) )
            {
            // InternalPpd.g:576:2: ( () (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID ) )
            // InternalPpd.g:577:3: () (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID )
            {
            // InternalPpd.g:577:3: ()
            // InternalPpd.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGBAccess().getGBAction_0(),
            					current);
            			

            }

            // InternalPpd.g:584:3: (this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID )
            // InternalPpd.g:585:4: this_GRID_1= RULE_GRID ( (lv_columns_2_0= RULE_INT ) ) otherlv_3= '>' ( (lv_contents_4_0= ruleContent ) )* this_ENDGRID_5= RULE_ENDGRID
            {
            this_GRID_1=(Token)match(input,RULE_GRID,FOLLOW_8); 

            				newLeafNode(this_GRID_1, grammarAccess.getGBAccess().getGRIDTerminalRuleCall_1_0());
            			
            // InternalPpd.g:589:4: ( (lv_columns_2_0= RULE_INT ) )
            // InternalPpd.g:590:5: (lv_columns_2_0= RULE_INT )
            {
            // InternalPpd.g:590:5: (lv_columns_2_0= RULE_INT )
            // InternalPpd.g:591:6: lv_columns_2_0= RULE_INT
            {
            lv_columns_2_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            						newLeafNode(lv_columns_2_0, grammarAccess.getGBAccess().getColumnsINTTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGBRule());
            						}
            						setWithLastConsumed(
            							current,
            							"columns",
            							lv_columns_2_0,
            							"org.eclipse.xtext.common.Terminals.INT");
            					

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getGBAccess().getGreaterThanSignKeyword_1_2());
            			
            // InternalPpd.g:611:4: ( (lv_contents_4_0= ruleContent ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_TEXT && LA12_0<=RULE_LA)||LA12_0==RULE_GRID||LA12_0==RULE_RJ) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPpd.g:612:5: (lv_contents_4_0= ruleContent )
            	    {
            	    // InternalPpd.g:612:5: (lv_contents_4_0= ruleContent )
            	    // InternalPpd.g:613:6: lv_contents_4_0= ruleContent
            	    {

            	    						newCompositeNode(grammarAccess.getGBAccess().getContentsContentParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_contents_4_0=ruleContent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGBRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contents",
            	    							lv_contents_4_0,
            	    							"org.xtext.ppd.Ppd.Content");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_ENDGRID_5=(Token)match(input,RULE_ENDGRID,FOLLOW_2); 

            				newLeafNode(this_ENDGRID_5, grammarAccess.getGBAccess().getENDGRIDTerminalRuleCall_1_4());
            			

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
    // $ANTLR end "ruleGB"


    // $ANTLR start "entryRuleRJB"
    // InternalPpd.g:639:1: entryRuleRJB returns [EObject current=null] : iv_ruleRJB= ruleRJB EOF ;
    public final EObject entryRuleRJB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRJB = null;


        try {
            // InternalPpd.g:639:44: (iv_ruleRJB= ruleRJB EOF )
            // InternalPpd.g:640:2: iv_ruleRJB= ruleRJB EOF
            {
             newCompositeNode(grammarAccess.getRJBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRJB=ruleRJB();

            state._fsp--;

             current =iv_ruleRJB; 
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
    // $ANTLR end "entryRuleRJB"


    // $ANTLR start "ruleRJB"
    // InternalPpd.g:646:1: ruleRJB returns [EObject current=null] : ( () (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ ) ) ;
    public final EObject ruleRJB() throws RecognitionException {
        EObject current = null;

        Token this_RJ_1=null;
        Token this_ENDRJ_3=null;
        EObject lv_contents_2_0 = null;



        	enterRule();

        try {
            // InternalPpd.g:652:2: ( ( () (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ ) ) )
            // InternalPpd.g:653:2: ( () (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ ) )
            {
            // InternalPpd.g:653:2: ( () (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ ) )
            // InternalPpd.g:654:3: () (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ )
            {
            // InternalPpd.g:654:3: ()
            // InternalPpd.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRJBAccess().getRJBAction_0(),
            					current);
            			

            }

            // InternalPpd.g:661:3: (this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ )
            // InternalPpd.g:662:4: this_RJ_1= RULE_RJ ( (lv_contents_2_0= ruleContent ) )* this_ENDRJ_3= RULE_ENDRJ
            {
            this_RJ_1=(Token)match(input,RULE_RJ,FOLLOW_12); 

            				newLeafNode(this_RJ_1, grammarAccess.getRJBAccess().getRJTerminalRuleCall_1_0());
            			
            // InternalPpd.g:666:4: ( (lv_contents_2_0= ruleContent ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_TEXT && LA13_0<=RULE_LA)||LA13_0==RULE_GRID||LA13_0==RULE_RJ) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPpd.g:667:5: (lv_contents_2_0= ruleContent )
            	    {
            	    // InternalPpd.g:667:5: (lv_contents_2_0= ruleContent )
            	    // InternalPpd.g:668:6: lv_contents_2_0= ruleContent
            	    {

            	    						newCompositeNode(grammarAccess.getRJBAccess().getContentsContentParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_contents_2_0=ruleContent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRJBRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contents",
            	    							lv_contents_2_0,
            	    							"org.xtext.ppd.Ppd.Content");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_ENDRJ_3=(Token)match(input,RULE_ENDRJ,FOLLOW_2); 

            				newLeafNode(this_ENDRJ_3, grammarAccess.getRJBAccess().getENDRJTerminalRuleCall_1_2());
            			

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
    // $ANTLR end "ruleRJB"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000AF22L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000AF00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000BF00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000EF00L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001AF00L});

}