/**
 * generated by Xtext 2.15.0
 */
package com.altran.generator;

import com.altran.Utils.Utils;
import com.altran.generator.CustomTaskRunnerGenerator;
import com.altran.generator.JavaCodeGenerator;
import com.altran.generator.LibraryFunctionGenerator;
import com.altran.generator.PythonCodeGenerator;
import com.altran.graphs.DotGraphGenerator;
import com.altran.optimind.model.workflow.Language;
import com.altran.optimind.model.workflow.Workflow;
import com.google.common.base.Objects;
import java.io.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class OptimindGenerator extends AbstractGenerator {
  private Workflow m_workflow;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      Workflow workflow = this.getWorkflowFromResource(resource);
      this.m_workflow = workflow;
      String resourcePath = this.getResourceFilePath(resource);
      new DotGraphGenerator(resourcePath, workflow).createDotFile();
      String filePath = this.createFilePath(resourcePath, workflow.getLanguage());
      Language _language = workflow.getLanguage();
      boolean _equals = Objects.equal(_language, Language.PYTHON);
      if (_equals) {
        new PythonCodeGenerator(workflow, filePath).generate();
      } else {
        new JavaCodeGenerator(workflow, filePath).generate();
      }
      String scriptsPackagePath = this.createPackagePath(resourcePath);
      Language _language_1 = workflow.getLanguage();
      new LibraryFunctionGenerator(workflow, scriptsPackagePath, _language_1).generate();
      Language _language_2 = workflow.getLanguage();
      new CustomTaskRunnerGenerator(workflow, scriptsPackagePath, _language_2).generate();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String createPackagePath(final String workflowFilePath) {
    String _xblockexpression = null;
    {
      String name = null;
      boolean _contains = workflowFilePath.contains("\\");
      if (_contains) {
        int last1 = workflowFilePath.lastIndexOf("\\");
        String name1 = workflowFilePath.substring(0, last1);
        int last = name1.lastIndexOf("\\");
        name = name1.substring(0, last);
      } else {
        name = workflowFilePath;
      }
      _xblockexpression = (name + "\\scripts\\");
    }
    return _xblockexpression;
  }
  
  public String getResourceFilePath(final Resource resource) {
    String _xblockexpression = null;
    {
      IFile ifile = Utils.getFile(resource);
      File file = ifile.getLocation().toFile();
      _xblockexpression = file.getPath();
    }
    return _xblockexpression;
  }
  
  public String createFilePath(final String workflowFilePath, final Language language) {
    String _xblockexpression = null;
    {
      String name = null;
      boolean _contains = workflowFilePath.contains("\\");
      if (_contains) {
        int last = workflowFilePath.lastIndexOf("\\");
        String _substring = workflowFilePath.substring(0, last);
        String _plus = (_substring + "\\");
        String _name = this.m_workflow.getName();
        String _plus_1 = (_plus + _name);
        name = _plus_1;
      } else {
        name = workflowFilePath;
      }
      String _xifexpression = null;
      boolean _equals = Objects.equal(language, Language.PYTHON);
      if (_equals) {
        _xifexpression = (name + ".py");
      } else {
        _xifexpression = (name + ".java");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Workflow getWorkflowFromResource(final Resource resource) {
    EObject _get = resource.getContents().get(0);
    return ((Workflow) _get);
  }
}
