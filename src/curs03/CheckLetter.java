package curs03;

import java.util.Scanner;

/*
 * Program care verifica daca un caracter introdus este litera sau nu
 * Daca este litera printam: Character is a letter
 * Daca nu este litera primta: Character is not a letter
 * */


public class CheckLetter {
	
	// masina -> String -> lista de caractere
	// 012345 -> masina.CharAt(3) == i
	
	char caracter;
	
 public void askTheUserForACharacter() {
		
		System.out.println("Please enter a character: ");
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(0);
		
	}

 public void checkIfCharacterIsLetter() {
	 
	 askTheUserForACharacter();
	 
	 if(Character.isLetter(caracter)) {
		 
		 System.out.println("Char is a letter!");
		 
	 } else {
		 
		 System.out.println("Char is not a letter!");
	 
		 
	 }
	 
 }
 
}
