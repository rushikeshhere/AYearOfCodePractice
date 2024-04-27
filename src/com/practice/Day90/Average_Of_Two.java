package com.practice.Day90;

import java.util.Scanner;

public class Average_Of_Two {

	public static int avg(int num1, int num2) {
		int sum = num1 + num2;
		int average = sum / 2;
		return average;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number :");
		int num2 = sc.nextInt();
		System.out.println("The Average of Two numbers is : " + avg(num1, num2));
		sc.close();
	}
}
