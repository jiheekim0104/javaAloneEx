package ch17.p723;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("ȫ�浿");
		set.add("�ſ��");
		set.add("���ڹ�");
		
		Stream<String> stream = set.stream();
		stream.forEach(name->System.out.println(name));

	}

}
