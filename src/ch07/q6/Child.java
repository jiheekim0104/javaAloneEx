package ch07.q6;

public class Child extends Parent {
	
	public int studentNo;

	
	
	public Child(String name, int studentNo) { // name�� �θ��������� 
		super(name); //�θ� ������ ȣ��
		this.name = name;
		this.studentNo = studentNo;
	}
}
