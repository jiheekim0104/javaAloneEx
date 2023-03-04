package ch18.q7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {

	public static void main(String[] args) throws Exception {
		String filePath = "C:\\Users\\∞ı¡„\\eclipse-workspace\\super_gomg0\\src\\ch11\\p466/ExceptionHandlingExample1.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber=1;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData==null) {
				break;
			}
			System.out.println(rowNumber +":\t"+rowData);
			rowNumber++;
		}
		
		br.close();
		fr.close();
		

	}

}
