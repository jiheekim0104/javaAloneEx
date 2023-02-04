package ch09.p414;

public class Car {
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() { // 필드에서 익명객체 생성과 동시에 오버라이딩
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체 1 굴러가유");

		}
	};

	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	public void run2() { // 메소드에서 익명객체 생성하고 오버라이딩
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2 굴러가유");
			}

		};
		tire.roll();
	}

	public void run3(Tire tire) { // 매개변수 이용
		tire.roll();
	}
}
