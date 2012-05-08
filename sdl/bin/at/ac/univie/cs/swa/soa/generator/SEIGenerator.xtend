package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.Operation
import at.ac.univie.cs.swa.soa.sdl.SDL
import at.ac.univie.cs.swa.soa.sdl.Service
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess

class SEIGenerator {
	
	def generateSEI(IFileSystemAccess fsa, SDL dsl){
		var packagePath = dsl.name.toLowerCase.replace(".", File::separator)
		var webServices = dsl.services.filter(typeof(Service))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				var file = packagePath + File::separator + s.name + ".java"
				fsa.generateFile(file, generate(s, dsl))
			}			
		}
	}
	
	def protected generate(Service s, SDL dsl){			
		var packageName = dsl.name.toLowerCase 
		var nsURI = "urn:" + packageName.replace('.', ':')
		'''
package «packageName»;


@javax.jws.WebService(targetNamespace = "«nsURI»", name = "«s.name»")
@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)
public interface «s.name» {

	«FOR operation : s.operations»
		«generateOperation(operation, dsl)»
	«ENDFOR»
}
'''
	}

	def protected generateOperation(Operation operation, SDL dsl){
		var hasInput = operation.inputType != null && operation.inputType.name != null && !operation.inputType.name.empty	
		var hasOutput = operation.outputType != null && operation.outputType.name != null && !operation.outputType.name.empty
		var inputQualifiedPath = if (operation.inputType != null) (operation.inputType.eContainer as SDL).name else null
		var outputQualifiedPath = if (operation.outputType != null) (operation.outputType.eContainer as SDL).name else null
		var inputNsURI = if (inputQualifiedPath != null) "urn:" + inputQualifiedPath.replace('.', ':') else null 
		var outputNsURI = if (outputQualifiedPath != null) "urn:" + outputQualifiedPath.replace('.', ':') else null 
		'''

		«IF hasOutput»
		@javax.jws.WebResult(name = "«operation.outputType.name»", targetNamespace = "«outputNsURI»",partName = "«operation.outputName»")
		«ELSE»
		@javax.jws.Oneway
		«ENDIF»
		@javax.jws.WebMethod(operationName="«operation.name»")
		public «IF hasOutput»«outputQualifiedPath».«operation.outputType.name»«ELSE»void«ENDIF» «operation.name»(
		@javax.jws.WebParam(partName = "«operation.inputName»",name = "«operation.inputType.name»", targetNamespace = "«inputNsURI»")
		«IF hasInput»«inputQualifiedPath».«operation.inputType.name»«ENDIF» «operation.inputName»);
		'''			
	}

}