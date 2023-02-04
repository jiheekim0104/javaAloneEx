package ch09.p397;

public class A {
	
	class B {
		
		int field1 = 1;
		
		//static int field2 =2; 자바 17부터 가능
		
		B(){
			System.out.println("B 생성자 속에 실행");
		}
		
		void method1() {
			System.out.println("B 메소드 실행");
		}
		
		/* 자바 17부터 가능
		static void method2() {
			System.out.println("B 메소드 실행");
		}
		*/
		
	}
	
	void useB() {
			B b = new B();
			System.out.println("A의 매소드안에서 B객체 생성");
			b.method1();
			
	}
	
		
		
	
}
