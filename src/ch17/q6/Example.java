package ch17.q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("±èÁöÈñ", 30),
				new Member("ÀÌÀçÈÆ", 34),
				new Member("±è¹Ì¿µ", 40)
				);
		
		double avg = list.stream()
				.mapToInt(member -> member.getAge())
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		
		
	}

}
