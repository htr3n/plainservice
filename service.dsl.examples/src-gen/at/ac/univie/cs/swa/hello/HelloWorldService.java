
package at.ac.univie.cs.swa.hello;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "HelloWorld", 
                  targetNamespace = "urn:at:ac:univie:cs:swa:hello") 
public class HelloWorldService extends Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("http://localhost:9999/HelloWorld?wsdl");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static QName SERVICE = new QName("urn:at:ac:univie:cs:swa:hello", "HelloWorld");
    public final static QName helloWorldPort = new QName("urn:at:ac:univie:cs:swa:hello", "HelloWorldPort");

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorld() {
        return super.getPort(helloWorldPort, HelloWorld.class);
    }

    @WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort(WebServiceFeature... features) {
        return super.getPort(helloWorldPort, HelloWorld.class, features);
    }
}
