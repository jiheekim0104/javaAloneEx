package ch14.q8;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.setDaemon(true); //���󽺷���� ������� 
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		thread.interrupt();
		
	}

}
