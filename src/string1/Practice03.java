package string1;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "Biratnagar";
		String city1 = city.toLowerCase();
		System.out.println(city1);
		String A = "banana";
		String B ="Orange";
		boolean Aa = A.equals(B) ;
		boolean Ab = A.contains(A);
		System.out.println(Aa);
		System.out.println(Ab);
		String city2 = "Dharan";
		String city3= "Hetauda";
		String city4 = "Dharan";
		boolean data = city2.equals(city3);
		boolean data1 = city2.equals(city4);
				if (data) {
					System.out.println("both city are same");
				}
					else {
						System.out.println("both city are different");
		
				}
				String name1 = "man in air";
				String name2 = "Aastha";
				int define = name1.length();
				int define1 = name2.length();
				for (int i = 0; i < define ; i++){
				System.out.println(name1.charAt(i));
			}
				for (int j = define1-1 ; j>=0 ; j--) {
					System.out.println(name2.charAt(j));
				}
				
			String name3="kaanchi";
			String rev = "";
			for (int b=0; b<name3.length(); b++) {
				rev=name3.charAt(b)+ rev;
				System.out.println(rev);
			}
			
		String country = "Nepal";
		for (int c= 0; c< country.length(); c++) {
			System.out.println(country.charAt(c));
		
			int country1 =country.length();
			System.out.println(c);
			
			String country2= "India";
			char b = country2.charAt(3);
			System.out.println(b);
			System.out.println(country2.length());
			
		}
		String value = "Java";
		String value2= value.substring(0);
		System.out.println(value2);
		String a = "i live ";
		String aa = "in cali";
		String aaa = String.join("", a, aa);
		System.out.println(aaa);
		
		String a2= "Bandipur";
		int a1 = a2.indexOf('d');
		System.out.println(a1);
		
		String a3 = "Bhaktapur";
		int a11 = a3.indexOf('a', 3);
		System.out.println(a11);
		
		String a4 = "I live in Daly City";
		String [] a44 = a4.split("");
		System.out.println(a44);
		
		int numb [] = new int [4];
		numb[0] = 11;
		numb [1]= 22;
		numb [2]= 33;
		numb [3]= 44;
		System.out.println(numb[1]);
		System.out.println( numb [3]);
		
		int numbs [] = new int [3];
		numbs[0]= 10;
		numbs [1]=20;
		numbs [2]= 30;
		System.out.println(numbs.length);
		for(int d=0; d<numbs.length; d++) {
			System.out.println(numbs[d]);
			
			
		}
		
		
		
		
		
	}
}
	
	
