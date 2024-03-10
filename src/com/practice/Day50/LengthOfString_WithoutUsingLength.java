package com.practice.Day50;

public class LengthOfString_WithoutUsingLength {
	public static void main(String[] args) {
		String str = "JavaLanguage";

		char ch[] = str.toCharArray();
		System.out.println("String is :: " + str);
		System.out.println("length Of String is :: " + ch.length);
		int count = 0;
		for (char c : ch) {
			count++;
		}
		System.out.println("Length of String is :: " + count);
	}
}
