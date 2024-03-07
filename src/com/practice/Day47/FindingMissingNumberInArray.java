package com.practice.Day47;

public class FindingMissingNumberInArray {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int sum1 = 0;
		for (int i = 0; i < array.length; i++) {
			sum1 = sum1 + array[i];
		}
		System.out.println("Sum of Array Element is  :: " + sum1);
		int sum2 = 0;
		for (int j = 1; j <= array.length + 1; j++) {
			sum2 = sum2 + j;
		}
		System.out.println("Sum of Array Element is  :: " + sum2);
		System.out.println("Missing Number of  Array Element is  :: " + (sum2 - sum1));
	}
}
