
package at.ac.univie.cs.swa.hello;

import java.net.URL;

@javax.xml.ws.WebServiceClient(name = "HelloWorld", 
                  targetNamespace = "urn:at:ac:univie:cs:swa:hello") 
public class HelloWorldService extends javax.xml.ws.Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("http://localhost:9999/HelloWorld?wsdl");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static javax.xml.namespace.QName SERVICE = new javax.xml.namespace.QName("urn:at:ac:univie:cs:swa:hello", "HelloWorld");
    public final static javax.xml.namespace.QName helloWorldPort = new javax.xml.namespace.QName("urn:at:ac:univie:cs:swa:hello", "HelloWorldPort");

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldService(URL wsdlLocation, javax.xml.namespace.QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @javax.xml.ws.WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorld() {
        return super.getPort(helloWorldPort, HelloWorld.class);
    }

    @javax.xml.ws.WebEndpoint(name = "HelloWorldPort")
    public HelloWorld getHelloWorldPort(javax.xml.ws.WebServiceFeature... features) {
        return super.getPort(helloWorldPort, HelloWorld.class, features);
    }
}
