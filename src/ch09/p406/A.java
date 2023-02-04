package ch09.p406;

public class A {
	
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스 
	class B{
		void method() {
			//A의 인스턴스 필드와 메소드 사용 
			field1 = 10;
			method1();
			
			//A의 인스턴스 필드와 메소드 사용
			field2 = 10;
			method2();
			
		}

	}
	
	static class c {
		void method() {
			//여기선 static만 사용가능하더라!
			field2 = 100;
			method2();
		}
		
		
	}
	
	
}
