package com.practice.Day45;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not!");
		int number = sc.nextInt();
		int o_num = number;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("********************");
		if (o_num == rev)
			System.out.println(o_num + " ::Is the Palindrome number");
		else
			System.out.println(o_num + " :: Is not the Palindrome number!");
		sc.close();
	}
}
