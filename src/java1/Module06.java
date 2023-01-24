package java1;

public class Module06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for & while

		System.out.println(11);
		System.out.println(22);
		System.out.println(33);
		System.out.println(44);
		System.out.println(55);

		// To print from 1 to 10000 is hard so we will use the loop "for" as a help

		// for loop
		// for loop

//				for(initialization ; conditionCheck ; increment/ decrement) {
//					
//				}

		// Program A

		for (int K = 1; K <= 6; K++) { // 1 /2 // 3 // 4 // 5 // 6 // 7
			System.out.println("Namaste");
		}

		for (int A = -1; A <= 4; A++) { //-1//0 // 1 // 2 // 3 // 4 // 5
			System.out.println(A); // -1, 0 ,1 , 2 , 3, 4
			System.out.println("Namaste");
		}

		for (int B = 4; B >= 0; B--) { //4 // 3 // 2 // 1 // 0
			System.out.println(B); // 4 // 3// 2 // 1 // 0
		}

		for (int i = 4; i <= 40; i = i + 4) { // 4 // 8 // 12 // 16 // 20 // 24 // 28 // 32 // 36 // 40 // 44
			System.out.println(i); //  4, 8, 12 , 16 , 20 ,24 ,28 ,32 , 36 , 40
		}

		for (int j = 3; j <= 30; j = j + 3) {
			System.out.println(j);
		}

		for (int k  = 7; k  >= 3; k --) { // 7 // 6// 5 // 4 // 3// 2
			System.out.println(k); // 7 // 6 // 5 // 4 // 3 
		}

		// i++ increment the value of i by 1
		// i-- decrement the value of i by 1
		// i = i + 2 increment value of i by 2
		// i = i + 1 increment value of i by 1

		// break statement with for loop

		for (int x = 4 ; x <= 8; x++) { // 4 // 5// 4//
			System.out.println(x); // 4
			if (x == 4) {
				break;
			}
		}

		for (int y = 6 ; y >= 3; y--) { // 6 //5//4
			if (y == 4) {  
				break;
			}
			System.out.println(y); // 6 // 5 
		}

		for (int z = 9 ; z >= 5; z--) { // 9// 8// 7 // 6 // 5
			System.out.println(z); // 9 // 8 // 7 // 6 
			if (z == 6) {
				break;
			}

		}

		// continue statement with for

		for (int y  = 2 ; y <= 6; y++) { // 2 // 3 //4 // 5 // 6
			if (y == 4) {
				continue;
			}
			System.out.println(y); // 2 // 3// 5 // 6
		}

	}

}
