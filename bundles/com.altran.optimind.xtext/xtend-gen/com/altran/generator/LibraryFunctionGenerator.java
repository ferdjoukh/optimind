package com.altran.generator;

import com.altran.optimind.model.workflow.Input;
import com.altran.optimind.model.workflow.LibraryFunction;
import com.altran.optimind.model.workflow.Workflow;
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
  
  public LibraryFunctionGenerator(final Workflow workflow, final String path) {
    this.workflow = workflow;
    this.libraryFunctionPackagePath = path;
  }
  
  public void generate() {
    EList<EObject> children = this.workflow.eContents();
    for (final EObject child : children) {
      if ((child instanceof LibraryFunction)) {
        this.createLibFunctionPythonFile(((LibraryFunction)child));
        this.cammaCounter = 0;
      }
    }
  }
  
  public void createLibFunctionPythonFile(final LibraryFunction function) {
    String _generateFileContent = this.generateFileContent(function);
    String _name = function.getName();
    String _plus = (this.libraryFunctionPackagePath + _name);
    String _plus_1 = (_plus + ".");
    String _plus_2 = (_plus_1 + "py");
    this.writeContent(_generateFileContent, _plus_2);
  }
  
  public String generateFileContent(final LibraryFunction libfunction) {
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
}
