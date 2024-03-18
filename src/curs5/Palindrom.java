package curs5;

public class Palindrom {

	public static void main(String[] args) {
		
		//palindrom ==> radar - citit din ambele sensuri este acelasi cuvant
		
		String cuvant = "radar";
		
		String cuvantIntors = "";
		//cuvantIntors = cuvant.charAt(4) = r --> prima iteratie
		//cuvantIntors = cuvantIntors + cuvant.charAt(4)
		//cuvantIntors = r + cuvant.charAt(3) = a --> doua iteratie
		
		for(int i = cuvant.length()-1; i>=0; i--){
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			
		}
		
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Cuvantul este palindrom");
		} else {
			System.out.println("Cuvantul nu este palindrom");
		}
	}

}
