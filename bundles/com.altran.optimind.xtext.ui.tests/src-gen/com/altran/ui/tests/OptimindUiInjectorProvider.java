/*
 * generated by Xtext 2.21.0
 */
package com.altran.ui.tests;

import com.altran.optimind.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class OptimindUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("com.altran.Optimind");
	}

}
