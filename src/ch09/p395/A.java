package ch09.p395;

public class A {
	public class B {}
	
	B b = new B(); // �ν��Ͻ� �ʵ尪
	
	A(){ //������
		B b = new B();
	}
	
	void method() { // �ν��Ͻ� �޼ҵ�
		B b = new B(); 
	}
	
	
	
	
}
