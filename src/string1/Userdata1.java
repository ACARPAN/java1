package string1;

public class Userdata1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human Anoop = new Human("Anoop", "Basnet", 21);
		Human Asmita = new Human("Asmita", "Basnet", 24);
		Human Arpan = new Human("Arpan", "Basnet", 27);

		System.out.println(Anoop.age);
		System.out.println(Asmita.lastName);
		Arpan.response();
		Anoop.movement();
		System.out.println(Arpan.firstName);

		Bank Bofa = new Bank("Bofa", "Personal", 5000);
		Bank Chase = new Bank("Chase", "Saving", 10000);
		Bank Amex = new Bank("Amex", "Travel", 20000);
		System.out.println(Bofa.bankaccount);
		System.out.println(Chase.bankname);
		System.out.println(Bofa.credit);
		Amex.deposit();
		Chase.trasfer();
	}

}
//Userdefined Datatype

class Human {

	String firstName;
	String lastName;
	int age;

	public Human(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public void movement() {
		System.out.println("I can move");
	}

	public void response() {
		System.out.println("I can response back");
	}

	class Bank {
		String bankname;
		String bankaccount;
		int credit;

		public Bank(String bn, String ba, int cr) {
			this.bankname = bn;
			this.bankaccount = ba;
			this.credit = cr;
		}

		public void deposit() {
			System.out.println("you can deposit  your first saving");
		}

		public void trasfer() {
			System.out.println("you can trasfer your amount to any account");
		}
	}
}