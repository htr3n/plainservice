package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.DataElement;
import at.ac.univie.cs.swa.soa.sdl.Operation;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.Service;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SEIGenerator {
  public void generateSEI(final IFileSystemAccess fsa, final SDL dsl) {
    String _name = dsl.getName();
    String _lowerCase = _name.toLowerCase();
    final String packagePath = _lowerCase.replace(".", File.separator);
    EList<Service> _services = dsl.getServices();
    final Iterable<Service> webServices = Iterables.<Service>filter(_services, Service.class);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(webServices, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = IterableExtensions.isEmpty(webServices);
      boolean _not = (!_isEmpty);
      _and = (_notEquals && _not);
    }
    if (_and) {
      for (final Service s : webServices) {
        {
          String _plus = (packagePath + File.separator);
          String _name_1 = s.getName();
          String _plus_1 = (_plus + _name_1);
          final String file = (_plus_1 + ".java");
          CharSequence _generate = this.generate(s, dsl);
          fsa.generateFile(file, _generate);
        }
      }
    }
  }
  
  protected CharSequence generate(final Service s, final SDL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      final String packageName = _name.toLowerCase();
      String _replace = packageName.replace(".", ":");
      final String nsURI = ("urn:" + _replace);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.newLine();
      _builder.append("@javax.jws.WebService(targetNamespace = \"");
      _builder.append(nsURI, "");
      _builder.append("\", name = \"");
      String _name_1 = s.getName();
      _builder.append(_name_1, "");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("@javax.jws.soap.SOAPBinding(parameterStyle = javax.jws.soap.SOAPBinding.ParameterStyle.BARE)");
      _builder.newLine();
      _builder.append("public interface ");
      String _name_2 = s.getName();
      _builder.append(_name_2, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Operation> _operations = s.getOperations();
        for(final Operation operation : _operations) {
          _builder.append("\t");
          CharSequence _generateOperation = this.generateOperation(operation, dsl);
          _builder.append(_generateOperation, "	");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generateOperation(final Operation operation, final SDL dsl) {
    CharSequence _xblockexpression = null;
    {
      boolean _and = false;
      boolean _and_1 = false;
      DataElement _inputType = operation.getInputType();
      boolean _notEquals = (!Objects.equal(_inputType, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        DataElement _inputType_1 = operation.getInputType();
        String _name = _inputType_1.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        _and_1 = (_notEquals && _notEquals_1);
      }
      if (!_and_1) {
        _and = false;
      } else {
        DataElement _inputType_2 = operation.getInputType();
        String _name_1 = _inputType_2.getName();
        boolean _isEmpty = _name_1.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_and_1 && _not);
      }
      final boolean hasInput = _and;
      boolean _and_2 = false;
      boolean _and_3 = false;
      DataElement _outputType = operation.getOutputType();
      boolean _notEquals_2 = (!Objects.equal(_outputType, null));
      if (!_notEquals_2) {
        _and_3 = false;
      } else {
        DataElement _outputType_1 = operation.getOutputType();
        String _name_2 = _outputType_1.getName();
        boolean _notEquals_3 = (!Objects.equal(_name_2, null));
        _and_3 = (_notEquals_2 && _notEquals_3);
      }
      if (!_and_3) {
        _and_2 = false;
      } else {
        DataElement _outputType_2 = operation.getOutputType();
        String _name_3 = _outputType_2.getName();
        boolean _isEmpty_1 = _name_3.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        _and_2 = (_and_3 && _not_1);
      }
      final boolean hasOutput = _and_2;
      String _xifexpression = null;
      DataElement _inputType_3 = operation.getInputType();
      boolean _notEquals_4 = (!Objects.equal(_inputType_3, null));
      if (_notEquals_4) {
        DataElement _inputType_4 = operation.getInputType();
        EObject _eContainer = _inputType_4.eContainer();
        String _name_4 = ((SDL) _eContainer).getName();
        _xifexpression = _name_4;
      } else {
        _xifexpression = null;
      }
      final String inputQualifiedPath = _xifexpression;
      String _xifexpression_1 = null;
      DataElement _outputType_3 = operation.getOutputType();
      boolean _notEquals_5 = (!Objects.equal(_outputType_3, null));
      if (_notEquals_5) {
        DataElement _outputType_4 = operation.getOutputType();
        EObject _eContainer_1 = _outputType_4.eContainer();
        String _name_5 = ((SDL) _eContainer_1).getName();
        _xifexpression_1 = _name_5;
      } else {
        _xifexpression_1 = null;
      }
      final String outputQualifiedPath = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _notEquals_6 = (!Objects.equal(inputQualifiedPath, null));
      if (_notEquals_6) {
        String _replace = inputQualifiedPath.replace(".", ":");
        String _plus = ("urn:" + _replace);
        _xifexpression_2 = _plus;
      } else {
        _xifexpression_2 = null;
      }
      final String inputNsURI = _xifexpression_2;
      String _xifexpression_3 = null;
      boolean _notEquals_7 = (!Objects.equal(outputQualifiedPath, null));
      if (_notEquals_7) {
        String _replace_1 = outputQualifiedPath.replace(".", ":");
        String _plus_1 = ("urn:" + _replace_1);
        _xifexpression_3 = _plus_1;
      } else {
        _xifexpression_3 = null;
      }
      final String outputNsURI = _xifexpression_3;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      {
        if (hasOutput) {
          _builder.append("@javax.jws.WebResult(name = \"");
          DataElement _outputType_5 = operation.getOutputType();
          String _name_6 = _outputType_5.getName();
          _builder.append(_name_6, "");
          _builder.append("\", targetNamespace = \"");
          _builder.append(outputNsURI, "");
          _builder.append("\",partName = \"");
          String _outputName = operation.getOutputName();
          _builder.append(_outputName, "");
          _builder.append("\")");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("@javax.jws.Oneway");
          _builder.newLine();
        }
      }
      _builder.append("@javax.jws.WebMethod(operationName=\"");
      String _name_7 = operation.getName();
      _builder.append(_name_7, "");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("public ");
      {
        if (hasOutput) {
          _builder.append(outputQualifiedPath, "");
          _builder.append(".");
          DataElement _outputType_6 = operation.getOutputType();
          String _name_8 = _outputType_6.getName();
          _builder.append(_name_8, "");
        } else {
          _builder.append("void");
        }
      }
      _builder.append(" ");
      String _name_9 = operation.getName();
      _builder.append(_name_9, "");
      _builder.append("(");
      _builder.newLineIfNotEmpty();
      _builder.append("@javax.jws.WebParam(partName = \"");
      String _inputName = operation.getInputName();
      _builder.append(_inputName, "");
      _builder.append("\",name = \"");
      DataElement _inputType_5 = operation.getInputType();
      String _name_10 = _inputType_5.getName();
      _builder.append(_name_10, "");
      _builder.append("\", targetNamespace = \"");
      _builder.append(inputNsURI, "");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      {
        if (hasInput) {
          _builder.append(inputQualifiedPath, "");
          _builder.append(".");
          DataElement _inputType_6 = operation.getInputType();
          String _name_11 = _inputType_6.getName();
          _builder.append(_name_11, "");
        }
      }
      _builder.append(" ");
      String _inputName_1 = operation.getInputName();
      _builder.append(_inputName_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
