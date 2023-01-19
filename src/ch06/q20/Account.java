package ch06.q20;

public class Account {
	private String accountNumber;
	private String owner;
	private  int deposit;
	
	public Account(String accountNumber, String owner, int deposit) {
		this.accountNumber=accountNumber;
		this.owner=owner;
		this.deposit=deposit;
	}
	@Override
	public boolean equals(Object object) {
		if(object==null)
			return false;
		if(object instanceof Account) {
			Account account = (Account)object;
			return this.accountNumber.equals(account.accountNumber);
		}
		if(object instanceof String) {
			String accountNumber = (String)object;
			return this.accountNumber.equals(accountNumber);
		}
		return false;
	}
	@Override
	public String toString() {
		return this.accountNumber+"\t"+this.owner+"\t"+this.deposit;
	}
	public void deposit(String input) {
		int deposit = Integer.parseInt(input);
		deposit(deposit);
		
	}
	public void deposit(int deposit) {
		changeDeposit(deposit);
	}
	public void withrow(int withrow) {
		changeDeposit(-withrow);
	}
	private void changeDeposit(int change) {
		this.deposit+=change;
	}
	public boolean isPossibleWithrow(int deposit2) {
		// TODO Auto-generated method stub
		return false;
	}
	public int getDeposit() {
		return deposit;
	}
}