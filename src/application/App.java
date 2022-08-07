package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		String fileLocation = "test2.txt";
		
		try(var br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("orange\n");
			br.write("apple\n");
			br.write("banana");
			br.newLine();
			br.write("pear");
		}
		catch(IOException e) {
			System.out.println("Cannot write file: " + fileLocation);
		}
		
		System.out.println("File write completed: " + fileLocation);

	}

}
