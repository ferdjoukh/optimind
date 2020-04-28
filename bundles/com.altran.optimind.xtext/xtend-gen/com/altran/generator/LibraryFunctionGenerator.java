package com.altran.generator;

import com.altran.optimind.model.workflow.Input;
import com.altran.optimind.model.workflow.Language;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.Workflow;
import com.google.common.base.Objects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class LibraryFunctionGenerator {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Workflow workflow;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String libraryFunctionPackagePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private int cammaCounter = 0;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Language language;
  
  public LibraryFunctionGenerator(final Workflow workflow, final String path, final Language language) {
    this.workflow = workflow;
    this.libraryFunctionPackagePath = path;
    this.language = language;
  }
  
  public void generate() {
    EList<EObject> children = this.workflow.eContents();
    for (final EObject child : children) {
      if ((child instanceof LibraryFunction)) {
        this.createLibFunctionFile(((LibraryFunction)child));
        this.cammaCounter = 0;
      }
    }
  }
  
  public void createLibFunctionFile(final LibraryFunction function) {
    boolean _equals = Objects.equal(this.language, Language.PYTHON);
    if (_equals) {
      String _generateFilePythonContent = this.generateFilePythonContent(function);
      String _name = function.getName();
      String _plus = (this.libraryFunctionPackagePath + _name);
      String _plus_1 = (_plus + ".");
      String _plus_2 = (_plus_1 + "py");
      this.writeContent(_generateFilePythonContent, _plus_2);
    } else {
      String _generateFileJavaContent = this.generateFileJavaContent(function);
      String _name_1 = function.getName();
      String _plus_3 = (this.libraryFunctionPackagePath + _name_1);
      String _plus_4 = (_plus_3 + ".");
      String _plus_5 = (_plus_4 + "java");
      this.writeContent(_generateFileJavaContent, _plus_5);
    }
    this.writeContent(this.generateBaseTaskClass(), (this.libraryFunctionPackagePath + "BaseTask.java"));
    this.writeContent(this.generateLibraryTaskClass(), (this.libraryFunctionPackagePath + "LibraryTask.java"));
  }
  
  public String generateBaseTaskClass() {
    StringConcatenation _builder = new StringConcatenation();
    EList<LibraryFunction> allLibraryFunction = this.workflow.getFunctions();
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class BaseTask {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String m_nameBaseTask; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<LibraryTask> m_listTask; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public BaseTask(String name, Object nullObject1, Object nullObject2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.m_nameBaseTask = name ; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.m_listTask = new ArrayList<LibraryTask>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addTaskToList(LibraryTask task)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("m_listTask.add(task); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void add_setter(String nameLibrary, int value)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void create_connection(LibraryTask task1, String variableName, LibraryTask task2, String variableName2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void create_connection(BaseTask task1, String variableName, LibraryTask task2, String variableName2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateLibraryTaskClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class LibraryTask {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String m_nameTask ; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BaseTask m_baseTaskParent; ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object m_libraryFunction;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public LibraryTask(String name, BaseTask baseTask, Object nullObject, Object libraryFunction)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.m_nameTask = name ; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.m_baseTaskParent = baseTask ; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.m_libraryFunction = libraryFunction; ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateFileJavaContent(final LibraryFunction libfunction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("// MODULE IMPORT");
    _builder.newLine();
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    EList<Input> inputs = libfunction.getInputs();
    _builder.newLineIfNotEmpty();
    int size = inputs.size();
    _builder.newLineIfNotEmpty();
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("public class ");
    String _name = libfunction.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    String outputName = libfunction.getOutputs().get(0).getName();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      for(final Input input : inputs) {
        String _typeAsString = input.getTypeAsString();
        _builder.append(_typeAsString, "\t");
        _builder.append(" ");
        String _name_1 = input.getName();
        _builder.append(_name_1, "\t");
        {
          if ((this.cammaCounter < size)) {
            this.increamentCammaCounter();
            _builder.append(";");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    int size1 = inputs.size();
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    this.reInitCammaCounter();
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static int ");
    _builder.append(outputName, "\t");
    _builder.append(" (");
    {
      for(final Input input_1 : inputs) {
        _builder.append(" ");
        String _typeAsString_1 = input_1.getTypeAsString();
        _builder.append(_typeAsString_1, "\t");
        _builder.append(" ");
        String _name_2 = input_1.getName();
        _builder.append(_name_2, "\t");
        {
          if ((this.cammaCounter < (size1 - 1))) {
            this.increamentCammaCounter();
            _builder.append(",");
          }
        }
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Write your code after this line ");
    _builder.newLine();
    _builder.append("\t\t");
    int size2 = inputs.size();
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    this.reInitCammaCounter();
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    _builder.append(outputName, "\t\t");
    _builder.append("(");
    {
      for(final Input input_2 : inputs) {
        _builder.append(" ");
        String _name_3 = input_2.getName();
        _builder.append(_name_3, "\t\t");
        {
          if ((this.cammaCounter < (size2 - 1))) {
            this.increamentCammaCounter();
            _builder.append(",");
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final Input input_3 : inputs) {
        _builder.append(" public void set_");
        String _name_4 = input_3.getName();
        _builder.append(_name_4, "\t");
        _builder.append("(");
        String _typeAsString_2 = input_3.getTypeAsString();
        _builder.append(_typeAsString_2, "\t");
        _builder.append(" value) {this.");
        String _name_5 = input_3.getName();
        _builder.append(_name_5, "\t");
        _builder.append(" = value;} ");
        {
          if ((this.cammaCounter < (size - 1))) {
            this.increamentCammaCounter();
            _builder.append(" \\n ");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final Input input_4 : inputs) {
        _builder.append(" public ");
        String _typeAsString_3 = input_4.getTypeAsString();
        _builder.append(_typeAsString_3, "\t");
        _builder.append(" get_");
        String _name_6 = input_4.getName();
        _builder.append(_name_6, "\t");
        _builder.append("() {return this.");
        String _name_7 = input_4.getName();
        _builder.append(_name_7, "\t");
        _builder.append(";} ");
        {
          if ((this.cammaCounter < (size - 1))) {
            this.increamentCammaCounter();
            _builder.append(" \\n ");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateFilePythonContent(final LibraryFunction libfunction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.append("# Library Functions");
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    EList<Input> inputs = libfunction.getInputs();
    _builder.newLineIfNotEmpty();
    int size = inputs.size();
    _builder.newLineIfNotEmpty();
    _builder.append("def ");
    String _name = libfunction.getName();
    _builder.append(_name);
    _builder.append(" (");
    {
      for(final Input input : inputs) {
        _builder.append(" ");
        String _name_1 = input.getName();
        _builder.append(_name_1);
        {
          if ((this.cammaCounter < (size - 1))) {
            this.increamentCammaCounter();
            _builder.append(",");
          }
        }
      }
    }
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("This Library Function is designed to perform the operation \"");
    String _function = libfunction.getFunction();
    _builder.append(_function, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      for(final Input input_1 : inputs) {
        _builder.append("\t");
        _builder.append(":param ");
        String _name_2 = input_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(": description");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(":type ");
        String _name_3 = input_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append(": ");
        String _typeAsString = input_1.getTypeAsString();
        _builder.append(_typeAsString, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    String outputName = libfunction.getOutputs().get(0).getName();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(":return ");
    _builder.append(outputName, "\t");
    _builder.append(": results Description");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(":rtype ");
    _builder.append(outputName, "\t");
    _builder.append(": ");
    String _typeAsString_1 = libfunction.getOutputs().get(0).getTypeAsString();
    _builder.append(_typeAsString_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Write your code after this line ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    _builder.append(outputName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    return _builder.toString();
  }
  
  public void writeContent(final String content, final String path) {
    try {
      PrintWriter writer = null;
      FileWriter _fileWriter = new FileWriter(path);
      BufferedWriter _bufferedWriter = new BufferedWriter(_fileWriter);
      PrintWriter _printWriter = new PrintWriter(_bufferedWriter);
      writer = _printWriter;
      writer.write(content);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void increamentCammaCounter() {
    this.cammaCounter++;
  }
  
  public void reInitCammaCounter() {
    this.cammaCounter = 0;
  }
  
  @Pure
  public Workflow getWorkflow() {
    return this.workflow;
  }
  
  @Pure
  public String getLibraryFunctionPackagePath() {
    return this.libraryFunctionPackagePath;
  }
  
  @Pure
  public int getCammaCounter() {
    return this.cammaCounter;
  }
  
  @Pure
  public Language getLanguage() {
    return this.language;
  }
}
