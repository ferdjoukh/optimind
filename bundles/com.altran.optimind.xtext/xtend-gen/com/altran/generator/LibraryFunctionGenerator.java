package com.altran.generator;

import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.Input;
import com.altran.optimind.model.workflow.Language;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.Setter;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.Workflow;
import com.google.common.base.Objects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
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
  
  public String createLibFunctionFile(final LibraryFunction function) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(this.language, Language.PYTHON);
    if (_equals) {
      String _generateFilePythonContent = this.generateFilePythonContent(function);
      String _name = function.getName();
      String _plus = (this.libraryFunctionPackagePath + _name);
      String _plus_1 = (_plus + ".");
      String _plus_2 = (_plus_1 + "py");
      this.writeContent(_generateFilePythonContent, _plus_2);
    } else {
      String _xblockexpression = null;
      {
        String _generateFileJavaContent = this.generateFileJavaContent(function);
        String _name_1 = function.getName();
        String _plus_3 = (this.libraryFunctionPackagePath + _name_1);
        String _plus_4 = (_plus_3 + ".");
        String _plus_5 = (_plus_4 + "java");
        this.writeContent(_generateFileJavaContent, _plus_5);
        _xblockexpression = this.generateTaskFile(this.workflow.getBaseTask());
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public String generateLibraryTaskFile(final LibraryTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// MODULE IMPORT");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    String _name = task.getName();
    _builder.append(_name, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//All Inputs ");
    _builder.newLine();
    _builder.append("\t\t");
    List<Setter> allSetter = EcoreUtil2.<Setter>getAllContentsOfType(task, Setter.class);
    _builder.newLineIfNotEmpty();
    {
      for(final Setter setter : allSetter) {
        _builder.append("\t\t");
        _builder.append("private ");
        String _typeAsString = setter.getTypeAsString();
        _builder.append(_typeAsString, "\t\t");
        _builder.append(" ");
        String _name_1 = setter.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(" = ");
        String _valueAsString = setter.getValueAsString();
        _builder.append(_valueAsString, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public void set_");
        String _name_2 = setter.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("(");
        String _typeAsString_1 = setter.getTypeAsString();
        _builder.append(_typeAsString_1, "\t\t");
        _builder.append(" value) {this.");
        String _name_3 = setter.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(" = value;} ; \t\t\t\t\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public ");
        String _typeAsString_2 = setter.getTypeAsString();
        _builder.append(_typeAsString_2, "\t\t");
        _builder.append(" get_");
        String _name_4 = setter.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("() {return this.");
        String _name_5 = setter.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(";}; ");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//All Outputs ");
    _builder.newLine();
    {
      EList<TaskOutput> _outputs = task.getOutputs();
      for(final TaskOutput otput : _outputs) {
        _builder.append("\t\t");
        _builder.append("private ");
        String _typeAsString_3 = otput.getTypeAsString();
        _builder.append(_typeAsString_3, "\t\t");
        _builder.append(" ");
        String _name_6 = otput.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(" = ");
        String _name_7 = task.getLibraryfunction().getName();
        _builder.append(_name_7, "\t\t");
        _builder.append(".");
        String _name_8 = otput.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public void set_");
        String _name_9 = otput.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("(");
        String _typeAsString_4 = otput.getTypeAsString();
        _builder.append(_typeAsString_4, "\t\t");
        _builder.append(" value) {this.");
        String _name_10 = otput.getName();
        _builder.append(_name_10, "\t\t");
        _builder.append(" = value;} ; \t\t\t\t\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public ");
        String _typeAsString_5 = otput.getTypeAsString();
        _builder.append(_typeAsString_5, "\t\t");
        _builder.append(" get_");
        String _name_11 = otput.getName();
        _builder.append(_name_11, "\t\t");
        _builder.append("() {return this.");
        String _name_12 = otput.getName();
        _builder.append(_name_12, "\t\t");
        _builder.append(";}; ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    List<Connection> allConnection = EcoreUtil2.<Connection>getAllContentsOfType(task, Connection.class);
    _builder.newLineIfNotEmpty();
    {
      for(final Connection connection : allConnection) {
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void run(){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//Write you code here to execute ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateTaskFile(final BaseTask task) {
    Object _xblockexpression = null;
    {
      EList<AbstractTask> childrenTasks = task.getChildren();
      Object _xifexpression = null;
      if ((childrenTasks != null)) {
        for (final EObject childTask : childrenTasks) {
          {
            if ((childTask instanceof BaseTask)) {
              String _generateBaseTaskFile = this.generateBaseTaskFile(((BaseTask)childTask));
              String _name = ((BaseTask)childTask).getName();
              String _plus = (this.libraryFunctionPackagePath + _name);
              String _plus_1 = (_plus + ".");
              String _plus_2 = (_plus_1 + "java");
              this.writeContent(_generateBaseTaskFile, _plus_2);
              this.generateTaskFile(((BaseTask)childTask));
            }
            if ((childTask instanceof LibraryTask)) {
              String _generateLibraryTaskFile = this.generateLibraryTaskFile(((LibraryTask)childTask));
              String _name_1 = ((LibraryTask)childTask).getName();
              String _plus_3 = (this.libraryFunctionPackagePath + _name_1);
              String _plus_4 = (_plus_3 + ".");
              String _plus_5 = (_plus_4 + "java");
              this.writeContent(_generateLibraryTaskFile, _plus_5);
            }
          }
        }
      }
      _xblockexpression = _xifexpression;
    }
    return ((String)_xblockexpression);
  }
  
  public String generateBaseTaskFile(final BaseTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// MODULE IMPORT");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public class ");
    String _name = task.getName();
    _builder.append(_name, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("// ==================================================================================================");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
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
    _builder.append(" (Object task) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Write your code after this line ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final Input input_1 : inputs) {
        _builder.append(" public void set_");
        String _name_2 = input_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("(");
        String _typeAsString_1 = input_1.getTypeAsString();
        _builder.append(_typeAsString_1, "\t");
        _builder.append(" value) {this.");
        String _name_3 = input_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" = value;} ");
        {
          if ((this.cammaCounter < (size - 1))) {
            this.increamentCammaCounter();
            _builder.append("  ");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      for(final Input input_2 : inputs) {
        _builder.append(" public ");
        String _typeAsString_2 = input_2.getTypeAsString();
        _builder.append(_typeAsString_2, "\t");
        _builder.append(" get_");
        String _name_4 = input_2.getName();
        _builder.append(_name_4, "\t");
        _builder.append("() {return this.");
        String _name_5 = input_2.getName();
        _builder.append(_name_5, "\t");
        _builder.append(";} ");
        {
          if ((this.cammaCounter < (size - 1))) {
            this.increamentCammaCounter();
            _builder.append(" ");
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
