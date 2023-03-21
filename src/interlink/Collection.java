package interlink;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array is fixed length 
				// ArrayList you can modify the size
				// Object will have properties and methods
				
				ArrayList<String> cars = new ArrayList<String>();
				
				
				// add 
				cars.add("Acura");
				cars.add("Bently");
				cars.add("Cadillac");
				cars.add("Dodge");
				cars.add("Jeep");
				cars.add("Lucid");
						
				//Retrieve
				
				String first = cars.get(1);
				System.out.println(first);	
				
				// update 
				cars.set(2, "Lexus");
				System.out.println(cars.get(2));
				
				// delete
				cars.remove(4);
				System.out.println(cars.get(4));
				
				
				// clear()
				// cars.clear();
				// size() of arrayList
				
				System.out.println(cars.size());
				
				System.out.println(cars);
				
				// for loop 
				
				for(int i = 0 ; i < cars.size();i++) {
					//System.out.println(i);
					System.out.println(cars.get(i));
				}
				
				// for each loop
				for(String carlist:cars) {
					System.out.println(carlist);
				}
				
				
				ArrayList<Integer> number = new ArrayList<Integer>();
				number.add(001); //add
				number.add(002);
				number.add(003);
				number.add(004);
				number.add(005);
				System.out.println(number);
				
				Integer a = number.get(1);//Retrieve
				System.out.println(a);
				
				number.set(3, 006); //update
				System.out.println(number.get(3));
				
				number.remove(1);//delete
				System.out.println(number.get(1));
		
				for (Integer num:number) {
					System.out.println(num);
				}
	}

}

		