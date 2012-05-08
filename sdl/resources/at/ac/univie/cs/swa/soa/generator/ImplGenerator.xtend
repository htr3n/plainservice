package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.Operation
import at.ac.univie.cs.swa.soa.sdl.Service
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.sdl.SDL

class ImplGenerator {
	
	def generateImpl(IFileSystemAccess fsa, SDL dsl){
		var packagePath = dsl.name.toLowerCase.replace(".", File::separator)
		var webServices = dsl.services.filter(typeof(Service))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				var file = packagePath + File::separator + s.name + "Impl.java"
				fsa.generateFile(file, s.generate(dsl))
			}			
		}
	}
	
	def protected generate(Service s, SDL dsl){			
		var packageName = dsl.name.toLowerCase
		var className = s.name + "Impl" 
		var nsURI = "urn:" + packageName.replace('.', ':')
		'''
package «packageName»;

@javax.jws.WebService
«IF s.name != null && !s.name.empty» 
					(serviceName = "«s.name»",
					endpointInterface = "«packageName».«s.name»",
					portName = "«s.name»Port",
					targetNamespace = "«nsURI»")
«ENDIF»
public class «className» implements «s.name» {

	«FOR operation : s.operations»
		«operation.generateOperation»
	«ENDFOR»
    
}
'''
	}
	
	def protected generateOperation(Operation o){
		var hasInput = o.inputType != null && o.inputType.name != null && !o.inputType.name.empty	
		var hasOutput = o.outputType != null && o.outputType.name != null && !o.outputType.name.empty	
		var inputQualifiedPath = if (o.inputType != null) (o.inputType.eContainer as SDL).name else null
		var outputQualifiedPath = if (o.outputType != null) (o.outputType.eContainer as SDL).name else null
	'''
	@Override
	public «IF hasOutput»«outputQualifiedPath».«o.outputType.name»«ELSE»void«ENDIF» «o.name»(«IF hasInput»«inputQualifiedPath».«o.inputType.name»«ENDIF» «o.inputName») {
		//TODO: insert the actual behavior of this operartion
       «IF hasOutput»return new «outputQualifiedPath».«o.outputType.name»();«ENDIF»
	}
	'''			
	}
}