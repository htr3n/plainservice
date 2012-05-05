package at.ac.univie.cs.swa.data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"e0",
	"e1",
	"e2",
	"e3"
})
@XmlRootElement(name = "ComplexMixedSubType")
public class ComplexMixedSubType {
		
	@XmlElement
	protected String e0;
	@XmlElement
	protected String e1;
	@XmlElement
	protected at.ac.univie.cs.swa.data.SimpleRequest e2;
	@XmlElement
	protected at.ac.univie.cs.swa.data.SimpleResponse e3;

	public String getE0(){
		return e0;
	};
	public void setE0(String e0){
		this.e0 = e0;
	};
	public String getE1(){
		return e1;
	};
	public void setE1(String e1){
		this.e1 = e1;
	};
	public at.ac.univie.cs.swa.data.SimpleRequest getE2(){
		return e2;
	};
	public void setE2(at.ac.univie.cs.swa.data.SimpleRequest e2){
		this.e2 = e2;
	};
	public at.ac.univie.cs.swa.data.SimpleResponse getE3(){
		return e3;
	};
	public void setE3(at.ac.univie.cs.swa.data.SimpleResponse e3){
		this.e3 = e3;
	};
    
}
