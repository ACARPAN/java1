package Practice11;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehichle Automobile[] = { new Vehichle("Red", "Sedan"), new Vehichle("Black", "Suv"),
				new Vehichle("Blue", "Sedan") };
for (int i=0; i<Automobile.length; i++) {
	System.out.println(Automobile[i]);
}
		for (Vehichle a : Automobile) {
			a.start();
			System.out.println(a.type);
			 System.out.println(a.type);
			 System.out.println(a.color);
		}
	}

}

class Vehichle {
	public String color;
	String type;

	public Vehichle(String cl, String ty) {
		this.color = cl;
		this.type = ty;

	}

	public void start() {
		System.out.println(this.color + this.type + " " + "it start");
	}

	public void stop() {
		System.out.println("it can stop");
	}
}
