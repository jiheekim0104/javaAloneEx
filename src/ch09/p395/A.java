package ch09.p395;

public class A {
	public class B {}
	
	B b = new B(); // 인스턴스 필드값
	
	A(){ //생성자
		B b = new B();
	}
	
	void method() { // 인스턴스 메소드
		B b = new B(); 
	}
	
	
	
	
}
