package com.practice.Day23;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		int array[] = { 55, 66, 44, 33, 22, 11, 00 };
		int copyArray[] = array;
		System.out.println("Original Array :: " + Arrays.toString(array));
		System.out.println("Copied Array :: " + Arrays.toString(copyArray));
	}
}
