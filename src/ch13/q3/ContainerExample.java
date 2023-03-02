package ch13.q3;


public class ContainerExample {

	public static void main(String[] args) {
		Container<String,String> container1 = new Container<String, String>();
		container1.setNameJob("È«±æµ¿", "µµÀû");
		String name1 = container1.getName();
		String job = container1.getJob();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.setNameAge("È«±æµ¿", 35);
		String name2 = container2.getName();
		Integer age = container2.getAge();

	}

}
