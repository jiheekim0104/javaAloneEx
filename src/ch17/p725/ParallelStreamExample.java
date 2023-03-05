package ch17.p725;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("������");
		list.add("������");
		list.add("�ϼ���");
		list.add("�念��");
		list.add("�����");
		list.add("������");
		
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name+": "+Thread.currentThread().getName() );
		});
	}

}
