package ch17.p736;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("½ÅÂ¯±¸");
		list.add("½ÅÂ¯¾Æ");
		list.add("½ÅÂ¯¾Æ");
		list.add("±è¹Î¾Æ");
		list.add("±¸ÇĞÃ¶");

//		Stream<String> stream = list.stream();
//		Stream<String> fillteringStream = stream.filter(name->name.startsWith("½Å"));
//		Stream<String> stream2 = fillteringStream.distinct();
//		stream2.forEach(name->System.out.println(name));
		
		list.stream()
			.filter(name->name.startsWith("½Å"))
			.distinct()
			.forEach(name->System.out.println(name));
	
	}

}
