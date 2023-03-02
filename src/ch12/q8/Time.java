package ch12.q8;


public class Time {
	public static void main(String[] args) {
		
		
		long startTime = System.currentTimeMillis();
		
		int[] scores = new int[1000];
		for(int i=0;i<scores.length;i++) {
			scores[i]=i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(endTime - startTime +"나노초가 소요되었습니다.");
	}
}
