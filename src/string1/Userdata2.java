package string1;

public class Userdata2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank Bofa =new Bank ("Bofa", "Personal",5000);
Bank Chase = new Bank ("Chase","Saving", 10000);
Bank Amex = new Bank ("Amex", "Travel", 20000);
System.out.println(Bofa.bankaccount);
System.out.println(Chase.bankname);
System.out.println(Bofa.credit);
Amex.deposit();
Chase.trasfer();
	}

}
class Bank{
	String bankname;
	String bankaccount;
	int credit;
	
	public Bank (String bn,String ba,int cr) {
		this.bankname= bn;
		this.bankaccount = ba;
		this.credit = cr;
	}
	public void deposit () {
		System.out.println("you can deposit  your first saving");
	}
	public void trasfer () {
		System.out.println("you can trasfer your amount to any account");
	}
}