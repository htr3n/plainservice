package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.SDL
import at.ac.univie.cs.swa.soa.sdl.Service
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess

class ServiceGenerator {
	
	def generateService(IFileSystemAccess fsa, SDL dsl){
		var packagePath = dsl.name.toLowerCase.replace(".", File::separator)
		var webServices = dsl.services.filter(typeof(Service))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				var file = packagePath + File::separator + s.name + "Service.java"
				fsa.generateFile(file, generate(dsl, s))
			}			
		}
	}
	def protected generate(SDL dsl, Service s){			
		var packageName = dsl.name.toLowerCase
		var className = s.name + "Service" 
		var nsURI = "urn:" + packageName.replace(".", ":").toLowerCase
		var portName = s.name + "Port"
		'''

package «packageName»;

import java.net.URL;

@javax.xml.ws.WebServiceClient(name = "«s.name»", 
                  targetNamespace = "«nsURI»") 
public class «className» extends javax.xml.ws.Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("«findURL(dsl, s)»");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static javax.xml.namespace.QName SERVICE = new javax.xml.namespace.QName("«nsURI»", "«s.name»");
    public final static javax.xml.namespace.QName «portName.toFirstLower» = new javax.xml.namespace.QName("«nsURI»", "«portName»");

    public «className»(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public «className»(URL wsdlLocation, javax.xml.namespace.QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public «className»() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @javax.xml.ws.WebEndpoint(name = "«portName»")
    public «s.name» get«s.name»() {
        return super.getPort(«portName.toFirstLower», «s.name».class);
    }

    @javax.xml.ws.WebEndpoint(name = "«portName»")
    public «s.name» get«portName»(javax.xml.ws.WebServiceFeature... features) {
        return super.getPort(«portName.toFirstLower», «s.name».class, features);
    }
}
'''
	}
	
	def protected String findURL(SDL dsl, Service s){
		if (dsl.nodes != null && !dsl.nodes.empty){
			for (node : dsl.nodes){
				if (node.services != null && node.services.contains(s)){
					var url = node.baseURI
					if (url != null && !url.empty){
						var endingSlash = url.substring(url.length - 1)
						if (endingSlash != "/")
							url = url + "/"; 
						return url + s.name + "?wsdl";	
					}										
				}
			}			
		}
	}
}
