package com.practice.Day29;

public class FindingLargestNumber2 {
	public static double find(int a, int b, double c) {

		return (a > b && a > c) ? a : (b > a && b > c) ? b : c;
	}

	public static void main(String[] args) {
		Double result = find(45, 89, 89.5);
		System.out.println("The Largest Number is  :: " + result);
	}
}
