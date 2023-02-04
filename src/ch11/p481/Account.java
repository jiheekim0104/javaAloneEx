package ch11.p481;

import javax.naming.InsufficientResourcesException;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw (int money) throws InsufficientResourcesException {
		if(balance<money) {
			throw new InsufficientResourcesException("�ܰ� ����: "+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}
