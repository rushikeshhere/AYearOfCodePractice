package com.practice.Day100;

public class Smallest_Number_Of_Array {
	public static void main(String[] args) {
		int arr[]= {12,-4,8,-6};
		int min=0;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The minimum number is :: "+min);
	}

}
