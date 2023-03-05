package ch17.p745;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("����ö", 70));
		list.add(new Student("������", 50));
		list.add(new Student("���弭", 60));
		
		list.stream()
			.sorted()
			.forEach(element -> System.out.println(element.getName()+": "+element.getScore()));
		System.out.println();
		
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(element -> System.out.println(element.getName()+": "+element.getScore()));
	}

}
