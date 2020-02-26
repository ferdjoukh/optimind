package com.altran.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import org.junit.Test;

import com.altran.graphs.DotGraphGenerator;
import com.altran.optimind.model.workflow.Workflow;

public class GeneratorTest {
	
	//Checking tests
	@Test( expected = FileNotFoundException.class)
	public void non_existing_workflow_File() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("null");
		generator.doesWorkflowExists();
	}
	
	@Test
	public void existing_workflow_File() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.optimind");
		boolean exist = generator.doesWorkflowExists();
		assertEquals(true, exist);
	}
	
	@Test( expected = IllegalArgumentException.class)
	public void wrong_extansion_workflow_File() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.false");
		boolean correct = generator.correctExtensionForWorkflow();
		assertEquals(true, correct);
	}
	
	@Test
	public void dot_file_name() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.false");
		String dot = generator.getDotFilePath();
		assertEquals("resources/one.dot", dot);
	}
	
	@Test
	public void png_file_name() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.false");
		String dot = generator.getPngFilePath();
		assertEquals("resources/one.png", dot);
	}
	
	@Test
	public void pdf_file_name() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.false");
		String dot = generator.getPdfFilePath();
		assertEquals("resources/one.pdf", dot);
	}
	
	@Test
	public void correct_workflow_extention() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.optimind");
		boolean correct = generator.correctExtensionForWorkflow();
		assertEquals(true, correct);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void incorrect_workflow_extention() throws FileNotFoundException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/one.false");
		generator.correctExtensionForWorkflow();		
	}
	
//	//Create new files 
//	@Test
//	public void load_workflow_file() throws IOException {
//		DotGraphGenerator generator = new DotGraphGenerator("resources/My.workflow");
//		Workflow workflow = generator.loadWorkflow();
//		assertNotNull(workflow);
//		assertEquals("azert", workflow.getName());
//	}
	
	@Test
	public void create_dot_file() throws IOException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/My.workflow");
		generator.createDotFile();
		File dot = new File("resources/My.dot");
		assertEquals(true, dot.exists());		
	}
	
	@Test
	public void create_png_file_from_dot() {
		DotGraphGenerator generator = new DotGraphGenerator("resources/My.workflow");
		String dot = "resources/example1.dot";
		String png = "resources/e1.png";
		generator.createPngFile(dot, png);
		File pngFile = new File("resources/e1.png");
		assertEquals(true, pngFile.exists());
	}
	
	@Test
	public void create_pdf_file_from_dot() {
		DotGraphGenerator generator = new DotGraphGenerator("resources/My.workflow");
		String dot = "resources/example1.dot";
		String pdf = "resources/e1.pdf";
		generator.createPngFile(dot, pdf);
		File pdfFile = new File("resources/e1.pdf");
		assertEquals(true, pdfFile.exists());
	}
	
	@Test
	public void create_dot_bino() throws IOException {
		DotGraphGenerator generator = new DotGraphGenerator("resources/bino.optimind");
		generator.createDotFile();		
	}	
}
