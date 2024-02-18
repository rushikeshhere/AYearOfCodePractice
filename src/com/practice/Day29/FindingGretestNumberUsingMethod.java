package com.practice.Day29;

public class FindingGretestNumberUsingMethod {
	public static double findUsingAndOperator(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= c && b >= a)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
	double result = findUsingAndOperator(789, 987, 485);

		System.out.println("The Largest Number Among Three Numbers is :: " + result);
	}
}
