package com.practice.Day104;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int src[] = { 10, 20, 30, 40, 5 };
		int src2[] = { 50, 60, 70, 80, 7 };
		int newArray[] = new int[src.length + src2.length];

		for (int i = 0; i < src.length; i++) {
			newArray[i] = src[i];
		}
		for (int i = 0, j = src.length; j < (src.length + src2.length); j++, i++) {
			newArray[j] = src2[i];
		}
		System.out.println("First Array  : " + Arrays.toString(src));
		System.out.println("Second Array : " + Arrays.toString(src2));
		System.out.println("Merged Array : " + Arrays.toString(newArray));
	}
}
