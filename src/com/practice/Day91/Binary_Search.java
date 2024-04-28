package com.practice.Day91;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {
		int arr[] = { 100, 20, 10, 30, 50 };
		System.out.println("Array : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after Sorting : " + Arrays.toString(arr));
		System.out.println("The Element 30 is on : " + Arrays.binarySearch(arr, 30) + " position");
	}
}
