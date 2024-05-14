package com.practice.Day104;

import java.util.Arrays;

public class MergingTwoStringArray {
	public static void main(String[] args) {
		String str1[] = { "Java", "Python", "CPP" };
		String str2[] = { "HTML", "CSS", "JS" };
		String newArray[] = new String[str1.length + str2.length];
		System.arraycopy(str1, 0, newArray, 0, str1.length);
		System.arraycopy(str2, 0, newArray, str1.length, str2.length);

		System.out.println("First Array : " + Arrays.toString(str1));
		System.out.println("Second Array : " + Arrays.toString(str2));
		System.out.println("Merged Array : " + Arrays.toString(newArray));

	}

}
