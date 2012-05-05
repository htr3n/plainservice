package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.serviceDsl.Node;
import at.ac.univie.cs.swa.soa.serviceDsl.ServiceDSL;
import at.ac.univie.cs.swa.soa.serviceDsl.WebService;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Service {
  public Object generateService(final IFileSystemAccess fsa, final ServiceDSL dsl) {
    Object _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", File.separator);
      String packagePath = _replace;
      EList<at.ac.univie.cs.swa.soa.serviceDsl.Service> _services = dsl.getServices();
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
            String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Service.java");
            String file = _operator_plus_2;
            CharSequence _generate = this.generate(dsl, s);
            fsa.generateFile(file, _generate);
          }
        }
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generate(final ServiceDSL dsl, final WebService s) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String packageName = _lowerCase;
      String _name_1 = s.getName();
      String _operator_plus = StringExtensions.operator_plus(_name_1, "Service");
      String className = _operator_plus;
      String _replace = packageName.replace(".", ":");
      String _lowerCase_1 = _replace.toLowerCase();
      String _operator_plus_1 = StringExtensions.operator_plus("urn:", _lowerCase_1);
      String nsURI = _operator_plus_1;
      String _name_2 = s.getName();
      String _operator_plus_2 = StringExtensions.operator_plus(_name_2, "Port");
      String portName = _operator_plus_2;
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.net.URL;");
      _builder.newLine();
      _builder.append("import javax.xml.namespace.QName;");
      _builder.newLine();
      _builder.append("import javax.xml.ws.WebEndpoint;");
      _builder.newLine();
      _builder.append("import javax.xml.ws.WebServiceClient;");
      _builder.newLine();
      _builder.append("import javax.xml.ws.WebServiceFeature;");
      _builder.newLine();
      _builder.append("import javax.xml.ws.Service;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@WebServiceClient(name = \"");
      String _name_3 = s.getName();
      _builder.append(_name_3, "");
      _builder.append("\", ");
      _builder.newLineIfNotEmpty();
      _builder.append("                  ");
      _builder.append("targetNamespace = \"");
      _builder.append(nsURI, "                  ");
      _builder.append("\") ");
      _builder.newLineIfNotEmpty();
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append(" extends Service {");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public static URL WSDL_LOCATION = null;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("static {");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("try {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("WSDL_LOCATION = new URL(\"");
      String _findURL = this.findURL(dsl, s);
      _builder.append(_findURL, "			");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("} catch (java.net.MalformedURLException e) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("e.printStackTrace();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public final static QName SERVICE = new QName(\"");
      _builder.append(nsURI, "    ");
      _builder.append("\", \"");
      String _name_4 = s.getName();
      _builder.append(_name_4, "    ");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("public final static QName ");
      String _firstLower = StringExtensions.toFirstLower(portName);
      _builder.append(_firstLower, "    ");
      _builder.append(" = new QName(\"");
      _builder.append(nsURI, "    ");
      _builder.append("\", \"");
      _builder.append(portName, "    ");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public ");
      _builder.append(className, "    ");
      _builder.append("(URL wsdlLocation) {");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("super(wsdlLocation, SERVICE);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public ");
      _builder.append(className, "    ");
      _builder.append("(URL wsdlLocation, QName serviceName) {");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("super(wsdlLocation, serviceName);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public ");
      _builder.append(className, "    ");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("super(WSDL_LOCATION, SERVICE);");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("@WebEndpoint(name = \"");
      _builder.append(portName, "    ");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("public ");
      String _name_5 = s.getName();
      _builder.append(_name_5, "    ");
      _builder.append(" get");
      String _name_6 = s.getName();
      _builder.append(_name_6, "    ");
      _builder.append("() {");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("return super.getPort(");
      String _firstLower_1 = StringExtensions.toFirstLower(portName);
      _builder.append(_firstLower_1, "        ");
      _builder.append(", ");
      String _name_7 = s.getName();
      _builder.append(_name_7, "        ");
      _builder.append(".class);");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("@WebEndpoint(name = \"");
      _builder.append(portName, "    ");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("public ");
      String _name_8 = s.getName();
      _builder.append(_name_8, "    ");
      _builder.append(" get");
      _builder.append(portName, "    ");
      _builder.append("(WebServiceFeature... features) {");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("return super.getPort(");
      String _firstLower_2 = StringExtensions.toFirstLower(portName);
      _builder.append(_firstLower_2, "        ");
      _builder.append(", ");
      String _name_9 = s.getName();
      _builder.append(_name_9, "        ");
      _builder.append(".class, features);");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected String findURL(final ServiceDSL dsl, final WebService s) {
    String _xifexpression = null;
    boolean _operator_and = false;
    EList<Node> _nodes = dsl.getNodes();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_nodes, null);
    if (!_operator_notEquals) {
      _operator_and = false;
    } else {
      EList<Node> _nodes_1 = dsl.getNodes();
      boolean _isEmpty = _nodes_1.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
    }
    if (_operator_and) {
      EList<Node> _nodes_2 = dsl.getNodes();
      for (final Node node : _nodes_2) {
        boolean _operator_and_1 = false;
        EList<at.ac.univie.cs.swa.soa.serviceDsl.Service> _services = node.getServices();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_services, null);
        if (!_operator_notEquals_1) {
          _operator_and_1 = false;
        } else {
          EList<at.ac.univie.cs.swa.soa.serviceDsl.Service> _services_1 = node.getServices();
          boolean _contains = _services_1.contains(s);
          _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_1, _contains);
        }
        if (_operator_and_1) {
          {
            String _baseURI = node.getBaseURI();
            String url = _baseURI;
            boolean _operator_and_2 = false;
            boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(url, null);
            if (!_operator_notEquals_2) {
              _operator_and_2 = false;
            } else {
              boolean _isEmpty_1 = url.isEmpty();
              boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
              _operator_and_2 = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_not_1);
            }
            if (_operator_and_2) {
              {
                int _length = url.length();
                int _operator_minus = IntegerExtensions.operator_minus(_length, 1);
                String _substring = url.substring(_operator_minus);
                String endingSlash = _substring;
                boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(endingSlash, "/");
                if (_operator_notEquals_3) {
                  String _operator_plus = StringExtensions.operator_plus(url, "/");
                  url = _operator_plus;
                }
                String _name = s.getName();
                String _operator_plus_1 = StringExtensions.operator_plus(url, _name);
                String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "?wsdl");
                return _operator_plus_2;
              }
            }
          }
        }
      }
    }
    return _xifexpression;
  }
}
