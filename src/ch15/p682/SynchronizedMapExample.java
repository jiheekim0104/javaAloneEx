package ch15.p682;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
	public static void main(String[] args) {
		
		//final Map<Integer, String> map = Collections.synchronizedMap(new HashMap<Integer, String>()); 
		final Map<Integer, String> map = new HashMap<Integer, String>();
		
		Thread threadA = new Thread() {
			@Override 
			public void run() {
				for(int i=1;i<=1000000;i++) {
					map.put(i, "³»¿ë"+i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override 
			public void run() {
				for(int i=1000001;i<=2000000;i++) {
					map.put(i, "³»¿ë"+i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int size = map.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö:" + size);
		System.out.println();
		
		
	}
}
