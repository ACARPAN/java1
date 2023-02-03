package string1;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program 1 creating a string
String lesson = " I am starting to learn a selenium";
String Knowledge = "I am trying to be a java learner" ;
System.out.println(lesson);
System.out.println(Knowledge);

//String  + Integer  ===>  String
		// Integer + Integer  ===>  Integer
		// Integer + String   ===>  String
		// String  + String   ====> String
		
		// Program 2
		System.out.println("Namaste Nepal"+2023); // "Namaste Nepal2023"
		System.out.println(5+4); // 9
		System.out.println(6+"66"); // "666"
		System.out.println("2"+"2"); // "22"
		
		//Program 3
		//Length() of string
		
		String call = "I am learning java coding";
		int z1 = call.length();
		System.out.println(z1);
		System.out.println(call.length());
		
		int d1 = 50;
		System.out.println(d1); // 50
		System.out.println("d1"); // d1
		
		// Program 4
		String first = "Python";
		String second = " Learning";
		System.out.println(first+second);
		System.out.println(first + " " + second);
		
		//Program 5
		
		String three = "I am learning ";
		String four = "java !";
		String five = three.concat(four);
		System.out.println(five);
		
		// Program 6
		String city = new String("Sacramento");
		System.out.println(city);
		
		//Programs7
		
		// Form ----> San Francisco san Francisco saN francisco======> SAN FRANCISCO 

		String city1 = "Daly City";
		String cityA = city1.toUpperCase();
		System.out.println(cityA);
		
		String city2 = "Dallas";
		String cityB = city2.toLowerCase();
		System.out.println(cityB);
		
		String city3 = "San Jose"; 	
		System.out.println(city3.length());
		
		String country = "Nepal";
		String X2= country.toUpperCase();
		System.out.println(X2);
		int z2 = country.toUpperCase().toLowerCase().length();
		System.out.println(z2);
		
		

		

	}



	}
