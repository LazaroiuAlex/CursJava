package curs03;

import java.util.Scanner;

public class CheckTestScore {
	
int punctaj;
	
	public void askTheUserForTestScore() {
		
		System.out.println("Please enter a test score: ");
		Scanner scan = new Scanner(System.in);
		punctaj = scan.nextInt();
		
	}
	
    public void checkTestScore() {
		
		askTheUserForTestScore();
		
		if(punctaj >= 0 && punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca");
		} else if (punctaj >= 66) {
			System.out.println("Felicitari, ai trecut");
		} else {
			System.out.println("Punctaj invalid");
		}
		
		
	}

}
