package ch09.p407;

public class A {
	String field = "A �ʵ�";
	
	void method() {
		System.out.println("A �޼ҵ�");
	}
	
	class B {
		String field = "B �ʵ�";
		
		void method() {
			System.out.println("B �޼ҵ�");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
		
	}
	void useB() {
		B b = new B();
		b.print();
	}
}
