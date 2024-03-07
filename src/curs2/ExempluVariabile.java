package curs2;

public class ExempluVariabile {
	//variabila de instanta
	int varsta;
	String prenume;
	
	public static void main(String[] args) {
		
		//declarare si intitializare //data type for text
		String nume = "Bob"; 
		//declarare variabila ()variabila age are valoarea default pentru data type int
		int age; //data type for numbers
		
		ExempluVariabile obiect = new ExempluVariabile();
		
		//sysout si ctrl + space rezulta ce e mai jos
		System.out.println(nume);
		System.out.println(obiect.varsta);
		System.out.println(obiect.prenume);
	}

}
