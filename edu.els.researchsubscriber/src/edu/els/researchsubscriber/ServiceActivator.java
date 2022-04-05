package edu.els.researchsubscriber;

import edu.els.researchproducer.ResearchService;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

		// Declare Service Reference objects
		ServiceReference researchServiceReference;
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * Start Service
		 */
		public void start(BundleContext context) throws Exception {
			
			System.out.println("Research subscriber started\n");
			
			researchServiceReference = context.getServiceReference(ResearchService.class.getName());
			ResearchService researchService =  (ResearchService) context.getService(researchServiceReference);
			
			researchService.displayResearchList();
			
			scanner.next();
			
		}

		
		/**
		 * Stop Service
		 */
		public void stop(BundleContext context) throws Exception {

			System.out.println("Library subscriber stopped");
			
			context.ungetService(researchServiceReference);
			
		}

}
