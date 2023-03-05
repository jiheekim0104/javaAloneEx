package ch17.p761;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("¿ÀÇØ¿µ", "¿©", 93));
		totalList.add(new Student("°ûÀ°Ã¶", "³²", 90));
		totalList.add(new Student("¹ÚºÀÃ¢", "³²", 53));
		totalList.add(new Student("ÀÌÁö¿¬", "¿©", 90));
		
		List<Student> maleList = totalList.stream()
				.filter(student -> student.getSex().equals("³²"))
				.collect(Collectors.toList());
				
		maleList.stream()		
			.forEach(student -> System.out.println(student.getName()));
		
		
		Map<String, Double> map = totalList.stream()
				.collect(
						Collectors.toMap(
								student-> student.getName(), 
								student-> student.getScore()
								)
						);
		System.out.println(map);
		
		
		Map<String, List<Student>> map2 = totalList.stream()
				.collect(
						Collectors.groupingBy(student -> student.getSex()));
		
		List<Student> femaleList = map2.get("¿©");
		femaleList.stream().forEach(student -> System.out.println(student.getName()));
		
		
		Map<String, Double> map3 = totalList.stream()
				.collect(
						Collectors.groupingBy(
								student -> student.getSex(),
								Collectors.averagingDouble(student-> student.getScore())
							)
						);
		System.out.println(map3);
	}
}
