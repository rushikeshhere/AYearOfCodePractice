package com.practice.Day64;

import java.util.Arrays;

public class Lexicographically_Sort_Array2 {
	public static void main(String[] args) {
		String str[] = { "Zen", "John", "Harry", "Albert", "Nikhil", "Harman" };
		System.out.println("String array: \n" + Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("After sorting Lexicographically: \n" + Arrays.toString(str));

	}
}
