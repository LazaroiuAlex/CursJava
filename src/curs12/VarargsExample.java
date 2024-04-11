package curs12;

public class VarargsExample {

	public static void main(String[] args) {

		printCeva("Alb", "Galben");
		printCeva("unu", "doi", "trei", "patru");
		printCeva("1","2","3");
		printAltceva(123,"Bob"); //zero argumente variabile
		printAltceva(123, "Bob", 300); //1 argument variabil
		printAltceva(123, "Bob", 1, 2, 3); //
		//JavascriptExecutor.executeScript(jsScript, element)
		//JavascriptExecutor.executeScript(jsScript, element, element2)
		
	}
	/*
	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
*/
	public static void printCeva(String...values) {
		
		for(String element : values) {
			System.out.println(element);
		}
		
	}
	
/*	public static void printAltceva(String...values, int...numbers) { //nu este posibil, accepta doar un argument de varargs
		
	} */
	
	public static void printAltceva(int number, String nume, int...numbers) {} //putem avea un argument vararg si alte argumente
}
