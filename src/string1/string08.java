package string1;

public class string08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program 01

		int[][] Aa1 = { { 111, 222, 333 }, { 100, 2000, 30000, 400000 }, { 0005, 00006 } };

		System.out.println(Aa1[0][1]); // 222
		System.out.println(Aa1[1][3]); // 400000
		System.out.println(Aa1[2][1]);// 000006

		for (int a = 0; a < Aa1.length; a++) {
			// System.out.println(i);
			// System.out.println(Aa1[i].length);
			int[] r = Aa1[a];
			for (int b = 0; b < r.length; b++) {
				System.out.println(r[b]);
			}

		}

		// Program 02

		int[][] digits = { { 0, -1, -3 }, // 0
				{ -10, -20, -30 }, // 1
				{ 100, 500, -1000 } // 2
		};

		for (int b = 0; b < digits.length; b++) {
			// System.out.println(b);
			// System.out.println(numbers[b]);
			// System.out.println(Arrays.toString(numbers[b]));
			int lines[] = digits[b];
			for (int c = 0; c < lines.length; c++) {
				System.out.println(lines[c]);
			}
		}

		// Program 03

		int digits1[] = { 99, 101, 103 };
		for (int c1 : digits1) {
			System.out.println(c1);
		}

		// multiple dimensional array

		int digits2[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90, 100 } };

		for (int[] d1 : digits2) {
			// System.out.println(d1);
			// System.out.println(Arrays.toString(d1));
			for (int d2 : d1) {
				System.out.println(d2);
			}
		}

		// Program 04

		int digits3[][] = { { 11, 111, 1111 }, { 33, 666, 9999 }, { 555, 5555, 55 } };

		for (int[] line : digits3) {
			// System.out.println(line);
			// System.out.println(Arrays.toString(line));
			for (int colume : line) {
				System.out.println(colume);
			}
		}

		// Program 05

		// table1 = [a,b]
		// a = [a1,a2]
		// b = [b1,b2]
		// a1 = [a1a,a1b,a1c]
		// a2 = [a2a,a2b,a2c]
		// b1 = [b1a,b1b,b1c]
		// b2 = [b2a,b2b,b2c]

		int[][][] table1 = { 
				           { 
				            	{ 1, 2, 3 }, 
				            	{ 40, 50, 60 } 
					
		                   }, 
				           {  
		                	   { 777, 888, 999 }, 
		                	   { 200, 400, 800 } 
		                    }

		                    };
		
		System.out.println(table1[0][0][1]);
		System.out.println(table1[0][1][1]);
		System.out.println(table1[1][1][1]);
		System.out.println(table1[1][0][2]);
		System.out.println(table1[0][0][2]);
		System.out.println(table1[1][0][0]);
		System.out.println(table1[0][0][1]);

		//for (int j = 0;  j < table1.length; j++);
		//int[][] rows = table1[j]; 
	}
	
	}


