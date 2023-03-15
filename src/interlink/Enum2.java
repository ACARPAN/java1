package interlink;

enum Vehicles {

	// enum constants calling with constructor;

	SUV("Mercedes"), 
	SEDAN("Tesla 3"),
	COUPE("Porsche");

	private final String sizeCar;

	private Vehicles(String c) {
		this.sizeCar = c;
	}

	public String getSizes() {
		return this.sizeCar;
	}

}

public class Enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles a = Vehicles.COUPE;
		System.out.println(a.getSizes());
	}

}
