package ch09.p397;

public class A {
	
	class B {
		
		int field1 = 1;
		
		//static int field2 =2; �ڹ� 17���� ����
		
		B(){
			System.out.println("B ������ �ӿ� ����");
		}
		
		void method1() {
			System.out.println("B �޼ҵ� ����");
		}
		
		/* �ڹ� 17���� ����
		static void method2() {
			System.out.println("B �޼ҵ� ����");
		}
		*/
		
	}
	
	void useB() {
			B b = new B();
			System.out.println("A�� �żҵ�ȿ��� B��ü ����");
			b.method1();
			
	}
	
		
		
	
}
