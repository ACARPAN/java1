package string1;

public class string07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[6];

		names[0] = "Ram";
		names[1] = "Vishal";
		names[2] = "Yukti";
		names[3] = "Pranab";
		names[4] = "Suman";
		names[5] = "Nabin";
		System.out.println(names);

		// Program 02
		// Array stores the element by index
		System.out.println(names[1]);

		String[] cities = { "Salleri", "Khotang", "Okhaldhunga", "Banepa", "Sindhuli" };

		for (int a = 0; a < cities.length; a++) {
			// System.out.println(i);
			System.out.println(cities[a]);
		}

		for (int i = 0; i < names.length; i++) {
			// System.out.println(i);
			System.out.println(names[i]);
		}

		// Program 03
		int[] digits = { 11, 22, 33, 44, 55 };

		int[] digit1 = new int[6];
		digit1[0] = 11;
		digit1[1] = 22;
		digit1[2] = 33;
		digit1[3] = 44;
		digit1[4] = 55;
		digit1[5] = 66;
		// 0 1 2 3 4 5
		// [11, 22,33, 44, 55, 66]

		int sum = 0;

		for (int b = 0; b < digit1.length; b++) {
			// System.out.println(b);
			// System.out.println(digit1[b]);

			sum = sum + digit1[b];
			// 0 + 11 =======> 11
			// 11 + 22 =======> 33
			// 33 + 33 ========> 66
			// 66 + 44 =========> 11
			// 110 + 55 =========> 165
			// 165 + 66 ==========> 231
		}

		System.out.println(sum);

		// Program 04

		String message = "I am learning java with Chinmay sir";
		String[] message1 = message.split(" ");
		String[] message2 = message.split("a");
		// ["I","am","learning","java" "with" "Chinmay" "sir"];
		// ["I ","m le","rning j","v","with", "chinm", "y", "sir"]

		for (int c = 0; c < message1.length; c++) {
			// System.out.println(i);
			System.out.println(message1[c]);
		}

		for (int d = 0; d < message2.length; d++) {
			// System.out.println(i);
			System.out.println(message2[d]);

		}
		// Program 05
		String cityName = "New York City";
		// ['N','e','w', 'Y','o','r' 'k', 'C', 'i', 't', 'y']
		char aa[] = cityName.toCharArray();

		// System.out.println(aa);// y not reference

		for (int e = 0; e < aa.length; e++) {
			System.out.println(aa[e]);
		}

		// for each loop

		// Program 06
		int age[] = { 22, 23, 25, 28, 54, 56 };

		for (int a : age) {
			System.out.println(a);
		}

		String[] title = { "Anmol", "Thile", "Bibek", "Pushpa", "Jhmak", "Chimmi" };
		for (String n : title) {
			System.out.println(n);
		}

		char[] name1 = { 'A', 'r', 'p', 'a', 'N' };
		String rev = "";
		// ArpaN
		for (char t : name1) {
			rev = rev + t;
	}
		System.out.println(rev);

	}

	// Program 07 // sum and average

	int digits2 [] = { 5, 7, 10, 12, 15, 17, 19, 23, 28 };
    int suma = 0;
	float avg = 0;


	for(int j:digits2); {
		suma = suma + j;
		}

	System.out.println(suma);
	avg=suma/digits2.length;
	System.out.println(avg);

	// Program 08

 int[][] multiple = { { 10, 20, 30 }, { 101, 202, 303, 404 } };


	System.out.println(multiple[0][0]);
	System.out.println(multiple[0][1]);
	System.out.println(multiple[1][1]);
	System.out.println(multiple[1][3]);
	System.out.println(multiple[1][0]);
	System.out.println(multiple[0][2]);

}
}
