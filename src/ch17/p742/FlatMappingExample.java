package ch17.p742;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {
		List<String> textList = new ArrayList<String>();
		textList.add("대탈출2 살인감옥 작업실");
		textList.add("시청자 참여는 안되나요?");
		textList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(word -> System.out.println(word));
		
		List<String> list = Arrays.asList("10,20,30","40,50");
		list.stream()
			.flatMapToInt(data -> {
				String[] numberArr = data.split(",");
				int[] numbers = new int[numberArr.length];
				for(int i=0;i<numbers.length;i++) {
					numbers[i] = Integer.parseInt(numberArr[i]);
				}
				return Arrays.stream(numbers);
			})
			.forEach(number -> System.out.println(number));
		
		
		List<String> numberList = new ArrayList<String>();
		numberList.add("10");
		numberList.add("20");
		numberList.add("30");
		numberList.stream()
			.forEach(number -> 
				System.out.println(number));
			
	}

}
