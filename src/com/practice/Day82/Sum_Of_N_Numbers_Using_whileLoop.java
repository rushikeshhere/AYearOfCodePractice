package com.practice.Day82;

public class Sum_Of_N_Numbers_Using_whileLoop {
	public static void main(String[] args) {
		int sum = 0;
		int n = 10;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of N numbers :: " + sum);
	}
}
