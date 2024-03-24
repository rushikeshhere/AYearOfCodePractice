package com.practice.Day64;

import java.util.Arrays;

public class Lexicographically_Sort_Array {
	public static void main(String[] args) {
		String str[] = { "Zen", "John", "Harry", "Albert", "Nikhil", "Harman" };
		System.out.println("String array: \n" + Arrays.toString(str));

		Arrays.sort(str);
		System.out.println("After sorting Lexicographically: \n" + Arrays.toString(str));
	}
}
