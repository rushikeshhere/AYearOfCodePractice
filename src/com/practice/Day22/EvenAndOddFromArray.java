package com.practice.Day22;

public class EvenAndOddFromArray {
	public static void main(String[] args) {

		int array[] = { 10, 12, 13, 15, 17, 20, 25, 27, 45, 46, 50 };
		int evenCount = 0;
		int oddCount = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				++evenCount;
			} else
				++oddCount;
		}
		System.out.println("Count of the Even numbers = " + evenCount);
		System.out.println("Count of the Odd numbers = " + oddCount);
	}
}
