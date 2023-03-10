package string1;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery CA = new Grocery();
		System.out.println(CA.price);
		Grocery.Fruit DC = CA.new Fruit();
		DC.displayCity();
		System.out.println(DC.supplier);
		System.out.println(DC.vendor);
		Grocery.Vegetables CA2 = CA.new Vegetables();
		CA2.displayCity();
		System.out.println(CA2.supplier);
		System.out.println(CA2.vendor);

	}

}

class Grocery {

	int price = 150;

	// Inner class1
	class Fruit {
		String supplier = "Top Horizon";
		String vendor = "Costco";

		public void displayCity() {
			System.out.println("City is Fresno,CA");
		}
	}

	// Inner class 2
	class Vegetables {
		String supplier = "Foods Co";
		String vendor = "Safeway";

		public void displayCity() {
			System.out.println("City is Pleasanton, CA");
		}

	}

}
