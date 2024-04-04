package curs09;

//overload

public class OverloadExample {

	public static void main(String[] args) {

		System.out.println(multiply(2, 3));
		System.out.println(multiply(2, 5.5));
		
		System.out.println(123); //integer
		System.out.println("123"); //string
		System.out.println('x'); //character
		System.out.println(true); //boolean
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static double multiply(double a, double b) {
		return a*b;

}
	
}
