package interlink;

public class static02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher a = new Teacher ("Rao");
Teacher b = new Teacher ("Regmi");
Teacher c = new Teacher ("Adhikari");
System.out.println(Teacher.count);

	}

}

class Teacher {

	static int count = 0;

	String fullName;

	public Teacher(String fullName) {
		this.fullName = fullName;
		Teacher.expandCount();
	}

	public static void expandCount() {
		Teacher.count = Teacher.count + 1;
	}
}