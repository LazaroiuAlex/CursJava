package curs03;

import java.util.Scanner;

public class CheckAge {
	
	int varsta;
	
	public void askTheUserForAge() {
		
		System.out.println("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		
	}

public void checkAge() {
		
		askTheUserForAge();
		
		if(varsta < 18) {
			System.out.println("Esti minor");
		} else if (varsta >= 18 && varsta <= 65) {
			System.out.println("Esti adult");
		} else if (varsta > 65) {
			System.out.println("Esti batran");
		}
		
		
	}
	
}
