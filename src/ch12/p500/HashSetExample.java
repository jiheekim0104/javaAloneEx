package ch12.p500;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"ȫ�浿");
		hashSet.add(s1);
		System.out.println("����� ��ü ��: "+hashSet.size());
		
		Student s2 = new Student(1,"ȫ�浿");
		hashSet.add(s2);
		System.out.println("����� ��ü ��: "+hashSet.size());
		
		Student s3 = new Student(2,"ȫ�浿");
		hashSet.add(s3);
		System.out.println("����� ��ü ��: "+hashSet.size());
	}
}
