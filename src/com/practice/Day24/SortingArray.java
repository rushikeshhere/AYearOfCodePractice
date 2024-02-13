package com.practice.Day24;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int array[] = { 15, 23, 7, 12, 9, 98, 89, 78, 65, 45 };
		System.out.println("Before Sorting Array :: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After Sorting Array :: " + Arrays.toString(array));
	}
}
