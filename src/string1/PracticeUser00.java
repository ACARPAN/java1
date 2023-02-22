package string1;

public class PracticeUser00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Volvo = new Car("60");
		System.out.println(Volvo.Speed);
		Volvo.stop();
		Car1 Bmw = new Car1("60", "80");
		System.out.println(Bmw.Bmw);
		System.out.println(Bmw.Speed);
		Bmw.stop();
		Bmw.Start();
	}

}

class Car {
	String Speed;

	public Car(String S) {
		this.Speed = S;
	}

	public void stop() {
		System.out.println("This car has max speed of 60mph");
	}
}

class Car1 extends Car {
	String Bmw;

	public Car1(String S, String Bmw) {
		super(S);
		this.Bmw = Bmw;

	}

	public void Start() {
		System.out.println(this.Speed + this.Bmw);
	}
}
