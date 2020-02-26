package com.altran.optimind.application;


import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class View extends ViewPart {
	public View() {
	}
	
	public static final String ID = "com.altran.optimind.Application.view";
	public static GraphViewUpdater listener;
	private IWorkspace workspace;
	
	private Label lblNewLabel;
	private ScrolledComposite sc;

	@Override
	public void createPartControl(Composite parent) {
		
		workspace = ResourcesPlugin.getWorkspace();
		listener = new GraphViewUpdater(this);
		workspace.addResourceChangeListener(listener,IResourceChangeEvent.POST_CHANGE);
		
		parent.setLayout(new FillLayout());
		
		sc = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		
		
		lblNewLabel = new Label(sc,SWT.BORDER | SWT.WRAP);
		lblNewLabel.setAlignment(SWT.CENTER);
		
		sc.setContent(lblNewLabel);
		sc.setExpandVertical(true);
		sc.setExpandHorizontal(true);
		sc.setMinSize(lblNewLabel.computeSize(lblNewLabel.getBounds().width, lblNewLabel.getBounds().height));
		
	}

	@Override
	public void setFocus() {
		lblNewLabel.setFocus();
	}

	@Override
	public void dispose() {
		SWTResourceManager.dispose();
		workspace.removeResourceChangeListener(listener);
		super.dispose();
	}
	
	public Label getLblNewLabel() {
		return lblNewLabel;
	}
	
	public static View lanchAndUpdateView(String imageAbsolutePath) {
		View view=null;
		try {
			view = (View) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(View.ID);
			view.updateImage(imageAbsolutePath);
			view.updateViewComposites();
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listener.setImageAbolutePath(imageAbsolutePath);
		return view;
	}
	
	public static Image createImageFromAbsolutePath(String path) {
		byte[] uploadedImg = null;
		try {
		    File f1 = new File(path);
		    double fileLen = f1.length();
		    uploadedImg = new byte[(int) fileLen];
		    FileInputStream inputStream = new FileInputStream(path);
		    int nRead = 0;
		    while ((nRead = inputStream.read(uploadedImg)) != -1) {}
		    inputStream.close();

		} catch (Exception e2) {}

		BufferedInputStream inputStreamReader = new BufferedInputStream(new ByteArrayInputStream(uploadedImg));
		ImageData imageData = new ImageData(inputStreamReader);
		return new Image(Display.getCurrent(), imageData);
	}
	
	public void updateImage(String newImagePath) {
		lblNewLabel.setImage(createImageFromAbsolutePath(newImagePath));
		sc.setMinSize(lblNewLabel.computeSize(lblNewLabel.getImage().getBounds().width, lblNewLabel.getImage().getBounds().height));
		
	}
	
	public void updateViewComposites() {
		
		lblNewLabel.update();
		sc.update();
	}
	
}