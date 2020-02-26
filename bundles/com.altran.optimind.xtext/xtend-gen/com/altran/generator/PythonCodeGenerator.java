package com.altran.generator;

import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.Setter;
import com.altran.optimind.model.workflow.TaskInput;
import com.altran.optimind.model.workflow.Workflow;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class PythonCodeGenerator {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Workflow workflow;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String pythonFilePath;
  
  public PythonCodeGenerator(final Workflow workflow, final String filePath) {
    this.workflow = workflow;
    this.pythonFilePath = filePath;
  }
  
  public void generate() {
    this.writeContent(this.generateFileContent());
  }
  
  public String generateFileContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.append("# MODULE IMPORT");
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.newLine();
    String _generateImports = this.generateImports();
    _builder.append(_generateImports);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.append("# ");
    String _name = this.workflow.getName();
    _builder.append(_name);
    _builder.append(" class");
    _builder.newLineIfNotEmpty();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.newLine();
    String _generateClassContent = this.generateClassContent();
    _builder.append(_generateClassContent);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# ==================================================================================================");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# to be done at runtime");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateClassContent() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def run_workflow():");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("This method is designed to create a workflow");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"\"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Load Library functions");
    _builder.newLine();
    _builder.append("\t");
    String _allLibraryFunction = this.getAllLibraryFunction();
    _builder.append(_allLibraryFunction, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    BaseTask rootBasetask = this.workflow.getBaseTask();
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Main Task");
    _builder.newLine();
    _builder.append("\t");
    String _addRootBaseTaskContent = this.addRootBaseTaskContent(rootBasetask);
    _builder.append(_addRootBaseTaskContent, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Create workflows");
    _builder.newLine();
    _builder.append("\t");
    String _taskTree = this.getTaskTree(rootBasetask);
    _builder.append(_taskTree, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Connect inputs and outputs");
    _builder.newLine();
    _builder.append("\t");
    String _createConnectionContent1 = this.createConnectionContent1();
    _builder.append(_createConnectionContent1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Fill setters");
    _builder.newLine();
    _builder.append("\t");
    String _createSetterContent = this.createSetterContent();
    _builder.append(_createSetterContent, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("# Return the workflow");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ");
    String _name = rootBasetask.getName();
    _builder.append(_name, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String getAllLibraryFunction() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function_manager = LibraryFunctionsManager()");
    _builder.newLine();
    EList<LibraryFunction> allLibraryFunction = this.workflow.getFunctions();
    _builder.newLineIfNotEmpty();
    {
      for(final LibraryFunction libraryFunction : allLibraryFunction) {
        String _name = libraryFunction.getName();
        _builder.append(_name);
        _builder.append(" = function_manager.get_library_function(\"");
        String _name_1 = libraryFunction.getName();
        _builder.append(_name_1);
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String addRootBaseTaskContent(final BaseTask rootBaseTask) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rootBaseTask.getName();
    _builder.append(_name);
    _builder.append(" = BaseTask(\"");
    String _name_1 = rootBaseTask.getName();
    _builder.append(_name_1);
    _builder.append("\", None, None)");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String getTaskTree(final BaseTask task) {
    StringConcatenation _builder = new StringConcatenation();
    EList<AbstractTask> childrenTasks = task.getChildren();
    _builder.newLineIfNotEmpty();
    {
      if ((!(childrenTasks == null))) {
        {
          for(final AbstractTask childTask : childrenTasks) {
            {
              if ((childTask instanceof BaseTask)) {
                String _name = ((BaseTask)childTask).getName();
                _builder.append(_name);
                _builder.append(" = BaseTask(\"");
                String _name_1 = ((BaseTask)childTask).getName();
                _builder.append(_name_1);
                _builder.append("\", ");
                String _name_2 = task.getName();
                _builder.append(_name_2);
                _builder.append(", None)");
                _builder.newLineIfNotEmpty();
                String _taskTree = this.getTaskTree(((BaseTask)childTask));
                _builder.append(_taskTree);
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((childTask instanceof LibraryTask)) {
                String _name_3 = ((LibraryTask)childTask).getName();
                _builder.append(_name_3);
                _builder.append(" = LibraryTask(\"");
                String _name_4 = ((LibraryTask)childTask).getName();
                _builder.append(_name_4);
                _builder.append("\",");
                String _name_5 = task.getName();
                _builder.append(_name_5);
                _builder.append(", None, ");
                String _name_6 = ((LibraryTask)childTask).getLibraryfunction().getName();
                _builder.append(_name_6);
                _builder.append("())");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if ((childTask instanceof CustomTask)) {
                _builder.append("#");
                String _name_7 = ((CustomTask)childTask).getName();
                _builder.append(_name_7);
                _builder.append(" = CustomTask(\"");
                String _name_8 = ((CustomTask)childTask).getName();
                _builder.append(_name_8);
                _builder.append("\",");
                String _name_9 = task.getName();
                _builder.append(_name_9);
                _builder.append(", None, ");
                String _runner = ((CustomTask)childTask).getRunner();
                _builder.append(_runner);
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String createConnectionContent(final BaseTask baseTask) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AbstractTask> _children = baseTask.getChildren();
      for(final AbstractTask childTask : _children) {
        {
          if ((childTask instanceof LibraryTask)) {
            {
              EList<TaskInput> _inputs = ((LibraryTask)childTask).getInputs();
              for(final TaskInput input : _inputs) {
                {
                  if ((input instanceof Connection)) {
                    String _name = this.workflow.getBaseTask().getName();
                    _builder.append(_name);
                    _builder.append(".create_connection(,");
                    String _name_1 = ((Connection)input).getTaskoutput().getName();
                    _builder.append(_name_1);
                    _builder.append(",");
                    String _name_2 = ((LibraryTask)childTask).getName();
                    _builder.append(_name_2);
                    _builder.append(",");
                    String _name_3 = ((Connection)input).getName();
                    _builder.append(_name_3);
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  if ((input instanceof Setter)) {
                    String _name_4 = this.workflow.getBaseTask().getName();
                    _builder.append(_name_4);
                    _builder.append(".add_setter(\"\",");
                    String _valueAsString = ((Setter)input).getValueAsString();
                    _builder.append(_valueAsString);
                    _builder.append(")");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          if ((childTask instanceof CustomTask)) {
          }
        }
        {
          if ((childTask instanceof BaseTask)) {
            String _createConnectionContent = this.createConnectionContent(((BaseTask)childTask));
            _builder.append(_createConnectionContent);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String createConnectionContent1() {
    StringConcatenation _builder = new StringConcatenation();
    List<Connection> allConnection = EcoreUtil2.<Connection>getAllContentsOfType(this.workflow, Connection.class);
    _builder.newLineIfNotEmpty();
    {
      for(final Connection connection : allConnection) {
        {
          if ((connection instanceof Connection)) {
            EObject _eContainer = connection.eContainer();
            AbstractTask connectionContainer = ((AbstractTask) _eContainer);
            _builder.newLineIfNotEmpty();
            EObject _eContainer_1 = connection.getTaskoutput().eContainer();
            AbstractTask outputContainer = ((AbstractTask) _eContainer_1);
            _builder.newLineIfNotEmpty();
            {
              EObject _eContainer_2 = connectionContainer.eContainer();
              EObject _eContainer_3 = outputContainer.eContainer();
              boolean _tripleEquals = (_eContainer_2 == _eContainer_3);
              if (_tripleEquals) {
                String _name = this.workflow.getBaseTask().getName();
                _builder.append(_name);
                _builder.append(".create_connection(");
                String _name_1 = outputContainer.getName();
                _builder.append(_name_1);
                _builder.append(", \"");
                String _name_2 = connection.getTaskoutput().getName();
                _builder.append(_name_2);
                _builder.append("\",");
                String _name_3 = connectionContainer.getName();
                _builder.append(_name_3);
                _builder.append(", \"");
                String _name_4 = connection.getName();
                _builder.append(_name_4);
                _builder.append("\" )");
                _builder.newLineIfNotEmpty();
              } else {
                EObject _eContainer_4 = connectionContainer.eContainer().eContainer();
                if ((_eContainer_4 instanceof Workflow)) {
                  String _name_5 = this.workflow.getBaseTask().getName();
                  _builder.append(_name_5);
                  _builder.append(".create_connection(");
                  EObject _eContainer_5 = outputContainer.eContainer();
                  String _name_6 = ((AbstractTask) _eContainer_5).getName();
                  _builder.append(_name_6);
                  _builder.append(", \"");
                  String _name_7 = outputContainer.getName();
                  String _plus = (_name_7 + ".");
                  String _name_8 = connection.getTaskoutput().getName();
                  String _plus_1 = (_plus + _name_8);
                  _builder.append(_plus_1);
                  _builder.append("\",");
                  String _name_9 = connectionContainer.getName();
                  _builder.append(_name_9);
                  _builder.append(", \"");
                  String _name_10 = connection.getName();
                  _builder.append(_name_10);
                  _builder.append("\" )");
                  _builder.newLineIfNotEmpty();
                } else {
                  EObject _eContainer_6 = outputContainer.eContainer().eContainer();
                  if ((_eContainer_6 instanceof Workflow)) {
                    String _name_11 = this.workflow.getBaseTask().getName();
                    _builder.append(_name_11);
                    _builder.append(".create_connection(");
                    String _name_12 = outputContainer.getName();
                    _builder.append(_name_12);
                    _builder.append(", \"");
                    String _name_13 = connection.getTaskoutput().getName();
                    _builder.append(_name_13);
                    _builder.append("\",");
                    EObject _eContainer_7 = connectionContainer.eContainer();
                    String _name_14 = ((AbstractTask) _eContainer_7).getName();
                    _builder.append(_name_14);
                    _builder.append(", \"");
                    String _name_15 = connectionContainer.getName();
                    String _plus_2 = (_name_15 + ".");
                    String _name_16 = connection.getName();
                    String _plus_3 = (_plus_2 + _name_16);
                    _builder.append(_plus_3);
                    _builder.append("\" )");
                    _builder.newLineIfNotEmpty();
                  } else {
                    EObject _eContainer_8 = connectionContainer.eContainer();
                    String _name_17 = connectionContainer.getName();
                    String _plus_4 = (_name_17 + ".");
                    String _name_18 = connection.getName();
                    String _plus_5 = (_plus_4 + _name_18);
                    EObject _eContainer_9 = outputContainer.eContainer();
                    String _name_19 = outputContainer.getName();
                    String _plus_6 = (_name_19 + ".");
                    String _name_20 = connection.getTaskoutput().getName();
                    String _plus_7 = (_plus_6 + _name_20);
                    String _checkNextParentBaseTask = this.checkNextParentBaseTask(((AbstractTask) _eContainer_8), _plus_5, 
                      ((AbstractTask) _eContainer_9), _plus_7);
                    _builder.append(_checkNextParentBaseTask);
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String checkNextParentBaseTask(final AbstractTask connectionParent, final String connectionExternalName, final AbstractTask outputParent, final String outputExternalName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _eContainer = connectionParent.eContainer();
      EObject _eContainer_1 = outputParent.eContainer();
      boolean _tripleEquals = (_eContainer == _eContainer_1);
      if (_tripleEquals) {
        String _name = this.workflow.getBaseTask().getName();
        _builder.append(_name);
        _builder.append(".create_connection(");
        String _name_1 = outputParent.getName();
        _builder.append(_name_1);
        _builder.append(", \"");
        _builder.append(outputExternalName);
        _builder.append("\",");
        String _name_2 = connectionParent.getName();
        _builder.append(_name_2);
        _builder.append(", \"");
        _builder.append(connectionExternalName);
        _builder.append("\" )");
        _builder.newLineIfNotEmpty();
      } else {
        EObject _eContainer_2 = connectionParent.eContainer().eContainer();
        if ((_eContainer_2 instanceof Workflow)) {
          String _name_3 = this.workflow.getBaseTask().getName();
          _builder.append(_name_3);
          _builder.append(".create_connection(");
          EObject _eContainer_3 = outputParent.eContainer();
          String _name_4 = ((AbstractTask) _eContainer_3).getName();
          _builder.append(_name_4);
          _builder.append(", \"");
          String _name_5 = outputParent.getName();
          String _plus = (_name_5 + ".");
          String _plus_1 = (_plus + outputExternalName);
          _builder.append(_plus_1);
          _builder.append("\",");
          String _name_6 = connectionParent.getName();
          _builder.append(_name_6);
          _builder.append(", \"");
          _builder.append(connectionExternalName);
          _builder.append("\" )");
          _builder.newLineIfNotEmpty();
        } else {
          EObject _eContainer_4 = outputParent.eContainer().eContainer();
          if ((_eContainer_4 instanceof Workflow)) {
            String _name_7 = this.workflow.getBaseTask().getName();
            _builder.append(_name_7);
            _builder.append(".create_connection(");
            String _name_8 = outputParent.getName();
            _builder.append(_name_8);
            _builder.append(", \"");
            _builder.append(outputExternalName);
            _builder.append("\",");
            EObject _eContainer_5 = connectionParent.eContainer();
            String _name_9 = ((AbstractTask) _eContainer_5).getName();
            _builder.append(_name_9);
            _builder.append(", \"");
            String _name_10 = connectionParent.getName();
            String _plus_2 = (_name_10 + ".");
            String _plus_3 = (_plus_2 + connectionExternalName);
            _builder.append(_plus_3);
            _builder.append("\" )");
            _builder.newLineIfNotEmpty();
          } else {
            EObject _eContainer_6 = connectionParent.eContainer();
            String _name_11 = connectionParent.getName();
            String _plus_4 = (_name_11 + ".");
            String _plus_5 = (_plus_4 + connectionExternalName);
            EObject _eContainer_7 = outputParent.eContainer();
            String _name_12 = outputParent.getName();
            String _plus_6 = (_name_12 + ".");
            String _plus_7 = (_plus_6 + outputExternalName);
            String _checkNextParentBaseTask = this.checkNextParentBaseTask(((AbstractTask) _eContainer_6), _plus_5, 
              ((AbstractTask) _eContainer_7), _plus_7);
            _builder.append(_checkNextParentBaseTask);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String createSetterContent() {
    StringConcatenation _builder = new StringConcatenation();
    List<Setter> allSetter = EcoreUtil2.<Setter>getAllContentsOfType(this.workflow, Setter.class);
    _builder.newLineIfNotEmpty();
    {
      for(final Setter setter : allSetter) {
        String externalName = setter.getName();
        _builder.append("\t\t\t\t");
        Iterable<EObject> containers = EcoreUtil2.getAllContainers(setter);
        _builder.newLineIfNotEmpty();
        int i = 0;
        _builder.newLineIfNotEmpty();
        for (i = 0; (i < (IterableExtensions.size(containers) - 2)); i++) {
          {
            final Iterable<EObject> _converted_containers = (Iterable<EObject>)containers;
            EObject _get = ((EObject[])Conversions.unwrapArray(_converted_containers, EObject.class))[i];
            AbstractTask task = ((AbstractTask) _get);
            String _name = task.getName();
            String _plus = (_name + ".");
            String _plus_1 = (_plus + externalName);
            externalName = _plus_1;
          }
        }
        _builder.newLineIfNotEmpty();
        String _name = this.workflow.getBaseTask().getName();
        _builder.append(_name);
        _builder.append(".add_setter(\"");
        _builder.append(externalName);
        _builder.append("\",");
        String _valueAsString = setter.getValueAsString();
        _builder.append(_valueAsString);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public void writeContent(final String content) {
    try {
      PrintWriter writer = null;
      FileWriter _fileWriter = new FileWriter(this.pythonFilePath);
      BufferedWriter _bufferedWriter = new BufferedWriter(_fileWriter);
      PrintWriter _printWriter = new PrintWriter(_bufferedWriter);
      writer = _printWriter;
      writer.write(content);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public Workflow getWorkflow() {
    return this.workflow;
  }
  
  @Pure
  public String getPythonFilePath() {
    return this.pythonFilePath;
  }
}
