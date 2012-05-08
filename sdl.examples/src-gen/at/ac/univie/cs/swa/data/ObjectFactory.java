package at.ac.univie.cs.swa.data;

@javax.xml.bind.annotation.XmlRegistry
public class ObjectFactory
{

	public ObjectFactory()
	{
	}
	public SimpleRequest createSimpleRequest()
	{
		return new SimpleRequest();
	}
	public SimpleResponse createSimpleResponse()
	{
		return new SimpleResponse();
	}
	public AllType createAllType()
	{
		return new AllType();
	}
	public ComplexMixedSubType createComplexMixedSubType()
	{
		return new ComplexMixedSubType();
	}
}
