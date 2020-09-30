package main;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	// Books, maps, newspapers, magazines, people

	// Array List
	ArrayList<LibraryItems> library = new ArrayList<LibraryItems>();

	/*.
	 * Methods - adding items to library (LISTARRAY?) - checking if they're checkout
	 * 
	 * 
	 * - check out item - - Check out item - Check in item - Add item - Remove item
	 * - Update item - Register person - Delete person Update person
	 */

	// Adding

	public void addLibraryItems(LibraryItems item) {
		LibraryItems.add(item);
	}

	// Checking Out
	public void removeByType(String type) {
		List<LibraryItems> CheckOut = new ArrayList<>();
		if ("Books".equals(type)) {
			for (LibraryItems x : this.item) {
				if (x instanceof Books) {
					CheckOut.add(item);
				} else if ("Maps".equals(type)) {
					for (LibraryItems x : this.item) {
						if (x instanceof Maps) {
							CheckOut.add(item);
						} else if ("Magazines".equals(type)) {
							for (LibraryItems x : this.item) {
							if (x instanceof Magazines) {
								CheckOut.add(item);
				.		} else if ("Newspapers".equals(type)) {
							if (x instanceof Newspapers) {
								CheckOut.add(item);
								if (x instanceof Maps) {
									CheckOut.add(item);
							}
						}
					}
				}
			}
		}
	}

	// Checking out method 2
		public void removeByType(boolean type) {
			List<LibraryItems> TakenOutOfLibrary = new ArrayList<>();
			if false {
			}
			
	}
	
		
		// People Method
		List<Person> person = new ArrayList<Person>();
			Person.add("person"); 
			
		for (int i=0; i<person.size(); i++) {
			System.out.println("Person Number: " + i+1);
		}
	}
}
}
}
