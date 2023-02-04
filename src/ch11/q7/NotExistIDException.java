package ch11.q7;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		System.out.println(message+"아이디가 존재하지 않습니다.");
	}
}
