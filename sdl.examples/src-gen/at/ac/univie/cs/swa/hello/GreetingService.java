
package at.ac.univie.cs.swa.hello;

import java.net.URL;

@javax.xml.ws.WebServiceClient(name = "Greeting", 
                  targetNamespace = "urn:at:ac:univie:cs:swa:hello") 
public class GreetingService extends javax.xml.ws.Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("http://localhost:9999/Greeting?wsdl");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static javax.xml.namespace.QName SERVICE = new javax.xml.namespace.QName("urn:at:ac:univie:cs:swa:hello", "Greeting");
    public final static javax.xml.namespace.QName greetingPort = new javax.xml.namespace.QName("urn:at:ac:univie:cs:swa:hello", "GreetingPort");

    public GreetingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GreetingService(URL wsdlLocation, javax.xml.namespace.QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GreetingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @javax.xml.ws.WebEndpoint(name = "GreetingPort")
    public Greeting getGreeting() {
        return super.getPort(greetingPort, Greeting.class);
    }

    @javax.xml.ws.WebEndpoint(name = "GreetingPort")
    public Greeting getGreetingPort(javax.xml.ws.WebServiceFeature... features) {
        return super.getPort(greetingPort, Greeting.class, features);
    }
}
