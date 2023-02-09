package string1;

public class string04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program 01
		// 012345678910------------------31
		// java is complicated but a fun too.
		String str1 = "java is complicated but fun too";
		String x1 = str1.substring(0, 11); // End value is not included here
		System.out.println(x1);

		// 0 1 2 3 4 5 6 7 8 9 10
		// p r o g r a m m i n g

		String str2 = "programming"; // end index is optional
		String x2 = str2.substring(4);
		System.out.println(x2);
		// 0 1 2 3 4 5 6 7 8 9 10 11
		// S a n F r a n c i s c o
		String str3 = "San Francisco";
		String x3 = str3.substring(1, 6);
		System.out.println(x3);
		// program 02
		// Join
		String str4 = "Hello";
		String str5 = "I am learning";
		String str6 = "java and programming";

		String i = String.join(" ", str4, str5, str6);
		System.out.println(i);

		String str7 = "maninair";
		String str8 = "domain.com";
		String strA = String.join("@", str7, str8);
		System.out.println(strA);

		String str9 = "man";
		String str10 = "in";
		String str11 = "air";

		String i1 = String.join("-", str9, str10, str11);
		System.out.println(i1);

		// program 03
		
		String city1 = "San Bruno"; //
		//012345678
		//San Bruno

		int i2 = city1.indexOf('n');
		System.out.println(i2);
		String city2 = "Daly city";
		// 0 1 2 3 4 5 6 7 8
		// D a l y   c i t y
		int i3 = city2.indexOf("a", 2);
		System.out.println(i3);

		String city3 = "Berkeley";

		for (int y = 1; y < city3.length(); y++) {
			if (city3.charAt(y) == 'e') {
				System.out.println(i);
			}
			String str12 = " Learning java is awesome";
			String str13 = str12.trim();
			System.out.println(str12.length());
			System.out.println(str13.length());

			// If want to remove spaces in between
			String i4 = str12.replace(" ", "");
			System.out.println(i4);

			// Program 04

			String str14 = "I am learning css";
			String []str15 = str14.split(" ");
			System.out.println(str15);
			
			
    		//String result = "";
			
			String firstName1 = "I am learning java";
			String firstName2 = "";
			
			boolean x11 = firstName1.isEmpty();
			System.out.println(x11);
			
			boolean x12 = firstName2.isEmpty();
			System.out.println(x12);
	
			
		}

		
	}

}
