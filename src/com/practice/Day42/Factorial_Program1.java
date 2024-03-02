package com.practice.Day42;

import java.util.Scanner;

public class Factorial_Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :: ");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = number; i > 1; i--) {
			fact = i * fact;
		}
		System.out.println(fact);
		sc.close();
	}
}
