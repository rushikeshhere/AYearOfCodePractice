package com.practice.Day24;

import java.util.Arrays;

public class FindingLargestElementOfArray {
	public static void main(String[] args) {
		int array[]= {56,45,88,21,321,78};
		System.out.println("Original Array :: "+Arrays.toString(array));
		int max=0;
		for(int i:array) {
			
			if(max<i)
				max=i;
		}
		System.out.println("Largest Element of Above Array is :: "+max);
	}
}
