package com.altran.graphs;

import com.altran.optimind.model.workflow.AbstractStatement;
import com.altran.optimind.model.workflow.AbstractTask;
import com.altran.optimind.model.workflow.BaseTask;
import com.altran.optimind.model.workflow.Connection;
import com.altran.optimind.model.workflow.CustomTask;
import com.altran.optimind.model.workflow.ForStatement;
import com.altran.optimind.model.workflow.IfStatement;
import com.altran.optimind.model.workflow.LibraryTask;
import com.altran.optimind.model.workflow.SimpleTask;
import com.altran.optimind.model.workflow.TaskInput;
import com.altran.optimind.model.workflow.TaskOutput;
import com.altran.optimind.model.workflow.WhileStatement;
import com.altran.optimind.model.workflow.Workflow;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.osgi.framework.Bundle;

@Accessors
@SuppressWarnings("all")
public class DotGraphGenerator {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String workflowFilePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String dotFilePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String pngFilePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private String pdfFilePath;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Workflow workflow;
  
  private Bundle bundle = Platform.getBundle("com.altran.optimind.xtext");
  
  private String bundlePath = this.bundle.getLocation();
  
  private String dotCommandWindows = "graphviz\\release\\bin\\dot.exe";
  
  private int cluster = 0;
  
  private int ifelse = 0;
  
  public DotGraphGenerator(final String filePath) {
    String _get = this.bundlePath.split("file:")[1];
    String _plus = (_get + this.dotCommandWindows);
    this.dotCommandWindows = _plus;
    this.workflowFilePath = filePath;
    String name = null;
    boolean _contains = this.workflowFilePath.contains(".");
    if (_contains) {
      int last = this.workflowFilePath.lastIndexOf(".");
      name = this.workflowFilePath.substring(0, last);
    } else {
      name = this.workflowFilePath;
    }
    this.dotFilePath = (name + ".dot");
    this.pngFilePath = (name + ".png");
    this.pdfFilePath = (name + ".pdf");
  }
  
  public DotGraphGenerator(final String filePath, final Workflow workflow) {
    String _get = this.bundlePath.split("file:")[1];
    String _plus = (_get + this.dotCommandWindows);
    this.dotCommandWindows = _plus;
    this.workflow = workflow;
    this.workflowFilePath = filePath;
    String name = null;
    boolean _contains = this.workflowFilePath.contains(".");
    if (_contains) {
      int last = this.workflowFilePath.lastIndexOf(".");
      name = this.workflowFilePath.substring(0, last);
    } else {
      name = this.workflowFilePath;
    }
    this.dotFilePath = (name + ".dot");
    this.pngFilePath = (name + ".png");
    this.pdfFilePath = (name + ".pdf");
  }
  
  public boolean doesWorkflowExists() throws FileNotFoundException {
    File workflow = new File(this.workflowFilePath);
    boolean _exists = workflow.exists();
    if (_exists) {
      return true;
    } else {
      throw new FileNotFoundException((this.workflowFilePath + " does not exist or not file"));
    }
  }
  
  public boolean correctExtensionForWorkflow() throws IllegalArgumentException {
    if (((this.workflowFilePath.endsWith("workflow") || this.workflowFilePath.endsWith("optimind")) || this.workflowFilePath.endsWith("xmi"))) {
      return true;
    }
    throw new IllegalArgumentException((this.workflowFilePath + " has an incorrect file extension"));
  }
  
  public void createDotFile() throws IOException {
    System.out.println(this.bundlePath);
    if ((this.doesWorkflowExists() && this.correctExtensionForWorkflow())) {
      PrintWriter writer = null;
      FileWriter _fileWriter = new FileWriter(this.dotFilePath);
      BufferedWriter _bufferedWriter = new BufferedWriter(_fileWriter);
      PrintWriter _printWriter = new PrintWriter(_bufferedWriter);
      writer = _printWriter;
      writer.write(this.generateGraphContent(this.workflow));
      writer.close();
      this.createPngFile(this.dotFilePath, this.pngFilePath);
      this.createPdfFile(this.dotFilePath, this.pdfFilePath);
    }
  }
  
