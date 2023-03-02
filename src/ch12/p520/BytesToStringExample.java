package ch12.p520;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		String data = "ÀÚ¹Ù";
		
		byte[] arr1 = data.getBytes();
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println(arr1[0]);
		
		
	}

}
