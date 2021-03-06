package com.altran.generator;

import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.Setter;
import com.altran.optimind.model.workflow.TaskInput;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.Workflow;
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
  
  public CustomTaskRunnerGenerator(final Workflow workflow, final String path) {
    this.workflow = workflow;
    this.scriptsPackagePath = path;
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
    String _generateFileContent = this.generateFileContent(task);
    String _name = task.getName();
    String _plus = (this.scriptsPackagePath + _name);
    String _plus_1 = (_plus + ".");
    String _plus_2 = (_plus_1 + "py");
    this.writeContent(_generateFileContent, _plus_2);
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
}
