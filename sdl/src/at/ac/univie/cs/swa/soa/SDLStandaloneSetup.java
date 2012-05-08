
package at.ac.univie.cs.swa.soa;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SDLStandaloneSetup extends SDLStandaloneSetupGenerated{

	public static void doSetup() {
		new SDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

