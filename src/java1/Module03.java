package java1;

public class Module03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// < Less than ,> Greater than,<= Less than or Equal to, >= Greater than or
		// Equal to ,!= Negate or Equal to ,== Equal tol

		int x = 600;

		System.out.println(x > 100); // boolean value type (true and false)
		System.out.println(14==14);
		System.out.println(6 >= 6);
		System.out.println(9 <= 9);
		System.out.println(9 >= 7);
		System.out.println(8 <= 6);
		System.out.println(7 != 6);
		System.out.println(8 < 6);

		int x1 = 50;
		int x2 = 50;

		System.out.println(x1 == x2);

		// Logical operators

		// AND &&

		// true && true ====> true
		// true && false ====> false
		// false && true ====> false
		// false && false ====> false

		System.out.println(4 == 4 && 5 != 2);
		System.out.println(3 != 5 && 2 == 2);
		System.out.println(5 == 5 && 4 != 4);
		System.out.println(4 >= 5 && 5 != 4);
		System.out.println(3 > 3 && 4 != 3);
		System.out.println(2 > 2 && 5 == 3);

		// OR ||

		// ctrl + shift + F
		// true || true ====> true
		// true || false ====> true
		// false || true ====> true
		// false || false ====> false

		System.out.println(4 == 4 || 4 != 3); // true
		System.out.println(3 != 5 || 2 == 2); // true
		System.out.println(6 == 6 || 4 != 4); // true
		System.out.println(3 > 3|| 5 != 3); // true
		System.out.println(5> 5|| 3== 2); // false

		// NOT !

		// false --- true
		// true --- false

		System.out.println(!(2 == 2));
		System.out.println(!(2 != 2));

	}

}
