package at.ac.univie.cs.swa.soa.serializer;

import at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement;
import at.ac.univie.cs.swa.soa.serviceDsl.Import;
import at.ac.univie.cs.swa.soa.serviceDsl.Node;
import at.ac.univie.cs.swa.soa.serviceDsl.Operation;
import at.ac.univie.cs.swa.soa.serviceDsl.RESTService;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDslPackage;
import at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement;
import at.ac.univie.cs.swa.soa.serviceDsl.WebService;
import at.ac.univie.cs.swa.soa.services.ServiceDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractServiceDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ServiceDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ServiceDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ServiceDslPackage.COMPLEX_ELEMENT:
				if(context == grammarAccess.getComplexElementRule() ||
				   context == grammarAccess.getDataElementRule()) {
					sequence_ComplexElement(context, (ComplexElement) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.REST_SERVICE:
				if(context == grammarAccess.getRESTServiceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_RESTService(context, (RESTService) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.SERVICE_DSL:
				if(context == grammarAccess.getServiceDSLRule()) {
					sequence_ServiceDSL(context, (ServiceDSL) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.SIMPLE_ELEMENT:
				if(context == grammarAccess.getDataElementRule() ||
				   context == grammarAccess.getSimpleElementRule()) {
					sequence_SimpleElement(context, (SimpleElement) semanticObject); 
					return; 
				}
				else break;
			case ServiceDslPackage.WEB_SERVICE:
				if(context == grammarAccess.getServiceRule() ||
				   context == grammarAccess.getWebServiceRule()) {
					sequence_WebService(context, (WebService) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID elements+=SimpleElement*)
	 */
	protected void sequence_ComplexElement(EObject context, ComplexElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FqnWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServiceDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceFqnWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID baseURI=STRING services+=[Service|FQN] services+=[Service|FQN]*)
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (inputName=STRING inputType=[DataElement|FQN])? (outputName=STRING outputType=[DataElement|FQN])?)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_RESTService(EObject context, RESTService semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ServiceDslPackage.Literals.SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ServiceDslPackage.Literals.SERVICE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRESTServiceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN imports+=Import* (services+=Service | data+=DataElement | nodes+=Node)*)
	 */
	protected void sequence_ServiceDSL(EObject context, ServiceDSL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=DATATYPE | ref=[ComplexElement|FQN]) multiplicity='?'?)
	 */
	protected void sequence_SimpleElement(EObject context, SimpleElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID operations+=Operation*)
	 */
	protected void sequence_WebService(EObject context, WebService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
