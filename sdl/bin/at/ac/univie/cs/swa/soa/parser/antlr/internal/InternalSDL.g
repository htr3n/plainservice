/*
* generated by Xtext
*/
grammar InternalSDL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.univie.cs.swa.soa.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSDL
entryRuleSDL returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSDLRule()); }
	 iv_ruleSDL=ruleSDL 
	 { $current=$iv_ruleSDL.current; } 
	 EOF 
;

// Rule SDL
ruleSDL returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSDLAccess().getSDLAction_0(),
            $current);
    }
)	otherlv_1='module' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSDLAccess().getModuleKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSDLAccess().getNameFQNParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSDLRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSDLAccess().getImportsImportParserRuleCall_3_0()); 
	    }
		lv_imports_3_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSDLRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_3_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*((
(
		{ 
	        newCompositeNode(grammarAccess.getSDLAccess().getServicesServiceParserRuleCall_4_0_0()); 
	    }
		lv_services_4_0=ruleService		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSDLRule());
	        }
       		add(
       			$current, 
       			"services",
        		lv_services_4_0, 
        		"Service");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSDLAccess().getDataDataElementParserRuleCall_4_1_0()); 
	    }
		lv_data_5_0=ruleDataElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSDLRule());
	        }
       		add(
       			$current, 
       			"data",
        		lv_data_5_0, 
        		"DataElement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getSDLAccess().getNodesNodeParserRuleCall_4_2_0()); 
	    }
		lv_nodes_6_0=ruleNode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSDLRule());
	        }
       		add(
       			$current, 
       			"nodes",
        		lv_nodes_6_0, 
        		"Node");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleService
entryRuleService returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getServiceRule()); }
	 iv_ruleService=ruleService 
	 { $current=$iv_ruleService.current; } 
	 EOF 
;

// Rule Service
ruleService returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getServiceAccess().getServiceAction_0(),
            $current);
    }
)	otherlv_1='Service' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getServiceKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getServiceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='operation' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getOperationKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getServiceAccess().getOperationsOperationParserRuleCall_4_1_0()); 
	    }
		lv_operations_5_0=ruleOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getServiceRule());
	        }
       		add(
       			$current, 
       			"operations",
        		lv_operations_5_0, 
        		"Operation");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getOperationAccess().getOperationAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='input' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getInputKeyword_3_0());
    }
(
(
		lv_inputName_4_0=RULE_STRING
		{
			newLeafNode(lv_inputName_4_0, grammarAccess.getOperationAccess().getInputNameSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"inputName",
        		lv_inputName_4_0, 
        		"STRING");
	    }

)
)	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getColonKeyword_3_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getInputTypeDataElementCrossReference_3_3_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='output' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getOutputKeyword_4_0());
    }
(
(
		lv_outputName_8_0=RULE_STRING
		{
			newLeafNode(lv_outputName_8_0, grammarAccess.getOperationAccess().getOutputNameSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"outputName",
        		lv_outputName_8_0, 
        		"STRING");
	    }

)
)	otherlv_9=':' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_4_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getOutputTypeDataElementCrossReference_4_3_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleNode
entryRuleNode returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNodeRule()); }
	 iv_ruleNode=ruleNode 
	 { $current=$iv_ruleNode.current; } 
	 EOF 
;

// Rule Node
ruleNode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNodeAccess().getNodeAction_0(),
            $current);
    }
)	otherlv_1='Node' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='uri' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getUriKeyword_3());
    }
	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEqualsSignKeyword_4());
    }
(
(
		lv_baseURI_5_0=RULE_STRING
		{
			newLeafNode(lv_baseURI_5_0, grammarAccess.getNodeAccess().getBaseURISTRINGTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"baseURI",
        		lv_baseURI_5_0, 
        		"STRING");
	    }

)
)	otherlv_6='hosts' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getHostsKeyword_6());
    }
	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_8_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getCommaKeyword_9_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getNodeRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getNodeAccess().getServicesServiceCrossReference_9_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10());
    }
)
;





