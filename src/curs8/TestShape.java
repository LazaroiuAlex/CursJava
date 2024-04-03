package curs8;

public class TestShape {

	public static void main(String[] args) {

		Square patrat = new Square("Galben", "patrat");
		
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume);
		
		patrat.printDetails();
		patrat.printNameLenght();
		
		System.out.println("------------------------------");
		
		Square altPatrat =  new Square();
		altPatrat.culoare = "Rosu";
		System.out.println(altPatrat.culoare);
		System.out.println(altPatrat.nume);
		
		altPatrat.printDetails();
		altPatrat.printNameLenght();
		
	}

	//WebDriver driver = new ChromeDriver();
	
}
