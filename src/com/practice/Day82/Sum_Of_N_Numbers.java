package com.practice.Day82;

public class Sum_Of_N_Numbers {
	public static void main(String[] args) {
		int sum = 0;
		int n=10;
		for (int i = 1; i <= n; i++) {
			// sum = sum + i;
			sum += i;
		}
		System.out.println("Sum of N numbers :: " + sum);
	}

}
