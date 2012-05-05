package at.ac.univie.cs.swa.soa.generator

import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL
import at.ac.univie.cs.swa.soa.serviceDsl.WebService

class Service {
	
	def generateService(IFileSystemAccess fsa, ServiceDSL dsl){
		var packagePath = dsl.name.toLowerCase.replace(".", File::separator)
		var webServices = dsl.services.filter(typeof(WebService))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				var file = packagePath + File::separator + s.name + "Service.java"
				fsa.generateFile(file, generate(dsl, s))
			}			
		}
	}
	def protected generate(ServiceDSL dsl, WebService s){			
		var packageName = dsl.name.toLowerCase
		var className = s.name + "Service" 
		var nsURI = "urn:" + packageName.replace(".", ":").toLowerCase
		var portName = s.name + "Port"
		'''

package «packageName»;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "«s.name»", 
                  targetNamespace = "«nsURI»") 
public class «className» extends Service {

    public static URL WSDL_LOCATION = null;

    static {
    	try {
			WSDL_LOCATION = new URL("«findURL(dsl, s)»");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
    }

    public final static QName SERVICE = new QName("«nsURI»", "«s.name»");
    public final static QName «portName.toFirstLower» = new QName("«nsURI»", "«portName»");

    public «className»(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public «className»(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public «className»() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @WebEndpoint(name = "«portName»")
    public «s.name» get«s.name»() {
        return super.getPort(«portName.toFirstLower», «s.name».class);
    }

    @WebEndpoint(name = "«portName»")
    public «s.name» get«portName»(WebServiceFeature... features) {
        return super.getPort(«portName.toFirstLower», «s.name».class, features);
    }
}
'''
	}
	
	def protected String findURL(ServiceDSL dsl, WebService s){
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
