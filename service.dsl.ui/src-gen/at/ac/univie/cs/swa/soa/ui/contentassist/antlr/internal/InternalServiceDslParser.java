package at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.univie.cs.swa.soa.services.ServiceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'*'", "'string'", "'integer'", "'float'", "'date'", "'time'", "'datetime'", "'binary'", "'boolean'", "'module'", "'Web service'", "'{'", "'}'", "'operation'", "'input'", "':'", "'output'", "'REST service'", "'Node'", "'uri'", "'='", "'hosts'", "','", "'complex-data'", "'.'", "'.*'", "'import'", "'?'"
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
    public String getGrammarFileName() { return "../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g"; }


     
     	private ServiceDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ServiceDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleServiceDSL"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:60:1: entryRuleServiceDSL : ruleServiceDSL EOF ;
    public final void entryRuleServiceDSL() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:61:1: ( ruleServiceDSL EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:62:1: ruleServiceDSL EOF
            {
             before(grammarAccess.getServiceDSLRule()); 
            pushFollow(FOLLOW_ruleServiceDSL_in_entryRuleServiceDSL61);
            ruleServiceDSL();

            state._fsp--;

             after(grammarAccess.getServiceDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceDSL68); 

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
    // $ANTLR end "entryRuleServiceDSL"


    // $ANTLR start "ruleServiceDSL"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:69:1: ruleServiceDSL : ( ( rule__ServiceDSL__Group__0 ) ) ;
    public final void ruleServiceDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:73:2: ( ( ( rule__ServiceDSL__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:74:1: ( ( rule__ServiceDSL__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:74:1: ( ( rule__ServiceDSL__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:75:1: ( rule__ServiceDSL__Group__0 )
            {
             before(grammarAccess.getServiceDSLAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:76:1: ( rule__ServiceDSL__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:76:2: rule__ServiceDSL__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__0_in_ruleServiceDSL94);
            rule__ServiceDSL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceDSLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceDSL"


    // $ANTLR start "entryRuleService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:88:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:89:1: ( ruleService EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:90:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService121);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService128); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:97:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:101:2: ( ( ( rule__Service__Alternatives ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:102:1: ( ( rule__Service__Alternatives ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:102:1: ( ( rule__Service__Alternatives ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:103:1: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:104:1: ( rule__Service__Alternatives )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:104:2: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_rule__Service__Alternatives_in_ruleService154);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleWebService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:116:1: entryRuleWebService : ruleWebService EOF ;
    public final void entryRuleWebService() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:117:1: ( ruleWebService EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:118:1: ruleWebService EOF
            {
             before(grammarAccess.getWebServiceRule()); 
            pushFollow(FOLLOW_ruleWebService_in_entryRuleWebService181);
            ruleWebService();

            state._fsp--;

             after(grammarAccess.getWebServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebService188); 

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
    // $ANTLR end "entryRuleWebService"


    // $ANTLR start "ruleWebService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:125:1: ruleWebService : ( ( rule__WebService__Group__0 ) ) ;
    public final void ruleWebService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:129:2: ( ( ( rule__WebService__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:130:1: ( ( rule__WebService__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:130:1: ( ( rule__WebService__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:131:1: ( rule__WebService__Group__0 )
            {
             before(grammarAccess.getWebServiceAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:132:1: ( rule__WebService__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:132:2: rule__WebService__Group__0
            {
            pushFollow(FOLLOW_rule__WebService__Group__0_in_ruleWebService214);
            rule__WebService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWebService"


    // $ANTLR start "entryRuleOperation"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:144:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:145:1: ( ruleOperation EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:146:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation241);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation248); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:153:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:157:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:158:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:158:1: ( ( rule__Operation__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:159:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:160:1: ( rule__Operation__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:160:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation274);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleRESTService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:172:1: entryRuleRESTService : ruleRESTService EOF ;
    public final void entryRuleRESTService() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:173:1: ( ruleRESTService EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:174:1: ruleRESTService EOF
            {
             before(grammarAccess.getRESTServiceRule()); 
            pushFollow(FOLLOW_ruleRESTService_in_entryRuleRESTService301);
            ruleRESTService();

            state._fsp--;

             after(grammarAccess.getRESTServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRESTService308); 

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
    // $ANTLR end "entryRuleRESTService"


    // $ANTLR start "ruleRESTService"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:181:1: ruleRESTService : ( ( rule__RESTService__Group__0 ) ) ;
    public final void ruleRESTService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:185:2: ( ( ( rule__RESTService__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:186:1: ( ( rule__RESTService__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:186:1: ( ( rule__RESTService__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:187:1: ( rule__RESTService__Group__0 )
            {
             before(grammarAccess.getRESTServiceAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:188:1: ( rule__RESTService__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:188:2: rule__RESTService__Group__0
            {
            pushFollow(FOLLOW_rule__RESTService__Group__0_in_ruleRESTService334);
            rule__RESTService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRESTServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRESTService"


    // $ANTLR start "entryRuleNode"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:200:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:201:1: ( ruleNode EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:202:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode361);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode368); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:209:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:213:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:214:1: ( ( rule__Node__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:214:1: ( ( rule__Node__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:215:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:216:1: ( rule__Node__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:216:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode394);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleDataElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:228:1: entryRuleDataElement : ruleDataElement EOF ;
    public final void entryRuleDataElement() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:229:1: ( ruleDataElement EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:230:1: ruleDataElement EOF
            {
             before(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement421);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getDataElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement428); 

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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:237:1: ruleDataElement : ( ( rule__DataElement__Alternatives ) ) ;
    public final void ruleDataElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:241:2: ( ( ( rule__DataElement__Alternatives ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:242:1: ( ( rule__DataElement__Alternatives ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:242:1: ( ( rule__DataElement__Alternatives ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:243:1: ( rule__DataElement__Alternatives )
            {
             before(grammarAccess.getDataElementAccess().getAlternatives()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:244:1: ( rule__DataElement__Alternatives )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:244:2: rule__DataElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DataElement__Alternatives_in_ruleDataElement454);
            rule__DataElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleComplexElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:256:1: entryRuleComplexElement : ruleComplexElement EOF ;
    public final void entryRuleComplexElement() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:257:1: ( ruleComplexElement EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:258:1: ruleComplexElement EOF
            {
             before(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_ruleComplexElement_in_entryRuleComplexElement481);
            ruleComplexElement();

            state._fsp--;

             after(grammarAccess.getComplexElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexElement488); 

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
    // $ANTLR end "entryRuleComplexElement"


    // $ANTLR start "ruleComplexElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:265:1: ruleComplexElement : ( ( rule__ComplexElement__Group__0 ) ) ;
    public final void ruleComplexElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:269:2: ( ( ( rule__ComplexElement__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:270:1: ( ( rule__ComplexElement__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:270:1: ( ( rule__ComplexElement__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:271:1: ( rule__ComplexElement__Group__0 )
            {
             before(grammarAccess.getComplexElementAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:272:1: ( rule__ComplexElement__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:272:2: rule__ComplexElement__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__0_in_ruleComplexElement514);
            rule__ComplexElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexElement"


    // $ANTLR start "entryRuleSimpleElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:284:1: entryRuleSimpleElement : ruleSimpleElement EOF ;
    public final void entryRuleSimpleElement() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:285:1: ( ruleSimpleElement EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:286:1: ruleSimpleElement EOF
            {
             before(grammarAccess.getSimpleElementRule()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement541);
            ruleSimpleElement();

            state._fsp--;

             after(grammarAccess.getSimpleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleElement548); 

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
    // $ANTLR end "entryRuleSimpleElement"


    // $ANTLR start "ruleSimpleElement"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:293:1: ruleSimpleElement : ( ( rule__SimpleElement__Group__0 ) ) ;
    public final void ruleSimpleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:297:2: ( ( ( rule__SimpleElement__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:298:1: ( ( rule__SimpleElement__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:298:1: ( ( rule__SimpleElement__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:299:1: ( rule__SimpleElement__Group__0 )
            {
             before(grammarAccess.getSimpleElementAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:300:1: ( rule__SimpleElement__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:300:2: rule__SimpleElement__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__0_in_ruleSimpleElement574);
            rule__SimpleElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleElement"


    // $ANTLR start "entryRuleFQN"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:312:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:313:1: ( ruleFQN EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:314:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN601);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN608); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:321:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:325:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:326:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:326:1: ( ( rule__FQN__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:327:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:328:1: ( rule__FQN__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:328:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN634);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFqnWildcard"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:340:1: entryRuleFqnWildcard : ruleFqnWildcard EOF ;
    public final void entryRuleFqnWildcard() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:341:1: ( ruleFqnWildcard EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:342:1: ruleFqnWildcard EOF
            {
             before(grammarAccess.getFqnWildcardRule()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard661);
            ruleFqnWildcard();

            state._fsp--;

             after(grammarAccess.getFqnWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWildcard668); 

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
    // $ANTLR end "entryRuleFqnWildcard"


    // $ANTLR start "ruleFqnWildcard"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:349:1: ruleFqnWildcard : ( ( rule__FqnWildcard__Group__0 ) ) ;
    public final void ruleFqnWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:353:2: ( ( ( rule__FqnWildcard__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:354:1: ( ( rule__FqnWildcard__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:354:1: ( ( rule__FqnWildcard__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:355:1: ( rule__FqnWildcard__Group__0 )
            {
             before(grammarAccess.getFqnWildcardAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:356:1: ( rule__FqnWildcard__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:356:2: rule__FqnWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__0_in_ruleFqnWildcard694);
            rule__FqnWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFqnWildcard"


    // $ANTLR start "entryRuleImport"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:368:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:369:1: ( ruleImport EOF )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:370:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport721);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport728); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:377:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:381:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:382:1: ( ( rule__Import__Group__0 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:382:1: ( ( rule__Import__Group__0 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:383:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:384:1: ( rule__Import__Group__0 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:384:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport754);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "ruleDATATYPE"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:397:1: ruleDATATYPE : ( ( rule__DATATYPE__Alternatives ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:401:1: ( ( ( rule__DATATYPE__Alternatives ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:402:1: ( ( rule__DATATYPE__Alternatives ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:402:1: ( ( rule__DATATYPE__Alternatives ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:403:1: ( rule__DATATYPE__Alternatives )
            {
             before(grammarAccess.getDATATYPEAccess().getAlternatives()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:404:1: ( rule__DATATYPE__Alternatives )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:404:2: rule__DATATYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__DATATYPE__Alternatives_in_ruleDATATYPE791);
            rule__DATATYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDATATYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "rule__ServiceDSL__Alternatives_4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:415:1: rule__ServiceDSL__Alternatives_4 : ( ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) ) | ( ( rule__ServiceDSL__DataAssignment_4_1 ) ) | ( ( rule__ServiceDSL__NodesAssignment_4_2 ) ) );
    public final void rule__ServiceDSL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:419:1: ( ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) ) | ( ( rule__ServiceDSL__DataAssignment_4_1 ) ) | ( ( rule__ServiceDSL__NodesAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
            case 29:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 35:
                {
                alt1=2;
                }
                break;
            case 30:
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
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:420:1: ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:420:1: ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:421:1: ( rule__ServiceDSL__ServicesAssignment_4_0 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getServicesAssignment_4_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:422:1: ( rule__ServiceDSL__ServicesAssignment_4_0 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:422:2: rule__ServiceDSL__ServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__ServicesAssignment_4_0_in_rule__ServiceDSL__Alternatives_4826);
                    rule__ServiceDSL__ServicesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceDSLAccess().getServicesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:426:6: ( ( rule__ServiceDSL__DataAssignment_4_1 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:426:6: ( ( rule__ServiceDSL__DataAssignment_4_1 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:427:1: ( rule__ServiceDSL__DataAssignment_4_1 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getDataAssignment_4_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:428:1: ( rule__ServiceDSL__DataAssignment_4_1 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:428:2: rule__ServiceDSL__DataAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__DataAssignment_4_1_in_rule__ServiceDSL__Alternatives_4844);
                    rule__ServiceDSL__DataAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceDSLAccess().getDataAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:432:6: ( ( rule__ServiceDSL__NodesAssignment_4_2 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:432:6: ( ( rule__ServiceDSL__NodesAssignment_4_2 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:433:1: ( rule__ServiceDSL__NodesAssignment_4_2 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getNodesAssignment_4_2()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:434:1: ( rule__ServiceDSL__NodesAssignment_4_2 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:434:2: rule__ServiceDSL__NodesAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__NodesAssignment_4_2_in_rule__ServiceDSL__Alternatives_4862);
                    rule__ServiceDSL__NodesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceDSLAccess().getNodesAssignment_4_2()); 

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
    // $ANTLR end "rule__ServiceDSL__Alternatives_4"


    // $ANTLR start "rule__Service__Alternatives"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:443:1: rule__Service__Alternatives : ( ( ruleWebService ) | ( ruleRESTService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:447:1: ( ( ruleWebService ) | ( ruleRESTService ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:448:1: ( ruleWebService )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:448:1: ( ruleWebService )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:449:1: ruleWebService
                    {
                     before(grammarAccess.getServiceAccess().getWebServiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWebService_in_rule__Service__Alternatives895);
                    ruleWebService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getWebServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:454:6: ( ruleRESTService )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:454:6: ( ruleRESTService )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:455:1: ruleRESTService
                    {
                     before(grammarAccess.getServiceAccess().getRESTServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRESTService_in_rule__Service__Alternatives912);
                    ruleRESTService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getRESTServiceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__DataElement__Alternatives"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:465:1: rule__DataElement__Alternatives : ( ( ruleSimpleElement ) | ( ruleComplexElement ) );
    public final void rule__DataElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:469:1: ( ( ruleSimpleElement ) | ( ruleComplexElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:470:1: ( ruleSimpleElement )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:470:1: ( ruleSimpleElement )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:471:1: ruleSimpleElement
                    {
                     before(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives944);
                    ruleSimpleElement();

                    state._fsp--;

                     after(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:476:6: ( ruleComplexElement )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:476:6: ( ruleComplexElement )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:477:1: ruleComplexElement
                    {
                     before(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives961);
                    ruleComplexElement();

                    state._fsp--;

                     after(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__DataElement__Alternatives"


    // $ANTLR start "rule__SimpleElement__Alternatives_3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:487:1: rule__SimpleElement__Alternatives_3 : ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) );
    public final void rule__SimpleElement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:491:1: ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=20)) ) {
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
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:492:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:492:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:493:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:494:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:494:2: rule__SimpleElement__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_3993);
                    rule__SimpleElement__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:498:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:498:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:499:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getRefAssignment_3_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:500:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:500:2: rule__SimpleElement__RefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_31011);
                    rule__SimpleElement__RefAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleElementAccess().getRefAssignment_3_1()); 

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
    // $ANTLR end "rule__SimpleElement__Alternatives_3"


    // $ANTLR start "rule__SimpleElement__Alternatives_4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:509:1: rule__SimpleElement__Alternatives_4 : ( ( ( rule__SimpleElement__MultiplicityAssignment_4_0 ) ) | ( '+' ) | ( '*' ) );
    public final void rule__SimpleElement__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:513:1: ( ( ( rule__SimpleElement__MultiplicityAssignment_4_0 ) ) | ( '+' ) | ( '*' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                alt5=2;
                }
                break;
            case 12:
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
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:514:1: ( ( rule__SimpleElement__MultiplicityAssignment_4_0 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:514:1: ( ( rule__SimpleElement__MultiplicityAssignment_4_0 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:515:1: ( rule__SimpleElement__MultiplicityAssignment_4_0 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:516:1: ( rule__SimpleElement__MultiplicityAssignment_4_0 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:516:2: rule__SimpleElement__MultiplicityAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_0_in_rule__SimpleElement__Alternatives_41044);
                    rule__SimpleElement__MultiplicityAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:520:6: ( '+' )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:520:6: ( '+' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:521:1: '+'
                    {
                     before(grammarAccess.getSimpleElementAccess().getPlusSignKeyword_4_1()); 
                    match(input,11,FOLLOW_11_in_rule__SimpleElement__Alternatives_41063); 
                     after(grammarAccess.getSimpleElementAccess().getPlusSignKeyword_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:528:6: ( '*' )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:528:6: ( '*' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:529:1: '*'
                    {
                     before(grammarAccess.getSimpleElementAccess().getAsteriskKeyword_4_2()); 
                    match(input,12,FOLLOW_12_in_rule__SimpleElement__Alternatives_41083); 
                     after(grammarAccess.getSimpleElementAccess().getAsteriskKeyword_4_2()); 

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
    // $ANTLR end "rule__SimpleElement__Alternatives_4"


    // $ANTLR start "rule__DATATYPE__Alternatives"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:541:1: rule__DATATYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'datetime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) );
    public final void rule__DATATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:545:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'datetime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) )
            int alt6=8;
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
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:546:1: ( ( 'string' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:546:1: ( ( 'string' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:547:1: ( 'string' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:548:1: ( 'string' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:548:3: 'string'
                    {
                    match(input,13,FOLLOW_13_in_rule__DATATYPE__Alternatives1118); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:553:6: ( ( 'integer' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:553:6: ( ( 'integer' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:554:1: ( 'integer' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:555:1: ( 'integer' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:555:3: 'integer'
                    {
                    match(input,14,FOLLOW_14_in_rule__DATATYPE__Alternatives1139); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:560:6: ( ( 'float' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:560:6: ( ( 'float' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:561:1: ( 'float' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:562:1: ( 'float' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:562:3: 'float'
                    {
                    match(input,15,FOLLOW_15_in_rule__DATATYPE__Alternatives1160); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:567:6: ( ( 'date' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:567:6: ( ( 'date' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:568:1: ( 'date' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:569:1: ( 'date' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:569:3: 'date'
                    {
                    match(input,16,FOLLOW_16_in_rule__DATATYPE__Alternatives1181); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:574:6: ( ( 'time' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:574:6: ( ( 'time' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:575:1: ( 'time' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:576:1: ( 'time' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:576:3: 'time'
                    {
                    match(input,17,FOLLOW_17_in_rule__DATATYPE__Alternatives1202); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:581:6: ( ( 'datetime' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:581:6: ( ( 'datetime' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:582:1: ( 'datetime' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:583:1: ( 'datetime' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:583:3: 'datetime'
                    {
                    match(input,18,FOLLOW_18_in_rule__DATATYPE__Alternatives1223); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:588:6: ( ( 'binary' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:588:6: ( ( 'binary' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:589:1: ( 'binary' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:590:1: ( 'binary' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:590:3: 'binary'
                    {
                    match(input,19,FOLLOW_19_in_rule__DATATYPE__Alternatives1244); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:595:6: ( ( 'boolean' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:595:6: ( ( 'boolean' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:596:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:597:1: ( 'boolean' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:597:3: 'boolean'
                    {
                    match(input,20,FOLLOW_20_in_rule__DATATYPE__Alternatives1265); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__DATATYPE__Alternatives"


    // $ANTLR start "rule__ServiceDSL__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:609:1: rule__ServiceDSL__Group__0 : rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1 ;
    public final void rule__ServiceDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:613:1: ( rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:614:2: rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__0__Impl_in_rule__ServiceDSL__Group__01298);
            rule__ServiceDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__1_in_rule__ServiceDSL__Group__01301);
            rule__ServiceDSL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__0"


    // $ANTLR start "rule__ServiceDSL__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:621:1: rule__ServiceDSL__Group__0__Impl : ( () ) ;
    public final void rule__ServiceDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:625:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:626:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:626:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:627:1: ()
            {
             before(grammarAccess.getServiceDSLAccess().getServiceDSLAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:628:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:630:1: 
            {
            }

             after(grammarAccess.getServiceDSLAccess().getServiceDSLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__0__Impl"


    // $ANTLR start "rule__ServiceDSL__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:640:1: rule__ServiceDSL__Group__1 : rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2 ;
    public final void rule__ServiceDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:644:1: ( rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:645:2: rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__1__Impl_in_rule__ServiceDSL__Group__11359);
            rule__ServiceDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__2_in_rule__ServiceDSL__Group__11362);
            rule__ServiceDSL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__1"


    // $ANTLR start "rule__ServiceDSL__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:652:1: rule__ServiceDSL__Group__1__Impl : ( 'module' ) ;
    public final void rule__ServiceDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:656:1: ( ( 'module' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:657:1: ( 'module' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:657:1: ( 'module' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:658:1: 'module'
            {
             before(grammarAccess.getServiceDSLAccess().getModuleKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ServiceDSL__Group__1__Impl1390); 
             after(grammarAccess.getServiceDSLAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__1__Impl"


    // $ANTLR start "rule__ServiceDSL__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:671:1: rule__ServiceDSL__Group__2 : rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3 ;
    public final void rule__ServiceDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:675:1: ( rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:676:2: rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__2__Impl_in_rule__ServiceDSL__Group__21421);
            rule__ServiceDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__3_in_rule__ServiceDSL__Group__21424);
            rule__ServiceDSL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__2"


    // $ANTLR start "rule__ServiceDSL__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:683:1: rule__ServiceDSL__Group__2__Impl : ( ( rule__ServiceDSL__NameAssignment_2 ) ) ;
    public final void rule__ServiceDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:687:1: ( ( ( rule__ServiceDSL__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:688:1: ( ( rule__ServiceDSL__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:688:1: ( ( rule__ServiceDSL__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:689:1: ( rule__ServiceDSL__NameAssignment_2 )
            {
             before(grammarAccess.getServiceDSLAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:690:1: ( rule__ServiceDSL__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:690:2: rule__ServiceDSL__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceDSL__NameAssignment_2_in_rule__ServiceDSL__Group__2__Impl1451);
            rule__ServiceDSL__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceDSLAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__2__Impl"


    // $ANTLR start "rule__ServiceDSL__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:700:1: rule__ServiceDSL__Group__3 : rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4 ;
    public final void rule__ServiceDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:704:1: ( rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:705:2: rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__3__Impl_in_rule__ServiceDSL__Group__31481);
            rule__ServiceDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__4_in_rule__ServiceDSL__Group__31484);
            rule__ServiceDSL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__3"


    // $ANTLR start "rule__ServiceDSL__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:712:1: rule__ServiceDSL__Group__3__Impl : ( ( rule__ServiceDSL__ImportsAssignment_3 )* ) ;
    public final void rule__ServiceDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:716:1: ( ( ( rule__ServiceDSL__ImportsAssignment_3 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:717:1: ( ( rule__ServiceDSL__ImportsAssignment_3 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:717:1: ( ( rule__ServiceDSL__ImportsAssignment_3 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:718:1: ( rule__ServiceDSL__ImportsAssignment_3 )*
            {
             before(grammarAccess.getServiceDSLAccess().getImportsAssignment_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:719:1: ( rule__ServiceDSL__ImportsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:719:2: rule__ServiceDSL__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDSL__ImportsAssignment_3_in_rule__ServiceDSL__Group__3__Impl1511);
            	    rule__ServiceDSL__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getServiceDSLAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__3__Impl"


    // $ANTLR start "rule__ServiceDSL__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:729:1: rule__ServiceDSL__Group__4 : rule__ServiceDSL__Group__4__Impl ;
    public final void rule__ServiceDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:733:1: ( rule__ServiceDSL__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:734:2: rule__ServiceDSL__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__4__Impl_in_rule__ServiceDSL__Group__41542);
            rule__ServiceDSL__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__4"


    // $ANTLR start "rule__ServiceDSL__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:740:1: rule__ServiceDSL__Group__4__Impl : ( ( rule__ServiceDSL__Alternatives_4 )* ) ;
    public final void rule__ServiceDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:744:1: ( ( ( rule__ServiceDSL__Alternatives_4 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:745:1: ( ( rule__ServiceDSL__Alternatives_4 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:745:1: ( ( rule__ServiceDSL__Alternatives_4 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:746:1: ( rule__ServiceDSL__Alternatives_4 )*
            {
             before(grammarAccess.getServiceDSLAccess().getAlternatives_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:747:1: ( rule__ServiceDSL__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==22||(LA8_0>=29 && LA8_0<=30)||LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:747:2: rule__ServiceDSL__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDSL__Alternatives_4_in_rule__ServiceDSL__Group__4__Impl1569);
            	    rule__ServiceDSL__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceDSLAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__Group__4__Impl"


    // $ANTLR start "rule__WebService__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:767:1: rule__WebService__Group__0 : rule__WebService__Group__0__Impl rule__WebService__Group__1 ;
    public final void rule__WebService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:771:1: ( rule__WebService__Group__0__Impl rule__WebService__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:772:2: rule__WebService__Group__0__Impl rule__WebService__Group__1
            {
            pushFollow(FOLLOW_rule__WebService__Group__0__Impl_in_rule__WebService__Group__01610);
            rule__WebService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__1_in_rule__WebService__Group__01613);
            rule__WebService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__0"


    // $ANTLR start "rule__WebService__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:779:1: rule__WebService__Group__0__Impl : ( () ) ;
    public final void rule__WebService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:783:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:784:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:784:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:785:1: ()
            {
             before(grammarAccess.getWebServiceAccess().getWebServiceAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:786:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:788:1: 
            {
            }

             after(grammarAccess.getWebServiceAccess().getWebServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__0__Impl"


    // $ANTLR start "rule__WebService__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:798:1: rule__WebService__Group__1 : rule__WebService__Group__1__Impl rule__WebService__Group__2 ;
    public final void rule__WebService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:802:1: ( rule__WebService__Group__1__Impl rule__WebService__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:803:2: rule__WebService__Group__1__Impl rule__WebService__Group__2
            {
            pushFollow(FOLLOW_rule__WebService__Group__1__Impl_in_rule__WebService__Group__11671);
            rule__WebService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__2_in_rule__WebService__Group__11674);
            rule__WebService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__1"


    // $ANTLR start "rule__WebService__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:810:1: rule__WebService__Group__1__Impl : ( 'Web service' ) ;
    public final void rule__WebService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:814:1: ( ( 'Web service' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:815:1: ( 'Web service' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:815:1: ( 'Web service' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:816:1: 'Web service'
            {
             before(grammarAccess.getWebServiceAccess().getWebServiceKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__WebService__Group__1__Impl1702); 
             after(grammarAccess.getWebServiceAccess().getWebServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__1__Impl"


    // $ANTLR start "rule__WebService__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:829:1: rule__WebService__Group__2 : rule__WebService__Group__2__Impl rule__WebService__Group__3 ;
    public final void rule__WebService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:833:1: ( rule__WebService__Group__2__Impl rule__WebService__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:834:2: rule__WebService__Group__2__Impl rule__WebService__Group__3
            {
            pushFollow(FOLLOW_rule__WebService__Group__2__Impl_in_rule__WebService__Group__21733);
            rule__WebService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__3_in_rule__WebService__Group__21736);
            rule__WebService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__2"


    // $ANTLR start "rule__WebService__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:841:1: rule__WebService__Group__2__Impl : ( ( rule__WebService__NameAssignment_2 ) ) ;
    public final void rule__WebService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:845:1: ( ( ( rule__WebService__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:846:1: ( ( rule__WebService__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:846:1: ( ( rule__WebService__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:847:1: ( rule__WebService__NameAssignment_2 )
            {
             before(grammarAccess.getWebServiceAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:848:1: ( rule__WebService__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:848:2: rule__WebService__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WebService__NameAssignment_2_in_rule__WebService__Group__2__Impl1763);
            rule__WebService__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWebServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__2__Impl"


    // $ANTLR start "rule__WebService__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:858:1: rule__WebService__Group__3 : rule__WebService__Group__3__Impl rule__WebService__Group__4 ;
    public final void rule__WebService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:862:1: ( rule__WebService__Group__3__Impl rule__WebService__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:863:2: rule__WebService__Group__3__Impl rule__WebService__Group__4
            {
            pushFollow(FOLLOW_rule__WebService__Group__3__Impl_in_rule__WebService__Group__31793);
            rule__WebService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__4_in_rule__WebService__Group__31796);
            rule__WebService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__3"


    // $ANTLR start "rule__WebService__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:870:1: rule__WebService__Group__3__Impl : ( '{' ) ;
    public final void rule__WebService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:874:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:875:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:875:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:876:1: '{'
            {
             before(grammarAccess.getWebServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__WebService__Group__3__Impl1824); 
             after(grammarAccess.getWebServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__3__Impl"


    // $ANTLR start "rule__WebService__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:889:1: rule__WebService__Group__4 : rule__WebService__Group__4__Impl rule__WebService__Group__5 ;
    public final void rule__WebService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:893:1: ( rule__WebService__Group__4__Impl rule__WebService__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:894:2: rule__WebService__Group__4__Impl rule__WebService__Group__5
            {
            pushFollow(FOLLOW_rule__WebService__Group__4__Impl_in_rule__WebService__Group__41855);
            rule__WebService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__5_in_rule__WebService__Group__41858);
            rule__WebService__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__4"


    // $ANTLR start "rule__WebService__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:901:1: rule__WebService__Group__4__Impl : ( ( rule__WebService__Group_4__0 )* ) ;
    public final void rule__WebService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:905:1: ( ( ( rule__WebService__Group_4__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:906:1: ( ( rule__WebService__Group_4__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:906:1: ( ( rule__WebService__Group_4__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:907:1: ( rule__WebService__Group_4__0 )*
            {
             before(grammarAccess.getWebServiceAccess().getGroup_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:908:1: ( rule__WebService__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:908:2: rule__WebService__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__WebService__Group_4__0_in_rule__WebService__Group__4__Impl1885);
            	    rule__WebService__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWebServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__4__Impl"


    // $ANTLR start "rule__WebService__Group__5"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:918:1: rule__WebService__Group__5 : rule__WebService__Group__5__Impl ;
    public final void rule__WebService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:922:1: ( rule__WebService__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:923:2: rule__WebService__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WebService__Group__5__Impl_in_rule__WebService__Group__51916);
            rule__WebService__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__5"


    // $ANTLR start "rule__WebService__Group__5__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:929:1: rule__WebService__Group__5__Impl : ( '}' ) ;
    public final void rule__WebService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:933:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:934:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:934:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:935:1: '}'
            {
             before(grammarAccess.getWebServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__WebService__Group__5__Impl1944); 
             after(grammarAccess.getWebServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group__5__Impl"


    // $ANTLR start "rule__WebService__Group_4__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:960:1: rule__WebService__Group_4__0 : rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1 ;
    public final void rule__WebService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:964:1: ( rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:965:2: rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1
            {
            pushFollow(FOLLOW_rule__WebService__Group_4__0__Impl_in_rule__WebService__Group_4__01987);
            rule__WebService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group_4__1_in_rule__WebService__Group_4__01990);
            rule__WebService__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group_4__0"


    // $ANTLR start "rule__WebService__Group_4__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:972:1: rule__WebService__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__WebService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:976:1: ( ( 'operation' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:977:1: ( 'operation' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:977:1: ( 'operation' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:978:1: 'operation'
            {
             before(grammarAccess.getWebServiceAccess().getOperationKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__WebService__Group_4__0__Impl2018); 
             after(grammarAccess.getWebServiceAccess().getOperationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group_4__0__Impl"


    // $ANTLR start "rule__WebService__Group_4__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:991:1: rule__WebService__Group_4__1 : rule__WebService__Group_4__1__Impl ;
    public final void rule__WebService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:995:1: ( rule__WebService__Group_4__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:996:2: rule__WebService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WebService__Group_4__1__Impl_in_rule__WebService__Group_4__12049);
            rule__WebService__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group_4__1"


    // $ANTLR start "rule__WebService__Group_4__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1002:1: rule__WebService__Group_4__1__Impl : ( ( rule__WebService__OperationsAssignment_4_1 ) ) ;
    public final void rule__WebService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1006:1: ( ( ( rule__WebService__OperationsAssignment_4_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1007:1: ( ( rule__WebService__OperationsAssignment_4_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1007:1: ( ( rule__WebService__OperationsAssignment_4_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1008:1: ( rule__WebService__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getWebServiceAccess().getOperationsAssignment_4_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1009:1: ( rule__WebService__OperationsAssignment_4_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1009:2: rule__WebService__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__WebService__OperationsAssignment_4_1_in_rule__WebService__Group_4__1__Impl2076);
            rule__WebService__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWebServiceAccess().getOperationsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1023:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1027:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1028:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02110);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02113);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1035:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1039:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1040:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1040:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1041:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1042:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1044:1: 
            {
            }

             after(grammarAccess.getOperationAccess().getOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1054:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1058:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1059:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12171);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12174);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1066:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1070:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1071:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1071:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1072:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1073:1: ( rule__Operation__NameAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1073:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2201);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1083:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1087:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1088:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22231);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22234);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1095:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1099:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1100:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1100:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1101:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__Operation__Group__2__Impl2262); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1114:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1118:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1119:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32293);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32296);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1126:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1130:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1131:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1131:1: ( ( rule__Operation__Group_3__0 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1132:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1133:1: ( rule__Operation__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1133:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2323);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1143:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1147:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1148:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42354);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42357);
            rule__Operation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1155:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1159:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1160:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1160:1: ( ( rule__Operation__Group_4__0 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1161:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1162:1: ( rule__Operation__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1162:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2384);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1172:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1176:1: ( rule__Operation__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1177:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52415);
            rule__Operation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1183:1: rule__Operation__Group__5__Impl : ( '}' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1187:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1188:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1188:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1189:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__5__Impl2443); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1214:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1218:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1219:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02486);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02489);
            rule__Operation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1226:1: rule__Operation__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1230:1: ( ( 'input' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1231:1: ( 'input' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1231:1: ( 'input' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1232:1: 'input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Operation__Group_3__0__Impl2517); 
             after(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1245:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1249:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1250:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12548);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12551);
            rule__Operation__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1257:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__InputNameAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1261:1: ( ( ( rule__Operation__InputNameAssignment_3_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1262:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1262:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1263:1: ( rule__Operation__InputNameAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getInputNameAssignment_3_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1264:1: ( rule__Operation__InputNameAssignment_3_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1264:2: rule__Operation__InputNameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2578);
            rule__Operation__InputNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getInputNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1274:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1278:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1279:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22608);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22611);
            rule__Operation__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__2"


    // $ANTLR start "rule__Operation__Group_3__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1286:1: rule__Operation__Group_3__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1290:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1291:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1291:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1292:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_2()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group_3__2__Impl2639); 
             after(grammarAccess.getOperationAccess().getColonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__2__Impl"


    // $ANTLR start "rule__Operation__Group_3__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1305:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1309:1: ( rule__Operation__Group_3__3__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1310:2: rule__Operation__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32670);
            rule__Operation__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__3"


    // $ANTLR start "rule__Operation__Group_3__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1316:1: rule__Operation__Group_3__3__Impl : ( ( rule__Operation__InputTypeAssignment_3_3 ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1320:1: ( ( ( rule__Operation__InputTypeAssignment_3_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1321:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1321:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1322:1: ( rule__Operation__InputTypeAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getInputTypeAssignment_3_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1323:1: ( rule__Operation__InputTypeAssignment_3_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1323:2: rule__Operation__InputTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2697);
            rule__Operation__InputTypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getInputTypeAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__3__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1341:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1345:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1346:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02735);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02738);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1353:1: rule__Operation__Group_4__0__Impl : ( 'output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1357:1: ( ( 'output' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1358:1: ( 'output' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1358:1: ( 'output' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1359:1: 'output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group_4__0__Impl2766); 
             after(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1372:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1376:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1377:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12797);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12800);
            rule__Operation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1384:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__OutputNameAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1388:1: ( ( ( rule__Operation__OutputNameAssignment_4_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1389:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1389:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1390:1: ( rule__Operation__OutputNameAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getOutputNameAssignment_4_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1391:1: ( rule__Operation__OutputNameAssignment_4_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1391:2: rule__Operation__OutputNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2827);
            rule__Operation__OutputNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOutputNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1401:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1405:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1406:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22857);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22860);
            rule__Operation__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__2"


    // $ANTLR start "rule__Operation__Group_4__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1413:1: rule__Operation__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1417:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1418:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1418:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1419:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_2()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group_4__2__Impl2888); 
             after(grammarAccess.getOperationAccess().getColonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__2__Impl"


    // $ANTLR start "rule__Operation__Group_4__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1432:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1436:1: ( rule__Operation__Group_4__3__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1437:2: rule__Operation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32919);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__3"


    // $ANTLR start "rule__Operation__Group_4__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1443:1: rule__Operation__Group_4__3__Impl : ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1447:1: ( ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1448:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1448:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1449:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeAssignment_4_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1450:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1450:2: rule__Operation__OutputTypeAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2946);
            rule__Operation__OutputTypeAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOutputTypeAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__3__Impl"


    // $ANTLR start "rule__RESTService__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1468:1: rule__RESTService__Group__0 : rule__RESTService__Group__0__Impl rule__RESTService__Group__1 ;
    public final void rule__RESTService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1472:1: ( rule__RESTService__Group__0__Impl rule__RESTService__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1473:2: rule__RESTService__Group__0__Impl rule__RESTService__Group__1
            {
            pushFollow(FOLLOW_rule__RESTService__Group__0__Impl_in_rule__RESTService__Group__02984);
            rule__RESTService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__1_in_rule__RESTService__Group__02987);
            rule__RESTService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__0"


    // $ANTLR start "rule__RESTService__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1480:1: rule__RESTService__Group__0__Impl : ( () ) ;
    public final void rule__RESTService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1484:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1485:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1485:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1486:1: ()
            {
             before(grammarAccess.getRESTServiceAccess().getRESTServiceAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1487:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1489:1: 
            {
            }

             after(grammarAccess.getRESTServiceAccess().getRESTServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__0__Impl"


    // $ANTLR start "rule__RESTService__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1499:1: rule__RESTService__Group__1 : rule__RESTService__Group__1__Impl rule__RESTService__Group__2 ;
    public final void rule__RESTService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1503:1: ( rule__RESTService__Group__1__Impl rule__RESTService__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1504:2: rule__RESTService__Group__1__Impl rule__RESTService__Group__2
            {
            pushFollow(FOLLOW_rule__RESTService__Group__1__Impl_in_rule__RESTService__Group__13045);
            rule__RESTService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__2_in_rule__RESTService__Group__13048);
            rule__RESTService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__1"


    // $ANTLR start "rule__RESTService__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1511:1: rule__RESTService__Group__1__Impl : ( 'REST service' ) ;
    public final void rule__RESTService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1515:1: ( ( 'REST service' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1516:1: ( 'REST service' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1516:1: ( 'REST service' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1517:1: 'REST service'
            {
             before(grammarAccess.getRESTServiceAccess().getRESTServiceKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__RESTService__Group__1__Impl3076); 
             after(grammarAccess.getRESTServiceAccess().getRESTServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__1__Impl"


    // $ANTLR start "rule__RESTService__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1530:1: rule__RESTService__Group__2 : rule__RESTService__Group__2__Impl rule__RESTService__Group__3 ;
    public final void rule__RESTService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1534:1: ( rule__RESTService__Group__2__Impl rule__RESTService__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1535:2: rule__RESTService__Group__2__Impl rule__RESTService__Group__3
            {
            pushFollow(FOLLOW_rule__RESTService__Group__2__Impl_in_rule__RESTService__Group__23107);
            rule__RESTService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__3_in_rule__RESTService__Group__23110);
            rule__RESTService__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__2"


    // $ANTLR start "rule__RESTService__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1542:1: rule__RESTService__Group__2__Impl : ( ( rule__RESTService__NameAssignment_2 ) ) ;
    public final void rule__RESTService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1546:1: ( ( ( rule__RESTService__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1547:1: ( ( rule__RESTService__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1547:1: ( ( rule__RESTService__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1548:1: ( rule__RESTService__NameAssignment_2 )
            {
             before(grammarAccess.getRESTServiceAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1549:1: ( rule__RESTService__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1549:2: rule__RESTService__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RESTService__NameAssignment_2_in_rule__RESTService__Group__2__Impl3137);
            rule__RESTService__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRESTServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__2__Impl"


    // $ANTLR start "rule__RESTService__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1559:1: rule__RESTService__Group__3 : rule__RESTService__Group__3__Impl rule__RESTService__Group__4 ;
    public final void rule__RESTService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1563:1: ( rule__RESTService__Group__3__Impl rule__RESTService__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1564:2: rule__RESTService__Group__3__Impl rule__RESTService__Group__4
            {
            pushFollow(FOLLOW_rule__RESTService__Group__3__Impl_in_rule__RESTService__Group__33167);
            rule__RESTService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__4_in_rule__RESTService__Group__33170);
            rule__RESTService__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__3"


    // $ANTLR start "rule__RESTService__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1571:1: rule__RESTService__Group__3__Impl : ( '{' ) ;
    public final void rule__RESTService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1575:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1576:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1576:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1577:1: '{'
            {
             before(grammarAccess.getRESTServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__RESTService__Group__3__Impl3198); 
             after(grammarAccess.getRESTServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__3__Impl"


    // $ANTLR start "rule__RESTService__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1590:1: rule__RESTService__Group__4 : rule__RESTService__Group__4__Impl ;
    public final void rule__RESTService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1594:1: ( rule__RESTService__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1595:2: rule__RESTService__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RESTService__Group__4__Impl_in_rule__RESTService__Group__43229);
            rule__RESTService__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__4"


    // $ANTLR start "rule__RESTService__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1601:1: rule__RESTService__Group__4__Impl : ( '}' ) ;
    public final void rule__RESTService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1605:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1606:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1606:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1607:1: '}'
            {
             before(grammarAccess.getRESTServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__RESTService__Group__4__Impl3257); 
             after(grammarAccess.getRESTServiceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1630:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1634:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1635:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__03298);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03301);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1642:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1646:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1647:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1647:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1648:1: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1649:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1651:1: 
            {
            }

             after(grammarAccess.getNodeAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1661:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1665:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1666:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__13359);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13362);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1673:1: rule__Node__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1677:1: ( ( 'Node' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1678:1: ( 'Node' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1678:1: ( 'Node' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1679:1: 'Node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group__1__Impl3390); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1692:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1696:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1697:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__23421);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23424);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1704:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1708:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1709:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1709:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1710:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1711:1: ( rule__Node__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1711:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3451);
            rule__Node__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1721:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1725:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1726:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33481);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33484);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1733:1: rule__Node__Group__3__Impl : ( 'uri' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1737:1: ( ( 'uri' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1738:1: ( 'uri' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1738:1: ( 'uri' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1739:1: 'uri'
            {
             before(grammarAccess.getNodeAccess().getUriKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group__3__Impl3512); 
             after(grammarAccess.getNodeAccess().getUriKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1752:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1756:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1757:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43543);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43546);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1764:1: rule__Node__Group__4__Impl : ( '=' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1768:1: ( ( '=' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1769:1: ( '=' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1769:1: ( '=' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1770:1: '='
            {
             before(grammarAccess.getNodeAccess().getEqualsSignKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group__4__Impl3574); 
             after(grammarAccess.getNodeAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1783:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1787:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1788:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53605);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53608);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1795:1: rule__Node__Group__5__Impl : ( ( rule__Node__BaseURIAssignment_5 ) ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1799:1: ( ( ( rule__Node__BaseURIAssignment_5 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1800:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1800:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1801:1: ( rule__Node__BaseURIAssignment_5 )
            {
             before(grammarAccess.getNodeAccess().getBaseURIAssignment_5()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1802:1: ( rule__Node__BaseURIAssignment_5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1802:2: rule__Node__BaseURIAssignment_5
            {
            pushFollow(FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3635);
            rule__Node__BaseURIAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getBaseURIAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1812:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1816:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1817:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63665);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63668);
            rule__Node__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1824:1: rule__Node__Group__6__Impl : ( 'hosts' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1828:1: ( ( 'hosts' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1829:1: ( 'hosts' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1829:1: ( 'hosts' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1830:1: 'hosts'
            {
             before(grammarAccess.getNodeAccess().getHostsKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group__6__Impl3696); 
             after(grammarAccess.getNodeAccess().getHostsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group__7"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1843:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1847:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1848:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73727);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73730);
            rule__Node__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7"


    // $ANTLR start "rule__Node__Group__7__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1855:1: rule__Node__Group__7__Impl : ( '{' ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1859:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1860:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1860:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1861:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Node__Group__7__Impl3758); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__7__Impl"


    // $ANTLR start "rule__Node__Group__8"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1874:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1878:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1879:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83789);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83792);
            rule__Node__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8"


    // $ANTLR start "rule__Node__Group__8__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1886:1: rule__Node__Group__8__Impl : ( ( rule__Node__ServicesAssignment_8 ) ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1890:1: ( ( ( rule__Node__ServicesAssignment_8 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1891:1: ( ( rule__Node__ServicesAssignment_8 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1891:1: ( ( rule__Node__ServicesAssignment_8 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1892:1: ( rule__Node__ServicesAssignment_8 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_8()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1893:1: ( rule__Node__ServicesAssignment_8 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1893:2: rule__Node__ServicesAssignment_8
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3819);
            rule__Node__ServicesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getServicesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__8__Impl"


    // $ANTLR start "rule__Node__Group__9"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1903:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1907:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1908:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93849);
            rule__Node__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93852);
            rule__Node__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9"


    // $ANTLR start "rule__Node__Group__9__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1915:1: rule__Node__Group__9__Impl : ( ( rule__Node__Group_9__0 )* ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1919:1: ( ( ( rule__Node__Group_9__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1920:1: ( ( rule__Node__Group_9__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1920:1: ( ( rule__Node__Group_9__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1921:1: ( rule__Node__Group_9__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_9()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1922:1: ( rule__Node__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1922:2: rule__Node__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3879);
            	    rule__Node__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__9__Impl"


    // $ANTLR start "rule__Node__Group__10"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1932:1: rule__Node__Group__10 : rule__Node__Group__10__Impl ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1936:1: ( rule__Node__Group__10__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1937:2: rule__Node__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103910);
            rule__Node__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10"


    // $ANTLR start "rule__Node__Group__10__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1943:1: rule__Node__Group__10__Impl : ( '}' ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1947:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1948:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1948:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1949:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,24,FOLLOW_24_in_rule__Node__Group__10__Impl3938); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__10__Impl"


    // $ANTLR start "rule__Node__Group_9__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1984:1: rule__Node__Group_9__0 : rule__Node__Group_9__0__Impl rule__Node__Group_9__1 ;
    public final void rule__Node__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1988:1: ( rule__Node__Group_9__0__Impl rule__Node__Group_9__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1989:2: rule__Node__Group_9__0__Impl rule__Node__Group_9__1
            {
            pushFollow(FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__03991);
            rule__Node__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__03994);
            rule__Node__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_9__0"


    // $ANTLR start "rule__Node__Group_9__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1996:1: rule__Node__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2000:1: ( ( ',' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2001:1: ( ',' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2001:1: ( ',' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2002:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_9_0()); 
            match(input,34,FOLLOW_34_in_rule__Node__Group_9__0__Impl4022); 
             after(grammarAccess.getNodeAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_9__0__Impl"


    // $ANTLR start "rule__Node__Group_9__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2015:1: rule__Node__Group_9__1 : rule__Node__Group_9__1__Impl ;
    public final void rule__Node__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2019:1: ( rule__Node__Group_9__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2020:2: rule__Node__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__14053);
            rule__Node__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_9__1"


    // $ANTLR start "rule__Node__Group_9__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2026:1: rule__Node__Group_9__1__Impl : ( ( rule__Node__ServicesAssignment_9_1 ) ) ;
    public final void rule__Node__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2030:1: ( ( ( rule__Node__ServicesAssignment_9_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2031:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2031:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2032:1: ( rule__Node__ServicesAssignment_9_1 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_9_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2033:1: ( rule__Node__ServicesAssignment_9_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2033:2: rule__Node__ServicesAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl4080);
            rule__Node__ServicesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getServicesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_9__1__Impl"


    // $ANTLR start "rule__ComplexElement__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2047:1: rule__ComplexElement__Group__0 : rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 ;
    public final void rule__ComplexElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2051:1: ( rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2052:2: rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__04114);
            rule__ComplexElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__04117);
            rule__ComplexElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__0"


    // $ANTLR start "rule__ComplexElement__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2059:1: rule__ComplexElement__Group__0__Impl : ( () ) ;
    public final void rule__ComplexElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2063:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2064:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2064:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2065:1: ()
            {
             before(grammarAccess.getComplexElementAccess().getComplexElementAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2066:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2068:1: 
            {
            }

             after(grammarAccess.getComplexElementAccess().getComplexElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__0__Impl"


    // $ANTLR start "rule__ComplexElement__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2078:1: rule__ComplexElement__Group__1 : rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 ;
    public final void rule__ComplexElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2082:1: ( rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2083:2: rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__14175);
            rule__ComplexElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__14178);
            rule__ComplexElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__1"


    // $ANTLR start "rule__ComplexElement__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2090:1: rule__ComplexElement__Group__1__Impl : ( 'complex-data' ) ;
    public final void rule__ComplexElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2094:1: ( ( 'complex-data' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2095:1: ( 'complex-data' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2095:1: ( 'complex-data' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2096:1: 'complex-data'
            {
             before(grammarAccess.getComplexElementAccess().getComplexDataKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__ComplexElement__Group__1__Impl4206); 
             after(grammarAccess.getComplexElementAccess().getComplexDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__1__Impl"


    // $ANTLR start "rule__ComplexElement__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2109:1: rule__ComplexElement__Group__2 : rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 ;
    public final void rule__ComplexElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2113:1: ( rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2114:2: rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__24237);
            rule__ComplexElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__24240);
            rule__ComplexElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__2"


    // $ANTLR start "rule__ComplexElement__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2121:1: rule__ComplexElement__Group__2__Impl : ( ( rule__ComplexElement__NameAssignment_2 ) ) ;
    public final void rule__ComplexElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2125:1: ( ( ( rule__ComplexElement__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2126:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2126:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2127:1: ( rule__ComplexElement__NameAssignment_2 )
            {
             before(grammarAccess.getComplexElementAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2128:1: ( rule__ComplexElement__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2128:2: rule__ComplexElement__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl4267);
            rule__ComplexElement__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexElementAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__2__Impl"


    // $ANTLR start "rule__ComplexElement__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2138:1: rule__ComplexElement__Group__3 : rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 ;
    public final void rule__ComplexElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2142:1: ( rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2143:2: rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__34297);
            rule__ComplexElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__34300);
            rule__ComplexElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__3"


    // $ANTLR start "rule__ComplexElement__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2150:1: rule__ComplexElement__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2154:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2155:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2155:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2156:1: '{'
            {
             before(grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__ComplexElement__Group__3__Impl4328); 
             after(grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__3__Impl"


    // $ANTLR start "rule__ComplexElement__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2169:1: rule__ComplexElement__Group__4 : rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 ;
    public final void rule__ComplexElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2173:1: ( rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2174:2: rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__44359);
            rule__ComplexElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__44362);
            rule__ComplexElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__4"


    // $ANTLR start "rule__ComplexElement__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2181:1: rule__ComplexElement__Group__4__Impl : ( ( rule__ComplexElement__ElementsAssignment_4 )* ) ;
    public final void rule__ComplexElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2185:1: ( ( ( rule__ComplexElement__ElementsAssignment_4 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2186:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2186:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2187:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComplexElementAccess().getElementsAssignment_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2188:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2188:2: rule__ComplexElement__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl4389);
            	    rule__ComplexElement__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComplexElementAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__4__Impl"


    // $ANTLR start "rule__ComplexElement__Group__5"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2198:1: rule__ComplexElement__Group__5 : rule__ComplexElement__Group__5__Impl ;
    public final void rule__ComplexElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2202:1: ( rule__ComplexElement__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2203:2: rule__ComplexElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__54420);
            rule__ComplexElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__5"


    // $ANTLR start "rule__ComplexElement__Group__5__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2209:1: rule__ComplexElement__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2213:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2214:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2214:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2215:1: '}'
            {
             before(grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__ComplexElement__Group__5__Impl4448); 
             after(grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__Group__5__Impl"


    // $ANTLR start "rule__SimpleElement__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2240:1: rule__SimpleElement__Group__0 : rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 ;
    public final void rule__SimpleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2244:1: ( rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2245:2: rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04491);
            rule__SimpleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04494);
            rule__SimpleElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__0"


    // $ANTLR start "rule__SimpleElement__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2252:1: rule__SimpleElement__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2256:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2257:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2257:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2258:1: ()
            {
             before(grammarAccess.getSimpleElementAccess().getSimpleElementAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2259:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2261:1: 
            {
            }

             after(grammarAccess.getSimpleElementAccess().getSimpleElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__0__Impl"


    // $ANTLR start "rule__SimpleElement__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2271:1: rule__SimpleElement__Group__1 : rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 ;
    public final void rule__SimpleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2275:1: ( rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2276:2: rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14552);
            rule__SimpleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14555);
            rule__SimpleElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__1"


    // $ANTLR start "rule__SimpleElement__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2283:1: rule__SimpleElement__Group__1__Impl : ( ( rule__SimpleElement__NameAssignment_1 ) ) ;
    public final void rule__SimpleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2287:1: ( ( ( rule__SimpleElement__NameAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2288:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2288:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2289:1: ( rule__SimpleElement__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleElementAccess().getNameAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2290:1: ( rule__SimpleElement__NameAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2290:2: rule__SimpleElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4582);
            rule__SimpleElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__1__Impl"


    // $ANTLR start "rule__SimpleElement__Group__2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2300:1: rule__SimpleElement__Group__2 : rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 ;
    public final void rule__SimpleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2304:1: ( rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2305:2: rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24612);
            rule__SimpleElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24615);
            rule__SimpleElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__2"


    // $ANTLR start "rule__SimpleElement__Group__2__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2312:1: rule__SimpleElement__Group__2__Impl : ( ':' ) ;
    public final void rule__SimpleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2316:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2317:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2317:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2318:1: ':'
            {
             before(grammarAccess.getSimpleElementAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__SimpleElement__Group__2__Impl4643); 
             after(grammarAccess.getSimpleElementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__2__Impl"


    // $ANTLR start "rule__SimpleElement__Group__3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2331:1: rule__SimpleElement__Group__3 : rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 ;
    public final void rule__SimpleElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2335:1: ( rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2336:2: rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34674);
            rule__SimpleElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34677);
            rule__SimpleElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__3"


    // $ANTLR start "rule__SimpleElement__Group__3__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2343:1: rule__SimpleElement__Group__3__Impl : ( ( rule__SimpleElement__Alternatives_3 ) ) ;
    public final void rule__SimpleElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2347:1: ( ( ( rule__SimpleElement__Alternatives_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2348:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2348:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2349:1: ( rule__SimpleElement__Alternatives_3 )
            {
             before(grammarAccess.getSimpleElementAccess().getAlternatives_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2350:1: ( rule__SimpleElement__Alternatives_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2350:2: rule__SimpleElement__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4704);
            rule__SimpleElement__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleElementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__3__Impl"


    // $ANTLR start "rule__SimpleElement__Group__4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2360:1: rule__SimpleElement__Group__4 : rule__SimpleElement__Group__4__Impl ;
    public final void rule__SimpleElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2364:1: ( rule__SimpleElement__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2365:2: rule__SimpleElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44734);
            rule__SimpleElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__4"


    // $ANTLR start "rule__SimpleElement__Group__4__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2371:1: rule__SimpleElement__Group__4__Impl : ( ( rule__SimpleElement__Alternatives_4 )? ) ;
    public final void rule__SimpleElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2375:1: ( ( ( rule__SimpleElement__Alternatives_4 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2376:1: ( ( rule__SimpleElement__Alternatives_4 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2376:1: ( ( rule__SimpleElement__Alternatives_4 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2377:1: ( rule__SimpleElement__Alternatives_4 )?
            {
             before(grammarAccess.getSimpleElementAccess().getAlternatives_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2378:1: ( rule__SimpleElement__Alternatives_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)||LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2378:2: rule__SimpleElement__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__Alternatives_4_in_rule__SimpleElement__Group__4__Impl4761);
                    rule__SimpleElement__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleElementAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2398:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2402:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2403:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04802);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04805);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2410:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2414:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2415:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2415:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2416:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4832); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2427:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2431:1: ( rule__FQN__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2432:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14861);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2438:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2442:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2443:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2443:1: ( ( rule__FQN__Group_1__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2444:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2445:1: ( rule__FQN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2445:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4888);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2459:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2463:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2464:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04923);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04926);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2471:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2475:1: ( ( '.' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2476:1: ( '.' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2476:1: ( '.' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2477:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl4954); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2490:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2494:1: ( rule__FQN__Group_1__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2495:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14985);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2501:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2505:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2506:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2506:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2507:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5012); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__FqnWildcard__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2522:1: rule__FqnWildcard__Group__0 : rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 ;
    public final void rule__FqnWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2526:1: ( rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2527:2: rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__05045);
            rule__FqnWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__05048);
            rule__FqnWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWildcard__Group__0"


    // $ANTLR start "rule__FqnWildcard__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2534:1: rule__FqnWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2538:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2539:1: ( ruleFQN )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2539:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2540:1: ruleFQN
            {
             before(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl5075);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWildcard__Group__0__Impl"


    // $ANTLR start "rule__FqnWildcard__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2551:1: rule__FqnWildcard__Group__1 : rule__FqnWildcard__Group__1__Impl ;
    public final void rule__FqnWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2555:1: ( rule__FqnWildcard__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2556:2: rule__FqnWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__15104);
            rule__FqnWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWildcard__Group__1"


    // $ANTLR start "rule__FqnWildcard__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2562:1: rule__FqnWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2566:1: ( ( ( '.*' )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2567:1: ( ( '.*' )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2567:1: ( ( '.*' )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2568:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2569:1: ( '.*' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2570:2: '.*'
                    {
                    match(input,37,FOLLOW_37_in_rule__FqnWildcard__Group__1__Impl5133); 

                    }
                    break;

            }

             after(grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FqnWildcard__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2585:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2589:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2590:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05170);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05173);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2597:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2601:1: ( ( 'import' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2602:1: ( 'import' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2602:1: ( 'import' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2603:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Import__Group__0__Impl5201); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2616:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2620:1: ( rule__Import__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2621:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15232);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2627:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2631:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2632:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2632:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2633:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2634:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2634:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5259);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ServiceDSL__NameAssignment_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2649:1: rule__ServiceDSL__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__ServiceDSL__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2653:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2654:1: ( ruleFQN )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2654:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2655:1: ruleFQN
            {
             before(grammarAccess.getServiceDSLAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ServiceDSL__NameAssignment_25298);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getServiceDSLAccess().getNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__NameAssignment_2"


    // $ANTLR start "rule__ServiceDSL__ImportsAssignment_3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2664:1: rule__ServiceDSL__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__ServiceDSL__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2668:1: ( ( ruleImport ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2669:1: ( ruleImport )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2669:1: ( ruleImport )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2670:1: ruleImport
            {
             before(grammarAccess.getServiceDSLAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ServiceDSL__ImportsAssignment_35329);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getServiceDSLAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__ImportsAssignment_3"


    // $ANTLR start "rule__ServiceDSL__ServicesAssignment_4_0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2679:1: rule__ServiceDSL__ServicesAssignment_4_0 : ( ruleService ) ;
    public final void rule__ServiceDSL__ServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2683:1: ( ( ruleService ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2684:1: ( ruleService )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2684:1: ( ruleService )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2685:1: ruleService
            {
             before(grammarAccess.getServiceDSLAccess().getServicesServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__ServiceDSL__ServicesAssignment_4_05360);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceDSLAccess().getServicesServiceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__ServicesAssignment_4_0"


    // $ANTLR start "rule__ServiceDSL__DataAssignment_4_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2694:1: rule__ServiceDSL__DataAssignment_4_1 : ( ruleDataElement ) ;
    public final void rule__ServiceDSL__DataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2698:1: ( ( ruleDataElement ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2699:1: ( ruleDataElement )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2699:1: ( ruleDataElement )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2700:1: ruleDataElement
            {
             before(grammarAccess.getServiceDSLAccess().getDataDataElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDataElement_in_rule__ServiceDSL__DataAssignment_4_15391);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getServiceDSLAccess().getDataDataElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__DataAssignment_4_1"


    // $ANTLR start "rule__ServiceDSL__NodesAssignment_4_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2709:1: rule__ServiceDSL__NodesAssignment_4_2 : ( ruleNode ) ;
    public final void rule__ServiceDSL__NodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2713:1: ( ( ruleNode ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2714:1: ( ruleNode )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2714:1: ( ruleNode )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2715:1: ruleNode
            {
             before(grammarAccess.getServiceDSLAccess().getNodesNodeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ServiceDSL__NodesAssignment_4_25422);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getServiceDSLAccess().getNodesNodeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDSL__NodesAssignment_4_2"


    // $ANTLR start "rule__WebService__NameAssignment_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2724:1: rule__WebService__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WebService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2728:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2729:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2729:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2730:1: RULE_ID
            {
             before(grammarAccess.getWebServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WebService__NameAssignment_25453); 
             after(grammarAccess.getWebServiceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__NameAssignment_2"


    // $ANTLR start "rule__WebService__OperationsAssignment_4_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2739:1: rule__WebService__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__WebService__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2743:1: ( ( ruleOperation ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2744:1: ( ruleOperation )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2744:1: ( ruleOperation )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2745:1: ruleOperation
            {
             before(grammarAccess.getWebServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__WebService__OperationsAssignment_4_15484);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getWebServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebService__OperationsAssignment_4_1"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2754:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2758:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2759:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2759:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2760:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15515); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__InputNameAssignment_3_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2769:1: rule__Operation__InputNameAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Operation__InputNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2773:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2774:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2774:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2775:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15546); 
             after(grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__InputNameAssignment_3_1"


    // $ANTLR start "rule__Operation__InputTypeAssignment_3_3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2784:1: rule__Operation__InputTypeAssignment_3_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__InputTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2788:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2789:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2789:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2790:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2791:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2792:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementFQNParserRuleCall_3_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35581);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getInputTypeDataElementFQNParserRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__InputTypeAssignment_3_3"


    // $ANTLR start "rule__Operation__OutputNameAssignment_4_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2803:1: rule__Operation__OutputNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Operation__OutputNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2807:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2808:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2808:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2809:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15616); 
             after(grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OutputNameAssignment_4_1"


    // $ANTLR start "rule__Operation__OutputTypeAssignment_4_3"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2818:1: rule__Operation__OutputTypeAssignment_4_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__OutputTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2822:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2823:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2823:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2824:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2825:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2826:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementFQNParserRuleCall_4_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35651);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getOutputTypeDataElementFQNParserRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OutputTypeAssignment_4_3"


    // $ANTLR start "rule__RESTService__NameAssignment_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2837:1: rule__RESTService__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RESTService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2841:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2842:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2842:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2843:1: RULE_ID
            {
             before(grammarAccess.getRESTServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RESTService__NameAssignment_25686); 
             after(grammarAccess.getRESTServiceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RESTService__NameAssignment_2"


    // $ANTLR start "rule__Node__NameAssignment_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2852:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2856:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2857:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2857:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2858:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25717); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_2"


    // $ANTLR start "rule__Node__BaseURIAssignment_5"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2867:1: rule__Node__BaseURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Node__BaseURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2871:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2872:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2872:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2873:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55748); 
             after(grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__BaseURIAssignment_5"


    // $ANTLR start "rule__Node__ServicesAssignment_8"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2882:1: rule__Node__ServicesAssignment_8 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2886:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2887:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2887:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2888:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2889:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2890:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85783);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ServicesAssignment_8"


    // $ANTLR start "rule__Node__ServicesAssignment_9_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2901:1: rule__Node__ServicesAssignment_9_1 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2905:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2906:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2906:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2907:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2908:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2909:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15822);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ServicesAssignment_9_1"


    // $ANTLR start "rule__ComplexElement__NameAssignment_2"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2920:1: rule__ComplexElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2924:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2925:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2925:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2926:1: RULE_ID
            {
             before(grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25857); 
             after(grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__NameAssignment_2"


    // $ANTLR start "rule__ComplexElement__ElementsAssignment_4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2935:1: rule__ComplexElement__ElementsAssignment_4 : ( ruleSimpleElement ) ;
    public final void rule__ComplexElement__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2939:1: ( ( ruleSimpleElement ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2940:1: ( ruleSimpleElement )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2940:1: ( ruleSimpleElement )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2941:1: ruleSimpleElement
            {
             before(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45888);
            ruleSimpleElement();

            state._fsp--;

             after(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexElement__ElementsAssignment_4"


    // $ANTLR start "rule__SimpleElement__NameAssignment_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2950:1: rule__SimpleElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2954:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2955:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2955:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2956:1: RULE_ID
            {
             before(grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15919); 
             after(grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__NameAssignment_1"


    // $ANTLR start "rule__SimpleElement__TypeAssignment_3_0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2965:1: rule__SimpleElement__TypeAssignment_3_0 : ( ruleDATATYPE ) ;
    public final void rule__SimpleElement__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2969:1: ( ( ruleDATATYPE ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2970:1: ( ruleDATATYPE )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2970:1: ( ruleDATATYPE )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2971:1: ruleDATATYPE
            {
             before(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05950);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__TypeAssignment_3_0"


    // $ANTLR start "rule__SimpleElement__RefAssignment_3_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2980:1: rule__SimpleElement__RefAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SimpleElement__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2984:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2985:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2985:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2986:1: ( ruleFQN )
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2987:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2988:1: ruleFQN
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_15985);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSimpleElementAccess().getRefComplexElementFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__RefAssignment_3_1"


    // $ANTLR start "rule__SimpleElement__MultiplicityAssignment_4_0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2999:1: rule__SimpleElement__MultiplicityAssignment_4_0 : ( ( '?' ) ) ;
    public final void rule__SimpleElement__MultiplicityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3003:1: ( ( ( '?' ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3004:1: ( ( '?' ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3004:1: ( ( '?' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3005:1: ( '?' )
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityQuestionMarkKeyword_4_0_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3006:1: ( '?' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3007:1: '?'
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityQuestionMarkKeyword_4_0_0()); 
            match(input,39,FOLLOW_39_in_rule__SimpleElement__MultiplicityAssignment_4_06025); 
             after(grammarAccess.getSimpleElementAccess().getMultiplicityQuestionMarkKeyword_4_0_0()); 

            }

             after(grammarAccess.getSimpleElementAccess().getMultiplicityQuestionMarkKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__MultiplicityAssignment_4_0"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3022:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3026:1: ( ( ruleFqnWildcard ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3027:1: ( ruleFqnWildcard )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3027:1: ( ruleFqnWildcard )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3028:1: ruleFqnWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_16064);
            ruleFqnWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleServiceDSL_in_entryRuleServiceDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__0_in_ruleServiceDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Alternatives_in_ruleService154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebService_in_entryRuleWebService181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebService188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__0_in_ruleWebService214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTService_in_entryRuleRESTService301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRESTService308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__0_in_ruleRESTService334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Alternatives_in_ruleDataElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_entryRuleComplexElement481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexElement488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__0_in_ruleComplexElement514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__0_in_ruleSimpleElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWildcard668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__0_in_ruleFqnWildcard694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATATYPE__Alternatives_in_ruleDATATYPE791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__ServicesAssignment_4_0_in_rule__ServiceDSL__Alternatives_4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__DataAssignment_4_1_in_rule__ServiceDSL__Alternatives_4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__NodesAssignment_4_2_in_rule__ServiceDSL__Alternatives_4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebService_in_rule__Service__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTService_in_rule__Service__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_31011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_0_in_rule__SimpleElement__Alternatives_41044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SimpleElement__Alternatives_41063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleElement__Alternatives_41083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DATATYPE__Alternatives1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DATATYPE__Alternatives1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DATATYPE__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DATATYPE__Alternatives1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DATATYPE__Alternatives1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DATATYPE__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DATATYPE__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DATATYPE__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__0__Impl_in_rule__ServiceDSL__Group__01298 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__1_in_rule__ServiceDSL__Group__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__1__Impl_in_rule__ServiceDSL__Group__11359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__2_in_rule__ServiceDSL__Group__11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceDSL__Group__1__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__2__Impl_in_rule__ServiceDSL__Group__21421 = new BitSet(new long[]{0x0000004860400010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__3_in_rule__ServiceDSL__Group__21424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__NameAssignment_2_in_rule__ServiceDSL__Group__2__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__3__Impl_in_rule__ServiceDSL__Group__31481 = new BitSet(new long[]{0x0000004860400010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__4_in_rule__ServiceDSL__Group__31484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__ImportsAssignment_3_in_rule__ServiceDSL__Group__3__Impl1511 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__4__Impl_in_rule__ServiceDSL__Group__41542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Alternatives_4_in_rule__ServiceDSL__Group__4__Impl1569 = new BitSet(new long[]{0x0000000860400012L});
    public static final BitSet FOLLOW_rule__WebService__Group__0__Impl_in_rule__WebService__Group__01610 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__WebService__Group__1_in_rule__WebService__Group__01613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__1__Impl_in_rule__WebService__Group__11671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WebService__Group__2_in_rule__WebService__Group__11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__WebService__Group__1__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__2__Impl_in_rule__WebService__Group__21733 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WebService__Group__3_in_rule__WebService__Group__21736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__NameAssignment_2_in_rule__WebService__Group__2__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__3__Impl_in_rule__WebService__Group__31793 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__WebService__Group__4_in_rule__WebService__Group__31796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WebService__Group__3__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__4__Impl_in_rule__WebService__Group__41855 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__WebService__Group__5_in_rule__WebService__Group__41858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__0_in_rule__WebService__Group__4__Impl1885 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__5__Impl_in_rule__WebService__Group__51916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WebService__Group__5__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__0__Impl_in_rule__WebService__Group_4__01987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__1_in_rule__WebService__Group_4__01990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__WebService__Group_4__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__1__Impl_in_rule__WebService__Group_4__12049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__OperationsAssignment_4_1_in_rule__WebService__Group_4__1__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12171 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22231 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operation__Group__2__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32293 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42354 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__5__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operation__Group_3__0__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12548 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group_3__2__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group_4__0__Impl2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12797 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group_4__2__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__0__Impl_in_rule__RESTService__Group__02984 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__1_in_rule__RESTService__Group__02987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__1__Impl_in_rule__RESTService__Group__13045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RESTService__Group__2_in_rule__RESTService__Group__13048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RESTService__Group__1__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__2__Impl_in_rule__RESTService__Group__23107 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__3_in_rule__RESTService__Group__23110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__NameAssignment_2_in_rule__RESTService__Group__2__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__3__Impl_in_rule__RESTService__Group__33167 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__4_in_rule__RESTService__Group__33170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RESTService__Group__3__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__4__Impl_in_rule__RESTService__Group__43229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RESTService__Group__4__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__03298 = new BitSet(new long[]{0x0000000860400010L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__13359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group__1__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__23421 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33481 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group__3__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group__4__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53605 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group__6__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Node__Group__7__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83789 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93849 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3879 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Node__Group__10__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__03991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__03994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Node__Group_9__0__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__04114 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__04117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__14175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ComplexElement__Group__1__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__24237 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__24240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__34297 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__34300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ComplexElement__Group__3__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__44359 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__44362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl4389 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__54420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComplexElement__Group__5__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14552 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24612 = new BitSet(new long[]{0x00000000001FE010L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SimpleElement__Group__2__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34674 = new BitSet(new long[]{0x0000008000001800L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Alternatives_4_in_rule__SimpleElement__Group__4__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04802 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4888 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__05045 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__05048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__15104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FqnWildcard__Group__1__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Import__Group__0__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ServiceDSL__NameAssignment_25298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ServiceDSL__ImportsAssignment_35329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ServiceDSL__ServicesAssignment_4_05360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_rule__ServiceDSL__DataAssignment_4_15391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ServiceDSL__NodesAssignment_4_25422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WebService__NameAssignment_25453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__WebService__OperationsAssignment_4_15484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RESTService__NameAssignment_25686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_15985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SimpleElement__MultiplicityAssignment_4_06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_16064 = new BitSet(new long[]{0x0000000000000002L});

}