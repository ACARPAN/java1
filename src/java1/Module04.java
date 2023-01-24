package java1;

public class Module04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conditional statement

		// one input and multiple outcomes

		// Tokens
		// numT > 0 && numT <= 6 ====> 15 % D
		// numT > 6 && numT <= 10 ====> 20 % D
		// numT > 11 ====> 30 % D

//		if(condition){
//			statements
//		}

//		if( 5 == 6) {
//			System.out.println("Namaste");
//		}
//		else {
//			System.out.println("Bye");
//		}

		int numT = 50;
		int couponT = 20;

//		if(numT > 0 && numT <= 6) {
//			System.out.println("15% discount");
//		}
//		
//		if(numT > 6 && numT <= 11) {
//			System.out.println("20% discount");
//		}
//		if(numT > 11) {
//			System.out.println("30% discount");
//		}

		if (numT > 0 && numT <= 6) {
			System.out.println("15% discount");
		} else if (numT > 5 && numT <= 10) {
			System.out.println("20% discount");
		} else if (numT > 10) {
			System.out.println("30% discount");
		}
		if (couponT >= 10 && couponT <= 8) {
			System.out.println("Meghastar");

		} else if (couponT >= 10 && couponT == 20) {
			System.out.println("Superstar");
		} else if (couponT == 10 && couponT >= 20) {
			System.out.println("Star");
		} else {
			System.out.println("Flop");
		}
//		if(scores > 80) {
//			System.out.println("Grade A");
//		}
//		if(scores > 70) {
//			System.out.println("Grade B");
//		}
//		
//		if(scores > 60) {
//			System.out.println("Grade C");
//		}
		// if and else if

//		if(scores > 90) {
//			System.out.println("Grade A");
//		}
//		else if(scores > 70) {
//			System.out.println("Grade B");
//		}
//		
//		else if(scores > 60) {
//			System.out.println("Grade C");
//		}

		int a1 = 60;
		int a2 = 20;

		if (a1 > a2) {
			System.out.println("a1 is greater");
		} else {
			System.out.println("a2 is greater");
		}

		// Largest of three numbers
		int x = 1000;
		int y = 500;
		int z = 100;
		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > x) {
			System.out.println("y is greatear");
		} else {
			System.out.println("z iz greater");
		}
	}

}
