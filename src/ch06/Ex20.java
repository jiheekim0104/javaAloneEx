package ch06;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Account[] accountarr = new Account[100]; 
		BankApplication ba = new BankApplication();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("--------------------------------------");
		System.out.print("����>");
		String input = sc.nextLine();
		int menu = Integer.parseInt(input);
		int index=0 ;
		
		switch (menu) {
		case 1:
			System.out.println("------------------");
			System.out.println("���»���");
			System.out.println("------------------");
			System.out.print("���¹�ȣ:");
			accountarr[index].setAccountId(sc.nextLine());
			System.out.print("������:");
			accountarr[index].setAccountUser(sc.nextLine());
			System.out.print("�ʱ��Աݾ�:");
			accountarr[index].setfirstin(Integer.parseInt(sc.nextLine()));
			index++;
			
		case 2:	
			System.out.println("------------------");
			System.out.println("���¸��");
			System.out.println("------------------");
			for(int i=0;i<accountarr.length;i++) {
				if(!(accountarr[i].getAccountId()).equals("null")) {
					System.out.println(accountarr[i].getAccountId()+" "+accountarr[i].getAccountUser()+" "+accountarr[i].getfirstin());
				}
			}
		case 3:
			System.out.println("------------------");
			System.out.println("����");
			System.out.println("------------------");
			System.out.print("���¹�ȣ:");
			input = sc.nextLine();
			System.out.print("���ݾ�:");
			input = sc.nextLine();
			ba.setMoneyin(Integer.parseInt(input));
			
			
			
			
		}

	}

} //class end

class Account {
	String accountId;
	String accountUser;
	int firstin;
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountUser() {
		return accountUser;
	}
	public void setAccountUser(String accountUser) {
		this.accountUser = accountUser;
	}
	public int getfirstin() {
		return firstin;
	}
	public void setfirstin(int firstin) {
		this.firstin = firstin;
	}
	
}

class BankApplication {
	int balance;
	int moneyin;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoneyin() {
		return moneyin;
	}
	public void setMoneyin(int moneyin) {
		this.moneyin = moneyin;
	}
	public int getMoneyout() {
		return moneyout;
	}
	public void setMoneyout(int moneyout) {
		this.moneyout = moneyout;
	}
	int moneyout;
	
}
