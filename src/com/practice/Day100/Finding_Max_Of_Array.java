package com.practice.Day100;

public class Finding_Max_Of_Array {
	public static void main(String[] args) {
		
		int arr[]= {10,20,5,78};
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("The maximum number is :: "+max);
		
	}

}
