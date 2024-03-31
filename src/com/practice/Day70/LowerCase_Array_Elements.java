package com.practice.Day70;

import java.util.Arrays;

public class LowerCase_Array_Elements {
	public static void main(String[] args) {
		String str[] = { "JAVA", "PYTHON", "SCALA", "RUBY" };
		for (int i = 0; i < str.length; i++) {
			str[i] = str[i].toLowerCase();
		}
		System.out.println(Arrays.toString(str));
	}
}
