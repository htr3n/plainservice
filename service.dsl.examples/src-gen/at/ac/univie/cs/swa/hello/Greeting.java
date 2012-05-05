package at.ac.univie.cs.swa.hello;


@javax.jws.WebService(targetNamespace = "urn:at:ac:univie:cs:swa:hello", name = "Greeting")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
public interface Greeting {

	
	@javax.jws.WebResult(name = "ComplexMixedSubType", targetNamespace = "urn:at:ac:univie:cs:swa:data",partName = "output")
	@javax.jws.WebMethod(operationName="createGreating")
	public at.ac.univie.cs.swa.data.ComplexMixedSubType createGreating(
	@javax.jws.WebParam(partName = "input",name = "SimpleRequest", targetNamespace = "urn:at:ac:univie:cs:swa:data")
	at.ac.univie.cs.swa.data.SimpleRequest input);
	
	@javax.jws.Oneway
	@javax.jws.WebMethod(operationName="doOtherThing")
	public void doOtherThing(
	@javax.jws.WebParam(partName = "request",name = "AllType", targetNamespace = "urn:at:ac:univie:cs:swa:data")
	at.ac.univie.cs.swa.data.AllType request);
}
