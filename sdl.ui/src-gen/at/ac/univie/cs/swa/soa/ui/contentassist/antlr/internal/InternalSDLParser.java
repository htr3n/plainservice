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
import at.ac.univie.cs.swa.soa.services.SDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'integer'", "'float'", "'date'", "'time'", "'dateTime'", "'binary'", "'boolean'", "'?'", "'+'", "'*'", "'module'", "'Service'", "'{'", "'}'", "'operation'", "'input'", "':'", "'output'", "'Node'", "'uri'", "'='", "'hosts'", "','", "'complex-data'", "'.'", "'.*'", "'import'"
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
    public String getGrammarFileName() { return "../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g"; }


     
     	private SDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SDLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSDL"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:60:1: entryRuleSDL : ruleSDL EOF ;
    public final void entryRuleSDL() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:61:1: ( ruleSDL EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:62:1: ruleSDL EOF
            {
             before(grammarAccess.getSDLRule()); 
            pushFollow(FOLLOW_ruleSDL_in_entryRuleSDL61);
            ruleSDL();

            state._fsp--;

             after(grammarAccess.getSDLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSDL68); 

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
    // $ANTLR end "entryRuleSDL"


    // $ANTLR start "ruleSDL"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:69:1: ruleSDL : ( ( rule__SDL__Group__0 ) ) ;
    public final void ruleSDL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:73:2: ( ( ( rule__SDL__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:74:1: ( ( rule__SDL__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:74:1: ( ( rule__SDL__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:75:1: ( rule__SDL__Group__0 )
            {
             before(grammarAccess.getSDLAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:76:1: ( rule__SDL__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:76:2: rule__SDL__Group__0
            {
            pushFollow(FOLLOW_rule__SDL__Group__0_in_ruleSDL94);
            rule__SDL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSDLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSDL"


    // $ANTLR start "entryRuleService"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:88:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:89:1: ( ruleService EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:90:1: ruleService EOF
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:97:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:101:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:102:1: ( ( rule__Service__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:102:1: ( ( rule__Service__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:103:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:104:1: ( rule__Service__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:104:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService154);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOperation"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:116:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:117:1: ( ruleOperation EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:118:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation181);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation188); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:125:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:129:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:130:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:130:1: ( ( rule__Operation__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:131:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:132:1: ( rule__Operation__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:132:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation214);
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


    // $ANTLR start "entryRuleNode"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:144:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:145:1: ( ruleNode EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:146:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode241);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode248); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:153:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:157:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:158:1: ( ( rule__Node__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:158:1: ( ( rule__Node__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:159:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:160:1: ( rule__Node__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:160:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode274);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:172:1: entryRuleDataElement : ruleDataElement EOF ;
    public final void entryRuleDataElement() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:173:1: ( ruleDataElement EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:174:1: ruleDataElement EOF
            {
             before(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement301);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getDataElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement308); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:181:1: ruleDataElement : ( ( rule__DataElement__Alternatives ) ) ;
    public final void ruleDataElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:185:2: ( ( ( rule__DataElement__Alternatives ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:186:1: ( ( rule__DataElement__Alternatives ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:186:1: ( ( rule__DataElement__Alternatives ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:187:1: ( rule__DataElement__Alternatives )
            {
             before(grammarAccess.getDataElementAccess().getAlternatives()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:188:1: ( rule__DataElement__Alternatives )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:188:2: rule__DataElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DataElement__Alternatives_in_ruleDataElement334);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:200:1: entryRuleComplexElement : ruleComplexElement EOF ;
    public final void entryRuleComplexElement() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:201:1: ( ruleComplexElement EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:202:1: ruleComplexElement EOF
            {
             before(grammarAccess.getComplexElementRule()); 
            pushFollow(FOLLOW_ruleComplexElement_in_entryRuleComplexElement361);
            ruleComplexElement();

            state._fsp--;

             after(grammarAccess.getComplexElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexElement368); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:209:1: ruleComplexElement : ( ( rule__ComplexElement__Group__0 ) ) ;
    public final void ruleComplexElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:213:2: ( ( ( rule__ComplexElement__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:214:1: ( ( rule__ComplexElement__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:214:1: ( ( rule__ComplexElement__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:215:1: ( rule__ComplexElement__Group__0 )
            {
             before(grammarAccess.getComplexElementAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:216:1: ( rule__ComplexElement__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:216:2: rule__ComplexElement__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__0_in_ruleComplexElement394);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:228:1: entryRuleSimpleElement : ruleSimpleElement EOF ;
    public final void entryRuleSimpleElement() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:229:1: ( ruleSimpleElement EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:230:1: ruleSimpleElement EOF
            {
             before(grammarAccess.getSimpleElementRule()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement421);
            ruleSimpleElement();

            state._fsp--;

             after(grammarAccess.getSimpleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleElement428); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:237:1: ruleSimpleElement : ( ( rule__SimpleElement__Group__0 ) ) ;
    public final void ruleSimpleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:241:2: ( ( ( rule__SimpleElement__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:242:1: ( ( rule__SimpleElement__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:242:1: ( ( rule__SimpleElement__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:243:1: ( rule__SimpleElement__Group__0 )
            {
             before(grammarAccess.getSimpleElementAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:244:1: ( rule__SimpleElement__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:244:2: rule__SimpleElement__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__0_in_ruleSimpleElement454);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:256:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:257:1: ( ruleFQN EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:258:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN481);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN488); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:265:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:269:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:270:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:270:1: ( ( rule__FQN__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:271:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:272:1: ( rule__FQN__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:272:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN514);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:284:1: entryRuleFqnWildcard : ruleFqnWildcard EOF ;
    public final void entryRuleFqnWildcard() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:285:1: ( ruleFqnWildcard EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:286:1: ruleFqnWildcard EOF
            {
             before(grammarAccess.getFqnWildcardRule()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard541);
            ruleFqnWildcard();

            state._fsp--;

             after(grammarAccess.getFqnWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWildcard548); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:293:1: ruleFqnWildcard : ( ( rule__FqnWildcard__Group__0 ) ) ;
    public final void ruleFqnWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:297:2: ( ( ( rule__FqnWildcard__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:298:1: ( ( rule__FqnWildcard__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:298:1: ( ( rule__FqnWildcard__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:299:1: ( rule__FqnWildcard__Group__0 )
            {
             before(grammarAccess.getFqnWildcardAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:300:1: ( rule__FqnWildcard__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:300:2: rule__FqnWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__0_in_ruleFqnWildcard574);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:312:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:313:1: ( ruleImport EOF )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:314:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport601);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport608); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:321:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:325:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:326:1: ( ( rule__Import__Group__0 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:326:1: ( ( rule__Import__Group__0 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:327:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:328:1: ( rule__Import__Group__0 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:328:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport634);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:341:1: ruleDATATYPE : ( ( rule__DATATYPE__Alternatives ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:345:1: ( ( ( rule__DATATYPE__Alternatives ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:346:1: ( ( rule__DATATYPE__Alternatives ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:346:1: ( ( rule__DATATYPE__Alternatives ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:347:1: ( rule__DATATYPE__Alternatives )
            {
             before(grammarAccess.getDATATYPEAccess().getAlternatives()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:348:1: ( rule__DATATYPE__Alternatives )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:348:2: rule__DATATYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__DATATYPE__Alternatives_in_ruleDATATYPE671);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:360:1: ruleMULTIPLICITY : ( ( rule__MULTIPLICITY__Alternatives ) ) ;
    public final void ruleMULTIPLICITY() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:364:1: ( ( ( rule__MULTIPLICITY__Alternatives ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:365:1: ( ( rule__MULTIPLICITY__Alternatives ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:365:1: ( ( rule__MULTIPLICITY__Alternatives ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:366:1: ( rule__MULTIPLICITY__Alternatives )
            {
             before(grammarAccess.getMULTIPLICITYAccess().getAlternatives()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:367:1: ( rule__MULTIPLICITY__Alternatives )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:367:2: rule__MULTIPLICITY__Alternatives
            {
            pushFollow(FOLLOW_rule__MULTIPLICITY__Alternatives_in_ruleMULTIPLICITY707);
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


    // $ANTLR start "rule__SDL__Alternatives_4"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:378:1: rule__SDL__Alternatives_4 : ( ( ( rule__SDL__ServicesAssignment_4_0 ) ) | ( ( rule__SDL__DataAssignment_4_1 ) ) | ( ( rule__SDL__NodesAssignment_4_2 ) ) );
    public final void rule__SDL__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:382:1: ( ( ( rule__SDL__ServicesAssignment_4_0 ) ) | ( ( rule__SDL__DataAssignment_4_1 ) ) | ( ( rule__SDL__NodesAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 23:
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
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:383:1: ( ( rule__SDL__ServicesAssignment_4_0 ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:383:1: ( ( rule__SDL__ServicesAssignment_4_0 ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:384:1: ( rule__SDL__ServicesAssignment_4_0 )
                    {
                     before(grammarAccess.getSDLAccess().getServicesAssignment_4_0()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:385:1: ( rule__SDL__ServicesAssignment_4_0 )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:385:2: rule__SDL__ServicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__SDL__ServicesAssignment_4_0_in_rule__SDL__Alternatives_4742);
                    rule__SDL__ServicesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDLAccess().getServicesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:389:6: ( ( rule__SDL__DataAssignment_4_1 ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:389:6: ( ( rule__SDL__DataAssignment_4_1 ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:390:1: ( rule__SDL__DataAssignment_4_1 )
                    {
                     before(grammarAccess.getSDLAccess().getDataAssignment_4_1()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:391:1: ( rule__SDL__DataAssignment_4_1 )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:391:2: rule__SDL__DataAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__SDL__DataAssignment_4_1_in_rule__SDL__Alternatives_4760);
                    rule__SDL__DataAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDLAccess().getDataAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:395:6: ( ( rule__SDL__NodesAssignment_4_2 ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:395:6: ( ( rule__SDL__NodesAssignment_4_2 ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:396:1: ( rule__SDL__NodesAssignment_4_2 )
                    {
                     before(grammarAccess.getSDLAccess().getNodesAssignment_4_2()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:397:1: ( rule__SDL__NodesAssignment_4_2 )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:397:2: rule__SDL__NodesAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__SDL__NodesAssignment_4_2_in_rule__SDL__Alternatives_4778);
                    rule__SDL__NodesAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSDLAccess().getNodesAssignment_4_2()); 

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
    // $ANTLR end "rule__SDL__Alternatives_4"


    // $ANTLR start "rule__DataElement__Alternatives"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:406:1: rule__DataElement__Alternatives : ( ( ruleSimpleElement ) | ( ruleComplexElement ) );
    public final void rule__DataElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:410:1: ( ( ruleSimpleElement ) | ( ruleComplexElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:411:1: ( ruleSimpleElement )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:411:1: ( ruleSimpleElement )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:412:1: ruleSimpleElement
                    {
                     before(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives811);
                    ruleSimpleElement();

                    state._fsp--;

                     after(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:417:6: ( ruleComplexElement )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:417:6: ( ruleComplexElement )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:418:1: ruleComplexElement
                    {
                     before(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives828);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:428:1: rule__SimpleElement__Alternatives_3 : ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) );
    public final void rule__SimpleElement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:432:1: ( ( ( rule__SimpleElement__TypeAssignment_3_0 ) ) | ( ( rule__SimpleElement__RefAssignment_3_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=18)) ) {
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
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:433:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:433:1: ( ( rule__SimpleElement__TypeAssignment_3_0 ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:434:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:435:1: ( rule__SimpleElement__TypeAssignment_3_0 )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:435:2: rule__SimpleElement__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_3860);
                    rule__SimpleElement__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:439:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:439:6: ( ( rule__SimpleElement__RefAssignment_3_1 ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:440:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    {
                     before(grammarAccess.getSimpleElementAccess().getRefAssignment_3_1()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:441:1: ( rule__SimpleElement__RefAssignment_3_1 )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:441:2: rule__SimpleElement__RefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_3878);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:450:1: rule__DATATYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'dateTime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) );
    public final void rule__DATATYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:454:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'float' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'dateTime' ) ) | ( ( 'binary' ) ) | ( ( 'boolean' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:455:1: ( ( 'string' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:455:1: ( ( 'string' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:456:1: ( 'string' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:457:1: ( 'string' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:457:3: 'string'
                    {
                    match(input,11,FOLLOW_11_in_rule__DATATYPE__Alternatives912); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:462:6: ( ( 'integer' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:462:6: ( ( 'integer' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:463:1: ( 'integer' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:464:1: ( 'integer' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:464:3: 'integer'
                    {
                    match(input,12,FOLLOW_12_in_rule__DATATYPE__Alternatives933); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:469:6: ( ( 'float' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:469:6: ( ( 'float' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:470:1: ( 'float' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:471:1: ( 'float' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:471:3: 'float'
                    {
                    match(input,13,FOLLOW_13_in_rule__DATATYPE__Alternatives954); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:476:6: ( ( 'date' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:476:6: ( ( 'date' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:477:1: ( 'date' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:478:1: ( 'date' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:478:3: 'date'
                    {
                    match(input,14,FOLLOW_14_in_rule__DATATYPE__Alternatives975); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:483:6: ( ( 'time' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:483:6: ( ( 'time' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:484:1: ( 'time' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:485:1: ( 'time' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:485:3: 'time'
                    {
                    match(input,15,FOLLOW_15_in_rule__DATATYPE__Alternatives996); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:490:6: ( ( 'dateTime' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:490:6: ( ( 'dateTime' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:491:1: ( 'dateTime' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:492:1: ( 'dateTime' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:492:3: 'dateTime'
                    {
                    match(input,16,FOLLOW_16_in_rule__DATATYPE__Alternatives1017); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:497:6: ( ( 'binary' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:497:6: ( ( 'binary' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:498:1: ( 'binary' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:499:1: ( 'binary' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:499:3: 'binary'
                    {
                    match(input,17,FOLLOW_17_in_rule__DATATYPE__Alternatives1038); 

                    }

                     after(grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:504:6: ( ( 'boolean' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:504:6: ( ( 'boolean' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:505:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:506:1: ( 'boolean' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:506:3: 'boolean'
                    {
                    match(input,18,FOLLOW_18_in_rule__DATATYPE__Alternatives1059); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:516:1: rule__MULTIPLICITY__Alternatives : ( ( ( '?' ) ) | ( ( '+' ) ) | ( ( '*' ) ) );
    public final void rule__MULTIPLICITY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:520:1: ( ( ( '?' ) ) | ( ( '+' ) ) | ( ( '*' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
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
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:521:1: ( ( '?' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:521:1: ( ( '?' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:522:1: ( '?' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:523:1: ( '?' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:523:3: '?'
                    {
                    match(input,19,FOLLOW_19_in_rule__MULTIPLICITY__Alternatives1095); 

                    }

                     after(grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:528:6: ( ( '+' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:528:6: ( ( '+' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:529:1: ( '+' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:530:1: ( '+' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:530:3: '+'
                    {
                    match(input,20,FOLLOW_20_in_rule__MULTIPLICITY__Alternatives1116); 

                    }

                     after(grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:535:6: ( ( '*' ) )
                    {
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:535:6: ( ( '*' ) )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:536:1: ( '*' )
                    {
                     before(grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2()); 
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:537:1: ( '*' )
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:537:3: '*'
                    {
                    match(input,21,FOLLOW_21_in_rule__MULTIPLICITY__Alternatives1137); 

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


    // $ANTLR start "rule__SDL__Group__0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:549:1: rule__SDL__Group__0 : rule__SDL__Group__0__Impl rule__SDL__Group__1 ;
    public final void rule__SDL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:553:1: ( rule__SDL__Group__0__Impl rule__SDL__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:554:2: rule__SDL__Group__0__Impl rule__SDL__Group__1
            {
            pushFollow(FOLLOW_rule__SDL__Group__0__Impl_in_rule__SDL__Group__01170);
            rule__SDL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDL__Group__1_in_rule__SDL__Group__01173);
            rule__SDL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__0"


    // $ANTLR start "rule__SDL__Group__0__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:561:1: rule__SDL__Group__0__Impl : ( () ) ;
    public final void rule__SDL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:565:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:566:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:566:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:567:1: ()
            {
             before(grammarAccess.getSDLAccess().getSDLAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:568:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:570:1: 
            {
            }

             after(grammarAccess.getSDLAccess().getSDLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__0__Impl"


    // $ANTLR start "rule__SDL__Group__1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:580:1: rule__SDL__Group__1 : rule__SDL__Group__1__Impl rule__SDL__Group__2 ;
    public final void rule__SDL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:584:1: ( rule__SDL__Group__1__Impl rule__SDL__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:585:2: rule__SDL__Group__1__Impl rule__SDL__Group__2
            {
            pushFollow(FOLLOW_rule__SDL__Group__1__Impl_in_rule__SDL__Group__11231);
            rule__SDL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDL__Group__2_in_rule__SDL__Group__11234);
            rule__SDL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__1"


    // $ANTLR start "rule__SDL__Group__1__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:592:1: rule__SDL__Group__1__Impl : ( 'module' ) ;
    public final void rule__SDL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:596:1: ( ( 'module' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:597:1: ( 'module' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:597:1: ( 'module' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:598:1: 'module'
            {
             before(grammarAccess.getSDLAccess().getModuleKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__SDL__Group__1__Impl1262); 
             after(grammarAccess.getSDLAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__1__Impl"


    // $ANTLR start "rule__SDL__Group__2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:611:1: rule__SDL__Group__2 : rule__SDL__Group__2__Impl rule__SDL__Group__3 ;
    public final void rule__SDL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:615:1: ( rule__SDL__Group__2__Impl rule__SDL__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:616:2: rule__SDL__Group__2__Impl rule__SDL__Group__3
            {
            pushFollow(FOLLOW_rule__SDL__Group__2__Impl_in_rule__SDL__Group__21293);
            rule__SDL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDL__Group__3_in_rule__SDL__Group__21296);
            rule__SDL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__2"


    // $ANTLR start "rule__SDL__Group__2__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:623:1: rule__SDL__Group__2__Impl : ( ( rule__SDL__NameAssignment_2 ) ) ;
    public final void rule__SDL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:627:1: ( ( ( rule__SDL__NameAssignment_2 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:628:1: ( ( rule__SDL__NameAssignment_2 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:628:1: ( ( rule__SDL__NameAssignment_2 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:629:1: ( rule__SDL__NameAssignment_2 )
            {
             before(grammarAccess.getSDLAccess().getNameAssignment_2()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:630:1: ( rule__SDL__NameAssignment_2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:630:2: rule__SDL__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__SDL__NameAssignment_2_in_rule__SDL__Group__2__Impl1323);
            rule__SDL__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSDLAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__2__Impl"


    // $ANTLR start "rule__SDL__Group__3"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:640:1: rule__SDL__Group__3 : rule__SDL__Group__3__Impl rule__SDL__Group__4 ;
    public final void rule__SDL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:644:1: ( rule__SDL__Group__3__Impl rule__SDL__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:645:2: rule__SDL__Group__3__Impl rule__SDL__Group__4
            {
            pushFollow(FOLLOW_rule__SDL__Group__3__Impl_in_rule__SDL__Group__31353);
            rule__SDL__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SDL__Group__4_in_rule__SDL__Group__31356);
            rule__SDL__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__3"


    // $ANTLR start "rule__SDL__Group__3__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:652:1: rule__SDL__Group__3__Impl : ( ( rule__SDL__ImportsAssignment_3 )* ) ;
    public final void rule__SDL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:656:1: ( ( ( rule__SDL__ImportsAssignment_3 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:657:1: ( ( rule__SDL__ImportsAssignment_3 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:657:1: ( ( rule__SDL__ImportsAssignment_3 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:658:1: ( rule__SDL__ImportsAssignment_3 )*
            {
             before(grammarAccess.getSDLAccess().getImportsAssignment_3()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:659:1: ( rule__SDL__ImportsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==38) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:659:2: rule__SDL__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SDL__ImportsAssignment_3_in_rule__SDL__Group__3__Impl1383);
            	    rule__SDL__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSDLAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__3__Impl"


    // $ANTLR start "rule__SDL__Group__4"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:669:1: rule__SDL__Group__4 : rule__SDL__Group__4__Impl ;
    public final void rule__SDL__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:673:1: ( rule__SDL__Group__4__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:674:2: rule__SDL__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SDL__Group__4__Impl_in_rule__SDL__Group__41414);
            rule__SDL__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__4"


    // $ANTLR start "rule__SDL__Group__4__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:680:1: rule__SDL__Group__4__Impl : ( ( rule__SDL__Alternatives_4 )* ) ;
    public final void rule__SDL__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:684:1: ( ( ( rule__SDL__Alternatives_4 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:685:1: ( ( rule__SDL__Alternatives_4 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:685:1: ( ( rule__SDL__Alternatives_4 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:686:1: ( rule__SDL__Alternatives_4 )*
            {
             before(grammarAccess.getSDLAccess().getAlternatives_4()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:687:1: ( rule__SDL__Alternatives_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==23||LA7_0==30||LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:687:2: rule__SDL__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__SDL__Alternatives_4_in_rule__SDL__Group__4__Impl1441);
            	    rule__SDL__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSDLAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:707:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:711:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:712:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01482);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01485);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:719:1: rule__Service__Group__0__Impl : ( () ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:723:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:724:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:724:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:725:1: ()
            {
             before(grammarAccess.getServiceAccess().getServiceAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:726:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:728:1: 
            {
            }

             after(grammarAccess.getServiceAccess().getServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:738:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:742:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:743:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11543);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11546);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:750:1: rule__Service__Group__1__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:754:1: ( ( 'Service' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:755:1: ( 'Service' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:755:1: ( 'Service' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:756:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Service__Group__1__Impl1574); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:769:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:773:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:774:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21605);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21608);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:781:1: rule__Service__Group__2__Impl : ( ( rule__Service__NameAssignment_2 ) ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:785:1: ( ( ( rule__Service__NameAssignment_2 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:786:1: ( ( rule__Service__NameAssignment_2 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:786:1: ( ( rule__Service__NameAssignment_2 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:787:1: ( rule__Service__NameAssignment_2 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_2()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:788:1: ( rule__Service__NameAssignment_2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:788:2: rule__Service__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_2_in_rule__Service__Group__2__Impl1635);
            rule__Service__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:798:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:802:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:803:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__31665);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__31668);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:810:1: rule__Service__Group__3__Impl : ( '{' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:814:1: ( ( '{' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:815:1: ( '{' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:815:1: ( '{' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:816:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__3__Impl1696); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:829:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:833:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:834:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__41727);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__41730);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:841:1: rule__Service__Group__4__Impl : ( ( rule__Service__Group_4__0 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:845:1: ( ( ( rule__Service__Group_4__0 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:846:1: ( ( rule__Service__Group_4__0 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:846:1: ( ( rule__Service__Group_4__0 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:847:1: ( rule__Service__Group_4__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_4()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:848:1: ( rule__Service__Group_4__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:848:2: rule__Service__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl1757);
            	    rule__Service__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:858:1: rule__Service__Group__5 : rule__Service__Group__5__Impl ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:862:1: ( rule__Service__Group__5__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:863:2: rule__Service__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__51788);
            rule__Service__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:869:1: rule__Service__Group__5__Impl : ( '}' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:873:1: ( ( '}' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:874:1: ( '}' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:874:1: ( '}' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:875:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Service__Group__5__Impl1816); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group_4__0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:900:1: rule__Service__Group_4__0 : rule__Service__Group_4__0__Impl rule__Service__Group_4__1 ;
    public final void rule__Service__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:904:1: ( rule__Service__Group_4__0__Impl rule__Service__Group_4__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:905:2: rule__Service__Group_4__0__Impl rule__Service__Group_4__1
            {
            pushFollow(FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__01859);
            rule__Service__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__01862);
            rule__Service__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0"


    // $ANTLR start "rule__Service__Group_4__0__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:912:1: rule__Service__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__Service__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:916:1: ( ( 'operation' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:917:1: ( 'operation' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:917:1: ( 'operation' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:918:1: 'operation'
            {
             before(grammarAccess.getServiceAccess().getOperationKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Service__Group_4__0__Impl1890); 
             after(grammarAccess.getServiceAccess().getOperationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__0__Impl"


    // $ANTLR start "rule__Service__Group_4__1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:931:1: rule__Service__Group_4__1 : rule__Service__Group_4__1__Impl ;
    public final void rule__Service__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:935:1: ( rule__Service__Group_4__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:936:2: rule__Service__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__11921);
            rule__Service__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1"


    // $ANTLR start "rule__Service__Group_4__1__Impl"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:942:1: rule__Service__Group_4__1__Impl : ( ( rule__Service__OperationsAssignment_4_1 ) ) ;
    public final void rule__Service__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:946:1: ( ( ( rule__Service__OperationsAssignment_4_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:947:1: ( ( rule__Service__OperationsAssignment_4_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:947:1: ( ( rule__Service__OperationsAssignment_4_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:948:1: ( rule__Service__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getServiceAccess().getOperationsAssignment_4_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:949:1: ( rule__Service__OperationsAssignment_4_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:949:2: rule__Service__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Service__OperationsAssignment_4_1_in_rule__Service__Group_4__1__Impl1948);
            rule__Service__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getOperationsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:963:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:967:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:968:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01982);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01985);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:975:1: rule__Operation__Group__0__Impl : ( () ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:979:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:980:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:980:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:981:1: ()
            {
             before(grammarAccess.getOperationAccess().getOperationAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:982:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:984:1: 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:994:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:998:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:999:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12043);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12046);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1006:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1010:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1011:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1011:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1012:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1013:1: ( rule__Operation__NameAssignment_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1013:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2073);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1023:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1027:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1028:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22103);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22106);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1035:1: rule__Operation__Group__2__Impl : ( '{' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1039:1: ( ( '{' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1040:1: ( '{' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1040:1: ( '{' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1041:1: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Operation__Group__2__Impl2134); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1054:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1058:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1059:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32165);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32168);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1066:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1070:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1071:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1071:1: ( ( rule__Operation__Group_3__0 )? )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1072:1: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1073:1: ( rule__Operation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1073:2: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2195);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1083:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1087:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1088:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42226);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42229);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1095:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1099:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1100:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1100:1: ( ( rule__Operation__Group_4__0 )? )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1101:1: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1102:1: ( rule__Operation__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1102:2: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2256);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1112:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1116:1: ( rule__Operation__Group__5__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1117:2: rule__Operation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52287);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1123:1: rule__Operation__Group__5__Impl : ( '}' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1127:1: ( ( '}' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1128:1: ( '}' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1128:1: ( '}' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1129:1: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Operation__Group__5__Impl2315); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1154:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1158:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1159:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02358);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02361);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1166:1: rule__Operation__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1170:1: ( ( 'input' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1171:1: ( 'input' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1171:1: ( 'input' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1172:1: 'input'
            {
             before(grammarAccess.getOperationAccess().getInputKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Operation__Group_3__0__Impl2389); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1185:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1189:1: ( rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1190:2: rule__Operation__Group_3__1__Impl rule__Operation__Group_3__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12420);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12423);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1197:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__InputNameAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1201:1: ( ( ( rule__Operation__InputNameAssignment_3_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1202:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1202:1: ( ( rule__Operation__InputNameAssignment_3_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1203:1: ( rule__Operation__InputNameAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getInputNameAssignment_3_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1204:1: ( rule__Operation__InputNameAssignment_3_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1204:2: rule__Operation__InputNameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2450);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1214:1: rule__Operation__Group_3__2 : rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 ;
    public final void rule__Operation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1218:1: ( rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1219:2: rule__Operation__Group_3__2__Impl rule__Operation__Group_3__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22480);
            rule__Operation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22483);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1226:1: rule__Operation__Group_3__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1230:1: ( ( ':' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1231:1: ( ':' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1231:1: ( ':' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1232:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_3_2()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group_3__2__Impl2511); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1245:1: rule__Operation__Group_3__3 : rule__Operation__Group_3__3__Impl ;
    public final void rule__Operation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1249:1: ( rule__Operation__Group_3__3__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1250:2: rule__Operation__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32542);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1256:1: rule__Operation__Group_3__3__Impl : ( ( rule__Operation__InputTypeAssignment_3_3 ) ) ;
    public final void rule__Operation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1260:1: ( ( ( rule__Operation__InputTypeAssignment_3_3 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1261:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1261:1: ( ( rule__Operation__InputTypeAssignment_3_3 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1262:1: ( rule__Operation__InputTypeAssignment_3_3 )
            {
             before(grammarAccess.getOperationAccess().getInputTypeAssignment_3_3()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1263:1: ( rule__Operation__InputTypeAssignment_3_3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1263:2: rule__Operation__InputTypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2569);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1281:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1285:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1286:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02607);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02610);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1293:1: rule__Operation__Group_4__0__Impl : ( 'output' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1297:1: ( ( 'output' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1298:1: ( 'output' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1298:1: ( 'output' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1299:1: 'output'
            {
             before(grammarAccess.getOperationAccess().getOutputKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Operation__Group_4__0__Impl2638); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1312:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1316:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1317:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12669);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12672);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1324:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__OutputNameAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1328:1: ( ( ( rule__Operation__OutputNameAssignment_4_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1329:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1329:1: ( ( rule__Operation__OutputNameAssignment_4_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1330:1: ( rule__Operation__OutputNameAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getOutputNameAssignment_4_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1331:1: ( rule__Operation__OutputNameAssignment_4_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1331:2: rule__Operation__OutputNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2699);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1341:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1345:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1346:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22729);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22732);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1353:1: rule__Operation__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1357:1: ( ( ':' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1358:1: ( ':' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1358:1: ( ':' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1359:1: ':'
            {
             before(grammarAccess.getOperationAccess().getColonKeyword_4_2()); 
            match(input,28,FOLLOW_28_in_rule__Operation__Group_4__2__Impl2760); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1372:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1376:1: ( rule__Operation__Group_4__3__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1377:2: rule__Operation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32791);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1383:1: rule__Operation__Group_4__3__Impl : ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1387:1: ( ( ( rule__Operation__OutputTypeAssignment_4_3 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1388:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1388:1: ( ( rule__Operation__OutputTypeAssignment_4_3 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1389:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeAssignment_4_3()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1390:1: ( rule__Operation__OutputTypeAssignment_4_3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1390:2: rule__Operation__OutputTypeAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2818);
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


    // $ANTLR start "rule__Node__Group__0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1408:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1412:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1413:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__02856);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__02859);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1420:1: rule__Node__Group__0__Impl : ( () ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1424:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1425:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1425:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1426:1: ()
            {
             before(grammarAccess.getNodeAccess().getNodeAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1427:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1429:1: 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1439:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1443:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1444:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__12917);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__12920);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1451:1: rule__Node__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1455:1: ( ( 'Node' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1456:1: ( 'Node' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1456:1: ( 'Node' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1457:1: 'Node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Node__Group__1__Impl2948); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1470:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1474:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1475:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__22979);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__3_in_rule__Node__Group__22982);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1482:1: rule__Node__Group__2__Impl : ( ( rule__Node__NameAssignment_2 ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1486:1: ( ( ( rule__Node__NameAssignment_2 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1487:1: ( ( rule__Node__NameAssignment_2 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1487:1: ( ( rule__Node__NameAssignment_2 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1488:1: ( rule__Node__NameAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_2()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1489:1: ( rule__Node__NameAssignment_2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1489:2: rule__Node__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3009);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1499:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1503:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1504:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33039);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33042);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1511:1: rule__Node__Group__3__Impl : ( 'uri' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1515:1: ( ( 'uri' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1516:1: ( 'uri' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1516:1: ( 'uri' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1517:1: 'uri'
            {
             before(grammarAccess.getNodeAccess().getUriKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Node__Group__3__Impl3070); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1530:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1534:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1535:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43101);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43104);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1542:1: rule__Node__Group__4__Impl : ( '=' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1546:1: ( ( '=' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1547:1: ( '=' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1547:1: ( '=' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1548:1: '='
            {
             before(grammarAccess.getNodeAccess().getEqualsSignKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Node__Group__4__Impl3132); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1561:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1565:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1566:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53163);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53166);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1573:1: rule__Node__Group__5__Impl : ( ( rule__Node__BaseURIAssignment_5 ) ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1577:1: ( ( ( rule__Node__BaseURIAssignment_5 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1578:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1578:1: ( ( rule__Node__BaseURIAssignment_5 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1579:1: ( rule__Node__BaseURIAssignment_5 )
            {
             before(grammarAccess.getNodeAccess().getBaseURIAssignment_5()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1580:1: ( rule__Node__BaseURIAssignment_5 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1580:2: rule__Node__BaseURIAssignment_5
            {
            pushFollow(FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3193);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1590:1: rule__Node__Group__6 : rule__Node__Group__6__Impl rule__Node__Group__7 ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1594:1: ( rule__Node__Group__6__Impl rule__Node__Group__7 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1595:2: rule__Node__Group__6__Impl rule__Node__Group__7
            {
            pushFollow(FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63223);
            rule__Node__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63226);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1602:1: rule__Node__Group__6__Impl : ( 'hosts' ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1606:1: ( ( 'hosts' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1607:1: ( 'hosts' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1607:1: ( 'hosts' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1608:1: 'hosts'
            {
             before(grammarAccess.getNodeAccess().getHostsKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Node__Group__6__Impl3254); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1621:1: rule__Node__Group__7 : rule__Node__Group__7__Impl rule__Node__Group__8 ;
    public final void rule__Node__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1625:1: ( rule__Node__Group__7__Impl rule__Node__Group__8 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1626:2: rule__Node__Group__7__Impl rule__Node__Group__8
            {
            pushFollow(FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73285);
            rule__Node__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73288);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1633:1: rule__Node__Group__7__Impl : ( '{' ) ;
    public final void rule__Node__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1637:1: ( ( '{' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1638:1: ( '{' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1638:1: ( '{' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1639:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Node__Group__7__Impl3316); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1652:1: rule__Node__Group__8 : rule__Node__Group__8__Impl rule__Node__Group__9 ;
    public final void rule__Node__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1656:1: ( rule__Node__Group__8__Impl rule__Node__Group__9 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1657:2: rule__Node__Group__8__Impl rule__Node__Group__9
            {
            pushFollow(FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83347);
            rule__Node__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83350);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1664:1: rule__Node__Group__8__Impl : ( ( rule__Node__ServicesAssignment_8 ) ) ;
    public final void rule__Node__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1668:1: ( ( ( rule__Node__ServicesAssignment_8 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1669:1: ( ( rule__Node__ServicesAssignment_8 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1669:1: ( ( rule__Node__ServicesAssignment_8 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1670:1: ( rule__Node__ServicesAssignment_8 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_8()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1671:1: ( rule__Node__ServicesAssignment_8 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1671:2: rule__Node__ServicesAssignment_8
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3377);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1681:1: rule__Node__Group__9 : rule__Node__Group__9__Impl rule__Node__Group__10 ;
    public final void rule__Node__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1685:1: ( rule__Node__Group__9__Impl rule__Node__Group__10 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1686:2: rule__Node__Group__9__Impl rule__Node__Group__10
            {
            pushFollow(FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93407);
            rule__Node__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93410);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1693:1: rule__Node__Group__9__Impl : ( ( rule__Node__Group_9__0 )* ) ;
    public final void rule__Node__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1697:1: ( ( ( rule__Node__Group_9__0 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1698:1: ( ( rule__Node__Group_9__0 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1698:1: ( ( rule__Node__Group_9__0 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1699:1: ( rule__Node__Group_9__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_9()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1700:1: ( rule__Node__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1700:2: rule__Node__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3437);
            	    rule__Node__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1710:1: rule__Node__Group__10 : rule__Node__Group__10__Impl ;
    public final void rule__Node__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1714:1: ( rule__Node__Group__10__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1715:2: rule__Node__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103468);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1721:1: rule__Node__Group__10__Impl : ( '}' ) ;
    public final void rule__Node__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1725:1: ( ( '}' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1726:1: ( '}' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1726:1: ( '}' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1727:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_25_in_rule__Node__Group__10__Impl3496); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1762:1: rule__Node__Group_9__0 : rule__Node__Group_9__0__Impl rule__Node__Group_9__1 ;
    public final void rule__Node__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1766:1: ( rule__Node__Group_9__0__Impl rule__Node__Group_9__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1767:2: rule__Node__Group_9__0__Impl rule__Node__Group_9__1
            {
            pushFollow(FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__03549);
            rule__Node__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__03552);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1774:1: rule__Node__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Node__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1778:1: ( ( ',' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1779:1: ( ',' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1779:1: ( ',' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1780:1: ','
            {
             before(grammarAccess.getNodeAccess().getCommaKeyword_9_0()); 
            match(input,34,FOLLOW_34_in_rule__Node__Group_9__0__Impl3580); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1793:1: rule__Node__Group_9__1 : rule__Node__Group_9__1__Impl ;
    public final void rule__Node__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1797:1: ( rule__Node__Group_9__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1798:2: rule__Node__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__13611);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1804:1: rule__Node__Group_9__1__Impl : ( ( rule__Node__ServicesAssignment_9_1 ) ) ;
    public final void rule__Node__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1808:1: ( ( ( rule__Node__ServicesAssignment_9_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1809:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1809:1: ( ( rule__Node__ServicesAssignment_9_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1810:1: ( rule__Node__ServicesAssignment_9_1 )
            {
             before(grammarAccess.getNodeAccess().getServicesAssignment_9_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1811:1: ( rule__Node__ServicesAssignment_9_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1811:2: rule__Node__ServicesAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl3638);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1825:1: rule__ComplexElement__Group__0 : rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 ;
    public final void rule__ComplexElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1829:1: ( rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1830:2: rule__ComplexElement__Group__0__Impl rule__ComplexElement__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__03672);
            rule__ComplexElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__03675);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1837:1: rule__ComplexElement__Group__0__Impl : ( () ) ;
    public final void rule__ComplexElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1841:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1842:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1842:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1843:1: ()
            {
             before(grammarAccess.getComplexElementAccess().getComplexElementAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1844:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1846:1: 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1856:1: rule__ComplexElement__Group__1 : rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 ;
    public final void rule__ComplexElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1860:1: ( rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1861:2: rule__ComplexElement__Group__1__Impl rule__ComplexElement__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__13733);
            rule__ComplexElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__13736);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1868:1: rule__ComplexElement__Group__1__Impl : ( 'complex-data' ) ;
    public final void rule__ComplexElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1872:1: ( ( 'complex-data' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1873:1: ( 'complex-data' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1873:1: ( 'complex-data' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1874:1: 'complex-data'
            {
             before(grammarAccess.getComplexElementAccess().getComplexDataKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__ComplexElement__Group__1__Impl3764); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1887:1: rule__ComplexElement__Group__2 : rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 ;
    public final void rule__ComplexElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1891:1: ( rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1892:2: rule__ComplexElement__Group__2__Impl rule__ComplexElement__Group__3
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__23795);
            rule__ComplexElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__23798);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1899:1: rule__ComplexElement__Group__2__Impl : ( ( rule__ComplexElement__NameAssignment_2 ) ) ;
    public final void rule__ComplexElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1903:1: ( ( ( rule__ComplexElement__NameAssignment_2 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1904:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1904:1: ( ( rule__ComplexElement__NameAssignment_2 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1905:1: ( rule__ComplexElement__NameAssignment_2 )
            {
             before(grammarAccess.getComplexElementAccess().getNameAssignment_2()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1906:1: ( rule__ComplexElement__NameAssignment_2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1906:2: rule__ComplexElement__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl3825);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1916:1: rule__ComplexElement__Group__3 : rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 ;
    public final void rule__ComplexElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1920:1: ( rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1921:2: rule__ComplexElement__Group__3__Impl rule__ComplexElement__Group__4
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__33855);
            rule__ComplexElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__33858);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1928:1: rule__ComplexElement__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1932:1: ( ( '{' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1933:1: ( '{' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1933:1: ( '{' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1934:1: '{'
            {
             before(grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__ComplexElement__Group__3__Impl3886); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1947:1: rule__ComplexElement__Group__4 : rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 ;
    public final void rule__ComplexElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1951:1: ( rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1952:2: rule__ComplexElement__Group__4__Impl rule__ComplexElement__Group__5
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__43917);
            rule__ComplexElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__43920);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1959:1: rule__ComplexElement__Group__4__Impl : ( ( rule__ComplexElement__ElementsAssignment_4 )* ) ;
    public final void rule__ComplexElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1963:1: ( ( ( rule__ComplexElement__ElementsAssignment_4 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1964:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1964:1: ( ( rule__ComplexElement__ElementsAssignment_4 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1965:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComplexElementAccess().getElementsAssignment_4()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1966:1: ( rule__ComplexElement__ElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1966:2: rule__ComplexElement__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl3947);
            	    rule__ComplexElement__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1976:1: rule__ComplexElement__Group__5 : rule__ComplexElement__Group__5__Impl ;
    public final void rule__ComplexElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1980:1: ( rule__ComplexElement__Group__5__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1981:2: rule__ComplexElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__53978);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1987:1: rule__ComplexElement__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1991:1: ( ( '}' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1992:1: ( '}' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1992:1: ( '}' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:1993:1: '}'
            {
             before(grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__ComplexElement__Group__5__Impl4006); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2018:1: rule__SimpleElement__Group__0 : rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 ;
    public final void rule__SimpleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2022:1: ( rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2023:2: rule__SimpleElement__Group__0__Impl rule__SimpleElement__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04049);
            rule__SimpleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04052);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2030:1: rule__SimpleElement__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2034:1: ( ( () ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2035:1: ( () )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2035:1: ( () )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2036:1: ()
            {
             before(grammarAccess.getSimpleElementAccess().getSimpleElementAction_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2037:1: ()
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2039:1: 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2049:1: rule__SimpleElement__Group__1 : rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 ;
    public final void rule__SimpleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2053:1: ( rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2054:2: rule__SimpleElement__Group__1__Impl rule__SimpleElement__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14110);
            rule__SimpleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14113);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2061:1: rule__SimpleElement__Group__1__Impl : ( ( rule__SimpleElement__NameAssignment_1 ) ) ;
    public final void rule__SimpleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2065:1: ( ( ( rule__SimpleElement__NameAssignment_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2066:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2066:1: ( ( rule__SimpleElement__NameAssignment_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2067:1: ( rule__SimpleElement__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleElementAccess().getNameAssignment_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2068:1: ( rule__SimpleElement__NameAssignment_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2068:2: rule__SimpleElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4140);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2078:1: rule__SimpleElement__Group__2 : rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 ;
    public final void rule__SimpleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2082:1: ( rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2083:2: rule__SimpleElement__Group__2__Impl rule__SimpleElement__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24170);
            rule__SimpleElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24173);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2090:1: rule__SimpleElement__Group__2__Impl : ( ':' ) ;
    public final void rule__SimpleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2094:1: ( ( ':' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2095:1: ( ':' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2095:1: ( ':' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2096:1: ':'
            {
             before(grammarAccess.getSimpleElementAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__SimpleElement__Group__2__Impl4201); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2109:1: rule__SimpleElement__Group__3 : rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 ;
    public final void rule__SimpleElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2113:1: ( rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2114:2: rule__SimpleElement__Group__3__Impl rule__SimpleElement__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34232);
            rule__SimpleElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34235);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2121:1: rule__SimpleElement__Group__3__Impl : ( ( rule__SimpleElement__Alternatives_3 ) ) ;
    public final void rule__SimpleElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2125:1: ( ( ( rule__SimpleElement__Alternatives_3 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2126:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2126:1: ( ( rule__SimpleElement__Alternatives_3 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2127:1: ( rule__SimpleElement__Alternatives_3 )
            {
             before(grammarAccess.getSimpleElementAccess().getAlternatives_3()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2128:1: ( rule__SimpleElement__Alternatives_3 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2128:2: rule__SimpleElement__Alternatives_3
            {
            pushFollow(FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4262);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2138:1: rule__SimpleElement__Group__4 : rule__SimpleElement__Group__4__Impl ;
    public final void rule__SimpleElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2142:1: ( rule__SimpleElement__Group__4__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2143:2: rule__SimpleElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44292);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2149:1: rule__SimpleElement__Group__4__Impl : ( ( rule__SimpleElement__MultiplicityAssignment_4 )? ) ;
    public final void rule__SimpleElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2153:1: ( ( ( rule__SimpleElement__MultiplicityAssignment_4 )? ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2154:1: ( ( rule__SimpleElement__MultiplicityAssignment_4 )? )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2154:1: ( ( rule__SimpleElement__MultiplicityAssignment_4 )? )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2155:1: ( rule__SimpleElement__MultiplicityAssignment_4 )?
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2156:1: ( rule__SimpleElement__MultiplicityAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=19 && LA13_0<=21)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2156:2: rule__SimpleElement__MultiplicityAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_in_rule__SimpleElement__Group__4__Impl4319);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2176:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2180:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2181:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04360);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04363);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2188:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2192:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2193:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2193:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2194:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4390); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2205:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2209:1: ( rule__FQN__Group__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2210:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14419);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2216:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2220:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2221:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2221:1: ( ( rule__FQN__Group_1__0 )* )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2222:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2223:1: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2223:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4446);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2237:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2241:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2242:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04481);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04484);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2249:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2253:1: ( ( '.' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2254:1: ( '.' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2254:1: ( '.' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2255:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__FQN__Group_1__0__Impl4512); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2268:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2272:1: ( rule__FQN__Group_1__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2273:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14543);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2279:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2283:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2284:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2284:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2285:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4570); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2300:1: rule__FqnWildcard__Group__0 : rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 ;
    public final void rule__FqnWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2304:1: ( rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2305:2: rule__FqnWildcard__Group__0__Impl rule__FqnWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__04603);
            rule__FqnWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__04606);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2312:1: rule__FqnWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2316:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2317:1: ( ruleFQN )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2317:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2318:1: ruleFQN
            {
             before(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl4633);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2329:1: rule__FqnWildcard__Group__1 : rule__FqnWildcard__Group__1__Impl ;
    public final void rule__FqnWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2333:1: ( rule__FqnWildcard__Group__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2334:2: rule__FqnWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__14662);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2340:1: rule__FqnWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2344:1: ( ( ( '.*' )? ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2345:1: ( ( '.*' )? )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2345:1: ( ( '.*' )? )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2346:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2347:1: ( '.*' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2348:2: '.*'
                    {
                    match(input,37,FOLLOW_37_in_rule__FqnWildcard__Group__1__Impl4691); 

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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2363:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2367:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2368:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04728);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04731);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2375:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2379:1: ( ( 'import' ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2380:1: ( 'import' )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2380:1: ( 'import' )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2381:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Import__Group__0__Impl4759); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2394:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2398:1: ( rule__Import__Group__1__Impl )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2399:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14790);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2405:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2409:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2410:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2410:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2411:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2412:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2412:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl4817);
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


    // $ANTLR start "rule__SDL__NameAssignment_2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2427:1: rule__SDL__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__SDL__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2431:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2432:1: ( ruleFQN )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2432:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2433:1: ruleFQN
            {
             before(grammarAccess.getSDLAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SDL__NameAssignment_24856);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSDLAccess().getNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__NameAssignment_2"


    // $ANTLR start "rule__SDL__ImportsAssignment_3"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2442:1: rule__SDL__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__SDL__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2446:1: ( ( ruleImport ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2447:1: ( ruleImport )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2447:1: ( ruleImport )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2448:1: ruleImport
            {
             before(grammarAccess.getSDLAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__SDL__ImportsAssignment_34887);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSDLAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__ImportsAssignment_3"


    // $ANTLR start "rule__SDL__ServicesAssignment_4_0"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2457:1: rule__SDL__ServicesAssignment_4_0 : ( ruleService ) ;
    public final void rule__SDL__ServicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2461:1: ( ( ruleService ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2462:1: ( ruleService )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2462:1: ( ruleService )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2463:1: ruleService
            {
             before(grammarAccess.getSDLAccess().getServicesServiceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__SDL__ServicesAssignment_4_04918);
            ruleService();

            state._fsp--;

             after(grammarAccess.getSDLAccess().getServicesServiceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__ServicesAssignment_4_0"


    // $ANTLR start "rule__SDL__DataAssignment_4_1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2472:1: rule__SDL__DataAssignment_4_1 : ( ruleDataElement ) ;
    public final void rule__SDL__DataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2476:1: ( ( ruleDataElement ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2477:1: ( ruleDataElement )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2477:1: ( ruleDataElement )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2478:1: ruleDataElement
            {
             before(grammarAccess.getSDLAccess().getDataDataElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDataElement_in_rule__SDL__DataAssignment_4_14949);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getSDLAccess().getDataDataElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__DataAssignment_4_1"


    // $ANTLR start "rule__SDL__NodesAssignment_4_2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2487:1: rule__SDL__NodesAssignment_4_2 : ( ruleNode ) ;
    public final void rule__SDL__NodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2491:1: ( ( ruleNode ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2492:1: ( ruleNode )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2492:1: ( ruleNode )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2493:1: ruleNode
            {
             before(grammarAccess.getSDLAccess().getNodesNodeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__SDL__NodesAssignment_4_24980);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getSDLAccess().getNodesNodeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SDL__NodesAssignment_4_2"


    // $ANTLR start "rule__Service__NameAssignment_2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2502:1: rule__Service__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2506:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2507:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2507:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2508:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_25011); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_2"


    // $ANTLR start "rule__Service__OperationsAssignment_4_1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2517:1: rule__Service__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__Service__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2521:1: ( ( ruleOperation ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2522:1: ( ruleOperation )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2522:1: ( ruleOperation )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2523:1: ruleOperation
            {
             before(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_4_15042);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__OperationsAssignment_4_1"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2532:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2536:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2537:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2537:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2538:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15073); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2547:1: rule__Operation__InputNameAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Operation__InputNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2551:1: ( ( RULE_STRING ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2552:1: ( RULE_STRING )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2552:1: ( RULE_STRING )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2553:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15104); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2562:1: rule__Operation__InputTypeAssignment_3_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__InputTypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2566:1: ( ( ( ruleFQN ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2567:1: ( ( ruleFQN ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2567:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2568:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2569:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2570:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getInputTypeDataElementFQNParserRuleCall_3_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35139);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2581:1: rule__Operation__OutputNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Operation__OutputNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2585:1: ( ( RULE_STRING ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2586:1: ( RULE_STRING )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2586:1: ( RULE_STRING )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2587:1: RULE_STRING
            {
             before(grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15174); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2596:1: rule__Operation__OutputTypeAssignment_4_3 : ( ( ruleFQN ) ) ;
    public final void rule__Operation__OutputTypeAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2600:1: ( ( ( ruleFQN ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2601:1: ( ( ruleFQN ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2601:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2602:1: ( ruleFQN )
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2603:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2604:1: ruleFQN
            {
             before(grammarAccess.getOperationAccess().getOutputTypeDataElementFQNParserRuleCall_4_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35209);
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


    // $ANTLR start "rule__Node__NameAssignment_2"
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2615:1: rule__Node__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2619:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2620:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2620:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2621:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25244); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2630:1: rule__Node__BaseURIAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Node__BaseURIAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2634:1: ( ( RULE_STRING ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2635:1: ( RULE_STRING )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2635:1: ( RULE_STRING )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2636:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55275); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2645:1: rule__Node__ServicesAssignment_8 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2649:1: ( ( ( ruleFQN ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2650:1: ( ( ruleFQN ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2650:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2651:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2652:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2653:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85310);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2664:1: rule__Node__ServicesAssignment_9_1 : ( ( ruleFQN ) ) ;
    public final void rule__Node__ServicesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2668:1: ( ( ( ruleFQN ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2669:1: ( ( ruleFQN ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2669:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2670:1: ( ruleFQN )
            {
             before(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2671:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2672:1: ruleFQN
            {
             before(grammarAccess.getNodeAccess().getServicesServiceFQNParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15349);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2683:1: rule__ComplexElement__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComplexElement__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2687:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2688:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2688:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2689:1: RULE_ID
            {
             before(grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25384); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2698:1: rule__ComplexElement__ElementsAssignment_4 : ( ruleSimpleElement ) ;
    public final void rule__ComplexElement__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2702:1: ( ( ruleSimpleElement ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2703:1: ( ruleSimpleElement )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2703:1: ( ruleSimpleElement )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2704:1: ruleSimpleElement
            {
             before(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45415);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2713:1: rule__SimpleElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2717:1: ( ( RULE_ID ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2718:1: ( RULE_ID )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2718:1: ( RULE_ID )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2719:1: RULE_ID
            {
             before(grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15446); 
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2728:1: rule__SimpleElement__TypeAssignment_3_0 : ( ruleDATATYPE ) ;
    public final void rule__SimpleElement__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2732:1: ( ( ruleDATATYPE ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2733:1: ( ruleDATATYPE )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2733:1: ( ruleDATATYPE )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2734:1: ruleDATATYPE
            {
             before(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05477);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2743:1: rule__SimpleElement__RefAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SimpleElement__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2747:1: ( ( ( ruleFQN ) ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2748:1: ( ( ruleFQN ) )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2748:1: ( ( ruleFQN ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2749:1: ( ruleFQN )
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2750:1: ( ruleFQN )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2751:1: ruleFQN
            {
             before(grammarAccess.getSimpleElementAccess().getRefComplexElementFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_15512);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2762:1: rule__SimpleElement__MultiplicityAssignment_4 : ( ruleMULTIPLICITY ) ;
    public final void rule__SimpleElement__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2766:1: ( ( ruleMULTIPLICITY ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2767:1: ( ruleMULTIPLICITY )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2767:1: ( ruleMULTIPLICITY )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2768:1: ruleMULTIPLICITY
            {
             before(grammarAccess.getSimpleElementAccess().getMultiplicityMULTIPLICITYEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMULTIPLICITY_in_rule__SimpleElement__MultiplicityAssignment_45547);
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
    // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2777:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2781:1: ( ( ruleFqnWildcard ) )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2782:1: ( ruleFqnWildcard )
            {
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2782:1: ( ruleFqnWildcard )
            // ../sdl.ui/src-gen/at/ac/univie/cs/swa/soa/ui/contentassist/antlr/internal/InternalSDL.g:2783:1: ruleFqnWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_15578);
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


 

    public static final BitSet FOLLOW_ruleSDL_in_entryRuleSDL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSDL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__0_in_ruleSDL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Alternatives_in_ruleDataElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_entryRuleComplexElement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexElement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__0_in_ruleComplexElement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_entryRuleSimpleElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__0_in_ruleSimpleElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_entryRuleFqnWildcard541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWildcard548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__0_in_ruleFqnWildcard574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATATYPE__Alternatives_in_ruleDATATYPE671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MULTIPLICITY__Alternatives_in_ruleMULTIPLICITY707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__ServicesAssignment_4_0_in_rule__SDL__Alternatives_4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__DataAssignment_4_1_in_rule__SDL__Alternatives_4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__NodesAssignment_4_2_in_rule__SDL__Alternatives_4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__DataElement__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexElement_in_rule__DataElement__Alternatives828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__TypeAssignment_3_0_in_rule__SimpleElement__Alternatives_3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__RefAssignment_3_1_in_rule__SimpleElement__Alternatives_3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DATATYPE__Alternatives912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DATATYPE__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DATATYPE__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DATATYPE__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DATATYPE__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DATATYPE__Alternatives1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DATATYPE__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DATATYPE__Alternatives1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MULTIPLICITY__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MULTIPLICITY__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MULTIPLICITY__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__0__Impl_in_rule__SDL__Group__01170 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SDL__Group__1_in_rule__SDL__Group__01173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__1__Impl_in_rule__SDL__Group__11231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SDL__Group__2_in_rule__SDL__Group__11234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SDL__Group__1__Impl1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__2__Impl_in_rule__SDL__Group__21293 = new BitSet(new long[]{0x0000004840800010L});
    public static final BitSet FOLLOW_rule__SDL__Group__3_in_rule__SDL__Group__21296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__NameAssignment_2_in_rule__SDL__Group__2__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__3__Impl_in_rule__SDL__Group__31353 = new BitSet(new long[]{0x0000004840800010L});
    public static final BitSet FOLLOW_rule__SDL__Group__4_in_rule__SDL__Group__31356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__ImportsAssignment_3_in_rule__SDL__Group__3__Impl1383 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__SDL__Group__4__Impl_in_rule__SDL__Group__41414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SDL__Alternatives_4_in_rule__SDL__Group__4__Impl1441 = new BitSet(new long[]{0x0000000840800012L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01482 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Service__Group__1__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21605 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_2_in_rule__Service__Group__2__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__31665 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__31668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__3__Impl1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__41727 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__41730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0_in_rule__Service__Group__4__Impl1757 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__51788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Service__Group__5__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__0__Impl_in_rule__Service__Group_4__01859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1_in_rule__Service__Group_4__01862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Service__Group_4__0__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group_4__1__Impl_in_rule__Service__Group_4__11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__OperationsAssignment_4_1_in_rule__Service__Group_4__1__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__01982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__01985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__12043 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__12046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__22103 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__22106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operation__Group__2__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__32165 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__4_in_rule__Operation__Group__32168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0_in_rule__Operation__Group__3__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__4__Impl_in_rule__Operation__Group__42226 = new BitSet(new long[]{0x000000002A000000L});
    public static final BitSet FOLLOW_rule__Operation__Group__5_in_rule__Operation__Group__42229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0_in_rule__Operation__Group__4__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__5__Impl_in_rule__Operation__Group__52287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operation__Group__5__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__0__Impl_in_rule__Operation__Group_3__02358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1_in_rule__Operation__Group_3__02361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operation__Group_3__0__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__1__Impl_in_rule__Operation__Group_3__12420 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2_in_rule__Operation__Group_3__12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputNameAssignment_3_1_in_rule__Operation__Group_3__1__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__2__Impl_in_rule__Operation__Group_3__22480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3_in_rule__Operation__Group_3__22483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group_3__2__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_3__3__Impl_in_rule__Operation__Group_3__32542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__InputTypeAssignment_3_3_in_rule__Operation__Group_3__3__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__0__Impl_in_rule__Operation__Group_4__02607 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1_in_rule__Operation__Group_4__02610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operation__Group_4__0__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__1__Impl_in_rule__Operation__Group_4__12669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2_in_rule__Operation__Group_4__12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputNameAssignment_4_1_in_rule__Operation__Group_4__1__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__2__Impl_in_rule__Operation__Group_4__22729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3_in_rule__Operation__Group_4__22732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operation__Group_4__2__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group_4__3__Impl_in_rule__Operation__Group_4__32791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__OutputTypeAssignment_4_3_in_rule__Operation__Group_4__3__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__02856 = new BitSet(new long[]{0x0000000840800010L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__02859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__12917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Node__Group__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__22979 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Node__Group__3_in_rule__Node__Group__22982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_2_in_rule__Node__Group__2__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__3__Impl_in_rule__Node__Group__33039 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Node__Group__4_in_rule__Node__Group__33042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Node__Group__3__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__4__Impl_in_rule__Node__Group__43101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group__5_in_rule__Node__Group__43104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Node__Group__4__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__5__Impl_in_rule__Node__Group__53163 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Node__Group__6_in_rule__Node__Group__53166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__BaseURIAssignment_5_in_rule__Node__Group__5__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__6__Impl_in_rule__Node__Group__63223 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Node__Group__7_in_rule__Node__Group__63226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Node__Group__6__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__7__Impl_in_rule__Node__Group__73285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group__8_in_rule__Node__Group__73288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Node__Group__7__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__8__Impl_in_rule__Node__Group__83347 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_rule__Node__Group__9_in_rule__Node__Group__83350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_8_in_rule__Node__Group__8__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__9__Impl_in_rule__Node__Group__93407 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_rule__Node__Group__10_in_rule__Node__Group__93410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0_in_rule__Node__Group__9__Impl3437 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Node__Group__10__Impl_in_rule__Node__Group__103468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group__10__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__0__Impl_in_rule__Node__Group_9__03549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1_in_rule__Node__Group_9__03552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Node__Group_9__0__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_9__1__Impl_in_rule__Node__Group_9__13611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ServicesAssignment_9_1_in_rule__Node__Group_9__1__Impl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__0__Impl_in_rule__ComplexElement__Group__03672 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1_in_rule__ComplexElement__Group__03675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__1__Impl_in_rule__ComplexElement__Group__13733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2_in_rule__ComplexElement__Group__13736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ComplexElement__Group__1__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__2__Impl_in_rule__ComplexElement__Group__23795 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3_in_rule__ComplexElement__Group__23798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__NameAssignment_2_in_rule__ComplexElement__Group__2__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__3__Impl_in_rule__ComplexElement__Group__33855 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4_in_rule__ComplexElement__Group__33858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ComplexElement__Group__3__Impl3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__4__Impl_in_rule__ComplexElement__Group__43917 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5_in_rule__ComplexElement__Group__43920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexElement__ElementsAssignment_4_in_rule__ComplexElement__Group__4__Impl3947 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ComplexElement__Group__5__Impl_in_rule__ComplexElement__Group__53978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ComplexElement__Group__5__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__0__Impl_in_rule__SimpleElement__Group__04049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1_in_rule__SimpleElement__Group__04052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__1__Impl_in_rule__SimpleElement__Group__14110 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2_in_rule__SimpleElement__Group__14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__NameAssignment_1_in_rule__SimpleElement__Group__1__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__2__Impl_in_rule__SimpleElement__Group__24170 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3_in_rule__SimpleElement__Group__24173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SimpleElement__Group__2__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__3__Impl_in_rule__SimpleElement__Group__34232 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4_in_rule__SimpleElement__Group__34235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Alternatives_3_in_rule__SimpleElement__Group__3__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__Group__4__Impl_in_rule__SimpleElement__Group__44292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleElement__MultiplicityAssignment_4_in_rule__SimpleElement__Group__4__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__04360 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4446 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FQN__Group_1__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__0__Impl_in_rule__FqnWildcard__Group__04603 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1_in_rule__FqnWildcard__Group__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWildcard__Group__0__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWildcard__Group__1__Impl_in_rule__FqnWildcard__Group__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FqnWildcard__Group__1__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__04728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Import__Group__0__Impl4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__14790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SDL__NameAssignment_24856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__SDL__ImportsAssignment_34887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__SDL__ServicesAssignment_4_04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_rule__SDL__DataAssignment_4_14949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__SDL__NodesAssignment_4_24980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_25011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Service__OperationsAssignment_4_15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_15073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__InputNameAssignment_3_15104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__InputTypeAssignment_3_35139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Operation__OutputNameAssignment_4_15174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Operation__OutputTypeAssignment_4_35209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_25244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__BaseURIAssignment_55275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_85310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Node__ServicesAssignment_9_15349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComplexElement__NameAssignment_25384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleElement_in_rule__ComplexElement__ElementsAssignment_45415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleElement__NameAssignment_15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATATYPE_in_rule__SimpleElement__TypeAssignment_3_05477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__SimpleElement__RefAssignment_3_15512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULTIPLICITY_in_rule__SimpleElement__MultiplicityAssignment_45547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWildcard_in_rule__Import__ImportedNamespaceAssignment_15578 = new BitSet(new long[]{0x0000000000000002L});

}