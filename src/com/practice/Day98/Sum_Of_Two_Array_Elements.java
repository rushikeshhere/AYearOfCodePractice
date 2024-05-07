package com.practice.Day98;

import java.util.Arrays;

public class Sum_Of_Two_Array_Elements {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 };

		int lengtharr1 = arr1.length;
		int arr2[] = { 20, 30, 40, 50, 30 };
		int arr3[] = new int[lengtharr1];
		System.out.println("First Arrays Elements are : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nSecond Arrays Elements are : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}

		System.out.println("\nResultant Array: " + Arrays.toString(arr3));
	}
}
