package curs4;

import java.util.Scanner;

public class TernaryOperatorScore {

	public static void main(String[] args) {
		
		int rezultat; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your test score:");
		rezultat = scan.nextInt();
		scan.close();	
		
/*		if (rezultat >= 90) {
			System.out.println("Ai primit: FoarteBine");
		} else if (rezultat >= 80){
			System.out.println("Ai primit: Bine");
		} else {
			System.out.println("Ai primit: Suficient");	
		}
*/		
		String result = (rezultat >= 90) ? "Ai primit: FoarteBine" : (rezultat >= 80) ? "Ai primit: Bine" : "Ai primit: Suficient" ;
		System.out.println(result);
	}

}
