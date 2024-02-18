package com.practice.Day29;

public class FindingGretestNumber {
	public static void main(String[] args) {
		int a = 15;
		int b = 45;
		int c = 78;
		int largestNumber;
		if (a >= b) {
			if (a >= c) {
				largestNumber = a;
			} else
				largestNumber = c;
		} else if (b >= c) {
			largestNumber = b;
		} else
			largestNumber = c;

		System.out.println("The Largest Number Among Three Numbers is :: " + largestNumber);
	}
}
