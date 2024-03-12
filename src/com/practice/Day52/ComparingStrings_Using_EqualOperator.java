package com.practice.Day52;

public class ComparingStrings_Using_EqualOperator {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);
		if (str1 == str2)
			System.out.println("Equal..");
		else
			System.out.println("Not Equal..");
	}
}
