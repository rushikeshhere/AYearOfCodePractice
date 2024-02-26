package com.practice.Day37;

public class SumOfFirstNaturalNumbers {
	static int sumRec(int n) {
		if (n == 1)
			return 1;
		return n + sumRec(n - 1);
	}

	public static void main(String[] args) {
		int result = sumRec(5);
		System.out.println("Sum Of First Natural Numbers is :: " + result);
	}

}
