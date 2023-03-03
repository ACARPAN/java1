package Practice11;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alphabet bb = new Alphabet ("Bhaktapur", "Asmita", 555);
bb.A();
bb.Alphabet();
bb.B();
bb.displayCity();
bb.first();
bb.three();
	}

}

interface One {
	public void first();

	abstract public void A();

}

interface Two {
	public void second();

	abstract public void B();
}

abstract class Foundation {
	String city;
	String name;

	public Foundation(String cty, String name) {
		this.city = cty;
		this.name = name;
	}

	abstract public void three();

	public void displayCity() {
		System.out.println(this.city);
	}
}

class Alphabet extends Foundation implements One, Two {
	int pincode;

	public Alphabet(String cty, String name, int pncode) {
		super(cty, name);
		this.pincode = pncode;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void second() {
		System.out.println("i am second");
	}

	@Override
	public void B() {

		System.out.println("i am third");
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("i am first");
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("i am number one");
	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println("i am number 3");
	}
	
public void Alphabet () {
	System.out.println("own method" + this.pincode);
}
}