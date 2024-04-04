package curs03;

import java.util.Scanner;

public class CheckDay {
	
int day;
	
	public void askTheUserForAge() {
		
		System.out.println("Please enter a day: ");
		Scanner scan = new Scanner(System.in);
		day = scan.nextInt();
		
	}
	
	public void CheckWhatDayIsToday() {
		
		askTheUserForAge();
		if (day == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0");
		} else if (day == 1) {
			System.out.println("Astazi este luni");
		} else if (day == 2) {
			System.out.println("Astazi este marti");
		} else if (day == 3) {
			System.out.println("Astazi este miercuri");
		} else if (day == 4) {
			System.out.println("Astazi este joi");
		} else if (day == 5) {
			System.out.println("Astazi este vineri");
		} else if (day == 6) {
			System.out.println("Astazi este sambata");
		} else if (day == 7) {
			System.out.println("Astazi este duminica");
		} else {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
        }
		
	}

}
