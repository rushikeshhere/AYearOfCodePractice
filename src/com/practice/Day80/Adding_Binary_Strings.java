package com.practice.Day80;

public class Adding_Binary_Strings {
	public static void main(String[] args) {

		String s1 = "10";
		String s2 = "01";
		int i = Integer.parseInt(s1, 2);
		int j = Integer.parseInt(s2, 2);
		int sum = i + j;
		String binaryString = Integer.toBinaryString(sum);
		System.out.println(binaryString);

	}
}
