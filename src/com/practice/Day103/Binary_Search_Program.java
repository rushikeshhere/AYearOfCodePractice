package com.practice.Day103;

public class Binary_Search_Program {

	public static int binarySearch(int arr[], int left, int right, int x) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x)
				return mid;
			else if(arr[mid]>x)
				right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 7, 6 };
		int length=arr.length;
		int x=7;
		int index=binarySearch(arr, 0, length-1, x);
		if(index==-1) 
			System.out.println("Element not found!");
		else
			System.out.println("Element is found at :: "+index);
	}
}
