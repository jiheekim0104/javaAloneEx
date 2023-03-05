package ch17.p733;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception { // txt 파일 만들어서 직접 쓰고싶었다 흑흑
		List<Product> list = new ArrayList<Product>();
		for(int i =1; i<5;i++) {
			Product product = new Product(i, "상품"+i, "순양", (int)(10000*Math.random()));
			list.add(product);
		}
		
		File file = new File("C:\\Users\\곰쥐\\eclipse-workspace\\super_gomg0\\src\\ch17\\p730/test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		Writer writer = new OutputStreamWriter(fos);
		
		for(Product product : list) {
			writer.write(product.toString());
			writer.flush();
		}
		writer.close();
		
		Path path = Paths.get(StreamExample.class.getResource("test.txt").toURI());
		Stream<String> stream = Files.lines(path,Charset.defaultCharset());
		stream.forEach(line->System.out.println(line));
		stream.close();
	}
	



	
}
