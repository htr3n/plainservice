package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.generator.ClientGenerator;
import at.ac.univie.cs.swa.soa.generator.DataGenerator;
import at.ac.univie.cs.swa.soa.generator.IGenerator2;
import at.ac.univie.cs.swa.soa.generator.ImplGenerator;
import at.ac.univie.cs.swa.soa.generator.SEIGenerator;
import at.ac.univie.cs.swa.soa.generator.ServerGenerator;
import at.ac.univie.cs.swa.soa.generator.ServiceGenerator;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class SDLGenerator implements IGenerator2 {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    if ((_head instanceof SDL)) {
      {
        EList<EObject> _contents_1 = resource.getContents();
        EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
        final SDL dsl = ((SDL) _head_1);
        this.toJavaCode(fsa, dsl);
      }
    }
  }
  
  public Object toJavaCode(final IFileSystemAccess fsa, final SDL dsl) {
    Object _xblockexpression = null;
    {
      DataGenerator _dataGenerator = new DataGenerator();
      _dataGenerator.generateData(fsa, dsl);
      SEIGenerator _sEIGenerator = new SEIGenerator();
      _sEIGenerator.generateSEI(fsa, dsl);
      ImplGenerator _implGenerator = new ImplGenerator();
      _implGenerator.generateImpl(fsa, dsl);
      ServerGenerator _serverGenerator = new ServerGenerator();
      _serverGenerator.generateServer(fsa, dsl);
      ServiceGenerator _serviceGenerator = new ServiceGenerator();
      _serviceGenerator.generateService(fsa, dsl);
      ClientGenerator _clientGenerator = new ClientGenerator();
      Object _generateClient = _clientGenerator.generateClient(fsa, dsl);
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
