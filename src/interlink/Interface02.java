package interlink;

public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IME w = new IME();
		w.homeLoan();
		w.intetest();
		w.loan();
		w.save();
		w.studentLoan();
		Rectangle R = new Rectangle();
		R.getArea(5, 10);

	}

}

interface ADBRules {

	public void loan();

	public void save();

	public void intetest();
}

interface NMB {
	public void homeLoan();

	public void studentLoan();
}

class IME implements ADBRules, NMB {

	@Override
	public void homeLoan() {
		System.out.println("Ime has a home loan");

	}

	@Override
	public void studentLoan() {
		// TODO Auto-generated method stub
		System.out.println("Ime has a student loan");

	}

	@Override
	public void loan() {

		System.out.println("Ime has a loan facility");

	}

	@Override
	public void save() {
		System.out.println("Ime has a saving");

	}

	@Override
	public void intetest() {
		System.out.println("Ime has a interest");

	}
}

interface Airthematic {
	public void getArea(int length, int breadth);
}

class Rectangle implements Airthematic {

	@Override
	public void getArea(int length, int breadth) {
		System.out.println("The area of rectangle is " + (length * breadth));
	}

}