package com.practice.Day46;

public class EvenAndOddFromArray {
	public static void main(String[] args) {
		int array[] = { 3, 8, 7, 9, 2, 4, 5, 45 };
		System.out.println("The Even Numbers :: ");
		for (int a : array) {
			if (a % 2 == 0)
				System.out.print(a+" ");
		}
		System.out.println("\nThe Odd Numbers :: ");
		for (int a : array) {
			if (a % 2 != 0)
				System.out.print(a+" ");
		}
	}
}
