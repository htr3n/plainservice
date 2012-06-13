package at.ac.univie.cs.swa.soa.parser.antlr.internal; 

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
import at.ac.univie.cs.swa.soa.services.SDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'Service'", "'{'", "'operation'", "'}'", "'input'", "':'", "'output'", "'Node'", "'uri'", "'='", "'hosts'", "','", "'complex-data'", "'.'", "'.*'", "'import'", "'string'", "'integer'", "'float'", "'date'", "'time'", "'dateTime'", "'binary'", "'boolean'", "'?'", "'+'", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSDLParser.tokenNames; }
    public String getGrammarFileName() { return "../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g"; }



     	private SDLGrammarAccess grammarAccess;
     	
        public InternalSDLParser(TokenStream input, SDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SDL";	
       	}
       	
       	@Override
       	protected SDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSDL"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:68:1: entryRuleSDL returns [EObject current=null] : iv_ruleSDL= ruleSDL EOF ;
    public final EObject entryRuleSDL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSDL = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:69:2: (iv_ruleSDL= ruleSDL EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:70:2: iv_ruleSDL= ruleSDL EOF
            {
             newCompositeNode(grammarAccess.getSDLRule()); 
            pushFollow(FOLLOW_ruleSDL_in_entryRuleSDL75);
            iv_ruleSDL=ruleSDL();

            state._fsp--;

             current =iv_ruleSDL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDL85); 

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
    // $ANTLR end "entryRuleSDL"


    // $ANTLR start "ruleSDL"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:77:1: ruleSDL returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* ) ;
    public final EObject ruleSDL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_data_5_0 = null;

        EObject lv_nodes_6_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:80:28: ( ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:81:2: () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )*
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:81:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSDLAccess().getSDLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleSDL131); 

                	newLeafNode(otherlv_1, grammarAccess.getSDLAccess().getModuleKeyword_1());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:91:1: ( (lv_name_2_0= ruleFQN ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:92:1: (lv_name_2_0= ruleFQN )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:92:1: (lv_name_2_0= ruleFQN )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:93:3: lv_name_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getSDLAccess().getNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleSDL152);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSDLRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:109:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:110:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:110:1: (lv_imports_3_0= ruleImport )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:111:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDLAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleSDL173);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:127:3: ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:127:4: ( (lv_services_4_0= ruleService ) )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:127:4: ( (lv_services_4_0= ruleService ) )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:128:1: (lv_services_4_0= ruleService )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:128:1: (lv_services_4_0= ruleService )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:129:3: lv_services_4_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDLAccess().getServicesServiceParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleSDL196);
            	    lv_services_4_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_4_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:146:6: ( (lv_data_5_0= ruleDataElement ) )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:146:6: ( (lv_data_5_0= ruleDataElement ) )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:147:1: (lv_data_5_0= ruleDataElement )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:147:1: (lv_data_5_0= ruleDataElement )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:148:3: lv_data_5_0= ruleDataElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDLAccess().getDataDataElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataElement_in_ruleSDL223);
            	    lv_data_5_0=ruleDataElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"data",
            	            		lv_data_5_0, 
            	            		"DataElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:165:6: ( (lv_nodes_6_0= ruleNode ) )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:165:6: ( (lv_nodes_6_0= ruleNode ) )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:166:1: (lv_nodes_6_0= ruleNode )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:166:1: (lv_nodes_6_0= ruleNode )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:167:3: lv_nodes_6_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSDLAccess().getNodesNodeParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleSDL250);
            	    lv_nodes_6_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSDLRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodes",
            	            		lv_nodes_6_0, 
            	            		"Node");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleSDL"


    // $ANTLR start "entryRuleService"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:191:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:192:2: (iv_ruleService= ruleService EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:193:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService288);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService298); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:200:1: ruleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:203:28: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:204:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:204:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:204:2: () otherlv_1= 'Service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}'
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:204:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:205:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServiceAccess().getServiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleService344); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:214:1: ( (lv_name_2_0= RULE_ID ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:215:1: (lv_name_2_0= RULE_ID )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:215:1: (lv_name_2_0= RULE_ID )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:216:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService361); 

            			newLeafNode(lv_name_2_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleService378); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:236:1: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:236:3: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleService391); 

            	        	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getOperationKeyword_4_0());
            	        
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:240:1: ( (lv_operations_5_0= ruleOperation ) )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:241:1: (lv_operations_5_0= ruleOperation )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:241:1: (lv_operations_5_0= ruleOperation )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:242:3: lv_operations_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleService412);
            	    lv_operations_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_5_0, 
            	            		"Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleService426); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleOperation"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:270:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:271:2: (iv_ruleOperation= ruleOperation EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:272:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation462);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation472); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:279:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_inputName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_outputName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:282:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:283:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:283:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:283:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}'
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:283:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:284:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:289:2: ( (lv_name_1_0= RULE_ID ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:290:1: (lv_name_1_0= RULE_ID )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:290:1: (lv_name_1_0= RULE_ID )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:291:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation523); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleOperation540); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:311:1: (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:311:3: otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOperation553); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getInputKeyword_3_0());
                        
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:315:1: ( (lv_inputName_4_0= RULE_STRING ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:316:1: (lv_inputName_4_0= RULE_STRING )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:316:1: (lv_inputName_4_0= RULE_STRING )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:317:3: lv_inputName_4_0= RULE_STRING
                    {
                    lv_inputName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOperation570); 

                    			newLeafNode(lv_inputName_4_0, grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"inputName",
                            		lv_inputName_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOperation587); 

                        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getColonKeyword_3_2());
                        
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:337:1: ( ( ruleFQN ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:338:1: ( ruleFQN )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:338:1: ( ruleFQN )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:339:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperation610);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:352:4: (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:352:6: otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOperation625); 

                        	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getOutputKeyword_4_0());
                        
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:356:1: ( (lv_outputName_8_0= RULE_STRING ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:357:1: (lv_outputName_8_0= RULE_STRING )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:357:1: (lv_outputName_8_0= RULE_STRING )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:358:3: lv_outputName_8_0= RULE_STRING
                    {
                    lv_outputName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOperation642); 

                    			newLeafNode(lv_outputName_8_0, grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"outputName",
                            		lv_outputName_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleOperation659); 

                        	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_4_2());
                        
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:378:1: ( ( ruleFQN ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:379:1: ( ruleFQN )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:379:1: ( ruleFQN )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:380:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperation682);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleOperation696); 

                	newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleNode"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:405:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:406:2: (iv_ruleNode= ruleNode EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:407:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode732);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode742); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:414:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_baseURI_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:417:28: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:418:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:418:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:418:2: () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}'
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:418:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:419:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNodeAccess().getNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleNode788); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:428:1: ( (lv_name_2_0= RULE_ID ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:429:1: (lv_name_2_0= RULE_ID )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:429:1: (lv_name_2_0= RULE_ID )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:430:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode805); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleNode822); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getUriKeyword_3());
                
            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleNode834); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEqualsSignKeyword_4());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:454:1: ( (lv_baseURI_5_0= RULE_STRING ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:455:1: (lv_baseURI_5_0= RULE_STRING )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:455:1: (lv_baseURI_5_0= RULE_STRING )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:456:3: lv_baseURI_5_0= RULE_STRING
            {
            lv_baseURI_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode851); 

            			newLeafNode(lv_baseURI_5_0, grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"baseURI",
                    		lv_baseURI_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleNode868); 

                	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getHostsKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNode880); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:480:1: ( ( ruleFQN ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:481:1: ( ruleFQN )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:481:1: ( ruleFQN )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:482:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNode903);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:495:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:495:4: otherlv_9= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleNode916); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getCommaKeyword_9_0());
            	        
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:499:1: ( ( ruleFQN ) )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:500:1: ( ruleFQN )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:500:1: ( ruleFQN )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:501:3: ruleFQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNodeRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFQN_in_ruleNode939);
            	    ruleFQN();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleNode953); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleDataElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:526:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:527:2: (iv_ruleDataElement= ruleDataElement EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:528:2: iv_ruleDataElement= ruleDataElement EOF
            {
             newCompositeNode(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement989);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;

             current =iv_ruleDataElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement999); 

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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:535:1: ruleDataElement returns [EObject current=null] : (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleElement_0 = null;

        EObject this_ComplexElement_1 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:538:28: ( (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:539:1: (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:539:1: (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:540:5: this_SimpleElement_0= ruleSimpleElement
                    {
                     
                            newCompositeNode(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleElement_in_ruleDataElement1046);
                    this_SimpleElement_0=ruleSimpleElement();

                    state._fsp--;

                     
                            current = this_SimpleElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:550:5: this_ComplexElement_1= ruleComplexElement
                    {
                     
                            newCompositeNode(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexElement_in_ruleDataElement1073);
                    this_ComplexElement_1=ruleComplexElement();

                    state._fsp--;

                     
                            current = this_ComplexElement_1; 
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
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleComplexElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:566:1: entryRuleComplexElement returns [EObject current=null] : iv_ruleComplexElement= ruleComplexElement EOF ;
    public final EObject entryRuleComplexElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexElement = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:567:2: (iv_ruleComplexElement= ruleComplexElement EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:568:2: iv_ruleComplexElement= ruleComplexElement EOF
            {
             newCompositeNode(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_ruleComplexElement_in_entryRuleComplexElement1108);
            iv_ruleComplexElement=ruleComplexElement();

            state._fsp--;

             current =iv_ruleComplexElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexElement1118); 

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
    // $ANTLR end "entryRuleComplexElement"


    // $ANTLR start "ruleComplexElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:575:1: ruleComplexElement returns [EObject current=null] : ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleComplexElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:578:28: ( ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:579:1: ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:579:1: ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:579:2: () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}'
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:579:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:580:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComplexElementAccess().getComplexElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleComplexElement1164); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexElementAccess().getComplexDataKeyword_1());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:589:1: ( (lv_name_2_0= RULE_ID ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:590:1: (lv_name_2_0= RULE_ID )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:590:1: (lv_name_2_0= RULE_ID )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:591:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexElement1181); 

            			newLeafNode(lv_name_2_0, grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleComplexElement1198); 

                	newLeafNode(otherlv_3, grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:611:1: ( (lv_elements_4_0= ruleSimpleElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:612:1: (lv_elements_4_0= ruleSimpleElement )
            	    {
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:612:1: (lv_elements_4_0= ruleSimpleElement )
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:613:3: lv_elements_4_0= ruleSimpleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleElement_in_ruleComplexElement1219);
            	    lv_elements_4_0=ruleSimpleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"SimpleElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComplexElement1232); 

                	newLeafNode(otherlv_5, grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleComplexElement"


    // $ANTLR start "entryRuleSimpleElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:641:1: entryRuleSimpleElement returns [EObject current=null] : iv_ruleSimpleElement= ruleSimpleElement EOF ;
    public final EObject entryRuleSimpleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:642:2: (iv_ruleSimpleElement= ruleSimpleElement EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:643:2: iv_ruleSimpleElement= ruleSimpleElement EOF
            {
             newCompositeNode(grammarAccess.getSimpleElementRule()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement1268);
            iv_ruleSimpleElement=ruleSimpleElement();

            state._fsp--;

             current =iv_ruleSimpleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleElement1278); 

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
    // $ANTLR end "entryRuleSimpleElement"


    // $ANTLR start "ruleSimpleElement"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:650:1: ruleSimpleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )? ) ;
    public final EObject ruleSimpleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_multiplicity_5_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:653:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )? ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:654:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )? )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:654:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )? )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:654:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )?
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:654:2: ()
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:655:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleElementAccess().getSimpleElementAction_0(),
                        current);
                

            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:660:2: ( (lv_name_1_0= RULE_ID ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:661:1: (lv_name_1_0= RULE_ID )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:661:1: (lv_name_1_0= RULE_ID )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:662:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleElement1329); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSimpleElement1346); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleElementAccess().getColonKeyword_2());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:682:1: ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=28 && LA9_0<=35)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:682:2: ( (lv_type_3_0= ruleDATATYPE ) )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:682:2: ( (lv_type_3_0= ruleDATATYPE ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:683:1: (lv_type_3_0= ruleDATATYPE )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:683:1: (lv_type_3_0= ruleDATATYPE )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:684:3: lv_type_3_0= ruleDATATYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDATATYPE_in_ruleSimpleElement1368);
                    lv_type_3_0=ruleDATATYPE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleElementRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"DATATYPE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:701:6: ( ( ruleFQN ) )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:701:6: ( ( ruleFQN ) )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:702:1: ( ruleFQN )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:702:1: ( ruleFQN )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:703:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleSimpleElement1397);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:716:3: ( (lv_multiplicity_5_0= ruleMULTIPLICITY ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=36 && LA10_0<=38)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:717:1: (lv_multiplicity_5_0= ruleMULTIPLICITY )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:717:1: (lv_multiplicity_5_0= ruleMULTIPLICITY )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:718:3: lv_multiplicity_5_0= ruleMULTIPLICITY
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleElementAccess().getMultiplicityMULTIPLICITYEnumRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMULTIPLICITY_in_ruleSimpleElement1419);
                    lv_multiplicity_5_0=ruleMULTIPLICITY();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleElementRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_5_0, 
                            		"MULTIPLICITY");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleSimpleElement"


    // $ANTLR start "entryRuleFQN"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:742:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:743:2: (iv_ruleFQN= ruleFQN EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:744:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1457);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1468); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:751:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:754:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:755:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:755:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:755:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1508); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:762:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:763:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleFQN1527); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1542); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFqnWildcard"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:783:1: entryRuleFqnWildcard returns [String current=null] : iv_ruleFqnWildcard= ruleFqnWildcard EOF ;
    public final String entryRuleFqnWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWildcard = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:784:2: (iv_ruleFqnWildcard= ruleFqnWildcard EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:785:2: iv_ruleFqnWildcard= ruleFqnWildcard EOF
            {
             newCompositeNode(grammarAccess.getFqnWildcardRule()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard1590);
            iv_ruleFqnWildcard=ruleFqnWildcard();

            state._fsp--;

             current =iv_ruleFqnWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWildcard1601); 

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
    // $ANTLR end "entryRuleFqnWildcard"


    // $ANTLR start "ruleFqnWildcard"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:792:1: ruleFqnWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:795:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:796:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:796:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:797:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWildcard1648);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:807:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:808:2: kw= '.*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleFqnWildcard1667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleFqnWildcard"


    // $ANTLR start "entryRuleImport"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:821:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:822:2: (iv_ruleImport= ruleImport EOF )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:823:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1709);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1719); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:830:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:833:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:834:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:834:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:834:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleImport1756); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:838:1: ( (lv_importedNamespace_1_0= ruleFqnWildcard ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:839:1: (lv_importedNamespace_1_0= ruleFqnWildcard )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:839:1: (lv_importedNamespace_1_0= ruleFqnWildcard )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:840:3: lv_importedNamespace_1_0= ruleFqnWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWildcard_in_ruleImport1777);
            lv_importedNamespace_1_0=ruleFqnWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"FqnWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "ruleDATATYPE"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:864:1: ruleDATATYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'dateTime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) ) ;
    public final Enumerator ruleDATATYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:866:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'dateTime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:867:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'dateTime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:867:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'dateTime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
                {
                alt13=4;
                }
                break;
            case 32:
                {
                alt13=5;
                }
                break;
            case 33:
                {
                alt13=6;
                }
                break;
            case 34:
                {
                alt13=7;
                }
                break;
            case 35:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:867:2: (enumLiteral_0= 'string' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:867:2: (enumLiteral_0= 'string' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:867:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleDATATYPE1827); 

                            current = grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:873:6: (enumLiteral_1= 'integer' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:873:6: (enumLiteral_1= 'integer' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:873:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleDATATYPE1844); 

                            current = grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:879:6: (enumLiteral_2= 'float' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:879:6: (enumLiteral_2= 'float' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:879:8: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleDATATYPE1861); 

                            current = grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:885:6: (enumLiteral_3= 'date' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:885:6: (enumLiteral_3= 'date' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:885:8: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleDATATYPE1878); 

                            current = grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:891:6: (enumLiteral_4= 'time' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:891:6: (enumLiteral_4= 'time' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:891:8: enumLiteral_4= 'time'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleDATATYPE1895); 

                            current = grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:897:6: (enumLiteral_5= 'dateTime' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:897:6: (enumLiteral_5= 'dateTime' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:897:8: enumLiteral_5= 'dateTime'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_33_in_ruleDATATYPE1912); 

                            current = grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:903:6: (enumLiteral_6= 'binary' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:903:6: (enumLiteral_6= 'binary' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:903:8: enumLiteral_6= 'binary'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_34_in_ruleDATATYPE1929); 

                            current = grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:909:6: (enumLiteral_7= 'boolean' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:909:6: (enumLiteral_7= 'boolean' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:909:8: enumLiteral_7= 'boolean'
                    {
                    enumLiteral_7=(Token)match(input,35,FOLLOW_35_in_ruleDATATYPE1946); 

                            current = grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 
                        

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
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "ruleMULTIPLICITY"
    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:919:1: ruleMULTIPLICITY returns [Enumerator current=null] : ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) ;
    public final Enumerator ruleMULTIPLICITY() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:921:28: ( ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) ) )
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:922:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            {
            // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:922:1: ( (enumLiteral_0= '?' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:922:2: (enumLiteral_0= '?' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:922:2: (enumLiteral_0= '?' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:922:4: enumLiteral_0= '?'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleMULTIPLICITY1991); 

                            current = grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:928:6: (enumLiteral_1= '+' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:928:6: (enumLiteral_1= '+' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:928:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleMULTIPLICITY2008); 

                            current = grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:934:6: (enumLiteral_2= '*' )
                    {
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:934:6: (enumLiteral_2= '*' )
                    // ../sdl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalSDL.g:934:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleMULTIPLICITY2025); 

                            current = grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleMULTIPLICITY"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSDL_in_entryRuleSDL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSDL131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSDL152 = new BitSet(new long[]{0x0000000009081012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleSDL173 = new BitSet(new long[]{0x0000000009081012L});
    public static final BitSet FOLLOW_ruleService_in_ruleSDL196 = new BitSet(new long[]{0x0000000001081012L});
    public static final BitSet FOLLOW_ruleDataElement_in_ruleSDL223 = new BitSet(new long[]{0x0000000001081012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleSDL250 = new BitSet(new long[]{0x0000000001081012L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleService344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService378 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleService391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleService412 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleService426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation523 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation540 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_16_in_ruleOperation553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation570 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperation610 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleOperation625 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation642 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperation682 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOperation696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNode788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode805 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNode822 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNode834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode851 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNode868 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNode880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode903 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleNode916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode939 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleNode953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_ruleDataElement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_ruleDataElement1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_entryRuleComplexElement1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexElement1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComplexElement1164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexElement1181 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComplexElement1198 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_ruleComplexElement1219 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleComplexElement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleElement1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleElement1329 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleElement1346 = new BitSet(new long[]{0x0000000FF0000010L});
    public static final BitSet FOLLOW_ruleDATATYPE_in_ruleSimpleElement1368 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSimpleElement1397 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICITY_in_ruleSimpleElement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1508 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFQN1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1542 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWildcard1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWildcard1648 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleFqnWildcard1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleImport1756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_ruleImport1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDATATYPE1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDATATYPE1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDATATYPE1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDATATYPE1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDATATYPE1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDATATYPE1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDATATYPE1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDATATYPE1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMULTIPLICITY1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMULTIPLICITY2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMULTIPLICITY2025 = new BitSet(new long[]{0x0000000000000002L});

}