
package at.ac.univie.cs.swa.hello;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "Greeting", 
                  targetNamespace = "urn:at:ac:univie:cs:swa:hello") 
public class GreetingService extends Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("http://localhost:9999/Greeting?wsdl");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static QName SERVICE = new QName("urn:at:ac:univie:cs:swa:hello", "Greeting");
    public final static QName greetingPort = new QName("urn:at:ac:univie:cs:swa:hello", "GreetingPort");

    public GreetingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GreetingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GreetingService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @WebEndpoint(name = "GreetingPort")
    public Greeting getGreeting() {
        return super.getPort(greetingPort, Greeting.class);
    }

    @WebEndpoint(name = "GreetingPort")
    public Greeting getGreetingPort(WebServiceFeature... features) {
        return super.getPort(greetingPort, Greeting.class, features);
    }
}
