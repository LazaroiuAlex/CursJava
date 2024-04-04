package curs06;

import java.util.Scanner;

/*
 * simulam o retragere de la un bancomat
 * avem un sold initial 1500
 * intreb userul cat vrea sa retraga si verific daca suma nu este mai mare decat soldul
 * daca suma este mai mare ii printez fonduri insuficiente si il rog sa incerce din nou
 * la final printez Retragere cu succes! si noul sold
 */

public class RetragereAtm {

	public static void main(String[] args) {
		
		int soldInitial = 1500;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu suma pe care vrei sa o retragi");
		int suma = scan.nextInt();
		
		while(suma > soldInitial || suma <= 0) {
			
			if(suma > soldInitial) {
				System.out.println("Fonduri inuficiente");
			}else {
				System.out.println("Suma invalida. Introdu o suma mai mare ca 0!");
			}
			
			System.out.println("Introdu suma pe care vreo sa o retragi");
			suma = scan.nextInt();
			
		}
		
		soldInitial = soldInitial - suma;
		System.out.println(" Retragere cu success! Noul sold este: " + soldInitial);

	}

}
