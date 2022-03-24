package edu.els.researchproducer;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Research Service Implementations
 * @author SE3030_WE_31
 */
public class ResearchServiceImpl implements ResearchService {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	/**
	 * Get ArrayList of Research instances
	 * @return ArrayList<Research>
	 */
	public static ArrayList<Research> getListOfData() {
		
		// Returnable ArrayList initialization
		ArrayList<Research> researchs = new ArrayList<Research>();
		
		Research data1 = new Research("1", "IoT", "Sandani Yasaswee", "IEEE");
		Research data2 = new Research("2", "Cloud Computing", "Hashani Prabodya", "IEEE");
		Research data3 = new Research("3", "Neuralink", "Jami", "IEEE");
		Research data4 = new Research("4", "AI", "Dineth Ekanayaka", "IEEE");
		
		researchs.add(data1);
		researchs.add(data2);
		researchs.add(data3);
		researchs.add(data4);
		
		// Return ArrayList instance
		return researchs;
	}
	
	
	/**
	 * Display list of Researches with IDs
	 * @return void
	 */
	@Override
	public void displayResearchList() {
		
		try {
			
			// Initialize assignable ArrayList object getting from getListOfData() method
			ArrayList<Research> ebookList = ResearchServiceImpl.getListOfData();
			
			
			// Print ArrayList data object on console as a table
			System.out.println("Research List >>>");
			System.out.println("------------------------------------------------------");
			System.out.println("ID\tResearch Name\tAuthor");
			System.out.println("------------------------------------------------------");
			
			for (Research eBook : ebookList) {
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
