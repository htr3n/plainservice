package at.ac.univie.cs.swa.data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"e0",
	"e1",
	"e2",
	"e3",
	"e4",
	"e5",
	"e6",
	"e7"
})
@XmlRootElement(name = "AllType")
public class AllType {
		
	@XmlElement
	protected byte[] e0;
	@XmlElement
	protected boolean e1;
	@XmlElement
	@XmlSchemaType(name = "date")
	protected java.util.List<javax.xml.datatype.XMLGregorianCalendar> e2;
	@XmlElement(required=true)
	@XmlSchemaType(name = "datetime")
	protected java.util.List<javax.xml.datatype.XMLGregorianCalendar> e3;
	@XmlElement
	protected float e4;
	@XmlElement
	protected int e5;
	@XmlElement
	protected String e6;
	@XmlElement
	@XmlSchemaType(name = "time")
	protected javax.xml.datatype.XMLGregorianCalendar e7;

	public byte[] getE0(){
		return e0;
	};
	public void setE0(byte[] e0){
		this.e0 = e0;
	};
	public boolean getE1(){
		return e1;
	};
	public void setE1(boolean e1){
		this.e1 = e1;
	};
	public java.util.List<javax.xml.datatype.XMLGregorianCalendar> getE2(){
		return e2;
	};
	public void setE2(java.util.List<javax.xml.datatype.XMLGregorianCalendar> e2){
		this.e2 = e2;
	};
	public java.util.List<javax.xml.datatype.XMLGregorianCalendar> getE3(){
		return e3;
	};
	public void setE3(java.util.List<javax.xml.datatype.XMLGregorianCalendar> e3){
		this.e3 = e3;
	};
	public float getE4(){
		return e4;
	};
	public void setE4(float e4){
		this.e4 = e4;
	};
	public int getE5(){
		return e5;
	};
	public void setE5(int e5){
		this.e5 = e5;
	};
	public String getE6(){
		return e6;
	};
	public void setE6(String e6){
		this.e6 = e6;
	};
	public javax.xml.datatype.XMLGregorianCalendar getE7(){
		return e7;
	};
	public void setE7(javax.xml.datatype.XMLGregorianCalendar e7){
		this.e7 = e7;
	};
    
}
