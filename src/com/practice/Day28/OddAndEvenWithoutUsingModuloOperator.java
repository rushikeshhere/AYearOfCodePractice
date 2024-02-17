package com.practice.Day28;

import java.util.Scanner;

public class OddAndEvenWithoutUsingModuloOperator {
	public static boolean oddAndEven(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Even or Odd..");
		int number = sc.nextInt();

		boolean result = oddAndEven(number);
		System.out.println(result);
		sc.close();
	}
}
