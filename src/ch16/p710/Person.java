package ch16.p710;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		
		int result = comparable.compare(a, b);
		
		if(result<0) {
			System.out.println(a+"가 "+b+"보다 앞임");
		} else if (result==0) {
			System.out.println(a+"와 "+b+"같음");
		} else {
			System.out.println(a+"가 "+b+"보다 뒤임");
		}
		
	}
}
