package com.practice.Day24;

import java.util.Arrays;

public class ReverseOriginalArray {

	public static void main(String[] args) {

		int array[] = { 12, 14, 16, 18, 20 };
		int temp[] = new int[array.length];
		int index = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			temp[i] = array[index];
			index = index + 1;
		}
		System.out.println(Arrays.toString(temp)); //[20, 18, 16, 14, 12]
	}
}
