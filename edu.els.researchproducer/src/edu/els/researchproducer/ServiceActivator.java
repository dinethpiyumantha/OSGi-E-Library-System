package edu.els.researchproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


/**
 * Research Service Activator
 * @author SE3030_WE_31
 */
public class ServiceActivator implements BundleActivator {

	// Declare a instance for service registration
	ServiceRegistration serviceRegistration;

	
	/**
	 * Starts the service
	 */
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Research publisher started");
	
		// Initialize publisher object
		ResearchService researchService = new ResearchServiceImpl();
		
		// Registering the service publisher
		serviceRegistration = context.registerService(ResearchService.class.getName(), researchService, null);
	}

	
	/**
	 * Stop the service
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Research publisher stopped");
		
		// Unregistering the service
		serviceRegistration.unregister();
		
	}

}
