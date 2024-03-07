package com.practice.Day47;

import java.util.Arrays;

public class FindMinElementOfArray {
	public static void main(String[] args) {
		int arr[] = { 56, 78, 15, 45, 32, 86 };
		System.out.println(Arrays.toString(arr));
		int max = arr[0];
		for (int array : arr) {
			if (array < max)
				max = array;
		}
		System.out.println("The Min number of The Array is  :: "+max);
	}
}
