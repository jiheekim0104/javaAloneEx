package ch03;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	int x = 1;
	int y = 1;
	int result1 = ++x + 10;
	int result2 = y+ 10;
	System.out.println(result1+","+result2);
	
	System.out.println("-----------------------");
	
	System.out.println(x++);
	System.out.println(++x); //??????????

	
	Scanner sc = new Scanner(System.in);
	int result=sc.nextInt();
	System.out.println(result % 3);
	
	int a = 1;
	long b = 100000000000000l;
	long z = a * b ;
	System.out.println(z);
	
	String gender= sc.next(); 
	if ( gender.equals("����") ) {System.out.println("������ �����Դϴ�.");}
	else if ( gender.equals("����") ) {System.out.println("������ �����Դϴ�.");};

	
	int score = 85;
	char grade = (score>90)? 'A':((score>80)?'B':'c');
	System.out.println(score + "����" + grade + "����Դϴ�");
	

	sc.close();
	}

}
