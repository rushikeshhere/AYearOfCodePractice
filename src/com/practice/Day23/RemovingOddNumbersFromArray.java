package com.practice.Day23;

import java.util.Arrays;

public class RemovingOddNumbersFromArray {
	public static void main(String[] args) {
		int array[] = { 15, 21, 32, 23, 56, 55, 78, 77 };
		int evenCount = 0;
		System.out.println("Original Array :: " + Arrays.toString(array));
		int even[] = null;
		for (int i : array) {
			if (i % 2 == 0)
				++evenCount;
		}
		even = new int[evenCount];
		int i = 0;
		for (int num : array) {
			if (num % 2 == 0) {
				even[i++] = num;
			}
		}
		System.out.println("Array after removing odd numbers: " + Arrays.toString(even));
	}

}
