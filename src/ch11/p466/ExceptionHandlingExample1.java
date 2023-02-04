package ch11.p466;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		
		try {
			int result = data.length();
			System.out.println("글자수"+result);	
		} catch (NullPointerException e) {
			// 1번방법 : 에러의 원인을 간단하게 출력 
			//System.out.println(e.getMessage());
			
			// 2번방법 : 에러의 Exception 내용과 원인을 출력
			//System.out.println(e.toString());
			
			// 3번방법 : 에러의 발생 근원지를 찾아 단계별로 에러 출력
			e.printStackTrace();
		} finally {
			System.out.println("마무리 실행");
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("이것이자바다");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
