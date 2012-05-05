package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.serviceDsl.DataElement;
import at.ac.univie.cs.swa.soa.serviceDsl.Operation;
import at.ac.univie.cs.swa.soa.serviceDsl.Service;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.WebService;
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
public class SEI {
  public Object generateSEI(final IFileSystemAccess fsa, final ServiceDSL dsl) {
    Object _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", File.separator);
      String packagePath = _replace;
      EList<Service> _services = dsl.getServices();
      Iterable<WebService> _filter = IterableExtensions.<WebService>filter(_services, at.ac.univie.cs.swa.soa.serviceDsl.WebService.class);
      Iterable<WebService> webServices = _filter;
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
        for (final WebService s : webServices) {
          {
            String _operator_plus = StringExtensions.operator_plus(packagePath, File.separator);
            String _name_1 = s.getName();
            String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
            String file = _operator_plus_2;
            CharSequence _generate = this.generate(s, dsl);
            fsa.generateFile(file, _generate);
          }
        }
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generate(final WebService s, final ServiceDSL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String packageName = _lowerCase;
      String _replace = packageName.replace(".", ":");
      String _operator_plus = StringExtensions.operator_plus("urn:", _replace);
      String nsURI = _operator_plus;
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
  
  protected CharSequence generateOperation(final Operation operation, final ServiceDSL dsl) {
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
      boolean hasInput = _operator_and;
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
      boolean hasOutput = _operator_and_2;
      String _xifexpression = null;
      DataElement _inputType_3 = operation.getInputType();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(_inputType_3, null);
      if (_operator_notEquals_4) {
        DataElement _inputType_4 = operation.getInputType();
        EObject _eContainer = _inputType_4.eContainer();
        String _name_4 = ((ServiceDSL) _eContainer).getName();
        _xifexpression = _name_4;
      } else {
        _xifexpression = null;
      }
      String inputQualifiedPath = _xifexpression;
      String _xifexpression_1 = null;
      DataElement _outputType_3 = operation.getOutputType();
      boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(_outputType_3, null);
      if (_operator_notEquals_5) {
        DataElement _outputType_4 = operation.getOutputType();
        EObject _eContainer_1 = _outputType_4.eContainer();
        String _name_5 = ((ServiceDSL) _eContainer_1).getName();
        _xifexpression_1 = _name_5;
      } else {
        _xifexpression_1 = null;
      }
      String outputQualifiedPath = _xifexpression_1;
      String _xifexpression_2 = null;
      boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(inputQualifiedPath, null);
      if (_operator_notEquals_6) {
        String _replace = inputQualifiedPath.replace(".", ":");
        String _operator_plus = StringExtensions.operator_plus("urn:", _replace);
        _xifexpression_2 = _operator_plus;
      } else {
        _xifexpression_2 = null;
      }
      String inputNsURI = _xifexpression_2;
      String _xifexpression_3 = null;
      boolean _operator_notEquals_7 = ObjectExtensions.operator_notEquals(outputQualifiedPath, null);
      if (_operator_notEquals_7) {
        String _replace_1 = outputQualifiedPath.replace(".", ":");
        String _operator_plus_1 = StringExtensions.operator_plus("urn:", _replace_1);
        _xifexpression_3 = _operator_plus_1;
      } else {
        _xifexpression_3 = null;
      }
      String outputNsURI = _xifexpression_3;
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
