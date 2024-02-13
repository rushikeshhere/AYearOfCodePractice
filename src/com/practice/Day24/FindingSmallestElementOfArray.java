package com.practice.Day24;

import java.util.Arrays;

public class FindingSmallestElementOfArray {
	public static void main(String[] args) {
		int array[] = {3, 10, 20, 30, 40, 50 };
		Arrays.sort(array);
		System.out.println("The Smallest Element is :: "+array[0]);
		System.out.println("The Second Smallest Element is :: "+array[1]);
	}
}
