package at.ac.univie.cs.swa.hello;

@javax.jws.WebService
(serviceName = "Greeting",
endpointInterface = "at.ac.univie.cs.swa.hello.Greeting",
portName = "GreetingPort",
targetNamespace = "urn:at:ac:univie:cs:swa:hello")
public class GreetingImpl implements Greeting {

	@Override
	public at.ac.univie.cs.swa.data.ComplexMixedSubType createGreating(at.ac.univie.cs.swa.data.SimpleRequest input) {
		//TODO: insert the actual behavior of this operartion
	       return new at.ac.univie.cs.swa.data.ComplexMixedSubType();
	}
	@Override
	public void doOtherThing(at.ac.univie.cs.swa.data.AllType request) {
		//TODO: insert the actual behavior of this operartion
	}
    
}
