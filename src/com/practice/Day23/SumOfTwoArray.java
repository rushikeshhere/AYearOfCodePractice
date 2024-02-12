package com.practice.Day23;

import java.util.Arrays;

public class SumOfTwoArray {
	public static void main(String[] args) {

		int array1[] = { 10, 15, 16, 18, 56, 85 };
		int array2[] = { 9, 7, 4, 2, 4, 5 };
		int array3[] = new int[array1.length];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
		}
		System.out.println("Sum of Two Arrays is :: "+Arrays.toString(array3));
		// Sum of Two Arrays is :: [19, 22, 20, 20, 60, 90]
	}
}
