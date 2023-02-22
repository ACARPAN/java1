package string1;

public class Userdata5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GFather Milan = new GFather();
		Milan.displayGName();
		Father Nirkumar = new Father();
		System.out.println(Nirkumar.fatherFName);
		System.out.println(Nirkumar.firstName);
		System.out.println(Nirkumar.lastName);
		Nirkumar.displayFName();
		Nirkumar.displayGName();
		Son Niranjan = new Son();
		System.out.println(Niranjan.sonName);
		Niranjan.displaySName();
		GrandFather HariMan = new GrandFather("Hari Man", "Basnet");
		System.out.println(HariMan.firstName);
		System.out.println(HariMan.lastName);
		HariMan.GName();
		Father1 Naindra = new Father1("Hari Man", "Basnet", "Naindra");
		System.out.println(Naindra.FfirstName);
		System.out.println(Naindra.lastName);
		System.out.println(Naindra.firstName);
		Naindra.FName();
		Naindra.GName();
		Son1 Anup = new Son1("Hari Man", "Basnet", "Naindra", "Anup");
		System.out.println(Anup.SName);
		System.out.println(Anup.lastName);
		System.out.println(Anup.firstName);
		Anup.FName();
		Anup.GName();
		Anup.SName();
	}

}
//without constructor

class GFather {

	String firstName = "Milan";
	String lastName = "Karki";

	public void displayGName() {
		System.out.println(this.firstName + " " + this.lastName);
	}

}

class Father extends GFather {

	String fatherFName = "Nir Kumar";

	public void displayFName() {
		System.out.println(this.fatherFName + " " + this.lastName);
	}
}

class Son extends Father {
	String sonName = "Niranjan";

	public void displaySName() {
		System.out.println(this.sonName + " " + this.lastName);
	}
}
//with constructor

class GrandFather {

	String firstName;
	String lastName;

	public GrandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void GName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
}

class Father1 extends GrandFather {
	String FfirstName; // Parent having constructor and child doesn't have a constructor

	public Father1(String fn, String ln, String Ffn) {
		super(fn, ln);
		this.FfirstName = Ffn;
	}

	public void FName() {
		System.out.println(this.FfirstName + " " + this.lastName);
	}
}

class Son1 extends Father1 {
	String SName;

	public Son1(String fn, String ln, String Ffn, String Sfn) {
		super(fn, ln, Ffn);
		this.SName = Sfn;
	}

	public void SName() {
		System.out.println(this.SName + " " + this.lastName);
	}
}