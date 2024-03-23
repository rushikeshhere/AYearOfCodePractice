package com.practice.Day63;

public class Converting_Array_to_Uppercase {
	public static void main(String[] args) {
		String str[] = { "java", "c++", "python", "ruby" };
		for (String result : str) {
			String op = result.toUpperCase();
			System.out.print(op + " ");
		}
	}
}
