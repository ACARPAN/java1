package string1;

public class string05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 01
		// 0 1 2 3 4 5
		// b a n a n a

		String fruit = "banana";
		int a = fruit.indexOf('a', 3);
		System.out.println(a);
		int count = 0;
		for (int i = 0; i < fruit.length(); i++) {

			if (fruit.charAt(i) == 'a') {
				System.out.println(i);
				count = count + 1;
			}
		}
		System.out.println(count);

		// Program 02 //array

		int numb[] = new int[6];
		numb[0] = 9;
		numb[1] = 10;
		numb[2] = 11;
		numb[3] = 12;
		numb[4] = 13;
		numb[5] = 14;

		// 0 1 2 3 4 5
		// numb => 9, 10, 11, 12, 13, 14]
		System.out.println(numb[0]);
		System.out.println(numb[1]);
		System.out.println(numb[2]);
		System.out.println(numb[3]);
		System.out.println(numb[4]);
		System.out.println(numb[5]);

		// Program 03// another way of calling

		int numbs[] = new int[6];
		numbs[0] = 11;
		numbs[1] = 111;
		numbs[2] = 1111;
		numbs[3] = 11111;
		numbs[4] = 111111;
		numbs[5] = 1111111;

		System.out.println(numbs.length);
		for (int b = 0; b < numbs.length; b++) {
			// System.out.println(b);
			System.out.println(numbs[b]);
		}
		// Program 04

		String cities[] = new String[5];
		cities[0] = "Pokhara";
		cities[1] = "Hetauda";
		cities[2] = "Chitwan";
		cities[3] = "Biratnagar";
		cities[4] = "Dharan";

		for (int c = 0; c < cities.length; c++) {
			// System.out.println(i);
			System.out.println(cities[c]);
		}

		// Program 05
		// 0 1 2 3 4 5 6
		int numbersb[] = { 10, 20, 30, 40, 50, 60, 70 };

		for (int d = 0; d < numbersb.length; d++) {
			// System.out.println(d);
			System.out.println(numbersb[d]);
		}

		// Program 06

		String clubs[] = { "Chelsea", "Napoli", "Barcelona", "Dortmund" };
		for (int e = 0; e < clubs.length; e++) {
			System.out.println(clubs[e]);
		}

		char cc[] = { 'C', 'h', 'e', 'l', 's', 'e', 'a' };
		for (int f = 0; f < cc.length; f++) {
			// System.out.println(f);
			System.out.println(cc[f]);
		}

		// Program 07

		String firstName = "Laxmi";
		char ccc [] = firstName.toCharArray(); // {'L','a','x',,'m','i'}
		for (int g = 0; g < ccc.length; g++) {
			// System.out.println(g);
			System.out.println(ccc[g]);
		}

		// Program 08

		String AA = "I am  still learning java";
		String cc2[] = AA.split(" ");
		String cc3[] = AA.split("a");

		// {"I","am",'still", "learning","java"}
		// {"I ","m still le","rning ","j","va"}

		for (int i = 0; i < cc2.length; i++) {
			// System.out.println(i);
			System.out.println(cc2[i]);
		}

		for (int i = 0; i < cc3.length; i++) {
			// System.out.println(i);
			System.out.println(cc3[i]);
		}

	}

}
