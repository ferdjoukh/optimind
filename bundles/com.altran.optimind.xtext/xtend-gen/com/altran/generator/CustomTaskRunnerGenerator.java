package com.altran.generator;

import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.Language;
import com.altran.optimind.model.workflow.Setter;
import com.altran.optimind.model.workflow.TaskInput;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.Workflow;
import com.google.common.base.Objects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CustomTaskRunnerGenerator {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Workflow workflow;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String scriptsPackagePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private int cammaCounter = 0;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Language language;
  
  public CustomTaskRunnerGenerator(final Workflow workflow, final String path, final Language lang) {
    this.workflow = workflow;
    this.scriptsPackagePath = path;
    this.language = lang;
  }
  
  public void generate() {
    List<CustomTask> allCustomTasks = EcoreUtil2.<CustomTask>getAllContentsOfType(this.workflow, CustomTask.class);
    for (final CustomTask task : allCustomTasks) {
      {
        this.createCustomTaskRunnerFile(task);
        this.cammaCounter = 0;
      }
    }
  }
  
  public void createCustomTaskRunnerFile(final CustomTask task) {
    boolean _equals = Objects.equal(this.language, Language.PYTHON);
    if (_equals) {
      String _generateFileContent = this.generateFileContent(task);
      String _name = task.getName();
      String _plus = (this.scriptsPackagePath + _name);
      String _plus_1 = (_plus + ".");
      String _plus_2 = (_plus_1 + "py");
      this.writeContent(_generateFileContent, _plus_2);
    } else {
      String _generateLibraryTaskFile = this.generateLibraryTaskFile(task);
      String _name_1 = task.getName();
      String _plus_3 = (this.scriptsPackagePath + _name_1);
      String _plus_4 = (_plus_3 + ".");
      String _plus_5 = (_plus_4 + "java");
      this.writeContent(_generateLibraryTaskFile, _plus_5);
    }
  }
  
  public String generateLibraryTaskFile(final CustomTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package scripts;");
    _builder.newLine();
    _builder.append("import java.io.File;");
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
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
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
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public void set_");
        String _name_7 = otput.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("(");
        String _typeAsString_4 = otput.getTypeAsString();
        _builder.append(_typeAsString_4, "\t\t");
        _builder.append(" value) {this.");
        String _name_8 = otput.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append(" = value;} ; \t\t\t\t\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("public ");
        String _typeAsString_5 = otput.getTypeAsString();
        _builder.append(_typeAsString_5, "\t\t");
        _builder.append(" get_");
        String _name_9 = otput.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("() {return this.");
        String _name_10 = otput.getName();
        _builder.append(_name_10, "\t\t");
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public void run(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Write your code after this line");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateFileContent(final CustomTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.append("# MODULE IMPORT");
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.append("# Custom Task Runner");
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    EList<TaskInput> inputs = task.getInputs();
    _builder.newLineIfNotEmpty();
    int size = inputs.size();
    _builder.newLineIfNotEmpty();
    _builder.append("def ");
    String _name = task.getName();
    _builder.append(_name);
    _builder.append(" (");
    {
      for(final TaskInput input : inputs) {
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
    _builder.append("This Runner is designed to perform the operation \"");
    String _runner = task.getRunner();
    _builder.append(_runner, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      for(final TaskInput input_1 : inputs) {
        _builder.append("\t");
        _builder.append(":param ");
        String _name_2 = input_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(": description");
        _builder.newLineIfNotEmpty();
        {
          if ((input_1 instanceof Setter)) {
            _builder.append("\t");
            _builder.append(":type  ");
            String _name_3 = ((Setter)input_1).getName();
            _builder.append(_name_3, "\t");
            _builder.append(": ");
            String _typeAsString = ((Setter)input_1).getTypeAsString();
            _builder.append(_typeAsString, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            if ((input_1 instanceof Connection)) {
              _builder.append("\t");
              _builder.append(":type  ");
              String _name_4 = ((Connection)input_1).getName();
              _builder.append(_name_4, "\t");
              _builder.append(": ");
              String _typeAsString_1 = ((Connection)input_1).getTaskoutput().getTypeAsString();
              _builder.append(_typeAsString_1, "\t");
              _builder.append("\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    EList<TaskOutput> output = task.getOutputs();
    _builder.newLineIfNotEmpty();
    {
      boolean _isEmpty = output.isEmpty();
      if (_isEmpty) {
        _builder.append("\t");
        _builder.append("# Write your code after this line ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\"\"\"");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append(":return ");
        String _typeAsString_2 = output.get(0).getTypeAsString();
        _builder.append(_typeAsString_2, "\t");
        _builder.append(": results Description");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(":rtype ");
        String _typeAsString_3 = output.get(0).getTypeAsString();
        _builder.append(_typeAsString_3, "\t");
        _builder.append(": ");
        String _typeAsString_4 = task.getOutputs().get(0).getTypeAsString();
        _builder.append(_typeAsString_4, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\"\"\"");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("# Write your code after this line ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return ");
        String _typeAsString_5 = output.get(0).getTypeAsString();
        _builder.append(_typeAsString_5, "\t");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
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
  
  @Pure
  public Workflow getWorkflow() {
    return this.workflow;
  }
  
  @Pure
  public String getScriptsPackagePath() {
    return this.scriptsPackagePath;
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
