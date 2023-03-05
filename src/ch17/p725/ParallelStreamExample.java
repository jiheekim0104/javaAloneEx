package ch17.p725;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("김지희");
		list.add("김지석");
		list.add("하석진");
		list.add("장영실");
		list.add("이장원");
		list.add("유병재");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name+": "+Thread.currentThread().getName() );
		});
	}

}
