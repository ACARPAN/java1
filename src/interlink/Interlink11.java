package interlink;

public class Interlink11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D aa = new D();
		aa.five();
		aa.seven();
		aa.nine();
	}

}

interface A {
	public void one();

	public void two();

	public void three();
}

interface B {
	public void four();

	public void five();

	public void six();
}

interface C extends A, B {

	public void seven();

	public void eight();

	public void nine();

}

class D implements C {

	@Override
	public void one() {
		System.out.println("first");

	}

	@Override
	public void two() {
		System.out.println("second");

	}

	@Override
	public void three() {
		// TODO Auto-generated method stub
		System.out.println("third");
	}

	@Override
	public void four() {

		System.out.println("fourth");
	}

	@Override
	public void five() {
		System.out.println("fifth");

	}

	@Override
	public void six() {
		System.out.println("sixth");

	}

	@Override
	public void seven() {
		System.out.println("Seventh");

	}

	@Override
	public void eight() {
		System.out.println("eighth");

	}

	@Override
	public void nine() {
		System.out.println("ninth");

	}
}
