package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement;
import at.ac.univie.cs.swa.soa.serviceDsl.DATATYPE;
import at.ac.univie.cs.swa.soa.serviceDsl.DataElement;
import at.ac.univie.cs.swa.soa.serviceDsl.MULTIPLICITY;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.SimpleElement;
import java.io.File;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Data {
  public Object generateData(final IFileSystemAccess fsa, final ServiceDSL dsl) {
    Object _xifexpression = null;
    boolean _operator_and = false;
    EList<DataElement> _data = dsl.getData();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_data, null);
    if (!_operator_notEquals) {
      _operator_and = false;
    } else {
      EList<DataElement> _data_1 = dsl.getData();
      boolean _isEmpty = _data_1.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
    }
    if (_operator_and) {
      {
        String _name = dsl.getName();
        String _lowerCase = _name.toLowerCase();
        String _replace = _lowerCase.replace(".", File.separator);
        String packagePath = _replace;
        EList<DataElement> _data_2 = dsl.getData();
        Iterable<ComplexElement> _filter = IterableExtensions.<ComplexElement>filter(_data_2, at.ac.univie.cs.swa.soa.serviceDsl.ComplexElement.class);
        Iterable<ComplexElement> complexTypes = _filter;
        boolean _operator_and_1 = false;
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(complexTypes, null);
        if (!_operator_notEquals_1) {
          _operator_and_1 = false;
        } else {
          boolean _isEmpty_1 = IterableExtensions.isEmpty(complexTypes);
          boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
          _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_1, _operator_not_1);
        }
        if (_operator_and_1) {
          for (final ComplexElement t : complexTypes) {
            {
              String _operator_plus = StringExtensions.operator_plus(packagePath, File.separator);
              String _name_1 = t.getName();
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
              String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ".java");
              String file = _operator_plus_2;
              CharSequence _generateElement = this.generateElement(t, dsl);
              fsa.generateFile(file, _generateElement);
            }
          }
        }
        String _operator_plus_3 = StringExtensions.operator_plus(packagePath, File.separator);
        String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, "ObjectFactory.java");
        CharSequence _generateObjectFactory = this.generateObjectFactory(dsl, complexTypes);
        fsa.generateFile(_operator_plus_4, _generateObjectFactory);
        String _operator_plus_5 = StringExtensions.operator_plus(packagePath, File.separator);
        String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "package-info.java");
        CharSequence _generatePackageInfo = this.generatePackageInfo(dsl);
        fsa.generateFile(_operator_plus_6, _generatePackageInfo);
      }
    }
    return _xifexpression;
  }
  
  protected CharSequence generateObjectFactory(final ServiceDSL dsl, final Iterable<ComplexElement> complexTypes) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String packageName = _lowerCase;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("@javax.xml.bind.annotation.XmlRegistry");
      _builder.newLine();
      _builder.append("public class ObjectFactory");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ObjectFactory()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      {
        for(final ComplexElement t : complexTypes) {
          _builder.append("\t");
          _builder.append("public ");
          String _name_1 = t.getName();
          _builder.append(_name_1, "	");
          _builder.append(" create");
          String _name_2 = t.getName();
          _builder.append(_name_2, "	");
          _builder.append("()");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("{");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return new ");
          String _name_3 = t.getName();
          _builder.append(_name_3, "		");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generatePackageInfo(final ServiceDSL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", ":");
      String _operator_plus = StringExtensions.operator_plus("urn:", _replace);
      String nsURI = _operator_plus;
      String _name_1 = dsl.getName();
      String _lowerCase_1 = _name_1.toLowerCase();
      String packageName = _lowerCase_1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@javax.xml.bind.annotation.XmlSchema(namespace = \"");
      _builder.append(nsURI, "");
      _builder.append("\", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)");
      _builder.newLineIfNotEmpty();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateElement(final ComplexElement e, final ServiceDSL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String packageName = _lowerCase;
      String _name_1 = e.getName();
      String className = _name_1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import javax.xml.bind.annotation.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@XmlAccessorType(XmlAccessType.FIELD)");
      _builder.newLine();
      _builder.append("@XmlType(name = \"\", propOrder = {");
      _builder.newLine();
      {
        EList<SimpleElement> _elements = e.getElements();
        boolean _hasElements = false;
        for(final SimpleElement se : _elements) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "	");
          }
          _builder.append("\t");
          _builder.append("\"");
          String _name_2 = se.getName();
          _builder.append(_name_2, "	");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("})");
      _builder.newLine();
      _builder.append("@XmlRootElement(name = \"");
      String _name_3 = e.getName();
      _builder.append(_name_3, "");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.newLine();
      {
        EList<SimpleElement> _elements_1 = e.getElements();
        for(final SimpleElement se_1 : _elements_1) {
          _builder.append("\t");
          _builder.append("@XmlElement");
          {
            boolean _isRequired = this.isRequired(se_1);
            if (_isRequired) {
              _builder.append("(required=true)");
            }
          }
          _builder.newLineIfNotEmpty();
          {
            boolean _operator_or = false;
            boolean _operator_or_1 = false;
            DATATYPE _type = se_1.getType();
            boolean _operator_equals = ObjectExtensions.operator_equals(_type, DATATYPE.DATE);
            if (_operator_equals) {
              _operator_or_1 = true;
            } else {
              DATATYPE _type_1 = se_1.getType();
              boolean _operator_equals_1 = ObjectExtensions.operator_equals(_type_1, DATATYPE.TIME);
              _operator_or_1 = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
            }
            if (_operator_or_1) {
              _operator_or = true;
            } else {
              DATATYPE _type_2 = se_1.getType();
              boolean _operator_equals_2 = ObjectExtensions.operator_equals(_type_2, DATATYPE.DATETIME);
              _operator_or = BooleanExtensions.operator_or(_operator_or_1, _operator_equals_2);
            }
            if (_operator_or) {
              _builder.append("\t");
              _builder.append("@XmlSchemaType(name = \"");
              DATATYPE _type_3 = se_1.getType();
              _builder.append(_type_3, "	");
              _builder.append("\")");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("protected ");
          String _convertType = this.convertType(se_1);
          _builder.append(_convertType, "	");
          _builder.append(" ");
          String _name_4 = se_1.getName();
          _builder.append(_name_4, "	");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        EList<SimpleElement> _elements_2 = e.getElements();
        for(final SimpleElement se_2 : _elements_2) {
          _builder.append("\t");
          _builder.append("public ");
          String _convertType_1 = this.convertType(se_2);
          _builder.append(_convertType_1, "	");
          _builder.append(" get");
          String _name_5 = se_2.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name_5);
          _builder.append(_firstUpper, "	");
          _builder.append("(){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return ");
          String _name_6 = se_2.getName();
          _builder.append(_name_6, "		");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("};");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void set");
          String _name_7 = se_2.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_7);
          _builder.append(_firstUpper_1, "	");
          _builder.append("(");
          String _convertType_2 = this.convertType(se_2);
          _builder.append(_convertType_2, "	");
          _builder.append(" ");
          String _name_8 = se_2.getName();
          _builder.append(_name_8, "	");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.");
          String _name_9 = se_2.getName();
          _builder.append(_name_9, "		");
          _builder.append(" = ");
          String _name_10 = se_2.getName();
          _builder.append(_name_10, "		");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("};");
          _builder.newLine();
        }
      }
      _builder.append("    ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateElement(final SimpleElement e, final ServiceDSL dsl) {
    return null;
  }
  
  protected boolean isRequired(final SimpleElement e) {
    boolean _operator_or = false;
    MULTIPLICITY _multiplicity = e.getMultiplicity();
    boolean _operator_equals = ObjectExtensions.operator_equals(_multiplicity, null);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      MULTIPLICITY _multiplicity_1 = e.getMultiplicity();
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_multiplicity_1, MULTIPLICITY.PLUS);
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
    }
    return _operator_or;
  }
  
  protected String convertType(final SimpleElement e) {
      boolean _operator_or = false;
      MULTIPLICITY _multiplicity = e.getMultiplicity();
      boolean _operator_equals = ObjectExtensions.operator_equals(_multiplicity, MULTIPLICITY.PLUS);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        MULTIPLICITY _multiplicity_1 = e.getMultiplicity();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_multiplicity_1, MULTIPLICITY.STAR);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      boolean isMany = _operator_or;
      ComplexElement _ref = e.getRef();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_ref, null);
      if (_operator_notEquals) {
        {
          ComplexElement _ref_1 = e.getRef();
          EObject _eContainer = _ref_1.eContainer();
          String _name = ((ServiceDSL) _eContainer).getName();
          String outputQualifiedPath = _name;
          String _operator_plus = StringExtensions.operator_plus(outputQualifiedPath, ".");
          ComplexElement _ref_2 = e.getRef();
          String _name_1 = _ref_2.getName();
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _name_1);
          String result = _operator_plus_1;
          if (isMany) {
            String _operator_plus_2 = StringExtensions.operator_plus("java.util.List<", result);
            String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ">");
            return _operator_plus_3;
          } else {
            return result;
          }
        }
      } else {
        DATATYPE _type = e.getType();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_type, null);
        if (_operator_notEquals_1) {
          {
            DATATYPE _type_1 = e.getType();
            String _javaType = this.toJavaType(_type_1);
            String result_1 = _javaType;
            if (isMany) {
              String _operator_plus_4 = StringExtensions.operator_plus("java.util.List<", result_1);
              String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, ">");
              return _operator_plus_5;
            } else {
              return result_1;
            }
          }
        } else {
          return null;
        }
      }
  }
  
  protected String toJavaType(final DATATYPE type) {
      boolean matched = false;
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.BINARY)) {
          matched=true;
          return "byte[]";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.BOOLEAN)) {
          matched=true;
          return "boolean";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.DATE)) {
          matched=true;
          return "javax.xml.datatype.XMLGregorianCalendar";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.DATETIME)) {
          matched=true;
          return "javax.xml.datatype.XMLGregorianCalendar";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.TIME)) {
          matched=true;
          return "javax.xml.datatype.XMLGregorianCalendar";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.FLOAT)) {
          matched=true;
          return "float";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.INTEGER)) {
          matched=true;
          return "int";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(type,DATATYPE.STRING)) {
          matched=true;
          return "String";
        }
      }
      return "Object";
  }
  
  protected CharSequence generateElement(final DataElement e, final ServiceDSL dsl) {
    if (e instanceof ComplexElement) {
      return _generateElement((ComplexElement)e, dsl);
    } else if (e instanceof SimpleElement) {
      return _generateElement((SimpleElement)e, dsl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, dsl).toString());
    }
  }
}
