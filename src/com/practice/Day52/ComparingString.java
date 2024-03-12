package com.practice.Day52;

public class ComparingString {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		int result = str1.compareTo(str2);
		if (result == 0)
			System.out.println("True..");
		else
			System.out.println("false..");
	}
}
