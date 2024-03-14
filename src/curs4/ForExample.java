package curs4;

public class ForExample {

	public static void main(String[] args) {
		
		//initializare, conditie, iterator
		for(int i=0; i<10; i++) { //stai in bucla cat i este mai mic ca 10 -- i++ iterator
			System.out.println("Valoarea lui i este " +i);
		}
		System.out.println("--------------------------------------------");
		for(int i=0; i<10; i++) {
			if(i == 5) {
				//break;//intrerupe executia buclei
				continue; //skip cand i ajunge la acea valoare
			}
			System.out.println(i);
		}

	}

}
