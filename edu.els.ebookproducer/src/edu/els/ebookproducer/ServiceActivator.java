package edu.els.ebookproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


/**
 * EBook Service Activator
 * @author SE3030_WE_31
 */
public class ServiceActivator implements BundleActivator {

	// Declare a instance for service registration
	ServiceRegistration serviceRegistration;

	
	/**
	 * Starts the service
	 */
	public void start(BundleContext context) throws Exception {
		
		System.out.println("EBook publisher started");
		
		// Initialize publisher object
		EBookService eBookService = new EBookServiceImpl();
		
		// Registering the service publisher
		serviceRegistration = context.registerService(EBookService.class.getName(), eBookService, null);
	}

	
	/**
	 * Stop the service
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("EBook publisher stopped");
		
		// Unregistering the service
		serviceRegistration.unregister();
		
	}

}
