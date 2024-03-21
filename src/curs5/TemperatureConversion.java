package curs5;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many temperatures do you want to convert?");
		int numberOfTemp = scan.nextInt();
		double fahrenheit = 0;
		
		for(int i=1; i <= numberOfTemp; i++) { 
			System.out.println("What is the temperature that you want to convert ");
			double temp = scan.nextDouble();
			
			System.out.println("Celsius temperature " + temp + "is in Fahrenheit " + (fahrenheit = (temp*1.8) + 32));
			System.out.println("-------------");
			

		}
		
		
	}

}
