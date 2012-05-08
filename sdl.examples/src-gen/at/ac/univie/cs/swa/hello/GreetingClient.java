		package at.ac.univie.cs.swa.hello;

import at.ac.univie.cs.swa.hello.Greeting;

public final class GreetingClient {

		public static void main(String args[]) throws java.lang.Exception {

		GreetingService ss = new GreetingService();
		Greeting port = ss.getGreeting();  

		System.out.println("Invoking createGreating...");
		at.ac.univie.cs.swa.data.SimpleRequest input = new at.ac.univie.cs.swa.data.SimpleRequest();
		at.ac.univie.cs.swa.data.ComplexMixedSubType output = port.createGreating(input);
		System.out.println("createGreating.result=" + output);
		System.out.println("Invoking doOtherThing...");
		at.ac.univie.cs.swa.data.AllType request = new at.ac.univie.cs.swa.data.AllType();
		port.doOtherThing(request);
    }
}
