package ch11.q6;

public class Example {
	public static void main(String[] args) {

		String[] strArray = { "10", "2A" };
		int value = 0;

		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환 할수없음");
			} finally {
				System.out.println(value);
			}
		}
	}

}
// 10 (정상 실행되고 fianlly 실행)
// 숫자로 변환할수 없음 
// 10 (예외처리되었기때문에 앞에 value값 그대로임! 이후  fianlly 실행)
// 인덱스를 초과함
// 10 (마찬가지로 예외처리 되어서 value 값 그대로! 이후 fianlly 실행)