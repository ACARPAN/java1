package string1;

public class Userdata3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor with Parameter;

		Bank Chase = new Bank(5000, 1160, "Ryan", "Checking");
		Bank Amex = new Bank(15000, 2292, "Peter", "Checking");
		Bank Discovery = new Bank(10000, 2010, "Elissa", "Saving");
		System.out.println(Chase.accountName);
		System.out.println(Discovery.accountName);
		System.out.println(Amex.balance);
		System.out.println(Chase.accountNo);
		System.out.println(Discovery.balance);
		System.out.println(Chase.balance);
		System.out.println(Amex.type);
		System.out.println(Chase.country);
		System.out.println(Amex.accountName);

		int NewBalance = Amex.deposit(5000);
		System.out.println(NewBalance);

		Amex.withdrawl(4000);

		int NewBalance1 = Amex.withdrawl(1000);
		System.out.println(NewBalance1);

	}

}

class Bank {

	int balance;
	int accountNo;
	String accountName;
	String type;
	String country; // default constructor;
	int transactions[]; // default constructor;

	public Bank(int bal, int accNo, String accName, String type) {
		this.balance = bal;
		this.accountNo = accNo;
		this.accountName = accName;
		this.type = type;
		this.country = "USA";
		this.transactions = new int[5];
	}

	public int deposit(int amount) {
		this.balance = this.balance + amount;
		System.out.println("Deposit successful");
		return this.balance;
	}

	public int withdrawl(int amount) {
		if(this.balance > amount) {
			this.balance = this.balance - amount;
			return this.balance;
		}
		else {
			System.out.println("In sufficient balance");
			return this.balance;
		}
public void rate() {
	if (this.type=="Saving") {
		System.out.println("this user can have 10% interest rate");
	}
	else (this.type== "Checking"){
		System.out.println("this user can have 5% interest rate");
	}
}
	
	}
}