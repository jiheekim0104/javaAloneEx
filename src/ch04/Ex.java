package ch04;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// 3번
		
		int sum=0;
		for(int i=3;i<=100;i+=3){
			sum = sum+ i ;
		}
		System.out.println(sum);
	
		System.out.println("---------------");
		// 4번
		int number1;
		int number2;
		while (true) {
			number1 = (int)(Math.random()*6)+1;
			number2 = (int)(Math.random()*6)+1;
			System.out.println("("+ number1 +","+ number2 +")");
			if(number1+number2==5)
				break;
		}
		
		System.out.println("---------------");
		// 5번
		int y;
		for(int x=1;x<=10;x++) {
			for(y=1;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.println("("+ x +","+ y +")");
					break;
				}
			}
		}
		System.out.println("---------------");
		// 6번
		for(int a=1;a<=5;a++) {
			for(int b=1;a>=b;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");	
		//6번 - 1
		String asterisk;
		for(int a=1;a<=5;a++) {
			asterisk="";
			for(int b=1;a>=b;b++)
				asterisk+="*";
			System.out.println(asterisk);
		}
		
		System.out.println("---------------");
		//6번 - 2 (for문을 한번만 쓰기)		
		String asterisk2 = "";
		for(int a=1;a<=5;a++) {
			asterisk2+='*';
			System.out.println(asterisk2);
		}
		
		System.out.println("---------------");
		// 7번 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.println("선택>");
			String text =sc.nextLine();
			if (text.equals("1")) {
				System.out.println("예금액>");
				text =sc.nextLine();
			} else if  (text.equals("2")) {
				System.out.println("출금액>");
				text =sc.nextLine();
			} else if  (text.equals("3")) {
				System.out.println("잔고>");
				text =sc.nextLine();
			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		

		// 7번 - 1 (많이 많이 응용버전)		
		int deposit = 0;
		String command = null;
		String input = null;
		String question = "선택> ";
		System.out.println("----------------------");
		System.out.println("1.예금|2.출금|3.잔고|4.종료");
		System.out.println("----------------------");
		service:
		while(true) {
			System.out.print(question);
			input=sc.nextLine();
			if(command==null){
				switch(input) {
				case "4":
					System.out.println("이용해주셔서 감사합니다.");
					break service;
				case "3":
					System.out.println("잔고> "+deposit);
					continue;
				case "2":
					question="출금액> ";
					break;
				case "1":
					question="예금액> ";
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("----------------------");
					System.out.println("1.예금|2.출금|3.잔고|4.종료");
					System.out.println("----------------------");
					continue;
				}
				command=input;
			} else {
				deposit+=command.equals("1")?Integer.parseInt(input):-Integer.parseInt(input);
				command=null;
				question="선택> ";
			}
		}
		sc.close();
	}
}
