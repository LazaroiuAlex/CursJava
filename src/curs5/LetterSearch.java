package curs5;

import java.util.Scanner;

/*
 * facem un program care citeste un text de la tastatura si cauta in text litera A
 * Daca o gasim printam: litera A exista in text
 * Daca nu o gasim printam litera A nu exista in text
 */

public class LetterSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = scan.next();
		
		//radar -> java citeste o lista de 5 caractere
		//01234
		//daca caracter de pe poz 0 este egal cu 'a' daca nu, trec la urmatorul caracter si verific daca este egal cu a
		// text == radar radar.lenght()
		
		boolean existaA = false; //poate fi scos si lasat doaar counter 
		int counter = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') {
		//		System.out.println("Litera A exista in text");
				existaA = true;
				counter++;
		//		break; -> scos pentru a numara cati de a avem in text
		//	}else {
		//		System.out.println("Litera A nu exista");
			}
			//System.out.println(text.charAt(i));
		}
		
		if(existaA) {
			System.out.println("Litera A exista in text de " + counter + " ori"); //+counter adaugat pentru a numara cati a sunt in text //if poate fi modificat sa fie counter > 0 pentru a elimina boolean
		} else {
			System.out.println("Litera A nu exista");
		}
	}

}
