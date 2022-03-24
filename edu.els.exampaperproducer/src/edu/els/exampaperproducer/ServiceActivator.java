package edu.els.exampaperproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


/**
 * ExamPaper Service Activator
 * @author SE3030_WE_31
 */
public class ServiceActivator implements BundleActivator {

	// Declare a instance for service registration
	ServiceRegistration serviceRegistration;

	
	/**
	 * Starts the service
	 */
	public void start(BundleContext context) throws Exception {
		
		System.out.println("ExamPapers publisher started");
		
		// Initialize publisher object
		ExamPaperService examPaperService = new ExamPaperServiceImpl();
		
		// Registering the service publisher
		serviceRegistration = context.registerService(ExamPaperService.class.getName(), examPaperService, null);
	}

	
	/**
	 * Stop the service
	 */
	public void stop(BundleContext context) throws Exception {

		System.out.println("ExamPapers publisher stopped");
		
		// Unregistering the service
		serviceRegistration.unregister();
		
	}

}
