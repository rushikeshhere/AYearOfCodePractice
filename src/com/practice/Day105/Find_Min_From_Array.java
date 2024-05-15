package com.practice.Day105;

public class Find_Min_From_Array {
	public static void main(String[] args) {
		int arr[] = { 20, 10, 30, 50, 40 };
		int min = 0;
		min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("The largest Element is : " + min);
	}
}
