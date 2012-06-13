package at.ac.univie.cs.swa.soa.generator

import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.sdl.SDL
import at.ac.univie.cs.swa.soa.sdl.Operation
import at.ac.univie.cs.swa.soa.sdl.DataElement
import at.ac.univie.cs.swa.soa.sdl.Service

class ClientGenerator {
	
	def generateClient(IFileSystemAccess fsa, SDL dsl){
		val packagePath = dsl.name.toLowerCase.replace(".", java::io::File::separator)
		val webServices = dsl.services.filter(typeof(Service))
		 
		if (webServices != null && !webServices.empty){
			for (s : webServices){
				val file = packagePath + File::separator + s.name +"Client.java"
				fsa.generateFile(file, generate(dsl, s))
			}			
		}
	}
	
	def protected generate(SDL dsl, Service s){			
		val packageName = dsl.name.toLowerCase
		val className = s.name + "Client" 
		val serviceQualifiedPath = if (s != null) (s.eContainer as SDL).name else null
		'''
		package «packageName»;

import «serviceQualifiedPath».«s.name»;

public final class «className» {

		public static void main(String args[]) throws java.lang.Exception {

		«s.name»Service ss = new «s.name»Service();
		«s.name» port = ss.get«s.name»();  

		«FOR operation : s.operations»
		System.out.println("Invoking «operation.name»...");
		«operation.generateOperationInvocation»
		«ENDFOR»		
    }
}
		'''
	}
	
	def protected generateOperationInvocation(Operation operation){
		val hasInput = operation.inputType != null && operation.inputType.name != null && !operation.inputType.name.empty	
		val hasOutput = operation.outputType != null && operation.outputType.name != null && !operation.outputType.name.empty
		val inputQualifiedPath = if (operation.inputType != null) (operation.inputType.eContainer as SDL).name else null
		val outputQualifiedPath = if (operation.outputType != null) (operation.outputType.eContainer as SDL).name else null

		'''
		«IF hasInput»
		«inputQualifiedPath».«operation.inputType.name» «operation.inputName» = new «inputQualifiedPath».«operation.inputType.name»();
		«operation.inputType.generateValues»
		«ENDIF»
		«IF hasOutput»		
		«outputQualifiedPath».«operation.outputType.name» «operation.outputName» = port.«operation.name»(«IF hasInput»«operation.inputName»«ENDIF»);
		System.out.println("«operation.name».result=" + «operation.outputName»);
		«ELSE»
		port.«operation.name»(«IF hasInput»«operation.inputName»«ENDIF»);
		«ENDIF»
		'''		
	}
	
	def protected generateValues(DataElement e){
		'''
		'''
	}
}