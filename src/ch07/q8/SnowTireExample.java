package ch07.q8;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // 스노우 타이어가 굴러갑니다. 오버라이딩 실행
		tire.run(); // 스노우 타이어가 굴러갑니다. (snowTire.run();과 동일)

	}

}

	 