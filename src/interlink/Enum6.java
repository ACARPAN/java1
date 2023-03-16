package interlink;

public class Enum6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruits bb = Fruits.APPLE;
bb.displayFruits();
System.out.println(bb.BANANA);
	}

}
enum Fruits {
	
	APPLE,
	BANANA,
	MANGO,
	GRAPES;
	
	private Fruits() {
		System.out.println("Fruits constructor called");
	}
	
	public void displayFruits(){
		System.out.println("Fruits method called");
	}
}