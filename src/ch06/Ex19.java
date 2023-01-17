package ch06;

public class Ex19 {

	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("���� �ܰ�: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("���� �ܰ�: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("���� �ܰ�: " + account.getBalance());

		account.setBalance(30000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(960000);
		System.out.println("���� �ܰ�: " + account.getBalance());
	}

} // class end

class Account {
	private int balance;
	int moneyin;
	static int MIN_BALANCE = 0; // 19�� -2
	static int MAX_BALANCE = 1000000;

	public int getBalance() { // 19�� -1
		if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			return balance;
		} else {
			return 0; // ������ ó���Ҽ��� ����?
		}
		
	}

	public void setBalance(int moneyin) { //19�� -3
		if (MIN_BALANCE <= moneyin && moneyin <= MAX_BALANCE) {
			this.balance += moneyin;
		} else {
			this.balance += 0;
		}
	}

}
