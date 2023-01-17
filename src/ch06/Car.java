package ch06;

public class Car {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gad�ܷ�:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gad�ܷ�:" + gas + ")");
				return;
			}
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);

		if (myCar.isLeftGas()) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
		System.out.println("gas�� �����ϼ���");

	}

} // CLASS END
