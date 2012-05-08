package at.ac.univie.cs.swa.data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"name"
})
@XmlRootElement(name = "SimpleRequest")
public class SimpleRequest {
		
	@XmlElement
	protected String name;

	public String getName(){
		return name;
	};
	public void setName(String name){
		this.name = name;
	};
    
}
