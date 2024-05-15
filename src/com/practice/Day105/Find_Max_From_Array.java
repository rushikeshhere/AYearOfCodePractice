package com.practice.Day105;

public class Find_Max_From_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 40 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("The largest Element is : " + max);
	}

}
