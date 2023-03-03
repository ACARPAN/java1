package Practice11;

public class Prac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anoop aa = new Anoop("Anoop", "Basnet", "Kathmandu", 20);
		aa.displayName();
		aa.displaycity();
		System.out.println(aa.age);

	}

}

abstract class Intro {

	String firstName;
	String lastName;
	String city;

	public Intro(String fName, String lName, String cty) {
		this.firstName = fName;
		this.lastName = lName;
		this.city = cty;
	}

	abstract public void displayName();

	public void displaycity() {
		System.out.println("Lalitpur");
	}
}

class Anoop extends Intro {
	int age;

	public Anoop(String fName, String lName, String cty, int age) {
		super(fName, lName, cty);
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayName() {
		System.out.println(this.firstName + " " + this.lastName);

	}
}