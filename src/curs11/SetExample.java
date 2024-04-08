package curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add("Alb");
		set.add("Mov");
		set.add("Rosu");
		set.add("Negru");
		set.add("Galben");
		set.add("Roz");
		
		for(String culoare : set) {
			System.out.println(culoare);
		}
		
		System.out.println(set);
		System.out.println(set.size());
		set.add("Rosu");
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains("Verde"));
		System.out.println(set.contains("Mov"));
		
		set.add("rosu"); //este case sensitive
		System.out.println(set);
		
		System.out.println("--------------------------------");
		
		set.remove("rosu");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	}

}
