package com.practice.Day29;

public class FindingLargestNumber {
	public static double find(int a, int b, int c) {
		double largest = a;
		if (largest <= b)
			largest = b;
		if (largest <= c)
			largest = c;
		return largest;
	}

	public static void main(String[] args) {
		Double result = find(45, 89, 87);
		System.out.println("The Largest Number is  :: " + result);

	}

}
