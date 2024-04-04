package curs04;

import java.util.Scanner;

/*
 * Facem un program care simuleaza un basic calculator
 * Avem operatiile de baza: +(adunare) -(scadere) *(inmultire) aditional folosim si x /(impartire) aditional folosim si :
 * intrebam userul numarul1, operatorul matematic, numarul2 si printam ex. 2 + 2 =  4
 */

public class SimpleCalculator {
	
	int nr1;
	int nr2;
	int result;
	char operator;
	int counter;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		nr1 = scan.nextInt();
		System.out.println("Enter a math operator:");
		operator = scan.next().charAt(0);
		System.out.println("Enter second number:");
		nr2 = scan.nextInt();
		scan.close();
	}
	
	public void calculator () {
		
		askTheUser();
		if(operator == '+') {
			result = nr1 + nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + "=" + result); --> nerecomandat fiind cod duplicat
			//counter++; --> folosit pentru evidenta daca s-a facut un calcul matematic sau nu. 
			printResult(); //best option create method and call it here
		}else if(operator == '-') {
			result = nr1 + nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + "=" + result);
			//counter++;
			printResult();
		}else if (operator == '*' || operator =='x') {
			result = nr1 * nr2;
			//System.out.println(nr1 + " " + operator + " " + nr2 + "=" + result);
			//counter++;
			printResult();
		}else if (operator == '/' || operator ==':') {
			result = nr1 / nr2;
			printResult();
			//System.out.println(nr1 + " " + operator + " " + nr2 + "=" + result);
			//counter++;
		}else {
			System.out.println("Unknown operator");
		}
		
		//if(counter != 0) {
		//	System.out.println(nr1 + " " + operator + " " + nr2 + "=" + result);
		}
	
		public void printResult() {
			System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
		}
	

}
