package ch15;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
//		StringBuilder text = new StringBuilder();
//				text.append("��");
//				
//				
//				System.out.println(text);
//				text.append("��");
//				System.out.println(text);
				
//	String s = "())))";	
//		char[] array = new char[s.length()];
//		array[0] = s.charAt(0);
//		System.out.println(array[0]);
//		System.out.println(s.charAt(0));
//		
//		if(s.charAt(0)=='(') {
//			System.out.println("����.");
//		}
		
		int num = 6;
		int sum = 0;
		
		
		for(int i =1 ; i<=num/2;i++) {
			int a = 1; // ���밡�� 
			int b = 1; // 2
			int c = 1; // 1
			System.out.println("2�� ���� "+ i);
			int l = num-i;
			while(l>=1) {
				a = a*l;
				l--;
				System.out.println(a);
			}
			
			int n = i;
			while(n>=1) {
				b = b*n;
				n--;
				System.out.println(b);
			}
			
			int k = num - i*2 ;
			while(k>=1) {
				c = c*k;
				k--;
				System.out.println(c);
			}
			
			System.out.println(i+"�϶�" + (a/(b*c)));
			sum+= (a/(b*c));
		}
			System.out.println("�� ���� "+(sum+1));
		
			
			
			
		}
		
	}


