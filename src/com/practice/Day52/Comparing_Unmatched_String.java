package com.practice.Day52;

public class Comparing_Unmatched_String {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "Hello";
		int result = str1.compareTo(str2);
		if (result == 0)
			System.out.println("True.." + result);
		else
			System.out.println("False.. and the difference between Two ASCII is :: " + result);
	}
}
