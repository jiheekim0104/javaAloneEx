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
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------");
		System.out.print("선택> ");
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
			System.out.println("프로그램 종료");
			return false;
		default:
			System.out.println("다시 선택해주세요.");
		}
		return true;
	}
	void createAccount() {
		if(issuedAccountIndex==accounts.length) {
			System.out.println("계좌 개설 수량을 초과했습니다.");
			return;
		}
		System.out.println("------------------");
		System.out.println("계좌생성");
		System.out.println("------------------");
		System.out.print("계좌번호:");
		String accountNumber = sc.nextLine();
		Account old = findAccount(accountNumber);
		if(old!=null) {
			System.out.println("계좌번호 중복입니다.");
			return;
		}
		System.out.print("계좌주:");
		String owner = sc.nextLine();
		System.out.print("초기입금액:");
		String input = sc.nextLine();
		int initialDeposit = Integer.parseInt(input);
		accounts[issuedAccountIndex++] = new Account(accountNumber, owner, initialDeposit);
	}
	void listAccount() {
		System.out.println("------------------");
		System.out.println("계좌목록");
		System.out.println("------------------");
		for(int i=0;i<issuedAccountIndex;++i)
			System.out.println(accounts[i]);
	}
	void deposit() {
		System.out.println("------------------");
		System.out.println("예금");
		System.out.println("------------------");
		System.out.print("계좌번호:");
		String accountNumber = sc.nextLine();
		Account account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		System.out.print("예금액:");
		String input = sc.nextLine();
		account.deposit(input);
	}
	void widthrow() {
		System.out.println("------------------");
		System.out.println("출금");
		System.out.println("------------------");
		System.out.print("계좌번호:");
		String accountNumber = sc.nextLine();
		Account account = findAccount(accountNumber);
		if(account==null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		System.out.print("출금액:");
		String input = sc.nextLine();
		int withrow = Integer.parseInt(input);
		if(account.isPossibleWithrow(withrow)) {
			System.out.println("잔액부족: 인출요청["+withrow+"], 잔액["+account.getDeposit()+"]");
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