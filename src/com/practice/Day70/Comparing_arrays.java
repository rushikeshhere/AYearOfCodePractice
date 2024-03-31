package com.practice.Day70;

import java.util.Arrays;

public class Comparing_arrays {
	public static void main(String[] args) {
		String str[] = { "JAVA", "PYTHON", "SCALA", "RUBY" };
		String[] str1 = { "java", "python", "scala", "ruby" };
		Arrays.equals(str, str1);
		System.out.println(Arrays.equals(str, str1));
	}
}
