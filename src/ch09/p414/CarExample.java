package ch09.p414;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1(); // 필드에서 만들고 오버라이딩한거
		
		car.run2(); // 메소드에서 만들고 오버라이딩한거
		
		
		car.run3(new Tire() { //여기서 다 때려박아서 사용함 ㅇㅅㅇ
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3 굴러가유");
			}
		});
		
		

	}

}
