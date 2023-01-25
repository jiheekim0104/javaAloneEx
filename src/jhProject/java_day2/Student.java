package jhProject.java_day2;

public class Student {
	String name;
	int age;
	String number;
	String major;
	boolean gender;

	Student(String name) {
		this.name = name;
	}

	Student(String name, String number) {
		this.name = name;
		this.number=number;
	}

	void say() {
		System.out.println("나는 " + name + "입니다.");
	}

}