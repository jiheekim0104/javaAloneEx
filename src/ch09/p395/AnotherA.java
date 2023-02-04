package ch09.p395;

import ch09.p395.A.B;

public class AnotherA {

	public static void main(String[] args) {
		A a = new A();
		B b0 = a.new B();
		
		//  b = new B(); 이건 불가능
	}

}
