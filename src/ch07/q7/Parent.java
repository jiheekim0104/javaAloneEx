package ch07.q7;

public class Parent {
	public String nation;
	
	public Parent() { 
		this("���ѹα�"); //(2)
		System.out.println("Parent() call"); //(5) ���
	}

	public Parent(String nation) { 
		this.nation=nation; //(3)
		System.out.println("Parent(String nation) call"+nation); //(4) ���
	}
}
