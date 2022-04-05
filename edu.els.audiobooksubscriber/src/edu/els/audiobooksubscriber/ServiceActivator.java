package edu.els.audiobooksubscriber;

import edu.els.audiobook.AudioBookService;
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
			
			System.out.println("Library subscriber started\n");
			
			audioBookServiceReference = context.getServiceReference(AudioBookService.class.getName());
			AudioBookService audioBookService =  (AudioBookService) context.getService(audioBookServiceReference);
			
			audioBookService.displayAudioList();
			
			scanner.next();
			
		}

		
		/**
		 * Stop Service
		 */
		public void stop(BundleContext context) throws Exception {

			System.out.println("Library subscriber stopped");
			
			context.ungetService(audioBookServiceReference);
			
		}
}
