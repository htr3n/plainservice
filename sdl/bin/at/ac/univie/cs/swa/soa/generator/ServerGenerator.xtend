package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.Node
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.sdl.SDL

class ServerGenerator {
	
	def generateServer(IFileSystemAccess fsa, SDL dsl){
		var packagePath = dsl.name.toLowerCase.replace(".", java::io::File::separator)
		var nodes = dsl.nodes
		if (nodes != null && !nodes.empty){
			for (node : nodes){
				if (node.name != null && !node.name.empty){
					var hostName = node.name.replace('^', '')  
					var file = packagePath + File::separator + hostName.toFirstUpper + "Server.java"
					fsa.generateFile(file, generate(dsl, node))
				}
			}			
		}
	}
	
	def protected generate(SDL dsl, Node node){			
		var packageName = dsl.name.toLowerCase
		var className = node.name.replace('^', '').toFirstUpper + "Server"
		var address = node.baseURI
		if (address != null && !address.empty){
			var endingSlash = address.substring(address.length - 1)
			if (endingSlash != "/")
				address = address + "/"; 
		}
		'''
package «packageName»;

import javax.xml.ws.Endpoint;

public class «className»{

    public static void main(String args[]) throws java.lang.Exception {
        System.out.println("Starting Server");
    	String address = "«address»";
    	«FOR s : node.services» 
    	Object «s.name.toFirstLower»Impl = new «s.name»Impl();
    	Endpoint.publish(address + "«s.name»", «s.name.toFirstLower»Impl);
		«ENDFOR»        
        System.out.println("Server ready..."); 
    }
}
'''
	}
}