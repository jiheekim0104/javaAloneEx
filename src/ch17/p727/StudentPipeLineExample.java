package ch17.p727;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentPipeLineExample {

	public static void main(String[] args) {
//		List<Student> list = new ArrayList<Student>();
//		list.add(new Student("±èÁöÈñ", 10));
		List<Student> list = Arrays.asList(
			new Student("±èÁöÈñ",10),
			new Student("ÀÌÀç¿ë",100),
			new Student("¾ç´öÃ¶",70)
		);
		
//		Stream<Student> studentStream = list.stream();
//		IntStream scoreStream = studentStream.mapToInt(student->student.getScore());
//		double avg = scoreStream.average().getAsDouble();

		
		double avg = list.stream()
				.mapToInt(student->student.getScore())
				.average().getAsDouble();
		System.out.println(avg);		

	}

}
