package ch15.q8;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "���缮"));
		set.add(new Student(2, "�̹���"));
		set.add(new Student(1, "���̰�"));
		
		System.out.println("����� ��ü ��:"+set.size());
		for(Student s : set) {
			System.out.println(s.studentNum+":"+s.name);
		}
	}

}
