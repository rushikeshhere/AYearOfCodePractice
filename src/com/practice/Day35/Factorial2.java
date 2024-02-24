package com.practice.Day35;

import java.util.Scanner;

public class Factorial2 {
	public static int factorial(int num) {
		int fact = 1;
		for (int i = num; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial :: ");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}
}
