package com.practice.Day85;

import java.util.Scanner;

public class Duck_Numbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number !");
		int number = sc.nextInt();
		boolean result = false;

		while (number != 0) {
			if (number % 10 == 0)
				result = true;
			number = number / 10;
		}
		if (result == true)
			System.out.println("This number is Duck number!");
		else
			System.out.println("This number is not Duck number!");
		sc.close();
	}
}
