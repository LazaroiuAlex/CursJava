package curs5;

import java.util.Scanner;

/*
 * program care calculeaza impozitul global
 * intrebam userul cate venituri are
 * pentru fiecare venit in parte calculam impozit
 * daca venitul este <= 50000 atunci impozit este 0.1 daca >= 50000 este 0.15
 * la final printam impozitul total
 */

public class CalculImpozitVenit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate surse de venit ai?");
		int numarVenituri = scan.nextInt();
		double impozitTotal = 0;
		
		for(int i=1; i <= numarVenituri; i++) { // daca i = 0 cere 4 venituri
			System.out.println("Introdu venitul nr " + i);
			double venit = scan.nextDouble();
			double impozit;
			if(venit <= 50000) {
				impozit = venit*0.1;
			}else {
				impozit = venit*0.15;
			}
			
			impozitTotal = impozitTotal + impozit;
			// explicatie si ex
			// 0 = 0 + 100 --> iteratia 1
			// 100 = 100 + 50 -- iteratia 2
			//operator compus -> impozitTotal += impozit;
		}
		
		System.out.println("Impozitul total este: " + impozitTotal);
	}

}
