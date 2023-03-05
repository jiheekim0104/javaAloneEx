package ch17.q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("김지희", "백수"),
				new Member("이재훈", "개발자"),
				new Member("곽덕철", "개발자"),
				new Member("개나리", "디자이너")
				);
		
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(
					Collectors.groupingBy(member-> member.getJob()));
		System.out.println("개발자");
		List<Member> developersList = groupingMap.get("개발자");
		developersList.stream().forEach(member -> System.out.println(member));
		System.out.println();
		
		System.out.println("디자이너");
		List<Member> disingnerList = groupingMap.get("디자이너");
		disingnerList.stream().forEach(member -> System.out.println(member));
		
	}
}
