import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {
	//this class will hold all of our methods 
	
	
	
	public static void readFromFile(String nameOfFile) {
		Path writeFile = Paths.get(nameOfFile);
		File file = writeFile.toFile();
		
		try {
			FileReader fr = new FileReader(file);
			//This is a buffer and the benefit of using this is to store 
			//a block of memory that we can read data from later -- more efficient than scanner and it will not cause 
			BufferedReader reader = new BufferedReader(fr);
			//This is attempting to read the first line from the document
			String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();	
		} catch (IOException e) { //IO Exception is the parent exception and will automatically handle the FileNotFound Exception.
			e.printStackTrace();
		}
	}
	
	public static void writeToFile(String nameOfFile, String input) {
		//Person antonella = new Person("Antonella", 21);
		
		Path writeFile = Paths.get(nameOfFile);
		File file = writeFile.toFile();
		//outputting to the text file using print writer
		//True parameter and FileOutputStream constructor allows us to append to the end of the document
		//Otherwise, false will overwrite the entire document!
		//Now we're writing an object to the file (using antonella).  You can also take input from a scanner and then write that to the file.
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
			out.println(input);
			out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found here...");
			//e.printStackTrace();
		} 
	}
	
}
