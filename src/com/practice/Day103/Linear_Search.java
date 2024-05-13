package com.practice.Day103;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
	public static int linearSearch(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 3, 4, 5, 7, 6 };
		System.out.print("Array :: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter a Number to Find the Element");
		int x = sc.nextInt();
		int length = arr.length;
		int index = linearSearch(arr, length, x);
		if (index == -1) {
			System.out.println("Element is not Present in this Array");
		} else
			System.out.println("Element fount at :: " + index);
		sc.close();
	}
}
