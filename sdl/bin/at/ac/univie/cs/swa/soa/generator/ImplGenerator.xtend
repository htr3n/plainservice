package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.Operation
import at.ac.univie.cs.swa.soa.sdl.Service
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.sdl.SDL

class ImplGenerator {
	
	def generateImpl(IFileSystemAccess fsa, SDL dsl){
		val packagePath = dsl.name.toLowerCase.replace(".", File::separator)
		val webServices = dsl.services.filter(typeof(Service))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				val file = packagePath + File::separator + s.name + "Impl.java"
				fsa.generateFile(file, s.generate(dsl))
			}			
		}
	}
	
	def protected generate(Service s, SDL dsl){			
		val packageName = dsl.name.toLowerCase
		val className = s.name + "Impl" 
		val nsURI = "urn:" + packageName.replace('.', ':')
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
		val hasInput = o.inputType != null && o.inputType.name != null && !o.inputType.name.empty	
		val hasOutput = o.outputType != null && o.outputType.name != null && !o.outputType.name.empty	
		val inputQualifiedPath = if (o.inputType != null) (o.inputType.eContainer as SDL).name else null
		val outputQualifiedPath = if (o.outputType != null) (o.outputType.eContainer as SDL).name else null
	'''
	@Override
	public «IF hasOutput»«outputQualifiedPath».«o.outputType.name»«ELSE»void«ENDIF» «o.name»(«IF hasInput»«inputQualifiedPath».«o.inputType.name»«ENDIF» «o.inputName») {
		//TODO: insert the actual behavior of this operartion
       «IF hasOutput»return new «outputQualifiedPath».«o.outputType.name»();«ENDIF»
	}
	'''			
	}
}