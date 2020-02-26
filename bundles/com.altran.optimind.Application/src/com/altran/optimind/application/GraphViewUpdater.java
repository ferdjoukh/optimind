package com.altran.optimind.application;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;

public class GraphViewUpdater implements IResourceChangeListener {

	private View view;
	private String imageAbolutePath;

	public GraphViewUpdater() {}

	public GraphViewUpdater(View view) {
		this.view = view;
	}

	public void resourceChanged(IResourceChangeEvent event) {
		
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
			return;
		
		if (imageAbolutePath != null) {
			if (getChangedResource(event) != null) {

				Display display = view.getLblNewLabel().getDisplay();
				if (!display.isDisposed()) {
					display.asyncExec(new Runnable() {
						public void run() {
							view.updateImage(imageAbolutePath);
							view.updateViewComposites();
						}
					});
				}
			}
		}

	}

	public String getImageAbolutePath() {
		return imageAbolutePath;
	}

	public void setImageAbolutePath(String imageAbolutePath) {
		this.imageAbolutePath = imageAbolutePath;
	}

	private static IResource getChangedResource(IResourceChangeEvent event) {
		
		final ArrayList<IResource> resources = new ArrayList<IResource>();

		IResourceDelta rootDelta = event.getDelta();
		IResourceDelta docDelta = rootDelta.findMember(rootDelta.getFullPath());
		if (docDelta == null)
			return null;
		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
			public boolean visit(IResourceDelta delta) {
				IResource resource=delta.getResource();
				if("png".equalsIgnoreCase(resource.getFileExtension())) {
					resources.add(resource);
				}
				return true;
			}
		};
		try {
			docDelta.accept(visitor);
		} catch (CoreException e) {
			System.out.println(e.getMessage());
		}
		
		
		// nothing more to do if there were no changed text files
		if (resources.size() == 0)
			return null;

		return resources.get(0);
	}
}
