package ch11.q7;

public class WrongPasswordException extends Exception {
	
	public WrongPasswordException(String message) {
		super("패스워스가 틀립니다.");
	}
}
