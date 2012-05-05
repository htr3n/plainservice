package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.generator.Client;
import at.ac.univie.cs.swa.soa.generator.Data;
import at.ac.univie.cs.swa.soa.generator.IGenerator2;
import at.ac.univie.cs.swa.soa.generator.Impl;
import at.ac.univie.cs.swa.soa.generator.SEI;
import at.ac.univie.cs.swa.soa.generator.Server;
import at.ac.univie.cs.swa.soa.generator.Service;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ServiceDslGenerator implements IGenerator2 {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      ServiceDSL dsl = ((ServiceDSL) _head);
      this.toJavaCode(fsa, dsl);
  }
  
  public Object toJavaCode(final IFileSystemAccess fsa, final ServiceDSL dsl) {
    Object _xblockexpression = null;
    {
      Data _data = new Data();
      _data.generateData(fsa, dsl);
      SEI _sEI = new SEI();
      _sEI.generateSEI(fsa, dsl);
      Impl _impl = new Impl();
      _impl.generateImpl(fsa, dsl);
      Server _server = new Server();
      _server.generateServer(fsa, dsl);
      Service _service = new Service();
      _service.generateService(fsa, dsl);
      Client _client = new Client();
      Object _generateClient = _client.generateClient(fsa, dsl);
      _xblockexpression = (_generateClient);
    }
    return _xblockexpression;
  }
  
  public void doGenerate(final ResourceSet rs, final IFileSystemAccess fsa) {
    EList<Resource> _resources = rs.getResources();
    for (final Resource r : _resources) {
      {
        String _operator_plus = StringExtensions.operator_plus("... processing the resource ", r);
        InputOutput.<String>println(_operator_plus);
        this.doGenerate(r, fsa);
      }
    }
  }
}
