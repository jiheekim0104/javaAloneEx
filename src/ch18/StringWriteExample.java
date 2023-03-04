package ch18;

import java.io.FileWriter;
import java.io.Writer;

public class StringWriteExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/StringWriteTest.txt");
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] array = {'C','D','E'};
			writer.write(array);
			writer.write("FGH");
			
			writer.flush();
			
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
