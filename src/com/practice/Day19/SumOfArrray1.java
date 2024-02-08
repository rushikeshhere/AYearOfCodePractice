package com.practice.Day19;

import java.util.Scanner;

public class SumOfArrray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements...");
		int number = sc.nextInt();
		int array[] = new int[number];
		System.out.println("Enter Array Elements... ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum = sum + array[j];
		}
		System.out.println("The sum of array Elements is :: " + sum);
		sc.close();
	}
}
