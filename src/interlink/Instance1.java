package interlink;

public class Instance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car.createInstance();
Car.createInstance();
	}

}

class Car {

	static Car Ad;

	private Car() {

	}

	public static Car createInstance() {

		if (Ad == null) {
			System.out.println("Namaste");
			Ad = new Car();
		}
		return Ad;
	}
}