package ch17.q7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("김지희", "백수"),
				new Member("이재훈", "개발자"),
				new Member("곽덕철", "프로그래머"),
				new Member("개나리", "디자이너")
				);
		
		List<Member> developers = list.stream()
				.filter(member -> member.getJob().equals("개발자"))
				.collect(Collectors.toList());
				
		developers.stream()
			.forEach(member -> System.out.println(member.getName()));
	}
}
