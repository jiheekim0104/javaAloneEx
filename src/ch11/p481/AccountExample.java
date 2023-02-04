package ch11.p481;

import javax.naming.InsufficientResourcesException;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("¿¹±Ý¾×: "+account.getBalance());

		try {
			account.withdraw(30000);
		} catch (InsufficientResourcesException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
