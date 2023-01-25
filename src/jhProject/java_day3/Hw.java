package jhProject.java_day3;

public class Hw {

	public static void main(String[] args) {
		int money = 5000;
		PeopleCheck people = new PeopleCheck();
		String result = people.check(money);
		System.out.println(result);
	}

}
