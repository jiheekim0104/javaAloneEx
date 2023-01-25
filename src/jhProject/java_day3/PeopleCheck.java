package jhProject.java_day3;

public class PeopleCheck {
	int money;
	
	
	
	String check (int money) {
		if (money>=100000) {
			return "부자";
		} else if (money<10000) {
			return "거지";
		} else return "서민";
	}
}
