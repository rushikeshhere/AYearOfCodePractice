package com.practice.Day28;

import java.util.Scanner;

public class OddEvenUsingSwitchCase {
	public static boolean oddEven(int num) {
		int option = num % 2;
		switch (option) {
		case 0:
			return true;
		case 1:
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check Even or Odd..");
		int number = sc.nextInt();

		boolean result = oddEven(number);
		if (result)
			System.out.println(number + " :: is an even number.");
		else
			System.out.println(number + " :: is an odd number");
		sc.close();
	}
}
