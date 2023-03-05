package ch17.p730;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StramExample {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		for(int i =1; i<5;i++) {
			Product product = new Product(i, "상품"+i, "순양", (int)(10000*Math.random()));
			list.add(product);
		}
		
		Stream<Product> stream = list.stream();
		stream.forEach(product->System.out.println(product));

	}

}
