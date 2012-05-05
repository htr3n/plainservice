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
import at.ac.univie.cs.swa.soa.services.ServiceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'Web service'", "'{'", "'operation'", "'}'", "'input'", "':'", "'output'", "'REST service'", "'Node'", "'uri'", "'='", "'hosts'", "','", "'complex-data'", "'?'", "'+'", "'*'", "'.'", "'.*'", "'import'", "'string'", "'integer'", "'float'", "'date'", "'time'", "'datetime'", "'binary'", "'boolean'"
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
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalServiceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServiceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServiceDslParser.tokenNames; }
    public String getGrammarFileName() { return "../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g"; }



     	private ServiceDslGrammarAccess grammarAccess;
     	
        public InternalServiceDslParser(TokenStream input, ServiceDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServiceDSL";	
       	}
       	
       	@Override
       	protected ServiceDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleServiceDSL"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:68:1: entryRuleServiceDSL returns [EObject current=null] : iv_ruleServiceDSL= ruleServiceDSL EOF ;
    public final EObject entryRuleServiceDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceDSL = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:69:2: (iv_ruleServiceDSL= ruleServiceDSL EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:70:2: iv_ruleServiceDSL= ruleServiceDSL EOF
            {
             newCompositeNode(grammarAccess.getServiceDSLRule()); 
            pushFollow(FOLLOW_ruleServiceDSL_in_entryRuleServiceDSL75);
            iv_ruleServiceDSL=ruleServiceDSL();

            state._fsp--;

             current =iv_ruleServiceDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDSL85); 

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
    // $ANTLR end "entryRuleServiceDSL"


    // $ANTLR start "ruleServiceDSL"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:77:1: ruleServiceDSL returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* ) ;
    public final EObject ruleServiceDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_services_4_0 = null;

        EObject lv_data_5_0 = null;

        EObject lv_nodes_6_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:80:28: ( ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )* )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:81:2: () otherlv_1= 'module' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )*
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:81:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServiceDSLAccess().getServiceDSLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleServiceDSL131); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceDSLAccess().getModuleKeyword_1());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:91:1: ( (lv_name_2_0= ruleFQN ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:92:1: (lv_name_2_0= ruleFQN )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:92:1: (lv_name_2_0= ruleFQN )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:93:3: lv_name_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getServiceDSLAccess().getNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleServiceDSL152);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceDSLRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:109:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:110:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:110:1: (lv_imports_3_0= ruleImport )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:111:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceDSLAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleServiceDSL173);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceDSLRule());
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

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:127:3: ( ( (lv_services_4_0= ruleService ) ) | ( (lv_data_5_0= ruleDataElement ) ) | ( (lv_nodes_6_0= ruleNode ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 12:
                case 19:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                case 20:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:127:4: ( (lv_services_4_0= ruleService ) )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:127:4: ( (lv_services_4_0= ruleService ) )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:128:1: (lv_services_4_0= ruleService )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:128:1: (lv_services_4_0= ruleService )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:129:3: lv_services_4_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceDSLAccess().getServicesServiceParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleServiceDSL196);
            	    lv_services_4_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceDSLRule());
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
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:146:6: ( (lv_data_5_0= ruleDataElement ) )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:146:6: ( (lv_data_5_0= ruleDataElement ) )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:147:1: (lv_data_5_0= ruleDataElement )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:147:1: (lv_data_5_0= ruleDataElement )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:148:3: lv_data_5_0= ruleDataElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceDSLAccess().getDataDataElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataElement_in_ruleServiceDSL223);
            	    lv_data_5_0=ruleDataElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceDSLRule());
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
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:165:6: ( (lv_nodes_6_0= ruleNode ) )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:165:6: ( (lv_nodes_6_0= ruleNode ) )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:166:1: (lv_nodes_6_0= ruleNode )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:166:1: (lv_nodes_6_0= ruleNode )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:167:3: lv_nodes_6_0= ruleNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceDSLAccess().getNodesNodeParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNode_in_ruleServiceDSL250);
            	    lv_nodes_6_0=ruleNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceDSLRule());
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
    // $ANTLR end "ruleServiceDSL"


    // $ANTLR start "entryRuleService"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:191:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:192:2: (iv_ruleService= ruleService EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:193:2: iv_ruleService= ruleService EOF
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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:200:1: ruleService returns [EObject current=null] : (this_WebService_0= ruleWebService | this_RESTService_1= ruleRESTService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_WebService_0 = null;

        EObject this_RESTService_1 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:203:28: ( (this_WebService_0= ruleWebService | this_RESTService_1= ruleRESTService ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:204:1: (this_WebService_0= ruleWebService | this_RESTService_1= ruleRESTService )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:204:1: (this_WebService_0= ruleWebService | this_RESTService_1= ruleRESTService )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:205:5: this_WebService_0= ruleWebService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getWebServiceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWebService_in_ruleService345);
                    this_WebService_0=ruleWebService();

                    state._fsp--;

                     
                            current = this_WebService_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:215:5: this_RESTService_1= ruleRESTService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getRESTServiceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRESTService_in_ruleService372);
                    this_RESTService_1=ruleRESTService();

                    state._fsp--;

                     
                            current = this_RESTService_1; 
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleWebService"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:231:1: entryRuleWebService returns [EObject current=null] : iv_ruleWebService= ruleWebService EOF ;
    public final EObject entryRuleWebService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebService = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:232:2: (iv_ruleWebService= ruleWebService EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:233:2: iv_ruleWebService= ruleWebService EOF
            {
             newCompositeNode(grammarAccess.getWebServiceRule()); 
            pushFollow(FOLLOW_ruleWebService_in_entryRuleWebService407);
            iv_ruleWebService=ruleWebService();

            state._fsp--;

             current =iv_ruleWebService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebService417); 

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
    // $ANTLR end "entryRuleWebService"


    // $ANTLR start "ruleWebService"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:240:1: ruleWebService returns [EObject current=null] : ( () otherlv_1= 'Web service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleWebService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_operations_5_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:243:28: ( ( () otherlv_1= 'Web service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:244:1: ( () otherlv_1= 'Web service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:244:1: ( () otherlv_1= 'Web service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}' )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:244:2: () otherlv_1= 'Web service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )* otherlv_6= '}'
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:244:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:245:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWebServiceAccess().getWebServiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleWebService463); 

                	newLeafNode(otherlv_1, grammarAccess.getWebServiceAccess().getWebServiceKeyword_1());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:254:1: ( (lv_name_2_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:255:1: (lv_name_2_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:255:1: (lv_name_2_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:256:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWebService480); 

            			newLeafNode(lv_name_2_0, grammarAccess.getWebServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWebServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleWebService497); 

                	newLeafNode(otherlv_3, grammarAccess.getWebServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:276:1: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:276:3: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleWebService510); 

            	        	newLeafNode(otherlv_4, grammarAccess.getWebServiceAccess().getOperationKeyword_4_0());
            	        
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:280:1: ( (lv_operations_5_0= ruleOperation ) )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:281:1: (lv_operations_5_0= ruleOperation )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:281:1: (lv_operations_5_0= ruleOperation )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:282:3: lv_operations_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWebServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleWebService531);
            	    lv_operations_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWebServiceRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleWebService545); 

                	newLeafNode(otherlv_6, grammarAccess.getWebServiceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleWebService"


    // $ANTLR start "entryRuleOperation"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:310:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:311:2: (iv_ruleOperation= ruleOperation EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:312:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation581);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation591); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:319:1: ruleOperation returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' ) ;
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
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:322:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:323:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:323:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}' )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:323:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )? (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )? otherlv_11= '}'
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:323:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:324:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOperationAccess().getOperationAction_0(),
                        current);
                

            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:329:2: ( (lv_name_1_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:330:1: (lv_name_1_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation642); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleOperation659); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:351:1: (otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:351:3: otherlv_3= 'input' ( (lv_inputName_4_0= RULE_STRING ) ) otherlv_5= ':' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleOperation672); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getInputKeyword_3_0());
                        
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:355:1: ( (lv_inputName_4_0= RULE_STRING ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:356:1: (lv_inputName_4_0= RULE_STRING )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:356:1: (lv_inputName_4_0= RULE_STRING )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:357:3: lv_inputName_4_0= RULE_STRING
                    {
                    lv_inputName_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOperation689); 

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

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOperation706); 

                        	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getColonKeyword_3_2());
                        
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:377:1: ( ( ruleFQN ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:378:1: ( ruleFQN )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:378:1: ( ruleFQN )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:379:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperation729);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:392:4: (otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:392:6: otherlv_7= 'output' ( (lv_outputName_8_0= RULE_STRING ) ) otherlv_9= ':' ( ( ruleFQN ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleOperation744); 

                        	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getOutputKeyword_4_0());
                        
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:396:1: ( (lv_outputName_8_0= RULE_STRING ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:397:1: (lv_outputName_8_0= RULE_STRING )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:397:1: (lv_outputName_8_0= RULE_STRING )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:398:3: lv_outputName_8_0= RULE_STRING
                    {
                    lv_outputName_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOperation761); 

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

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleOperation778); 

                        	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_4_2());
                        
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:418:1: ( ( ruleFQN ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:419:1: ( ruleFQN )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:419:1: ( ruleFQN )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:420:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleOperation801);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleOperation815); 

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


    // $ANTLR start "entryRuleRESTService"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:445:1: entryRuleRESTService returns [EObject current=null] : iv_ruleRESTService= ruleRESTService EOF ;
    public final EObject entryRuleRESTService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRESTService = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:446:2: (iv_ruleRESTService= ruleRESTService EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:447:2: iv_ruleRESTService= ruleRESTService EOF
            {
             newCompositeNode(grammarAccess.getRESTServiceRule()); 
            pushFollow(FOLLOW_ruleRESTService_in_entryRuleRESTService851);
            iv_ruleRESTService=ruleRESTService();

            state._fsp--;

             current =iv_ruleRESTService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTService861); 

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
    // $ANTLR end "entryRuleRESTService"


    // $ANTLR start "ruleRESTService"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:454:1: ruleRESTService returns [EObject current=null] : ( () otherlv_1= 'REST service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleRESTService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:457:28: ( ( () otherlv_1= 'REST service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:458:1: ( () otherlv_1= 'REST service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:458:1: ( () otherlv_1= 'REST service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:458:2: () otherlv_1= 'REST service' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:458:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:459:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRESTServiceAccess().getRESTServiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRESTService907); 

                	newLeafNode(otherlv_1, grammarAccess.getRESTServiceAccess().getRESTServiceKeyword_1());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:468:1: ( (lv_name_2_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:469:1: (lv_name_2_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:469:1: (lv_name_2_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:470:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRESTService924); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRESTServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRESTServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRESTService941); 

                	newLeafNode(otherlv_3, grammarAccess.getRESTServiceAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRESTService953); 

                	newLeafNode(otherlv_4, grammarAccess.getRESTServiceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRESTService"


    // $ANTLR start "entryRuleNode"
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:502:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:503:2: (iv_ruleNode= ruleNode EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:504:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode989);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode999); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:511:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' ) ;
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
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:514:28: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:515:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:515:1: ( () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}' )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:515:2: () otherlv_1= 'Node' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uri' otherlv_4= '=' ( (lv_baseURI_5_0= RULE_STRING ) ) otherlv_6= 'hosts' otherlv_7= '{' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* otherlv_11= '}'
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:515:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:516:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNodeAccess().getNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleNode1045); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:525:1: ( (lv_name_2_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:526:1: (lv_name_2_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:526:1: (lv_name_2_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:527:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1062); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleNode1079); 

                	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getUriKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleNode1091); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEqualsSignKeyword_4());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:551:1: ( (lv_baseURI_5_0= RULE_STRING ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:552:1: (lv_baseURI_5_0= RULE_STRING )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:552:1: (lv_baseURI_5_0= RULE_STRING )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:553:3: lv_baseURI_5_0= RULE_STRING
            {
            lv_baseURI_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNode1108); 

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

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleNode1125); 

                	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getHostsKeyword_6());
                
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNode1137); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:577:1: ( ( ruleFQN ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:578:1: ( ruleFQN )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:578:1: ( ruleFQN )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:579:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNode1160);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:592:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:592:4: otherlv_9= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleNode1173); 

            	        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getCommaKeyword_9_0());
            	        
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:596:1: ( ( ruleFQN ) )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:597:1: ( ruleFQN )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:597:1: ( ruleFQN )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:598:3: ruleFQN
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNodeRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFQN_in_ruleNode1196);
            	    ruleFQN();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleNode1210); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:623:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:624:2: (iv_ruleDataElement= ruleDataElement EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:625:2: iv_ruleDataElement= ruleDataElement EOF
            {
             newCompositeNode(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement1246);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;

             current =iv_ruleDataElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement1256); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:632:1: ruleDataElement returns [EObject current=null] : (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleElement_0 = null;

        EObject this_ComplexElement_1 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:635:28: ( (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:636:1: (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:636:1: (this_SimpleElement_0= ruleSimpleElement | this_ComplexElement_1= ruleComplexElement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:637:5: this_SimpleElement_0= ruleSimpleElement
                    {
                     
                            newCompositeNode(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleElement_in_ruleDataElement1303);
                    this_SimpleElement_0=ruleSimpleElement();

                    state._fsp--;

                     
                            current = this_SimpleElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:647:5: this_ComplexElement_1= ruleComplexElement
                    {
                     
                            newCompositeNode(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexElement_in_ruleDataElement1330);
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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:663:1: entryRuleComplexElement returns [EObject current=null] : iv_ruleComplexElement= ruleComplexElement EOF ;
    public final EObject entryRuleComplexElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexElement = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:664:2: (iv_ruleComplexElement= ruleComplexElement EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:665:2: iv_ruleComplexElement= ruleComplexElement EOF
            {
             newCompositeNode(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_ruleComplexElement_in_entryRuleComplexElement1365);
            iv_ruleComplexElement=ruleComplexElement();

            state._fsp--;

             current =iv_ruleComplexElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexElement1375); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:672:1: ruleComplexElement returns [EObject current=null] : ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleComplexElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:675:28: ( ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:676:1: ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:676:1: ( () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}' )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:676:2: () otherlv_1= 'complex-data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleSimpleElement ) )* otherlv_5= '}'
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:676:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:677:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComplexElementAccess().getComplexElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleComplexElement1421); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexElementAccess().getComplexDataKeyword_1());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:686:1: ( (lv_name_2_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:687:1: (lv_name_2_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:687:1: (lv_name_2_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:688:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplexElement1438); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleComplexElement1455); 

                	newLeafNode(otherlv_3, grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:708:1: ( (lv_elements_4_0= ruleSimpleElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:709:1: (lv_elements_4_0= ruleSimpleElement )
            	    {
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:709:1: (lv_elements_4_0= ruleSimpleElement )
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:710:3: lv_elements_4_0= ruleSimpleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSimpleElement_in_ruleComplexElement1476);
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
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComplexElement1489); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:738:1: entryRuleSimpleElement returns [EObject current=null] : iv_ruleSimpleElement= ruleSimpleElement EOF ;
    public final EObject entryRuleSimpleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:739:2: (iv_ruleSimpleElement= ruleSimpleElement EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:740:2: iv_ruleSimpleElement= ruleSimpleElement EOF
            {
             newCompositeNode(grammarAccess.getSimpleElementRule()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement1525);
            iv_ruleSimpleElement=ruleSimpleElement();

            state._fsp--;

             current =iv_ruleSimpleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleElement1535); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:747:1: ruleSimpleElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )? ) ;
    public final EObject ruleSimpleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_multiplicity_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:750:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )? ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:751:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )? )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:751:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )? )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:751:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) ) ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )?
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:751:2: ()
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:752:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleElementAccess().getSimpleElementAction_0(),
                        current);
                

            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:757:2: ( (lv_name_1_0= RULE_ID ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:758:1: (lv_name_1_0= RULE_ID )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:758:1: (lv_name_1_0= RULE_ID )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:759:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleElement1586); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSimpleElement1603); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleElementAccess().getColonKeyword_2());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:779:1: ( ( (lv_type_3_0= ruleDATATYPE ) ) | ( ( ruleFQN ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=32 && LA10_0<=39)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:779:2: ( (lv_type_3_0= ruleDATATYPE ) )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:779:2: ( (lv_type_3_0= ruleDATATYPE ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:780:1: (lv_type_3_0= ruleDATATYPE )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:780:1: (lv_type_3_0= ruleDATATYPE )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:781:3: lv_type_3_0= ruleDATATYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDATATYPE_in_ruleSimpleElement1625);
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
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:798:6: ( ( ruleFQN ) )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:798:6: ( ( ruleFQN ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:799:1: ( ruleFQN )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:799:1: ( ruleFQN )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:800:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleElementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleSimpleElement1654);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:813:3: ( ( (lv_multiplicity_5_0= '?' ) ) | otherlv_6= '+' | otherlv_7= '*' )?
            int alt11=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt11=1;
                    }
                    break;
                case 27:
                    {
                    alt11=2;
                    }
                    break;
                case 28:
                    {
                    alt11=3;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:813:4: ( (lv_multiplicity_5_0= '?' ) )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:813:4: ( (lv_multiplicity_5_0= '?' ) )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:814:1: (lv_multiplicity_5_0= '?' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:814:1: (lv_multiplicity_5_0= '?' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:815:3: lv_multiplicity_5_0= '?'
                    {
                    lv_multiplicity_5_0=(Token)match(input,26,FOLLOW_26_in_ruleSimpleElement1674); 

                            newLeafNode(lv_multiplicity_5_0, grammarAccess.getSimpleElementAccess().getMultiplicityQuestionMarkKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleElementRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_5_0, "?");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:829:7: otherlv_6= '+'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleSimpleElement1705); 

                        	newLeafNode(otherlv_6, grammarAccess.getSimpleElementAccess().getPlusSignKeyword_4_1());
                        

                    }
                    break;
                case 3 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:834:7: otherlv_7= '*'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleSimpleElement1723); 

                        	newLeafNode(otherlv_7, grammarAccess.getSimpleElementAccess().getAsteriskKeyword_4_2());
                        

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:846:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:847:2: (iv_ruleFQN= ruleFQN EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:848:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1762);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1773); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:855:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:858:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:859:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:859:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:859:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1813); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:866:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:867:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleFQN1832); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1847); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:887:1: entryRuleFqnWildcard returns [String current=null] : iv_ruleFqnWildcard= ruleFqnWildcard EOF ;
    public final String entryRuleFqnWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWildcard = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:888:2: (iv_ruleFqnWildcard= ruleFqnWildcard EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:889:2: iv_ruleFqnWildcard= ruleFqnWildcard EOF
            {
             newCompositeNode(grammarAccess.getFqnWildcardRule()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard1895);
            iv_ruleFqnWildcard=ruleFqnWildcard();

            state._fsp--;

             current =iv_ruleFqnWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWildcard1906); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:896:1: ruleFqnWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:899:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:900:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:900:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:901:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWildcard1953);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:911:1: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:912:2: kw= '.*'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFqnWildcard1972); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:925:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:926:2: (iv_ruleImport= ruleImport EOF )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:927:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2014);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2024); 

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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:934:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:937:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:938:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:938:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:938:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleFqnWildcard ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImport2061); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:942:1: ( (lv_importedNamespace_1_0= ruleFqnWildcard ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:943:1: (lv_importedNamespace_1_0= ruleFqnWildcard )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:943:1: (lv_importedNamespace_1_0= ruleFqnWildcard )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:944:3: lv_importedNamespace_1_0= ruleFqnWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWildcard_in_ruleImport2082);
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
    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:968:1: ruleDATATYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) ) ;
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
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:970:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) ) )
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:971:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) )
            {
            // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:971:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'time' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'binary' ) | (enumLiteral_7= 'boolean' ) )
            int alt14=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            case 37:
                {
                alt14=6;
                }
                break;
            case 38:
                {
                alt14=7;
                }
                break;
            case 39:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:971:2: (enumLiteral_0= 'string' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:971:2: (enumLiteral_0= 'string' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:971:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleDATATYPE2132); 

                            current = grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:977:6: (enumLiteral_1= 'integer' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:977:6: (enumLiteral_1= 'integer' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:977:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleDATATYPE2149); 

                            current = grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:983:6: (enumLiteral_2= 'float' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:983:6: (enumLiteral_2= 'float' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:983:8: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_34_in_ruleDATATYPE2166); 

                            current = grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:989:6: (enumLiteral_3= 'date' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:989:6: (enumLiteral_3= 'date' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:989:8: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_35_in_ruleDATATYPE2183); 

                            current = grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:995:6: (enumLiteral_4= 'time' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:995:6: (enumLiteral_4= 'time' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:995:8: enumLiteral_4= 'time'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_36_in_ruleDATATYPE2200); 

                            current = grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1001:6: (enumLiteral_5= 'datetime' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1001:6: (enumLiteral_5= 'datetime' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1001:8: enumLiteral_5= 'datetime'
                    {
                    enumLiteral_5=(Token)match(input,37,FOLLOW_37_in_ruleDATATYPE2217); 

                            current = grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1007:6: (enumLiteral_6= 'binary' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1007:6: (enumLiteral_6= 'binary' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1007:8: enumLiteral_6= 'binary'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_38_in_ruleDATATYPE2234); 

                            current = grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1013:6: (enumLiteral_7= 'boolean' )
                    {
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1013:6: (enumLiteral_7= 'boolean' )
                    // ../service.dsl/src-gen/at/ac/univie/cs/swa/soa/parser/antlr/internal/InternalServiceDsl.g:1013:8: enumLiteral_7= 'boolean'
                    {
                    enumLiteral_7=(Token)match(input,39,FOLLOW_39_in_ruleDATATYPE2251); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleServiceDSL_in_entryRuleServiceDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServiceDSL131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleServiceDSL152 = new BitSet(new long[]{0x0000000082181012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleServiceDSL173 = new BitSet(new long[]{0x0000000082181012L});
    public static final BitSet FOLLOW_ruleService_in_ruleServiceDSL196 = new BitSet(new long[]{0x0000000002181012L});
    public static final BitSet FOLLOW_ruleDataElement_in_ruleServiceDSL223 = new BitSet(new long[]{0x0000000002181012L});
    public static final BitSet FOLLOW_ruleNode_in_ruleServiceDSL250 = new BitSet(new long[]{0x0000000002181012L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebService_in_ruleService345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTService_in_ruleService372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebService_in_entryRuleWebService407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebService417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleWebService463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWebService480 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleWebService497 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleWebService510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleWebService531 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleWebService545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation642 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation659 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_16_in_ruleOperation672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation689 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperation729 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleOperation744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOperation761 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOperation778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleOperation801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOperation815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTService_in_entryRuleRESTService851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTService861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRESTService907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRESTService924 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRESTService941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRESTService953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleNode1045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1062 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNode1079 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNode1091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNode1108 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNode1125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNode1137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode1160 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleNode1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNode1196 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleNode1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement1246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_ruleDataElement1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_ruleDataElement1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_entryRuleComplexElement1365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexElement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComplexElement1421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplexElement1438 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComplexElement1455 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_ruleComplexElement1476 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleComplexElement1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleElement1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleElement1586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleElement1603 = new BitSet(new long[]{0x000000FF00000010L});
    public static final BitSet FOLLOW_ruleDATATYPE_in_ruleSimpleElement1625 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleSimpleElement1654 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_26_in_ruleSimpleElement1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSimpleElement1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSimpleElement1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1813 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleFQN1832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1847 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard1895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWildcard1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWildcard1953 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleFqnWildcard1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImport2061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_ruleImport2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDATATYPE2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDATATYPE2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDATATYPE2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDATATYPE2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDATATYPE2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDATATYPE2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDATATYPE2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDATATYPE2251 = new BitSet(new long[]{0x0000000000000002L});

}