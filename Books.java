package main;

public class Books extends LibraryItems{

	private int Pages;
	private int BorrowingPeriod;
	private int PublicationDate;
	
	public Books(boolean checkedOut) {
		super(checkedOut);
		// TODO Auto-generated constructor stub
	}
	
	public Books(boolean checkedOut, int pages, int borrowingPeriod, int publicationDate) {
		super(checkedOut);
		Pages = pages;
		BorrowingPeriod = borrowingPeriod;
		PublicationDate = publicationDate;
	}

	public int getPages() {
		return Pages;
	}

	public void setPages(int pages) {
		Pages = pages;
	}

	public int getBorrowingPeriod() {
		return BorrowingPeriod;
	}

	public void setBorrowingPeriod(int borrowingPeriod) {
		BorrowingPeriod = borrowingPeriod;
	}

	public int getPublicationDate() {
		return PublicationDate;
	}

	public void setPublicationDate(int publicationDate) {
		PublicationDate = publicationDate;
	}
		
}
