package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadExample {
	public static void main(String[] args) {
		

		try {
			InputStream is1 = new FileInputStream("C:/Temp/test1.db");
			while (true) {
				int data = is1.read();
				if (data == -1)
					break;
				System.out.println(data);
			}
			is1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		

		try {
			InputStream is2 = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data2 = new byte[100];
			
			while (true) {
				int num = is2.read(data2);
				if (num == -1)
					break;
				for(int i =0;i<num;i++) {
					System.out.println(data2[i]);
				}
				
			}
			is2.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
