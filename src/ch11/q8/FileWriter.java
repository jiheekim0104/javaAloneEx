package ch11.q8;

import java.io.IOException;

public class FileWriter implements AutoCloseable {
	public FileWriter(String filePath) throws IOException{
		System.out.println(filePath + "������ ���ϴ�.");
	}
	
	public void write(String data) throws IOException{
		System.out.println(data + "�� ���Ͽ� �����մϴ�.");
	}
	
	@Override
	public void close() throws IOException{
		System.out.println("������ �ݽ��ϴ�.");
	}
	
	//�����̳� ����
	static class Response{
		String name;
		int code;
		String reason;
		String location = "ch06.Main.java:123Line";
		String getName() {
			return null;
			
		}
	}
	
	
}
