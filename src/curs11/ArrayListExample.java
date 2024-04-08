package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//se mai poate scrie si sub forma
		//ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list);
		
		System.out.println("---------------------------------");
		
		System.out.println("get element: " + list.get(0));
		
		for(String nume : list) {
			
			System.out.println(nume);
			
		}
		
		System.out.println("----------------------------------");
		
		list.add("Ioana");
		
		System.out.println(list);
		
		list.add(2, "Carmen");
		
		System.out.println(list);
		
		/*
		list.add(7, "Bogdan");
		
		System.out.println(list);
		
		results in: 
		
		Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 7, Size: 6
	at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:838)
	at java.base/java.util.ArrayList.add(ArrayList.java:510)
	at curs11.ArrayListExample.main(ArrayListExample.java:47)
		
		*/
		
		System.out.println("----------------------------------");
		
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("----------------------------------");
		
		list.add("Maria");
		System.out.println(list);
		
		list.remove("Maria");
		System.out.println(list);
		
		System.out.println(list.subList(0, 3));
		
		System.out.println("----------------------------------");
		
		System.out.println(list.contains("Alina"));
		System.out.println(list.contains("Maria"));
		System.out.println(list.indexOf("Ioana"));
		
		System.out.println("----------------------------------");
		
		list.set(3, "Bogdan");
		System.out.println(list);
		
	}

}
