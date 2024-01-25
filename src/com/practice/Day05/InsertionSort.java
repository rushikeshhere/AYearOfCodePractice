package com.practice.Day05;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] data = { 45, 12, 5, 89, 32, 1, 56, 78 };

		System.out.println(Arrays.toString(data));
		insertionSort(data);
		System.out.println(Arrays.toString(data));
	}

	static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			// For descending order, change key<arr[j] to key>arr[j].
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
	}
}
