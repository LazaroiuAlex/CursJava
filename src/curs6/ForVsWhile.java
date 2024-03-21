package curs6;

import java.util.Scanner;

/*
 * program care cere userului numere incontinuu
 * numerele respective le inmulteste cu 10 si printeaza rezultatul
 * daca userul introduce 0 facem exit din program
 */

public class ForVsWhile {

	public static void main(String[] args) {

		//rezolvareCuFor();
		//rezolvareCuWhile();
		rezolvareCuDoWhile();

	}
	
	public static void rezolvareCuFor() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numar: ");
		int numar = scan.nextInt();
		int result;
		
		for(;numar != 0;) {
			result = numar * 10;
			System.out.println("Result: " + result);
			System.out.println("Introdu numar: ");
			numar = scan.nextInt();
		}
		
	}		
	
		public static void rezolvareCuWhile() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu numar: ");
			int numar = scan.nextInt();
			int result;
			
			while(numar != 0) {
				result = numar * 10;
				System.out.println("Result: " + result);
				System.out.println("Introdu numar: ");
				numar = scan.nextInt();
		
	}
	
	
	}
		// not recommended in this case
		public static void rezolvareCuDoWhile() {
			
			Scanner scan = new Scanner(System.in);
			int result;
			int numar = 0;
			
			do {

				System.out.println("Introdu numar: ");
				numar = scan.nextInt();
				if(numar == 0){
					break;
				}else {
				result = numar * 10;
				System.out.println("Result: " + result);
				}
			}while(numar != 0);
		}

}
