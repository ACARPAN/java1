package interlink;

enum Month {
	JANUARY, 
	MAY,
	JULY,
}
//class Month {
//public static final Month JANUARY= new Month();//backstage

enum Day {
	SUNDAY,
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY, 
	FRIDAY, 
	SATURDAY,

}

class Off {

	Day on;

	public Off(Day on) {
		this.on = on;
	}

	public void weekTest() {

		switch (on) {
		case SUNDAY:
			System.out.println("ARRAY");
			break;
		case MONDAY:
			System.out.println("FOR LOOP");
			break;
		case TUESDAY:
			System.out.println("INHERITANCE");
			break;
		case WEDNESDAY:
			System.out.println("SELENIUM");
			break;
		case THURSDAY:
			System.out.println("API");
			break;
		case FRIDAY:
			System.out.println("STRING");
			break;
		case SATURDAY:
			System.out.println("ABSTRACT");
			break;

		}

	}

}

public class Enum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month a1 = Month.MAY;
		Month a2 = Month.JANUARY;
		Month a3 = Month.JULY;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		Off b = new Off(Day.SUNDAY);
	b.weekTest();
		
		Day [] count = Day.values();
		
		for(Day c: count ) {
			//System.out.println(c.ordinal());// 0,1,2,3,4,5,6
			System.out.println(c);
		}
		
		System.out.println(Day.SATURDAY); // SATURDAY only
		System.out.println(Day.TUESDAY);
		
			
				
		
	}

}
