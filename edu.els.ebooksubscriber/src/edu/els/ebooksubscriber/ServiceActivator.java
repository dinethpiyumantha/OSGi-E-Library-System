package edu.els.ebooksubscriber;

import edu.els.ebookproducer.EBookService;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ServiceActivator implements BundleActivator {

	// Declare Service Reference objects
		ServiceReference ebookServiceReference, audioBookServiceReference, researchServiceReference, examServiceReference;
		Scanner scanner = new Scanner(System.in);
		
		/**
		 * Start Service
		 */
		public void start(BundleContext context) throws Exception {
			
			System.out.println("EBook subscriber started\n");
			
			ebookServiceReference = context.getServiceReference(EBookService.class.getName());
			EBookService eBookService =  (EBookService) context.getService(ebookServiceReference);
		
			eBookService.displayBookList();
			
			scanner.next();
		}

		
		/**
		 * Stop Service
		 */
		public void stop(BundleContext context) throws Exception {

			System.out.println("EBook subscriber stopped");
			
			context.ungetService(ebookServiceReference);
			
		}

}
