package interlink;

public class Interlink22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet Aa = new Alphabet("Lalitpur", "Aastha", 78617);
System.out.println(Aa.pincode);
Aa.Alphabet();
Aa.displayCity();
Aa.A();

	}

}

interface Aa {
	public void A();

	public void B();
}

interface Bb {
	public void C();

	public void D();
}

abstract class Cc {
	String city;
	String name;

	public Cc(String cty, String name) {
		this.city = cty;
		this.name = name;
	}

	abstract public void E();

	public void displayCity() {
		System.out.println(this.city);
	}

}

class Alphabet extends Cc implements Aa, Bb {
	int pincode;

	public Alphabet(String cty, String name, int pncode) {
		super(cty, name);
		this.pincode = pncode;

	}

	@Override
	public void C() {
		System.out.println("three");

	}

	@Override
	public void D() {
		System.out.println("four");

	}

	@Override
	public void A() {
		System.out.println("first");

	}

	@Override
	public void B() {
		System.out.println("two");

	}

	@Override
	public void E() {
		System.out.println("Five");
	}

	public void Alphabet() {
		System.out.println("own method " + this.pincode);
	}

}