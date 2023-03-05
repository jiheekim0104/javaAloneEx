package ch17.p736;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("��¯��");
		list.add("��¯��");
		list.add("��¯��");
		list.add("��ξ�");
		list.add("����ö");

//		Stream<String> stream = list.stream();
//		Stream<String> fillteringStream = stream.filter(name->name.startsWith("��"));
//		Stream<String> stream2 = fillteringStream.distinct();
//		stream2.forEach(name->System.out.println(name));
		
		list.stream()
			.filter(name->name.startsWith("��"))
			.distinct()
			.forEach(name->System.out.println(name));
	
	}

}
