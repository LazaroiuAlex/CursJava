package curs4;

import java.util.Scanner;

/*
 * Program care cireste 2 numere si verifica:
 * verifica daca fiecare numar este pozitiv si printeaza
 * verifica ambele numere daca sunt pozitive
 * verifica care numar este mai mic sau mai mare sau daca sunt egale
 */

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int nr1; 
		int nr2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		nr1 = scan.nextInt();
		System.out.println("Enter second number:");
		nr2 = scan.nextInt();
		
		//verificam daca nr1 este pozitiv
		if(nr1 > 0) {
			System.out.println("Nr1 este pozitiv");
		} else {
			System.out.println("Nr1 este negativ");
		}
		
		//variabila = conditie ? expresie true : espresie false
		String result = nr1 > 0 ? "Nr1 este pozitiv" : "Nr1 este negativ";
			System.out.println(result);
		result = nr2 > 0 ? "Nr2 este pozitiv" : "Nr2 este negativ"; //pus fara String pentru ca am refolosit variabila result
		System.out.println(result);
		
		//verificam daca ambele nume sunt pozitive
		result = (nr1>0) && (nr2>0) ? "Ambele nr sunt pozitive" : "Un nr este negativ";
		System.out.println(result);
		
		//verificam care este mai mare sau daca sunt egale
		if(nr1 == nr2) {
			System.out.println("Sunt egale");
		}else if(nr1>nr2) {
			System.out.println("Nr 1 este mai mare");	
		}else {
			System.out.println("Nr 2 este mai mare");
		}
		
		result = (nr1==nr2) ? "Sunt egale": (nr1>nr2) ? "Nr 1 este mai mare" : "Nr 2 este mai mare"
			
	}

}
