package jhProject.java_day3;

public class PeopleCheck {
	int money;
	
	
	
	String check (int money) {
		if (money>=100000) {
			return "����";
		} else if (money<10000) {
			return "����";
		} else return "����";
	}
}
