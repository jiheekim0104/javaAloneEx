package ch12.p517;

public class MesureRunTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("합: "+sum);
		System.out.println("시간소요: "+(time2-time1));
	}
}
