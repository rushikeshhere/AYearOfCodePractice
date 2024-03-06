package com.practice.Day46;

public class SumOfElementsOfArray {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 6, 7, 8 };
		int sum = 0;
		for (int i = 0; i <= array.length - 1; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of The Array Element is  :: " + sum);
	}
}
