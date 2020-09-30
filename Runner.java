package main;

import java.util.ArrayList;
import java.util.List;


public class Runner {
	
	public static void main (String[] args) {
	// static int to assign ID numbers
		
	// Create a List Array CREATING BOOKS
		// these are for the LibraryItems / Methods Class
		
		//	Books book = new Books();
		
	// Create a List Array for People
		List<Person> person = new ArrayList<>();
		Person Person1 = new Person("Andrew", "male", 24, true);
		Person Person2 = new Person("Bethany", "female", 37, false);
		Person Person3 = new Person("Chris", "male", 30, true);
		Person Person4 = new Person("Daniel", "male", 74, true);
		Person Person5 = new Person("Ellie", "female", 20, true);
		
	// Library Items
		List<Books> books = new ArrayList<>();
		LibraryItems Book1 = new Books(false, 256, 30, 0);
		LibraryItems Book2 = new Books(true, 189, 30, 0);
		LibraryItems Maps1 = new Maps(false, "1000km", 30, 0);
		LibraryItems Maps2 = new Maps(false, "1000km", 7, 0);
		LibraryItems Maps3 = new Maps(true, "500km", 7, 0);
		LibraryItems Newspapers1 = new Newspapers(false, "The Guardian", 2);
		LibraryItems Newspapers2 = new Newspapers(false, "The Daily Telegraph", 2);
		LibraryItems Newspapers3 = new Newspapers(false, "The Sun", 2);
		LibraryItems Magazines1 = new Magazines(false, "Hello", 2);
		LibraryItems Magazines2 = new Magazines(true, "Empire", 1);

	}
}
