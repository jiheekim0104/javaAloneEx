package ch17.q5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book", 
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		List<String> splitList = list.stream()
				.flatMap(data -> Arrays.stream(data.split(",")))
				.collect(Collectors.toList());

		splitList.stream()
			.filter(str -> str.toLowerCase().contains("java")) // �ҹ��� or �빮�ڷ� �ٲ㼭 ��ҹ��� ������ ������
			.forEach(str -> System.out.println(str));

	}

}
