/*
* generated by Xtext
*/
package at.ac.univie.cs.swa.soa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.ac.univie.cs.swa.soa.services.ServiceDslGrammarAccess;

public class ServiceDslParser extends AbstractContentAssistParser {
	
	@Inject
	private ServiceDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal.InternalServiceDslParser createParser() {
		at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal.InternalServiceDslParser result = new at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal.InternalServiceDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getServiceDSLAccess().getAlternatives_4(), "rule__ServiceDSL__Alternatives_4");
					put(grammarAccess.getServiceAccess().getAlternatives(), "rule__Service__Alternatives");
					put(grammarAccess.getDataElementAccess().getAlternatives(), "rule__DataElement__Alternatives");
					put(grammarAccess.getSimpleElementAccess().getAlternatives_3(), "rule__SimpleElement__Alternatives_3");
					put(grammarAccess.getSimpleElementAccess().getAlternatives_4(), "rule__SimpleElement__Alternatives_4");
					put(grammarAccess.getDATATYPEAccess().getAlternatives(), "rule__DATATYPE__Alternatives");
					put(grammarAccess.getServiceDSLAccess().getGroup(), "rule__ServiceDSL__Group__0");
					put(grammarAccess.getWebServiceAccess().getGroup(), "rule__WebService__Group__0");
					put(grammarAccess.getWebServiceAccess().getGroup_4(), "rule__WebService__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getRESTServiceAccess().getGroup(), "rule__RESTService__Group__0");
					put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
					put(grammarAccess.getNodeAccess().getGroup_9(), "rule__Node__Group_9__0");
					put(grammarAccess.getComplexElementAccess().getGroup(), "rule__ComplexElement__Group__0");
					put(grammarAccess.getSimpleElementAccess().getGroup(), "rule__SimpleElement__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFqnWildcardAccess().getGroup(), "rule__FqnWildcard__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getServiceDSLAccess().getNameAssignment_2(), "rule__ServiceDSL__NameAssignment_2");
					put(grammarAccess.getServiceDSLAccess().getImportsAssignment_3(), "rule__ServiceDSL__ImportsAssignment_3");
					put(grammarAccess.getServiceDSLAccess().getServicesAssignment_4_0(), "rule__ServiceDSL__ServicesAssignment_4_0");
					put(grammarAccess.getServiceDSLAccess().getDataAssignment_4_1(), "rule__ServiceDSL__DataAssignment_4_1");
					put(grammarAccess.getServiceDSLAccess().getNodesAssignment_4_2(), "rule__ServiceDSL__NodesAssignment_4_2");
					put(grammarAccess.getWebServiceAccess().getNameAssignment_2(), "rule__WebService__NameAssignment_2");
					put(grammarAccess.getWebServiceAccess().getOperationsAssignment_4_1(), "rule__WebService__OperationsAssignment_4_1");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getInputNameAssignment_3_1(), "rule__Operation__InputNameAssignment_3_1");
					put(grammarAccess.getOperationAccess().getInputTypeAssignment_3_3(), "rule__Operation__InputTypeAssignment_3_3");
					put(grammarAccess.getOperationAccess().getOutputNameAssignment_4_1(), "rule__Operation__OutputNameAssignment_4_1");
					put(grammarAccess.getOperationAccess().getOutputTypeAssignment_4_3(), "rule__Operation__OutputTypeAssignment_4_3");
					put(grammarAccess.getRESTServiceAccess().getNameAssignment_2(), "rule__RESTService__NameAssignment_2");
					put(grammarAccess.getNodeAccess().getNameAssignment_2(), "rule__Node__NameAssignment_2");
					put(grammarAccess.getNodeAccess().getBaseURIAssignment_5(), "rule__Node__BaseURIAssignment_5");
					put(grammarAccess.getNodeAccess().getServicesAssignment_8(), "rule__Node__ServicesAssignment_8");
					put(grammarAccess.getNodeAccess().getServicesAssignment_9_1(), "rule__Node__ServicesAssignment_9_1");
					put(grammarAccess.getComplexElementAccess().getNameAssignment_2(), "rule__ComplexElement__NameAssignment_2");
					put(grammarAccess.getComplexElementAccess().getElementsAssignment_4(), "rule__ComplexElement__ElementsAssignment_4");
					put(grammarAccess.getSimpleElementAccess().getNameAssignment_1(), "rule__SimpleElement__NameAssignment_1");
					put(grammarAccess.getSimpleElementAccess().getTypeAssignment_3_0(), "rule__SimpleElement__TypeAssignment_3_0");
					put(grammarAccess.getSimpleElementAccess().getRefAssignment_3_1(), "rule__SimpleElement__RefAssignment_3_1");
					put(grammarAccess.getSimpleElementAccess().getMultiplicityAssignment_4_0(), "rule__SimpleElement__MultiplicityAssignment_4_0");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal.InternalServiceDslParser typedParser = (at.ac.univie.cs.swa.soa.ui.contentassist.antlr.internal.InternalServiceDslParser) parser;
			typedParser.entryRuleServiceDSL();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ServiceDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ServiceDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
