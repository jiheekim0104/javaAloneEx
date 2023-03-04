package ch16.q4;

public class Example {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("작업스레드가 실행됩니다.");
				System.out.println("작업스레드가 실행됩니다.");
				System.out.println("작업스레드가 실행됩니다.");

			}
		});

		
		
		Thread thread2 = new Thread(() -> {
				System.out.println("작업스레드가 실행됩니다.");
				System.out.println("작업스레드가 실행됩니다.");
				System.out.println("작업스레드가 실행됩니다.");

			});
		thread.start();

	}

}
