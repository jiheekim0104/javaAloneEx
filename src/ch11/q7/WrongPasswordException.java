package ch11.q7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		System.out.println("패스워드가 틀립니다.");
	}
}
