package com.practice.Day31;

public class LCMOfTwoNumbers {

	public static long lcmOfTwoNumbers(int n, int m) {
		long minMultiple = 0;
		int smallest = (n < m) ? n : m;
		int largest = (n > m) ? n : m;
		System.out.println("The two numbers are :: "+smallest + " , " + largest);

		minMultiple = smallest;

		while (true) {
			if (minMultiple % largest == 0)
				return minMultiple;
			minMultiple = minMultiple + smallest;
		}
	}

	public static void main(String[] args) {
		long lcm = lcmOfTwoNumbers(12, 15);
		System.out.println("And the LCM of Two Numbers is ::  "+lcm);
	}

}
