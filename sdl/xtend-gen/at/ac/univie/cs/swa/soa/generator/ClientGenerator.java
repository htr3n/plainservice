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
public class ClientGenerator {
  public void generateClient(final IFileSystemAccess fsa, final SDL dsl) {
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
          final String file = (_plus_1 + "Client.java");
          CharSequence _generate = this.generate(dsl, s);
          fsa.generateFile(file, _generate);
        }
      }
    }
  }
  
  protected CharSequence generate(final SDL dsl, final Service s) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      final String packageName = _name.toLowerCase();
      String _name_1 = s.getName();
      final String className = (_name_1 + "Client");
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(s, null));
      if (_notEquals) {
        EObject _eContainer = s.eContainer();
        String _name_2 = ((SDL) _eContainer).getName();
        _xifexpression = _name_2;
      } else {
        _xifexpression = null;
      }
      final String serviceQualifiedPath = _xifexpression;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("package ");
      _builder.append(packageName, "		");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import ");
      _builder.append(serviceQualifiedPath, "");
      _builder.append(".");
      String _name_3 = s.getName();
      _builder.append(_name_3, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("public final class ");
      _builder.append(className, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("public static void main(String args[]) throws java.lang.Exception {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      String _name_4 = s.getName();
      _builder.append(_name_4, "		");
      _builder.append("Service ss = new ");
      String _name_5 = s.getName();
      _builder.append(_name_5, "		");
      _builder.append("Service();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _name_6 = s.getName();
      _builder.append(_name_6, "		");
      _builder.append(" port = ss.get");
      String _name_7 = s.getName();
      _builder.append(_name_7, "		");
      _builder.append("();  ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        EList<Operation> _operations = s.getOperations();
        for(final Operation operation : _operations) {
          _builder.append("\t\t");
          _builder.append("System.out.println(\"Invoking ");
          String _name_8 = operation.getName();
          _builder.append(_name_8, "		");
          _builder.append("...\");");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          CharSequence _generateOperationInvocation = this.generateOperationInvocation(operation);
          _builder.append(_generateOperationInvocation, "		");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generateOperationInvocation(final Operation operation) {
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
      StringConcatenation _builder = new StringConcatenation();
      {
        if (hasInput) {
          _builder.append(inputQualifiedPath, "");
          _builder.append(".");
          DataElement _inputType_5 = operation.getInputType();
          String _name_6 = _inputType_5.getName();
          _builder.append(_name_6, "");
          _builder.append(" ");
          String _inputName = operation.getInputName();
          _builder.append(_inputName, "");
          _builder.append(" = new ");
          _builder.append(inputQualifiedPath, "");
          _builder.append(".");
          DataElement _inputType_6 = operation.getInputType();
          String _name_7 = _inputType_6.getName();
          _builder.append(_name_7, "");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          DataElement _inputType_7 = operation.getInputType();
          CharSequence _generateValues = this.generateValues(_inputType_7);
          _builder.append(_generateValues, "");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (hasOutput) {
          _builder.append(outputQualifiedPath, "");
          _builder.append(".");
          DataElement _outputType_5 = operation.getOutputType();
          String _name_8 = _outputType_5.getName();
          _builder.append(_name_8, "");
          _builder.append(" ");
          String _outputName = operation.getOutputName();
          _builder.append(_outputName, "");
          _builder.append(" = port.");
          String _name_9 = operation.getName();
          _builder.append(_name_9, "");
          _builder.append("(");
          {
            if (hasInput) {
              String _inputName_1 = operation.getInputName();
              _builder.append(_inputName_1, "");
            }
          }
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("System.out.println(\"");
          String _name_10 = operation.getName();
          _builder.append(_name_10, "");
          _builder.append(".result=\" + ");
          String _outputName_1 = operation.getOutputName();
          _builder.append(_outputName_1, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("port.");
          String _name_11 = operation.getName();
          _builder.append(_name_11, "");
          _builder.append("(");
          {
            if (hasInput) {
              String _inputName_2 = operation.getInputName();
              _builder.append(_inputName_2, "");
            }
          }
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generateValues(final DataElement e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
