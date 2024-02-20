package com.practice.Day31;

import java.util.Scanner;

public class ReverseNumberUsingRecursion {

	static int reverse = 0;

	public static int reverseNumber(int num) {
		if (num == 0)
			return 0;
		else {
			reverse = (reverse * 10) + (num % 10);
			return reverseNumber(num / 10);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :: ");
		int number = sc.nextInt();
		reverseNumber(number);
		System.out.println("The Reverse of " + number + " is :: " + reverse);
		sc.close();
	}
}
