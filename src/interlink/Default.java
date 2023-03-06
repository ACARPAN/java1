package interlink;

public class Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square bb = new Square();
		bb.getCordinated();
		bb.getPerimeter(4, "a");
		bb.getCordinated(0);

	}

}

interface Geometry {
	public void getPerimeter(int num, String a);

	// default method
	default void getCordinated() {
		System.out.println("X = x and Y =y");
	}

	default void getCordinated(int x) {
		System.out.println("Or .....X == X and Y == Y");
	}
}

class Square implements Geometry {

	@Override
	public void getPerimeter(int num, String a) {
		System.out.println("Perimeter of square is" + " " + (num + a));
	}

}
