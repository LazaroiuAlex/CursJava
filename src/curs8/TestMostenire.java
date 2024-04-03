package curs8;

public class TestMostenire {

	public static void main(String[] args) {

		//Angajat --> Tester --> TesterAutomat
		// 2 var --->  2 var ---> 1 Var
		//cu mostenire
		// 2 var ----> 4 var --- > 5 var 
		
		
		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgramingLanguage("Java");//clasa TesterAutomat()
		tester.setSeniority("Senior");//Clasa Tester()
		tester.setDepartament("QA");//Clasa Tester()
		tester.setEmail("ion@ion.com");//clasa Angajat()
		tester.setNume("Ion");//clasa Angajat()
		tester.setAngajatId(124);//clasa Angajat()
		
		
		
		
	}

}
