package ch09.p406;

public class A {
	
	//A�� �ν��Ͻ� �ʵ�� �޼ҵ�
	int field1;
	void method1() {}
	
	//A�� ���� �ʵ�� �޼ҵ�
	static int field2;
	static void method2() {}
	
	//�ν��Ͻ� ��� Ŭ���� 
	class B{
		void method() {
			//A�� �ν��Ͻ� �ʵ�� �޼ҵ� ��� 
			field1 = 10;
			method1();
			
			//A�� �ν��Ͻ� �ʵ�� �޼ҵ� ���
			field2 = 10;
			method2();
			
		}

	}
	
	static class c {
		void method() {
			//���⼱ static�� ��밡���ϴ���!
			field2 = 100;
			method2();
		}
		
		
	}
	
	
}
