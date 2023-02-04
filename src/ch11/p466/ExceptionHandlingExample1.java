package ch11.p466;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("���ڼ�"+result);	
		} catch (NullPointerException e) {
			// 1����� : ������ ������ �����ϰ� ��� 
			//System.out.println(e.getMessage());
			
			// 2����� : ������ Exception ����� ������ ���
			//System.out.println(e.toString());
			
			// 3����� : ������ �߻� �ٿ����� ã�� �ܰ躰�� ���� ���
			e.printStackTrace();
		} finally {
			System.out.println("������ ����");
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		printLength("�̰����ڹٴ�");
		printLength(null);
		System.out.println("���α׷� ����");
	}

}
