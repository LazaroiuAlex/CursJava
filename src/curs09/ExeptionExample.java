package curs09;

public class ExeptionExample {
	
	public static void main(String[] args) {
		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		try {
			System.out.println(week[7]);
		} catch (ArrayIndexOutOfBoundsException err) {
			System.out.println("Am prins o eroare: " + err.getMessage());
			System.out.println("Stack trace: ");
			err.printStackTrace();
		};
		//index           0    1    2     3    4    5    6
		System.out.println(week[0]);
		
		System.out.println("--------------------------------------");
		for(String day : week) {
			System.out.println(day);
		}
		
	}

}
