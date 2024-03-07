package curs2;

public class TestRoom {

	public static void main(String[] args) {
		
		Room baie = new Room(4, 2);
		System.out.println("Perimetrul baie este: " + baie.calculPerimetru());
		System.out.println("Arie baie este: " + baie.calculArie());
		
		Room dormitor = new Room(8, 6);
		System.out.println("Perimetrul baie este: " + dormitor.calculPerimetru());
		System.out.println("Arie baie este: " + dormitor.calculArie());
	}

}
