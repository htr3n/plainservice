package at.ac.univie.cs.swa.hello;


@javax.jws.WebService(targetNamespace = "urn:at:ac:univie:cs:swa:hello", name = "HelloWorld")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
public interface HelloWorld {

	
	@javax.jws.WebResult(name = "SimpleResponse", targetNamespace = "urn:at:ac:univie:cs:swa:data",partName = "output")
	@javax.jws.WebMethod(operationName="sayHello")
	public at.ac.univie.cs.swa.data.SimpleResponse sayHello(
	@javax.jws.WebParam(partName = "input",name = "SimpleRequest", targetNamespace = "urn:at:ac:univie:cs:swa:data")
	at.ac.univie.cs.swa.data.SimpleRequest input);
}
