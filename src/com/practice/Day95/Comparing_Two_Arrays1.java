package com.practice.Day95;

import java.util.Arrays;

public class Comparing_Two_Arrays1 {
	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 45, 56 };
		int arr2[] = { 10, 20, 30, 45, 56 };
		int arr3[] = { 10, 20, 40, 6, 0, 8 };

		if (Arrays.equals(arr1, arr2))
			System.out.println("arr1, arr2 Both are Equals");
		else
			System.out.println("arr1 and arr2 are  not Equals");

		if (Arrays.equals(arr1, arr3))
			System.out.println("arr1, arr3 Both are Equals");
		else
			System.out.println("arr1, arr3 are  not Equals");

		if (Arrays.equals(arr2, arr3))
			System.out.println("arr2, arr3 Both are Equals");
		else
			System.out.println("arr2, arr3 are  not Equals");

	}
}
