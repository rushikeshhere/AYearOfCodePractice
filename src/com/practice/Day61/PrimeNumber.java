package com.practice.Day61;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (i < 20) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
	}
}
