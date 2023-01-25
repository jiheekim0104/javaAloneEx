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
		return "질문있어요!";
	}
	
	String question() {
		return "이 문제는 왜 이렇게 풀어요?";
	}
}
