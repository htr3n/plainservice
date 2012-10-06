package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.Node;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.Service;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ServiceGenerator {
  public void generateService(final IFileSystemAccess fsa, final SDL dsl) {
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
          final String file = (_plus_1 + "Service.java");
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
      final String className = (_name_1 + "Service");
      String _replace = packageName.replace(".", ":");
      String _lowerCase = _replace.toLowerCase();
      final String nsURI = ("urn:" + _lowerCase);
      String _name_2 = s.getName();
      final String portName = (_name_2 + "Port");
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.net.URL;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@javax.xml.ws.WebServiceClient(name = \"");
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
      _builder.append(" extends javax.xml.ws.Service {");
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
      _builder.append("public final static javax.xml.namespace.QName SERVICE = new javax.xml.namespace.QName(\"");
      _builder.append(nsURI, "    ");
      _builder.append("\", \"");
      String _name_4 = s.getName();
      _builder.append(_name_4, "    ");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("public final static javax.xml.namespace.QName ");
      String _firstLower = StringExtensions.toFirstLower(portName);
      _builder.append(_firstLower, "    ");
      _builder.append(" = new javax.xml.namespace.QName(\"");
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
      _builder.append("(URL wsdlLocation, javax.xml.namespace.QName serviceName) {");
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
      _builder.append("@javax.xml.ws.WebEndpoint(name = \"");
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
      _builder.append("@javax.xml.ws.WebEndpoint(name = \"");
      _builder.append(portName, "    ");
      _builder.append("\")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("public ");
      String _name_8 = s.getName();
      _builder.append(_name_8, "    ");
      _builder.append(" get");
      _builder.append(portName, "    ");
      _builder.append("(javax.xml.ws.WebServiceFeature... features) {");
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
  
  protected String findURL(final SDL dsl, final Service s) {
    boolean _and = false;
    EList<Node> _nodes = dsl.getNodes();
    boolean _notEquals = (!Objects.equal(_nodes, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EList<Node> _nodes_1 = dsl.getNodes();
      boolean _isEmpty = _nodes_1.isEmpty();
      boolean _not = (!_isEmpty);
      _and = (_notEquals && _not);
    }
    if (_and) {
      EList<Node> _nodes_2 = dsl.getNodes();
      for (final Node node : _nodes_2) {
        boolean _and_1 = false;
        EList<Service> _services = node.getServices();
        boolean _notEquals_1 = (!Objects.equal(_services, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          EList<Service> _services_1 = node.getServices();
          boolean _contains = _services_1.contains(s);
          _and_1 = (_notEquals_1 && _contains);
        }
        if (_and_1) {
          String url = node.getBaseURI();
          boolean _and_2 = false;
          boolean _notEquals_2 = (!Objects.equal(url, null));
          if (!_notEquals_2) {
            _and_2 = false;
          } else {
            boolean _isEmpty_1 = url.isEmpty();
            boolean _not_1 = (!_isEmpty_1);
            _and_2 = (_notEquals_2 && _not_1);
          }
          if (_and_2) {
            int _length = url.length();
            int _minus = (_length - 1);
            final String endingSlash = url.substring(_minus);
            boolean _notEquals_3 = (!Objects.equal(endingSlash, "/"));
            if (_notEquals_3) {
              String _plus = (url + "/");
              url = _plus;
            }
            String _name = s.getName();
            String _plus_1 = (url + _name);
            return (_plus_1 + "?wsdl");
          }
        }
      }
    }
    return null;
  }
}
