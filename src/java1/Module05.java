package java1;

public class Module05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Switch without break

		int day = 4;

		switch (day) {
		case 1:
			System.out.println("Sunday");
		case 2:
			System.out.println("Monday");
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
		case 5:
			System.out.println("Thursday");
		case 6:
			System.out.println("Friday");
		case 7:
			System.out.println("Saturday");
		default:
			System.out.println("please input correct day");
		}

		// With break statement
		int night = 6;

		switch (night) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("please input correct day");

		}

		// String

		String City = "San Francisco";
		String State = "New York";

		switch (City) {
		case " Daly City":
		case "San Francisco":
			System.out.println("California");
			break;
		case "Dallas":
		case "Austin":
			System.out.println("Texas");
			break;
		case "Brooklyn":
		case "Albany":
			System.out.println("New York");
			break;
		default:
			System.out.println("Incorrect city name");

		}

		switch (State) {
		case "Texas":
			System.out.println("Houston");
			break;
		case "Colorado":
			System.out.println("Denver");
			break;
		case "California":
			System.out.println("San Francisco Bay Area");
			break;
		default:
			System.out.println("Invalid State");
		}

	}

}
