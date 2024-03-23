package com.practice.Day63;

public class Converting_Array_to_Lowercase {
	public static void main(String[] args) {
		String str[] = { "Java", "C++", "Python", "Ruby" };

		for (String string : str) {
			String result = string.toLowerCase();
			System.out.print(result+" ");
		}
	}
}
