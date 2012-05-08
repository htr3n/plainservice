package at.ac.univie.cs.swa.soa.generator

import at.ac.univie.cs.swa.soa.sdl.SDL
import java.io.File
import org.eclipse.xtext.generator.IFileSystemAccess
import at.ac.univie.cs.swa.soa.sdl.ComplexElement
import at.ac.univie.cs.swa.soa.sdl.SimpleElement
import at.ac.univie.cs.swa.soa.sdl.DATATYPE
import at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY

class DataGenerator {
	
	def generateData(IFileSystemAccess fsa, SDL dsl){
		if (dsl.data != null && !dsl.data.empty){
			var packagePath = dsl.name.toLowerCase.replace(".", java::io::File::separator)
			var complexTypes = dsl.data.filter(typeof(ComplexElement))
			if (complexTypes != null && !complexTypes.empty){
				for (t : complexTypes){
					var file = packagePath + File::separator + t.name + ".java"
					fsa.generateFile(file, t.generateElement(dsl))					
				}			
			}
			fsa.generateFile(packagePath + java::io::File::separator +  "ObjectFactory.java", generateObjectFactory(dsl, complexTypes))
			fsa.generateFile(packagePath + java::io::File::separator +  "package-info.java", generatePackageInfo(dsl))
		}
	}
	
	def protected generateObjectFactory(SDL dsl, Iterable<ComplexElement> complexTypes){
		var packageName = dsl.name.toLowerCase
		'''
package «packageName»;

@javax.xml.bind.annotation.XmlRegistry
public class ObjectFactory
{

	public ObjectFactory()
	{
	}
	«FOR t : complexTypes»
	public «t.name» create«t.name»()
	{
		return new «t.name»();
	}
	«ENDFOR»
}
		'''	
	}
	
	
	def protected generatePackageInfo(SDL dsl){
		var nsURI = "urn:" + dsl.name.toLowerCase.replace(".", ":")
		var packageName = dsl.name.toLowerCase
		'''
@javax.xml.bind.annotation.XmlSchema(namespace = "«nsURI»", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)
package «packageName»;
		'''
	}
		
	def protected dispatch generateElement(ComplexElement e, SDL dsl){			
		var packageName = dsl.name.toLowerCase
		var className = e.name  
		'''
package «packageName»;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	«FOR se : e.elements SEPARATOR ","»
	"«se.name»"
    «ENDFOR»
})
@XmlRootElement(name = "«e.name»")
public class «className» {
		
	«FOR se : e.elements»
	@XmlElement«IF isRequired(se)»(required=true)«ENDIF»
	«IF se.type == DATATYPE::DATE || se.type == DATATYPE::TIME || se.type == DATATYPE::DATETIME»
	@XmlSchemaType(name = "«se.type»")
	«ENDIF»
	protected «se.convertType» «se.name»;
    «ENDFOR»

	«FOR se : e.elements»
	public «se.convertType» get«se.name.toFirstUpper»(){
		return «se.name»;
	};
	public void set«se.name.toFirstUpper»(«se.convertType» «se.name»){
		this.«se.name» = «se.name»;
	};
    «ENDFOR»
    
}
'''
	}
	def protected dispatch generateElement(SimpleElement e, SDL dsl){			
	
	}
	
	def protected boolean isRequired(SimpleElement e){
		return e.multiplicity == null || e.multiplicity == MULTIPLICITY::PLUS;
	}
	
	def protected String convertType(SimpleElement e){
		var boolean isMany = (e.multiplicity == MULTIPLICITY::PLUS  || e.multiplicity == MULTIPLICITY::STAR) 
		if (e.ref != null){
			var outputQualifiedPath = (e.ref.eContainer as SDL).name
			var result = outputQualifiedPath + "." + e.ref.name 
			if (isMany)
				return "java.util.List<" + result + ">"
			else 
				return result
		} else if (e.type != null) {
			var result = e.type.toJavaType 
			if (isMany)
				return "java.util.List<" + result + ">"
			else 
				return result
		}
		else {
			return null
		}
	}
	
	def protected String toJavaType(DATATYPE type){
		switch type {
			case DATATYPE::BINARY: return "byte[]"
			case DATATYPE::BOOLEAN: return "boolean"
			case DATATYPE::DATE: return "javax.xml.datatype.XMLGregorianCalendar"
			case DATATYPE::DATETIME: return "javax.xml.datatype.XMLGregorianCalendar"
			case DATATYPE::TIME: return "javax.xml.datatype.XMLGregorianCalendar"
			case DATATYPE::FLOAT: return "float"
			case DATATYPE::INTEGER: return "int"
			case DATATYPE::STRING: return "String"
		}
		return "Object";
	}	
}