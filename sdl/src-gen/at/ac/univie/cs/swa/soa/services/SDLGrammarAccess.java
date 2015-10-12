/*
* generated by Xtext
*/
package at.ac.univie.cs.swa.soa.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SDLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SDLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SDL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSDLAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModuleKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameFQNParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cImportsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cImportsImportParserRuleCall_3_0 = (RuleCall)cImportsAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cServicesAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cServicesServiceParserRuleCall_4_0_0 = (RuleCall)cServicesAssignment_4_0.eContents().get(0);
		private final Assignment cDataAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cDataDataElementParserRuleCall_4_1_0 = (RuleCall)cDataAssignment_4_1.eContents().get(0);
		private final Assignment cNodesAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cNodesNodeParserRuleCall_4_2_0 = (RuleCall)cNodesAssignment_4_2.eContents().get(0);
		
		//SDL:
		//	{SDL} "module" name=FQN imports+=Import* (services+=Service | data+=DataElement | nodes+=Node)*;
		public ParserRule getRule() { return rule; }

		//{SDL} "module" name=FQN imports+=Import* (services+=Service | data+=DataElement | nodes+=Node)*
		public Group getGroup() { return cGroup; }

		//{SDL}
		public Action getSDLAction_0() { return cSDLAction_0; }

		//"module"
		public Keyword getModuleKeyword_1() { return cModuleKeyword_1; }

		//name=FQN
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_2_0() { return cNameFQNParserRuleCall_2_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_3() { return cImportsAssignment_3; }

		//Import
		public RuleCall getImportsImportParserRuleCall_3_0() { return cImportsImportParserRuleCall_3_0; }

		//(services+=Service | data+=DataElement | nodes+=Node)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//services+=Service
		public Assignment getServicesAssignment_4_0() { return cServicesAssignment_4_0; }

		//Service
		public RuleCall getServicesServiceParserRuleCall_4_0_0() { return cServicesServiceParserRuleCall_4_0_0; }

		//data+=DataElement
		public Assignment getDataAssignment_4_1() { return cDataAssignment_4_1; }

		//DataElement
		public RuleCall getDataDataElementParserRuleCall_4_1_0() { return cDataDataElementParserRuleCall_4_1_0; }

		//nodes+=Node
		public Assignment getNodesAssignment_4_2() { return cNodesAssignment_4_2; }

		//Node
		public RuleCall getNodesNodeParserRuleCall_4_2_0() { return cNodesNodeParserRuleCall_4_2_0; }
	}

	public class ServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Service");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cServiceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cServiceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOperationKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOperationsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOperationsOperationParserRuleCall_4_1_0 = (RuleCall)cOperationsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Service:
		//	{Service} "Service" name=ID "{" ("operation" operations+=Operation)* "}";
		public ParserRule getRule() { return rule; }

		//{Service} "Service" name=ID "{" ("operation" operations+=Operation)* "}"
		public Group getGroup() { return cGroup; }

		//{Service}
		public Action getServiceAction_0() { return cServiceAction_0; }

		//"Service"
		public Keyword getServiceKeyword_1() { return cServiceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("operation" operations+=Operation)*
		public Group getGroup_4() { return cGroup_4; }

		//"operation"
		public Keyword getOperationKeyword_4_0() { return cOperationKeyword_4_0; }

		//operations+=Operation
		public Assignment getOperationsAssignment_4_1() { return cOperationsAssignment_4_1; }

		//Operation
		public RuleCall getOperationsOperationParserRuleCall_4_1_0() { return cOperationsOperationParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOperationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cInputKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInputNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cInputNameSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cInputNameAssignment_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cInputTypeAssignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cInputTypeDataElementCrossReference_3_3_0 = (CrossReference)cInputTypeAssignment_3_3.eContents().get(0);
		private final RuleCall cInputTypeDataElementFQNParserRuleCall_3_3_0_1 = (RuleCall)cInputTypeDataElementCrossReference_3_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOutputKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOutputNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOutputNameSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cOutputNameAssignment_4_1.eContents().get(0);
		private final Keyword cColonKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cOutputTypeAssignment_4_3 = (Assignment)cGroup_4.eContents().get(3);
		private final CrossReference cOutputTypeDataElementCrossReference_4_3_0 = (CrossReference)cOutputTypeAssignment_4_3.eContents().get(0);
		private final RuleCall cOutputTypeDataElementFQNParserRuleCall_4_3_0_1 = (RuleCall)cOutputTypeDataElementCrossReference_4_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Operation:
		//	{Operation} name=ID "{" ("input" inputName=STRING ":" inputType=[DataElement|FQN])? ("output" outputName=STRING ":"
		//	outputType=[DataElement|FQN])? "}";
		public ParserRule getRule() { return rule; }

		//{Operation} name=ID "{" ("input" inputName=STRING ":" inputType=[DataElement|FQN])? ("output" outputName=STRING ":"
		//outputType=[DataElement|FQN])? "}"
		public Group getGroup() { return cGroup; }

		//{Operation}
		public Action getOperationAction_0() { return cOperationAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("input" inputName=STRING ":" inputType=[DataElement|FQN])?
		public Group getGroup_3() { return cGroup_3; }

		//"input"
		public Keyword getInputKeyword_3_0() { return cInputKeyword_3_0; }

		//inputName=STRING
		public Assignment getInputNameAssignment_3_1() { return cInputNameAssignment_3_1; }

		//STRING
		public RuleCall getInputNameSTRINGTerminalRuleCall_3_1_0() { return cInputNameSTRINGTerminalRuleCall_3_1_0; }

		//":"
		public Keyword getColonKeyword_3_2() { return cColonKeyword_3_2; }

		//inputType=[DataElement|FQN]
		public Assignment getInputTypeAssignment_3_3() { return cInputTypeAssignment_3_3; }

		//[DataElement|FQN]
		public CrossReference getInputTypeDataElementCrossReference_3_3_0() { return cInputTypeDataElementCrossReference_3_3_0; }

		//FQN
		public RuleCall getInputTypeDataElementFQNParserRuleCall_3_3_0_1() { return cInputTypeDataElementFQNParserRuleCall_3_3_0_1; }

		//("output" outputName=STRING ":" outputType=[DataElement|FQN])?
		public Group getGroup_4() { return cGroup_4; }

		//"output"
		public Keyword getOutputKeyword_4_0() { return cOutputKeyword_4_0; }

		//outputName=STRING
		public Assignment getOutputNameAssignment_4_1() { return cOutputNameAssignment_4_1; }

		//STRING
		public RuleCall getOutputNameSTRINGTerminalRuleCall_4_1_0() { return cOutputNameSTRINGTerminalRuleCall_4_1_0; }

		//":"
		public Keyword getColonKeyword_4_2() { return cColonKeyword_4_2; }

		//outputType=[DataElement|FQN]
		public Assignment getOutputTypeAssignment_4_3() { return cOutputTypeAssignment_4_3; }

		//[DataElement|FQN]
		public CrossReference getOutputTypeDataElementCrossReference_4_3_0() { return cOutputTypeDataElementCrossReference_4_3_0; }

		//FQN
		public RuleCall getOutputTypeDataElementFQNParserRuleCall_4_3_0_1() { return cOutputTypeDataElementFQNParserRuleCall_4_3_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cUriKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBaseURIAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBaseURISTRINGTerminalRuleCall_5_0 = (RuleCall)cBaseURIAssignment_5.eContents().get(0);
		private final Keyword cHostsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cServicesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cServicesServiceCrossReference_8_0 = (CrossReference)cServicesAssignment_8.eContents().get(0);
		private final RuleCall cServicesServiceFQNParserRuleCall_8_0_1 = (RuleCall)cServicesServiceCrossReference_8_0.eContents().get(1);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cCommaKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cServicesAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final CrossReference cServicesServiceCrossReference_9_1_0 = (CrossReference)cServicesAssignment_9_1.eContents().get(0);
		private final RuleCall cServicesServiceFQNParserRuleCall_9_1_0_1 = (RuleCall)cServicesServiceCrossReference_9_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Node:
		//	{Node} "Node" name=ID "uri" "=" baseURI=STRING "hosts" "{" services+=[Service|FQN] ("," services+=[Service|FQN])* "}";
		public ParserRule getRule() { return rule; }

		//{Node} "Node" name=ID "uri" "=" baseURI=STRING "hosts" "{" services+=[Service|FQN] ("," services+=[Service|FQN])* "}"
		public Group getGroup() { return cGroup; }

		//{Node}
		public Action getNodeAction_0() { return cNodeAction_0; }

		//"Node"
		public Keyword getNodeKeyword_1() { return cNodeKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"uri"
		public Keyword getUriKeyword_3() { return cUriKeyword_3; }

		//"="
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }

		//baseURI=STRING
		public Assignment getBaseURIAssignment_5() { return cBaseURIAssignment_5; }

		//STRING
		public RuleCall getBaseURISTRINGTerminalRuleCall_5_0() { return cBaseURISTRINGTerminalRuleCall_5_0; }

		//"hosts"
		public Keyword getHostsKeyword_6() { return cHostsKeyword_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//services+=[Service|FQN]
		public Assignment getServicesAssignment_8() { return cServicesAssignment_8; }

		//[Service|FQN]
		public CrossReference getServicesServiceCrossReference_8_0() { return cServicesServiceCrossReference_8_0; }

		//FQN
		public RuleCall getServicesServiceFQNParserRuleCall_8_0_1() { return cServicesServiceFQNParserRuleCall_8_0_1; }

		//("," services+=[Service|FQN])*
		public Group getGroup_9() { return cGroup_9; }

		//","
		public Keyword getCommaKeyword_9_0() { return cCommaKeyword_9_0; }

		//services+=[Service|FQN]
		public Assignment getServicesAssignment_9_1() { return cServicesAssignment_9_1; }

		//[Service|FQN]
		public CrossReference getServicesServiceCrossReference_9_1_0() { return cServicesServiceCrossReference_9_1_0; }

		//FQN
		public RuleCall getServicesServiceFQNParserRuleCall_9_1_0_1() { return cServicesServiceFQNParserRuleCall_9_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}

	public class DataElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComplexElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataElement:
		//	SimpleElement | ComplexElement;
		public ParserRule getRule() { return rule; }

		//SimpleElement | ComplexElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//SimpleElement
		public RuleCall getSimpleElementParserRuleCall_0() { return cSimpleElementParserRuleCall_0; }

		//ComplexElement
		public RuleCall getComplexElementParserRuleCall_1() { return cComplexElementParserRuleCall_1; }
	}

	public class ComplexElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComplexElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComplexElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cComplexDataKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementsSimpleElementParserRuleCall_4_0 = (RuleCall)cElementsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ComplexElement:
		//	{ComplexElement} "complex-data" name=ID "{" elements+=SimpleElement* "}";
		public ParserRule getRule() { return rule; }

		//{ComplexElement} "complex-data" name=ID "{" elements+=SimpleElement* "}"
		public Group getGroup() { return cGroup; }

		//{ComplexElement}
		public Action getComplexElementAction_0() { return cComplexElementAction_0; }

		//"complex-data"
		public Keyword getComplexDataKeyword_1() { return cComplexDataKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//elements+=SimpleElement*
		public Assignment getElementsAssignment_4() { return cElementsAssignment_4; }

		//SimpleElement
		public RuleCall getElementsSimpleElementParserRuleCall_4_0() { return cElementsSimpleElementParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class SimpleElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSimpleElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cTypeDATATYPEEnumRuleCall_3_0_0 = (RuleCall)cTypeAssignment_3_0.eContents().get(0);
		private final Assignment cRefAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final CrossReference cRefComplexElementCrossReference_3_1_0 = (CrossReference)cRefAssignment_3_1.eContents().get(0);
		private final RuleCall cRefComplexElementFQNParserRuleCall_3_1_0_1 = (RuleCall)cRefComplexElementCrossReference_3_1_0.eContents().get(1);
		private final Assignment cMultiplicityAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMultiplicityMULTIPLICITYEnumRuleCall_4_0 = (RuleCall)cMultiplicityAssignment_4.eContents().get(0);
		
		//SimpleElement:
		//	{SimpleElement} name=ID ":" (type=DATATYPE | ref=[ComplexElement|FQN]) multiplicity=MULTIPLICITY?;
		public ParserRule getRule() { return rule; }

		//{SimpleElement} name=ID ":" (type=DATATYPE | ref=[ComplexElement|FQN]) multiplicity=MULTIPLICITY?
		public Group getGroup() { return cGroup; }

		//{SimpleElement}
		public Action getSimpleElementAction_0() { return cSimpleElementAction_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=DATATYPE | ref=[ComplexElement|FQN]
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//type=DATATYPE
		public Assignment getTypeAssignment_3_0() { return cTypeAssignment_3_0; }

		//DATATYPE
		public RuleCall getTypeDATATYPEEnumRuleCall_3_0_0() { return cTypeDATATYPEEnumRuleCall_3_0_0; }

		//ref=[ComplexElement|FQN]
		public Assignment getRefAssignment_3_1() { return cRefAssignment_3_1; }

		//[ComplexElement|FQN]
		public CrossReference getRefComplexElementCrossReference_3_1_0() { return cRefComplexElementCrossReference_3_1_0; }

		//FQN
		public RuleCall getRefComplexElementFQNParserRuleCall_3_1_0_1() { return cRefComplexElementFQNParserRuleCall_3_1_0_1; }

		//multiplicity=MULTIPLICITY?
		public Assignment getMultiplicityAssignment_4() { return cMultiplicityAssignment_4; }

		//MULTIPLICITY
		public RuleCall getMultiplicityMULTIPLICITYEnumRuleCall_4_0() { return cMultiplicityMULTIPLICITYEnumRuleCall_4_0; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class FqnWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FqnWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFQNParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//FqnWildcard:
		//	FQN ".*"?;
		public ParserRule getRule() { return rule; }

		//FQN ".*"?
		public Group getGroup() { return cGroup; }

		//FQN
		public RuleCall getFQNParserRuleCall_0() { return cFQNParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceFqnWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=FqnWildcard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=FqnWildcard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=FqnWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//FqnWildcard
		public RuleCall getImportedNamespaceFqnWildcardParserRuleCall_1_0() { return cImportedNamespaceFqnWildcardParserRuleCall_1_0; }
	}
	
	
	public class DATATYPEElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "DATATYPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntegerIntegerKeyword_1_0 = (Keyword)cIntegerEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFloatEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFloatFloatKeyword_2_0 = (Keyword)cFloatEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cDateEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cDateDateKeyword_3_0 = (Keyword)cDateEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cTimeEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cTimeTimeKeyword_4_0 = (Keyword)cTimeEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cDatetimeEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cDatetimeDateTimeKeyword_5_0 = (Keyword)cDatetimeEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cBinaryEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cBinaryBinaryKeyword_6_0 = (Keyword)cBinaryEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cBooleanBooleanKeyword_7_0 = (Keyword)cBooleanEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum DATATYPE:
		//	string | integer | float | date | time | datetime="dateTime" | binary | boolean;
		public EnumRule getRule() { return rule; }

		//string | integer | float | date | time | datetime="dateTime" | binary | boolean
		public Alternatives getAlternatives() { return cAlternatives; }

		//string
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }

		//"string"
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }

		//integer
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_1() { return cIntegerEnumLiteralDeclaration_1; }

		//"integer"
		public Keyword getIntegerIntegerKeyword_1_0() { return cIntegerIntegerKeyword_1_0; }

		//float
		public EnumLiteralDeclaration getFloatEnumLiteralDeclaration_2() { return cFloatEnumLiteralDeclaration_2; }

		//"float"
		public Keyword getFloatFloatKeyword_2_0() { return cFloatFloatKeyword_2_0; }

		//date
		public EnumLiteralDeclaration getDateEnumLiteralDeclaration_3() { return cDateEnumLiteralDeclaration_3; }

		//"date"
		public Keyword getDateDateKeyword_3_0() { return cDateDateKeyword_3_0; }

		//time
		public EnumLiteralDeclaration getTimeEnumLiteralDeclaration_4() { return cTimeEnumLiteralDeclaration_4; }

		//"time"
		public Keyword getTimeTimeKeyword_4_0() { return cTimeTimeKeyword_4_0; }

		//datetime="dateTime"
		public EnumLiteralDeclaration getDatetimeEnumLiteralDeclaration_5() { return cDatetimeEnumLiteralDeclaration_5; }

		//"dateTime"
		public Keyword getDatetimeDateTimeKeyword_5_0() { return cDatetimeDateTimeKeyword_5_0; }

		//binary
		public EnumLiteralDeclaration getBinaryEnumLiteralDeclaration_6() { return cBinaryEnumLiteralDeclaration_6; }

		//"binary"
		public Keyword getBinaryBinaryKeyword_6_0() { return cBinaryBinaryKeyword_6_0; }

		//boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_7() { return cBooleanEnumLiteralDeclaration_7; }

		//"boolean"
		public Keyword getBooleanBooleanKeyword_7_0() { return cBooleanBooleanKeyword_7_0; }
	}

	public class MULTIPLICITYElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "MULTIPLICITY");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cOPTIONALEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cOPTIONALQuestionMarkKeyword_0_0 = (Keyword)cOPTIONALEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPLUSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPLUSPlusSignKeyword_1_0 = (Keyword)cPLUSEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSTAREnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSTARAsteriskKeyword_2_0 = (Keyword)cSTAREnumLiteralDeclaration_2.eContents().get(0);
		
		//enum MULTIPLICITY:
		//	OPTIONAL="?" | PLUS="+" | STAR="*";
		public EnumRule getRule() { return rule; }

		//OPTIONAL="?" | PLUS="+" | STAR="*"
		public Alternatives getAlternatives() { return cAlternatives; }

		//OPTIONAL="?"
		public EnumLiteralDeclaration getOPTIONALEnumLiteralDeclaration_0() { return cOPTIONALEnumLiteralDeclaration_0; }

		//"?"
		public Keyword getOPTIONALQuestionMarkKeyword_0_0() { return cOPTIONALQuestionMarkKeyword_0_0; }

		//PLUS="+"
		public EnumLiteralDeclaration getPLUSEnumLiteralDeclaration_1() { return cPLUSEnumLiteralDeclaration_1; }

		//"+"
		public Keyword getPLUSPlusSignKeyword_1_0() { return cPLUSPlusSignKeyword_1_0; }

		//STAR="*"
		public EnumLiteralDeclaration getSTAREnumLiteralDeclaration_2() { return cSTAREnumLiteralDeclaration_2; }

		//"*"
		public Keyword getSTARAsteriskKeyword_2_0() { return cSTARAsteriskKeyword_2_0; }
	}
	
	private SDLElements pSDL;
	private ServiceElements pService;
	private OperationElements pOperation;
	private NodeElements pNode;
	private DataElementElements pDataElement;
	private ComplexElementElements pComplexElement;
	private SimpleElementElements pSimpleElement;
	private DATATYPEElements unknownRuleDATATYPE;
	private MULTIPLICITYElements unknownRuleMULTIPLICITY;
	private FQNElements pFQN;
	private FqnWildcardElements pFqnWildcard;
	private ImportElements pImport;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SDLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.univie.cs.swa.soa.SDL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SDL:
	//	{SDL} "module" name=FQN imports+=Import* (services+=Service | data+=DataElement | nodes+=Node)*;
	public SDLElements getSDLAccess() {
		return (pSDL != null) ? pSDL : (pSDL = new SDLElements());
	}
	
	public ParserRule getSDLRule() {
		return getSDLAccess().getRule();
	}

	//Service:
	//	{Service} "Service" name=ID "{" ("operation" operations+=Operation)* "}";
	public ServiceElements getServiceAccess() {
		return (pService != null) ? pService : (pService = new ServiceElements());
	}
	
	public ParserRule getServiceRule() {
		return getServiceAccess().getRule();
	}

	//Operation:
	//	{Operation} name=ID "{" ("input" inputName=STRING ":" inputType=[DataElement|FQN])? ("output" outputName=STRING ":"
	//	outputType=[DataElement|FQN])? "}";
	public OperationElements getOperationAccess() {
		return (pOperation != null) ? pOperation : (pOperation = new OperationElements());
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//Node:
	//	{Node} "Node" name=ID "uri" "=" baseURI=STRING "hosts" "{" services+=[Service|FQN] ("," services+=[Service|FQN])* "}";
	public NodeElements getNodeAccess() {
		return (pNode != null) ? pNode : (pNode = new NodeElements());
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//DataElement:
	//	SimpleElement | ComplexElement;
	public DataElementElements getDataElementAccess() {
		return (pDataElement != null) ? pDataElement : (pDataElement = new DataElementElements());
	}
	
	public ParserRule getDataElementRule() {
		return getDataElementAccess().getRule();
	}

	//ComplexElement:
	//	{ComplexElement} "complex-data" name=ID "{" elements+=SimpleElement* "}";
	public ComplexElementElements getComplexElementAccess() {
		return (pComplexElement != null) ? pComplexElement : (pComplexElement = new ComplexElementElements());
	}
	
	public ParserRule getComplexElementRule() {
		return getComplexElementAccess().getRule();
	}

	//SimpleElement:
	//	{SimpleElement} name=ID ":" (type=DATATYPE | ref=[ComplexElement|FQN]) multiplicity=MULTIPLICITY?;
	public SimpleElementElements getSimpleElementAccess() {
		return (pSimpleElement != null) ? pSimpleElement : (pSimpleElement = new SimpleElementElements());
	}
	
	public ParserRule getSimpleElementRule() {
		return getSimpleElementAccess().getRule();
	}

	//enum DATATYPE:
	//	string | integer | float | date | time | datetime="dateTime" | binary | boolean;
	public DATATYPEElements getDATATYPEAccess() {
		return (unknownRuleDATATYPE != null) ? unknownRuleDATATYPE : (unknownRuleDATATYPE = new DATATYPEElements());
	}
	
	public EnumRule getDATATYPERule() {
		return getDATATYPEAccess().getRule();
	}

	//enum MULTIPLICITY:
	//	OPTIONAL="?" | PLUS="+" | STAR="*";
	public MULTIPLICITYElements getMULTIPLICITYAccess() {
		return (unknownRuleMULTIPLICITY != null) ? unknownRuleMULTIPLICITY : (unknownRuleMULTIPLICITY = new MULTIPLICITYElements());
	}
	
	public EnumRule getMULTIPLICITYRule() {
		return getMULTIPLICITYAccess().getRule();
	}

	//FQN:
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//FqnWildcard:
	//	FQN ".*"?;
	public FqnWildcardElements getFqnWildcardAccess() {
		return (pFqnWildcard != null) ? pFqnWildcard : (pFqnWildcard = new FqnWildcardElements());
	}
	
	public ParserRule getFqnWildcardRule() {
		return getFqnWildcardAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=FqnWildcard;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
