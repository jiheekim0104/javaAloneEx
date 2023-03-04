package ch18.q10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		
		File file1 = new File("C:/Temp/dir1/photo1.png");
		File dir = new File("C:/Temp/dir2");
		
		
		if(file1.exists()==false) {
			 System.out.println("원본 파일이 존재하지 않습니다.");
			 System.exit(0);
		}
		
		if(dir.exists()==false) {
			dir.mkdir();
		}
		
		
		String originalImageName = "C:/Temp/dir1/photo1.png";
		String copyImageName = "C:/Temp/dir2/photo2.png";
		
		InputStream is = new FileInputStream(originalImageName);
		OutputStream os = new FileOutputStream(copyImageName);
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		
		bis.transferTo(bos);
	
		
		
		bos.flush();
		bos.close();
		bis.close();
		os.close();
		is.close();
		System.out.println("원본 파일 경로:"+ originalImageName);
		System.out.println("복사 파일 경로:"+ copyImageName);
		System.out.println("복사가 성공되었습니다.");

	}

}
