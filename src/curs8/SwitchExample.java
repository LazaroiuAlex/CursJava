package curs8;

import java.util.Scanner;

/*
 * Intrebam userul un calificativ
 * in functie de raspuns printam urmatoarele:
 * A --> Felicitari!
 * B --> Destul de bine!
 * C --> Suficient!
 * D --> Insuficient!
 * Pentru orice alt calificativ, printam : calificativ invalid!
 * 
 */
public class SwitchExample {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Introdu un calificativ:");
		String calificativ =  scan.next().toUpperCase();
		
		//if-elfe
		if(calificativ.equals("A") || calificativ.equals("a")) {
			System.out.println("Felicitari!");
		}else if(calificativ.equalsIgnoreCase("B")) {
			System.out.println("Destul de bine!");
		}else if(calificativ.equals("C")) {
			System.out.println("Suficient!");
		}else if(calificativ.equals("D")) {
			System.out.println("Insuficient!");
		}else {
			System.out.println("Calificativ invalid");
		}
		
		System.out.println("----------------------------------------");
		
		//switch
		switch(calificativ) {
			case "A" :
				System.out.println("Felicitari!");
				break;
			case "B" :
				System.out.println("Destul de bine!");
				break;
			case "C" :
				System.out.println("Suficient!");
				break;
			case "D" :
				System.out.println("Inuficient!");
				break;
			default:
				System.out.println("Calificativ invalid");
		}
		
		System.out.println("----------------------------------------");

		//enhanced switch
		switch(calificativ) {
			case "A" -> System.out.println("Felicitari!");
			case "B" -> System.out.println("Destul de bine!");
			case "C" -> System.out.println("Suficient!");
			case "D" -> System.out.println("Inuficient!");
			default -> System.out.println("Calificativ invalid");
		
		}
		
		
		
	}

}
