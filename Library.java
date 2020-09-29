package solid;

public abstract class Library {

	public boolean CheckedOut;
	//methods

	public boolean isCheckedOut() {
		return CheckedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		CheckedOut = checkedOut;
	}

	public Library(boolean checkedOut) {
		super();
		CheckedOut = checkedOut;
	}
	
}