  public void createPdfFile(final String dot, final String pdf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.dotCommandWindows);
    _builder.append(" -Tpdf ");
    _builder.append(dot);
    _builder.append(" -o ");
    _builder.append(pdf);
    String cmd = _builder.toString();
    try {
      Runtime.getRuntime().exec(cmd);
      System.out.println((("[OK] " + pdf) + " file generated"));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println((("[NOK] " + pdf) + " file was not generated"));
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void createPngFile(final String dot, final String png) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.dotCommandWindows);
    _builder.append(" -Tpng ");
    _builder.append(dot);
    _builder.append(" -o ");
    _builder.append(png);
    String cmd = _builder.toString();
    try {
      Runtime.getRuntime().exec(cmd);
      System.out.println((("[OK] " + png) + " file generated"));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println((("[NOK] " + png) + " file was not generated"));
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String generateGraphContent(final Workflow workflow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph ");
    String _name = workflow.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    String _generateCluster = this.generateCluster(workflow.getBaseTask());
    _builder.append(_generateCluster, "\t\t\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//Connections");
    _builder.newLine();
    _builder.append("\t\t\t");
    List<Connection> allConnections = EcoreUtil2.<Connection>getAllContentsOfType(workflow, Connection.class);
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      for(final Connection connection : allConnections) {
        _builder.append("\t\t\t");
        EObject _eContainer = connection.eContainer();
        AbstractTask inputTask = ((AbstractTask) _eContainer);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        String inputRef = connection.getName();
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        EObject _eContainer_1 = connection.getTaskoutput().eContainer();
        AbstractTask outputTask = ((AbstractTask) _eContainer_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        String outputRef = connection.getTaskoutput().getName();
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        String _name_1 = outputTask.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append(":");
        _builder.append(outputRef, "\t\t\t");
        _builder.append(" -> ");
        String _name_2 = inputTask.getName();
        _builder.append(_name_2, "\t\t\t");
        _builder.append(":");
        _builder.append(inputRef, "\t\t\t");
        _builder.append(" ; \t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    return _builder.toString();
  }
  
  public String generateCluster(final AbstractTask baseTask) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("subgraph cluster");
    int _plusPlus = this.cluster++;
    _builder.append(_plusPlus);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("style=filled;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fillcolor=white;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color=blue;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin=20;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("label = \"");
    String _name = baseTask.getName();
    _builder.append(_name, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Children");
    _builder.newLine();
    {
      if ((baseTask instanceof BaseTask)) {
        {
          EList<AbstractTask> _children = ((BaseTask)baseTask).getChildren();
          for(final AbstractTask task : _children) {
            {
              if ((task instanceof BaseTask)) {
                _builder.append("\t");
                String _generateCluster = this.generateCluster(task);
                _builder.append(_generateCluster, "\t");
                _builder.newLineIfNotEmpty();
              } else {
                if ((task instanceof AbstractStatement)) {
                  _builder.append("\t");
                  CharSequence _generateStatementCluster = this.generateStatementCluster(((AbstractStatement)task));
                  _builder.append(_generateStatementCluster, "\t");
                  _builder.newLineIfNotEmpty();
                } else {
                  _builder.append("\t");
                  CharSequence _generateTask = this.generateTask(task);
                  _builder.append(_generateTask, "\t");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      } else {
        if ((baseTask instanceof AbstractStatement)) {
          _builder.append("\t");
          CharSequence _generateStatementCluster_1 = this.generateStatementCluster(((AbstractStatement)baseTask));
          _builder.append(_generateStatementCluster_1, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public CharSequence generateTask(final AbstractTask task) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = task.getName();
    _builder.append(_name);
    _builder.append(" [shape=none,style=filled,color=black,fillcolor=none,label = <");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("<TABLE BORDER=\"0\" CELLBORDER=\"1\" CELLSPACING=\"4\" CELLPADDING=\"4\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<TR><TD BORDER=\"0\"></TD>");
    CharSequence _taskInputsHTML = this.taskInputsHTML(task);
    _builder.append(_taskInputsHTML, "\t\t\t\t\t");
    _builder.append(" <TD BORDER=\"0\"></TD></TR>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.append("<TR><TD BGCOLOR=\"gray\" COLSPAN=\"");
    int _maxIO = this.maxIO(task);
    int _plus = (_maxIO + 2);
    _builder.append(_plus, "\t\t\t\t\t");
    _builder.append("\">");
    String _name_1 = task.getName();
    _builder.append(_name_1, "\t\t\t\t\t");
    _builder.append("</TD></TR>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    {
      if ((task instanceof LibraryTask)) {
        _builder.append("\t\t\t\t\t");
        _builder.append("<TR><TD BGCOLOR=\"blue\" COLSPAN=\"");
        int _maxIO_1 = this.maxIO(task);
        int _plus_1 = (_maxIO_1 + 2);
        _builder.append(_plus_1, "\t\t\t\t\t");
        _builder.append("\">");
        String _name_2 = ((LibraryTask)task).getLibraryfunction().getName();
        _builder.append(_name_2, "\t\t\t\t\t");
        _builder.append("</TD></TR>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    {
      if ((task instanceof CustomTask)) {
        _builder.append("\t\t\t\t\t");
        _builder.append("<TR><TD BGCOLOR=\"lightblue\" COLSPAN=\"");
        int _maxIO_2 = this.maxIO(task);
        int _plus_2 = (_maxIO_2 + 2);
        _builder.append(_plus_2, "\t\t\t\t\t");
        _builder.append("\">");
        String _runner = ((CustomTask)task).getRunner();
        _builder.append(_runner, "\t\t\t\t\t");
        _builder.append("</TD></TR>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<TR><TD BORDER=\"0\"></TD>");
    CharSequence _taskOutputsHTML = this.taskOutputsHTML(task);
    _builder.append(_taskOutputsHTML, "\t\t\t\t\t");
    _builder.append(" <TD BORDER=\"0\"></TD></TR>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("</TABLE>>]; ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStatementCluster(final AbstractStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("subgraph cluster");
    int _plusPlus = this.cluster++;
    _builder.append(_plusPlus);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("style=rounded;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fillcolor=white;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("color=red;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin=20;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("label = \"");
    {
      if ((statement instanceof ForStatement)) {
        _builder.append("For\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      } else {
        if ((statement instanceof WhileStatement)) {
          _builder.append("While\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
        } else {
          if ((statement instanceof IfStatement)) {
            _builder.append("If\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
          } else {
            _builder.append("Statement\"");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if ((statement instanceof ForStatement)) {
        _builder.append("\t");
        _builder.append("\"From :");
        int _from = ((ForStatement)statement).getFrom();
        _builder.append(_from, "\t");
        _builder.append("\"->\"To :");
        int _to = ((ForStatement)statement).getTo();
        _builder.append(_to, "\t");
        _builder.append("\"->\"Incr :");
        int _increment = ((ForStatement)statement).getIncrement();
        _builder.append(_increment, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        {
          AbstractTask _abstracttask = ((ForStatement)statement).getAbstracttask();
          if ((_abstracttask instanceof SimpleTask)) {
            _builder.append("\t");
            CharSequence _generateTask = this.generateTask(((ForStatement)statement).getAbstracttask());
            _builder.append(_generateTask, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            String _generateCluster = this.generateCluster(((ForStatement)statement).getAbstracttask());
            _builder.append(_generateCluster, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        if ((statement instanceof WhileStatement)) {
          {
            AbstractTask _abstracttask_1 = ((WhileStatement)statement).getAbstracttask();
            if ((_abstracttask_1 instanceof SimpleTask)) {
              _builder.append("\t");
              CharSequence _generateTask_1 = this.generateTask(((WhileStatement)statement).getAbstracttask());
              _builder.append(_generateTask_1, "\t");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _generateCluster_1 = this.generateCluster(((WhileStatement)statement).getAbstracttask());
              _builder.append(_generateCluster_1, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
        } else {
          if ((statement instanceof IfStatement)) {
            _builder.append("\t");
            int idIfElse = this.ifelse++;
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("subgraph clusterIf");
            _builder.append(idIfElse, "\t");
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("style=rounded;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("fillcolor=white;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("color=red;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("margin=20;");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("label = THEN");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.newLine();
            {
              AbstractTask _then = ((IfStatement)statement).getThen();
              if ((_then instanceof SimpleTask)) {
                _builder.append("\t");
                _builder.append("\t\t\t");
                CharSequence _generateTask_2 = this.generateTask(((IfStatement)statement).getThen());
                _builder.append(_generateTask_2, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t\t\t");
                String _generateCluster_2 = this.generateCluster(((IfStatement)statement).getThen());
                _builder.append(_generateCluster_2, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.newLine();
            {
              AbstractTask _else = ((IfStatement)statement).getElse();
              boolean _tripleNotEquals = (_else != null);
              if (_tripleNotEquals) {
                _builder.append("\t");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("subgraph clusterElse");
                _builder.append(idIfElse, "\t\t");
                _builder.append(" {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t");
                _builder.append("style=rounded;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t");
                _builder.append("fillcolor=white;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t");
                _builder.append("color=red;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t");
                _builder.append("margin=20;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t");
                _builder.append("label = ELSE");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t\t\t\t\t\t\t");
                _builder.newLine();
                {
                  AbstractTask _else_1 = ((IfStatement)statement).getElse();
                  if ((_else_1 instanceof SimpleTask)) {
                    _builder.append("\t");
                    _builder.append("\t\t\t\t\t\t");
                    CharSequence _generateTask_3 = this.generateTask(((IfStatement)statement).getElse());
                    _builder.append(_generateTask_3, "\t\t\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t\t\t\t\t\t");
                    String _generateCluster_3 = this.generateCluster(((IfStatement)statement).getElse());
                    _builder.append(_generateCluster_3, "\t\t\t\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t");
                _builder.append("\t\t\t\t");
                _builder.append("}");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence taskOutputsHTML(final AbstractTask task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskOutput> _outputs = task.getOutputs();
      boolean _hasElements = false;
      for(final TaskOutput output : _outputs) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("");
        } else {
          _builder.appendImmediate("", "");
        }
        _builder.append("<TD PORT=\"");
        String _name = output.getName();
        _builder.append(_name);
        _builder.append("\" BGCOLOR=\"green\" BORDER=\"0\">");
        String _name_1 = output.getName();
        _builder.append(_name_1);
        _builder.append("</TD>\t\t\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    return _builder;
  }
  
  public CharSequence taskInputsHTML(final AbstractTask task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<TaskInput> _inputs = task.getInputs();
      boolean _hasElements = false;
      for(final TaskInput input : _inputs) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("");
        } else {
          _builder.appendImmediate("", "");
        }
        _builder.append("<TD PORT=\"");
        String _name = input.getName();
        _builder.append(_name);
        _builder.append("\" BGCOLOR=\"yellow\" BORDER=\"0\">");
        String _name_1 = input.getName();
        _builder.append(_name_1);
        _builder.append("</TD>\t\t\t");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    return _builder;
  }
  
  public int maxIO(final AbstractTask task) {
    int _size = task.getInputs().size();
    int _size_1 = task.getOutputs().size();
    boolean _greaterEqualsThan = (_size >= _size_1);
    if (_greaterEqualsThan) {
      return task.getInputs().size();
    } else {
      return task.getOutputs().size();
    }
  }
  
  public CharSequence taskOutputs(final AbstractTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<TaskOutput> _outputs = task.getOutputs();
      boolean _hasElements = false;
      for(final TaskOutput output : _outputs) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("");
        } else {
          _builder.appendImmediate("|", "");
        }
        _builder.append("<");
        String _name = output.getName();
        _builder.append(_name);
        _builder.append("> ");
        String _name_1 = output.getName();
        _builder.append(_name_1);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence taskInputs(final AbstractTask task) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    {
      EList<TaskInput> _inputs = task.getInputs();
      boolean _hasElements = false;
      for(final TaskInput input : _inputs) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("");
        } else {
          _builder.appendImmediate("|", "");
        }
        _builder.append("<");
        String _name = input.getName();
        _builder.append(_name);
        _builder.append("> ");
        String _name_1 = input.getName();
        _builder.append(_name_1);
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Pure
  public String getWorkflowFilePath() {
    return this.workflowFilePath;
  }
  
  @Pure
  public String getDotFilePath() {
    return this.dotFilePath;
  }
  
  @Pure
  public String getPngFilePath() {
    return this.pngFilePath;
  }
  
  @Pure
  public String getPdfFilePath() {
    return this.pdfFilePath;
  }
  
  @Pure
  public Workflow getWorkflow() {
    return this.workflow;
  }
  
  @Pure
  public Bundle getBundle() {
    return this.bundle;
  }
  
  public void setBundle(final Bundle bundle) {
    this.bundle = bundle;
  }
  
  @Pure
  public String getBundlePath() {
    return this.bundlePath;
  }
  
  public void setBundlePath(final String bundlePath) {
    this.bundlePath = bundlePath;
  }
  
  @Pure
  public String getDotCommandWindows() {
    return this.dotCommandWindows;
  }
  
  public void setDotCommandWindows(final String dotCommandWindows) {
    this.dotCommandWindows = dotCommandWindows;
  }
  
  @Pure
  public int getCluster() {
    return this.cluster;
  }
  
  public void setCluster(final int cluster) {
    this.cluster = cluster;
  }
  
  @Pure
  public int getIfelse() {
    return this.ifelse;
  }
  
  public void setIfelse(final int ifelse) {
    this.ifelse = ifelse;
  }
}
