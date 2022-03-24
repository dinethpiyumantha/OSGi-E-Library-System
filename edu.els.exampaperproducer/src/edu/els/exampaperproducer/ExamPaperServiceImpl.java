package edu.els.exampaperproducer;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * ExamPaper Service Implementations
 * @author SE3030_WE_31
 */
public class ExamPaperServiceImpl implements ExamPaperService {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	/**
	 * Get ArrayList of Exam Paper instances
	 * @return ArrayList<EBook>
	 */
	public static ArrayList<ExamPaper> getListOfData() {
		
		// Returnable ArrayList initialization
		ArrayList<ExamPaper> examPapers = new ArrayList<ExamPaper>();
		
		ExamPaper exam1 = new ExamPaper("1", "DS", "Ms. Dilani", "Unknown");
		ExamPaper exam2 = new ExamPaper("2", "SA", "Mr. Udara", "Unknown");
		ExamPaper exam3 = new ExamPaper("3", "SEP&QM", "Ms. Kushnara", "Unknown");
		ExamPaper exam4 = new ExamPaper("4", "AF", "Mr. Thusithanjana", "Unknown");
		
		examPapers.add(exam1);
		examPapers.add(exam2);
		examPapers.add(exam3);
		examPapers.add(exam4);
		
		// Return ArrayList instance
		return examPapers;
	}
	
	
	/**
	 * Display list of Exam Papers with IDs
	 * @return void
	 */
	@Override
	public void displayExamPaperList() {
		
		try {
			
			// Initialize assignable ArrayList object getting from getListOfData() method
			ArrayList<ExamPaper> ebookList = ExamPaperServiceImpl.getListOfData();
			
			
			// Print ArrayList data object on console as a table
			System.out.println("Exam Paper List >>>");
			System.out.println("------------------------------------------------------");
			System.out.println("ID\tSubject Name\tAuthor");
			System.out.println("------------------------------------------------------");
			
			for (ExamPaper eBook : ebookList) {
				System.out.println(
						eBook.getId() + "\t" +
						eBook.getName() + "\t" +
						eBook.getAuthor()
				);
			}
			
			System.out.println("------------------------------------------------------\n\n\n");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