// Entry rule entryRuleDataElement
entryRuleDataElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataElementRule()); }
	 iv_ruleDataElement=ruleDataElement 
	 { $current=$iv_ruleDataElement.current; } 
	 EOF 
;

// Rule DataElement
ruleDataElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDataElementAccess().getSimpleElementParserRuleCall_0()); 
    }
    this_SimpleElement_0=ruleSimpleElement
    { 
        $current = $this_SimpleElement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDataElementAccess().getComplexElementParserRuleCall_1()); 
    }
    this_ComplexElement_1=ruleComplexElement
    { 
        $current = $this_ComplexElement_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleComplexElement
entryRuleComplexElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComplexElementRule()); }
	 iv_ruleComplexElement=ruleComplexElement 
	 { $current=$iv_ruleComplexElement.current; } 
	 EOF 
;

// Rule ComplexElement
ruleComplexElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getComplexElementAccess().getComplexElementAction_0(),
            $current);
    }
)	otherlv_1='complex-data' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getComplexElementAccess().getComplexDataKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getComplexElementAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComplexElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getComplexElementAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComplexElementAccess().getElementsSimpleElementParserRuleCall_4_0()); 
	    }
		lv_elements_4_0=ruleSimpleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComplexElementRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"SimpleElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getComplexElementAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleSimpleElement
entryRuleSimpleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimpleElementRule()); }
	 iv_ruleSimpleElement=ruleSimpleElement 
	 { $current=$iv_ruleSimpleElement.current; } 
	 EOF 
;

// Rule SimpleElement
ruleSimpleElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSimpleElementAccess().getSimpleElementAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSimpleElementAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSimpleElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSimpleElementAccess().getColonKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleElementAccess().getTypeDATATYPEEnumRuleCall_3_0_0()); 
	    }
		lv_type_3_0=ruleDATATYPE		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleElementRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"DATATYPE");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSimpleElementRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getSimpleElementAccess().getRefComplexElementCrossReference_3_1_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))(
(
		{ 
	        newCompositeNode(grammarAccess.getSimpleElementAccess().getMultiplicityMULTIPLICITYEnumRuleCall_4_0()); 
	    }
		lv_multiplicity_5_0=ruleMULTIPLICITY		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimpleElementRule());
	        }
       		set(
       			$current, 
       			"multiplicity",
        		lv_multiplicity_5_0, 
        		"MULTIPLICITY");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleFqnWildcard
entryRuleFqnWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFqnWildcardRule()); } 
	 iv_ruleFqnWildcard=ruleFqnWildcard 
	 { $current=$iv_ruleFqnWildcard.current.getText(); }  
	 EOF 
;

// Rule FqnWildcard
ruleFqnWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFqnWildcardAccess().getFQNParserRuleCall_0()); 
    }
    this_FQN_0=ruleFQN    {
		$current.merge(this_FQN_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFqnWildcardAccess().getFullStopAsteriskKeyword_1()); 
    }
)?)
    ;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleFqnWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"FqnWildcard");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Rule DATATYPE
ruleDATATYPE returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='string' 
	{
        $current = grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDATATYPEAccess().getStringEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='integer' 
	{
        $current = grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDATATYPEAccess().getIntegerEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='float' 
	{
        $current = grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDATATYPEAccess().getFloatEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='date' 
	{
        $current = grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getDATATYPEAccess().getDateEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='time' 
	{
        $current = grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getDATATYPEAccess().getTimeEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='dateTime' 
	{
        $current = grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getDATATYPEAccess().getDatetimeEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='binary' 
	{
        $current = grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getDATATYPEAccess().getBinaryEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='boolean' 
	{
        $current = grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getDATATYPEAccess().getBooleanEnumLiteralDeclaration_7()); 
    }
));



// Rule MULTIPLICITY
ruleMULTIPLICITY returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='?' 
	{
        $current = grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMULTIPLICITYAccess().getOPTIONALEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='+' 
	{
        $current = grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMULTIPLICITYAccess().getPLUSEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='*' 
	{
        $current = grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMULTIPLICITYAccess().getSTAREnumLiteralDeclaration_2()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


