package curs05;

import java.util.Scanner;

public class SumOfNumberUsingFor {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int sumTotal = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Please enter number " + i);
			int nr = scan.nextInt();
			sumTotal = sumTotal + nr;
		}
		
		
		System.out.println("The sum of the numbers is: " + sumTotal);
	}

}
