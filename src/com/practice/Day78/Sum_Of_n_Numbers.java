package com.practice.Day78;

import java.util.Scanner;

public class Sum_Of_n_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of " + number + " is :: " + sum);
		sc.close();
	}
}
