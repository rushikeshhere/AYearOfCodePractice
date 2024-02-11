package com.practice.Day22;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int array[] = { 15, 14, 78, 89, 65, 32, 31, 45, 66, 21 };
		int evenSum = 0;
		int oddSum = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else
				oddSum = oddSum + i;
		}
		System.out.println("Sum of Odd Numbers = " + oddSum);
		System.out.println("Sum of Even Numbers = " + evenSum);
	}
}
