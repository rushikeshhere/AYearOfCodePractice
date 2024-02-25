package com.practice.Day36;

public class SumUsingVarArgs {
	public static int sum(int... arr) {
		int result = 0;
		for (int elements : arr) {
			result = result + elements;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("The Sum of arr is ::"+sum(50,40,60,70));
	}
}
