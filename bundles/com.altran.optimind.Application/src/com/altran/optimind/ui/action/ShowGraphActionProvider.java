package com.altran.optimind.ui.action;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

public class ShowGraphActionProvider extends CommonActionProvider {
	
	private static final String Transform = "show graph";
	
	private ShowGraphAction showGraphAction;

	public ShowGraphActionProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ICommonActionExtensionSite anActionSite) {
		ICommonViewerSite viewSite = anActionSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			showGraphAction = new ShowGraphAction(anActionSite.getViewSite().getShell(),
					workbenchSite.getSelectionProvider());
		}
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		if (showGraphAction.isEnabled()) {
			actionBars.setGlobalActionHandler(Transform, showGraphAction);
			updateActionBars();
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		if (showGraphAction.isEnabled()) {
			menu.appendToGroup("group.new", showGraphAction); //$NON-NLS-1$
		}
	}

}
