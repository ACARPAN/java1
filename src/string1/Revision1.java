package string1;

public class Revision1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// conditional statement
		int a = 100;
		if (a > 50) {
			System.out.println("a is greater");
		} else {
			System.out.println("a is smaller");
		}
		int num = 10;
		if (num > 0 && num <= 5) {
			System.out.println("5% disount");
		} else if (num > 5 && num <= 11) {
			System.out.println("10% discount");
		} else {
			System.out.println("invalid");
		}
		int marks = 80;
		int marks1 = 70;
		if (marks > 80) {
			System.out.println("grade A");
		}
		if (marks > 70) {
			System.out.println("Grade B");
		}
		if (marks > 60) {
			System.out.println("Grade C");
		} 
		if (marks1 > 80) {
			System.out.println("Grade A2");
		} else if (marks1 > 70) {
			System.out.println("Grade A3");
		} else if (marks1 > 60) {
			System.out.println("GradeA1");
		} else {
			System.out.println("try it again");
		}
		int a1=1000;
		int a2=100;
		int a3= 1100;
		if (a1>a2 && a1>a3) {
			System.out.println("a1 is greater");
		}
		if (a2>a3 && a2>a1) {
			System.out.println("a2 is greater");
		}	
		else  {
			System.out.println("a3 is greater"); 
		}
		//switch
		int numbs = 10;
		switch (numbs) {
		case 5:
		case 9:
			System.out.println( "first num");
			break;
		}
		switch (numbs) {
		case 10:
		case 15:
			System.out.println("Second num");
			break;
		
			default:
				System.out.println("invalid value");
		}
		//for loop
		for (int b = 0; b<=40; b++ ) {
			System.out.println(b);
		} 
		for (int c = 10; c>=1; c--) {
			if (c==6) {
				continue;
			}
			System.out.println(c);
		}
		//break before
		for (int d= 5; d<=50; d=d+5) {
			System.out.println(d);
			if (d==40){
				break;
		}
	//break after
			for (int e=60; e>=6; e=e-6) {
				if (e==6) {
					break;
				}
				
			System.out.println(e);
	}
		}
		//while loop
		int x =4;
		while (x<=40) {
			System.out.println(x);
			x=x+4;
		}
		//while break and continue
		int x1 = 50;
		while (x1>5) {
			System.out.println(x1);
		if (x1==40) {
			break;
		}
		x1=x1-5;
		}
		int x2 = 3;
		while (x2<=30) {
		if (x2==27) {
			break;
		}
		System.out.println(x2);
		x2=x2+3;
		}
		
		int x3 =20;
		while (x3>=2) {
			if (x3==16) {
				x3=x3-2;
				continue;
			}
			System.out.println(x3);
			x3=x3-2;
		}
		//String
		String AA = "I want to fly on top";
		for (int f = 0; f<AA.length(); f++) {
			if (AA.charAt(f)=='o') {
			System.out.println(f);
		}
		}
		int [] digit = {1,3,5,7,9};
		int add =0;
		for (int g= 0; g <digit.length; g++) {
			add=add + digit[g];
		}
		System.out.println(add);
	//vowels
String name1= "Arpan";
int count=0;
for (int h=0; h<name1.length(); h++) {
	if (name1.charAt(h)=='a' ||name1.charAt(h)=='e' || name1.charAt(h)=='i'||name1.charAt(h)=='o'||name1.charAt(h)=='u') {
		count=count + 1;
	}
	System.out.println(count);
}
}
}
