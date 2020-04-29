package com.altran.optimind.ui.action;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

public class ExecuteWorkflowActionProvider extends CommonActionProvider {
	
	private static final String Transform = "run";
	
	private ExecuteWorkflowAction executeWorkflowAction;

	public ExecuteWorkflowActionProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init(ICommonActionExtensionSite anActionSite) {
		ICommonViewerSite viewSite = anActionSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			executeWorkflowAction = new ExecuteWorkflowAction(anActionSite.getViewSite().getShell(),
					workbenchSite.getSelectionProvider());
		}
	}

	@Override
	public void fillActionBars(IActionBars actionBars) {
		if (executeWorkflowAction.isEnabled()) {
			actionBars.setGlobalActionHandler(Transform, executeWorkflowAction);
			updateActionBars();
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		if (executeWorkflowAction.isEnabled()) {
			menu.appendToGroup("group.new", executeWorkflowAction); //$NON-NLS-1$
		}
	}

}
