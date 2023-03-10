package string1;

public class Userdata4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//default -- declarations are visible only within the package
		// private or public package
		// private -- declarations are visible within the class only
		// protected - declaration are visible within the package or all subclasses
		// public - declarations are visible everywhere

		// Object of messenger

		messenger logA = new messenger();
		logA.message();

		// Object of messenger1

		messenger1 logB = new messenger1();
		// System.out.println(logB.fullName); not possible its private field

		logB.displayFullName1();

		// Object of Figure class

		Figure set1 = new Figure();
		set1.city = "Daly City";
		System.out.println(set1.city);

		// Object of Figure1

		Figure1 set2 = new Figure1();

//		
//		System.out.println(set2.city);
//		set2.city = "San Bruno"
//		

		set2.setCityName("San Bruno");
		String updatedCity = set2.getCityName();
		System.out.println(updatedCity);

		Figure2 set3 = new Figure2("Burlingame");
		System.out.println(set3.getCity());

		set3.setCity("Millbrae");
		System.out.println(set3.getCity());

		Country set4 = new Country();
		set4.Country = "Italy";
		System.out.println(set4.Country);

		Country1 set5 = new Country1();
		set5.setCountryName("Paris");
		String updatedCountry = set5.getCountryName();
		System.out.println(updatedCountry);

		Country2 set6 = new Country2("Spain");
		System.out.println(set6.getCountryName());
		set6.setCountryName("Maldives");
		System.out.println(set6.getCountryName());
	}

}

class messenger {
	void message() {
		System.out.println("Welcome to logger");
	}

}

class messenger1 {

	private String fullName = "Laxmi";

	private void displayFullName() {
		System.out.println(this.fullName);
	}

	void displayFullName1() {
		this.displayFullName();
	}

}

class Figure {

	String city = "Daly City";

}

class Figure1 {

	private String city = "Daly City";

	// set the new value
	// setter
	public void setCityName(String cN) {
		this.city = cN;
	}

	// get the value for city outside the class
	// getter
	public String getCityName() {
		return this.city;
	}

}

class Figure2 {

	private String city;

	public Figure2(String ct) {
		this.city = ct;
	}

	// update the city

	void setCity(String cty) {
		this.city = cty;
	}

	// get the city
	String getCity() {
		return this.city;
	}

}

class Country {
	String Country = "USA";
}

class Country1 {
	private String country1 = "Nepal";

	public void setCountryName(String CN) { // setter
		this.country1 = CN;
	}

	public String getCountryName() {
		return this.country1;
	}
}

class Country2 {
	private String country1;

	public Country2(String CT) {
		this.country1 = CT;
	}

	void setCountryName(String ct) {// while updating the data
		this.country1 = ct;
	}

	String getCountryName() {// while getting the data
		return this.country1;
	}
}
