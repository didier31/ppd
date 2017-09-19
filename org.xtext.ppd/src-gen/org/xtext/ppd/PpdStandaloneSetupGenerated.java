/*
 * generated by Xtext 2.10.0
 */
package org.xtext.ppd;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.xtext.ppd.ppd.PpdPackage;

@SuppressWarnings("all")
public class PpdStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new PpdRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.xtext.org/ppd")) {
			EPackage.Registry.INSTANCE.put("http://www.xtext.org/ppd", PpdPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ppd", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ppd", serviceProvider);
	}
}