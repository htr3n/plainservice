package at.ac.univie.cs.swa.soa.generator;

import at.ac.univie.cs.swa.soa.sdl.Node;
import at.ac.univie.cs.swa.soa.sdl.SDL;
import at.ac.univie.cs.swa.soa.sdl.Service;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ServerGenerator {
  public Object generateServer(final IFileSystemAccess fsa, final SDL dsl) {
    Object _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      String _replace = _lowerCase.replace(".", File.separator);
      final String packagePath = _replace;
      EList<Node> _nodes = dsl.getNodes();
      final EList<Node> nodes = _nodes;
      Object _xifexpression = null;
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(nodes, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        boolean _isEmpty = nodes.isEmpty();
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
      }
      if (_operator_and) {
        for (final Node node : nodes) {
          boolean _operator_and_1 = false;
          String _name_1 = node.getName();
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_name_1, null);
          if (!_operator_notEquals_1) {
            _operator_and_1 = false;
          } else {
            String _name_2 = node.getName();
            boolean _isEmpty_1 = _name_2.isEmpty();
            boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
            _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_1, _operator_not_1);
          }
          if (_operator_and_1) {
            {
              String _name_3 = node.getName();
              String _replace_1 = _name_3.replace("^", "");
              final String hostName = _replace_1;
              String _operator_plus = StringExtensions.operator_plus(packagePath, File.separator);
              String _firstUpper = StringExtensions.toFirstUpper(hostName);
              String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _firstUpper);
              String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, "Server.java");
              final String file = _operator_plus_2;
              CharSequence _generate = this.generate(dsl, node);
              fsa.generateFile(file, _generate);
            }
          }
        }
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence generate(final SDL dsl, final Node node) {
    CharSequence _xblockexpression = null;
    {
      String _name = dsl.getName();
      String _lowerCase = _name.toLowerCase();
      final String packageName = _lowerCase;
      String _name_1 = node.getName();
      String _replace = _name_1.replace("^", "");
      String _firstUpper = StringExtensions.toFirstUpper(_replace);
      String _operator_plus = StringExtensions.operator_plus(_firstUpper, "Server");
      final String className = _operator_plus;
      String _baseURI = node.getBaseURI();
      String address = _baseURI;
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(address, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        boolean _isEmpty = address.isEmpty();
        boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_not);
      }
      if (_operator_and) {
        {
          int _length = address.length();
          int _operator_minus = IntegerExtensions.operator_minus(_length, 1);
          String _substring = address.substring(_operator_minus);
          final String endingSlash = _substring;
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(endingSlash, "/");
          if (_operator_notEquals_1) {
            String _operator_plus_1 = StringExtensions.operator_plus(address, "/");
            address = _operator_plus_1;
          }
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
