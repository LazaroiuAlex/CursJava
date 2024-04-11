package curs12;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("masina");
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
						 //012345678912 index 1 si 2 de la sfarsit sunt 10 si 11 // se pune 12 pentru ca 12 este exclusive -- primul index este inclusive
		deleteFromString("televizor", 4, 9);
		insertIntoString("salut", 5, " Marian");
		appendToString("Salut", " Marian");
		addSpacesToCamelCaseText("thisIsAnExample");
	}
	
	public static void reverseString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse(); //nu mai trebuie parsat prin for
		System.out.println(sb);
		
	}
	
	public static void replaceFromString(String text, int startIndex, int endIndex, String textToReplace) {
		
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.replace(startIndex, endIndex, textToReplace);
		System.out.println(sb);
		
	}
	
	public static void deleteFromString(String text, int startIndex, int endIndex) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);
		
	}
	
	public static void appendToString(String text, String textToAppend) {
		StringBuilder sb = new StringBuilder(text);
		System.out.println(sb);
		sb.append(textToAppend);
		System.out.println(sb);
		
	}
	
	public static void addSpacesToCamelCaseText(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		for (int i = 0; i<sb.length(); i++) {
			if(i!=0 && Character.isUpperCase(sb.charAt(i))) {
				sb.insert(i, " ");
				i++;
			}
				
		}
		
		System.out.println(sb);
	}

}
