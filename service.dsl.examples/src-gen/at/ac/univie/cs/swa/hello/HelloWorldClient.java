		package at.ac.univie.cs.swa.hello;

import at.ac.univie.cs.swa.hello.HelloWorld;

public final class HelloWorldClient {

		public static void main(String args[]) throws java.lang.Exception {

		HelloWorldService ss = new HelloWorldService();
		HelloWorld port = ss.getHelloWorld();  

		System.out.println("Invoking sayHello...");
		at.ac.univie.cs.swa.data.SimpleRequest input = new at.ac.univie.cs.swa.data.SimpleRequest();
		at.ac.univie.cs.swa.data.SimpleResponse output = port.sayHello(input);
		System.out.println("sayHello.result=" + output);
    }
}
