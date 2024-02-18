package com.practice.Day29;

public class FindingGretestNumber1 {
	public static double find(int a, int b, int c) {
		if (a >= b) {
			if (a >= c) {
				return a;
			} else
				return c;
		} else if (b >= c) {
			return b;
		} else
			return c;
	}

	public static void main(String[] args) {
		double result = find(15, 25, 48);

		System.out.println("The Largest Number Among Three Numbers is :: " + result);
	}
}
