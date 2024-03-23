package com.practice.Day63;

public class SumOfArrayElement {
	public static int sum(int a[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int length = array.length ;
		System.out.println("The sum of Array Element is :: " + sum(array, length));
	}
}
