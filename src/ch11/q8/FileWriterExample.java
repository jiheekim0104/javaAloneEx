package ch11.q8;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try (FileWriter fileWriter = new FileWriter("file.text")){
			fileWriter.write("java");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
