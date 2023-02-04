package ch09.p414;

public class Car {
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() { // �ʵ忡�� �͸�ü ������ ���ÿ� �������̵�
		@Override
		public void roll() {
			System.out.println("�͸� �ڽ� Tire ��ü 1 ��������");

		}
	};

	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	public void run2() { // �޼ҵ忡�� �͸�ü �����ϰ� �������̵�
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� Tire ��ü 2 ��������");
			}

		};
		tire.roll();
	}

	public void run3(Tire tire) { // �Ű����� �̿�
		tire.roll();
	}
}
