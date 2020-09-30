package main;

public class Magazines extends LibraryItems{

	// if you have getters + setters, these attributes should be private
	private String Brand;
	private int NumberOfCopies;

	public Magazines(boolean checkedOut) {
		super(checkedOut);
		// TODO Auto-generated constructor stub
	}
	public Magazines(boolean checkedOut, String brand, int numberOfCopies) {
		super(checkedOut);
		Brand = brand;
		NumberOfCopies = numberOfCopies;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getNumberOfCopies() {
		return NumberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		NumberOfCopies = numberOfCopies;
	}
}
