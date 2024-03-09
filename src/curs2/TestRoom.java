package curs2;

public class TestRoom {

	public static void main(String[] args) {
		
		Room baie = new Room(4, 2);
		System.out.println("Perimetrul baie este: " + baie.calculPerimetru());
		System.out.println("Arie baie este: " + baie.calculArie());
		
		Room dormitor = new Room(8, 6);
		System.out.println("Perimetrul baie este: " + dormitor.calculPerimetru());
		System.out.println("Arie baie este: " + dormitor.calculArie());
		//homework - apelare metoda afiseazaCuloareDreptunhi intr-un obiect creat la curs
		System.out.println("Culoare baie este: " + dormitor.afiseazaCuloareDreptunghi());
		
		//homework - obiect
		Room birou = new Room(3, 4, "VERDE");
		System.out.println("Perimetrul baie este: " + birou.calculPerimetru());
		System.out.println("Arie baie este: " + birou.calculArie());
		System.out.println("Culoare birou este: " + birou.afiseazaCuloareDreptunghi());
				
		
	}	

}
