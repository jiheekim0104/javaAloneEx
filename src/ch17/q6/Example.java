package ch17.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("������", 30),
				new Member("������", 34),
				new Member("��̿�", 40)
				);
		
		double avg = list.stream()
				.mapToInt(member -> member.getAge())
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		
		
	}

}
