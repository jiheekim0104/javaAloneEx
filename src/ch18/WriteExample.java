package ch18;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");

			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a);
			os.write(b);
			os.write(c);

			os.flush(); 
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		try {
			OutputStream os2 = new FileOutputStream("C:/Temp/test2.db");
			byte[] array = { 10, 20, 30 };

			os2.write(array);
			os2.flush();
			os2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		
		try {
			OutputStream os3 = new FileOutputStream("C:/Temp/test3.db");
			byte[] array = { 10, 20, 30, 40, 50 };

			os3.write(array, 1, 3);
			os3.flush();
			os3.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
