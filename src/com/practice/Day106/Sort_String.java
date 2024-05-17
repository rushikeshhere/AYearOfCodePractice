package com.practice.Day106;

import java.util.Arrays;

public class Sort_String {
	public static void main(String[] args) {
		String str = "rushikesh";
		System.out.println("Before Sort String is : " + str);
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String sorted = new String(charArray);
		System.out.println("After sort String is : " + sorted);
	}

}
