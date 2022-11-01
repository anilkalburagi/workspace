package com.qac.corejava.oops.relations.HasA.IsA;

public class Library {
	
	String name;
	int noOfBook;
	String location;
	
	public void readingBook(String name) {
		System.out.println("reading bookes in library");
	}
	
	public String searchingBook() {
		System.out.println("searching for invisible man");
		return "invisible man";
	}

}
