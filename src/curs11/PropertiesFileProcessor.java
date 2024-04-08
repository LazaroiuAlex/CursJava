package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	//write properties file
	public void writePropertiesFile() {
	//ca sa fie refolosibila metoda
	//pyblic void writePropertiesFile(String key, String value) {}
		
	/*	try(OutputStream outputStream = new FileOutputStream("test.properties");){
		
		}catch() {} */ //try with resources, in loc de cel de mai jos
		
		try {
			
			OutputStream outputStream = new FileOutputStream("test.properties");
			
			Properties propFile = new Properties(); //accesam methoda din clasa parinte
			propFile.setProperty("hostname", "123456"); // va scrie in fisier hostname=123456
			propFile.setProperty("port", "8080");
			propFile.setProperty("username", "Test");
			propFile.setProperty("password", "test123");
			propFile.store(outputStream, "Am salvat fisierul");
			
			//ca sa fie refolosibila
			//propFile.setProperties(key, value);
			
			outputStream.close();
			
		}catch(IOException err) {
			System.out.println("NU am putut salva");
			err.printStackTrace();
		}
		
	}
	
	// read properties file
	
	public void readPropertiesFile(String key) {
		try(InputStream inputStream = new FileInputStream("test.properties")){
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.get(key));
			
		}catch(IOException err) {
			System.out.println("NU am putut citi fisierul");
			err.printStackTrace();
		}
	}
	//update properties file
	public void updatePropertiesFile(String key, String value) {
		
		try(InputStream inputStream = new FileInputStream("test.properties")){
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			
		}catch(IOException err) {
			System.out.println("NU am putut citi fisierul");
			err.printStackTrace();
		}
		
		try(OutputStream outputStream = new FileOutputStream("test.properties")){
			
			Properties propFile = new Properties();
			propFile.setProperty(key, value);
			propFile.store(outputStream, value);
			
		}catch(IOException err) {
			System.out.println("NU am putut citi fisierul");
			err.printStackTrace();
		}
		
		
	}

}
