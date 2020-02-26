package com.altran.optimind.ui.action;


import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

public class TransformXmi2XmlActionProvider extends CommonActionProvider {

private static final String Transform = "Transform_xmi_to_xml";
	
	/** The import action handler **/
	private TransformXmi2XmlAction transformXmi2XmlAction;

	public TransformXmi2XmlActionProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ICommonActionExtensionSite anActionSite) {
		ICommonViewerSite viewSite = anActionSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			transformXmi2XmlAction = new TransformXmi2XmlAction(anActionSite.getViewSite().getShell(),
					workbenchSite.getSelectionProvider());
		}
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		if (transformXmi2XmlAction.isEnabled()) {
			actionBars.setGlobalActionHandler(Transform, transformXmi2XmlAction);
			updateActionBars();
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		if (transformXmi2XmlAction.isEnabled()) {
			menu.appendToGroup("group.new", transformXmi2XmlAction); //$NON-NLS-1$
		}
	}

}
