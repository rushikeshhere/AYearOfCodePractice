package com.practice.Day89;

import java.util.Scanner;

public class Spy_Numbers {
	public static boolean spyNumber(int num) {
		int lastDigit = 0;
		int sum = 0;
		int product = 1;

		while (num != 0) {
			lastDigit = num % 10;

			sum = sum + lastDigit;

			product = product * lastDigit;
			num = num / 10;
		}
		if (sum == product)
			return true;

		return false;
	}

	public static void main(String[] args) {
		boolean result = false;
		System.out.println("Enter a number :: ");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		result = spyNumber(number);
		if (result)
			System.out.println(number + " :: is the Spy Number");
		else
			System.out.println(number + " :: is not the Spy number!");
		sc.close();
	}
}
