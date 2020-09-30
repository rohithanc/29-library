package main;

public class Maps extends LibraryItems {

	private String Area;
	private float SizeOfMapping;
	private int PublicationDate;
	
	public Maps(boolean checkedOut) {
		super(checkedOut);
		// TODO Auto-generated constructor stub
	}

	public Maps(boolean checkedOut, String area, float sizeOfMapping, int publicationDate) {
		super(checkedOut);
		Area = area;
		SizeOfMapping = sizeOfMapping;
		PublicationDate = publicationDate;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public float getSizeOfMapping() {
		return SizeOfMapping;
	}

	public void setSizeOfMapping(float sizeOfMapping) {
		SizeOfMapping = sizeOfMapping;
	}

	public int getPublicationDate() {
		return PublicationDate;
	}

	public void setPublicationDate(int publicationDate) {
		PublicationDate = publicationDate;
	}
	
}
