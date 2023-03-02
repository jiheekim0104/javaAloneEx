package ch11.q7;

public class NotExistIDException extends Exception {
	
	public NotExistIDException(String message) {
		super("아이디가 존재하지 않습니다.");
	}
}
