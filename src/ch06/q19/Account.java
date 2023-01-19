package ch06.q19;

public class Account {
	private int balance;
	int moneyin;
	static int MIN_BALANCE = 0; // 19번 -2
	static int MAX_BALANCE = 1000000;

	public int getBalance() { // 19번 -1
		if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			return balance;
		} else {
			return 0; // 오류로 처리할수는 없나?
		}
		
	}

	public void setBalance(int moneyin) { //19번 -3
		if (MIN_BALANCE <= moneyin && moneyin <= MAX_BALANCE) {
			this.balance += moneyin;
		} else {
			this.balance += 0;
		}
	}
}
