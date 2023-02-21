package string1;

public class Userdata2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla usa []= {
				new Tesla ("Model 3", "White",2022),
				new Tesla ("Model Y", "Black", 2023),
				new Tesla ("Model X", "Blue", 2022),
		};
		for(Tesla a:usa ) {
			//a.displaycolor();
		System.out.println(a.color);
		System.out.println(a.model);
		System.out.println(a.year);
		}
		for (int a=0; a<usa.length; a++)	{
			System.out.println(usa[a].color);
		}
	}
}
//User defined
		class Tesla {
			String model;
			String color;
			int year;
			public Tesla (String model, String color, int year) {
				this.model= model;
				this.color= color;
				this.year= year;
			}
			public void displaymodel() {
				System.out.println(this.model);
			}
			public void displaycolor () {
				System.out.println(this.color);
			}
		

	
}