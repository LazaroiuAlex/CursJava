package curs03;

import java.util.Scanner;

/*
 * program care citeste un numar de la tastatura
 * si verifica daca este o zi lucratoare sau weekend
 * ex: citeste 1 --> its a working day
 * citeste 7 --> its weekend
 * citeste 9 --> invalid day
 */

public class CheckWorkingDay {
	
	int zi;
	
	public void askTheUserForADay() {
		
		System.out.println("Please enter a day: ");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		
	}
	
	public void checkDay() {
		
		askTheUserForADay();
		
		if(zi >= 1 && zi <= 5) {
			//&& --> AND
			//|| --> OR
			System.out.println("It's a working day");
		} else if(zi == 6 || zi ==7) {
			System.out.println("It's weekend");
		} else {
			System.out.println("invalid number for day");
		}
		
		
	}
}
