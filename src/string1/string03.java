package string1;

public class string03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program 01
		String city = "Solukhumbu";

		System.out.println(city);

		// 0 1 2 3 4 5 6 7 8 9
		// S o l u k h u m b u
		// program 1
		for (int x = 0; x < 9; x++) { // 1 // 2 // 3 // 4 //5 // 6 // 7 // 8 //9 //10
			// i ----0
			// i ----1
			// i ----2
			// i ----3
			System.out.println(city.charAt(x));

		}

		// Program 02

		for (int y = city.length() - 1; y >= 0; y--) {

			System.out.println(city.charAt(y));
		}

		String country = "Nepal";
		String rev = "";

		for (int i = 0; i < country.length(); i++) {
			// System.out.println(i);
			// System.out.println(country.charAt(i));

			rev = country.charAt(i) + rev;
			System.out.println(rev);
		}
		System.out.println(rev);

		String city2 = "Chitwan";
		String rev2 = "";

		// 0 1 2 3 4 5 6
		// C h i t w a n

		for (int z = city2.length() - 1; z >= 0; z--) {
			// System.out.println(i);
			// System.out.println(city3.charAt(i));
			rev2 = rev2 + city2.charAt(z);
			System.out.println(rev2);
		}
		System.out.println(rev2);

		// program 03
		String clubs = "Chelsea Real Madrid Manchester United Bayern Munich Juventus";
		String userInput = "Chelsea";
		if (clubs.contains(userInput)) {
			System.out.println("Club is available on top");
		} else {
			System.out.println("Club is  not available");
		}

		// Program 04
		// ----- vowels "a" , "e" , "i" , "o" , "u"

		String firstword = "Audio";
		int number = 0;
		System.out.println(firstword);
		System.out.println(firstword.length());

		for (int q = 0; q < firstword.length(); q++) {
			System.out.println(firstword.charAt(q));

			for (int t = firstword.length() - 1; t > 0; t--) {
				System.out.println(firstword.charAt(t));
			}
			if (firstword.charAt(q) == 'a' || firstword.charAt(q) == 'e' || firstword.charAt(q) == 'i'
					|| firstword.charAt(q) == 'o' || firstword.charAt(q) == 'u') {
				number = number + 1;
			}

		}

		System.out.println(number);

	}

}
