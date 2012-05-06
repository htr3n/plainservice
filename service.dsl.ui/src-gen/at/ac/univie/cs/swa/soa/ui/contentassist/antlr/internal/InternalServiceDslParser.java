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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'integer'", "'float'", "'date'", "'time'", "'datetime'", "'binary'", "'boolean'", "'?'", "'+'", "'*'", "'module'", "'Web service'", "'{'", "'}'", "'operation'", "'input'", "':'", "'output'", "'REST service'", "'Node'", "'uri'", "'='", "'hosts'", "','", "'complex-data'", "'.'", "'.*'", "'import'"
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


    // $ANTLR start "ruleMULTIPLICITY"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:416:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:420:1: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:421:1: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:421:1: ( ( rule__MULTIPLICITY__Alternatives ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:422:1: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:423:1: ( rule__MULTIPLICITY__Alternatives )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:423:2: rule__MULTIPLICITY__Alternatives
            {
            pushFollow(FOLLOW_rule__MULTIPLICITY__Alternatives_in_ruleMULTIPLICITY827);
            rule__MULTIPLICITY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMULTIPLICITY"


    // $ANTLR start "rule__ServiceDSL__Alternatives_4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:434:1: rule__ServiceDSL__Alternatives_4 : ( ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) ) | ( ( rule__ServiceDSL__DataAssignment_4_1 ) ) | ( ( rule__ServiceDSL__NodesAssignment_4_2 ) ) );
    public final void rule__ServiceDSL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:438:1: ( ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) ) | ( ( rule__ServiceDSL__DataAssignment_4_1 ) ) | ( ( rule__ServiceDSL__NodesAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
            case 30:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
            case 36:
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
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:439:1: ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:439:1: ( ( rule__ServiceDSL__ServicesAssignment_4_0 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:440:1: ( rule__ServiceDSL__ServicesAssignment_4_0 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getServicesAssignment_4_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:441:1: ( rule__ServiceDSL__ServicesAssignment_4_0 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:441:2: rule__ServiceDSL__ServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__ServicesAssignment_4_0_in_rule__ServiceDSL__Alternatives_4862);
                    rule__ServiceDSL__ServicesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceDSLAccess().getServicesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:445:6: ( ( rule__ServiceDSL__DataAssignment_4_1 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:445:6: ( ( rule__ServiceDSL__DataAssignment_4_1 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:446:1: ( rule__ServiceDSL__DataAssignment_4_1 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getDataAssignment_4_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:447:1: ( rule__ServiceDSL__DataAssignment_4_1 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:447:2: rule__ServiceDSL__DataAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__DataAssignment_4_1_in_rule__ServiceDSL__Alternatives_4880);
                    rule__ServiceDSL__DataAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceDSLAccess().getDataAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:451:6: ( ( rule__ServiceDSL__NodesAssignment_4_2 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:451:6: ( ( rule__ServiceDSL__NodesAssignment_4_2 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:452:1: ( rule__ServiceDSL__NodesAssignment_4_2 )
                    {
                     before(grammarAccess.getServiceDSLAccess().getNodesAssignment_4_2()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:453:1: ( rule__ServiceDSL__NodesAssignment_4_2 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:453:2: rule__ServiceDSL__NodesAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__ServiceDSL__NodesAssignment_4_2_in_rule__ServiceDSL__Alternatives_4898);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:462:1: rule__Service__Alternatives : ( ( ruleWebService ) | ( ruleRESTService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:466:1: ( ( ruleWebService ) | ( ruleRESTService ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:467:1: ( ruleWebService )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:467:1: ( ruleWebService )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:468:1: ruleWebService
                    {
                     before(grammarAccess.getServiceAccess().getWebServiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWebService_in_rule__Service__Alternatives931);
                    ruleWebService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getWebServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:473:6: ( ruleRESTService )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:473:6: ( ruleRESTService )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:474:1: ruleRESTService
                    {
                     before(grammarAccess.getServiceAccess().getRESTServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRESTService_in_rule__Service__Alternatives948);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:484:1: rule__DataElement__Alternatives : ( ( ruleSimpleElement ) | ( ruleComplexElement ) );
    public final void rule__DataElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:488:1: ( ( ruleSimpleElement ) | ( ruleComplexElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:489:1: ( ruleSimpleElement )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:489:1: ( ruleSimpleElement )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:490:1: ruleSimpleElement
                    {
                     before(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives980);
                    ruleSimpleElement();

                    state._fsp--;

                     after(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:495:6: ( ruleComplexElement )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:495:6: ( ruleComplexElement )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:496:1: ruleComplexElement
                    {
                     before(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives997);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:506:1: rule__SimpleElement__Alternatives_3 : ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) );
    public final void rule__SimpleElement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:510:1: ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=18)) ) {
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
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:511:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:511:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:512:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:513:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:513:2: rule__SimpleElement__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_31029);
                    rule__SimpleElement__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:517:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:517:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:518:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getRefAssignment_3_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:519:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:519:2: rule__SimpleElement__RefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_31047);
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


    // $ANTLR start "rule__DATATYPE__Alternatives"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:528:1: rule__DATATYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'datetime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) );
    public final void rule__DATATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:532:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'datetime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:533:1: ( ( 'string' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:533:1: ( ( 'string' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:534:1: ( 'string' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:535:1: ( 'string' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:535:3: 'string'
                    {
                    match(input,11,FOLLOW_11_in_rule__DATATYPE__Alternatives1081); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:540:6: ( ( 'integer' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:540:6: ( ( 'integer' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:541:1: ( 'integer' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:542:1: ( 'integer' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:542:3: 'integer'
                    {
                    match(input,12,FOLLOW_12_in_rule__DATATYPE__Alternatives1102); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:547:6: ( ( 'float' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:547:6: ( ( 'float' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:548:1: ( 'float' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:549:1: ( 'float' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:549:3: 'float'
                    {
                    match(input,13,FOLLOW_13_in_rule__DATATYPE__Alternatives1123); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:554:6: ( ( 'date' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:554:6: ( ( 'date' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:555:1: ( 'date' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:556:1: ( 'date' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:556:3: 'date'
                    {
                    match(input,14,FOLLOW_14_in_rule__DATATYPE__Alternatives1144); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:561:6: ( ( 'time' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:561:6: ( ( 'time' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:562:1: ( 'time' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:563:1: ( 'time' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:563:3: 'time'
                    {
                    match(input,15,FOLLOW_15_in_rule__DATATYPE__Alternatives1165); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:568:6: ( ( 'datetime' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:568:6: ( ( 'datetime' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:569:1: ( 'datetime' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:570:1: ( 'datetime' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:570:3: 'datetime'
                    {
                    match(input,16,FOLLOW_16_in_rule__DATATYPE__Alternatives1186); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:575:6: ( ( 'binary' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:575:6: ( ( 'binary' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:576:1: ( 'binary' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:577:1: ( 'binary' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:577:3: 'binary'
                    {
                    match(input,17,FOLLOW_17_in_rule__DATATYPE__Alternatives1207); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:582:6: ( ( 'boolean' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:582:6: ( ( 'boolean' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:583:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:584:1: ( 'boolean' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:584:3: 'boolean'
                    {
                    match(input,18,FOLLOW_18_in_rule__DATATYPE__Alternatives1228); 

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


    // $ANTLR start "rule__MULTIPLICITY__Alternatives"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:594:1: rule__MULTIPLICITY__Alternatives : ( ( ( '?' ) ) | ( ( '+' ) ) | ( ( '*' ) ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:598:1: ( ( ( '?' ) ) | ( ( '+' ) ) | ( ( '*' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:599:1: ( ( '?' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:599:1: ( ( '?' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:600:1: ( '?' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:601:1: ( '?' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:601:3: '?'
                    {
                    match(input,19,FOLLOW_19_in_rule__MULTIPLICITY__Alternatives1264); 

                    }

                     after(grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:606:6: ( ( '+' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:606:6: ( ( '+' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:607:1: ( '+' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:608:1: ( '+' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:608:3: '+'
                    {
                    match(input,20,FOLLOW_20_in_rule__MULTIPLICITY__Alternatives1285); 

                    }

                     after(grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:613:6: ( ( '*' ) )
                    {
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:613:6: ( ( '*' ) )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:614:1: ( '*' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2()); 
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:615:1: ( '*' )
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:615:3: '*'
                    {
                    match(input,21,FOLLOW_21_in_rule__MULTIPLICITY__Alternatives1306); 

                    }

                     after(grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MULTIPLICITY__Alternatives"


    // $ANTLR start "rule__ServiceDSL__Group__0"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:627:1: rule__ServiceDSL__Group__0 : rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1 ;
    public final void rule__ServiceDSL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:631:1: ( rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:632:2: rule__ServiceDSL__Group__0__Impl rule__ServiceDSL__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__0__Impl_in_rule__ServiceDSL__Group__01339);
            rule__ServiceDSL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__1_in_rule__ServiceDSL__Group__01342);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:639:1: rule__ServiceDSL__Group__0__Impl : ( () ) ;
    public final void rule__ServiceDSL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:643:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:644:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:644:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:645:1: ()
            {
             before(grammarAccess.getServiceDSLAccess().getServiceDSLAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:646:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:648:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:658:1: rule__ServiceDSL__Group__1 : rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2 ;
    public final void rule__ServiceDSL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:662:1: ( rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:663:2: rule__ServiceDSL__Group__1__Impl rule__ServiceDSL__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__1__Impl_in_rule__ServiceDSL__Group__11400);
            rule__ServiceDSL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__2_in_rule__ServiceDSL__Group__11403);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:670:1: rule__ServiceDSL__Group__1__Impl : ( 'module' ) ;
    public final void rule__ServiceDSL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:674:1: ( ( 'module' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:675:1: ( 'module' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:675:1: ( 'module' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:676:1: 'module'
            {
             before(grammarAccess.getServiceDSLAccess().getModuleKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ServiceDSL__Group__1__Impl1431); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:689:1: rule__ServiceDSL__Group__2 : rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3 ;
    public final void rule__ServiceDSL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:693:1: ( rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:694:2: rule__ServiceDSL__Group__2__Impl rule__ServiceDSL__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__2__Impl_in_rule__ServiceDSL__Group__21462);
            rule__ServiceDSL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__3_in_rule__ServiceDSL__Group__21465);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:701:1: rule__ServiceDSL__Group__2__Impl : ( ( rule__ServiceDSL__NameAssignment_2 ) ) ;
    public final void rule__ServiceDSL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:705:1: ( ( ( rule__ServiceDSL__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:706:1: ( ( rule__ServiceDSL__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:706:1: ( ( rule__ServiceDSL__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:707:1: ( rule__ServiceDSL__NameAssignment_2 )
            {
             before(grammarAccess.getServiceDSLAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:708:1: ( rule__ServiceDSL__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:708:2: rule__ServiceDSL__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceDSL__NameAssignment_2_in_rule__ServiceDSL__Group__2__Impl1492);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:718:1: rule__ServiceDSL__Group__3 : rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4 ;
    public final void rule__ServiceDSL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:722:1: ( rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:723:2: rule__ServiceDSL__Group__3__Impl rule__ServiceDSL__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__3__Impl_in_rule__ServiceDSL__Group__31522);
            rule__ServiceDSL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceDSL__Group__4_in_rule__ServiceDSL__Group__31525);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:730:1: rule__ServiceDSL__Group__3__Impl : ( ( rule__ServiceDSL__ImportsAssignment_3 )* ) ;
    public final void rule__ServiceDSL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:734:1: ( ( ( rule__ServiceDSL__ImportsAssignment_3 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:735:1: ( ( rule__ServiceDSL__ImportsAssignment_3 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:735:1: ( ( rule__ServiceDSL__ImportsAssignment_3 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:736:1: ( rule__ServiceDSL__ImportsAssignment_3 )*
            {
             before(grammarAccess.getServiceDSLAccess().getImportsAssignment_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:737:1: ( rule__ServiceDSL__ImportsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:737:2: rule__ServiceDSL__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDSL__ImportsAssignment_3_in_rule__ServiceDSL__Group__3__Impl1552);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:747:1: rule__ServiceDSL__Group__4 : rule__ServiceDSL__Group__4__Impl ;
    public final void rule__ServiceDSL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:751:1: ( rule__ServiceDSL__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:752:2: rule__ServiceDSL__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceDSL__Group__4__Impl_in_rule__ServiceDSL__Group__41583);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:758:1: rule__ServiceDSL__Group__4__Impl : ( ( rule__ServiceDSL__Alternatives_4 )* ) ;
    public final void rule__ServiceDSL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:762:1: ( ( ( rule__ServiceDSL__Alternatives_4 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:763:1: ( ( rule__ServiceDSL__Alternatives_4 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:763:1: ( ( rule__ServiceDSL__Alternatives_4 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:764:1: ( rule__ServiceDSL__Alternatives_4 )*
            {
             before(grammarAccess.getServiceDSLAccess().getAlternatives_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:765:1: ( rule__ServiceDSL__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23||(LA8_0>=30 && LA8_0<=31)||LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:765:2: rule__ServiceDSL__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__ServiceDSL__Alternatives_4_in_rule__ServiceDSL__Group__4__Impl1610);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:785:1: rule__WebService__Group__0 : rule__WebService__Group__0__Impl rule__WebService__Group__1 ;
    public final void rule__WebService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:789:1: ( rule__WebService__Group__0__Impl rule__WebService__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:790:2: rule__WebService__Group__0__Impl rule__WebService__Group__1
            {
            pushFollow(FOLLOW_rule__WebService__Group__0__Impl_in_rule__WebService__Group__01651);
            rule__WebService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__1_in_rule__WebService__Group__01654);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:797:1: rule__WebService__Group__0__Impl : ( () ) ;
    public final void rule__WebService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:801:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:802:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:802:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:803:1: ()
            {
             before(grammarAccess.getWebServiceAccess().getWebServiceAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:804:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:806:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:816:1: rule__WebService__Group__1 : rule__WebService__Group__1__Impl rule__WebService__Group__2 ;
    public final void rule__WebService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:820:1: ( rule__WebService__Group__1__Impl rule__WebService__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:821:2: rule__WebService__Group__1__Impl rule__WebService__Group__2
            {
            pushFollow(FOLLOW_rule__WebService__Group__1__Impl_in_rule__WebService__Group__11712);
            rule__WebService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__2_in_rule__WebService__Group__11715);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:828:1: rule__WebService__Group__1__Impl : ( 'Web service' ) ;
    public final void rule__WebService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:832:1: ( ( 'Web service' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:833:1: ( 'Web service' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:833:1: ( 'Web service' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:834:1: 'Web service'
            {
             before(grammarAccess.getWebServiceAccess().getWebServiceKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__WebService__Group__1__Impl1743); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:847:1: rule__WebService__Group__2 : rule__WebService__Group__2__Impl rule__WebService__Group__3 ;
    public final void rule__WebService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:851:1: ( rule__WebService__Group__2__Impl rule__WebService__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:852:2: rule__WebService__Group__2__Impl rule__WebService__Group__3
            {
            pushFollow(FOLLOW_rule__WebService__Group__2__Impl_in_rule__WebService__Group__21774);
            rule__WebService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__3_in_rule__WebService__Group__21777);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:859:1: rule__WebService__Group__2__Impl : ( ( rule__WebService__NameAssignment_2 ) ) ;
    public final void rule__WebService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:863:1: ( ( ( rule__WebService__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:864:1: ( ( rule__WebService__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:864:1: ( ( rule__WebService__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:865:1: ( rule__WebService__NameAssignment_2 )
            {
             before(grammarAccess.getWebServiceAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:866:1: ( rule__WebService__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:866:2: rule__WebService__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__WebService__NameAssignment_2_in_rule__WebService__Group__2__Impl1804);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:876:1: rule__WebService__Group__3 : rule__WebService__Group__3__Impl rule__WebService__Group__4 ;
    public final void rule__WebService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:880:1: ( rule__WebService__Group__3__Impl rule__WebService__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:881:2: rule__WebService__Group__3__Impl rule__WebService__Group__4
            {
            pushFollow(FOLLOW_rule__WebService__Group__3__Impl_in_rule__WebService__Group__31834);
            rule__WebService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__4_in_rule__WebService__Group__31837);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:888:1: rule__WebService__Group__3__Impl : ( '{' ) ;
    public final void rule__WebService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:892:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:893:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:893:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:894:1: '{'
            {
             before(grammarAccess.getWebServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__WebService__Group__3__Impl1865); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:907:1: rule__WebService__Group__4 : rule__WebService__Group__4__Impl rule__WebService__Group__5 ;
    public final void rule__WebService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:911:1: ( rule__WebService__Group__4__Impl rule__WebService__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:912:2: rule__WebService__Group__4__Impl rule__WebService__Group__5
            {
            pushFollow(FOLLOW_rule__WebService__Group__4__Impl_in_rule__WebService__Group__41896);
            rule__WebService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group__5_in_rule__WebService__Group__41899);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:919:1: rule__WebService__Group__4__Impl : ( ( rule__WebService__Group_4__0 )* ) ;
    public final void rule__WebService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:923:1: ( ( ( rule__WebService__Group_4__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:924:1: ( ( rule__WebService__Group_4__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:924:1: ( ( rule__WebService__Group_4__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:925:1: ( rule__WebService__Group_4__0 )*
            {
             before(grammarAccess.getWebServiceAccess().getGroup_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:926:1: ( rule__WebService__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:926:2: rule__WebService__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__WebService__Group_4__0_in_rule__WebService__Group__4__Impl1926);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:936:1: rule__WebService__Group__5 : rule__WebService__Group__5__Impl ;
    public final void rule__WebService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:940:1: ( rule__WebService__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:941:2: rule__WebService__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__WebService__Group__5__Impl_in_rule__WebService__Group__51957);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:947:1: rule__WebService__Group__5__Impl : ( '}' ) ;
    public final void rule__WebService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:951:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:952:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:952:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:953:1: '}'
            {
             before(grammarAccess.getWebServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__WebService__Group__5__Impl1985); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:978:1: rule__WebService__Group_4__0 : rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1 ;
    public final void rule__WebService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:982:1: ( rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:983:2: rule__WebService__Group_4__0__Impl rule__WebService__Group_4__1
            {
            pushFollow(FOLLOW_rule__WebService__Group_4__0__Impl_in_rule__WebService__Group_4__02028);
            rule__WebService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebService__Group_4__1_in_rule__WebService__Group_4__02031);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:990:1: rule__WebService__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__WebService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:994:1: ( ( 'operation' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:995:1: ( 'operation' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:995:1: ( 'operation' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:996:1: 'operation'
            {
             before(grammarAccess.getWebServiceAccess().getOperationKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__WebService__Group_4__0__Impl2059); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1009:1: rule__WebService__Group_4__1 : rule__WebService__Group_4__1__Impl ;
    public final void rule__WebService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1013:1: ( rule__WebService__Group_4__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1014:2: rule__WebService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__WebService__Group_4__1__Impl_in_rule__WebService__Group_4__12090);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1020:1: rule__WebService__Group_4__1__Impl : ( ( rule__WebService__OperationsAssignment_4_1 ) ) ;
    public final void rule__WebService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1024:1: ( ( ( rule__WebService__OperationsAssignment_4_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1025:1: ( ( rule__WebService__OperationsAssignment_4_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1025:1: ( ( rule__WebService__OperationsAssignment_4_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1026:1: ( rule__WebService__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getWebServiceAccess().getOperationsAssignment_4_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1027:1: ( rule__WebService__OperationsAssignment_4_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1027:2: rule__WebService__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__WebService__OperationsAssignment_4_1_in_rule__WebService__Group_4__1__Impl2117);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1041:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1045:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1046:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02151);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02154);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1053:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1057:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1058:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1058:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1059:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1060:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1062:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1072:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1076:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1077:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12212);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12215);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1084:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1088:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1089:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1089:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1090:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1091:1: ( rule__Operation__NameAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1091:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2242);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1101:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1105:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1106:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22272);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22275);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1113:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1117:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1118:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1118:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1119:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__2__Impl2303); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1132:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1136:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1137:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32334);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32337);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1144:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1148:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1149:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1149:1: ( ( rule__Operation__Group_3__0 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1150:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1151:1: ( rule__Operation__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1151:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2364);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1161:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1165:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1166:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42395);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42398);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1173:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1177:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1178:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1178:1: ( ( rule__Operation__Group_4__0 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1179:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1180:1: ( rule__Operation__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1180:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2425);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1190:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1194:1: ( rule__Operation__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1195:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52456);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1201:1: rule__Operation__Group__5__Impl : ( '}' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1205:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1206:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1206:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1207:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group__5__Impl2484); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1232:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1236:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1237:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02527);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02530);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1244:1: rule__Operation__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1248:1: ( ( 'input' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1249:1: ( 'input' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1249:1: ( 'input' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1250:1: 'input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group_3__0__Impl2558); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1263:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1267:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1268:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12589);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12592);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1275:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__InputNameAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1279:1: ( ( ( rule__Operation__InputNameAssignment_3_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1280:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1280:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1281:1: ( rule__Operation__InputNameAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getInputNameAssignment_3_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1282:1: ( rule__Operation__InputNameAssignment_3_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1282:2: rule__Operation__InputNameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2619);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1292:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1296:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1297:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22649);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22652);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1304:1: rule__Operation__Group_3__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1308:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1309:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1309:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1310:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_2()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group_3__2__Impl2680); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1323:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1327:1: ( rule__Operation__Group_3__3__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1328:2: rule__Operation__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32711);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1334:1: rule__Operation__Group_3__3__Impl : ( ( rule__Operation__InputTypeAssignment_3_3 ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1338:1: ( ( ( rule__Operation__InputTypeAssignment_3_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1339:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1339:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1340:1: ( rule__Operation__InputTypeAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getInputTypeAssignment_3_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1341:1: ( rule__Operation__InputTypeAssignment_3_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1341:2: rule__Operation__InputTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2738);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1359:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1363:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1364:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02776);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02779);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1371:1: rule__Operation__Group_4__0__Impl : ( 'output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1375:1: ( ( 'output' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1376:1: ( 'output' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1376:1: ( 'output' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1377:1: 'output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Operation__Group_4__0__Impl2807); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1390:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1394:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1395:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12838);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12841);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1402:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__OutputNameAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1406:1: ( ( ( rule__Operation__OutputNameAssignment_4_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1407:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1407:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1408:1: ( rule__Operation__OutputNameAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getOutputNameAssignment_4_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1409:1: ( rule__Operation__OutputNameAssignment_4_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1409:2: rule__Operation__OutputNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2868);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1419:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1423:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1424:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22898);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22901);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1431:1: rule__Operation__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1435:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1436:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1436:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1437:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_2()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group_4__2__Impl2929); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1450:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1454:1: ( rule__Operation__Group_4__3__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1455:2: rule__Operation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32960);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1461:1: rule__Operation__Group_4__3__Impl : ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1465:1: ( ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1466:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1466:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1467:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeAssignment_4_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1468:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1468:2: rule__Operation__OutputTypeAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2987);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1486:1: rule__RESTService__Group__0 : rule__RESTService__Group__0__Impl rule__RESTService__Group__1 ;
    public final void rule__RESTService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1490:1: ( rule__RESTService__Group__0__Impl rule__RESTService__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1491:2: rule__RESTService__Group__0__Impl rule__RESTService__Group__1
            {
            pushFollow(FOLLOW_rule__RESTService__Group__0__Impl_in_rule__RESTService__Group__03025);
            rule__RESTService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__1_in_rule__RESTService__Group__03028);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1498:1: rule__RESTService__Group__0__Impl : ( () ) ;
    public final void rule__RESTService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1502:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1503:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1503:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1504:1: ()
            {
             before(grammarAccess.getRESTServiceAccess().getRESTServiceAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1505:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1507:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1517:1: rule__RESTService__Group__1 : rule__RESTService__Group__1__Impl rule__RESTService__Group__2 ;
    public final void rule__RESTService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1521:1: ( rule__RESTService__Group__1__Impl rule__RESTService__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1522:2: rule__RESTService__Group__1__Impl rule__RESTService__Group__2
            {
            pushFollow(FOLLOW_rule__RESTService__Group__1__Impl_in_rule__RESTService__Group__13086);
            rule__RESTService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__2_in_rule__RESTService__Group__13089);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1529:1: rule__RESTService__Group__1__Impl : ( 'REST service' ) ;
    public final void rule__RESTService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1533:1: ( ( 'REST service' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1534:1: ( 'REST service' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1534:1: ( 'REST service' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1535:1: 'REST service'
            {
             before(grammarAccess.getRESTServiceAccess().getRESTServiceKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__RESTService__Group__1__Impl3117); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1548:1: rule__RESTService__Group__2 : rule__RESTService__Group__2__Impl rule__RESTService__Group__3 ;
    public final void rule__RESTService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1552:1: ( rule__RESTService__Group__2__Impl rule__RESTService__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1553:2: rule__RESTService__Group__2__Impl rule__RESTService__Group__3
            {
            pushFollow(FOLLOW_rule__RESTService__Group__2__Impl_in_rule__RESTService__Group__23148);
            rule__RESTService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__3_in_rule__RESTService__Group__23151);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1560:1: rule__RESTService__Group__2__Impl : ( ( rule__RESTService__NameAssignment_2 ) ) ;
    public final void rule__RESTService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1564:1: ( ( ( rule__RESTService__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1565:1: ( ( rule__RESTService__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1565:1: ( ( rule__RESTService__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1566:1: ( rule__RESTService__NameAssignment_2 )
            {
             before(grammarAccess.getRESTServiceAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1567:1: ( rule__RESTService__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1567:2: rule__RESTService__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RESTService__NameAssignment_2_in_rule__RESTService__Group__2__Impl3178);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1577:1: rule__RESTService__Group__3 : rule__RESTService__Group__3__Impl rule__RESTService__Group__4 ;
    public final void rule__RESTService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1581:1: ( rule__RESTService__Group__3__Impl rule__RESTService__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1582:2: rule__RESTService__Group__3__Impl rule__RESTService__Group__4
            {
            pushFollow(FOLLOW_rule__RESTService__Group__3__Impl_in_rule__RESTService__Group__33208);
            rule__RESTService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RESTService__Group__4_in_rule__RESTService__Group__33211);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1589:1: rule__RESTService__Group__3__Impl : ( '{' ) ;
    public final void rule__RESTService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1593:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1594:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1594:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1595:1: '{'
            {
             before(grammarAccess.getRESTServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__RESTService__Group__3__Impl3239); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1608:1: rule__RESTService__Group__4 : rule__RESTService__Group__4__Impl ;
    public final void rule__RESTService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1612:1: ( rule__RESTService__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1613:2: rule__RESTService__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RESTService__Group__4__Impl_in_rule__RESTService__Group__43270);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1619:1: rule__RESTService__Group__4__Impl : ( '}' ) ;
    public final void rule__RESTService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1623:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1624:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1624:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1625:1: '}'
            {
             before(grammarAccess.getRESTServiceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__RESTService__Group__4__Impl3298); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1648:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1652:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1653:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__03339);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03342);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1660:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1664:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1665:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1665:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1666:1: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1667:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1669:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1679:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1683:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1684:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__13400);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13403);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1691:1: rule__Node__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1695:1: ( ( 'Node' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1696:1: ( 'Node' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1696:1: ( 'Node' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1697:1: 'Node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group__1__Impl3431); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1710:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1714:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1715:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__23462);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23465);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1722:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1726:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1727:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1727:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1728:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1729:1: ( rule__Node__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1729:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3492);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1739:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1743:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1744:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33522);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33525);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1751:1: rule__Node__Group__3__Impl : ( 'uri' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1755:1: ( ( 'uri' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1756:1: ( 'uri' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1756:1: ( 'uri' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1757:1: 'uri'
            {
             before(grammarAccess.getNodeAccess().getUriKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group__3__Impl3553); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1770:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1774:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1775:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43584);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43587);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1782:1: rule__Node__Group__4__Impl : ( '=' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1786:1: ( ( '=' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1787:1: ( '=' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1787:1: ( '=' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1788:1: '='
            {
             before(grammarAccess.getNodeAccess().getEqualsSignKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group__4__Impl3615); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1801:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1805:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1806:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53646);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53649);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1813:1: rule__Node__Group__5__Impl : ( ( rule__Node__BaseURIAssignment_5 ) ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1817:1: ( ( ( rule__Node__BaseURIAssignment_5 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1818:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1818:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1819:1: ( rule__Node__BaseURIAssignment_5 )
            {
             before(grammarAccess.getNodeAccess().getBaseURIAssignment_5()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1820:1: ( rule__Node__BaseURIAssignment_5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1820:2: rule__Node__BaseURIAssignment_5
            {
            pushFollow(FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3676);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1830:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1834:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1835:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63706);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63709);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1842:1: rule__Node__Group__6__Impl : ( 'hosts' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1846:1: ( ( 'hosts' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1847:1: ( 'hosts' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1847:1: ( 'hosts' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1848:1: 'hosts'
            {
             before(grammarAccess.getNodeAccess().getHostsKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__Node__Group__6__Impl3737); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1861:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1865:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1866:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73768);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73771);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1873:1: rule__Node__Group__7__Impl : ( '{' ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1877:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1878:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1878:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1879:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Node__Group__7__Impl3799); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1892:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1896:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1897:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83830);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83833);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1904:1: rule__Node__Group__8__Impl : ( ( rule__Node__ServicesAssignment_8 ) ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1908:1: ( ( ( rule__Node__ServicesAssignment_8 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1909:1: ( ( rule__Node__ServicesAssignment_8 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1909:1: ( ( rule__Node__ServicesAssignment_8 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1910:1: ( rule__Node__ServicesAssignment_8 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_8()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1911:1: ( rule__Node__ServicesAssignment_8 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1911:2: rule__Node__ServicesAssignment_8
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3860);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1921:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1925:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1926:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93890);
            rule__Node__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93893);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1933:1: rule__Node__Group__9__Impl : ( ( rule__Node__Group_9__0 )* ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1937:1: ( ( ( rule__Node__Group_9__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1938:1: ( ( rule__Node__Group_9__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1938:1: ( ( rule__Node__Group_9__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1939:1: ( rule__Node__Group_9__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_9()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1940:1: ( rule__Node__Group_9__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1940:2: rule__Node__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3920);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1950:1: rule__Node__Group__10 : rule__Node__Group__10__Impl ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1954:1: ( rule__Node__Group__10__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1955:2: rule__Node__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103951);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1961:1: rule__Node__Group__10__Impl : ( '}' ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1965:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1966:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1966:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:1967:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group__10__Impl3979); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2002:1: rule__Node__Group_9__0 : rule__Node__Group_9__0__Impl rule__Node__Group_9__1 ;
    public final void rule__Node__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2006:1: ( rule__Node__Group_9__0__Impl rule__Node__Group_9__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2007:2: rule__Node__Group_9__0__Impl rule__Node__Group_9__1
            {
            pushFollow(FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__04032);
            rule__Node__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__04035);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2014:1: rule__Node__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2018:1: ( ( ',' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2019:1: ( ',' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2019:1: ( ',' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2020:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_9_0()); 
            match(input,35,FOLLOW_35_in_rule__Node__Group_9__0__Impl4063); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2033:1: rule__Node__Group_9__1 : rule__Node__Group_9__1__Impl ;
    public final void rule__Node__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2037:1: ( rule__Node__Group_9__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2038:2: rule__Node__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__14094);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2044:1: rule__Node__Group_9__1__Impl : ( ( rule__Node__ServicesAssignment_9_1 ) ) ;
    public final void rule__Node__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2048:1: ( ( ( rule__Node__ServicesAssignment_9_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2049:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2049:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2050:1: ( rule__Node__ServicesAssignment_9_1 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_9_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2051:1: ( rule__Node__ServicesAssignment_9_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2051:2: rule__Node__ServicesAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl4121);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2065:1: rule__ComplexElement__Group__0 : rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 ;
    public final void rule__ComplexElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2069:1: ( rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2070:2: rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__04155);
            rule__ComplexElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__04158);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2077:1: rule__ComplexElement__Group__0__Impl : ( () ) ;
    public final void rule__ComplexElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2081:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2082:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2082:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2083:1: ()
            {
             before(grammarAccess.getComplexElementAccess().getComplexElementAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2084:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2086:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2096:1: rule__ComplexElement__Group__1 : rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 ;
    public final void rule__ComplexElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2100:1: ( rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2101:2: rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__14216);
            rule__ComplexElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__14219);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2108:1: rule__ComplexElement__Group__1__Impl : ( 'complex-data' ) ;
    public final void rule__ComplexElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2112:1: ( ( 'complex-data' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2113:1: ( 'complex-data' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2113:1: ( 'complex-data' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2114:1: 'complex-data'
            {
             before(grammarAccess.getComplexElementAccess().getComplexDataKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__ComplexElement__Group__1__Impl4247); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2127:1: rule__ComplexElement__Group__2 : rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 ;
    public final void rule__ComplexElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2131:1: ( rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2132:2: rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__24278);
            rule__ComplexElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__24281);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2139:1: rule__ComplexElement__Group__2__Impl : ( ( rule__ComplexElement__NameAssignment_2 ) ) ;
    public final void rule__ComplexElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2143:1: ( ( ( rule__ComplexElement__NameAssignment_2 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2144:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2144:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2145:1: ( rule__ComplexElement__NameAssignment_2 )
            {
             before(grammarAccess.getComplexElementAccess().getNameAssignment_2()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2146:1: ( rule__ComplexElement__NameAssignment_2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2146:2: rule__ComplexElement__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl4308);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2156:1: rule__ComplexElement__Group__3 : rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 ;
    public final void rule__ComplexElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2160:1: ( rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2161:2: rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__34338);
            rule__ComplexElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__34341);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2168:1: rule__ComplexElement__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2172:1: ( ( '{' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2173:1: ( '{' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2173:1: ( '{' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2174:1: '{'
            {
             before(grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ComplexElement__Group__3__Impl4369); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2187:1: rule__ComplexElement__Group__4 : rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 ;
    public final void rule__ComplexElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2191:1: ( rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2192:2: rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__44400);
            rule__ComplexElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__44403);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2199:1: rule__ComplexElement__Group__4__Impl : ( ( rule__ComplexElement__ElementsAssignment_4 )* ) ;
    public final void rule__ComplexElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2203:1: ( ( ( rule__ComplexElement__ElementsAssignment_4 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2204:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2204:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2205:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComplexElementAccess().getElementsAssignment_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2206:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2206:2: rule__ComplexElement__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl4430);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2216:1: rule__ComplexElement__Group__5 : rule__ComplexElement__Group__5__Impl ;
    public final void rule__ComplexElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2220:1: ( rule__ComplexElement__Group__5__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2221:2: rule__ComplexElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__54461);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2227:1: rule__ComplexElement__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2231:1: ( ( '}' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2232:1: ( '}' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2232:1: ( '}' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2233:1: '}'
            {
             before(grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__ComplexElement__Group__5__Impl4489); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2258:1: rule__SimpleElement__Group__0 : rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 ;
    public final void rule__SimpleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2262:1: ( rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2263:2: rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04532);
            rule__SimpleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04535);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2270:1: rule__SimpleElement__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2274:1: ( ( () ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2275:1: ( () )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2275:1: ( () )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2276:1: ()
            {
             before(grammarAccess.getSimpleElementAccess().getSimpleElementAction_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2277:1: ()
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2279:1: 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2289:1: rule__SimpleElement__Group__1 : rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 ;
    public final void rule__SimpleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2293:1: ( rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2294:2: rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14593);
            rule__SimpleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14596);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2301:1: rule__SimpleElement__Group__1__Impl : ( ( rule__SimpleElement__NameAssignment_1 ) ) ;
    public final void rule__SimpleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2305:1: ( ( ( rule__SimpleElement__NameAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2306:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2306:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2307:1: ( rule__SimpleElement__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleElementAccess().getNameAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2308:1: ( rule__SimpleElement__NameAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2308:2: rule__SimpleElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4623);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2318:1: rule__SimpleElement__Group__2 : rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 ;
    public final void rule__SimpleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2322:1: ( rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2323:2: rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24653);
            rule__SimpleElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24656);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2330:1: rule__SimpleElement__Group__2__Impl : ( ':' ) ;
    public final void rule__SimpleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2334:1: ( ( ':' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2335:1: ( ':' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2335:1: ( ':' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2336:1: ':'
            {
             before(grammarAccess.getSimpleElementAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__SimpleElement__Group__2__Impl4684); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2349:1: rule__SimpleElement__Group__3 : rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 ;
    public final void rule__SimpleElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2353:1: ( rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2354:2: rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34715);
            rule__SimpleElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34718);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2361:1: rule__SimpleElement__Group__3__Impl : ( ( rule__SimpleElement__Alternatives_3 ) ) ;
    public final void rule__SimpleElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2365:1: ( ( ( rule__SimpleElement__Alternatives_3 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2366:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2366:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2367:1: ( rule__SimpleElement__Alternatives_3 )
            {
             before(grammarAccess.getSimpleElementAccess().getAlternatives_3()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2368:1: ( rule__SimpleElement__Alternatives_3 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2368:2: rule__SimpleElement__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4745);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2378:1: rule__SimpleElement__Group__4 : rule__SimpleElement__Group__4__Impl ;
    public final void rule__SimpleElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2382:1: ( rule__SimpleElement__Group__4__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2383:2: rule__SimpleElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44775);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2389:1: rule__SimpleElement__Group__4__Impl : ( ( rule__SimpleElement__MultiplicityAssignment_4 )? ) ;
    public final void rule__SimpleElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2393:1: ( ( ( rule__SimpleElement__MultiplicityAssignment_4 )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2394:1: ( ( rule__SimpleElement__MultiplicityAssignment_4 )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2394:1: ( ( rule__SimpleElement__MultiplicityAssignment_4 )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2395:1: ( rule__SimpleElement__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2396:1: ( rule__SimpleElement__MultiplicityAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2396:2: rule__SimpleElement__MultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_in_rule__SimpleElement__Group__4__Impl4802);
                    rule__SimpleElement__MultiplicityAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4()); 

            }


            }

        }
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2416:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2420:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2421:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04843);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04846);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2428:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2432:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2433:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2433:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2434:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4873); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2445:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2449:1: ( rule__FQN__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2450:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14902);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2456:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2460:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2461:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2461:1: ( ( rule__FQN__Group_1__0 )* )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2462:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2463:1: ( rule__FQN__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2463:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4929);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2477:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2481:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2482:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04964);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04967);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2489:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2493:1: ( ( '.' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2494:1: ( '.' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2494:1: ( '.' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2495:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__FQN__Group_1__0__Impl4995); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2508:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2512:1: ( rule__FQN__Group_1__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2513:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15026);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2519:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2523:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2524:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2524:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2525:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5053); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2540:1: rule__FqnWildcard__Group__0 : rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 ;
    public final void rule__FqnWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2544:1: ( rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2545:2: rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__05086);
            rule__FqnWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__05089);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2552:1: rule__FqnWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2556:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2557:1: ( ruleFQN )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2557:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2558:1: ruleFQN
            {
             before(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl5116);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2569:1: rule__FqnWildcard__Group__1 : rule__FqnWildcard__Group__1__Impl ;
    public final void rule__FqnWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2573:1: ( rule__FqnWildcard__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2574:2: rule__FqnWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__15145);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2580:1: rule__FqnWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2584:1: ( ( ( '.*' )? ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2585:1: ( ( '.*' )? )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2585:1: ( ( '.*' )? )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2586:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2587:1: ( '.*' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2588:2: '.*'
                    {
                    match(input,38,FOLLOW_38_in_rule__FqnWildcard__Group__1__Impl5174); 

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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2603:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2607:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2608:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05211);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05214);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2615:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2619:1: ( ( 'import' ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2620:1: ( 'import' )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2620:1: ( 'import' )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2621:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Import__Group__0__Impl5242); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2634:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2638:1: ( rule__Import__Group__1__Impl )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2639:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15273);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2645:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2649:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2650:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2650:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2651:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2652:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2652:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5300);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2667:1: rule__ServiceDSL__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__ServiceDSL__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2671:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2672:1: ( ruleFQN )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2672:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2673:1: ruleFQN
            {
             before(grammarAccess.getServiceDSLAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ServiceDSL__NameAssignment_25339);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2682:1: rule__ServiceDSL__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__ServiceDSL__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2686:1: ( ( ruleImport ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2687:1: ( ruleImport )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2687:1: ( ruleImport )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2688:1: ruleImport
            {
             before(grammarAccess.getServiceDSLAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__ServiceDSL__ImportsAssignment_35370);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2697:1: rule__ServiceDSL__ServicesAssignment_4_0 : ( ruleService ) ;
    public final void rule__ServiceDSL__ServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2701:1: ( ( ruleService ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2702:1: ( ruleService )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2702:1: ( ruleService )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2703:1: ruleService
            {
             before(grammarAccess.getServiceDSLAccess().getServicesServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__ServiceDSL__ServicesAssignment_4_05401);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2712:1: rule__ServiceDSL__DataAssignment_4_1 : ( ruleDataElement ) ;
    public final void rule__ServiceDSL__DataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2716:1: ( ( ruleDataElement ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2717:1: ( ruleDataElement )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2717:1: ( ruleDataElement )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2718:1: ruleDataElement
            {
             before(grammarAccess.getServiceDSLAccess().getDataDataElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDataElement_in_rule__ServiceDSL__DataAssignment_4_15432);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2727:1: rule__ServiceDSL__NodesAssignment_4_2 : ( ruleNode ) ;
    public final void rule__ServiceDSL__NodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2731:1: ( ( ruleNode ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2732:1: ( ruleNode )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2732:1: ( ruleNode )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2733:1: ruleNode
            {
             before(grammarAccess.getServiceDSLAccess().getNodesNodeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ServiceDSL__NodesAssignment_4_25463);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2742:1: rule__WebService__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__WebService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2746:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2747:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2747:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2748:1: RULE_ID
            {
             before(grammarAccess.getWebServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__WebService__NameAssignment_25494); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2757:1: rule__WebService__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__WebService__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2761:1: ( ( ruleOperation ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2762:1: ( ruleOperation )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2762:1: ( ruleOperation )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2763:1: ruleOperation
            {
             before(grammarAccess.getWebServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__WebService__OperationsAssignment_4_15525);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2772:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2776:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2777:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2777:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2778:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15556); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2787:1: rule__Operation__InputNameAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Operation__InputNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2791:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2792:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2792:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2793:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15587); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2802:1: rule__Operation__InputTypeAssignment_3_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__InputTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2806:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2807:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2807:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2808:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2809:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2810:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementFQNParserRuleCall_3_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35622);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2821:1: rule__Operation__OutputNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Operation__OutputNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2825:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2826:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2826:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2827:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15657); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2836:1: rule__Operation__OutputTypeAssignment_4_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__OutputTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2840:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2841:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2841:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2842:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2843:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2844:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementFQNParserRuleCall_4_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35692);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2855:1: rule__RESTService__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RESTService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2859:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2860:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2860:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2861:1: RULE_ID
            {
             before(grammarAccess.getRESTServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RESTService__NameAssignment_25727); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2870:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2874:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2875:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2875:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2876:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25758); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2885:1: rule__Node__BaseURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Node__BaseURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2889:1: ( ( RULE_STRING ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2890:1: ( RULE_STRING )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2890:1: ( RULE_STRING )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2891:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55789); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2900:1: rule__Node__ServicesAssignment_8 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2904:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2905:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2905:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2906:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2907:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2908:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85824);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2919:1: rule__Node__ServicesAssignment_9_1 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2923:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2924:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2924:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2925:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2926:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2927:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15863);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2938:1: rule__ComplexElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2942:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2943:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2943:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2944:1: RULE_ID
            {
             before(grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25898); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2953:1: rule__ComplexElement__ElementsAssignment_4 : ( ruleSimpleElement ) ;
    public final void rule__ComplexElement__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2957:1: ( ( ruleSimpleElement ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2958:1: ( ruleSimpleElement )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2958:1: ( ruleSimpleElement )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2959:1: ruleSimpleElement
            {
             before(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45929);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2968:1: rule__SimpleElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2972:1: ( ( RULE_ID ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2973:1: ( RULE_ID )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2973:1: ( RULE_ID )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2974:1: RULE_ID
            {
             before(grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15960); 
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2983:1: rule__SimpleElement__TypeAssignment_3_0 : ( ruleDATATYPE ) ;
    public final void rule__SimpleElement__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2987:1: ( ( ruleDATATYPE ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2988:1: ( ruleDATATYPE )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2988:1: ( ruleDATATYPE )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2989:1: ruleDATATYPE
            {
             before(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05991);
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
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:2998:1: rule__SimpleElement__RefAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SimpleElement__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3002:1: ( ( ( ruleFQN ) ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3003:1: ( ( ruleFQN ) )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3003:1: ( ( ruleFQN ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3004:1: ( ruleFQN )
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3005:1: ( ruleFQN )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3006:1: ruleFQN
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_16026);
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


    // $ANTLR start "rule__SimpleElement__MultiplicityAssignment_4"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3017:1: rule__SimpleElement__MultiplicityAssignment_4 : ( ruleMULTIPLICITY ) ;
    public final void rule__SimpleElement__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3021:1: ( ( ruleMULTIPLICITY ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3022:1: ( ruleMULTIPLICITY )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3022:1: ( ruleMULTIPLICITY )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3023:1: ruleMULTIPLICITY
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityMULTIPLICITYEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMULTIPLICITY_in_rule__SimpleElement__MultiplicityAssignment_46061);
            ruleMULTIPLICITY();

            state._fsp--;

             after(grammarAccess.getSimpleElementAccess().getMultiplicityMULTIPLICITYEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement__MultiplicityAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3032:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3036:1: ( ( ruleFqnWildcard ) )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3037:1: ( ruleFqnWildcard )
            {
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3037:1: ( ruleFqnWildcard )
            // ../service.dsl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalServiceDsl.g:3038:1: ruleFqnWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_16092);
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
    public static final BitSet FOLLOW_rule__MULTIPLICITY__Alternatives_in_ruleMULTIPLICITY827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__ServicesAssignment_4_0_in_rule__ServiceDSL__Alternatives_4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__DataAssignment_4_1_in_rule__ServiceDSL__Alternatives_4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__NodesAssignment_4_2_in_rule__ServiceDSL__Alternatives_4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebService_in_rule__Service__Alternatives931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRESTService_in_rule__Service__Alternatives948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_31029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_31047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DATATYPE__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DATATYPE__Alternatives1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DATATYPE__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DATATYPE__Alternatives1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DATATYPE__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DATATYPE__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DATATYPE__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DATATYPE__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MULTIPLICITY__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MULTIPLICITY__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MULTIPLICITY__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__0__Impl_in_rule__ServiceDSL__Group__01339 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__1_in_rule__ServiceDSL__Group__01342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__1__Impl_in_rule__ServiceDSL__Group__11400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__2_in_rule__ServiceDSL__Group__11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ServiceDSL__Group__1__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__2__Impl_in_rule__ServiceDSL__Group__21462 = new BitSet(new long[]{0x00000090C0800010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__3_in_rule__ServiceDSL__Group__21465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__NameAssignment_2_in_rule__ServiceDSL__Group__2__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__3__Impl_in_rule__ServiceDSL__Group__31522 = new BitSet(new long[]{0x00000090C0800010L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__4_in_rule__ServiceDSL__Group__31525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__ImportsAssignment_3_in_rule__ServiceDSL__Group__3__Impl1552 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Group__4__Impl_in_rule__ServiceDSL__Group__41583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceDSL__Alternatives_4_in_rule__ServiceDSL__Group__4__Impl1610 = new BitSet(new long[]{0x00000010C0800012L});
    public static final BitSet FOLLOW_rule__WebService__Group__0__Impl_in_rule__WebService__Group__01651 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__WebService__Group__1_in_rule__WebService__Group__01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__1__Impl_in_rule__WebService__Group__11712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WebService__Group__2_in_rule__WebService__Group__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__WebService__Group__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__2__Impl_in_rule__WebService__Group__21774 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__WebService__Group__3_in_rule__WebService__Group__21777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__NameAssignment_2_in_rule__WebService__Group__2__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__3__Impl_in_rule__WebService__Group__31834 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__WebService__Group__4_in_rule__WebService__Group__31837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__WebService__Group__3__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__4__Impl_in_rule__WebService__Group__41896 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__WebService__Group__5_in_rule__WebService__Group__41899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__0_in_rule__WebService__Group__4__Impl1926 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__WebService__Group__5__Impl_in_rule__WebService__Group__51957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__WebService__Group__5__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__0__Impl_in_rule__WebService__Group_4__02028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__1_in_rule__WebService__Group_4__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__WebService__Group_4__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__Group_4__1__Impl_in_rule__WebService__Group_4__12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebService__OperationsAssignment_4_1_in_rule__WebService__Group_4__1__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__02151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__02154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12212 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22272 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__2__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32334 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42395 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group__5__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group_3__0__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12589 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group_3__2__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operation__Group_4__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12838 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group_4__2__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__0__Impl_in_rule__RESTService__Group__03025 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__1_in_rule__RESTService__Group__03028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__1__Impl_in_rule__RESTService__Group__13086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RESTService__Group__2_in_rule__RESTService__Group__13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RESTService__Group__1__Impl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__2__Impl_in_rule__RESTService__Group__23148 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__3_in_rule__RESTService__Group__23151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__NameAssignment_2_in_rule__RESTService__Group__2__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__3__Impl_in_rule__RESTService__Group__33208 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__RESTService__Group__4_in_rule__RESTService__Group__33211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RESTService__Group__3__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RESTService__Group__4__Impl_in_rule__RESTService__Group__43270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RESTService__Group__4__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__03339 = new BitSet(new long[]{0x00000010C0800010L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__13400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__13403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group__1__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__23462 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__23465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33522 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group__3__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group__4__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53646 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63706 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Node__Group__6__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Node__Group__7__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83830 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93890 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3920 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group__10__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__04032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__04035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Node__Group_9__0__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__04155 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__04158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__14216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__14219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ComplexElement__Group__1__Impl4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__24278 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__24281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__34338 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__34341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComplexElement__Group__3__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__44400 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__44403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl4430 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__54461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ComplexElement__Group__5__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14593 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24653 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SimpleElement__Group__2__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34715 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_in_rule__SimpleElement__Group__4__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04843 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4929 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FQN__Group_1__0__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__05086 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__05089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__15145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FqnWildcard__Group__1__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Import__Group__0__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ServiceDSL__NameAssignment_25339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__ServiceDSL__ImportsAssignment_35370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__ServiceDSL__ServicesAssignment_4_05401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_rule__ServiceDSL__DataAssignment_4_15432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ServiceDSL__NodesAssignment_4_25463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__WebService__NameAssignment_25494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__WebService__OperationsAssignment_4_15525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RESTService__NameAssignment_25727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_16026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICITY_in_rule__SimpleElement__MultiplicityAssignment_46061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_16092 = new BitSet(new long[]{0x0000000000000002L});

}