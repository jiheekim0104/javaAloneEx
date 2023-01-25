package ch07.q7;

public class Child extends Parent {
	
	public String name;
	
	public Child() { 
		this("홍길동"); //(6)
		System.out.println("Child() call"); //(9) 출력
	}
	
	public Child(String name) { 
		this.name = name; //(7)
		System.out.println("Child(String name) call"+name); //(8) 출력
	}
}
