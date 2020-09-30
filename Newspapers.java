package main;

public class Newspapers extends LibraryItems {

	private String Paper;
	private int NumberOfCopies;
	
	public Newspapers(boolean checkedOut) {
		super(checkedOut);
		// TODO Auto-generated constructor stub
	}
	
	public Newspapers(boolean checkedOut, String paper, int numberOfCopies) {
		super(checkedOut);
		Paper = paper;
		NumberOfCopies = numberOfCopies;
	}

	public String getPaper() {
		return Paper;
	}
	public void setPaper(String paper) {
		Paper = paper;
	}
	public int getNumberOfCopies() {
		return NumberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		NumberOfCopies = numberOfCopies;
	}
	
	// Newspapers cannot be checked out
	
}
