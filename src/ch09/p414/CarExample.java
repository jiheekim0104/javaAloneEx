package ch09.p414;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1(); // �ʵ忡�� ����� �������̵��Ѱ�
		
		car.run2(); // �޼ҵ忡�� ����� �������̵��Ѱ�
		
		
		car.run3(new Tire() { //���⼭ �� �����ھƼ� ����� ������
			@Override
			public void roll() {
				System.out.println("�͸� �ڽ� Tire ��ü 3 ��������");
			}
		});
		
		

	}

}
