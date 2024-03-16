package curs4;

import java.util.Scanner;

public class DiscountFactura {

	public static void main(String[] args) {
		
		int valoare; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value of you invoice:");
		valoare = scan.nextInt();
		scan.close();

		String result = valoare > 100 ? "Discount is 10%" : "Discount is 5%";
		System.out.println(result);
	}

}
