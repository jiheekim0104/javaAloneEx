package ch16.p698;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(()->{
			System.out.println("����ؿ�");
			System.out.println("���α׷����ؿ�");
		});
		
		person.action(()->System.out.println("����ؿ�"));

	}

}
