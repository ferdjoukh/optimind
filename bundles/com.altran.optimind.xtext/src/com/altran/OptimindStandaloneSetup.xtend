/*
 * generated by Xtext 2.15.0
 */
package com.altran


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class OptimindStandaloneSetup extends OptimindStandaloneSetupGenerated {

	def static void doSetup() {
		new OptimindStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
