package main;

public abstract class LibraryItems {

	public boolean CheckedOut;
	//methods
	
	// make a method for if it's checked out / adding things

	public boolean isCheckedOut() {
		return CheckedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		CheckedOut = checkedOut;
	}

	public LibraryItems(boolean checkedOut) {
		super();
		CheckedOut = checkedOut;
	}

	public static void add(LibraryItems item) {
		// TODO Auto-generated method stub
		
	}
	
}
