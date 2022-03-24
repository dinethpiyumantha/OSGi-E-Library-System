package edu.els.audiobook;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


/**
 * AudioBook Service Activator
 * @author SE3030_WE_31
 */
public class ServiceActivator implements BundleActivator {

	// Declare a instance for service registration
	ServiceRegistration serviceRegistration;

	
	/**
	 * Starts the service
	 */
	public void start(BundleContext context) throws Exception {
		
		System.out.println("AudioBook publisher started");
		
		// Initialize publisher object
		AudioBookService audioBookService = new AudioBookServiceImpl();
		
		// Registering the service publisher
		serviceRegistration = context.registerService(AudioBookService.class.getName(), audioBookService, null);
	}

	
	/**
	 * Stop the service
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("AudioBook publisher stopped");
		
		// Unregistering the service
		serviceRegistration.unregister();
		
	}

}

