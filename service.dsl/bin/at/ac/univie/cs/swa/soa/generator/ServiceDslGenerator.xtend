package at.ac.univie.cs.swa.soa.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL

class ServiceDslGenerator implements IGenerator2 {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var dsl = resource.contents.head as ServiceDSL
		toJavaCode(fsa, dsl)
	}
	
	def toJavaCode(IFileSystemAccess fsa, ServiceDSL dsl) {
		new Data().generateData(fsa, dsl)
		new SEI().generateSEI(fsa, dsl)
		new Impl().generateImpl(fsa, dsl)		
		new Server().generateServer(fsa, dsl)
		new Service().generateService(fsa, dsl)
		new Client().generateClient(fsa, dsl)
	}

	override void doGenerate(ResourceSet rs, IFileSystemAccess fsa) {
	 	for (r : rs.resources){
	 		println("... processing the resource " + r)
			doGenerate(r, fsa)			
		}
	}	
}
