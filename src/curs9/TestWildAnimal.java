package curs9;

/*
 * method override = suprascrierea metodei
 * implica o relatie de mostenire pentru ca suprascrierea se face in clasa copil (subclasa) si presupune scrierea identica a metodei din clasa parinte (super clasa) dar cu o alta implementare
 * este best practice ca metoda scuprascrisa sa aibe adnotarea @Override
 */

public class TestWildAnimal {

	public static void main(String[] args) {
		
		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa --> implica clasa parinte si clasa copil (copil suprascrie clasa parinte)
		simba.whereDoesItLive();
		simba.eatMeat();
		
		System.out.println("-----------------------------------------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();//method override
		bambi.whereDoesItLive();
		bambi.eatGrass();

	}

}
