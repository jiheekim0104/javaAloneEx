package ch14.q8;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		}
			
			
		
	}
}
