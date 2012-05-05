
package at.ac.univie.cs.swa.soa;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ServiceDslStandaloneSetup extends ServiceDslStandaloneSetupGenerated{

	public static void doSetup() {
		new ServiceDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

