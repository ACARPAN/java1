package interlink;

enum Measurements {

	SMALL, MEDIUM, LARGE, XL
}

public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Measurements.XL);
		TryTees bb = new TryTees(Measurements.LARGE);
		bb.getTeesType();

		TryTees aa = new TryTees(Measurements.MEDIUM);
		aa.getTeesType();
		System.out.println(aa.Ram);

		TryTees cc = new TryTees(Measurements.XL);
		cc.getShirtType();
		TryTees dd = new TryTees(Measurements.SMALL);
		dd.getShirtType();
	}

}

class TryTees {
	Measurements Ram;

	public TryTees(Measurements r) {
		this.Ram = r;
	}

	public String getTeesType() {
		// switch
		switch (Ram) {
		case SMALL:
			System.out.println("KIDS");
			return "KIDS";

		case MEDIUM:
			System.out.println("YOUNG");
			return "YOUNG";

		case LARGE:
			System.out.println("BIG GUY");
			return "BIG GUY";

		case XL:
			System.out.println("EXTRA LARGE");
			return "EXTRA LARGE";

		default:
			System.out.println("Have your own SIZE ordered");
			return "Have your own SIZE ordered";
		}

	}

	public void getShirtType() {
		// break switch
		switch (Ram) {
		case SMALL:
			System.out.println("KIDS under 7");
			break;

		case MEDIUM:
			System.out.println("YOUNG upto 16 age");
			break;

		case LARGE:
			System.out.println("BIG GUY want bigger");
			break;

		case XL:
			System.out.println("EXTRA LARGE MEN");
			break;

		default:
			System.out.println("Have your own SIZE ordered");

		}

	}
}
