package curs10;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		/*
		 * user = test
		 * {
		 * clientId = 123;
		 * }
		 * 
		 */
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PO", "Product Owner");
		
		System.out.println("-----------------------------------");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println("-----------------------------------");
		
		System.out.println(map);
		
		System.out.println(map.get("PO"));
		
		System.out.println("-----------------------------------");
		
		map.put("D", "Director"); //suprascrie cheia D din developer in director
		
		System.out.println(map);
		
		map.replace("D", "Developer");
		
		System.out.println(map);
		
		System.out.println("-----------------------------------");
		
		for(String key : map.keySet()) {
			System.out.print(key + " | ");
		}
		
		System.out.println(map.values());
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		
		System.out.println("-----------------------------------");
		
		boolean checkKey = map.containsKey("T");
		System.out.println(checkKey);
		
		System.out.println("-----------------------------------");
		
		boolean checkValue = map.containsValue("SRE");
		System.out.println(checkValue);
	
		
		System.out.println("-----------------------------------");
		
		map.remove("M"); //odata stearsa cheia se sterge si valoarea
		System.out.println(map);
		
		map.clear(); //sterge intregul maps
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());

	}

}
