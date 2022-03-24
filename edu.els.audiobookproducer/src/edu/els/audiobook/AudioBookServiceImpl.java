package edu.els.audiobook;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * AudioBook Service Implementations
 * @author SE3030_WE_31
 */
public class AudioBookServiceImpl implements AudioBookService {
	
	private Scanner scanner = new Scanner(System.in);
	
	
	/**
	 * Get ArrayList of AudioBook instances
	 * @return ArrayList<EBook>
	 */
	public static ArrayList<AudioBook> getListOfData() {
		
		// Returnable ArrayList initialization
		ArrayList<AudioBook> ebookList = new ArrayList<AudioBook>();
		
		AudioBook eBook1 = new AudioBook("1", "Madoldoowa", "Martin Wikramasinghe", "Unknown");
		AudioBook eBook2 = new AudioBook("2", "Hathpana", "Kumarathunga Munidasa", "Unknown");
		AudioBook eBook3 = new AudioBook("3", "Viragaya", "Martin Wikramasinghe", "Unknown");
		AudioBook eBook4 = new AudioBook("4", "Kaliyugaya", "Martin Wikramasinghe", "Unknown");
		
		ebookList.add(eBook1);
		ebookList.add(eBook2);
		ebookList.add(eBook3);
		ebookList.add(eBook4);
		
		// Return ArrayList instance
		return ebookList;
	}
	
	
	/**
	 * Display list of AudioBooks with IDs
	 * @return void
	 */
	@Override
	public void displayAudioList() {
		
		try {
			
			// Initialize assignable ArrayList object getting from getListOfData() method
			ArrayList<AudioBook> ebookList = AudioBookServiceImpl.getListOfData();
			
			
			// Print ArrayList data object on console as a table
			System.out.println("EBook List >>>");
			System.out.println("------------------------------------------------------");
			System.out.println("ID\tAudio Name\tAuthor");
			System.out.println("------------------------------------------------------");
			
			for (AudioBook eBook : ebookList) {
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
