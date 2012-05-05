package at.ac.univie.cs.swa.hello;

@javax.jws.WebService
(serviceName = "HelloWorld",
endpointInterface = "at.ac.univie.cs.swa.hello.HelloWorld",
portName = "HelloWorldPort",
targetNamespace = "urn:at:ac:univie:cs:swa:hello")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public at.ac.univie.cs.swa.data.SimpleResponse sayHello(at.ac.univie.cs.swa.data.SimpleRequest input) {
		//TODO: insert the actual behavior of this operartion
	       return new at.ac.univie.cs.swa.data.SimpleResponse();
	}
    
}
