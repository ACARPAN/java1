package interlink;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nabil a = new Nabil();
		a.displayCountryName();
		a.Loan();
		a.Save();
		a.BranchName();

		student b = new student("Ashish", "Basnet", 01);
		System.out.println(b.rollNo);
		b.displayName();
	}

}

abstract class AsianDevBank {

	// abstract class can have method with definition only
	// abstract class can have normal methods
	// cannot create object of abstract class

	// abstract method
	abstract public void Loan();

	abstract public void Save();

	// regular method
	public void displayCountryName() {
		System.out.println("Nepal");
	}

}

class Nabil extends AsianDevBank {

	@Override
	public void Loan() {
		System.out.println("Nabil has loan facility");
	}

	@Override
	public void Save() {
		System.out.println("Nabil has saving facility");

	}

	public void BranchName() {
		System.out.println("Nabil branch");
	}
}

abstract class Intro {

	String firstName;
	String lastName;

	public Intro(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}

	abstract public void displayName();
}

class student extends Intro {
	int rollNo;

	public student(String fName, String lName, int rollNo) {
		super(fName, lName);
		this.rollNo = rollNo;
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println(this.firstName + " " + this.lastName);
	}

	public void displayCity() {
		System.out.println("Lalitpur");
	}
}
