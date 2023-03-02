package ch12.q10;

import java.util.StringTokenizer;

public class SBuilder {

	public static void main(String[] args) {
//		String str = "";
//		for(int i=1;i<100;i++) {
//			str += i;
//		}
		
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=1;i<=100;i++) {
				stringBuilder.append("i");
		}
		
		System.out.println(stringBuilder);
		
		
		String data = "아이디,이름,패스워드";
		StringTokenizer datas = new StringTokenizer(data,",");
		while(datas.hasMoreTokens()) {
			System.out.println(datas.nextToken());
		}
		
		String[] strArray = data.split(",");
		for(String str : strArray) {
			System.out.println(str);
		}
		
		
		
	}

}
