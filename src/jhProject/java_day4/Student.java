package jhProject.java_day4;

public class Student {
	int age;
	String name;
	String id;
	boolean gender;
	String phone;
	
	Student(int age,String name,String id,boolean gender,String phone){
		this.age=age;
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.phone=phone;
	}
	
	String help() {
		return "�����־��!";
	}
	
	String question() {
		return "�� ������ �� �̷��� Ǯ���?";
	}
}
