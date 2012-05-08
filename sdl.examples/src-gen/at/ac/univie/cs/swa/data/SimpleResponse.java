package at.ac.univie.cs.swa.data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"greeting"
})
@XmlRootElement(name = "SimpleResponse")
public class SimpleResponse {
		
	@XmlElement
	protected String greeting;

	public String getGreeting(){
		return greeting;
	};
	public void setGreeting(String greeting){
		this.greeting = greeting;
	};
    
}
