package ch04;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// 3��
		
		int sum=0;
		for(int i=3;i<=100;i+=3){
			sum = sum+ i ;
		}
		System.out.println(sum);
	
		System.out.println("---------------");
		// 4��
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
		// 5��
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
		// 6��
		for(int a=1;a<=5;a++) {
			for(int b=1;a>=b;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");	
		//6�� - 1
		String asterisk;
		for(int a=1;a<=5;a++) {
			asterisk="";
			for(int b=1;a>=b;b++)
				asterisk+="*";
			System.out.println(asterisk);
		}
		
		System.out.println("---------------");
		//6�� - 2 (for���� �ѹ��� ����)		
		String asterisk2 = "";
		for(int a=1;a<=5;a++) {
			asterisk2+='*';
			System.out.println(asterisk2);
		}
		
		System.out.println("---------------");
		// 7�� 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("----------------------");
			System.out.println("����>");
			String text =sc.nextLine();
			if (text.equals("1")) {
				System.out.println("���ݾ�>");
				text =sc.nextLine();
			} else if  (text.equals("2")) {
				System.out.println("��ݾ�>");
				text =sc.nextLine();
			} else if  (text.equals("3")) {
				System.out.println("�ܰ�>");
				text =sc.nextLine();
			} else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		

		// 7�� - 1 (���� ���� �������)		
		int deposit = 0;
		String command = null;
		String input = null;
		String question = "����> ";
		System.out.println("----------------------");
		System.out.println("1.����|2.���|3.�ܰ�|4.����");
		System.out.println("----------------------");
		service:
		while(true) {
			System.out.print(question);
			input=sc.nextLine();
			if(command==null){
				switch(input) {
				case "4":
					System.out.println("�̿����ּż� �����մϴ�.");
					break service;
				case "3":
					System.out.println("�ܰ�> "+deposit);
					continue;
				case "2":
					question="��ݾ�> ";
					break;
				case "1":
					question="���ݾ�> ";
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println("----------------------");
					System.out.println("1.����|2.���|3.�ܰ�|4.����");
					System.out.println("----------------------");
					continue;
				}
				command=input;
			} else {
				deposit+=command.equals("1")?Integer.parseInt(input):-Integer.parseInt(input);
				command=null;
				question="����> ";
			}
		}
		sc.close();
	}
}
