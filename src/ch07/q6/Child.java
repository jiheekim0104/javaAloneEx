package ch07.q6;

public class Child extends Parent {
	
	public int studentNo;

	
	
	public Child(String name, int studentNo) { // name은 부모한테있음 
		super(name); //부모 생성자 호출
		this.name = name;
		this.studentNo = studentNo;
	}
}
