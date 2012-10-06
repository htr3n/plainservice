package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.ComplexElement;
import at.ac.univie.cs.swa.soa.sdl.DATATYPE;
import at.ac.univie.cs.swa.soa.sdl.DataElement;
import at.ac.univie.cs.swa.soa.sdl.MULTIPLICITY;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.SimpleElement;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DataGenerator {
  public void generateData(final IFileSystemAccess fsa, final SDL dsl) {
    boolean _and = false;
    EList<DataElement> _data = dsl.getData();
    boolean _notEquals = (!Objects.equal(_data, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<DataElement> _data_1 = dsl.getData();
      boolean _isEmpty = _data_1.isEmpty();
      boolean _not = (!_isEmpty);
      _and = (_notEquals && _not);
    }
    if (_and) {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      final String packagePath = _lowerCase.replace(".", File.separator);
      EList<DataElement> _data_2 = dsl.getData();
      final Iterable<ComplexElement> complexTypes = Iterables.<ComplexElement>filter(_data_2, ComplexElement.class);
      boolean _and_1 = false;
      boolean _notEquals_1 = (!Objects.equal(complexTypes, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _isEmpty_1 = IterableExtensions.isEmpty(complexTypes);
        boolean _not_1 = (!_isEmpty_1);
        _and_1 = (_notEquals_1 && _not_1);
      }
      if (_and_1) {
        for (final ComplexElement t : complexTypes) {
          {
            String _plus = (packagePath + File.separator);
            String _name_1 = t.getName();
            String _plus_1 = (_plus + _name_1);
            final String file = (_plus_1 + ".java");
            CharSequence _generateElement = this.generateElement(t, dsl);
            fsa.generateFile(file, _generateElement);
          }
        }
      }
      String _plus = (packagePath + File.separator);
      String _plus_1 = (_plus + "ObjectFactory.java");
      CharSequence _generateObjectFactory = this.generateObjectFactory(dsl, complexTypes);
      fsa.generateFile(_plus_1, _generateObjectFactory);
      String _plus_2 = (packagePath + File.separator);
      String _plus_3 = (_plus_2 + "package-info.java");
      CharSequence _generatePackageInfo = this.generatePackageInfo(dsl);
      fsa.generateFile(_plus_3, _generatePackageInfo);
    }
  }
  
  protected CharSequence generateObjectFactory(final SDL dsl, final Iterable<ComplexElement> complexTypes) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      final String packageName = _name.toLowerCase();
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
  
  protected CharSequence generatePackageInfo(final SDL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", ":");
      final String nsURI = ("urn:" + _replace);
      String _name_1 = dsl.getName();
      final String packageName = _name_1.toLowerCase();
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
  
  protected CharSequence _generateElement(final ComplexElement e, final SDL dsl) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      final String packageName = _name.toLowerCase();
      final String className = e.getName();
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
          String _name_1 = se.getName();
          _builder.append(_name_1, "	");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("})");
      _builder.newLine();
      _builder.append("@XmlRootElement(name = \"");
      String _name_2 = e.getName();
      _builder.append(_name_2, "");
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
            boolean _or = false;
            boolean _or_1 = false;
            DATATYPE _type = se_1.getType();
            boolean _equals = Objects.equal(_type, DATATYPE.DATE);
            if (_equals) {
              _or_1 = true;
            } else {
              DATATYPE _type_1 = se_1.getType();
              boolean _equals_1 = Objects.equal(_type_1, DATATYPE.TIME);
              _or_1 = (_equals || _equals_1);
            }
            if (_or_1) {
              _or = true;
            } else {
              DATATYPE _type_2 = se_1.getType();
              boolean _equals_2 = Objects.equal(_type_2, DATATYPE.DATETIME);
              _or = (_or_1 || _equals_2);
            }
            if (_or) {
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
          String _name_3 = se_1.getName();
          _builder.append(_name_3, "	");
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
          String _name_4 = se_2.getName();
          String _firstUpper = StringExtensions.toFirstUpper(_name_4);
          _builder.append(_firstUpper, "	");
          _builder.append("(){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("return ");
          String _name_5 = se_2.getName();
          _builder.append(_name_5, "		");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("};");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("public void set");
          String _name_6 = se_2.getName();
          String _firstUpper_1 = StringExtensions.toFirstUpper(_name_6);
          _builder.append(_firstUpper_1, "	");
          _builder.append("(");
          String _convertType_2 = this.convertType(se_2);
          _builder.append(_convertType_2, "	");
          _builder.append(" ");
          String _name_7 = se_2.getName();
          _builder.append(_name_7, "	");
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\t");
          _builder.append("this.");
          String _name_8 = se_2.getName();
          _builder.append(_name_8, "		");
          _builder.append(" = ");
          String _name_9 = se_2.getName();
          _builder.append(_name_9, "		");
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
  
  protected CharSequence _generateElement(final SimpleElement e, final SDL dsl) {
    return null;
  }
  
  protected boolean isRequired(final SimpleElement e) {
    boolean _or = false;
    MULTIPLICITY _multiplicity = e.getMultiplicity();
    boolean _equals = Objects.equal(_multiplicity, null);
    if (_equals) {
      _or = true;
    } else {
      MULTIPLICITY _multiplicity_1 = e.getMultiplicity();
      boolean _equals_1 = Objects.equal(_multiplicity_1, MULTIPLICITY.PLUS);
      _or = (_equals || _equals_1);
    }
    return _or;
  }
  
  protected String convertType(final SimpleElement e) {
    boolean _or = false;
    MULTIPLICITY _multiplicity = e.getMultiplicity();
    boolean _equals = Objects.equal(_multiplicity, MULTIPLICITY.PLUS);
    if (_equals) {
      _or = true;
    } else {
      MULTIPLICITY _multiplicity_1 = e.getMultiplicity();
      boolean _equals_1 = Objects.equal(_multiplicity_1, MULTIPLICITY.STAR);
      _or = (_equals || _equals_1);
    }
    final boolean isMany = _or;
    ComplexElement _ref = e.getRef();
    boolean _notEquals = (!Objects.equal(_ref, null));
    if (_notEquals) {
      ComplexElement _ref_1 = e.getRef();
      EObject _eContainer = _ref_1.eContainer();
      final String outputQualifiedPath = ((SDL) _eContainer).getName();
      String _plus = (outputQualifiedPath + ".");
      ComplexElement _ref_2 = e.getRef();
      String _name = _ref_2.getName();
      final String result = (_plus + _name);
      if (isMany) {
        String _plus_1 = ("java.util.List<" + result);
        return (_plus_1 + ">");
      } else {
        return result;
      }
    } else {
      DATATYPE _type = e.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      if (_notEquals_1) {
        DATATYPE _type_1 = e.getType();
        final String result_1 = this.toJavaType(_type_1);
        if (isMany) {
          String _plus_2 = ("java.util.List<" + result_1);
          return (_plus_2 + ">");
        } else {
          return result_1;
        }
      } else {
        return null;
      }
    }
  }
  
  protected String toJavaType(final DATATYPE type) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.BINARY)) {
        _matched=true;
        return "byte[]";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.BOOLEAN)) {
        _matched=true;
        return "boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.DATE)) {
        _matched=true;
        return "javax.xml.datatype.XMLGregorianCalendar";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.DATETIME)) {
        _matched=true;
        return "javax.xml.datatype.XMLGregorianCalendar";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.TIME)) {
        _matched=true;
        return "javax.xml.datatype.XMLGregorianCalendar";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.FLOAT)) {
        _matched=true;
        return "float";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.INTEGER)) {
        _matched=true;
        return "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,DATATYPE.STRING)) {
        _matched=true;
        return "String";
      }
    }
    return "Object";
  }
  
  protected CharSequence generateElement(final DataElement e, final SDL dsl) {
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
