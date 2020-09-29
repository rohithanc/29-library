package solid;

public class Person {

	public String Name;
	public String Gender;
	public int Age;
	public boolean LibraryCard;
	
	public Person(String name, String gender, int age, boolean libraryCard) {
		super();
		Name = name;
		Gender = gender;
		Age = age;
		LibraryCard = libraryCard;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public boolean isLibraryCard() {
		return LibraryCard;
	}

	public void setLibraryCard(boolean libraryCard) {
		LibraryCard = libraryCard;
	}
	
}
