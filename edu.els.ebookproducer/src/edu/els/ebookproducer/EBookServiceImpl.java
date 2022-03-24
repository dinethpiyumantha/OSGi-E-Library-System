package edu.els.ebookproducer;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * EBook Service Implementations
 * @author SE3030_WE_31
 */
public class EBookServiceImpl implements EBookService {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	/**
	 * Get ArrayList of EBook instances from extracting 'data.xml'
	 * @return ArrayList<EBook>
	 */
	public static ArrayList<EBook> getListOfData() {
		
		// Returnable ArrayList initialization
		ArrayList<EBook> ebookList = new ArrayList<EBook>();
		
		EBook eBook1 = new EBook("1", "Madoldoowa", "Martin Wikramasinghe", "Unknown");
		EBook eBook2 = new EBook("2", "Hathpana", "Kumarathunga Munidasa", "Unknown");
		EBook eBook3 = new EBook("3", "Viragaya", "Martin Wikramasinghe", "Unknown");
		EBook eBook4 = new EBook("4", "Kaliyugaya", "Martin Wikramasinghe", "Unknown");
		
		ebookList.add(eBook1);
		ebookList.add(eBook2);
		ebookList.add(eBook3);
		ebookList.add(eBook4);
		
		// Return ArrayList instance
		return ebookList;
	}
	
	
	/**
	 * Display list of EBooks with IDs
	 * @return void
	 */
	@Override
	public void displayBookList() {
		
		try {
			
			// Initialize assignable ArrayList object getting from getListOfData() method
			ArrayList<EBook> ebookList = EBookServiceImpl.getListOfData();
			
			
			// Print ArrayList data object on console as a table
			System.out.println("EBook List >>>");
			System.out.println("------------------------------------------------------");
			System.out.println("ID\tBook Name\tAuthor");
			System.out.println("------------------------------------------------------");
			
			for (EBook eBook : ebookList) {
				System.out.println(
						eBook.getId() + "\t" +
						eBook.getName() + "\t" +
						eBook.getAuthor()
				);
			}
			
			System.out.println("------------------------------------------------------\n\n\n");
			scanner.next();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
