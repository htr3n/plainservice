package at.ac.univie.cs.swa.hello;

import javax.xml.ws.Endpoint;

public class TestServer{

    public static void main(String args[]) throws java.lang.Exception {
        System.out.println("Starting Server");
    	String address = "http://localhost:9999/";
    	Object helloWorldImpl = new HelloWorldImpl();
    	Endpoint.publish(address + "HelloWorld", helloWorldImpl);
    	Object greetingImpl = new GreetingImpl();
    	Endpoint.publish(address + "Greeting", greetingImpl);
        System.out.println("Server ready..."); 
    }
}
