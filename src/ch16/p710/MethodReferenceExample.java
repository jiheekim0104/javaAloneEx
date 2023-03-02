package ch16.p710;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.ordering(String::compareToIgnoreCase);

	}

}
