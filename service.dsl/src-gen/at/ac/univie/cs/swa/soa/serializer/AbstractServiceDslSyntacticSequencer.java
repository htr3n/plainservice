package at.ac.univie.cs.swa.soa.serializer;

import at.ac.univie.cs.swa.soa.services.ServiceDslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractServiceDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ServiceDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SimpleElement___AsteriskKeyword_4_2_or_PlusSignKeyword_4_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ServiceDslGrammarAccess) access;
		match_SimpleElement___AsteriskKeyword_4_2_or_PlusSignKeyword_4_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSimpleElementAccess().getAsteriskKeyword_4_2()), new TokenAlias(false, false, grammarAccess.getSimpleElementAccess().getPlusSignKeyword_4_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SimpleElement___AsteriskKeyword_4_2_or_PlusSignKeyword_4_1__q.equals(syntax))
				emit_SimpleElement___AsteriskKeyword_4_2_or_PlusSignKeyword_4_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('+' | '*')?
	 */
	protected void emit_SimpleElement___AsteriskKeyword_4_2_or_PlusSignKeyword_4_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
