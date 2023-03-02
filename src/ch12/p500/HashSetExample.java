package ch12.p500;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"全辨悼");
		hashSet.add(s1);
		System.out.println("历厘等 按眉 荐: "+hashSet.size());
		
		Student s2 = new Student(1,"全辨悼");
		hashSet.add(s2);
		System.out.println("历厘等 按眉 荐: "+hashSet.size());
		
		Student s3 = new Student(2,"全辨悼");
		hashSet.add(s3);
		System.out.println("历厘等 按眉 荐: "+hashSet.size());
	}
}
