package ch17.q7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("������", "���"),
				new Member("������", "������"),
				new Member("����ö", "���α׷���"),
				new Member("������", "�����̳�")
				);
		
		List<Member> developers = list.stream()
				.filter(member -> member.getJob().equals("������"))
				.collect(Collectors.toList());
				
		developers.stream()
			.forEach(member -> System.out.println(member.getName()));
	}
}
