package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.Node;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.Service;
import com.google.common.base.Objects;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ServerGenerator {
  public void generateServer(final IFileSystemAccess fsa, final SDL dsl) {
    String _name = dsl.getName();
    String _lowerCase = _name.toLowerCase();
    final String packagePath = _lowerCase.replace(".", File.separator);
    final EList<Node> nodes = dsl.getNodes();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(nodes, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = nodes.isEmpty();
      boolean _not = (!_isEmpty);
      _and = (_notEquals && _not);
    }
    if (_and) {
      for (final Node node : nodes) {
        boolean _and_1 = false;
        String _name_1 = node.getName();
        boolean _notEquals_1 = (!Objects.equal(_name_1, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          String _name_2 = node.getName();
          boolean _isEmpty_1 = _name_2.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          _and_1 = (_notEquals_1 && _not_1);
        }
        if (_and_1) {
          String _name_3 = node.getName();
          final String hostName = _name_3.replace("^", "");
          String _plus = (packagePath + File.separator);
          String _firstUpper = StringExtensions.toFirstUpper(hostName);
          String _plus_1 = (_plus + _firstUpper);
          final String file = (_plus_1 + "Server.java");
          CharSequence _generate = this.generate(dsl, node);
          fsa.generateFile(file, _generate);
        }
      }
    }
  }
  
  protected CharSequence generate(final SDL dsl, final Node node) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      final String packageName = _name.toLowerCase();
      String _name_1 = node.getName();
      String _replace = _name_1.replace("^", "");
      String _firstUpper = StringExtensions.toFirstUpper(_replace);
      final String className = (_firstUpper + "Server");
      String address = node.getBaseURI();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(address, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _isEmpty = address.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        int _length = address.length();
        int _minus = (_length - 1);
        final String endingSlash = address.substring(_minus);
        boolean _notEquals_1 = (!Objects.equal(endingSlash, "/"));
        if (_notEquals_1) {
          String _plus = (address + "/");
          address = _plus;
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package ");
      _builder.append(packageName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import javax.xml.ws.Endpoint;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append("{");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("public static void main(String args[]) throws java.lang.Exception {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("System.out.println(\"Starting Server\");");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("String address = \"");
      _builder.append(address, "    	");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      {
        EList<Service> _services = node.getServices();
        for(final Service s : _services) {
          _builder.append("    \t");
          _builder.append("Object ");
          String _name_2 = s.getName();
          String _firstLower = StringExtensions.toFirstLower(_name_2);
          _builder.append(_firstLower, "    	");
          _builder.append("Impl = new ");
          String _name_3 = s.getName();
          _builder.append(_name_3, "    	");
          _builder.append("Impl();");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("Endpoint.publish(address + \"");
          String _name_4 = s.getName();
          _builder.append(_name_4, "    	");
          _builder.append("\", ");
          String _name_5 = s.getName();
          String _firstLower_1 = StringExtensions.toFirstLower(_name_5);
          _builder.append(_firstLower_1, "    	");
          _builder.append("Impl);");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("        ");
      _builder.append("System.out.println(\"Server ready...\"); ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
