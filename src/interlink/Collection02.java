package interlink;

import java.util.HashMap;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> CountryCapitals = new HashMap <String, String>();

		// Add
		CountryCapitals.put("NP", "Kathmandu");
		CountryCapitals.put("IN", "New Delhi");
		CountryCapitals.put("BT", "Thimpu");
		CountryCapitals.put("PK", "Islamabad");
		CountryCapitals.put("BD", "Dhaka");

		System.out.println(CountryCapitals);
		
		//Retrieve
		System.out.println(CountryCapitals.get("NP"));
		System.out.println(CountryCapitals.get("BT"));
		System.out.println(CountryCapitals.get("IN"));
		
		//Update
		CountryCapitals.put("IN", "Bombay");
		System.out.println(CountryCapitals);
		
		//Remove
		CountryCapitals.remove("PK");
		System.out.println(CountryCapitals);
		
		//size()
		System.out.println(CountryCapitals.size());
		
		//clear
		//CountryCapitals.clear();
		//System.out.println(CountryCapitals.size());
		
		//keyset()
		System.out.println(CountryCapitals.keySet());
		
		//values()
		System.out.println(CountryCapitals.values());
		
		for (String key:CountryCapitals.keySet()) {
			System.out.println(key);
		}
		
		for (String values:CountryCapitals.values()) {
			System.out.println(values);
		}
		for (String key:CountryCapitals.keySet()) {
			System.out.println(key +" " +CountryCapitals.get(key));
		}
	}

}
