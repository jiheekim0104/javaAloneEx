package ch06.ex20;

import java.util.Scanner;

public class BankApplication {
	private static final int ACCOUNT_SIZE = 100;
	Account[] accounts;
	int issuedAccountIndex;
	Scanner sc;
	public BankApplication() {
		this.accounts = new Account[ACCOUNT_SIZE];
		this.issuedAccountIndex = 0;
	}
	void run() {
		sc = new Scanner(System.in);
		boolean isRunnable = true;
		while(isRunnable)
			isRunnable = getCommand();
		stop();
	}
	boolean getCommand() {
		System.out.println("--------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("--------------------------------------");
		System.out.print("����> ");
		String input = sc.nextLine();
		int menuNumber = Integer.parseInt(input);
		
		switch (menuNumber) {
		case 1:
			createAccount();
			break;
		case 2:	
			listAccount();
			break;
		case 3:
			deposit();
			break;
		case 4:
			widthrow();
			break;
		case 5:
			System.out.println("���α׷� ����");
			return false;
		default:
			System.out.println("�ٽ� �������ּ���.");
		}
		return true;
	}
	void createAccount() {
		if(issuedAccountIndex==accounts.length) {
			System.out.println("���� ���� ������ �ʰ��߽��ϴ�.");
			return;
		}
		System.out.println("------------------");
		System.out.println("���»���");
		System.out.println("------------------");
		System.out.print("���¹�ȣ:");
		String accountNumber = sc.nextLine();
		Account old = findAccount(accountNumber);
		if(old!=null) {
			System.out.println("���¹�ȣ �ߺ��Դϴ�.");
			return;
		}
		System.out.print("������:");
		String owner = sc.nextLine();
		System.out.print("�ʱ��Աݾ�:");
		String input = sc.nextLine();
		int initialDeposit = Integer.parseInt(input);
		accounts[issuedAccountIndex++] = new Account(accountNumber, owner, initialDeposit);
	}
	void listAccount() {
		System.out.println("------------------");
		System.out.println("���¸��");
		System.out.println("------------------");
		for(int i=0;i<issuedAccountIndex;++i)
			System.out.println(accounts[i]);
	}
	void deposit() {
		System.out.println("------------------");
		System.out.println("����");
		System.out.println("------------------");
		System.out.print("���¹�ȣ:");
		String accountNumber = sc.nextLine();
		Account account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("���� ���¹�ȣ�Դϴ�.");
			return;
		}
		System.out.print("���ݾ�:");
		String input = sc.nextLine();
		account.deposit(input);
	}
	void widthrow() {
		System.out.println("------------------");
		System.out.println("���");
		System.out.println("------------------");
		System.out.print("���¹�ȣ:");
		String accountNumber = sc.nextLine();
		Account account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("���� ���¹�ȣ�Դϴ�.");
			return;
		}
		System.out.print("��ݾ�:");
		String input = sc.nextLine();
		int withrow = Integer.parseInt(input);
		if(account.isPossibleWithrow(withrow)) {
			System.out.println("�ܾ׺���: �����û["+withrow+"], �ܾ�["+account.getDeposit()+"]");
			return;
		}
		account.withrow(withrow);
	}
	Account findAccount(String accountNumber) {
		for(int i=0;i<issuedAccountIndex;++i)
			if(accounts[i].equals(accountNumber))
				return accounts[i];
		return null;
	}
	
	void stop() {
		sc.close();
	}
}