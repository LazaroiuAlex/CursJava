package curs2;

//nu este clasa de executie, de aceea nu are public static void main

public class Room {
	//variabile
	private int lungime;
	private int latime;
	private String culoare = "ALB"; //homework - variabila
	
	//metode
	public int calculArie() {
		
		//int arie = lungime * latime;
		//return arie; //mereu ultima linie din interiorul unei metode
		return lungime * latime;

	}
	
	public int calculPerimetru() {
		
		//int perimetru = 2 * (lungime + latime);
		//System.out.println(perimetru);
		return 2 * (lungime + latime);
	}
	
	//constructor
	public Room(int lungime, int latime) {
		this.lungime = lungime; //this.lungime e variabila de la 7
		this.latime = latime;
	}
	
	//homework - metoda
	public String afiseazaCuloareDreptunghi() {
		
		return culoare;
		
	}
	
	//homework - constructor
	public Room(int lungime, int latime, String culoare) {
		this.lungime = lungime;
		this.latime = latime;
		this.culoare = culoare;
		
	}
	


}
