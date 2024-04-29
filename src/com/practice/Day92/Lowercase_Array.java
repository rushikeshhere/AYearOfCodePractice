package com.practice.Day92;

import java.util.Arrays;

public class Lowercase_Array {
	public static void main(String[] args) {
		String str[] = { "Java", "Python", "Ruby", "Scala" };
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].toLowerCase();
		}
		System.out.println("String array after converting" + " to lowercase: " + Arrays.toString(str));
	}
}
