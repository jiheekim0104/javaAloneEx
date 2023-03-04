package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String originamlFileName = "C:/Temp/test.png";
		String targetFileName = "C:/Temp/test3.png";
		
		InputStream is = new FileInputStream(originamlFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
//		byte[] data = new byte[1024];
//		while(true) {
//			int num = is.read(data);
//			if(num==-1) break;
//			os.write(data,0,num);
//		}
		
		is.transferTo(os); //java 9부터 추가
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘되었습니다.");
	}
}
