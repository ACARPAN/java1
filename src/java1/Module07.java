package java1;

public class Module07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loops

		// for loop and while

//				for(Initialization ; ConditionCheck ;increment/Decrement) {
//						//Statements 
//				}

		// print 'Namaste' 5 times;

		for (int i = 0; i < 5; i++) { // 1 // 2 // 3 // 4 // 5
			System.out.println("Namaste");
			// hello // hello // hello // hello // hello
		}

		// print 0 to 10 ;

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// print 10 to 0 ;

		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

		// table of 6 ;
		for (int i = 6; i <= 60; i = i + 6) {
			System.out.println(i);
		}

		// break statement ;
		for (int i = 7; i >= 2; i--) {//6 //5 // 4 // 3 // 
			System.out.println(i); // 7 // 6 // 5// 4 // 3
			if (i == 3) {
				break;
			}
// continue statement ;

		for (int i1 = 1; i1 <= 6; i1++) { // 2 // 3 // 4 // 5 // 6 // 7
			if (i1 == 2 || i1 == 4) {
				continue;
			}
			System.out.println(i1); // 0 // 1 // 3 // 5 // 6
		}
		//while loop ;
		/*
		 * Initialization
		 * 
		 * while(condition){ // statements
		 * 
		 * increment/ decrement
		 * 
		 * }
		 * 
		 */

		// print 'Namaste'  4 times with while loop
		int x1 = 1;
		while (x1 <= 4) {
			System.out.println("Namaste");
			
			x1++; // 2 // 3 // 4 // 5 
		}

		// print 1 to 5

		int x2 = 1;
		while (x2 <= 5) {
			System.out.println(x2);
			x2++;
		}

		// print 6 to 0 ;

		int x3 = 6;
		while (x3 >= 1) {
			System.out.println(x3);
			x3--;
		}

		// table of 8
		int x4 = 8;
		while (x4 <= 80) {
			System.out.println(x4);
			x4 = x4 + 8;
		}

		// table of 7 in reverse ;

		int x5 = 70;
		while (x5 >= 7) {
			System.out.println(x5);
			x5 = x5 - 7;
		}

		// break with while loop ;

		int x6 = 6;
		while (x6 >= 1) {
			if (x6 == 2) {
				break;
			}
			System.out.println(x6); //6 // 5 // 4 // 3
			x6--;  //5 // 4 // 3 // 2
		}

		int x7 = 7;
		while (x7 >= 1) {
			System.out.println(x7); // 7// 6 // 5 // 4 // 
			if (x7 == 3) {
				break;
			}
			x7--;
		}

		// continue with while

		int x8 = 1;
		while (x8 <= 5) {
			if (x8 == 2) {
				x8++;
		    continue;
			}
			System.out.println(x8); // 1 // 3 // 4 // 5
			x8++; // 2 // 4 // 5 // 6
		}

	}
	

	}
}