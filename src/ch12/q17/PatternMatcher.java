package ch12.q17;

import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		//String id = "5Angle1004"; //첫번째는 알파벳, 두번째부터 숫+알 (8-12)
		String id = "A1234567"; //첫번째는 알파벳, 두번째부터 숫+알 (8-12)
		String regExp = "[a-z,A-z]+[a-z,A-z,0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if(isMatch) {
			System.out.println("ID로 사용할수있습니다.");
		} else {
			System.out.println("ID로 사용할수없습니다.");
		}

	}

}
