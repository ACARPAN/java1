package string1;

public class Userdefined5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Tanvir = new Employee("Tanvir Malik", 28, 10000, "San Francisco");
		System.out.println(Tanvir.fullName);
		System.out.println(Tanvir.salary);
		System.out.println(Tanvir.city);
		Tanvir.Esalary();
		Supervisor Tanvir1 = new Supervisor("Tanvir", 28, 10000, "San Francisco", 5000);
		System.out.println(Tanvir1.benifits);
		Tanvir1.benifits();
		Director Vania = new Director("Vania Morela", 27, 15000, "San Bruno", 5000, 10000);
		System.out.println(Vania.fullName);
		System.out.println(Vania.bonous);
		System.out.println(Vania.city);
		Vania.bonus();
		
		Animal dog = new Animal ("Bhotey", "Brown");
		Dog Bhotey= new Dog ("Bhotey" ,"Brown", 4 );
		Cat c = new Cat ("Bhotey", "Brown", 2);
		System.out.println(dog.Name);
		System.out.println(dog.color);
		dog.displayeat();
		Bhotey.displaydog();
		c.displayC();
	}

}

//Single  Inheritance

class Employee {

	String fullName;
	int age;
	int salary;
	String city;

	public Employee(String fn, int ag, int sry, String ct) {
		this.fullName = fn;
		this.age = ag;
		this.salary = sry;
		this.city = ct;
	}

	public void EName() {
		System.out.println(this.fullName);
	}

	public void Esalary() {
		System.out.println(this.salary = 10000);
	}
}

//multilevel
class Supervisor extends Employee {
	int benifits;

	public Supervisor(String fn, int ag, int sry, String ct, int bft) {
		super(fn, ag, sry, ct);
		this.benifits = bft;

	}

	public void benifits() {
		System.out.println(this.benifits + this.salary);

	}
}

class Director extends Supervisor {
	int bonous;

	public Director(String fn, int ag, int sry, String ct, int bft, int bns) {
		super(fn, ag, sry, ct, bft);
		this.bonous = bns;
	}

	public void bonus() {
		System.out.println(this.salary + this.benifits + this.bonous);
	}
}

//Hierarchical inheritance
class Animal {
	String Name;
	String color;

	public Animal(String nm, String cl) {
		this.Name = nm;
		this.color = cl;
	}

	void displayeat() {
		System.out.println("dog eats");
	}
}

class Dog extends Animal {
	int legs;

	public Dog(String nm, String cl, int lg) {
		super(nm, cl);
		this.legs = lg;
	}

	void displaydog() {
		System.out.println(this.legs + this.Name + this.color);
	}
}

class Cat extends Dog {
	int clegs;

	public Cat(String nm, String cl, int clg) {
		super(nm, cl, clg);
		this.clegs = clg;

	}

	void displayC() {
		System.out.println(this.clegs + this.Name + this.color);
	}
}
