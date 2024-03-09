package com.practice.Day49;

import java.util.Arrays;

public class Sorting_Program {
	public static void main(String[] args) {
		int arr[] = { 15, 78, 56, 45, 23, 65, 84 };
		System.out.println("Before sorting original Array is :: " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("After sorting Array is :: " + Arrays.toString(arr));
	}
}
