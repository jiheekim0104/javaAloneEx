package ch12.p504;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		
		System.out.println(smartPhone); // 매개값이 객체인경우에는 toString() 메소드가 호출된다! 여기서는 오버라이딩해놔서 글자가떠요~~

	}

}
