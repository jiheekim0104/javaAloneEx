package ch14;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ;i<5;i++) {
					toolkit.beep();
				}
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println(thread.getName());
		thread.setName("내가 필요한이름으로 바꿀거라고!");
		System.out.println(thread.getName());
		
	}

}
