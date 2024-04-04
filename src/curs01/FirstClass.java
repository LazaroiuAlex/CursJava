package curs01;

// este pentru comentariu pe o singura linie

/*
 * comentariu pe mai multe linii 
 */

// clasele le denumim folosind conventia UpperCamelCase
// metodele si variabilele le denumim folosind lowerCamelCase

public class FirstClass {

	public static void main(String[] args) {

		System.out.println("Test");
		
		FirstClass obiect = new FirstClass();
		obiect.greetings();
		
	}
	
	public void greetings() {
		System.out.println("Salut");
	}
	

}
