package edu.els.exampapersubscriber;

import edu.els.exampaperproducer.ExamPaperService;
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
			
			System.out.println("ExamPaper subscriber started\n");
			
			examServiceReference = context.getServiceReference(ExamPaperService.class.getName());
			ExamPaperService examPaperService =  (ExamPaperService) context.getService(examServiceReference);
			
			examPaperService.displayExamPaperList();
			
			scanner.next();
		}

		
		/**
		 * Stop Service
		 */
		public void stop(BundleContext context) throws Exception {

			System.out.println("ExamPaper subscriber stopped");
			
			context.ungetService(examServiceReference);
			
		}

}
