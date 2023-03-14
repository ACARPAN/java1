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
	}

}

class TryTees {
	Measurements Ram;

	public TryTees(Measurements r) {
		this.Ram = r;
	}

	public String getTeesType() {
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
			System.out.println("Have you own SIZE ordered");
			return "Have you own SIZE ordered";
		}

	}

	public void getShirtType() {
		switch (Ram) {
		case SMALL:
			System.out.println("KIDS");
			break;

		case MEDIUM:
			System.out.println("YOUNG");
			break;

		case LARGE:
			System.out.println("BIG GUY");
			break;

		case XL:
			System.out.println("EXTRA LARGE MEN");
			break;

		default:
			System.out.println("Have you own SIZE ordered");

		}

	}
}
