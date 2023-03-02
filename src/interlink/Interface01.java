package interlink;

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NepalBank ka = new NepalBank();
		ka.interest(6 / 100);
		ka.loan(5000);
		ka.save(1000);
		RastriyaBank kha = new RastriyaBank();
		kha.loan(5 / 100);
		kha.save(2000);
		kha.loan(1000);

	}

}

interface AsianBankLaws {
//We cannot create object of interface
	// interface always used to have abstract methods ---- without body
	public void save(int x);

	public void loan(int y);

	public void interest(int z);

}

class NepalBank implements AsianBankLaws {

	@Override
	public void save(int x) {
		System.out.println("Saving method applys" + x);

	}

	@Override
	public void loan(int y) {
		System.out.println("Loan method approved" + y);

	}

	@Override
	public void interest(int z) {
		System.out.println("Interest rate applies" + z);

	}
}

class RastriyaBank implements AsianBankLaws {

	@Override
	public void save(int x) {
		System.out.println("Rastriya Bank has saving");

	}

	@Override
	public void loan(int y) {
		System.out.println("Rastriya Bank has loan facility");

	}

	@Override
	public void interest(int z) {
		System.out.println("Rastriya Bank applies Interest");

	}
}
