package curs06;

/*Facem un program care printeaza numere pare de la 0 la 20 inclusiv
 * 
 */

public class WhileVsFor {

	public static void main(String[] args) {
		
		rezolvareCuFor();
		rezolvareCuWhile();

	}
	
	public static void rezolvareCuFor() {
		System.out.println("For: ");
		for(int i = 2; i <=20; i=i+2) {
			System.out.println(i);
		}
		
	}
	// nu e recomandat sa scriem asa in acest caz fiindca avem mai multe conditii, de aceea este recomandat sa folosim for
	public static void rezolvareCuWhile() {
		System.out.println("While: ");
		int i = 2;
		while(i<=20) {
			System.out.println(i);
			i=i+2;
		}
		
	}
	

}
