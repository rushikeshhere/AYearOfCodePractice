package com.practice.Day52;

public class Comparing_Strings_Using_compareToIgnoreCase {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "Hello";
		int result = str1.compareToIgnoreCase(str2);
		if (result == 0)
			System.out.println("True..");
		else
			System.out.println("false..");
	}
}
