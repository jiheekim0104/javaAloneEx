package ch11.q7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		System.out.println("�н����尡 Ʋ���ϴ�.");
	}
}
