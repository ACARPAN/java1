package interlink;

public class static01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students.displayCountry();
		System.out.println(Students.Country);
		Students aa = new Students("Anoop", 21);
		System.out.println(aa.fullName);
		System.out.println(aa.age);
		
	}

}

class Students {
	String fullName;
	int age;
	static String Country = "Nepal";

	public Students(String fName, int age) {
		this.fullName = fName;
		this.age = age;
	}

	// normal method

	public void displayFullname() {
		System.out.println(this.fullName);
	}

	// static method

	public static void displayCountry() {
		System.out.println(Students.Country);
	}

}
