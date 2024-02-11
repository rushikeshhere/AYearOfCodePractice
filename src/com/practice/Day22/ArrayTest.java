package com.practice.Day22;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int array[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int evenCount = 0;
		int oddCount = 0;
		int even[] = null;
		int odd[] = null;

		for (int i : array) {
			if (i % 2 == 0)
				++evenCount;
			else
				++oddCount;
		}
		even = new int[evenCount];
		odd = new int[oddCount];
		int i = 0;
		int j = 0;
		for (int num : array) {
			if (num % 2 == 0) { // even
				even[i++] = num;
			} else {
				odd[j++] = num;
			}
		}
		System.out.println("Even Elements of Array:: " + Arrays.toString(even));
		System.out.println("Odd Elements of Array:: " + Arrays.toString(odd));
	}
}
