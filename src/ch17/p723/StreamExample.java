package ch17.p723;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("È«±æµ¿");
		set.add("½Å¿ë±Ç");
		set.add("±èÀÚ¹Ù");
		
		Stream<String> stream = set.stream();
		stream.forEach(name->System.out.println(name));

	}

}
