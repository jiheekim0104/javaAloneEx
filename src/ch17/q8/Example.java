package ch17.q8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("������", "���"),
				new Member("������", "������"),
				new Member("����ö", "������"),
				new Member("������", "�����̳�")
				);
		
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(
					Collectors.groupingBy(member-> member.getJob()));
		System.out.println("������");
		List<Member> developersList = groupingMap.get("������");
		developersList.stream().forEach(member -> System.out.println(member));
		System.out.println();
		
		System.out.println("�����̳�");
		List<Member> disingnerList = groupingMap.get("�����̳�");
		disingnerList.stream().forEach(member -> System.out.println(member));
		
	}
}
