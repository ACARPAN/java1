package interlink;

import java.util.HashMap;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// define a HashMap with Integer , String;
		HashMap<Integer, String> RankingList = new HashMap<Integer, String>();
		
		//Add
		RankingList.put(1, "Asia");
		RankingList.put(2, "Africa");
		RankingList.put(3, "North America");
		RankingList.put(4, "South America");
		RankingList.put(5, "Antartica");
		RankingList.put(6, "Europe");
		RankingList.put(7, "Australia");
		System.out.println(RankingList);
		
		//Retrieve
		System.out.println(RankingList.get(1));
		System.out.println(RankingList.get(2));
		System.out.println(RankingList.get(3));
		System.out.println(RankingList.get(4));
		System.out.println(RankingList.get(5));
		System.out.println(RankingList.get(6));
		System.out.println(RankingList.get(7));
		
		
	    //Update
		RankingList.put(2, "S.A");
		System.out.println(RankingList);
		
		//Remove
		RankingList.remove(5);
		System.out.println(RankingList);
		
		//size()
		System.out.println(RankingList.size());
		
		//keyset()
		System.out.println(RankingList.keySet());
		
		//for each loop
		
		for (Integer key:RankingList.keySet()) {
			System.out.println(key);
		}
		
		//values()
		System.out.println(RankingList.values());
		
		for (String values:RankingList.values()) {
			System.out.println(values);
		}
		//display both
		for (Integer key:RankingList.keySet()) {
			System.out.println(key +" " + RankingList.get(key));
		}
			
		
	}

}
