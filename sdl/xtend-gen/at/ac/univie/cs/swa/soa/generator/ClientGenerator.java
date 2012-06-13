package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.DataElement;
import at.ac.univie.cs.swa.soa.sdl.Operation;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.Service;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ClientGenerator {
  public Object generateClient(final IFileSystemAccess fsa, final SDL dsl) {
    Object _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", File.separator);
      final String packagePath = _replace;
      EList<Service> _services = dsl.getServices();
      Iterable<Service> _filter = IterableExtensions.<Service>filter(_services, at.ac.univie.cs.swa.soa.sdl.Service.class);
      final Iterable<Service> webServices = _filter;
      Object _xifexpression = null;
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(webServices, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        boolean _isEmpty = IterableExtensions.isEmpty(webServices);
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
      }
      if (_operator_and) {
        for (final Service s : webServices) {
          {
            String _operator_plus = StringExtensions.operator_plus(packagePath, File.separator);
            String _name_1 = s.getName();
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Client.java");
            final String file = _operator_plus_2;
            CharSequence _generate = this.generate(dsl, s);
            fsa.generateFile(file, _generate);
          }
        }
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generate(final SDL dsl, final Service s) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      final String packageName = _lowerCase;
      String _name_1 = s.getName();
      String _operator_plus = StringExtensions.operator_plus(_name_1, "Client");
      final String className = _operator_plus;
      String _xifexpression = null;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
      if (_operator_notEquals) {
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
      boolean _operator_and = false;
      boolean _operator_and_1 = false;
      DataElement _inputType = operation.getInputType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_inputType, null);
      if (!_operator_notEquals) {
        _operator_and_1 = false;
      } else {
        DataElement _inputType_1 = operation.getInputType();
        String _name = _inputType_1.getName();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_name, null);
        _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (!_operator_and_1) {
        _operator_and = false;
      } else {
        DataElement _inputType_2 = operation.getInputType();
        String _name_1 = _inputType_2.getName();
        boolean _isEmpty = _name_1.isEmpty();
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_and_1, _operator_not);
      }
      final boolean hasInput = _operator_and;
      boolean _operator_and_2 = false;
      boolean _operator_and_3 = false;
      DataElement _outputType = operation.getOutputType();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_outputType, null);
      if (!_operator_notEquals_2) {
        _operator_and_3 = false;
      } else {
        DataElement _outputType_1 = operation.getOutputType();
        String _name_2 = _outputType_1.getName();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(_name_2, null);
        _operator_and_3 = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_notEquals_3);
      }
      if (!_operator_and_3) {
        _operator_and_2 = false;
      } else {
        DataElement _outputType_2 = operation.getOutputType();
        String _name_3 = _outputType_2.getName();
        boolean _isEmpty_1 = _name_3.isEmpty();
        boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
        _operator_and_2 = BooleanExtensions.operator_and(_operator_and_3, _operator_not_1);
      }
      final boolean hasOutput = _operator_and_2;
      String _xifexpression = null;
      DataElement _inputType_3 = operation.getInputType();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_inputType_3, null);
      if (_operator_notEquals_4) {
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
      boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(_outputType_3, null);
      if (_operator_notEquals_5) {
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
