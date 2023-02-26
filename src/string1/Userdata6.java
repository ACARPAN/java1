package string1;

public class Userdata6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data Aa = new Data();
		Aa.multiplication(10, 20);
		Aa.multiplication(3, 5, 7);
		Aa.multiplication(11, 22, 33, 44);
		DataB bb = new DataB();
		DataB b1 = new DataB(10);
		DataB b2 = new DataB(40, 60);
		DataB b3 = new DataB(80, 100, 1);
	}

}

class Data {
	// OVERLOADING........
	// same class ..
	// same method name ..
	// different signature ..
	// OVERLOADING without parameter

	public void multiplication(int x, int y) {
		System.out.println(x * y);
	}

	public void multiplication(int x, int y, int z) {
		System.out.println(x * y - z);
	}

	public void multiplication(int x, int y, int z, int w) {
		System.out.println(x + y + z + w);
	}

}
//OVERLOADING with constructor parameter

class DataB {
	public DataB() {
		System.out.println("Default Constructor");
	}

	public DataB(int a) {
		System.out.println("Constructor called with one parameter");
	}

	public DataB(int a, int b) {
		System.out.println("Constructor called with two parameter");
	}

	public DataB(int a, int b, int c) {
		System.out.println("Constructor called with three parameter ");

		NabilBank cc = new NabilBank("Lalitpur", 44669, 555);
		cc.loan(22220);
		cc.save(555550);

		IME c1 = new IME("Kathmandu", 66999, "Saving");
		c1.loan(33330);
		System.out.println(c1.account);
		c1.save(999990);
	}
}

class AsianDevBank {

	// Method OVERRIDING....
	// Different class ..
	// Same method name ..
	// Same signature via Inheritance..

	String city;
	int passcode;

	public AsianDevBank(String city, int passcode) {
		this.city = city;
		this.passcode = passcode;
	}

	public void loan(int a) {
		System.out.println("Asian Development Bank :Home loan is  6% " + a);
	}

	public void save(int b) {
		System.out.println("Asian Development :Saving percent is 9% " + b);
	}

}

class NabilBank extends AsianDevBank {
	int pincode;

	public NabilBank(String city, int passcode, int pincode) {
		super(city, passcode);
		this.pincode = pincode;

	}

	public void loan(int a) {
		System.out.println("Nabil Bank :Home loan is " + a);
	}

	public void save(int b) {
		System.out.println("Nabil Bank :Saving interest is 10%" + b);
	}

}

class IME extends AsianDevBank {
	String account;

	public IME(String city, int passcode, String account) {
		super(city, passcode);
		this.account = account;

	}

	public void loan(int a) {
		System.out.println("IME Bank :Auto loan is 5% " + a);

	}

	public void save(int b) {
		System.out.println("IME Bank :Saving Interest is 11% " + b);
		super.loan(1111);

	}
}
