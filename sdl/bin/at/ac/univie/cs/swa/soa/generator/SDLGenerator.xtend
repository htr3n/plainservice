/*
 * generated by Xtext
 */
package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.SDL
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess

class SDLGenerator implements IGenerator2 {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		if (resource.contents.head instanceof SDL){
			val dsl = resource.contents.head as SDL
			toJavaCode(fsa, dsl)
		}
	}
	
	def toJavaCode(IFileSystemAccess fsa, SDL dsl) {
		new DataGenerator().generateData(fsa, dsl)
		new SEIGenerator().generateSEI(fsa, dsl)
		new ImplGenerator().generateImpl(fsa, dsl)		
		new ServerGenerator().generateServer(fsa, dsl)
		new ServiceGenerator().generateService(fsa, dsl)
		new ClientGenerator().generateClient(fsa, dsl)
	}

	override void doGenerate(ResourceSet rs, IFileSystemAccess fsa) {
	 	for (r : rs.resources){
	 		println("... processing the resource " + r)
			doGenerate(r, fsa)			
		}
	}	
}
