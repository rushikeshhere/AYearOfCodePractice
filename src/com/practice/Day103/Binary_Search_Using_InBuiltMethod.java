package com.practice.Day103;

import java.util.Arrays;

public class Binary_Search_Using_InBuiltMethod {
	public static void main(String[] args) {
		int arr[]= {10, 20, 15, 22, 35};
		Arrays.sort(arr);
		System.out.println("Array afer Sorting : "+Arrays.toString(arr));
		int key=35;
		int result=Arrays.binarySearch(arr,key );
		
		if(key>=0) 
			System.out.println(key+" : found at index : "+result);
		else
			System.out.println("Sorry Element not Found");
	}
}
