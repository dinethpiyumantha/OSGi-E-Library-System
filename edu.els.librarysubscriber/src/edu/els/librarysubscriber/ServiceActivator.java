package edu.els.librarysubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import edu.els.audiobook.AudioBookService;
import edu.els.ebookproducer.EBookService;
import edu.els.ebookproducer.EBookServiceImpl;
import edu.els.exampaperproducer.ExamPaperService;
import edu.els.researchproducer.ResearchService;


/**
 * Library service subscriber
 * @author SE3030_WE_31
 */
public class ServiceActivator implements BundleActivator {

	// Declare Service Reference objects
	ServiceReference ebookServiceReference, audioBookServiceReference, researchServiceReference, examServiceReference;
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * Start Service
	 */
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Library subscriber started\n");
		
		// Infinite loop of menu
		while(true) {
			
			// Print option menu
			System.out.println(
					"\n\n" +
					"\n*********************************************" +
					"\n              E-Library System" +
					"\n*********************************************\n"
			);
			
			System.out.println(
					"Option Menu >>>\n" +
					"(1) - EBooks\n" +
					"(2) - Audio Books\n" +
					"(3) - Research Papers\n" +
					"(4) - Exam Papers\n\n"
			);
			
			
			// Input option value
			System.out.print(">>> ");
			String inputOption = scanner.next();
		
			// Start service according to the option input
			switch (inputOption) {
			case "1": {
				ebookServiceReference = context.getServiceReference(EBookService.class.getName());
				EBookService eBookService =  (EBookService) context.getService(ebookServiceReference);
			
				eBookService.displayBookList();
				continue;
			}
			case "2": {
				audioBookServiceReference = context.getServiceReference(AudioBookService.class.getName());
				AudioBookService audioBookService =  (AudioBookService) context.getService(audioBookServiceReference);
				
				audioBookService.displayAudioList();
				continue;
			}
			case "3": {
				researchServiceReference = context.getServiceReference(ResearchService.class.getName());
				ResearchService researchService =  (ResearchService) context.getService(researchServiceReference);
				
				researchService.displayResearchList();
				continue;
			}
			case "4": {
				examServiceReference = context.getServiceReference(ExamPaperService.class.getName());
				ExamPaperService examPaperService =  (ExamPaperService) context.getService(examServiceReference);
				
				examPaperService.displayExamPaperList();
				continue;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + inputOption);
			}
		}
		
	}

	
	/**
	 * Stop Service
	 */
	public void stop(BundleContext context) throws Exception {

		System.out.println("Library subscriber stopped");
		
		context.ungetService(ebookServiceReference);
		context.ungetService(audioBookServiceReference);
		context.ungetService(researchServiceReference);
		context.ungetService(examServiceReference);
		
	}

}
