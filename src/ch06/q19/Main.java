package ch06.q19;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

		account.setBalance(30000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
		
		account.setBalance(960000);
		System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	}

} 