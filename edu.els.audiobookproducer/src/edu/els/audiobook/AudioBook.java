package edu.els.audiobook;

public class AudioBook {

	// Properties
	private String id;
	private String name;
	private String author;
	private String publisher;
	
	// Constructor
	public AudioBook(String id, String name, String author, String publisher) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}
	
}
